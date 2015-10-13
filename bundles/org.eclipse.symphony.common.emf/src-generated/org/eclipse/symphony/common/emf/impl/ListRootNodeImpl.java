/**
 */
package org.eclipse.symphony.common.emf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.emf.AbstractRootNode;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.ListRootNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Root Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.ListRootNodeImpl#getSourceClass <em>Source Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListRootNodeImpl extends AbstractFeatureListNodeImpl implements ListRootNode
{
  /**
	 * The cached value of the '{@link #getSourceClass() <em>Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSourceClass()
	 * @generated
	 * @ordered
	 */
  protected EClass sourceClass;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ListRootNodeImpl()
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
		return EMFEcorePackage.Literals.LIST_ROOT_NODE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSourceClass()
  {
		if (sourceClass != null && sourceClass.eIsProxy()) {
			InternalEObject oldSourceClass = (InternalEObject)sourceClass;
			sourceClass = (EClass)eResolveProxy(oldSourceClass);
			if (sourceClass != oldSourceClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcorePackage.LIST_ROOT_NODE__SOURCE_CLASS, oldSourceClass, sourceClass));
			}
		}
		return sourceClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass basicGetSourceClass()
  {
		return sourceClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSourceClass(EClass newSourceClass)
  {
		EClass oldSourceClass = sourceClass;
		sourceClass = newSourceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcorePackage.LIST_ROOT_NODE__SOURCE_CLASS, oldSourceClass, sourceClass));
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
			case EMFEcorePackage.LIST_ROOT_NODE__SOURCE_CLASS:
				if (resolve) return getSourceClass();
				return basicGetSourceClass();
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
			case EMFEcorePackage.LIST_ROOT_NODE__SOURCE_CLASS:
				setSourceClass((EClass)newValue);
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
			case EMFEcorePackage.LIST_ROOT_NODE__SOURCE_CLASS:
				setSourceClass((EClass)null);
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
			case EMFEcorePackage.LIST_ROOT_NODE__SOURCE_CLASS:
				return sourceClass != null;
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
		if (baseClass == AbstractRootNode.class) {
			switch (derivedFeatureID) {
				case EMFEcorePackage.LIST_ROOT_NODE__SOURCE_CLASS: return EMFEcorePackage.ABSTRACT_ROOT_NODE__SOURCE_CLASS;
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
		if (baseClass == AbstractRootNode.class) {
			switch (baseFeatureID) {
				case EMFEcorePackage.ABSTRACT_ROOT_NODE__SOURCE_CLASS: return EMFEcorePackage.LIST_ROOT_NODE__SOURCE_CLASS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ListRootNodeImpl