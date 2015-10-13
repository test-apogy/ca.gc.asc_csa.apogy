/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

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
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.core.invocator.AbstractResult;
import org.eclipse.symphony.core.invocator.DataProductsList;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.RecordingResultsList;
import com.google.common.base.Objects;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recording Results List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.RecordingResultsListImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.RecordingResultsListImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.RecordingResultsListImpl#getResults <em>Results</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.RecordingResultsListImpl#getDataProductsList <em>Data Products List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.RecordingResultsListImpl#getInvocatorSession <em>Invocator Session</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordingResultsListImpl extends MinimalEObjectImpl.Container implements RecordingResultsList
{
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
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractResult> results;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RecordingResultsListImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return EMFEcoreInvocatorPackage.Literals.RECORDING_RESULTS_LIST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DESCRIPTION, oldDescription, description));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractResult> getResults() {
		if (results == null) {
			results = new EObjectContainmentWithInverseEList<AbstractResult>(AbstractResult.class, this, EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__RESULTS, EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST);
		}
		return results;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProductsList getDataProductsList() {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DATA_PRODUCTS_LIST) return null;
		return (DataProductsList)eContainer();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProductsList basicGetDataProductsList() {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DATA_PRODUCTS_LIST) return null;
		return (DataProductsList)eInternalContainer();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataProductsList(DataProductsList newDataProductsList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDataProductsList, EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DATA_PRODUCTS_LIST, msgs);
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataProductsList(DataProductsList newDataProductsList) {
		if (newDataProductsList != eInternalContainer() || (eContainerFeatureID() != EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DATA_PRODUCTS_LIST && newDataProductsList != null)) {
			if (EcoreUtil.isAncestor(this, newDataProductsList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataProductsList != null)
				msgs = ((InternalEObject)newDataProductsList).eInverseAdd(this, EMFEcoreInvocatorPackage.DATA_PRODUCTS_LIST__RECORDING_RESULTS_LIST, DataProductsList.class, msgs);
			msgs = basicSetDataProductsList(newDataProductsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DATA_PRODUCTS_LIST, newDataProductsList, newDataProductsList));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocatorSession getInvocatorSession() {
		DataProductsList _dataProductsList = this.getDataProductsList();
		boolean _equals = Objects.equal(_dataProductsList, null);
		if (_equals) {
			return null;
		}
		else {
			DataProductsList _dataProductsList_1 = this.getDataProductsList();
			return _dataProductsList_1.getInvocatorSession();
		}
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
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__RESULTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResults()).basicAdd(otherEnd, msgs);
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DATA_PRODUCTS_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataProductsList((DataProductsList)otherEnd, msgs);
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
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DATA_PRODUCTS_LIST:
				return basicSetDataProductsList(null, msgs);
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
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DATA_PRODUCTS_LIST:
				return eInternalContainer().eInverseRemove(this, EMFEcoreInvocatorPackage.DATA_PRODUCTS_LIST__RECORDING_RESULTS_LIST, DataProductsList.class, msgs);
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
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__NAME:
				return getName();
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DESCRIPTION:
				return getDescription();
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__RESULTS:
				return getResults();
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DATA_PRODUCTS_LIST:
				if (resolve) return getDataProductsList();
				return basicGetDataProductsList();
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__INVOCATOR_SESSION:
				return getInvocatorSession();
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
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__NAME:
				setName((String)newValue);
				return;
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends AbstractResult>)newValue);
				return;
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DATA_PRODUCTS_LIST:
				setDataProductsList((DataProductsList)newValue);
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
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__RESULTS:
				getResults().clear();
				return;
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DATA_PRODUCTS_LIST:
				setDataProductsList((DataProductsList)null);
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
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__RESULTS:
				return results != null && !results.isEmpty();
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DATA_PRODUCTS_LIST:
				return basicGetDataProductsList() != null;
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__INVOCATOR_SESSION:
				return getInvocatorSession() != null;
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
				case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DESCRIPTION: return EMFEcorePackage.DESCRIBED__DESCRIPTION;
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
				case EMFEcorePackage.DESCRIBED__DESCRIPTION: return EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST__DESCRIPTION;
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

} //RecordingResultsListImpl
