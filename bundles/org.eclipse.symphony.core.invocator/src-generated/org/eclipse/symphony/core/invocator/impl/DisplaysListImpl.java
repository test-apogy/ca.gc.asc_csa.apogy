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
import org.eclipse.symphony.core.invocator.AbstractDisplay;
import org.eclipse.symphony.core.invocator.DisplaysList;
import org.eclipse.symphony.core.invocator.DisplaysListsContainer;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Displays List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.DisplaysListImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.DisplaysListImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.DisplaysListImpl#getDisplaysListsContainer <em>Displays Lists Container</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.DisplaysListImpl#getDisplays <em>Displays</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisplaysListImpl extends MinimalEObjectImpl.Container implements DisplaysList
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
	 * The cached value of the '{@link #getDisplays() <em>Displays</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDisplays()
	 * @generated
	 * @ordered
	 */
  protected EList<AbstractDisplay> displays;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DisplaysListImpl()
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
		return EMFEcoreInvocatorPackage.Literals.DISPLAYS_LIST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.DISPLAYS_LIST__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.DISPLAYS_LIST__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DisplaysListsContainer getDisplaysListsContainer()
  {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS_LISTS_CONTAINER) return null;
		return (DisplaysListsContainer)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DisplaysListsContainer basicGetDisplaysListsContainer()
  {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS_LISTS_CONTAINER) return null;
		return (DisplaysListsContainer)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetDisplaysListsContainer(DisplaysListsContainer newDisplaysListsContainer, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newDisplaysListsContainer, EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS_LISTS_CONTAINER, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDisplaysListsContainer(DisplaysListsContainer newDisplaysListsContainer)
  {
		if (newDisplaysListsContainer != eInternalContainer() || (eContainerFeatureID() != EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS_LISTS_CONTAINER && newDisplaysListsContainer != null)) {
			if (EcoreUtil.isAncestor(this, newDisplaysListsContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDisplaysListsContainer != null)
				msgs = ((InternalEObject)newDisplaysListsContainer).eInverseAdd(this, EMFEcoreInvocatorPackage.DISPLAYS_LISTS_CONTAINER__DISPLAYS, DisplaysListsContainer.class, msgs);
			msgs = basicSetDisplaysListsContainer(newDisplaysListsContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS_LISTS_CONTAINER, newDisplaysListsContainer, newDisplaysListsContainer));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<AbstractDisplay> getDisplays()
  {
		if (displays == null) {
			displays = new EObjectContainmentWithInverseEList<AbstractDisplay>(AbstractDisplay.class, this, EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS, EMFEcoreInvocatorPackage.ABSTRACT_DISPLAY__DISPLAYS_LIST);
		}
		return displays;
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
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS_LISTS_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDisplaysListsContainer((DisplaysListsContainer)otherEnd, msgs);
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDisplays()).basicAdd(otherEnd, msgs);
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
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS_LISTS_CONTAINER:
				return basicSetDisplaysListsContainer(null, msgs);
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS:
				return ((InternalEList<?>)getDisplays()).basicRemove(otherEnd, msgs);
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
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS_LISTS_CONTAINER:
				return eInternalContainer().eInverseRemove(this, EMFEcoreInvocatorPackage.DISPLAYS_LISTS_CONTAINER__DISPLAYS, DisplaysListsContainer.class, msgs);
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
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__NAME:
				return getName();
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__DESCRIPTION:
				return getDescription();
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS_LISTS_CONTAINER:
				if (resolve) return getDisplaysListsContainer();
				return basicGetDisplaysListsContainer();
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS:
				return getDisplays();
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
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__NAME:
				setName((String)newValue);
				return;
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS_LISTS_CONTAINER:
				setDisplaysListsContainer((DisplaysListsContainer)newValue);
				return;
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS:
				getDisplays().clear();
				getDisplays().addAll((Collection<? extends AbstractDisplay>)newValue);
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
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS_LISTS_CONTAINER:
				setDisplaysListsContainer((DisplaysListsContainer)null);
				return;
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS:
				getDisplays().clear();
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
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS_LISTS_CONTAINER:
				return basicGetDisplaysListsContainer() != null;
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS:
				return displays != null && !displays.isEmpty();
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
				case EMFEcoreInvocatorPackage.DISPLAYS_LIST__DESCRIPTION: return EMFEcorePackage.DESCRIBED__DESCRIPTION;
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
				case EMFEcorePackage.DESCRIBED__DESCRIPTION: return EMFEcoreInvocatorPackage.DISPLAYS_LIST__DESCRIPTION;
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

} //DisplaysListImpl
