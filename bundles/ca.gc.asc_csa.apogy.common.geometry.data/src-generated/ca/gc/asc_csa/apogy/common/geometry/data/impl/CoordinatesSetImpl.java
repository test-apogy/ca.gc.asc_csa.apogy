package ca.gc.asc_csa.apogy.common.geometry.data.impl;
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

import java.util.Collection;
import java.util.List;

import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.common.geometry.data.Coordinates;
import ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Coordinates Set</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.CoordinatesSetImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.CoordinatesSetImpl#getNormals <em>Normals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinatesSetImpl<T extends Coordinates> extends MinimalEObjectImpl.Container
		implements CoordinatesSet<T> {
	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<T> points;

	/**
	 * The cached value of the '{@link #getNormals() <em>Normals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormals()
	 * @generated
	 * @ordered
	 */
	protected List<Vector3d> normals;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinatesSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryDataPackage.Literals.COORDINATES_SET;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@SuppressWarnings("serial")
	public EList<T> getPoints() {
		if (points == null) {
			points = new EObjectContainmentEList<T>(Coordinates.class, this,
					ApogyCommonGeometryDataPackage.COORDINATES_SET__POINTS) {
				@Override
				protected boolean isUnique() {
					return false;
				}
			};
		}
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Vector3d> getNormals()
	{
		return normals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormals(List<Vector3d> newNormals)
	{
		List<Vector3d> oldNormals = normals;
		normals = newNormals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryDataPackage.COORDINATES_SET__NORMALS, oldNormals, normals));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ApogyCommonGeometryDataPackage.COORDINATES_SET__POINTS:
			return ((InternalEList<?>) getPoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonGeometryDataPackage.COORDINATES_SET__POINTS:
				return getPoints();
			case ApogyCommonGeometryDataPackage.COORDINATES_SET__NORMALS:
				return getNormals();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCommonGeometryDataPackage.COORDINATES_SET__POINTS:
				getPoints().clear();
				getPoints().addAll((Collection<? extends T>)newValue);
				return;
			case ApogyCommonGeometryDataPackage.COORDINATES_SET__NORMALS:
				setNormals((List<Vector3d>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCommonGeometryDataPackage.COORDINATES_SET__POINTS:
				getPoints().clear();
				return;
			case ApogyCommonGeometryDataPackage.COORDINATES_SET__NORMALS:
				setNormals((List<Vector3d>)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCommonGeometryDataPackage.COORDINATES_SET__POINTS:
				return points != null && !points.isEmpty();
			case ApogyCommonGeometryDataPackage.COORDINATES_SET__NORMALS:
				return normals != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (normals: ");
		result.append(normals);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
//	@Override
//	public String toString() {
//		if (eIsProxy())
//			return super.toString();
//
//		StringBuffer result = new StringBuffer(super.toString());
//		result.append(" (normals: ");
//		result.append(normals);
//		result.append(')');
//		return result.toString();
//	}

} // CoordinatesSetImpl
