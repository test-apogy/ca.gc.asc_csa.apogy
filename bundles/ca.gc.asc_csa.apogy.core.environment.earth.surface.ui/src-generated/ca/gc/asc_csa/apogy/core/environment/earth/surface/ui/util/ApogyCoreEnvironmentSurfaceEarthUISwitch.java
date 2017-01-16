/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import ca.gc.asc_csa.apogy.addons.AbstractTool;
import ca.gc.asc_csa.apogy.addons.AbstractTwoPoints3DTool;
import ca.gc.asc_csa.apogy.addons.Simple3DTool;
import ca.gc.asc_csa.apogy.addons.SimpleTool;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.ApogyCoreEnvironmentSurfaceEarthUIPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSkyPresentation;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSurfaceUIUtilities;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSurfaceWorksitePresentation;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.MoonPresentation;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.SunVector3DTool;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.SunVector3DToolNode;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.SunVector3DToolNodePresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksiteSkyPresentation;

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
 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.ApogyCoreEnvironmentSurfaceEarthUIPackage
 * @generated
 */
public class ApogyCoreEnvironmentSurfaceEarthUISwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyCoreEnvironmentSurfaceEarthUIPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentSurfaceEarthUISwitch() {
		if (modelPackage == null) {
			modelPackage = ApogyCoreEnvironmentSurfaceEarthUIPackage.eINSTANCE;
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
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION: {
				EarthSurfaceWorksitePresentation earthSurfaceWorksitePresentation = (EarthSurfaceWorksitePresentation)theEObject;
				T result = caseEarthSurfaceWorksitePresentation(earthSurfaceWorksitePresentation);
				if (result == null) result = caseAbstractSurfaceWorksitePresentation(earthSurfaceWorksitePresentation);
				if (result == null) result = caseNodePresentation(earthSurfaceWorksitePresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.EARTH_SKY_PRESENTATION: {
				EarthSkyPresentation earthSkyPresentation = (EarthSkyPresentation)theEObject;
				T result = caseEarthSkyPresentation(earthSkyPresentation);
				if (result == null) result = caseAbstractSurfaceWorksiteSkyPresentation(earthSkyPresentation);
				if (result == null) result = caseNodePresentation(earthSkyPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.MOON_PRESENTATION: {
				MoonPresentation moonPresentation = (MoonPresentation)theEObject;
				T result = caseMoonPresentation(moonPresentation);
				if (result == null) result = caseNodePresentation(moonPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.SUN_VECTOR3_DTOOL: {
				SunVector3DTool sunVector3DTool = (SunVector3DTool)theEObject;
				T result = caseSunVector3DTool(sunVector3DTool);
				if (result == null) result = caseAbstractTwoPoints3DTool(sunVector3DTool);
				if (result == null) result = caseSimple3DTool(sunVector3DTool);
				if (result == null) result = caseSimpleTool(sunVector3DTool);
				if (result == null) result = caseAbstractTool(sunVector3DTool);
				if (result == null) result = caseNamed(sunVector3DTool);
				if (result == null) result = caseDescribed(sunVector3DTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.SUN_VECTOR3_DTOOL_NODE: {
				SunVector3DToolNode sunVector3DToolNode = (SunVector3DToolNode)theEObject;
				T result = caseSunVector3DToolNode(sunVector3DToolNode);
				if (result == null) result = caseNode(sunVector3DToolNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.SUN_VECTOR3_DTOOL_NODE_PRESENTATION: {
				SunVector3DToolNodePresentation sunVector3DToolNodePresentation = (SunVector3DToolNodePresentation)theEObject;
				T result = caseSunVector3DToolNodePresentation(sunVector3DToolNodePresentation);
				if (result == null) result = caseNodePresentation(sunVector3DToolNodePresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.EARTH_SURFACE_UI_UTILITIES: {
				EarthSurfaceUIUtilities earthSurfaceUIUtilities = (EarthSurfaceUIUtilities)theEObject;
				T result = caseEarthSurfaceUIUtilities(earthSurfaceUIUtilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earth Surface Worksite Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth Surface Worksite Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarthSurfaceWorksitePresentation(EarthSurfaceWorksitePresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earth Sky Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth Sky Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarthSkyPresentation(EarthSkyPresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moon Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moon Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoonPresentation(MoonPresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sun Vector3 DTool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sun Vector3 DTool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSunVector3DTool(SunVector3DTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sun Vector3 DTool Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sun Vector3 DTool Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSunVector3DToolNode(SunVector3DToolNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sun Vector3 DTool Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sun Vector3 DTool Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSunVector3DToolNodePresentation(SunVector3DToolNodePresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earth Surface UI Utilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth Surface UI Utilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarthSurfaceUIUtilities(EarthSurfaceUIUtilities object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Surface Worksite Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Surface Worksite Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSurfaceWorksitePresentation(AbstractSurfaceWorksitePresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Surface Worksite Sky Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Surface Worksite Sky Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSurfaceWorksiteSkyPresentation(AbstractSurfaceWorksiteSkyPresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamed(Named object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Described</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribed(Described object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTool(AbstractTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTool(SimpleTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple3 DTool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple3 DTool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimple3DTool(Simple3DTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Two Points3 DTool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Two Points3 DTool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTwoPoints3DTool(AbstractTwoPoints3DTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
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

} //ApogyCoreEnvironmentSurfaceEarthUISwitch
