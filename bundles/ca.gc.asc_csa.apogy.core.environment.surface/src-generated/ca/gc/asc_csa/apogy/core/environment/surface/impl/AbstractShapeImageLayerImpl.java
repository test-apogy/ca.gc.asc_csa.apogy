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
package ca.gc.asc_csa.apogy.core.environment.surface.impl;

import javax.vecmath.Color3f;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Shape Image Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.AbstractShapeImageLayerImpl#isShapedFilled <em>Shaped Filled</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.AbstractShapeImageLayerImpl#getColor <em>Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.AbstractShapeImageLayerImpl#getRequiredResolution <em>Required Resolution</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractShapeImageLayerImpl extends ImageMapLayerImpl implements AbstractShapeImageLayer {
	/**
	 * The default value of the '{@link #isShapedFilled() <em>Shaped Filled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShapedFilled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHAPED_FILLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShapedFilled() <em>Shaped Filled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShapedFilled()
	 * @generated
	 * @ordered
	 */
	protected boolean shapedFilled = SHAPED_FILLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color3f COLOR_EDEFAULT = (Color3f)ApogySurfaceEnvironmentFactory.eINSTANCE.createFromString(ApogySurfaceEnvironmentPackage.eINSTANCE.getColor3f(), "0.0,1.0,0.0");

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color3f color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredResolution() <em>Required Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredResolution()
	 * @generated
	 * @ordered
	 */
	protected static final double REQUIRED_RESOLUTION_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getRequiredResolution() <em>Required Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredResolution()
	 * @generated
	 * @ordered
	 */
	protected double requiredResolution = REQUIRED_RESOLUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractShapeImageLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentPackage.Literals.ABSTRACT_SHAPE_IMAGE_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShapedFilled() {
		return shapedFilled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapedFilled(boolean newShapedFilled) {
		boolean oldShapedFilled = shapedFilled;
		shapedFilled = newShapedFilled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.ABSTRACT_SHAPE_IMAGE_LAYER__SHAPED_FILLED, oldShapedFilled, shapedFilled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color3f newColor) {
		Color3f oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.ABSTRACT_SHAPE_IMAGE_LAYER__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRequiredResolution() {
		return requiredResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredResolution(double newRequiredResolution) {
		double oldRequiredResolution = requiredResolution;
		requiredResolution = newRequiredResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.ABSTRACT_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION, oldRequiredResolution, requiredResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.ABSTRACT_SHAPE_IMAGE_LAYER__SHAPED_FILLED:
				return isShapedFilled();
			case ApogySurfaceEnvironmentPackage.ABSTRACT_SHAPE_IMAGE_LAYER__COLOR:
				return getColor();
			case ApogySurfaceEnvironmentPackage.ABSTRACT_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION:
				return getRequiredResolution();
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
			case ApogySurfaceEnvironmentPackage.ABSTRACT_SHAPE_IMAGE_LAYER__SHAPED_FILLED:
				setShapedFilled((Boolean)newValue);
				return;
			case ApogySurfaceEnvironmentPackage.ABSTRACT_SHAPE_IMAGE_LAYER__COLOR:
				setColor((Color3f)newValue);
				return;
			case ApogySurfaceEnvironmentPackage.ABSTRACT_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION:
				setRequiredResolution((Double)newValue);
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
			case ApogySurfaceEnvironmentPackage.ABSTRACT_SHAPE_IMAGE_LAYER__SHAPED_FILLED:
				setShapedFilled(SHAPED_FILLED_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentPackage.ABSTRACT_SHAPE_IMAGE_LAYER__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentPackage.ABSTRACT_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION:
				setRequiredResolution(REQUIRED_RESOLUTION_EDEFAULT);
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
			case ApogySurfaceEnvironmentPackage.ABSTRACT_SHAPE_IMAGE_LAYER__SHAPED_FILLED:
				return shapedFilled != SHAPED_FILLED_EDEFAULT;
			case ApogySurfaceEnvironmentPackage.ABSTRACT_SHAPE_IMAGE_LAYER__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case ApogySurfaceEnvironmentPackage.ABSTRACT_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION:
				return requiredResolution != REQUIRED_RESOLUTION_EDEFAULT;
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
		result.append(" (shapedFilled: ");
		result.append(shapedFilled);
		result.append(", color: ");
		result.append(color);
		result.append(", requiredResolution: ");
		result.append(requiredResolution);
		result.append(')');
		return result.toString();
	}

} //AbstractShapeImageLayerImpl
