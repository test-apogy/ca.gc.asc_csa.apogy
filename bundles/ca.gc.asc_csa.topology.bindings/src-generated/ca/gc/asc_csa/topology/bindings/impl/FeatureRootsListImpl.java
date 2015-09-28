/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.topology.bindings.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.gc.asc_csa.eclipse.emf.ecore.TreeRootNode;
import ca.gc.asc_csa.topology.bindings.FeatureRootsList;
import ca.gc.asc_csa.topology.bindings.TopologyBindingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Roots List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.topology.bindings.impl.FeatureRootsListImpl#getFeatureRoots <em>Feature Roots</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureRootsListImpl extends MinimalEObjectImpl.Container implements FeatureRootsList
{
  /**
	 * The cached value of the '{@link #getFeatureRoots() <em>Feature Roots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFeatureRoots()
	 * @generated
	 * @ordered
	 */
  protected EList<TreeRootNode> featureRoots;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected FeatureRootsListImpl()
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
		return TopologyBindingsPackage.Literals.FEATURE_ROOTS_LIST;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<TreeRootNode> getFeatureRoots()
  {
		if (featureRoots == null) {
			featureRoots = new EObjectContainmentEList<TreeRootNode>(TreeRootNode.class, this, TopologyBindingsPackage.FEATURE_ROOTS_LIST__FEATURE_ROOTS);
		}
		return featureRoots;
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
			case TopologyBindingsPackage.FEATURE_ROOTS_LIST__FEATURE_ROOTS:
				return ((InternalEList<?>)getFeatureRoots()).basicRemove(otherEnd, msgs);
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
			case TopologyBindingsPackage.FEATURE_ROOTS_LIST__FEATURE_ROOTS:
				return getFeatureRoots();
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
			case TopologyBindingsPackage.FEATURE_ROOTS_LIST__FEATURE_ROOTS:
				getFeatureRoots().clear();
				getFeatureRoots().addAll((Collection<? extends TreeRootNode>)newValue);
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
			case TopologyBindingsPackage.FEATURE_ROOTS_LIST__FEATURE_ROOTS:
				getFeatureRoots().clear();
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
			case TopologyBindingsPackage.FEATURE_ROOTS_LIST__FEATURE_ROOTS:
				return featureRoots != null && !featureRoots.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureRootsListImpl
