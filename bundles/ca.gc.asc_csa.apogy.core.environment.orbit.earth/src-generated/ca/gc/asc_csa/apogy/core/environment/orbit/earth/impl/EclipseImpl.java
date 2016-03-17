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
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.Eclipse;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EclipseEvent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eclipse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EclipseImpl#getPenumbraEntry <em>Penumbra Entry</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EclipseImpl#getUmbraEntry <em>Umbra Entry</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EclipseImpl#getUmbraExit <em>Umbra Exit</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EclipseImpl#getPenumbraExit <em>Penumbra Exit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EclipseImpl extends MinimalEObjectImpl.Container implements Eclipse {
	/**
	 * The cached value of the '{@link #getPenumbraEntry() <em>Penumbra Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenumbraEntry()
	 * @generated
	 * @ordered
	 */
	protected EclipseEvent penumbraEntry;

	/**
	 * The cached value of the '{@link #getUmbraEntry() <em>Umbra Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmbraEntry()
	 * @generated
	 * @ordered
	 */
	protected EclipseEvent umbraEntry;

	/**
	 * The cached value of the '{@link #getUmbraExit() <em>Umbra Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmbraExit()
	 * @generated
	 * @ordered
	 */
	protected EclipseEvent umbraExit;

	/**
	 * The cached value of the '{@link #getPenumbraExit() <em>Penumbra Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenumbraExit()
	 * @generated
	 * @ordered
	 */
	protected EclipseEvent penumbraExit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EclipseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthPackage.Literals.ECLIPSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseEvent getPenumbraEntry() {
		return penumbraEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPenumbraEntry(EclipseEvent newPenumbraEntry, NotificationChain msgs) {
		EclipseEvent oldPenumbraEntry = penumbraEntry;
		penumbraEntry = newPenumbraEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__PENUMBRA_ENTRY, oldPenumbraEntry, newPenumbraEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenumbraEntry(EclipseEvent newPenumbraEntry) {
		if (newPenumbraEntry != penumbraEntry) {
			NotificationChain msgs = null;
			if (penumbraEntry != null)
				msgs = ((InternalEObject)penumbraEntry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__PENUMBRA_ENTRY, null, msgs);
			if (newPenumbraEntry != null)
				msgs = ((InternalEObject)newPenumbraEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__PENUMBRA_ENTRY, null, msgs);
			msgs = basicSetPenumbraEntry(newPenumbraEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__PENUMBRA_ENTRY, newPenumbraEntry, newPenumbraEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseEvent getUmbraEntry() {
		return umbraEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUmbraEntry(EclipseEvent newUmbraEntry, NotificationChain msgs) {
		EclipseEvent oldUmbraEntry = umbraEntry;
		umbraEntry = newUmbraEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__UMBRA_ENTRY, oldUmbraEntry, newUmbraEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmbraEntry(EclipseEvent newUmbraEntry) {
		if (newUmbraEntry != umbraEntry) {
			NotificationChain msgs = null;
			if (umbraEntry != null)
				msgs = ((InternalEObject)umbraEntry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__UMBRA_ENTRY, null, msgs);
			if (newUmbraEntry != null)
				msgs = ((InternalEObject)newUmbraEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__UMBRA_ENTRY, null, msgs);
			msgs = basicSetUmbraEntry(newUmbraEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__UMBRA_ENTRY, newUmbraEntry, newUmbraEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseEvent getUmbraExit() {
		return umbraExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUmbraExit(EclipseEvent newUmbraExit, NotificationChain msgs) {
		EclipseEvent oldUmbraExit = umbraExit;
		umbraExit = newUmbraExit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__UMBRA_EXIT, oldUmbraExit, newUmbraExit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmbraExit(EclipseEvent newUmbraExit) {
		if (newUmbraExit != umbraExit) {
			NotificationChain msgs = null;
			if (umbraExit != null)
				msgs = ((InternalEObject)umbraExit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__UMBRA_EXIT, null, msgs);
			if (newUmbraExit != null)
				msgs = ((InternalEObject)newUmbraExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__UMBRA_EXIT, null, msgs);
			msgs = basicSetUmbraExit(newUmbraExit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__UMBRA_EXIT, newUmbraExit, newUmbraExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseEvent getPenumbraExit() {
		return penumbraExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPenumbraExit(EclipseEvent newPenumbraExit, NotificationChain msgs) {
		EclipseEvent oldPenumbraExit = penumbraExit;
		penumbraExit = newPenumbraExit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__PENUMBRA_EXIT, oldPenumbraExit, newPenumbraExit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenumbraExit(EclipseEvent newPenumbraExit) {
		if (newPenumbraExit != penumbraExit) {
			NotificationChain msgs = null;
			if (penumbraExit != null)
				msgs = ((InternalEObject)penumbraExit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__PENUMBRA_EXIT, null, msgs);
			if (newPenumbraExit != null)
				msgs = ((InternalEObject)newPenumbraExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__PENUMBRA_EXIT, null, msgs);
			msgs = basicSetPenumbraExit(newPenumbraExit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__PENUMBRA_EXIT, newPenumbraExit, newPenumbraExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__PENUMBRA_ENTRY:
				return basicSetPenumbraEntry(null, msgs);
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__UMBRA_ENTRY:
				return basicSetUmbraEntry(null, msgs);
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__UMBRA_EXIT:
				return basicSetUmbraExit(null, msgs);
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__PENUMBRA_EXIT:
				return basicSetPenumbraExit(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__PENUMBRA_ENTRY:
				return getPenumbraEntry();
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__UMBRA_ENTRY:
				return getUmbraEntry();
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__UMBRA_EXIT:
				return getUmbraExit();
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__PENUMBRA_EXIT:
				return getPenumbraExit();
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
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__PENUMBRA_ENTRY:
				setPenumbraEntry((EclipseEvent)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__UMBRA_ENTRY:
				setUmbraEntry((EclipseEvent)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__UMBRA_EXIT:
				setUmbraExit((EclipseEvent)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__PENUMBRA_EXIT:
				setPenumbraExit((EclipseEvent)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__PENUMBRA_ENTRY:
				setPenumbraEntry((EclipseEvent)null);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__UMBRA_ENTRY:
				setUmbraEntry((EclipseEvent)null);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__UMBRA_EXIT:
				setUmbraExit((EclipseEvent)null);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__PENUMBRA_EXIT:
				setPenumbraExit((EclipseEvent)null);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__PENUMBRA_ENTRY:
				return penumbraEntry != null;
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__UMBRA_ENTRY:
				return umbraEntry != null;
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__UMBRA_EXIT:
				return umbraExit != null;
			case ApogyCoreEnvironmentOrbitEarthPackage.ECLIPSE__PENUMBRA_EXIT:
				return penumbraExit != null;
		}
		return super.eIsSet(featureID);
	}

} //EclipseImpl
