/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.impl;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.Described;

import ca.gc.asc_csa.apogy.core.AbstractWorksite;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.OrbitModelsList;
import ca.gc.asc_csa.apogy.core.SurfaceLocationsList;
import ca.gc.asc_csa.apogy.core.WorksitesList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Worksites List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.WorksitesListImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.WorksitesListImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.WorksitesListImpl#getWorksites <em>Worksites</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.WorksitesListImpl#getOrbitsModelsLists <em>Orbits Models Lists</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.WorksitesListImpl#getSurfaceLocationsLists <em>Surface Locations Lists</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorksitesListImpl extends MinimalEObjectImpl.Container implements WorksitesList {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorksites() <em>Worksites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorksites()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractWorksite> worksites;

	/**
	 * The cached value of the '{@link #getOrbitsModelsLists() <em>Orbits Models Lists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbitsModelsLists()
	 * @generated
	 * @ordered
	 */
	protected EList<OrbitModelsList> orbitsModelsLists;

	/**
	 * The cached value of the '{@link #getSurfaceLocationsLists() <em>Surface Locations Lists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceLocationsLists()
	 * @generated
	 * @ordered
	 */
	protected EList<SurfaceLocationsList> surfaceLocationsLists;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorksitesListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCorePackage.Literals.WORKSITES_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.WORKSITES_LIST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.WORKSITES_LIST__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractWorksite> getWorksites() {
		if (worksites == null) {
			worksites = new EObjectContainmentWithInverseEList<AbstractWorksite>(AbstractWorksite.class, this, ApogyCorePackage.WORKSITES_LIST__WORKSITES, ApogyCorePackage.ABSTRACT_WORKSITE__WORKSITES_LIST);
		}
		return worksites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrbitModelsList> getOrbitsModelsLists() {
		if (orbitsModelsLists == null) {
			orbitsModelsLists = new EObjectContainmentEList<OrbitModelsList>(OrbitModelsList.class, this, ApogyCorePackage.WORKSITES_LIST__ORBITS_MODELS_LISTS);
		}
		return orbitsModelsLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SurfaceLocationsList> getSurfaceLocationsLists() {
		if (surfaceLocationsLists == null) {
			surfaceLocationsLists = new EObjectContainmentEList<SurfaceLocationsList>(SurfaceLocationsList.class, this, ApogyCorePackage.WORKSITES_LIST__SURFACE_LOCATIONS_LISTS);
		}
		return surfaceLocationsLists;
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
			case ApogyCorePackage.WORKSITES_LIST__WORKSITES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorksites()).basicAdd(otherEnd, msgs);
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
			case ApogyCorePackage.WORKSITES_LIST__WORKSITES:
				return ((InternalEList<?>)getWorksites()).basicRemove(otherEnd, msgs);
			case ApogyCorePackage.WORKSITES_LIST__ORBITS_MODELS_LISTS:
				return ((InternalEList<?>)getOrbitsModelsLists()).basicRemove(otherEnd, msgs);
			case ApogyCorePackage.WORKSITES_LIST__SURFACE_LOCATIONS_LISTS:
				return ((InternalEList<?>)getSurfaceLocationsLists()).basicRemove(otherEnd, msgs);
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
			case ApogyCorePackage.WORKSITES_LIST__NAME:
				return getName();
			case ApogyCorePackage.WORKSITES_LIST__DESCRIPTION:
				return getDescription();
			case ApogyCorePackage.WORKSITES_LIST__WORKSITES:
				return getWorksites();
			case ApogyCorePackage.WORKSITES_LIST__ORBITS_MODELS_LISTS:
				return getOrbitsModelsLists();
			case ApogyCorePackage.WORKSITES_LIST__SURFACE_LOCATIONS_LISTS:
				return getSurfaceLocationsLists();
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
			case ApogyCorePackage.WORKSITES_LIST__NAME:
				setName((String)newValue);
				return;
			case ApogyCorePackage.WORKSITES_LIST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApogyCorePackage.WORKSITES_LIST__WORKSITES:
				getWorksites().clear();
				getWorksites().addAll((Collection<? extends AbstractWorksite>)newValue);
				return;
			case ApogyCorePackage.WORKSITES_LIST__ORBITS_MODELS_LISTS:
				getOrbitsModelsLists().clear();
				getOrbitsModelsLists().addAll((Collection<? extends OrbitModelsList>)newValue);
				return;
			case ApogyCorePackage.WORKSITES_LIST__SURFACE_LOCATIONS_LISTS:
				getSurfaceLocationsLists().clear();
				getSurfaceLocationsLists().addAll((Collection<? extends SurfaceLocationsList>)newValue);
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
			case ApogyCorePackage.WORKSITES_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCorePackage.WORKSITES_LIST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApogyCorePackage.WORKSITES_LIST__WORKSITES:
				getWorksites().clear();
				return;
			case ApogyCorePackage.WORKSITES_LIST__ORBITS_MODELS_LISTS:
				getOrbitsModelsLists().clear();
				return;
			case ApogyCorePackage.WORKSITES_LIST__SURFACE_LOCATIONS_LISTS:
				getSurfaceLocationsLists().clear();
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
			case ApogyCorePackage.WORKSITES_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCorePackage.WORKSITES_LIST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApogyCorePackage.WORKSITES_LIST__WORKSITES:
				return worksites != null && !worksites.isEmpty();
			case ApogyCorePackage.WORKSITES_LIST__ORBITS_MODELS_LISTS:
				return orbitsModelsLists != null && !orbitsModelsLists.isEmpty();
			case ApogyCorePackage.WORKSITES_LIST__SURFACE_LOCATIONS_LISTS:
				return surfaceLocationsLists != null && !surfaceLocationsLists.isEmpty();
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
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case ApogyCorePackage.WORKSITES_LIST__DESCRIPTION: return ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION;
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
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION: return ApogyCorePackage.WORKSITES_LIST__DESCRIPTION;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //WorksitesListImpl
