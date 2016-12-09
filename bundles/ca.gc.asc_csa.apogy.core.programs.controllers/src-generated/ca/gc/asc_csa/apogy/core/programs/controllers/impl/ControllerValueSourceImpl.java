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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponent;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier;
import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputFactory;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.programs.controllers.AbstractInputConditioning;
import ca.gc.asc_csa.apogy.core.programs.controllers.Activator;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFacade;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerValueSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Value Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.ControllerValueSourceImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.ControllerValueSourceImpl#getEComponentQualifier <em>EComponent Qualifier</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.ControllerValueSourceImpl#getConditioning <em>Conditioning</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.ControllerValueSourceImpl#getLastValue <em>Last Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerValueSourceImpl extends ValueSourceImpl implements ControllerValueSource
{
  /**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
  protected EComponent component;

  /**
	 * The cached value of the '{@link #getEComponentQualifier() <em>EComponent Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEComponentQualifier()
	 * @generated
	 * @ordered
	 */
  protected EComponentQualifier eComponentQualifier;

  /**
	 * The cached value of the '{@link #getConditioning() <em>Conditioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getConditioning()
	 * @generated
	 * @ordered
	 */
  protected AbstractInputConditioning conditioning;

  /**
	 * The default value of the '{@link #getLastValue() <em>Last Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLastValue()
	 * @generated
	 * @ordered
	 */
  protected static final Object LAST_VALUE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getLastValue() <em>Last Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLastValue()
	 * @generated
	 * @ordered
	 */
  protected Object lastValue = LAST_VALUE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ControllerValueSourceImpl()
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
		return ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EComponent getComponent()
  {
	  if(getEComponentQualifier() != null)
	  {  
		  return ca.gc.asc_csa.apogy.common.io.jinput.Activator.getEControllerEnvironment().resolveEComponent(getEComponentQualifier());
	  }
	  else
	  {
		  return null;
	  }
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EComponent basicGetComponent()
  {
		return component;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setComponent(EComponent newComponent)
  {
		EComponent oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__COMPONENT, oldComponent, component));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EComponentQualifier getEComponentQualifier()
  {
	  EComponentQualifier componentQualifier = getEComponentQualifierGen();
	  
	  if(componentQualifier == null)
	  {
		  componentQualifier = ApogyCommonIOJInputFactory.eINSTANCE.createEComponentQualifier();
		  ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(this, ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER, componentQualifier);
	  }
	  return componentQualifier;
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EComponentQualifier getEComponentQualifierGen()
  {
		return eComponentQualifier;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetEComponentQualifier(EComponentQualifier newEComponentQualifier, NotificationChain msgs)
  {
		EComponentQualifier oldEComponentQualifier = eComponentQualifier;
		eComponentQualifier = newEComponentQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER, oldEComponentQualifier, newEComponentQualifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setEComponentQualifier(EComponentQualifier newEComponentQualifier)
  {
		if (newEComponentQualifier != eComponentQualifier) {
			NotificationChain msgs = null;
			if (eComponentQualifier != null)
				msgs = ((InternalEObject)eComponentQualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER, null, msgs);
			if (newEComponentQualifier != null)
				msgs = ((InternalEObject)newEComponentQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER, null, msgs);
			msgs = basicSetEComponentQualifier(newEComponentQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER, newEComponentQualifier, newEComponentQualifier));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractInputConditioning getConditioning()
  {
		return conditioning;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditioning(AbstractInputConditioning newConditioning, NotificationChain msgs) {
		AbstractInputConditioning oldConditioning = conditioning;
		conditioning = newConditioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING, oldConditioning, newConditioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditioning(AbstractInputConditioning newConditioning) {
		if (newConditioning != conditioning) {
			NotificationChain msgs = null;
			if (conditioning != null)
				msgs = ((InternalEObject)conditioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING, null, msgs);
			if (newConditioning != null)
				msgs = ((InternalEObject)newConditioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING, null, msgs);
			msgs = basicSetConditioning(newConditioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING, newConditioning, newConditioning));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Object getLastValue()
  {
		return lastValue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLastValue(Object newLastValue)
  {
		Object oldLastValue = lastValue;
		lastValue = newLastValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__LAST_VALUE, oldLastValue, lastValue));
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
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER:
				return basicSetEComponentQualifier(null, msgs);
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING:
				return basicSetConditioning(null, msgs);
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
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER:
				return getEComponentQualifier();
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING:
				return getConditioning();
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__LAST_VALUE:
				return getLastValue();
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
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__COMPONENT:
				setComponent((EComponent)newValue);
				return;
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER:
				setEComponentQualifier((EComponentQualifier)newValue);
				return;
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING:
				setConditioning((AbstractInputConditioning)newValue);
				return;
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__LAST_VALUE:
				setLastValue(newValue);
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
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__COMPONENT:
				setComponent((EComponent)null);
				return;
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER:
				setEComponentQualifier((EComponentQualifier)null);
				return;
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING:
				setConditioning((AbstractInputConditioning)null);
				return;
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__LAST_VALUE:
				setLastValue(LAST_VALUE_EDEFAULT);
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
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__COMPONENT:
				return component != null;
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER:
				return eComponentQualifier != null;
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING:
				return conditioning != null;
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE__LAST_VALUE:
				return LAST_VALUE_EDEFAULT == null ? lastValue != null : !LAST_VALUE_EDEFAULT.equals(lastValue);
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
		result.append(" (lastValue: ");
		result.append(lastValue);
		result.append(')');
		return result.toString();
	}

  @Override
  public Object getSourceValue()
  {
	  EComponent component = getComponent();
	  
	  if(component != null)
	  {
		  float data = 0.0f;
		  
		  if(getConditioning() != null)
		  {
			  data = getConditioning().conditionInput(component);
			  
			  // TODO Convert to the DataTypeArgument units if applicable.
		  }
		  else
		  {
			  data = component.getPollData();
		  }
		  
		  // Converts the float to the required data type
		  Object value = ApogyCoreProgramsControllersFacade.INSTANCE.createValue(getBindedEDataTypeArgument().getEParameter(), data);
		  
		  // Update last value (used for display purposes).
		  ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(this, ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__LAST_VALUE, value);

		  return value;
	  }
	  else
	  {		  		  
		  Logger.INSTANCE.log(Activator.ID, this, "The controller component named < " + getEComponentQualifier() + "> is not binded ! Ensure the appropriated Controller are connected!", EventSeverity.ERROR);
		  return null;
	  }		  
  }
 
} //ControllerValueSourceImpl
