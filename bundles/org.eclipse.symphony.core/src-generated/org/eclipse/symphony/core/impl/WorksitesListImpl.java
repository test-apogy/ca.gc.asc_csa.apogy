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
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.core.AbstractWorksite;
import org.eclipse.symphony.core.OrbitModelsList;
import org.eclipse.symphony.core.SymphonyCoreFactory;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.WorksitesList;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Worksites List</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.impl.WorksitesListImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.WorksitesListImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.WorksitesListImpl#getWorksites <em>Worksites</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.WorksitesListImpl#getOrbitsModels <em>Orbits Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorksitesListImpl extends MinimalEObjectImpl.Container implements
		WorksitesList {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorksites() <em>Worksites</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getWorksites()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractWorksite> worksites;

	/**
	 * The cached value of the '{@link #getOrbitsModels() <em>Orbits Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbitsModels()
	 * @generated
	 * @ordered
	 */
	protected OrbitModelsList orbitsModels;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected WorksitesListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyCorePackage.Literals.WORKSITES_LIST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.WORKSITES_LIST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.WORKSITES_LIST__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractWorksite> getWorksites() {
		if (worksites == null) {
			worksites = new EObjectContainmentWithInverseEList<AbstractWorksite>(AbstractWorksite.class, this, SymphonyCorePackage.WORKSITES_LIST__WORKSITES, SymphonyCorePackage.ABSTRACT_WORKSITE__WORKSITES_LIST);
		}
		return worksites;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public OrbitModelsList getOrbitsModels() 
	{
		OrbitModelsList tmp = getOrbitsModelsGen();
		if(tmp == null)
		{
			tmp = SymphonyCoreFactory.eINSTANCE.createOrbitModelsList();
			setOrbitsModels(tmp);
		}
		
		return tmp;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitModelsList getOrbitsModelsGen() {
		return orbitsModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrbitsModels(OrbitModelsList newOrbitsModels, NotificationChain msgs) {
		OrbitModelsList oldOrbitsModels = orbitsModels;
		orbitsModels = newOrbitsModels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.WORKSITES_LIST__ORBITS_MODELS, oldOrbitsModels, newOrbitsModels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrbitsModels(OrbitModelsList newOrbitsModels) {
		if (newOrbitsModels != orbitsModels) {
			NotificationChain msgs = null;
			if (orbitsModels != null)
				msgs = ((InternalEObject)orbitsModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyCorePackage.WORKSITES_LIST__ORBITS_MODELS, null, msgs);
			if (newOrbitsModels != null)
				msgs = ((InternalEObject)newOrbitsModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyCorePackage.WORKSITES_LIST__ORBITS_MODELS, null, msgs);
			msgs = basicSetOrbitsModels(newOrbitsModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.WORKSITES_LIST__ORBITS_MODELS, newOrbitsModels, newOrbitsModels));
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
			case SymphonyCorePackage.WORKSITES_LIST__WORKSITES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorksites()).basicAdd(otherEnd, msgs);
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
			case SymphonyCorePackage.WORKSITES_LIST__WORKSITES:
				return ((InternalEList<?>)getWorksites()).basicRemove(otherEnd, msgs);
			case SymphonyCorePackage.WORKSITES_LIST__ORBITS_MODELS:
				return basicSetOrbitsModels(null, msgs);
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
			case SymphonyCorePackage.WORKSITES_LIST__NAME:
				return getName();
			case SymphonyCorePackage.WORKSITES_LIST__DESCRIPTION:
				return getDescription();
			case SymphonyCorePackage.WORKSITES_LIST__WORKSITES:
				return getWorksites();
			case SymphonyCorePackage.WORKSITES_LIST__ORBITS_MODELS:
				return getOrbitsModels();
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
			case SymphonyCorePackage.WORKSITES_LIST__NAME:
				setName((String)newValue);
				return;
			case SymphonyCorePackage.WORKSITES_LIST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SymphonyCorePackage.WORKSITES_LIST__WORKSITES:
				getWorksites().clear();
				getWorksites().addAll((Collection<? extends AbstractWorksite>)newValue);
				return;
			case SymphonyCorePackage.WORKSITES_LIST__ORBITS_MODELS:
				setOrbitsModels((OrbitModelsList)newValue);
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
			case SymphonyCorePackage.WORKSITES_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SymphonyCorePackage.WORKSITES_LIST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SymphonyCorePackage.WORKSITES_LIST__WORKSITES:
				getWorksites().clear();
				return;
			case SymphonyCorePackage.WORKSITES_LIST__ORBITS_MODELS:
				setOrbitsModels((OrbitModelsList)null);
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
			case SymphonyCorePackage.WORKSITES_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SymphonyCorePackage.WORKSITES_LIST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SymphonyCorePackage.WORKSITES_LIST__WORKSITES:
				return worksites != null && !worksites.isEmpty();
			case SymphonyCorePackage.WORKSITES_LIST__ORBITS_MODELS:
				return orbitsModels != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case SymphonyCorePackage.WORKSITES_LIST__DESCRIPTION: return EMFEcorePackage.DESCRIBED__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case EMFEcorePackage.DESCRIBED__DESCRIPTION: return SymphonyCorePackage.WORKSITES_LIST__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} // WorksitesListImpl
