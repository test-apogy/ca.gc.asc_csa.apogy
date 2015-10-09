/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.bindings.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding;
import org.eclipse.symphony.common.topology.bindings.BindingsList;
import org.eclipse.symphony.common.topology.bindings.BindingsSet;
import org.eclipse.symphony.common.topology.bindings.FeatureRootsList;
import org.eclipse.symphony.common.topology.bindings.TopologyBindingsFactory;
import org.eclipse.symphony.common.topology.bindings.TopologyBindingsPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bindings Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.impl.BindingsSetImpl#getFeatureRootsList <em>Feature Roots List</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.impl.BindingsSetImpl#getBindingsList <em>Bindings List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingsSetImpl extends MinimalEObjectImpl.Container implements BindingsSet
{
  /**
	 * The cached value of the '{@link #getFeatureRootsList() <em>Feature Roots List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFeatureRootsList()
	 * @generated
	 * @ordered
	 */
  protected FeatureRootsList featureRootsList;
  /**
	 * The cached value of the '{@link #getBindingsList() <em>Bindings List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBindingsList()
	 * @generated
	 * @ordered
	 */
  protected BindingsList bindingsList;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected BindingsSetImpl()
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
		return TopologyBindingsPackage.Literals.BINDINGS_SET;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public FeatureRootsList getFeatureRootsList()
  {
	  FeatureRootsList tmp = getFeatureRootsListGen();	  
	  if(tmp == null)
	  {
		  tmp = TopologyBindingsFactory.eINSTANCE.createFeatureRootsList();
		  setFeatureRootsList(tmp);
	  }
	  return tmp;
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FeatureRootsList getFeatureRootsListGen()
  {
		return featureRootsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetFeatureRootsList(FeatureRootsList newFeatureRootsList, NotificationChain msgs)
  {
		FeatureRootsList oldFeatureRootsList = featureRootsList;
		featureRootsList = newFeatureRootsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyBindingsPackage.BINDINGS_SET__FEATURE_ROOTS_LIST, oldFeatureRootsList, newFeatureRootsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFeatureRootsList(FeatureRootsList newFeatureRootsList)
  {
		if (newFeatureRootsList != featureRootsList) {
			NotificationChain msgs = null;
			if (featureRootsList != null)
				msgs = ((InternalEObject)featureRootsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyBindingsPackage.BINDINGS_SET__FEATURE_ROOTS_LIST, null, msgs);
			if (newFeatureRootsList != null)
				msgs = ((InternalEObject)newFeatureRootsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyBindingsPackage.BINDINGS_SET__FEATURE_ROOTS_LIST, null, msgs);
			msgs = basicSetFeatureRootsList(newFeatureRootsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyBindingsPackage.BINDINGS_SET__FEATURE_ROOTS_LIST, newFeatureRootsList, newFeatureRootsList));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public BindingsList getBindingsList()
  {
	  BindingsList tmp = getBindingsListGen();
	  if(tmp == null)
	  {
		  tmp = TopologyBindingsFactory.eINSTANCE.createBindingsList();
		  setBindingsList(tmp);
	  }
			  
	  return tmp;
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BindingsList getBindingsListGen()
  {
		return bindingsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetBindingsList(BindingsList newBindingsList, NotificationChain msgs)
  {
		BindingsList oldBindingsList = bindingsList;
		bindingsList = newBindingsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyBindingsPackage.BINDINGS_SET__BINDINGS_LIST, oldBindingsList, newBindingsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setBindingsList(BindingsList newBindingsList)
  {
		if (newBindingsList != bindingsList) {
			NotificationChain msgs = null;
			if (bindingsList != null)
				msgs = ((InternalEObject)bindingsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyBindingsPackage.BINDINGS_SET__BINDINGS_LIST, null, msgs);
			if (newBindingsList != null)
				msgs = ((InternalEObject)newBindingsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyBindingsPackage.BINDINGS_SET__BINDINGS_LIST, null, msgs);
			msgs = basicSetBindingsList(newBindingsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyBindingsPackage.BINDINGS_SET__BINDINGS_LIST, newBindingsList, newBindingsList));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void bind()
  {
		for(AbstractTopologyBinding binding : getBindingsList().getBindings())
		{
			try
			{
				binding.bind();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void unbind()
  {
		for(AbstractTopologyBinding binding : getBindingsList().getBindings())
		{
			try
			{
				binding.unbind();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
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
			case TopologyBindingsPackage.BINDINGS_SET__FEATURE_ROOTS_LIST:
				return basicSetFeatureRootsList(null, msgs);
			case TopologyBindingsPackage.BINDINGS_SET__BINDINGS_LIST:
				return basicSetBindingsList(null, msgs);
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
			case TopologyBindingsPackage.BINDINGS_SET__FEATURE_ROOTS_LIST:
				return getFeatureRootsList();
			case TopologyBindingsPackage.BINDINGS_SET__BINDINGS_LIST:
				return getBindingsList();
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
			case TopologyBindingsPackage.BINDINGS_SET__FEATURE_ROOTS_LIST:
				setFeatureRootsList((FeatureRootsList)newValue);
				return;
			case TopologyBindingsPackage.BINDINGS_SET__BINDINGS_LIST:
				setBindingsList((BindingsList)newValue);
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
			case TopologyBindingsPackage.BINDINGS_SET__FEATURE_ROOTS_LIST:
				setFeatureRootsList((FeatureRootsList)null);
				return;
			case TopologyBindingsPackage.BINDINGS_SET__BINDINGS_LIST:
				setBindingsList((BindingsList)null);
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
			case TopologyBindingsPackage.BINDINGS_SET__FEATURE_ROOTS_LIST:
				return featureRootsList != null;
			case TopologyBindingsPackage.BINDINGS_SET__BINDINGS_LIST:
				return bindingsList != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case TopologyBindingsPackage.BINDINGS_SET___BIND:
				bind();
				return null;
			case TopologyBindingsPackage.BINDINGS_SET___UNBIND:
				unbind();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BindingsSetImpl