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

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Color3f;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFactory;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.PoseVariableAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pose Variable Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.PoseVariableAnnotationImpl#getVectorlength <em>Vectorlength</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.PoseVariableAnnotationImpl#getVectorColor <em>Vector Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.PoseVariableAnnotationImpl#isShowPose <em>Show Pose</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoseVariableAnnotationImpl extends AbstractVariableAnnotationImpl implements PoseVariableAnnotation {
	/**
	 * The default value of the '{@link #getVectorlength() <em>Vectorlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorlength()
	 * @generated
	 * @ordered
	 */
	protected static final double VECTORLENGTH_EDEFAULT = 10.0;

	/**
	 * The cached value of the '{@link #getVectorlength() <em>Vectorlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorlength()
	 * @generated
	 * @ordered
	 */
	protected double vectorlength = VECTORLENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getVectorColor() <em>Vector Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color3f VECTOR_COLOR_EDEFAULT = (Color3f)ApogySurfaceEnvironmentUIFactory.eINSTANCE.createFromString(ApogySurfaceEnvironmentUIPackage.eINSTANCE.getColor3f(), "0.0,0.0,1.0");

	/**
	 * The cached value of the '{@link #getVectorColor() <em>Vector Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorColor()
	 * @generated
	 * @ordered
	 */
	protected Color3f vectorColor = VECTOR_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowPose() <em>Show Pose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowPose()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_POSE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowPose() <em>Show Pose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowPose()
	 * @generated
	 * @ordered
	 */
	protected boolean showPose = SHOW_POSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoseVariableAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentUIPackage.Literals.POSE_VARIABLE_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVectorlength() {
		return vectorlength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorlength(double newVectorlength) {
		double oldVectorlength = vectorlength;
		vectorlength = newVectorlength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTORLENGTH, oldVectorlength, vectorlength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f getVectorColor() {
		return vectorColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorColor(Color3f newVectorColor) {
		Color3f oldVectorColor = vectorColor;
		vectorColor = newVectorColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTOR_COLOR, oldVectorColor, vectorColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowPose() {
		return showPose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowPose(boolean newShowPose) {
		boolean oldShowPose = showPose;
		showPose = newShowPose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__SHOW_POSE, oldShowPose, showPose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updatePose(double x, double y, double zRotation) {
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
			case ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTORLENGTH:
				return getVectorlength();
			case ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTOR_COLOR:
				return getVectorColor();
			case ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__SHOW_POSE:
				return isShowPose();
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
			case ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTORLENGTH:
				setVectorlength((Double)newValue);
				return;
			case ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTOR_COLOR:
				setVectorColor((Color3f)newValue);
				return;
			case ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__SHOW_POSE:
				setShowPose((Boolean)newValue);
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
			case ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTORLENGTH:
				setVectorlength(VECTORLENGTH_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTOR_COLOR:
				setVectorColor(VECTOR_COLOR_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__SHOW_POSE:
				setShowPose(SHOW_POSE_EDEFAULT);
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
			case ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTORLENGTH:
				return vectorlength != VECTORLENGTH_EDEFAULT;
			case ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTOR_COLOR:
				return VECTOR_COLOR_EDEFAULT == null ? vectorColor != null : !VECTOR_COLOR_EDEFAULT.equals(vectorColor);
			case ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__SHOW_POSE:
				return showPose != SHOW_POSE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION___UPDATE_POSE__DOUBLE_DOUBLE_DOUBLE:
				updatePose((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
				return null;
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
		result.append(" (vectorlength: ");
		result.append(vectorlength);
		result.append(", vectorColor: ");
		result.append(vectorColor);
		result.append(", showPose: ");
		result.append(showPose);
		result.append(')');
		return result.toString();
	}

} //PoseVariableAnnotationImpl
