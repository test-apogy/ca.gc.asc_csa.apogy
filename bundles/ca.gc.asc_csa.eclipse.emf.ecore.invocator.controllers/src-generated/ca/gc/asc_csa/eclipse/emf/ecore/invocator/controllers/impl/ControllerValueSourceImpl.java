/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.AbstractInputConditioning;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.Activator;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ControllerFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ControllerValueSource;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage;
import ca.gc.asc_csa.eclipse.utils.log.EventSeverity;
import ca.gc.asc_csa.eclipse.utils.log.Logger;
import ca.gc.asc_csa.jinput.EComponent;
import ca.gc.asc_csa.jinput.EComponentQualifier;
import ca.gc.asc_csa.jinput.JInputFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Value Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.impl.ControllerValueSourceImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.impl.ControllerValueSourceImpl#getEComponentQualifier <em>EComponent Qualifier</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.impl.ControllerValueSourceImpl#getConditioning <em>Conditioning</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.impl.ControllerValueSourceImpl#getLastValue <em>Last Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerValueSourceImpl extends ValueSourceImpl implements ControllerValueSource
{
	private static ControllerFacade controllerFacade = EMFEcoreControllersFactory.eINSTANCE.createControllerFacade();
	
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
		return EMFEcoreControllersPackage.Literals.CONTROLLER_VALUE_SOURCE;
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
		  return ca.gc.asc_csa.jinput.Activator.getEControllerEnvironment().resolveEComponent(getEComponentQualifier());
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__COMPONENT, oldComponent, component));
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
		  componentQualifier = JInputFactory.eINSTANCE.createEComponentQualifier();
		  setEComponentQualifier(componentQualifier);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER, oldEComponentQualifier, newEComponentQualifier);
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
				msgs = ((InternalEObject)eComponentQualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER, null, msgs);
			if (newEComponentQualifier != null)
				msgs = ((InternalEObject)newEComponentQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER, null, msgs);
			msgs = basicSetEComponentQualifier(newEComponentQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER, newEComponentQualifier, newEComponentQualifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING, oldConditioning, newConditioning);
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
				msgs = ((InternalEObject)conditioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING, null, msgs);
			if (newConditioning != null)
				msgs = ((InternalEObject)newConditioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING, null, msgs);
			msgs = basicSetConditioning(newConditioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING, newConditioning, newConditioning));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__LAST_VALUE, oldLastValue, lastValue));
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
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER:
				return basicSetEComponentQualifier(null, msgs);
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING:
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
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER:
				return getEComponentQualifier();
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING:
				return getConditioning();
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__LAST_VALUE:
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
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__COMPONENT:
				setComponent((EComponent)newValue);
				return;
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER:
				setEComponentQualifier((EComponentQualifier)newValue);
				return;
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING:
				setConditioning((AbstractInputConditioning)newValue);
				return;
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__LAST_VALUE:
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
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__COMPONENT:
				setComponent((EComponent)null);
				return;
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER:
				setEComponentQualifier((EComponentQualifier)null);
				return;
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING:
				setConditioning((AbstractInputConditioning)null);
				return;
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__LAST_VALUE:
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
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__COMPONENT:
				return component != null;
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER:
				return eComponentQualifier != null;
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING:
				return conditioning != null;
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__LAST_VALUE:
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
		  Object value = controllerFacade.createValue(getBindedEDataTypeArgument().getEParameter(), data);
		  
		  // Update last value (used for display purposes).
		  setLastValue(value);
		  
		  return value;
	  }
	  else
	  {		  		  
		  Logger.INSTANCE.log(Activator.ID, this, "The controller component named < " + getEComponentQualifier() + "> is not binded ! Ensure the appropriated Controller are connected!", EventSeverity.ERROR);
		  return null;
	  }		  
  }
 
} //ControllerValueSourceImpl
