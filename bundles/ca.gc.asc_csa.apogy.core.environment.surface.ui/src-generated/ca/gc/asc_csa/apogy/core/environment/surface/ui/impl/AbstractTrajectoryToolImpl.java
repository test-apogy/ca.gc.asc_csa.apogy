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

import ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractTrajectoryTool;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.MapAnnotation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.MapTool;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewItemPresentation;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.jfree.chart.JFreeChart;

import org.jfree.chart.annotations.AbstractXYAnnotation;

import org.jfree.experimental.chart.swt.ChartComposite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Trajectory Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractTrajectoryToolImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractTrajectoryToolImpl#isActive <em>Active</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTrajectoryToolImpl extends TrajectoryProviderImpl implements AbstractTrajectoryTool {
	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTrajectoryToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentUIPackage.Literals.ABSTRACT_TRAJECTORY_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initialize(ChartComposite composite, JFreeChart chart) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void dispose() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void positionSelected(int mouseButton, double x, double y) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<AbstractXYAnnotation> getXYShapeAnnotation() {
		return new ArrayList<AbstractXYAnnotation>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__VISIBLE:
				return isVisible();
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__ACTIVE:
				return isActive();
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
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__ACTIVE:
				setActive((Boolean)newValue);
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
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
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
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__ACTIVE:
				return active != ACTIVE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MapViewItemPresentation.class) {
			switch (derivedFeatureID) {
				case ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__VISIBLE: return ApogySurfaceEnvironmentUIPackage.MAP_VIEW_ITEM_PRESENTATION__VISIBLE;
				default: return -1;
			}
		}
		if (baseClass == MapAnnotation.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MapTool.class) {
			switch (derivedFeatureID) {
				case ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__ACTIVE: return ApogySurfaceEnvironmentUIPackage.MAP_TOOL__ACTIVE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MapViewItemPresentation.class) {
			switch (baseFeatureID) {
				case ApogySurfaceEnvironmentUIPackage.MAP_VIEW_ITEM_PRESENTATION__VISIBLE: return ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__VISIBLE;
				default: return -1;
			}
		}
		if (baseClass == MapAnnotation.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MapTool.class) {
			switch (baseFeatureID) {
				case ApogySurfaceEnvironmentUIPackage.MAP_TOOL__ACTIVE: return ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__ACTIVE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == MapViewItemPresentation.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == MapAnnotation.class) {
			switch (baseOperationID) {
				case ApogySurfaceEnvironmentUIPackage.MAP_ANNOTATION___GET_XY_SHAPE_ANNOTATION: return ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL___GET_XY_SHAPE_ANNOTATION;
				default: return -1;
			}
		}
		if (baseClass == MapTool.class) {
			switch (baseOperationID) {
				case ApogySurfaceEnvironmentUIPackage.MAP_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART: return ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART;
				case ApogySurfaceEnvironmentUIPackage.MAP_TOOL___DISPOSE: return ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL___DISPOSE;
				case ApogySurfaceEnvironmentUIPackage.MAP_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE: return ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE;
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
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART:
				initialize((ChartComposite)arguments.get(0), (JFreeChart)arguments.get(1));
				return null;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL___DISPOSE:
				dispose();
				return null;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE:
				positionSelected((Integer)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
				return null;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL___GET_XY_SHAPE_ANNOTATION:
				return getXYShapeAnnotation();
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
		result.append(" (visible: ");
		result.append(visible);
		result.append(", active: ");
		result.append(active);
		result.append(')');
		return result.toString();
	}

} //AbstractTrajectoryToolImpl
