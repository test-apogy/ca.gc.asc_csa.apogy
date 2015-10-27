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
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.Watch;
import org.eclipse.symphony.core.invocator.WatchesList;
import org.eclipse.symphony.core.invocator.WatchesListsContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Watches List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.WatchesListImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.WatchesListImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.WatchesListImpl#getWatchesListsContainer <em>Watches Lists Container</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.WatchesListImpl#getWatches <em>Watches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WatchesListImpl extends MinimalEObjectImpl.Container implements WatchesList
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
	 * The cached value of the '{@link #getWatches() <em>Watches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWatches()
	 * @generated
	 * @ordered
	 */
  protected EList<Watch> watches;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WatchesListImpl()
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
		return Symphony__CoreInvocatorPackage.Literals.WATCHES_LIST;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.WATCHES_LIST__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDescription()
  {
		return description;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDescription(String newDescription)
  {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.WATCHES_LIST__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WatchesListsContainer getWatchesListsContainer()
  {
		if (eContainerFeatureID() != Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES_LISTS_CONTAINER) return null;
		return (WatchesListsContainer)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WatchesListsContainer basicGetWatchesListsContainer()
  {
		if (eContainerFeatureID() != Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES_LISTS_CONTAINER) return null;
		return (WatchesListsContainer)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetWatchesListsContainer(WatchesListsContainer newWatchesListsContainer, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newWatchesListsContainer, Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES_LISTS_CONTAINER, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWatchesListsContainer(WatchesListsContainer newWatchesListsContainer)
  {
		if (newWatchesListsContainer != eInternalContainer() || (eContainerFeatureID() != Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES_LISTS_CONTAINER && newWatchesListsContainer != null)) {
			if (EcoreUtil.isAncestor(this, newWatchesListsContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWatchesListsContainer != null)
				msgs = ((InternalEObject)newWatchesListsContainer).eInverseAdd(this, Symphony__CoreInvocatorPackage.WATCHES_LISTS_CONTAINER__WATCHES, WatchesListsContainer.class, msgs);
			msgs = basicSetWatchesListsContainer(newWatchesListsContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES_LISTS_CONTAINER, newWatchesListsContainer, newWatchesListsContainer));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Watch> getWatches()
  {
		if (watches == null) {
			watches = new EObjectContainmentWithInverseEList<Watch>(Watch.class, this, Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES, Symphony__CoreInvocatorPackage.WATCH__WATCHES_LIST);
		}
		return watches;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES_LISTS_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWatchesListsContainer((WatchesListsContainer)otherEnd, msgs);
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWatches()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES_LISTS_CONTAINER:
				return basicSetWatchesListsContainer(null, msgs);
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES:
				return ((InternalEList<?>)getWatches()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
		switch (eContainerFeatureID()) {
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES_LISTS_CONTAINER:
				return eInternalContainer().eInverseRemove(this, Symphony__CoreInvocatorPackage.WATCHES_LISTS_CONTAINER__WATCHES, WatchesListsContainer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__NAME:
				return getName();
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__DESCRIPTION:
				return getDescription();
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES_LISTS_CONTAINER:
				if (resolve) return getWatchesListsContainer();
				return basicGetWatchesListsContainer();
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES:
				return getWatches();
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__NAME:
				setName((String)newValue);
				return;
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES_LISTS_CONTAINER:
				setWatchesListsContainer((WatchesListsContainer)newValue);
				return;
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES:
				getWatches().clear();
				getWatches().addAll((Collection<? extends Watch>)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES_LISTS_CONTAINER:
				setWatchesListsContainer((WatchesListsContainer)null);
				return;
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES:
				getWatches().clear();
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES_LISTS_CONTAINER:
				return basicGetWatchesListsContainer() != null;
			case Symphony__CoreInvocatorPackage.WATCHES_LIST__WATCHES:
				return watches != null && !watches.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case Symphony__CoreInvocatorPackage.WATCHES_LIST__DESCRIPTION: return Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION;
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
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION: return Symphony__CoreInvocatorPackage.WATCHES_LIST__DESCRIPTION;
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
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //WatchesListImpl
