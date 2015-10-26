/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.bindings.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.bindings.EnumerationCase;
import org.eclipse.symphony.common.topology.bindings.TopologyBindingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.impl.EnumerationCaseImpl#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.impl.EnumerationCaseImpl#getTopologyRoot <em>Topology Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationCaseImpl extends MinimalEObjectImpl.Container implements EnumerationCase
{
  /**
	 * The cached value of the '{@link #getEnumerationLiterals() <em>Enumeration Literals</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEnumerationLiterals()
	 * @generated
	 * @ordered
	 */
  protected EList<EEnumLiteral> enumerationLiterals;

  /**
	 * The cached value of the '{@link #getTopologyRoot() <em>Topology Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTopologyRoot()
	 * @generated
	 * @ordered
	 */
  protected Node topologyRoot;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EnumerationCaseImpl()
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
		return TopologyBindingsPackage.Literals.ENUMERATION_CASE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<EEnumLiteral> getEnumerationLiterals()
  {
		if (enumerationLiterals == null) {
			enumerationLiterals = new EObjectResolvingEList<EEnumLiteral>(EEnumLiteral.class, this, TopologyBindingsPackage.ENUMERATION_CASE__ENUMERATION_LITERALS);
		}
		return enumerationLiterals;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Node getTopologyRoot()
  {
		return topologyRoot;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTopologyRoot(Node newTopologyRoot, NotificationChain msgs)
  {
		Node oldTopologyRoot = topologyRoot;
		topologyRoot = newTopologyRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT, oldTopologyRoot, newTopologyRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTopologyRoot(Node newTopologyRoot)
  {
		if (newTopologyRoot != topologyRoot) {
			NotificationChain msgs = null;
			if (topologyRoot != null)
				msgs = ((InternalEObject)topologyRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT, null, msgs);
			if (newTopologyRoot != null)
				msgs = ((InternalEObject)newTopologyRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT, null, msgs);
			msgs = basicSetTopologyRoot(newTopologyRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT, newTopologyRoot, newTopologyRoot));
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
			case TopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT:
				return basicSetTopologyRoot(null, msgs);
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
			case TopologyBindingsPackage.ENUMERATION_CASE__ENUMERATION_LITERALS:
				return getEnumerationLiterals();
			case TopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT:
				return getTopologyRoot();
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
			case TopologyBindingsPackage.ENUMERATION_CASE__ENUMERATION_LITERALS:
				getEnumerationLiterals().clear();
				getEnumerationLiterals().addAll((Collection<? extends EEnumLiteral>)newValue);
				return;
			case TopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT:
				setTopologyRoot((Node)newValue);
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
			case TopologyBindingsPackage.ENUMERATION_CASE__ENUMERATION_LITERALS:
				getEnumerationLiterals().clear();
				return;
			case TopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT:
				setTopologyRoot((Node)null);
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
			case TopologyBindingsPackage.ENUMERATION_CASE__ENUMERATION_LITERALS:
				return enumerationLiterals != null && !enumerationLiterals.isEmpty();
			case TopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT:
				return topologyRoot != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumerationCaseImpl
