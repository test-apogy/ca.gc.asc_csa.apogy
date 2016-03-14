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
package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredTriangularMeshPresentation;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.scene_objects.ColoredCartesianTriangularMeshSceneObject;
import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colored Triangular Mesh Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ColoredTriangularMeshPresentationImpl#isOverrideColor <em>Override Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColoredTriangularMeshPresentationImpl extends CartesianTriangularMeshPresentationImpl implements ColoredTriangularMeshPresentation {
	/**
	 * The default value of the '{@link #isOverrideColor() <em>Override Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverrideColor()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERRIDE_COLOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverrideColor() <em>Override Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverrideColor()
	 * @generated
	 * @ordered
	 */
	protected boolean overrideColor = OVERRIDE_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColoredTriangularMeshPresentationImpl() 
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DUIPackage.Literals.COLORED_TRIANGULAR_MESH_PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverrideColor() {
		return overrideColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverrideColor(boolean newOverrideColor) {
		boolean oldOverrideColor = overrideColor;
		overrideColor = newOverrideColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DUIPackage.COLORED_TRIANGULAR_MESH_PRESENTATION__OVERRIDE_COLOR, oldOverrideColor, overrideColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonGeometryData3DUIPackage.COLORED_TRIANGULAR_MESH_PRESENTATION__OVERRIDE_COLOR:
				return isOverrideColor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCommonGeometryData3DUIPackage.COLORED_TRIANGULAR_MESH_PRESENTATION__OVERRIDE_COLOR:
				setOverrideColor((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCommonGeometryData3DUIPackage.COLORED_TRIANGULAR_MESH_PRESENTATION__OVERRIDE_COLOR:
				setOverrideColor(OVERRIDE_COLOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCommonGeometryData3DUIPackage.COLORED_TRIANGULAR_MESH_PRESENTATION__OVERRIDE_COLOR:
				return overrideColor != OVERRIDE_COLOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (overrideColor: ");
		result.append(overrideColor);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public void setSceneObject(SceneObject newSceneObject) 
	{
		if (newSceneObject != null && !(newSceneObject instanceof ColoredCartesianTriangularMeshSceneObject)) {
			throw new IllegalArgumentException();
		}
		super.setSceneObject(newSceneObject);
	}
	
	@Override
	protected void updateSceneObject(Notification notification) 
	{
		if(sceneObject != null)
		{
			ColoredCartesianTriangularMeshSceneObject coloredCartesianCoordinatesSetSceneObject = (ColoredCartesianTriangularMeshSceneObject) sceneObject;
			
			if(notification.getNotifier() instanceof ColoredTriangularMeshPresentation)
			{
				int featureID = notification.getFeatureID(ColoredTriangularMeshPresentation.class);
				
				switch (featureID) 
				{
					case ApogyCommonGeometryData3DUIPackage.COLORED_TRIANGULAR_MESH_PRESENTATION__OVERRIDE_COLOR:
						boolean newOverrideColor = notification.getNewBooleanValue();
						coloredCartesianCoordinatesSetSceneObject.setOverrideColor(newOverrideColor);
						
					break;
					
					default:
					break;
				}
			}
		}
		
		super.updateSceneObject(notification);
	}
	
	@Override
	protected void initialSceneObject() 
	{
		ColoredCartesianTriangularMeshSceneObject meshSceneObject = (ColoredCartesianTriangularMeshSceneObject) sceneObject;
		meshSceneObject.setOverrideColor(isOverrideColor());
		super.initialSceneObject();
	}

	@Override
	protected void applyPreferences() 
	{
		// TODO
		
		super.applyPreferences();
	}
	
} //ColoredTriangularMeshPresentationImpl
