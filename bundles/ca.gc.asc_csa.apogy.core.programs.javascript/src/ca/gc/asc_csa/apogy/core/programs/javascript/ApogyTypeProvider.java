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

package ca.gc.asc_csa.apogy.core.programs.javascript;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.dltk.javascript.typeinfo.ITypeInfoContext;
import org.eclipse.dltk.javascript.typeinfo.ITypeProvider;
import org.eclipse.dltk.javascript.typeinfo.TypeMode;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.TypeMember;

/**
 * Provides Apogy types for the DLTK completion engine.
 *
 */
public class ApogyTypeProvider implements ITypeProvider {

	@Override
	public boolean initialize(ITypeInfoContext context) {
		return true;
	}

	@Override
	public Type getType(ITypeInfoContext context, TypeMode mode, String typeName) {
		EClassifier eClassifier;
		try {
			eClassifier = getEClassifier(typeName);
		} catch (TypeNotFound invalidTypeName) {
			return null;
		}
		return createType(context, eClassifier);
	}

	@Override
	public Set<String> listTypes(ITypeInfoContext context, TypeMode mode, String prefix) {
		return null;
	}

	private static EClassifier getEClassifier(String rootTypeName) throws TypeNotFound {
		int lastDotIndex = rootTypeName.lastIndexOf('.');
		if (lastDotIndex == -1 || lastDotIndex >= rootTypeName.length() - 2) {
			throw new TypeNotFound();
		}
		String packageName = rootTypeName.substring(0, lastDotIndex);
		String className = rootTypeName.substring(lastDotIndex + 1, rootTypeName.length());

		EPackage package_ = EPackage.Registry.INSTANCE.getEPackage(packageName);
		if (package_ == null) {
			throw new TypeNotFound();
		}

		EClassifier classifier = package_.getEClassifier(className);
		if (classifier == null || !(classifier instanceof EClassifier)) {
			throw new TypeNotFound();
		}

		return classifier;
	}

	@SuppressWarnings("serial")
	private static class TypeNotFound extends Exception {
	}

	private static Type createType(ITypeInfoContext context, EClassifier eClassifier) {
		if (eClassifier instanceof EClass) {
			return createType(context, (EClass) eClassifier);
		} else if (eClassifier instanceof EEnum) {
			return createType((EEnum) eClassifier);
		}

		return null;
	}

	private static Type createType(ITypeInfoContext context, EClass eClass) {
		Type type = TypeInfoModelFactory.eINSTANCE.createType();
		type.setName(eClass.getInstanceTypeName());
		type.setKind(TypeKind.JAVA);

		for (EOperation operation : eClass.getEAllOperations()) {
			Method method = TypeInfoModelFactory.eINSTANCE.createMethod();

			method.setName(operation.getName());
			EClassifier returnType = operation.getEType();
			if (returnType != null) {
				method.setType(context.getTypeRef(returnType.getInstanceTypeName()));
			}

			for (EParameter param : operation.getEParameters()) {
				Parameter p = TypeInfoModelFactory.eINSTANCE.createParameter();
				p.setName(param.getName());
				method.getParameters().add(p);
			}

			type.getMembers().add(method);
		}

		for (EStructuralFeature feature : eClass.getEAllStructuralFeatures()) {
			Property prop = TypeInfoModelFactory.eINSTANCE.createProperty();
			prop.setName(feature.getName());

			if (isArray(feature.getLowerBound(), feature.getUpperBound())) {
				prop.setType(TypeUtil.arrayOf(feature.getEType().getInstanceTypeName()));
			} else {
				prop.setType(TypeUtil.ref(feature.getEType().getInstanceTypeName()));
			}

			type.getMembers().add(prop);
		}

		Map<String, Set<TypeMember>> typeMembers = collectTypeMembers();

		Set<TypeMember> members = typeMembers.get(eClass.getInstanceTypeName());

		if (members != null) {
			for (TypeMember member : members) {
				Property prop = TypeInfoModelFactory.eINSTANCE.createProperty();
				prop.setName(member.getName());
				prop.setType(TypeUtil.ref(member.getMemberType().getInterfaceClass().getInstanceTypeName()));
				type.getMembers().add(prop);
			}
		}

		return type;
	}

	private static Type createType(EEnum eEnum) {
		Type type = TypeInfoModelFactory.eINSTANCE.createType();
		type.setName(eEnum.getName());
		type.setKind(TypeKind.JAVA);

		for (EEnumLiteral literal : eEnum.getELiterals()) {
			Property prop = TypeInfoModelFactory.eINSTANCE.createProperty();
			prop.setName(literal.getName());
			type.getMembers().add(prop);
		}

		return type;
	}

	private static boolean isArray(int lowerBound, int upperBound) {
		return upperBound == -1 || lowerBound > 0 && lowerBound < upperBound;
	}

	private static Map<String, Set<TypeMember>> collectTypeMembers() {
		Map<String, Set<TypeMember>> typeMembers = new HashMap<>();

		InvocatorSession session = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		if (session == null) {
			return typeMembers;
		}

		List<ca.gc.asc_csa.apogy.core.invocator.Type> allTypes = new ArrayList<>();
		allTypes.addAll(session.getEnvironment().getTypesList().getLocalTypes().getTypes());
		allTypes.addAll(session.getEnvironment().getTypesList().getRegisteredTypes().getTypes());

		for (ca.gc.asc_csa.apogy.core.invocator.Type type : allTypes) {
			for (TypeMember typeMember : type.getMembers()) {
				Set<TypeMember> members = typeMembers.get(type.getInterfaceClass().getInstanceClassName());
				if (members == null) {
					members = new HashSet<>();
					typeMembers.put(type.getInterfaceClass().getInstanceClassName(), members);
				}

				members.add(typeMember);
			}
		}

		return typeMembers;
	}

}
