/**
 */
package org.eclipse.symphony.common.emf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.emf.AbstractFeatureSpecifier;
import org.eclipse.symphony.common.emf.EMFEcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Feature Specifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.AbstractFeatureSpecifierImpl#getStructuralFeature <em>Structural Feature</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.AbstractFeatureSpecifierImpl#isMultiValued <em>Multi Valued</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.AbstractFeatureSpecifierImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractFeatureSpecifierImpl extends MinimalEObjectImpl.Container implements AbstractFeatureSpecifier
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
  protected AbstractFeatureSpecifierImpl()
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
		return EMFEcorePackage.Literals.ABSTRACT_FEATURE_SPECIFIER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__STRUCTURAL_FEATURE, oldStructuralFeature, structuralFeature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__STRUCTURAL_FEATURE, oldStructuralFeature, structuralFeature));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isMultiValued()
  {
		// TODO: implement this method to return the 'Multi Valued' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__INDEX, oldIndex, index));
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
			case EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__STRUCTURAL_FEATURE:
				if (resolve) return getStructuralFeature();
				return basicGetStructuralFeature();
			case EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__MULTI_VALUED:
				return isMultiValued();
			case EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__INDEX:
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
			case EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__STRUCTURAL_FEATURE:
				setStructuralFeature((EStructuralFeature)newValue);
				return;
			case EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__INDEX:
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
			case EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__STRUCTURAL_FEATURE:
				setStructuralFeature((EStructuralFeature)null);
				return;
			case EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__INDEX:
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
			case EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__STRUCTURAL_FEATURE:
				return structuralFeature != null;
			case EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__MULTI_VALUED:
				return isMultiValued() != MULTI_VALUED_EDEFAULT;
			case EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER__INDEX:
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
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //AbstractFeatureSpecifierImpl
