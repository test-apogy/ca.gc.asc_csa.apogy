/**
 * <copyright>
 * </copyright>
 *
 * $Id: DynamicSystemPropertiesImpl.java,v 1.8.2.2 2015/02/03 20:01:36 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.gc.asc_csa.topology.dynamics.AbstractConstraint;
import ca.gc.asc_csa.topology.dynamics.AbstractMaterial;
import ca.gc.asc_csa.topology.dynamics.DynamicSystemProperties;
import ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage;
import ca.gc.space.topology.impl.AggregateGroupNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic System Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.impl.DynamicSystemPropertiesImpl#getContraints <em>Contraints</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.impl.DynamicSystemPropertiesImpl#getMaterials <em>Materials</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicSystemPropertiesImpl extends AggregateGroupNodeImpl implements DynamicSystemProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyrights Canadian Space Agency 2012.";

	/**
	 * The cached value of the '{@link #getContraints() <em>Contraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraints()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConstraint> contraints;

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
		return TopologyDynamicsPackage.Literals.DYNAMIC_SYSTEM_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConstraint> getContraints() {
		if (contraints == null) {
			contraints = new EObjectContainmentEList<AbstractConstraint>(AbstractConstraint.class, this, TopologyDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__CONTRAINTS);
		}
		return contraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractMaterial> getMaterials() {
		if (materials == null) {
			materials = new EObjectContainmentEList<AbstractMaterial>(AbstractMaterial.class, this, TopologyDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__MATERIALS);
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
			case TopologyDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__CONTRAINTS:
				return ((InternalEList<?>)getContraints()).basicRemove(otherEnd, msgs);
			case TopologyDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__MATERIALS:
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
			case TopologyDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__CONTRAINTS:
				return getContraints();
			case TopologyDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__MATERIALS:
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
			case TopologyDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__CONTRAINTS:
				getContraints().clear();
				getContraints().addAll((Collection<? extends AbstractConstraint>)newValue);
				return;
			case TopologyDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__MATERIALS:
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
			case TopologyDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__CONTRAINTS:
				getContraints().clear();
				return;
			case TopologyDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__MATERIALS:
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
			case TopologyDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__CONTRAINTS:
				return contraints != null && !contraints.isEmpty();
			case TopologyDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__MATERIALS:
				return materials != null && !materials.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DynamicSystemPropertiesImpl
