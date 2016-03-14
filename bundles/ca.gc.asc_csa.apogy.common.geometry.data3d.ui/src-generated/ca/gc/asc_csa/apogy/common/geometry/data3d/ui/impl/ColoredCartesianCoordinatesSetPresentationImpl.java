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

import ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianCoordinatesSet;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredCartesianCoordinatesSetPresentation;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.scene_objects.CartesianCoordinatesSetSceneObject;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.scene_objects.ColoredCartesianCoordinatesSetSceneObject;
import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colored Cartesian Coordinates Set Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ColoredCartesianCoordinatesSetPresentationImpl#isOverrideColor <em>Override Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ColoredCartesianCoordinatesSetPresentationImpl#getColoredPointCloud <em>Colored Point Cloud</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColoredCartesianCoordinatesSetPresentationImpl extends CartesianCoordinatesSetPresentationImpl implements ColoredCartesianCoordinatesSetPresentation {
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
	 * The cached value of the '{@link #getColoredPointCloud() <em>Colored Point Cloud</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColoredPointCloud()
	 * @generated
	 * @ordered
	 */
	protected ColoredCartesianCoordinatesSet coloredPointCloud;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColoredCartesianCoordinatesSetPresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DUIPackage.Literals.COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DUIPackage.COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__OVERRIDE_COLOR, oldOverrideColor, overrideColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColoredCartesianCoordinatesSet getColoredPointCloud() {
		if (coloredPointCloud != null && coloredPointCloud.eIsProxy()) {
			InternalEObject oldColoredPointCloud = (InternalEObject)coloredPointCloud;
			coloredPointCloud = (ColoredCartesianCoordinatesSet)eResolveProxy(oldColoredPointCloud);
			if (coloredPointCloud != oldColoredPointCloud) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCommonGeometryData3DUIPackage.COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__COLORED_POINT_CLOUD, oldColoredPointCloud, coloredPointCloud));
			}
		}
		return coloredPointCloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColoredCartesianCoordinatesSet basicGetColoredPointCloud() {
		return coloredPointCloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColoredPointCloud(ColoredCartesianCoordinatesSet newColoredPointCloud) {
		ColoredCartesianCoordinatesSet oldColoredPointCloud = coloredPointCloud;
		coloredPointCloud = newColoredPointCloud;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DUIPackage.COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__COLORED_POINT_CLOUD, oldColoredPointCloud, coloredPointCloud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonGeometryData3DUIPackage.COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__OVERRIDE_COLOR:
				return isOverrideColor();
			case ApogyCommonGeometryData3DUIPackage.COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__COLORED_POINT_CLOUD:
				if (resolve) return getColoredPointCloud();
				return basicGetColoredPointCloud();
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
			case ApogyCommonGeometryData3DUIPackage.COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__OVERRIDE_COLOR:
				setOverrideColor((Boolean)newValue);
				return;
			case ApogyCommonGeometryData3DUIPackage.COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__COLORED_POINT_CLOUD:
				setColoredPointCloud((ColoredCartesianCoordinatesSet)newValue);
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
			case ApogyCommonGeometryData3DUIPackage.COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__OVERRIDE_COLOR:
				setOverrideColor(OVERRIDE_COLOR_EDEFAULT);
				return;
			case ApogyCommonGeometryData3DUIPackage.COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__COLORED_POINT_CLOUD:
				setColoredPointCloud((ColoredCartesianCoordinatesSet)null);
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
			case ApogyCommonGeometryData3DUIPackage.COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__OVERRIDE_COLOR:
				return overrideColor != OVERRIDE_COLOR_EDEFAULT;
			case ApogyCommonGeometryData3DUIPackage.COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__COLORED_POINT_CLOUD:
				return coloredPointCloud != null;
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
	public void setSceneObject(SceneObject newSceneObject) {
		if (newSceneObject != null
				&& !(newSceneObject instanceof CartesianCoordinatesSetSceneObject)) {
			throw new IllegalArgumentException();
		}
		super.setSceneObject(newSceneObject);
	}

	@Override
	protected void initialSceneObject() 
	{
		ColoredCartesianCoordinatesSetSceneObject pointsSceneObject = (ColoredCartesianCoordinatesSetSceneObject) getSceneObject();
		pointsSceneObject.setPointSize(getPointSize());
		
		super.initialSceneObject();
	}

	@Override
	protected void updateSceneObject(Notification notification) 
	{
		if (sceneObject != null) 
		{
			ColoredCartesianCoordinatesSetSceneObject pointsSceneObject = (ColoredCartesianCoordinatesSetSceneObject) sceneObject;

			if(notification.getNotifier() instanceof ColoredCartesianCoordinatesSetPresentation)
			{
				int featureID = notification.getFeatureID(ColoredCartesianCoordinatesSetPresentation.class);
				
				switch (featureID) 
				{
					case ApogyCommonGeometryData3DUIPackage.COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__OVERRIDE_COLOR:
						boolean newOverrideColor = notification.getNewBooleanValue();
						pointsSceneObject.setOverrideColor(newOverrideColor);
					break;
														
					default:
					break;
				}
						
			}			
		}
		super.updateSceneObject(notification);
	}

	@Override
	protected void applyPreferences() 
	{
		// TODO IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		super.applyPreferences();		
	}
} //ColoredCartesianCoordinatesSetPresentationImpl
