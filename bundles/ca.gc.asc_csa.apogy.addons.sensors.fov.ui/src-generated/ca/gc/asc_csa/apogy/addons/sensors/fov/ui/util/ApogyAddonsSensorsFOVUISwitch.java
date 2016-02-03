package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.util;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.CircularSectorFieldOfViewPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ConicalFieldOfViewPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIPackage;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.RectangularFrustrumFieldOfViewPresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIPackage
 * @generated
 */
public class ApogyAddonsSensorsFOVUISwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyAddonsSensorsFOVUIPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsSensorsFOVUISwitch() {
		if (modelPackage == null) {
			modelPackage = ApogyAddonsSensorsFOVUIPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ApogyAddonsSensorsFOVUIPackage.FIELD_OF_VIEW_PRESENTATION: {
				FieldOfViewPresentation fieldOfViewPresentation = (FieldOfViewPresentation)theEObject;
				T result = caseFieldOfViewPresentation(fieldOfViewPresentation);
				if (result == null) result = caseNodePresentation(fieldOfViewPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsFOVUIPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION: {
				CircularSectorFieldOfViewPresentation circularSectorFieldOfViewPresentation = (CircularSectorFieldOfViewPresentation)theEObject;
				T result = caseCircularSectorFieldOfViewPresentation(circularSectorFieldOfViewPresentation);
				if (result == null) result = caseFieldOfViewPresentation(circularSectorFieldOfViewPresentation);
				if (result == null) result = caseNodePresentation(circularSectorFieldOfViewPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsFOVUIPackage.CONICAL_FIELD_OF_VIEW_PRESENTATION: {
				ConicalFieldOfViewPresentation conicalFieldOfViewPresentation = (ConicalFieldOfViewPresentation)theEObject;
				T result = caseConicalFieldOfViewPresentation(conicalFieldOfViewPresentation);
				if (result == null) result = caseFieldOfViewPresentation(conicalFieldOfViewPresentation);
				if (result == null) result = caseNodePresentation(conicalFieldOfViewPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsFOVUIPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION: {
				RectangularFrustrumFieldOfViewPresentation rectangularFrustrumFieldOfViewPresentation = (RectangularFrustrumFieldOfViewPresentation)theEObject;
				T result = caseRectangularFrustrumFieldOfViewPresentation(rectangularFrustrumFieldOfViewPresentation);
				if (result == null) result = caseFieldOfViewPresentation(rectangularFrustrumFieldOfViewPresentation);
				if (result == null) result = caseNodePresentation(rectangularFrustrumFieldOfViewPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Of View Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Of View Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldOfViewPresentation(FieldOfViewPresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circular Sector Field Of View Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circular Sector Field Of View Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircularSectorFieldOfViewPresentation(CircularSectorFieldOfViewPresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conical Field Of View Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conical Field Of View Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConicalFieldOfViewPresentation(ConicalFieldOfViewPresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangular Frustrum Field Of View Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangular Frustrum Field Of View Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangularFrustrumFieldOfViewPresentation(RectangularFrustrumFieldOfViewPresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodePresentation(NodePresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ApogyAddonsSensorsFOVUISwitch
