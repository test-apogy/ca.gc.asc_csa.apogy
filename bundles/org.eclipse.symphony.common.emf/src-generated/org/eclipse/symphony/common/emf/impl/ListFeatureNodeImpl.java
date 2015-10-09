/**
 */
package org.eclipse.symphony.common.emf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.emf.AbstractFeatureSpecifier;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.ListFeatureNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Feature Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.ListFeatureNodeImpl#getStructuralFeature <em>Structural Feature</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.ListFeatureNodeImpl#isMultiValued <em>Multi Valued</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.ListFeatureNodeImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListFeatureNodeImpl extends AbstractFeatureListNodeImpl implements ListFeatureNode
{
  /**
	 * The cached value of the '{@link #getStructuralFeature() <em>Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStructuralFeature()
	 * @generated
	 * @ordered
	 */
  protected EStructuralFeature structuralFeature;

  /**
	 * The default value of the '{@link #isMultiValued() <em>Multi Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isMultiValued()
	 * @generated
	 * @ordered
	 */
  protected static final boolean MULTI_VALUED_EDEFAULT = false;

  /**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
  protected static final int INDEX_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
  protected int index = INDEX_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ListFeatureNodeImpl()
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
		return EMFEcorePackage.Literals.LIST_FEATURE_NODE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EStructuralFeature getStructuralFeature()
  {
		if (structuralFeature != null && structuralFeature.eIsProxy()) {
			InternalEObject oldStructuralFeature = (InternalEObject)structuralFeature;
			structuralFeature = (EStructuralFeature)eResolveProxy(oldStructuralFeature);
			if (structuralFeature != oldStructuralFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcorePackage.LIST_FEATURE_NODE__STRUCTURAL_FEATURE, oldStructuralFeature, structuralFeature));
			}
		}
		return structuralFeature;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EStructuralFeature basicGetStructuralFeature()
  {
		return structuralFeature;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setStructuralFeature(EStructuralFeature newStructuralFeature)
  {
		EStructuralFeature oldStructuralFeature = structuralFeature;
		structuralFeature = newStructuralFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcorePackage.LIST_FEATURE_NODE__STRUCTURAL_FEATURE, oldStructuralFeature, structuralFeature));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public boolean isMultiValued()
  {
	  if(getStructuralFeature() != null)
	  {
		  return getStructuralFeature().isMany();
	  }
	  else
	  {
		  return false;
	  }
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getIndex()
  {
		return index;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setIndex(int newIndex)
  {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcorePackage.LIST_FEATURE_NODE__INDEX, oldIndex, index));
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
			case EMFEcorePackage.LIST_FEATURE_NODE__STRUCTURAL_FEATURE:
				if (resolve) return getStructuralFeature();
				return basicGetStructuralFeature();
			case EMFEcorePackage.LIST_FEATURE_NODE__MULTI_VALUED:
				return isMultiValued();
			case EMFEcorePackage.LIST_FEATURE_NODE__INDEX:
				return getIndex();
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
			case EMFEcorePackage.LIST_FEATURE_NODE__STRUCTURAL_FEATURE:
				setStructuralFeature((EStructuralFeature)newValue);
				return;
			case EMFEcorePackage.LIST_FEATURE_NODE__INDEX:
				setIndex((Integer)newValue);
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
			case EMFEcorePackage.LIST_FEATURE_NODE__STRUCTURAL_FEATURE:
				setStructuralFeature((EStructuralFeature)null);
				return;
			case EMFEcorePackage.LIST_FEATURE_NODE__INDEX:
				setIndex(INDEX_EDEFAULT);
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
			case EMFEcorePackage.LIST_FEATURE_NODE__STRUCTURAL_FEATURE:
				return structuralFeature != null;
			case EMFEcorePackage.LIST_FEATURE_NODE__MULTI_VALUED:
				return isMultiValued() != MULTI_VALUED_EDEFAULT;
			case EMFEcorePackage.LIST_FEATURE_NODE__INDEX:
				return index != INDEX_EDEFAULT;
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
		if (baseClass == AbstractFeatureSpecifier.class) {
			switch (derivedFeatureID) {
				case EMFEcorePackage.LIST_FEATURE_NODE__STRUCTURAL_FEATURE: return EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__STRUCTURAL_FEATURE;
				case EMFEcorePackage.LIST_FEATURE_NODE__MULTI_VALUED: return EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__MULTI_VALUED;
				case EMFEcorePackage.LIST_FEATURE_NODE__INDEX: return EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__INDEX;
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
		if (baseClass == AbstractFeatureSpecifier.class) {
			switch (baseFeatureID) {
				case EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__STRUCTURAL_FEATURE: return EMFEcorePackage.LIST_FEATURE_NODE__STRUCTURAL_FEATURE;
				case EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__MULTI_VALUED: return EMFEcorePackage.LIST_FEATURE_NODE__MULTI_VALUED;
				case EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__INDEX: return EMFEcorePackage.LIST_FEATURE_NODE__INDEX;
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
		result.append(" (index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //ListFeatureNodeImpl
