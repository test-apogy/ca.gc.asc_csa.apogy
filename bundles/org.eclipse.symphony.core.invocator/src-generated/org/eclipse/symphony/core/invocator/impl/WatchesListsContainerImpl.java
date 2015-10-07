/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.WatchesList;
import org.eclipse.symphony.core.invocator.WatchesListsContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Watches Lists Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.WatchesListsContainerImpl#getWatches <em>Watches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WatchesListsContainerImpl extends AbstractToolsListContainerImpl implements WatchesListsContainer
{
  /**
	 * The cached value of the '{@link #getWatches() <em>Watches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWatches()
	 * @generated
	 * @ordered
	 */
  protected EList<WatchesList> watches;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WatchesListsContainerImpl()
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
		return EMFEcoreInvocatorPackage.Literals.WATCHES_LISTS_CONTAINER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<WatchesList> getWatches()
  {
		if (watches == null) {
			watches = new EObjectContainmentWithInverseEList<WatchesList>(WatchesList.class, this, EMFEcoreInvocatorPackage.WATCHES_LISTS_CONTAINER__WATCHES, EMFEcoreInvocatorPackage.WATCHES_LIST__WATCHES_LISTS_CONTAINER);
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
			case EMFEcoreInvocatorPackage.WATCHES_LISTS_CONTAINER__WATCHES:
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
			case EMFEcoreInvocatorPackage.WATCHES_LISTS_CONTAINER__WATCHES:
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.WATCHES_LISTS_CONTAINER__WATCHES:
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
			case EMFEcoreInvocatorPackage.WATCHES_LISTS_CONTAINER__WATCHES:
				getWatches().clear();
				getWatches().addAll((Collection<? extends WatchesList>)newValue);
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
			case EMFEcoreInvocatorPackage.WATCHES_LISTS_CONTAINER__WATCHES:
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
			case EMFEcoreInvocatorPackage.WATCHES_LISTS_CONTAINER__WATCHES:
				return watches != null && !watches.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WatchesListsContainerImpl
