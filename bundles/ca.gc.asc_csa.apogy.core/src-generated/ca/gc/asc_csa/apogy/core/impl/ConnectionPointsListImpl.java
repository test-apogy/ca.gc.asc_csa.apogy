/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.impl;

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
import ca.gc.asc_csa.apogy.core.ConnectionPoint;
import ca.gc.asc_csa.apogy.core.ConnectionPointsList;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogySystem;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Connection Points List</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.ConnectionPointsListImpl#getApogySystem <em>Apogy System</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.ConnectionPointsListImpl#getConnectionPoints <em>Connection Points</em>}</li>
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
		return ApogyCorePackage.Literals.CONNECTION_POINTS_LIST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ApogySystem getApogySystem() {
		if (eContainerFeatureID() != ApogyCorePackage.CONNECTION_POINTS_LIST__APOGY_SYSTEM) return null;
		return (ApogySystem)eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ApogySystem basicGetApogySystem() {
		if (eContainerFeatureID() != ApogyCorePackage.CONNECTION_POINTS_LIST__APOGY_SYSTEM) return null;
		return (ApogySystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApogySystem(
			ApogySystem newApogySystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApogySystem, ApogyCorePackage.CONNECTION_POINTS_LIST__APOGY_SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setApogySystem(ApogySystem newApogySystem) {
		if (newApogySystem != eInternalContainer() || (eContainerFeatureID() != ApogyCorePackage.CONNECTION_POINTS_LIST__APOGY_SYSTEM && newApogySystem != null)) {
			if (EcoreUtil.isAncestor(this, newApogySystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApogySystem != null)
				msgs = ((InternalEObject)newApogySystem).eInverseAdd(this, ApogyCorePackage.APOGY_SYSTEM__CONNECTION_POINTS_LIST, ApogySystem.class, msgs);
			msgs = basicSetApogySystem(newApogySystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.CONNECTION_POINTS_LIST__APOGY_SYSTEM, newApogySystem, newApogySystem));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPoint> getConnectionPoints() {
		if (connectionPoints == null) {
			connectionPoints = new EObjectContainmentWithInverseEList<ConnectionPoint>(ConnectionPoint.class, this, ApogyCorePackage.CONNECTION_POINTS_LIST__CONNECTION_POINTS, ApogyCorePackage.CONNECTION_POINT__POINTS_LIST);
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
			case ApogyCorePackage.CONNECTION_POINTS_LIST__APOGY_SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApogySystem((ApogySystem)otherEnd, msgs);
			case ApogyCorePackage.CONNECTION_POINTS_LIST__CONNECTION_POINTS:
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
			case ApogyCorePackage.CONNECTION_POINTS_LIST__APOGY_SYSTEM:
				return basicSetApogySystem(null, msgs);
			case ApogyCorePackage.CONNECTION_POINTS_LIST__CONNECTION_POINTS:
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
			case ApogyCorePackage.CONNECTION_POINTS_LIST__APOGY_SYSTEM:
				return eInternalContainer().eInverseRemove(this, ApogyCorePackage.APOGY_SYSTEM__CONNECTION_POINTS_LIST, ApogySystem.class, msgs);
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
			case ApogyCorePackage.CONNECTION_POINTS_LIST__APOGY_SYSTEM:
				if (resolve) return getApogySystem();
				return basicGetApogySystem();
			case ApogyCorePackage.CONNECTION_POINTS_LIST__CONNECTION_POINTS:
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
			case ApogyCorePackage.CONNECTION_POINTS_LIST__APOGY_SYSTEM:
				setApogySystem((ApogySystem)newValue);
				return;
			case ApogyCorePackage.CONNECTION_POINTS_LIST__CONNECTION_POINTS:
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
			case ApogyCorePackage.CONNECTION_POINTS_LIST__APOGY_SYSTEM:
				setApogySystem((ApogySystem)null);
				return;
			case ApogyCorePackage.CONNECTION_POINTS_LIST__CONNECTION_POINTS:
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
			case ApogyCorePackage.CONNECTION_POINTS_LIST__APOGY_SYSTEM:
				return basicGetApogySystem() != null;
			case ApogyCorePackage.CONNECTION_POINTS_LIST__CONNECTION_POINTS:
				return connectionPoints != null && !connectionPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ConnectionPointsListImpl
