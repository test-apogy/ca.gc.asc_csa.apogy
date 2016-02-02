package ca.gc.asc_csa.apogy.core.programs.controllers.impl;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.io.jinput.Activator;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponent;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier;
import ca.gc.asc_csa.apogy.common.io.jinput.EControllerEnvironment;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputFactory;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.ControllerTriggerImpl#getComponentQualifier <em>Component Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ControllerTriggerImpl extends TriggerImpl implements ControllerTrigger
{
  // Variable used for Controller event detection.
  private float previousValue = 0.0f;
  private Adapter eControllerEnvAdapter = null;
  private Adapter adapter = null;
	
  /**
	 * The cached value of the '{@link #getComponentQualifier() <em>Component Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getComponentQualifier()
	 * @generated
	 * @ordered
	 */
  protected EComponentQualifier componentQualifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected ControllerTriggerImpl()
  {
    super();
    this.eAdapters().add(getAdapter());
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_TRIGGER;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EComponentQualifier getComponentQualifier()
  {
	  EComponentQualifier eComponentQualifier  = getComponentQualifierGen();
	  
	  if(eComponentQualifier == null)
	  {
		  eComponentQualifier = ApogyCommonIOJInputFactory.eINSTANCE.createEComponentQualifier();
		  setComponentQualifier(eComponentQualifier);
	  }
	  
	  return eComponentQualifier;
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EComponentQualifier getComponentQualifierGen()
  {
		return componentQualifier;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetComponentQualifier(EComponentQualifier newComponentQualifier, NotificationChain msgs)
  {
		EComponentQualifier oldComponentQualifier = componentQualifier;
		componentQualifier = newComponentQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.CONTROLLER_TRIGGER__COMPONENT_QUALIFIER, oldComponentQualifier, newComponentQualifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setComponentQualifier(EComponentQualifier newComponentQualifier)
  {
	  // Remove or add the EControllerEnvAdapter used to listen for controller changes.
	  if(newComponentQualifier != null)
	  {
		  Activator.getEControllerEnvironment().eAdapters().add(getEControllerEnvAdapter());
	  }
	  else
	  {
		  Activator.getEControllerEnvironment().eAdapters().remove(getEControllerEnvAdapter());
	  }	 
	  	  
	  setComponentQualifierGen(newComponentQualifier);
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setComponentQualifierGen(EComponentQualifier newComponentQualifier)
  {
		if (newComponentQualifier != componentQualifier) {
			NotificationChain msgs = null;
			if (componentQualifier != null)
				msgs = ((InternalEObject)componentQualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreProgramsControllersPackage.CONTROLLER_TRIGGER__COMPONENT_QUALIFIER, null, msgs);
			if (newComponentQualifier != null)
				msgs = ((InternalEObject)newComponentQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreProgramsControllersPackage.CONTROLLER_TRIGGER__COMPONENT_QUALIFIER, null, msgs);
			msgs = basicSetComponentQualifier(newComponentQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.CONTROLLER_TRIGGER__COMPONENT_QUALIFIER, newComponentQualifier, newComponentQualifier));
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
			case ApogyCoreProgramsControllersPackage.CONTROLLER_TRIGGER__COMPONENT_QUALIFIER:
				return basicSetComponentQualifier(null, msgs);
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
			case ApogyCoreProgramsControllersPackage.CONTROLLER_TRIGGER__COMPONENT_QUALIFIER:
				return getComponentQualifier();
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
			case ApogyCoreProgramsControllersPackage.CONTROLLER_TRIGGER__COMPONENT_QUALIFIER:
				setComponentQualifier((EComponentQualifier)newValue);
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
			case ApogyCoreProgramsControllersPackage.CONTROLLER_TRIGGER__COMPONENT_QUALIFIER:
				setComponentQualifier((EComponentQualifier)null);
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
			case ApogyCoreProgramsControllersPackage.CONTROLLER_TRIGGER__COMPONENT_QUALIFIER:
				return componentQualifier != null;
		}
		return super.eIsSet(featureID);
	}
  
  /**
   * Method that is called when a change on the Controller component is detected.
   * @param oldValue The previous value of the Button.
   * @param newValue The current value of the Button.
   */
  abstract protected void update(boolean oldValue, boolean newValue ); 
  
  private Adapter getEControllerEnvAdapter()
  {	  
	  if(eControllerEnvAdapter == null)
	  {
		  eControllerEnvAdapter = new AdapterImpl()
		  {
			@Override
			public void notifyChanged(Notification notification) 
			{
				if(notification.getFeatureID(EControllerEnvironment.class) == ApogyCommonIOJInputPackage.ECONTROLLER_ENVIRONMENT__POLLING_COUNT)					
				{
					EComponent component = Activator.getEControllerEnvironment().resolveEComponent(getComponentQualifier());
					if(component != null)
					{
						boolean oldValue = convert(previousValue);
						float pollData = component.getPollData();
						boolean newValue = convert(pollData);
											
						if(newValue != oldValue)
						{							
							update(oldValue, newValue);							
							previousValue = pollData;
						}	
					}
				}
				
				super.notifyChanged(notification);
			}  
		  };
	  }
	  
	  return eControllerEnvAdapter;
  }
  
  private Adapter getAdapter()
  {	  	  
	  if(adapter == null)
	  {		 
		  adapter = new AdapterImpl()
		  {			  					  			  
			@Override
			public void notifyChanged(Notification notification) 
			{
				if(notification.getFeatureID(ControllerTrigger.class) == ApogyCoreProgramsControllersPackage.CONTROLLER_EDGE_TRIGGER__OPERATION_CALL_CONTROLLER_BINDING)					
				{
					if(notification.getNewValue() == null)
					{
						// Remove listener from EControllerEnvironment.						
						Activator.getEControllerEnvironment().eAdapters().remove(getEControllerEnvAdapter());
					}
				}				
								
				super.notifyChanged(notification);
			}			
		  };
	  }
	  
	  return adapter;
  }
  
  protected boolean convert(float value)
  {
	  if(value == 0)
	  {
		  return false;
	  }
	  else
	  {
		  return true;
	  }
  }
} //ControllerTriggerImpl
