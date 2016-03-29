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

import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFactory;
import ca.gc.asc_csa.apogy.common.emf.ListFeatureNode;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;

/**
 * Proxy for an EObject obtained through a {@link EReference}
 *
 */
public class ReferenceProxy extends ScriptableObject {
	private static final long serialVersionUID = 1L;
	private VariableFeatureReference variableFeatureReference;
	private JavaScriptProgram program;

	public ReferenceProxy() {
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
	public ReferenceProxy(VariableFeatureReference variableFeatureReference, JavaScriptProgram program) throws NoSuchMethodException, SecurityException {
		this.variableFeatureReference = variableFeatureReference;
		this.program = program;
		init();
	}
	
	private void init() throws NoSuchMethodException, SecurityException {
		EObject instance = ApogyCoreInvocatorFacade.INSTANCE.getInstance(variableFeatureReference);

		for (EOperation op : ApogyCommonEMFFacade.INSTANCE.getAllAvailableEOperations(instance.eClass())) {
			defineProperty(op.getName(), new OperationCallInvoker(program, variableFeatureReference, op), 0);
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
	}

	@Override
	public String getClassName() {
		return "ReferenceProxy";
	}

	/**
	 * Gets a reference of the EObject wrapped by {@link ReferenceProxy}
	 *
	 */
	private class ReferenceGetter {
		private EStructuralFeature feature;

		public ReferenceGetter(EStructuralFeature feature) {
			this.feature = feature;
		}

		/**
		 * Returns the reference (represented by this class) of the EObject
		 * (represented by {@ReferenceProxy})
		 * 
		 * @param self
		 *            The JavaScript object
		 * @return the attribute
		 */
		@SuppressWarnings("unused")
		public Object get(Scriptable self) throws NoSuchMethodException, SecurityException {
			VariableFeatureReference subVariableFeatureReference = VariableFeatureReferenceUtil.clone(variableFeatureReference);
			AbstractFeatureListNode leaf = ApogyCommonEMFFacade.INSTANCE.getLeaf(subVariableFeatureReference.getFeatureRoot());
			ListFeatureNode node = ApogyCommonEMFFactory.eINSTANCE.createListFeatureNode();
			node.setStructuralFeature(feature); // Example:
												// (rover.centerCamera.)fov
			leaf.setChild(node);

			Scriptable object = new ReferenceProxy(subVariableFeatureReference, program);
			object.setParentScope(ReferenceProxy.this);
			return object;
		}
	}
}
