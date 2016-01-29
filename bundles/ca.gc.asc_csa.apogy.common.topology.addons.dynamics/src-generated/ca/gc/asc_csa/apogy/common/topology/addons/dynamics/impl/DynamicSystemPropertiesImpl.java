/**
 * <copyright>
 * </copyright>
 *
 * $Id: DynamicSystemPropertiesImpl.java,v 1.8.2.2 2015/02/03 20:01:36 rlarcheveque Exp $
 */
package ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractMaterial;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.DynamicSystemProperties;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage;
import ca.gc.asc_csa.apogy.common.topology.impl.AggregateGroupNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic System Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.DynamicSystemPropertiesImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.DynamicSystemPropertiesImpl#getMaterials <em>Materials</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicSystemPropertiesImpl extends AggregateGroupNodeImpl implements DynamicSystemProperties {
	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConstraint> constraints;

	/**
	 * The cached value of the '{@link #getMaterials() <em>Materials</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterials()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMaterial> materials;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicSystemPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyAddonsDynamicsPackage.Literals.DYNAMIC_SYSTEM_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<AbstractConstraint>(AbstractConstraint.class, this, ApogyCommonTopologyAddonsDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractMaterial> getMaterials() {
		if (materials == null) {
			materials = new EObjectContainmentEList<AbstractMaterial>(AbstractMaterial.class, this, ApogyCommonTopologyAddonsDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__MATERIALS);
		}
		return materials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonTopologyAddonsDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case ApogyCommonTopologyAddonsDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__MATERIALS:
				return ((InternalEList<?>)getMaterials()).basicRemove(otherEnd, msgs);
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
			case ApogyCommonTopologyAddonsDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS:
				return getConstraints();
			case ApogyCommonTopologyAddonsDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__MATERIALS:
				return getMaterials();
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
			case ApogyCommonTopologyAddonsDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends AbstractConstraint>)newValue);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__MATERIALS:
				getMaterials().clear();
				getMaterials().addAll((Collection<? extends AbstractMaterial>)newValue);
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
			case ApogyCommonTopologyAddonsDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS:
				getConstraints().clear();
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__MATERIALS:
				getMaterials().clear();
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
			case ApogyCommonTopologyAddonsDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case ApogyCommonTopologyAddonsDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__MATERIALS:
				return materials != null && !materials.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DynamicSystemPropertiesImpl
