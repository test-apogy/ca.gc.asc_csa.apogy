/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;
import org.eclipse.symphony.core.environment.Worksite;
import org.eclipse.symphony.core.environment.WorksiteNode;

import ca.gc.space.topology.INodeVisitor;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.impl.NodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Worksite Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.WorksiteNodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.WorksiteNodeImpl#getWorksite <em>Worksite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorksiteNodeImpl extends NodeImpl implements WorksiteNode
{	
  /**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
  protected EList<Node> children;

  /**
	 * The cached value of the '{@link #getWorksite() <em>Worksite</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWorksite()
	 * @generated
	 * @ordered
	 */
  protected Worksite worksite;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WorksiteNodeImpl()
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
		return SymphonyEnvironmentPackage.Literals.WORKSITE_NODE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Node> getChildren()
  {
		if (children == null) {
			children = new EObjectContainmentEList<Node>(Node.class, this, SymphonyEnvironmentPackage.WORKSITE_NODE__CHILDREN);
		}
		return children;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Worksite getWorksite()
  {
		if (worksite != null && worksite.eIsProxy()) {
			InternalEObject oldWorksite = (InternalEObject)worksite;
			worksite = (Worksite)eResolveProxy(oldWorksite);
			if (worksite != oldWorksite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEnvironmentPackage.WORKSITE_NODE__WORKSITE, oldWorksite, worksite));
			}
		}
		return worksite;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Worksite basicGetWorksite()
  {
		return worksite;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWorksite(Worksite newWorksite)
  {
		Worksite oldWorksite = worksite;
		worksite = newWorksite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.WORKSITE_NODE__WORKSITE, oldWorksite, worksite));
	}
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWorksiteGen(Worksite newWorksite)
  {
		Worksite oldWorksite = worksite;
		worksite = newWorksite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.WORKSITE_NODE__WORKSITE, oldWorksite, worksite));
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
			case SymphonyEnvironmentPackage.WORKSITE_NODE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case SymphonyEnvironmentPackage.WORKSITE_NODE__CHILDREN:
				return getChildren();
			case SymphonyEnvironmentPackage.WORKSITE_NODE__WORKSITE:
				if (resolve) return getWorksite();
				return basicGetWorksite();
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
			case SymphonyEnvironmentPackage.WORKSITE_NODE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Node>)newValue);
				return;
			case SymphonyEnvironmentPackage.WORKSITE_NODE__WORKSITE:
				setWorksite((Worksite)newValue);
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
			case SymphonyEnvironmentPackage.WORKSITE_NODE__CHILDREN:
				getChildren().clear();
				return;
			case SymphonyEnvironmentPackage.WORKSITE_NODE__WORKSITE:
				setWorksite((Worksite)null);
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
			case SymphonyEnvironmentPackage.WORKSITE_NODE__CHILDREN:
				return children != null && !children.isEmpty();
			case SymphonyEnvironmentPackage.WORKSITE_NODE__WORKSITE:
				return worksite != null;
		}
		return super.eIsSet(featureID);
	}
  
  @Override
  public void accept(INodeVisitor visitor) 
  {
		if (visitor.getType().isInstance(this)) {
			visitor.visit(this);
		}

		// We do the same for all the children.
		for (Node child : getChildren()) {
			child.accept(visitor);
		}
  }
} //WorksiteNodeImpl
