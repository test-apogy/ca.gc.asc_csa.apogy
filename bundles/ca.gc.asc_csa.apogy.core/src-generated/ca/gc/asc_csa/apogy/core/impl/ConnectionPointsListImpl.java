/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.core.ConnectionPoint;
import org.eclipse.symphony.core.ConnectionPointsList;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.SymphonySystem;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Connection Points List</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.impl.ConnectionPointsListImpl#getSymphonySystem <em>Symphony System</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.ConnectionPointsListImpl#getConnectionPoints <em>Connection Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionPointsListImpl extends MinimalEObjectImpl.Container
		implements ConnectionPointsList {
	/**
	 * The cached value of the '{@link #getConnectionPoints()
	 * <em>Connection Points</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConnectionPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPoint> connectionPoints;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPointsListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CorePackage.Literals.CONNECTION_POINTS_LIST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonySystem getSymphonySystem() {
		if (eContainerFeatureID() != Symphony__CorePackage.CONNECTION_POINTS_LIST__SYMPHONY_SYSTEM) return null;
		return (SymphonySystem)eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonySystem basicGetSymphonySystem() {
		if (eContainerFeatureID() != Symphony__CorePackage.CONNECTION_POINTS_LIST__SYMPHONY_SYSTEM) return null;
		return (SymphonySystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymphonySystem(
			SymphonySystem newSymphonySystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSymphonySystem, Symphony__CorePackage.CONNECTION_POINTS_LIST__SYMPHONY_SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymphonySystem(SymphonySystem newSymphonySystem) {
		if (newSymphonySystem != eInternalContainer() || (eContainerFeatureID() != Symphony__CorePackage.CONNECTION_POINTS_LIST__SYMPHONY_SYSTEM && newSymphonySystem != null)) {
			if (EcoreUtil.isAncestor(this, newSymphonySystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSymphonySystem != null)
				msgs = ((InternalEObject)newSymphonySystem).eInverseAdd(this, Symphony__CorePackage.SYMPHONY_SYSTEM__CONNECTION_POINTS_LIST, SymphonySystem.class, msgs);
			msgs = basicSetSymphonySystem(newSymphonySystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.CONNECTION_POINTS_LIST__SYMPHONY_SYSTEM, newSymphonySystem, newSymphonySystem));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPoint> getConnectionPoints() {
		if (connectionPoints == null) {
			connectionPoints = new EObjectContainmentWithInverseEList<ConnectionPoint>(ConnectionPoint.class, this, Symphony__CorePackage.CONNECTION_POINTS_LIST__CONNECTION_POINTS, Symphony__CorePackage.CONNECTION_POINT__POINTS_LIST);
		}
		return connectionPoints;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__CorePackage.CONNECTION_POINTS_LIST__SYMPHONY_SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSymphonySystem((SymphonySystem)otherEnd, msgs);
			case Symphony__CorePackage.CONNECTION_POINTS_LIST__CONNECTION_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectionPoints()).basicAdd(otherEnd, msgs);
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
			case Symphony__CorePackage.CONNECTION_POINTS_LIST__SYMPHONY_SYSTEM:
				return basicSetSymphonySystem(null, msgs);
			case Symphony__CorePackage.CONNECTION_POINTS_LIST__CONNECTION_POINTS:
				return ((InternalEList<?>)getConnectionPoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Symphony__CorePackage.CONNECTION_POINTS_LIST__SYMPHONY_SYSTEM:
				return eInternalContainer().eInverseRemove(this, Symphony__CorePackage.SYMPHONY_SYSTEM__CONNECTION_POINTS_LIST, SymphonySystem.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CorePackage.CONNECTION_POINTS_LIST__SYMPHONY_SYSTEM:
				if (resolve) return getSymphonySystem();
				return basicGetSymphonySystem();
			case Symphony__CorePackage.CONNECTION_POINTS_LIST__CONNECTION_POINTS:
				return getConnectionPoints();
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
			case Symphony__CorePackage.CONNECTION_POINTS_LIST__SYMPHONY_SYSTEM:
				setSymphonySystem((SymphonySystem)newValue);
				return;
			case Symphony__CorePackage.CONNECTION_POINTS_LIST__CONNECTION_POINTS:
				getConnectionPoints().clear();
				getConnectionPoints().addAll((Collection<? extends ConnectionPoint>)newValue);
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
			case Symphony__CorePackage.CONNECTION_POINTS_LIST__SYMPHONY_SYSTEM:
				setSymphonySystem((SymphonySystem)null);
				return;
			case Symphony__CorePackage.CONNECTION_POINTS_LIST__CONNECTION_POINTS:
				getConnectionPoints().clear();
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
			case Symphony__CorePackage.CONNECTION_POINTS_LIST__SYMPHONY_SYSTEM:
				return basicGetSymphonySystem() != null;
			case Symphony__CorePackage.CONNECTION_POINTS_LIST__CONNECTION_POINTS:
				return connectionPoints != null && !connectionPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ConnectionPointsListImpl
