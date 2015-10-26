/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.core.invocator.AbstractToolsListContainer;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.ToolsList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Tools List Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.AbstractToolsListContainerImpl#getToolsList <em>Tools List</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractToolsListContainerImpl extends MinimalEObjectImpl.Container implements AbstractToolsListContainer
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AbstractToolsListContainerImpl()
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
		return EMFEcoreInvocatorPackage.Literals.ABSTRACT_TOOLS_LIST_CONTAINER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ToolsList getToolsList()
  {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST) return null;
		return (ToolsList)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ToolsList basicGetToolsList()
  {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST) return null;
		return (ToolsList)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetToolsList(ToolsList newToolsList, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newToolsList, EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setToolsList(ToolsList newToolsList)
  {
		if (newToolsList != eInternalContainer() || (eContainerFeatureID() != EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST && newToolsList != null)) {
			if (EcoreUtil.isAncestor(this, newToolsList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newToolsList != null)
				msgs = ((InternalEObject)newToolsList).eInverseAdd(this, EMFEcoreInvocatorPackage.TOOLS_LIST__TOOLS_LIST_CONTAINERS, ToolsList.class, msgs);
			msgs = basicSetToolsList(newToolsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST, newToolsList, newToolsList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetToolsList((ToolsList)otherEnd, msgs);
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
			case EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST:
				return basicSetToolsList(null, msgs);
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
			case EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST:
				return eInternalContainer().eInverseRemove(this, EMFEcoreInvocatorPackage.TOOLS_LIST__TOOLS_LIST_CONTAINERS, ToolsList.class, msgs);
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
			case EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST:
				if (resolve) return getToolsList();
				return basicGetToolsList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST:
				setToolsList((ToolsList)newValue);
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
			case EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST:
				setToolsList((ToolsList)null);
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
			case EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST:
				return basicGetToolsList() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractToolsListContainerImpl
