/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Canadian Space Agency (CSA) - Initial API and implementation
 * -Pierre Allard (Pierre.Allard@canada.ca),
 * -Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 * -Sebastien Gemme (Sebastien.Gemme@canada.ca)
 */
package ca.gc.asc_csa.apogy.examples.satellite.impl;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList;
import ca.gc.asc_csa.apogy.examples.satellite.SatellitesList;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;
import java.util.SortedSet;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Constellation Planner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getConstellationRequestsList <em>Constellation Requests List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getConstellationCommandPlan <em>Constellation Command Plan</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractConstellationPlannerImpl extends MinimalEObjectImpl.Container implements AbstractConstellationPlanner {
	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getConstellationRequestsList() <em>Constellation Requests List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstellationRequestsList()
	 * @generated
	 * @ordered
	 */
	protected ConstellationRequestsList constellationRequestsList;
	/**
	 * The cached value of the '{@link #getConstellationCommandPlan() <em>Constellation Command Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstellationCommandPlan()
	 * @generated
	 * @ordered
	 */
	protected AbstractConstellationCommandPlan constellationCommandPlan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractConstellationPlannerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesSatellitePackage.Literals.ABSTRACT_CONSTELLATION_PLANNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationRequestsList getConstellationRequestsList() {
		if (constellationRequestsList != null && constellationRequestsList.eIsProxy()) {
			InternalEObject oldConstellationRequestsList = (InternalEObject)constellationRequestsList;
			constellationRequestsList = (ConstellationRequestsList)eResolveProxy(oldConstellationRequestsList);
			if (constellationRequestsList != oldConstellationRequestsList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_REQUESTS_LIST, oldConstellationRequestsList, constellationRequestsList));
			}
		}
		return constellationRequestsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationRequestsList basicGetConstellationRequestsList() {
		return constellationRequestsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstellationRequestsList(ConstellationRequestsList newConstellationRequestsList) {
		ConstellationRequestsList oldConstellationRequestsList = constellationRequestsList;
		constellationRequestsList = newConstellationRequestsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_REQUESTS_LIST, oldConstellationRequestsList, constellationRequestsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConstellationCommandPlan getConstellationCommandPlan() {
		if (constellationCommandPlan != null && constellationCommandPlan.eIsProxy()) {
			InternalEObject oldConstellationCommandPlan = (InternalEObject)constellationCommandPlan;
			constellationCommandPlan = (AbstractConstellationCommandPlan)eResolveProxy(oldConstellationCommandPlan);
			if (constellationCommandPlan != oldConstellationCommandPlan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_COMMAND_PLAN, oldConstellationCommandPlan, constellationCommandPlan));
			}
		}
		return constellationCommandPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConstellationCommandPlan basicGetConstellationCommandPlan() {
		return constellationCommandPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstellationCommandPlan(AbstractConstellationCommandPlan newConstellationCommandPlan) {
		AbstractConstellationCommandPlan oldConstellationCommandPlan = constellationCommandPlan;
		constellationCommandPlan = newConstellationCommandPlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_COMMAND_PLAN, oldConstellationCommandPlan, constellationCommandPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortedSet<VisibilityPass> getTargetPasses(AbstractConstellationRequest request, Date startDate, Date endDate, ElevationMask elevationMask) throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void plan(SatellitesList satellitesList) throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortedSet<AbstractConstellationRequest> sortRequests(List<AbstractConstellationRequest> requests) {
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__START_DATE:
				return getStartDate();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__END_DATE:
				return getEndDate();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_REQUESTS_LIST:
				if (resolve) return getConstellationRequestsList();
				return basicGetConstellationRequestsList();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_COMMAND_PLAN:
				if (resolve) return getConstellationCommandPlan();
				return basicGetConstellationCommandPlan();
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__START_DATE:
				setStartDate((Date)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__END_DATE:
				setEndDate((Date)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_REQUESTS_LIST:
				setConstellationRequestsList((ConstellationRequestsList)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_COMMAND_PLAN:
				setConstellationCommandPlan((AbstractConstellationCommandPlan)newValue);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_REQUESTS_LIST:
				setConstellationRequestsList((ConstellationRequestsList)null);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_COMMAND_PLAN:
				setConstellationCommandPlan((AbstractConstellationCommandPlan)null);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_REQUESTS_LIST:
				return constellationRequestsList != null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_COMMAND_PLAN:
				return constellationCommandPlan != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER___GET_TARGET_PASSES__ABSTRACTCONSTELLATIONREQUEST_DATE_DATE_ELEVATIONMASK:
				try {
					return getTargetPasses((AbstractConstellationRequest)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (ElevationMask)arguments.get(3));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER___PLAN__SATELLITESLIST:
				try {
					plan((SatellitesList)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER___SORT_REQUESTS__LIST:
				return sortRequests((List<AbstractConstellationRequest>)arguments.get(0));
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
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //AbstractConstellationPlannerImpl
