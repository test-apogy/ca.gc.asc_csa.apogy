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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;

/**
 * Gets an attribute of EObject represented by a {@VariableFeatureReference}.
 */
public class AttributeGetter {
	private VariableFeatureReference variableFeatureReference;
	private EStructuralFeature feature;

	public AttributeGetter(VariableFeatureReference variableFeatureReference, EStructuralFeature feature) {
		this.variableFeatureReference = variableFeatureReference;
		this.feature = feature;
	}

	/**
	 * Returns the attribute (represented by this class) of the EObject
	 * (represented by <code>variableFeatureReference</code>)
	 * 
	 * @param self
	 *            The JavaScript object
	 * @return the attribute
	 */
	public Object get(Scriptable self) {
		EObject instance = ApogyCoreInvocatorFacade.INSTANCE.getInstance(variableFeatureReference);
		return Context.javaToJS(instance.eGet(feature), self);
	}
}