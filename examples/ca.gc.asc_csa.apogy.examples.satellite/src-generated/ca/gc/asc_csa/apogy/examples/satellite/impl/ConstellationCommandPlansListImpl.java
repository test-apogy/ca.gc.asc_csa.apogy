/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.examples.satellite.impl;

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

import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constellation Command Plans List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationCommandPlansListImpl#getConstellationState <em>Constellation State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationCommandPlansListImpl#getPlans <em>Plans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstellationCommandPlansListImpl extends MinimalEObjectImpl.Container implements ConstellationCommandPlansList {
	/**
	 * The cached value of the '{@link #getPlans() <em>Plans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConstellationCommandPlan> plans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstellationCommandPlansListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesSatellitePackage.Literals.CONSTELLATION_COMMAND_PLANS_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationState getConstellationState() {
		if (eContainerFeatureID() != ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__CONSTELLATION_STATE) return null;
		return (ConstellationState)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationState basicGetConstellationState() {
		if (eContainerFeatureID() != ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__CONSTELLATION_STATE) return null;
		return (ConstellationState)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstellationState(ConstellationState newConstellationState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConstellationState, ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__CONSTELLATION_STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstellationState(ConstellationState newConstellationState) {
		if (newConstellationState != eInternalContainer() || (eContainerFeatureID() != ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__CONSTELLATION_STATE && newConstellationState != null)) {
			if (EcoreUtil.isAncestor(this, newConstellationState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConstellationState != null)
				msgs = ((InternalEObject)newConstellationState).eInverseAdd(this, ApogyExamplesSatellitePackage.CONSTELLATION_STATE__CONSTELLATION_COMMAND_PLANS_LIST, ConstellationState.class, msgs);
			msgs = basicSetConstellationState(newConstellationState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__CONSTELLATION_STATE, newConstellationState, newConstellationState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConstellationCommandPlan> getPlans() {
		if (plans == null) {
			plans = new EObjectContainmentWithInverseEList<AbstractConstellationCommandPlan>(AbstractConstellationCommandPlan.class, this, ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__PLANS, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__COMMAND_PLANS_LIST);
		}
		return plans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__CONSTELLATION_STATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConstellationState((ConstellationState)otherEnd, msgs);
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__PLANS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlans()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__CONSTELLATION_STATE:
				return basicSetConstellationState(null, msgs);
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__PLANS:
				return ((InternalEList<?>)getPlans()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__CONSTELLATION_STATE:
				return eInternalContainer().eInverseRemove(this, ApogyExamplesSatellitePackage.CONSTELLATION_STATE__CONSTELLATION_COMMAND_PLANS_LIST, ConstellationState.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__CONSTELLATION_STATE:
				if (resolve) return getConstellationState();
				return basicGetConstellationState();
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__PLANS:
				return getPlans();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__CONSTELLATION_STATE:
				setConstellationState((ConstellationState)newValue);
				return;
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__PLANS:
				getPlans().clear();
				getPlans().addAll((Collection<? extends AbstractConstellationCommandPlan>)newValue);
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__CONSTELLATION_STATE:
				setConstellationState((ConstellationState)null);
				return;
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__PLANS:
				getPlans().clear();
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__CONSTELLATION_STATE:
				return basicGetConstellationState() != null;
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__PLANS:
				return plans != null && !plans.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstellationCommandPlansListImpl
