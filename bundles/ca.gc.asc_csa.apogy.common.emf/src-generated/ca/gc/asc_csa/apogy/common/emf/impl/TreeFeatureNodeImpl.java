/**
 */
package ca.gc.asc_csa.apogy.common.emf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureSpecifier;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.TreeFeatureNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree Feature Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.TreeFeatureNodeImpl#getStructuralFeature <em>Structural Feature</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.TreeFeatureNodeImpl#isMultiValued <em>Multi Valued</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.TreeFeatureNodeImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TreeFeatureNodeImpl extends AbstractFeatureTreeNodeImpl implements TreeFeatureNode
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
  protected TreeFeatureNodeImpl()
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
		return ApogyCommonEMFPackage.Literals.TREE_FEATURE_NODE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCommonEMFPackage.TREE_FEATURE_NODE__STRUCTURAL_FEATURE, oldStructuralFeature, structuralFeature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonEMFPackage.TREE_FEATURE_NODE__STRUCTURAL_FEATURE, oldStructuralFeature, structuralFeature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonEMFPackage.TREE_FEATURE_NODE__INDEX, oldIndex, index));
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
			case ApogyCommonEMFPackage.TREE_FEATURE_NODE__STRUCTURAL_FEATURE:
				if (resolve) return getStructuralFeature();
				return basicGetStructuralFeature();
			case ApogyCommonEMFPackage.TREE_FEATURE_NODE__MULTI_VALUED:
				return isMultiValued();
			case ApogyCommonEMFPackage.TREE_FEATURE_NODE__INDEX:
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
			case ApogyCommonEMFPackage.TREE_FEATURE_NODE__STRUCTURAL_FEATURE:
				setStructuralFeature((EStructuralFeature)newValue);
				return;
			case ApogyCommonEMFPackage.TREE_FEATURE_NODE__INDEX:
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
			case ApogyCommonEMFPackage.TREE_FEATURE_NODE__STRUCTURAL_FEATURE:
				setStructuralFeature((EStructuralFeature)null);
				return;
			case ApogyCommonEMFPackage.TREE_FEATURE_NODE__INDEX:
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
			case ApogyCommonEMFPackage.TREE_FEATURE_NODE__STRUCTURAL_FEATURE:
				return structuralFeature != null;
			case ApogyCommonEMFPackage.TREE_FEATURE_NODE__MULTI_VALUED:
				return isMultiValued() != MULTI_VALUED_EDEFAULT;
			case ApogyCommonEMFPackage.TREE_FEATURE_NODE__INDEX:
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
				case ApogyCommonEMFPackage.TREE_FEATURE_NODE__STRUCTURAL_FEATURE: return ApogyCommonEMFPackage.ABSTRACT_FEATURE_SPECIFIER__STRUCTURAL_FEATURE;
				case ApogyCommonEMFPackage.TREE_FEATURE_NODE__MULTI_VALUED: return ApogyCommonEMFPackage.ABSTRACT_FEATURE_SPECIFIER__MULTI_VALUED;
				case ApogyCommonEMFPackage.TREE_FEATURE_NODE__INDEX: return ApogyCommonEMFPackage.ABSTRACT_FEATURE_SPECIFIER__INDEX;
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
				case ApogyCommonEMFPackage.ABSTRACT_FEATURE_SPECIFIER__STRUCTURAL_FEATURE: return ApogyCommonEMFPackage.TREE_FEATURE_NODE__STRUCTURAL_FEATURE;
				case ApogyCommonEMFPackage.ABSTRACT_FEATURE_SPECIFIER__MULTI_VALUED: return ApogyCommonEMFPackage.TREE_FEATURE_NODE__MULTI_VALUED;
				case ApogyCommonEMFPackage.ABSTRACT_FEATURE_SPECIFIER__INDEX: return ApogyCommonEMFPackage.TREE_FEATURE_NODE__INDEX;
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

} //TreeFeatureNodeImpl
