/**
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
package ca.gc.asc_csa.apogy.core.environment.surface.ui.impl;

import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.FeaturesOfInterestMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFactory;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.FeaturesOfInterestMapLayerPresentation;

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Color3f;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Features Of Interest Map Layer Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.FeaturesOfInterestMapLayerPresentationImpl#getFeaturesOfInterestMapLayer <em>Features Of Interest Map Layer</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.FeaturesOfInterestMapLayerPresentationImpl#getFeatureOfInterestRadius <em>Feature Of Interest Radius</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.FeaturesOfInterestMapLayerPresentationImpl#getFeatureOfInterestColor <em>Feature Of Interest Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeaturesOfInterestMapLayerPresentationImpl extends MapAnnotationImpl implements FeaturesOfInterestMapLayerPresentation {
	/**
	 * The cached value of the '{@link #getFeaturesOfInterestMapLayer() <em>Features Of Interest Map Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturesOfInterestMapLayer()
	 * @generated
	 * @ordered
	 */
	protected FeaturesOfInterestMapLayer featuresOfInterestMapLayer;

	/**
	 * The default value of the '{@link #getFeatureOfInterestRadius() <em>Feature Of Interest Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOfInterestRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double FEATURE_OF_INTEREST_RADIUS_EDEFAULT = 0.25;

	/**
	 * The cached value of the '{@link #getFeatureOfInterestRadius() <em>Feature Of Interest Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOfInterestRadius()
	 * @generated
	 * @ordered
	 */
	protected double featureOfInterestRadius = FEATURE_OF_INTEREST_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatureOfInterestColor() <em>Feature Of Interest Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOfInterestColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color3f FEATURE_OF_INTEREST_COLOR_EDEFAULT = (Color3f)ApogySurfaceEnvironmentUIFactory.eINSTANCE.createFromString(ApogySurfaceEnvironmentUIPackage.eINSTANCE.getColor3f(), "0.0,0.0,1.0");

	/**
	 * The cached value of the '{@link #getFeatureOfInterestColor() <em>Feature Of Interest Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOfInterestColor()
	 * @generated
	 * @ordered
	 */
	protected Color3f featureOfInterestColor = FEATURE_OF_INTEREST_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturesOfInterestMapLayerPresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentUIPackage.Literals.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturesOfInterestMapLayer getFeaturesOfInterestMapLayer() {
		if (featuresOfInterestMapLayer != null && featuresOfInterestMapLayer.eIsProxy()) {
			InternalEObject oldFeaturesOfInterestMapLayer = (InternalEObject)featuresOfInterestMapLayer;
			featuresOfInterestMapLayer = (FeaturesOfInterestMapLayer)eResolveProxy(oldFeaturesOfInterestMapLayer);
			if (featuresOfInterestMapLayer != oldFeaturesOfInterestMapLayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER, oldFeaturesOfInterestMapLayer, featuresOfInterestMapLayer));
			}
		}
		return featuresOfInterestMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturesOfInterestMapLayer basicGetFeaturesOfInterestMapLayer() {
		return featuresOfInterestMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeaturesOfInterestMapLayer(FeaturesOfInterestMapLayer newFeaturesOfInterestMapLayer) {
		FeaturesOfInterestMapLayer oldFeaturesOfInterestMapLayer = featuresOfInterestMapLayer;
		featuresOfInterestMapLayer = newFeaturesOfInterestMapLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER, oldFeaturesOfInterestMapLayer, featuresOfInterestMapLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFeatureOfInterestRadius() {
		return featureOfInterestRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureOfInterestRadius(double newFeatureOfInterestRadius) {
		double oldFeatureOfInterestRadius = featureOfInterestRadius;
		featureOfInterestRadius = newFeatureOfInterestRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_RADIUS, oldFeatureOfInterestRadius, featureOfInterestRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f getFeatureOfInterestColor() {
		return featureOfInterestColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureOfInterestColor(Color3f newFeatureOfInterestColor) {
		Color3f oldFeatureOfInterestColor = featureOfInterestColor;
		featureOfInterestColor = newFeatureOfInterestColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_COLOR, oldFeatureOfInterestColor, featureOfInterestColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularRegion getRegion() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER:
				if (resolve) return getFeaturesOfInterestMapLayer();
				return basicGetFeaturesOfInterestMapLayer();
			case ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_RADIUS:
				return getFeatureOfInterestRadius();
			case ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_COLOR:
				return getFeatureOfInterestColor();
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
			case ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER:
				setFeaturesOfInterestMapLayer((FeaturesOfInterestMapLayer)newValue);
				return;
			case ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_RADIUS:
				setFeatureOfInterestRadius((Double)newValue);
				return;
			case ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_COLOR:
				setFeatureOfInterestColor((Color3f)newValue);
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
			case ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER:
				setFeaturesOfInterestMapLayer((FeaturesOfInterestMapLayer)null);
				return;
			case ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_RADIUS:
				setFeatureOfInterestRadius(FEATURE_OF_INTEREST_RADIUS_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_COLOR:
				setFeatureOfInterestColor(FEATURE_OF_INTEREST_COLOR_EDEFAULT);
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
			case ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER:
				return featuresOfInterestMapLayer != null;
			case ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_RADIUS:
				return featureOfInterestRadius != FEATURE_OF_INTEREST_RADIUS_EDEFAULT;
			case ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_COLOR:
				return FEATURE_OF_INTEREST_COLOR_EDEFAULT == null ? featureOfInterestColor != null : !FEATURE_OF_INTEREST_COLOR_EDEFAULT.equals(featureOfInterestColor);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == RectangularRegionProvider.class) {
			switch (baseOperationID) {
				case ApogySurfaceEnvironmentPackage.RECTANGULAR_REGION_PROVIDER___GET_REGION: return ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION___GET_REGION;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION___GET_REGION:
				return getRegion();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (featureOfInterestRadius: ");
		result.append(featureOfInterestRadius);
		result.append(", featureOfInterestColor: ");
		result.append(featureOfInterestColor);
		result.append(')');
		return result.toString();
	}

} //FeaturesOfInterestMapLayerPresentationImpl
