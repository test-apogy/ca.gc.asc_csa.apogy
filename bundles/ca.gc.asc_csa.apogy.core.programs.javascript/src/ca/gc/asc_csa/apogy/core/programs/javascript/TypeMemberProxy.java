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

import java.lang.reflect.Method;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFactory;
import ca.gc.asc_csa.apogy.common.emf.ListFeatureNode;
import ca.gc.asc_csa.apogy.common.emf.ListRootNode;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.TypeMember;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;

/**
 * Proxy for an EObject obtained through a {@link TypeMember}
 *
 */
public class TypeMemberProxy extends ScriptableObject {
	private static final long serialVersionUID = 1L;

	private VariableFeatureReference variableFeatureReference;
	private JavaScriptProgram program;

	public TypeMemberProxy() {
		// Rhino requires an empty constructor
	}

	/**
	 *
	 * @param variableFeatureReference
	 *            {@link VariableFeaturerReference} representing the EObject
	 *            wrapped by this classs
	 * @param program
	 *            JavaScriptProgram being executed
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 */
	public TypeMemberProxy(VariableFeatureReference variableFeatureReference, JavaScriptProgram program) throws NoSuchMethodException, SecurityException {
		this.variableFeatureReference = variableFeatureReference;
		this.program = program;
		init();
	}

	private void init() throws NoSuchMethodException, SecurityException {
		EObject instance = ApogyCoreInvocatorFacade.INSTANCE.getInstance(variableFeatureReference);

		for (EOperation operation : ApogyCommonEMFFacade.INSTANCE.getAllAvailableEOperations(instance.eClass())) {
			defineProperty(operation.getName(), new OperationCallInvoker(program, variableFeatureReference, operation), 0);
		}

		for (EStructuralFeature structuralFeature : instance.eClass().getEAllStructuralFeatures()) {
			if (structuralFeature instanceof EReference) {
				ReferenceGetter referenceGetter = new ReferenceGetter(structuralFeature);
				Method getter = ReferenceGetter.class.getDeclaredMethod("get", new Class[] { Scriptable.class });
				defineProperty(structuralFeature.getName(), referenceGetter, getter, null, 0);
			} else if (structuralFeature instanceof EAttribute) {
				AttributeGetter attributeGetter = new AttributeGetter(variableFeatureReference, structuralFeature);
				Method getter = AttributeGetter.class.getDeclaredMethod("get", new Class[] { Scriptable.class });
				defineProperty(structuralFeature.getName(), attributeGetter, getter, null, 0);
			}
		}

		TypeMemberReferenceListElement child = variableFeatureReference.getTypeMemberReferenceListElement();

		while (child.getChild() != null) {
			child = child.getChild();
		}

		for (TypeMember typeMember : child.getTypeMember().getMemberType().getMembers()) {
			// If the property already exists and is read-only, defineProperty
			// is ignored.
			//
			// Delete the property in case it already exists and is
			// read-only (which is likely the case since we defined read-only
			// properties for all EReferences in the loop above).
			delete(typeMember.getName());

			TypeMemberGetter typeMemberGetter = new TypeMemberGetter(typeMember);
			Method getter = TypeMemberGetter.class.getDeclaredMethod("get", new Class[] { Scriptable.class });
			defineProperty(typeMember.getName(), typeMemberGetter, getter, null, 0);
		}
	}

	@Override
	public String getClassName() {
		return "TypeMemberProxy";
	}

	/**
	 * Gets a reference of the EObject wrapped by {@link TypeMemberProxy}
	 *
	 */
	private class ReferenceGetter {
		private EStructuralFeature feature;

		public ReferenceGetter(EStructuralFeature feature) {
			this.feature = feature;
		}

		/**
		 * Returns the reference (represented by this class) of the EObject
		 * (represented by {@TypeMemberProxy})
		 * 
		 * @param self
		 *            The JavaScript object
		 * @return the attribute
		 */
		@SuppressWarnings("unused")
		public Object get(Scriptable self) throws NoSuchMethodException, SecurityException {
			assert variableFeatureReference.getFeatureRoot() == null;
			VariableFeatureReference subVariableFeatureReference = VariableFeatureReferenceUtil.clone(variableFeatureReference);
			ListRootNode root = ApogyCommonEMFFactory.eINSTANCE.createListRootNode();
			ListFeatureNode node = ApogyCommonEMFFactory.eINSTANCE.createListFeatureNode();
			node.setStructuralFeature(feature);
			root.setChild(node);
			EObject instance = ApogyCoreInvocatorFacade.INSTANCE.getInstance(variableFeatureReference);
			root.setSourceClass(instance.eClass());
			subVariableFeatureReference.setFeatureRoot(root);

			Scriptable object = new ReferenceProxy(subVariableFeatureReference, program);
			object.setParentScope(TypeMemberProxy.this);
			return object;
		}
	}

	/**
	 * Gets a type member of the EObject wrapped by {@link TypeMemberProxy}
	 *
	 */
	private class TypeMemberGetter {
		private TypeMember typeMember;

		public TypeMemberGetter(TypeMember typeMember) {
			this.typeMember = typeMember;
		}

		/**
		 * Returns the type member (represented by this class) of the EObject
		 * (represented by {TypeMemberProxy})
		 * 
		 * @param self
		 *            The JavaScript object
		 * @return the attribute
		 */
		@SuppressWarnings("unused")
		public TypeMemberProxy get(Scriptable self) throws NoSuchMethodException, SecurityException {
			VariableFeatureReference subVariableFeatureReference = VariableFeatureReferenceUtil.clone(variableFeatureReference);
			TypeMemberReferenceListElement typeMemberReferenceListElement = ApogyCoreInvocatorFactory.eINSTANCE.createTypeMemberReferenceListElement();
			typeMemberReferenceListElement.setTypeMember(typeMember);
			subVariableFeatureReference.setTypeMemberReferenceListElement(typeMemberReferenceListElement);
			TypeMemberProxy object = new TypeMemberProxy(subVariableFeatureReference, program);
			object.setParentScope(TypeMemberProxy.this);
			return object;
		}
	}
}
