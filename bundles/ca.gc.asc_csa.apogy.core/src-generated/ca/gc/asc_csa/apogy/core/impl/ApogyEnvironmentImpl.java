package ca.gc.asc_csa.apogy.core.impl;
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

import java.util.Date;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.TimeSource;
import ca.gc.asc_csa.apogy.common.emf.Timed;
import ca.gc.asc_csa.apogy.core.AbstractWorksite;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.TimeSourcesList;
import ca.gc.asc_csa.apogy.core.WorksitesList;
import ca.gc.asc_csa.apogy.core.invocator.impl.EnvironmentImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Apogy Environment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.ApogyEnvironmentImpl#getTime <em>Time</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.ApogyEnvironmentImpl#getWorksitesList <em>Worksites List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.ApogyEnvironmentImpl#getActiveWorksite <em>Active Worksite</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.ApogyEnvironmentImpl#getTimeSourcesList <em>Time Sources List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.ApogyEnvironmentImpl#getActiveTimeSource <em>Active Time Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApogyEnvironmentImpl extends EnvironmentImpl implements
		ApogyEnvironment {
	
	private Adapter timeSourceAdapter = null;
	
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorksitesList() <em>Worksites List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorksitesList()
	 * @generated
	 * @ordered
	 */
	protected WorksitesList worksitesList;

	/**
	 * The cached value of the '{@link #getActiveWorksite() <em>Active Worksite</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getActiveWorksite()
	 * @generated
	 * @ordered
	 */
	protected AbstractWorksite activeWorksite;

	/**
	 * The cached value of the '{@link #getTimeSourcesList() <em>Time Sources List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSourcesList()
	 * @generated
	 * @ordered
	 */
	protected TimeSourcesList timeSourcesList;

	/**
	 * The cached value of the '{@link #getActiveTimeSource() <em>Active Time Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveTimeSource()
	 * @generated
	 * @ordered
	 */
	protected TimeSource activeTimeSource;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCorePackage.Literals.APOGY_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTime() {
		return time;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setTime(Date newTime) 
	{		
		if(getActiveWorksite() != null)
		{
			getActiveWorksite().setTime(newTime);
		}
		
		setTimeGen(newTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeGen(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_ENVIRONMENT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public WorksitesList getWorksitesList() {
		return worksitesList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorksitesList(
			WorksitesList newWorksitesList, NotificationChain msgs) {
		WorksitesList oldWorksitesList = worksitesList;
		worksitesList = newWorksitesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_ENVIRONMENT__WORKSITES_LIST, oldWorksitesList, newWorksitesList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorksitesList(WorksitesList newWorksitesList) {
		if (newWorksitesList != worksitesList) {
			NotificationChain msgs = null;
			if (worksitesList != null)
				msgs = ((InternalEObject)worksitesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.APOGY_ENVIRONMENT__WORKSITES_LIST, null, msgs);
			if (newWorksitesList != null)
				msgs = ((InternalEObject)newWorksitesList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.APOGY_ENVIRONMENT__WORKSITES_LIST, null, msgs);
			msgs = basicSetWorksitesList(newWorksitesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_ENVIRONMENT__WORKSITES_LIST, newWorksitesList, newWorksitesList));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractWorksite getActiveWorksite() {
		if (activeWorksite != null && activeWorksite.eIsProxy()) {
			InternalEObject oldActiveWorksite = (InternalEObject)activeWorksite;
			activeWorksite = (AbstractWorksite)eResolveProxy(oldActiveWorksite);
			if (activeWorksite != oldActiveWorksite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCorePackage.APOGY_ENVIRONMENT__ACTIVE_WORKSITE, oldActiveWorksite, activeWorksite));
			}
		}
		return activeWorksite;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractWorksite basicGetActiveWorksite() {
		return activeWorksite;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveWorksite(AbstractWorksite newActiveWorksite) {
		AbstractWorksite oldActiveWorksite = activeWorksite;
		activeWorksite = newActiveWorksite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_ENVIRONMENT__ACTIVE_WORKSITE, oldActiveWorksite, activeWorksite));
	}

// FIXME TRANSACTION: Volatile + Singleton.	
//	/**
//	 * <!-- begin-user-doc --> <!-- end-user-doc -->
//	 * 
//	 * @generated_NOT
//	 */
//	public ApogyTopology getApogyTopology() {
//		ApogyTopology tmp = getApogyTopologyGen();
//		if (tmp == null) {
//			tmp = ApogyCoreFactory.eINSTANCE.createApogyTopology();
//			setApogyTopology(tmp);
//		}
//
//		return tmp;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSourcesList getTimeSourcesList() {
		return timeSourcesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeSourcesList(TimeSourcesList newTimeSourcesList, NotificationChain msgs) {
		TimeSourcesList oldTimeSourcesList = timeSourcesList;
		timeSourcesList = newTimeSourcesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_ENVIRONMENT__TIME_SOURCES_LIST, oldTimeSourcesList, newTimeSourcesList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSourcesList(TimeSourcesList newTimeSourcesList) {
		if (newTimeSourcesList != timeSourcesList) {
			NotificationChain msgs = null;
			if (timeSourcesList != null)
				msgs = ((InternalEObject)timeSourcesList).eInverseRemove(this, ApogyCorePackage.TIME_SOURCES_LIST__ENVIRONMENT, TimeSourcesList.class, msgs);
			if (newTimeSourcesList != null)
				msgs = ((InternalEObject)newTimeSourcesList).eInverseAdd(this, ApogyCorePackage.TIME_SOURCES_LIST__ENVIRONMENT, TimeSourcesList.class, msgs);
			msgs = basicSetTimeSourcesList(newTimeSourcesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_ENVIRONMENT__TIME_SOURCES_LIST, newTimeSourcesList, newTimeSourcesList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSource getActiveTimeSource() {
		if (activeTimeSource != null && activeTimeSource.eIsProxy()) {
			InternalEObject oldActiveTimeSource = (InternalEObject)activeTimeSource;
			activeTimeSource = (TimeSource)eResolveProxy(oldActiveTimeSource);
			if (activeTimeSource != oldActiveTimeSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCorePackage.APOGY_ENVIRONMENT__ACTIVE_TIME_SOURCE, oldActiveTimeSource, activeTimeSource));
			}
		}
		return activeTimeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSource basicGetActiveTimeSource() {
		return activeTimeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setActiveTimeSource(TimeSource newActiveTimeSource)
	{
		if(activeTimeSource != null)
		{
			activeTimeSource.eAdapters().remove(getTimeSourceAdapter());
		}
		
		if(newActiveTimeSource != null)
		{
			newActiveTimeSource.eAdapters().add(getTimeSourceAdapter());
			setTime(newActiveTimeSource.getTime());
		}
		
		setActiveTimeSourceGen(newActiveTimeSource);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveTimeSourceGen(TimeSource newActiveTimeSource) {
		TimeSource oldActiveTimeSource = activeTimeSource;
		activeTimeSource = newActiveTimeSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_ENVIRONMENT__ACTIVE_TIME_SOURCE, oldActiveTimeSource, activeTimeSource));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCorePackage.APOGY_ENVIRONMENT__TIME_SOURCES_LIST:
				if (timeSourcesList != null)
					msgs = ((InternalEObject)timeSourcesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.APOGY_ENVIRONMENT__TIME_SOURCES_LIST, null, msgs);
				return basicSetTimeSourcesList((TimeSourcesList)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCorePackage.APOGY_ENVIRONMENT__WORKSITES_LIST:
				return basicSetWorksitesList(null, msgs);
			case ApogyCorePackage.APOGY_ENVIRONMENT__TIME_SOURCES_LIST:
				return basicSetTimeSourcesList(null, msgs);
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
			case ApogyCorePackage.APOGY_ENVIRONMENT__TIME:
				return getTime();
			case ApogyCorePackage.APOGY_ENVIRONMENT__WORKSITES_LIST:
				return getWorksitesList();
			case ApogyCorePackage.APOGY_ENVIRONMENT__ACTIVE_WORKSITE:
				if (resolve) return getActiveWorksite();
				return basicGetActiveWorksite();
			case ApogyCorePackage.APOGY_ENVIRONMENT__TIME_SOURCES_LIST:
				return getTimeSourcesList();
			case ApogyCorePackage.APOGY_ENVIRONMENT__ACTIVE_TIME_SOURCE:
				if (resolve) return getActiveTimeSource();
				return basicGetActiveTimeSource();
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
			case ApogyCorePackage.APOGY_ENVIRONMENT__TIME:
				setTime((Date)newValue);
				return;
			case ApogyCorePackage.APOGY_ENVIRONMENT__WORKSITES_LIST:
				setWorksitesList((WorksitesList)newValue);
				return;
			case ApogyCorePackage.APOGY_ENVIRONMENT__ACTIVE_WORKSITE:
				setActiveWorksite((AbstractWorksite)newValue);
				return;
			case ApogyCorePackage.APOGY_ENVIRONMENT__TIME_SOURCES_LIST:
				setTimeSourcesList((TimeSourcesList)newValue);
				return;
			case ApogyCorePackage.APOGY_ENVIRONMENT__ACTIVE_TIME_SOURCE:
				setActiveTimeSource((TimeSource)newValue);
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
			case ApogyCorePackage.APOGY_ENVIRONMENT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ApogyCorePackage.APOGY_ENVIRONMENT__WORKSITES_LIST:
				setWorksitesList((WorksitesList)null);
				return;
			case ApogyCorePackage.APOGY_ENVIRONMENT__ACTIVE_WORKSITE:
				setActiveWorksite((AbstractWorksite)null);
				return;
			case ApogyCorePackage.APOGY_ENVIRONMENT__TIME_SOURCES_LIST:
				setTimeSourcesList((TimeSourcesList)null);
				return;
			case ApogyCorePackage.APOGY_ENVIRONMENT__ACTIVE_TIME_SOURCE:
				setActiveTimeSource((TimeSource)null);
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
			case ApogyCorePackage.APOGY_ENVIRONMENT__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case ApogyCorePackage.APOGY_ENVIRONMENT__WORKSITES_LIST:
				return worksitesList != null;
			case ApogyCorePackage.APOGY_ENVIRONMENT__ACTIVE_WORKSITE:
				return activeWorksite != null;
			case ApogyCorePackage.APOGY_ENVIRONMENT__TIME_SOURCES_LIST:
				return timeSourcesList != null;
			case ApogyCorePackage.APOGY_ENVIRONMENT__ACTIVE_TIME_SOURCE:
				return activeTimeSource != null;
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
		if (baseClass == Timed.class) {
			switch (derivedFeatureID) {
				case ApogyCorePackage.APOGY_ENVIRONMENT__TIME: return ApogyCommonEMFPackage.TIMED__TIME;
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
		if (baseClass == Timed.class) {
			switch (baseFeatureID) {
				case ApogyCommonEMFPackage.TIMED__TIME: return ApogyCorePackage.APOGY_ENVIRONMENT__TIME;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

	private Adapter getTimeSourceAdapter()
	{
		if(timeSourceAdapter == null)
		{
			timeSourceAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{									
					if(msg.getNotifier() instanceof TimeSource)
					{												
						int featureId = msg.getFeatureID(TimeSource.class);
						if(featureId == ApogyCommonEMFPackage.TIME_SOURCE__TIME)
						{							
							if(msg.getNewValue() instanceof Date)
							{
								Date newDate = (Date) msg.getNewValue();
								setTime(new Date(newDate.getTime()));
							}
						}
					}
				}
			};
		}
		
		return timeSourceAdapter;
	}
} // ApogyEnvironmentImpl
