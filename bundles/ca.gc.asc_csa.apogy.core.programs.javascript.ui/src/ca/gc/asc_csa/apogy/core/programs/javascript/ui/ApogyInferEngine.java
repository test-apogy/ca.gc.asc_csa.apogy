/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mathieu Larose (mathieu.larose@savoirfairelinux.com)
 *     Savoir-faire Linux - Initial API and implementation
 */

package ca.gc.asc_csa.apogy.core.programs.javascript.ui;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.wst.jsdt.core.infer.InferEngine;
import org.eclipse.wst.jsdt.core.infer.InferredAttribute;
import org.eclipse.wst.jsdt.core.infer.InferredType;
import org.eclipse.wst.jsdt.core.infer.InferrenceProvider;
import org.eclipse.wst.jsdt.internal.compiler.ast.Argument;
import org.eclipse.wst.jsdt.internal.compiler.ast.CompilationUnitDeclaration;
import org.eclipse.wst.jsdt.internal.compiler.ast.MethodDeclaration;
import org.eclipse.wst.jsdt.internal.compiler.ast.SingleTypeReference;
import org.eclipse.wst.jsdt.internal.compiler.ast.TypeReference;
import org.eclipse.wst.jsdt.internal.compiler.classfmt.ClassFileConstants;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.TypeMember;
import ca.gc.asc_csa.apogy.core.invocator.Variable;

/**
 * Adds Apogy types to the compilation unit beeing processed.
 * 
 * Gets the Apogy types from the variables of the active session.
 *
 */
@SuppressWarnings("restriction")
public class ApogyInferEngine extends InferEngine {
	private CompilationUnitDeclaration compUnit;
	private Registry registry;

	public ApogyInferEngine(InferrenceProvider inferenceProvider) {
		super();
		this.inferenceProvider = inferenceProvider;
	}

	@Override
	public void setCompilationUnit(CompilationUnitDeclaration cu) {
		super.setCompilationUnit(cu);
		this.compUnit = cu;
	}

	@Override
	public void initialize() {
		super.initialize();
		registry = new Registry();
	}

	@Override
	public void doInfer() {
		String compilationUnitProject = getCompilationUnitProject(compUnit);
		String sessionProject = getProjectOfActiveInvocatorSession();

		if (compilationUnitProject.equals(sessionProject)) {
			List<Variable> variables = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment().getVariablesList().getVariables();
			for (Variable variable : variables) {
				visit(variable);
			}
		}

		super.doInfer();
	}

	private InferredType visit(Variable variable) {
		InferredType type = registry.getType(variable.getVariableType().getInterfaceClass());
		if (type != null) {
			return type;
		}

		type = registry.addType(variable.getVariableType().getInterfaceClass(), variable.getVariableType().getInterfaceClass().getInstanceTypeName());

		// Operations
		for (EOperation op : ApogyCommonEMFFacade.INSTANCE.getAllAvailableEOperations(variable.getVariableType().getInterfaceClass())) {
			MethodDeclaration method = visit(op);
			type.addMethod(op.getName().toCharArray(), method, 0);
		}

		// Members
		for (TypeMember typeMember : variable.getVariableType().getMembers()) {
			type.addAttribute(visit(typeMember, type));
		}

		// Features
		for (EStructuralFeature structuralFeature : variable.getVariableType().getInterfaceClass().getEAllStructuralFeatures()) {
			// Don't add the attribute if it already exists (a type member and
			// feature can have the same name)
			if (type.findAttribute(structuralFeature.getName().toCharArray()) == null) {
				type.addAttribute(visit(structuralFeature, type));
			}
		}

		return type;
	}

	private MethodDeclaration visit(EOperation operation) {
		MethodDeclaration method = new MethodDeclaration(null);

		// Return value
		method.setInferredType(visit(operation.getEType()));
		if (method.getInferredType() == null) {
			method.setInferredType(new InferredType(InferredType.VOID_NAME));
		}

		// Arguments
		List<EParameter> params = operation.getEParameters();
		Argument[] args = new Argument[params.size()];
		for (int i = 0; i < args.length; i++) {
			EParameter param = params.get(i);
			TypeReference typeReference = new SingleTypeReference(param.getEType().getName().toCharArray(), 0);
			typeReference.resolvedType = null; // Set the type to resolved.

			Argument arg = new Argument(param.getName().toCharArray(), 0, typeReference, ClassFileConstants.AccDefault);
			args[i] = arg;
		}
		method.setArguments(args);

		return method;
	}

	private InferredType visit(EClass clazz) {
		InferredType type = registry.getType(clazz);
		if (type != null) {
			return type;
		}
		type = registry.addType(clazz, clazz.getInstanceTypeName());

		// Operations
		for (EOperation op : ApogyCommonEMFFacade.INSTANCE.getAllAvailableEOperations(clazz)) {
			MethodDeclaration method = visit(op);
			type.addMethod(op.getName().toCharArray(), method, 0);
		}

		// Features
		for (EStructuralFeature structuralFeature : clazz.getEAllStructuralFeatures()) {
			InferredAttribute attribute = visit(structuralFeature, type);
			type.addAttribute(attribute);
		}

		return type;
	}

	private InferredType visit(EDataType dataType) {
		InferredType type = registry.getType(dataType);
		if (type != null) {
			return type;
		}
		type = registry.addType(dataType, dataType.getInstanceTypeName());

		return type;
	}

	private InferredType visit(EClassifier classifier) {
		if (classifier instanceof EClass) {
			return visit((EClass) classifier);
		}

		if (classifier instanceof EDataType) {
			return visit((EDataType) classifier);
		}

		return null;
	}

	private InferredAttribute visit(EStructuralFeature feature, InferredType parent) {
		InferredAttribute attribute = new InferredAttribute(feature.getName().toCharArray(), parent, 0, 0);
		attribute.type = visit(feature.getEType());

		if (isArray(feature.getLowerBound(), feature.getUpperBound())) {
			InferredType type = attribute.type;
			attribute.type = new InferredType(InferredType.ARRAY_NAME);
			attribute.type.referenceClass = type;
		}

		return attribute;
	}

	private InferredAttribute visit(TypeMember typeMember, InferredType parent) {
		InferredAttribute attribute = new InferredAttribute(typeMember.getName().toCharArray(), parent, 0, 0);
		InferredType type = registry.getType(typeMember);
		if (type != null) {
			attribute.type = type;
			return attribute;
		}

		type = registry.addType(typeMember, typeMember.getMemberType().getInterfaceClass().getInstanceTypeName());
		type.setIsGlobal(true);
		attribute.type = type;

		// Operations
		for (EOperation op : ApogyCommonEMFFacade.INSTANCE.getAllAvailableEOperations(typeMember.getMemberType().getInterfaceClass())) {
			MethodDeclaration method = visit(op);
			type.addMethod(op.getName().toCharArray(), method, 0);
		}

		// Members
		for (TypeMember tm : typeMember.getMemberType().getMembers()) {
			type.addAttribute(visit(tm, type));
		}

		// Features
		for (EStructuralFeature structuralFeature : typeMember.getMemberType().getInterfaceClass().getEAllStructuralFeatures()) {
			// Don't add the attribute if it already exists (a type member and
			// feature can have the same name)
			if (type.findAttribute(structuralFeature.getName().toCharArray()) == null) {
				InferredAttribute att = visit(structuralFeature, type);
				type.addAttribute(att);
			}
		}

		return attribute;
	}

	private static boolean isArray(int lowerBound, int upperBound) {
		return upperBound == -1 || lowerBound > 0 && lowerBound < upperBound;
	}

	private static String getCompilationUnitProject(CompilationUnitDeclaration compUnit) {
		String fileName = new String(compUnit.getFileName());
		File file = new File(fileName);
		while (file.getParentFile() != null && file.getParentFile().getParentFile() != null) {
			file = file.getParentFile();
		}
		return file.getName();
	}

	private static String getProjectOfActiveInvocatorSession() {
		InvocatorSession session = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		if (session == null) {
			return null;
		}

		Resource resource = session.eResource();
		URI uri = resource.getURI();
		if (!(uri.isPlatformResource() && uri.segmentCount() >= 2)) {
			return null;
		}

		return uri.segment(1);
	}

	private class Registry {

		private Map<Object, InferredType> types = new HashMap<>();

		public InferredType addType(Object object, String name) {
			if (types.containsKey(object)) {
				return types.get(object);
			}

			InferredType type = ApogyInferEngine.this.addType(name.toCharArray(), true);
			// Set it as anonymous so it doesn't show in the outline view
			type.isAnonymous = true;
			// Set it outside the file, so it doesn't clash with code in the
			// file
			type.setNameStart(ApogyInferEngine.this.compUnit.sourceEnd + 1);

			types.put(object, type);
			return type;
		}

		public InferredType getType(Object object) {
			return types.get(object);
		}
	}
}
