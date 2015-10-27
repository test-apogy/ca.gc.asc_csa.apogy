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
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFactory;
import org.eclipse.symphony.core.invocator.LocalTypesList;
import org.eclipse.symphony.core.invocator.RegisteredTypesList;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.TypesList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Types List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.TypesListImpl#getLocalTypes <em>Local Types</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.TypesListImpl#getRegisteredTypes <em>Registered Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypesListImpl extends MinimalEObjectImpl.Container implements TypesList
{
  /**
	 * The cached value of the '{@link #getLocalTypes() <em>Local Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLocalTypes()
	 * @generated
	 * @ordered
	 */
  protected LocalTypesList localTypes;
  /**
	 * The cached value of the '{@link #getRegisteredTypes() <em>Registered Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRegisteredTypes()
	 * @generated
	 * @ordered
	 */
  protected RegisteredTypesList registeredTypes;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TypesListImpl()
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
		return Symphony__CoreInvocatorPackage.Literals.TYPES_LIST;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LocalTypesList getLocalTypesGen()
  {
		return localTypes;
	}

  public LocalTypesList getLocalTypes()
  {
	  LocalTypesList list = getLocalTypesGen();
	  if (list == null){
		  list = Symphony__CoreInvocatorFactory.eINSTANCE.createLocalTypesList();
		  setLocalTypes(list);
	  }
	  return localTypes;
  }
    
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetLocalTypes(LocalTypesList newLocalTypes, NotificationChain msgs)
  {
		LocalTypesList oldLocalTypes = localTypes;
		localTypes = newLocalTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.TYPES_LIST__LOCAL_TYPES, oldLocalTypes, newLocalTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLocalTypes(LocalTypesList newLocalTypes)
  {
		if (newLocalTypes != localTypes) {
			NotificationChain msgs = null;
			if (localTypes != null)
				msgs = ((InternalEObject)localTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreInvocatorPackage.TYPES_LIST__LOCAL_TYPES, null, msgs);
			if (newLocalTypes != null)
				msgs = ((InternalEObject)newLocalTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreInvocatorPackage.TYPES_LIST__LOCAL_TYPES, null, msgs);
			msgs = basicSetLocalTypes(newLocalTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.TYPES_LIST__LOCAL_TYPES, newLocalTypes, newLocalTypes));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RegisteredTypesList getRegisteredTypesGen()
  {
		return registeredTypes;
	}

  public RegisteredTypesList getRegisteredTypes()
  {
	  RegisteredTypesList list = getRegisteredTypesGen();
	  if (list == null){
		  list = Symphony__CoreInvocatorFactory.eINSTANCE.createRegisteredTypesList();
		  setRegisteredTypes(list);
	  }	  
	  return registeredTypes;
  }


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetRegisteredTypes(RegisteredTypesList newRegisteredTypes, NotificationChain msgs)
  {
		RegisteredTypesList oldRegisteredTypes = registeredTypes;
		registeredTypes = newRegisteredTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.TYPES_LIST__REGISTERED_TYPES, oldRegisteredTypes, newRegisteredTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRegisteredTypes(RegisteredTypesList newRegisteredTypes)
  {
		if (newRegisteredTypes != registeredTypes) {
			NotificationChain msgs = null;
			if (registeredTypes != null)
				msgs = ((InternalEObject)registeredTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreInvocatorPackage.TYPES_LIST__REGISTERED_TYPES, null, msgs);
			if (newRegisteredTypes != null)
				msgs = ((InternalEObject)newRegisteredTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreInvocatorPackage.TYPES_LIST__REGISTERED_TYPES, null, msgs);
			msgs = basicSetRegisteredTypes(newRegisteredTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.TYPES_LIST__REGISTERED_TYPES, newRegisteredTypes, newRegisteredTypes));
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
			case Symphony__CoreInvocatorPackage.TYPES_LIST__LOCAL_TYPES:
				return basicSetLocalTypes(null, msgs);
			case Symphony__CoreInvocatorPackage.TYPES_LIST__REGISTERED_TYPES:
				return basicSetRegisteredTypes(null, msgs);
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
			case Symphony__CoreInvocatorPackage.TYPES_LIST__LOCAL_TYPES:
				return getLocalTypes();
			case Symphony__CoreInvocatorPackage.TYPES_LIST__REGISTERED_TYPES:
				return getRegisteredTypes();
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
			case Symphony__CoreInvocatorPackage.TYPES_LIST__LOCAL_TYPES:
				setLocalTypes((LocalTypesList)newValue);
				return;
			case Symphony__CoreInvocatorPackage.TYPES_LIST__REGISTERED_TYPES:
				setRegisteredTypes((RegisteredTypesList)newValue);
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
			case Symphony__CoreInvocatorPackage.TYPES_LIST__LOCAL_TYPES:
				setLocalTypes((LocalTypesList)null);
				return;
			case Symphony__CoreInvocatorPackage.TYPES_LIST__REGISTERED_TYPES:
				setRegisteredTypes((RegisteredTypesList)null);
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
			case Symphony__CoreInvocatorPackage.TYPES_LIST__LOCAL_TYPES:
				return localTypes != null;
			case Symphony__CoreInvocatorPackage.TYPES_LIST__REGISTERED_TYPES:
				return registeredTypes != null;
		}
		return super.eIsSet(featureID);
	}

} //TypesListImpl
