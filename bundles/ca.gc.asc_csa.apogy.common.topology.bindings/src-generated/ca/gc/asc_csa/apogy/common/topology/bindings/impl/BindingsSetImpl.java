package ca.gc.asc_csa.apogy.common.topology.bindings.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.BindingsList;
import ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet;
import ca.gc.asc_csa.apogy.common.topology.bindings.FeatureRootsList;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFactory;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bindings Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.BindingsSetImpl#getFeatureRootsList <em>Feature Roots List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.BindingsSetImpl#getBindingsList <em>Bindings List</em>}</li>
 * </ul>
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
		return ApogyCommonTopologyBindingsPackage.Literals.BINDINGS_SET;
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
		  tmp = ApogyCommonTopologyBindingsFactory.eINSTANCE.createFeatureRootsList();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.BINDINGS_SET__FEATURE_ROOTS_LIST, oldFeatureRootsList, newFeatureRootsList);
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
				msgs = ((InternalEObject)featureRootsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyBindingsPackage.BINDINGS_SET__FEATURE_ROOTS_LIST, null, msgs);
			if (newFeatureRootsList != null)
				msgs = ((InternalEObject)newFeatureRootsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyBindingsPackage.BINDINGS_SET__FEATURE_ROOTS_LIST, null, msgs);
			msgs = basicSetFeatureRootsList(newFeatureRootsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.BINDINGS_SET__FEATURE_ROOTS_LIST, newFeatureRootsList, newFeatureRootsList));
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
		  tmp = ApogyCommonTopologyBindingsFactory.eINSTANCE.createBindingsList();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.BINDINGS_SET__BINDINGS_LIST, oldBindingsList, newBindingsList);
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
				msgs = ((InternalEObject)bindingsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyBindingsPackage.BINDINGS_SET__BINDINGS_LIST, null, msgs);
			if (newBindingsList != null)
				msgs = ((InternalEObject)newBindingsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyBindingsPackage.BINDINGS_SET__BINDINGS_LIST, null, msgs);
			msgs = basicSetBindingsList(newBindingsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.BINDINGS_SET__BINDINGS_LIST, newBindingsList, newBindingsList));
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
			case ApogyCommonTopologyBindingsPackage.BINDINGS_SET__FEATURE_ROOTS_LIST:
				return basicSetFeatureRootsList(null, msgs);
			case ApogyCommonTopologyBindingsPackage.BINDINGS_SET__BINDINGS_LIST:
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
			case ApogyCommonTopologyBindingsPackage.BINDINGS_SET__FEATURE_ROOTS_LIST:
				return getFeatureRootsList();
			case ApogyCommonTopologyBindingsPackage.BINDINGS_SET__BINDINGS_LIST:
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
			case ApogyCommonTopologyBindingsPackage.BINDINGS_SET__FEATURE_ROOTS_LIST:
				setFeatureRootsList((FeatureRootsList)newValue);
				return;
			case ApogyCommonTopologyBindingsPackage.BINDINGS_SET__BINDINGS_LIST:
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
			case ApogyCommonTopologyBindingsPackage.BINDINGS_SET__FEATURE_ROOTS_LIST:
				setFeatureRootsList((FeatureRootsList)null);
				return;
			case ApogyCommonTopologyBindingsPackage.BINDINGS_SET__BINDINGS_LIST:
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
			case ApogyCommonTopologyBindingsPackage.BINDINGS_SET__FEATURE_ROOTS_LIST:
				return featureRootsList != null;
			case ApogyCommonTopologyBindingsPackage.BINDINGS_SET__BINDINGS_LIST:
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
			case ApogyCommonTopologyBindingsPackage.BINDINGS_SET___BIND:
				bind();
				return null;
			case ApogyCommonTopologyBindingsPackage.BINDINGS_SET___UNBIND:
				unbind();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BindingsSetImpl
