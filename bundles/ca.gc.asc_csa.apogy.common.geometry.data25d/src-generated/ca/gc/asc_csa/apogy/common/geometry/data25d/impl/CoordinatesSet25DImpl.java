package ca.gc.asc_csa.apogy.common.geometry.data25d.impl;
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

import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage;
import ca.gc.asc_csa.apogy.common.geometry.data.Mesh;
import ca.gc.asc_csa.apogy.common.geometry.data.impl.CoordinatesSetImpl;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.CoordinatesSet25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Coordinates Set25 D</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.CoordinatesSet25DImpl#isEnforceUniqueness <em>Enforce Uniqueness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinatesSet25DImpl extends CoordinatesSetImpl<Coordinates25D>
		implements CoordinatesSet25D {

	protected TreeSet<Coordinates25D> coordinateSet = null;

	private Adapter pointsAdapter = null;

	/**
	 * The default value of the '{@link #isEnforceUniqueness() <em>Enforce Uniqueness</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isEnforceUniqueness()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENFORCE_UNIQUENESS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnforceUniqueness() <em>Enforce Uniqueness</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isEnforceUniqueness()
	 * @generated
	 * @ordered
	 */
	protected boolean enforceUniqueness = ENFORCE_UNIQUENESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinatesSet25DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData25DPackage.Literals.COORDINATES_SET25_D;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnforceUniqueness() {
		return enforceUniqueness;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setEnforceUniqueness(boolean newEnforceUniqueness) {
		boolean oldEnforceUniqueness = enforceUniqueness;
		enforceUniqueness = newEnforceUniqueness;

		// If set to true
		// Enforcement of uniqueness is enabled, we add the points adapter.
		if (enforceUniqueness && !this.eAdapters().contains(getPointsAdapter())) {
			this.eAdapters().add(getPointsAdapter());
		} else if (!enforceUniqueness) {// Enforcement is disabled.
			this.eAdapters().remove(getPointsAdapter());
		}

		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApogyCommonGeometryData25DPackage.COORDINATES_SET25_D__ENFORCE_UNIQUENESS,
					oldEnforceUniqueness, enforceUniqueness));

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonGeometryData25DPackage.COORDINATES_SET25_D__ENFORCE_UNIQUENESS:
				return isEnforceUniqueness();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCommonGeometryData25DPackage.COORDINATES_SET25_D__ENFORCE_UNIQUENESS:
				setEnforceUniqueness((Boolean)newValue);
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
			case ApogyCommonGeometryData25DPackage.COORDINATES_SET25_D__ENFORCE_UNIQUENESS:
				setEnforceUniqueness(ENFORCE_UNIQUENESS_EDEFAULT);
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
			case ApogyCommonGeometryData25DPackage.COORDINATES_SET25_D__ENFORCE_UNIQUENESS:
				return enforceUniqueness != ENFORCE_UNIQUENESS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (enforceUniqueness: ");
		result.append(enforceUniqueness);
		result.append(')');
		return result.toString();
	}

	/**
	 * Returns a TreeSet that ensures uniqueness of u,v points.
	 * 
	 * @return The TreeSet.
	 */
	protected TreeSet<Coordinates25D> getCoordinateSet() {
		if (coordinateSet == null) {
			coordinateSet = new TreeSet<Coordinates25D>(
					new Comparator<Coordinates25D>() {
						@Override
						public int compare(Coordinates25D o1, Coordinates25D o2) {
							if (o1.getU() == o2.getU()) {
								if (o1.getV() > o2.getV()) {
									return 1;
								} else if (o1.getV() < o2.getV()) {
									return -1;
								} else {
									return 0;
								}
							} else {
								if (o1.getU() > o2.getU()) {
									return 1;
								} else {
									return -1;
								}
							}
						}
					});
		}

		return coordinateSet;
	}

	private Adapter getPointsAdapter() {
		if (pointsAdapter == null) {
			pointsAdapter = new AdapterImpl() {
				@SuppressWarnings("unchecked")
				@Override
				public void notifyChanged(Notification notification) {
					if (notification.getFeatureID(Mesh.class) == ApogyCommonGeometryDataPackage.COORDINATES_SET__POINTS) {
						if (notification.getEventType() == Notification.ADD
								|| notification.getEventType() == Notification.ADD_MANY) {

							if (notification.getNewValue() != null) {
								if (notification.getNewValue() instanceof List) {
									List<Coordinates25D> points = (List<Coordinates25D>) notification
											.getNewValue();
									for (Coordinates25D point : points) {
										pointAdded(point);
									}
								} else {
									Coordinates25D point = (Coordinates25D) notification
											.getNewValue();
									pointAdded(point);
								}
							}
						}
					}
				}
			};
		}
		return pointsAdapter;
	}

	/**
	 * Handles the addition of a point to the list of point. This method
	 * enforces that no two point have the same u,v coordinates. If such a case
	 * occurs the duplicate point the point list is replaced by the new one.
	 * 
	 * @param point
	 *            The point to add.
	 */
	private void pointAdded(Coordinates25D point) {
		// Checks for duplicate from the list of points.
		SortedSet<Coordinates25D> tailSet = getCoordinateSet().tailSet(point);
		if (tailSet.size() > 0) {
			Coordinates25D duplicate = tailSet.first();

			if ((duplicate.getU() == point.getU())
					&& (duplicate.getV() == point.getV())) {
				// Removes duplicate.
				getPoints().remove(duplicate);
				getCoordinateSet().remove(duplicate);
			}
		}

		// Adds new point to the sorted set.
		getCoordinateSet().add(point);
	}

	@Override
	public EList<Coordinates25D> getPoints() {

		if (isEnforceUniqueness()) {
			// Listens for points being added to enforce u,v uniqueness.
			if (!this.eAdapters().contains(getPointsAdapter())) {
				this.eAdapters().add(getPointsAdapter());
			}
		}

		return super.getPoints();
	}
} // CoordinatesSet25DImpl
