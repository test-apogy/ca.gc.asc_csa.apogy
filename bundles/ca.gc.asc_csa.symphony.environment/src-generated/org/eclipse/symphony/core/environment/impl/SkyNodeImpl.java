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
import org.eclipse.symphony.core.environment.Sky;
import org.eclipse.symphony.core.environment.SkyNode;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

import ca.gc.space.topology.INodeVisitor;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.impl.NodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sky Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.SkyNodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.SkyNodeImpl#getSky <em>Sky</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SkyNodeImpl extends NodeImpl implements SkyNode
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
	 * The cached value of the '{@link #getSky() <em>Sky</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSky()
	 * @generated
	 * @ordered
	 */
  protected Sky sky;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SkyNodeImpl()
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
		return SymphonyEnvironmentPackage.Literals.SKY_NODE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Node> getChildren()
  {
		if (children == null) {
			children = new EObjectContainmentEList<Node>(Node.class, this, SymphonyEnvironmentPackage.SKY_NODE__CHILDREN);
		}
		return children;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Sky getSky()
  {
		if (sky != null && sky.eIsProxy()) {
			InternalEObject oldSky = (InternalEObject)sky;
			sky = (Sky)eResolveProxy(oldSky);
			if (sky != oldSky) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEnvironmentPackage.SKY_NODE__SKY, oldSky, sky));
			}
		}
		return sky;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Sky basicGetSky()
  {
		return sky;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSky(Sky newSky)
  {
		Sky oldSky = sky;
		sky = newSky;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.SKY_NODE__SKY, oldSky, sky));
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
			case SymphonyEnvironmentPackage.SKY_NODE__CHILDREN:
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
			case SymphonyEnvironmentPackage.SKY_NODE__CHILDREN:
				return getChildren();
			case SymphonyEnvironmentPackage.SKY_NODE__SKY:
				if (resolve) return getSky();
				return basicGetSky();
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
			case SymphonyEnvironmentPackage.SKY_NODE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Node>)newValue);
				return;
			case SymphonyEnvironmentPackage.SKY_NODE__SKY:
				setSky((Sky)newValue);
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
			case SymphonyEnvironmentPackage.SKY_NODE__CHILDREN:
				getChildren().clear();
				return;
			case SymphonyEnvironmentPackage.SKY_NODE__SKY:
				setSky((Sky)null);
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
			case SymphonyEnvironmentPackage.SKY_NODE__CHILDREN:
				return children != null && !children.isEmpty();
			case SymphonyEnvironmentPackage.SKY_NODE__SKY:
				return sky != null;
		}
		return super.eIsSet(featureID);
	}
  
  @Override
  public void accept(INodeVisitor visitor) 
  {
	  if (visitor.getType().isInstance(this)) 
	  {
			visitor.visit(this);
	  }

	  // We do the same for all the children.
	  for (Node child : getChildren()) 
	  {
			child.accept(visitor);
	  }
  }

} //SkyNodeImpl
