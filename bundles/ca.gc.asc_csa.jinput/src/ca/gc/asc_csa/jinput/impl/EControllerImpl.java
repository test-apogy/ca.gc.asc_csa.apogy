/**
 * Copyrights Canadian Space Agency 2012. All rights reserved.
 */
package ca.gc.asc_csa.jinput.impl;

import java.lang.reflect.InvocationTargetException;

import net.java.games.input.Component;
import net.java.games.input.Component.Identifier;
import net.java.games.input.Controller;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ca.gc.asc_csa.jinput.EAxis;
import ca.gc.asc_csa.jinput.EButton;
import ca.gc.asc_csa.jinput.EComponents;
import ca.gc.asc_csa.jinput.EController;
import ca.gc.asc_csa.jinput.EKey;
import ca.gc.asc_csa.jinput.JInputFactory;
import ca.gc.asc_csa.jinput.JInputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EController</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.jinput.impl.EControllerImpl#isLastPollResult <em>Last Poll Result</em>}</li>
 *   <li>{@link ca.gc.asc_csa.jinput.impl.EControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.jinput.impl.EControllerImpl#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link ca.gc.asc_csa.jinput.impl.EControllerImpl#getType <em>Type</em>}</li>
 *   <li>{@link ca.gc.asc_csa.jinput.impl.EControllerImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link ca.gc.asc_csa.jinput.impl.EControllerImpl#getPojoController <em>Pojo Controller</em>}</li>
 *   <li>{@link ca.gc.asc_csa.jinput.impl.EControllerImpl#getEComponents <em>EComponents</em>}</li>
 *   <li>{@link ca.gc.asc_csa.jinput.impl.EControllerImpl#getControllerCount <em>Controller Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EControllerImpl extends EObjectImpl implements EController {
	
	private boolean componentsHaveBeenLoaded = false;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyrights Canadian Space Agency 2012. All rights reserved.";

	/**
	 * The default value of the '{@link #isLastPollResult() <em>Last Poll Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLastPollResult()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAST_POLL_RESULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLastPollResult() <em>Last Poll Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLastPollResult()
	 * @generated
	 * @ordered
	 */
	protected boolean lastPollResult = LAST_POLL_RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_NUMBER_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPortType() <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPojoController() <em>Pojo Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPojoController()
	 * @generated
	 * @ordered
	 */
	protected static final Controller POJO_CONTROLLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPojoController() <em>Pojo Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPojoController()
	 * @generated
	 * @ordered
	 */
	protected Controller pojoController = POJO_CONTROLLER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEComponents() <em>EComponents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEComponents()
	 * @generated
	 * @ordered
	 */
	protected EComponents eComponents;
	/**
	 * The default value of the '{@link #getControllerCount() <em>Controller Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTROLLER_COUNT_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getControllerCount() <em>Controller Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerCount()
	 * @generated
	 * @ordered
	 */
	protected int controllerCount = CONTROLLER_COUNT_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JInputPackage.Literals.ECONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLastPollResult() {
		return lastPollResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastPollResult(boolean newLastPollResult) {
		boolean oldLastPollResult = lastPollResult;
		lastPollResult = newLastPollResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JInputPackage.ECONTROLLER__LAST_POLL_RESULT, oldLastPollResult, lastPollResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public String getName() 
	{		
		return pojoController == null ? "": pojoController.getName() + " [" + Integer.toString(getControllerCount()) + "]";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public int getPortNumber() {
		return pojoController == null ? 0: pojoController.getPortNumber();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public String getType() {
		return pojoController == null ? "": pojoController.getType().toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public String getPortType() {
		return pojoController == null ? "": pojoController.getPortType().toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller getPojoController() {
		return pojoController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPojoController(Controller newPojoController) {
		Controller oldPojoController = pojoController;
		pojoController = newPojoController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JInputPackage.ECONTROLLER__POJO_CONTROLLER, oldPojoController, pojoController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public EComponents getEComponents() 	
	{
		if(!componentsHaveBeenLoaded)
		{
			if (pojoController != null)
			{
				EComponents ecs = JInputFactory.eINSTANCE.createEComponents();
				ecs.setName("Components");
				Component[] componentsList = pojoController.getComponents();

				for(Component c : componentsList) 
				{					
					if(c.getIdentifier() instanceof Identifier.Button) 
					{
						EButton button = JInputFactory.eINSTANCE.createEButton();						
						button.setPojoComponent(c);
						ecs.getComponents().add(button);
					}
					else if(c.getIdentifier() instanceof Identifier.Axis)
					{
						EAxis axis = JInputFactory.eINSTANCE.createEAxis();
						axis.setPojoComponent(c);
						ecs.getComponents().add(axis);
					}
					else if(c.getIdentifier() instanceof Identifier.Key)
					{
						EKey key = JInputFactory.eINSTANCE.createEKey();
						key.setPojoComponent(c);
						ecs.getComponents().add(key);
					}
				}
				
				setEComponents(ecs);
				componentsHaveBeenLoaded = true;
			}
		}
		
		return getEComponentsGen();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EComponents getEComponentsGen() {
		return eComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEComponents(EComponents newEComponents, NotificationChain msgs) {
		EComponents oldEComponents = eComponents;
		eComponents = newEComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JInputPackage.ECONTROLLER__ECOMPONENTS, oldEComponents, newEComponents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEComponents(EComponents newEComponents) {
		if (newEComponents != eComponents) {
			NotificationChain msgs = null;
			if (eComponents != null)
				msgs = ((InternalEObject)eComponents).eInverseRemove(this, JInputPackage.ECOMPONENTS__ECONTROLLER, EComponents.class, msgs);
			if (newEComponents != null)
				msgs = ((InternalEObject)newEComponents).eInverseAdd(this, JInputPackage.ECOMPONENTS__ECONTROLLER, EComponents.class, msgs);
			msgs = basicSetEComponents(newEComponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JInputPackage.ECONTROLLER__ECOMPONENTS, newEComponents, newEComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getControllerCount() 
	{
		return controllerCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllerCount(int newControllerCount) {
		int oldControllerCount = controllerCount;
		controllerCount = newControllerCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JInputPackage.ECONTROLLER__CONTROLLER_COUNT, oldControllerCount, controllerCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public boolean poll() {
		boolean pollResult = pojoController.poll();
		setLastPollResult(pollResult);
		return pollResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JInputPackage.ECONTROLLER__ECOMPONENTS:
				if (eComponents != null)
					msgs = ((InternalEObject)eComponents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JInputPackage.ECONTROLLER__ECOMPONENTS, null, msgs);
				return basicSetEComponents((EComponents)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JInputPackage.ECONTROLLER__ECOMPONENTS:
				return basicSetEComponents(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JInputPackage.ECONTROLLER__LAST_POLL_RESULT:
				return isLastPollResult();
			case JInputPackage.ECONTROLLER__NAME:
				return getName();
			case JInputPackage.ECONTROLLER__PORT_NUMBER:
				return getPortNumber();
			case JInputPackage.ECONTROLLER__TYPE:
				return getType();
			case JInputPackage.ECONTROLLER__PORT_TYPE:
				return getPortType();
			case JInputPackage.ECONTROLLER__POJO_CONTROLLER:
				return getPojoController();
			case JInputPackage.ECONTROLLER__ECOMPONENTS:
				return getEComponents();
			case JInputPackage.ECONTROLLER__CONTROLLER_COUNT:
				return getControllerCount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JInputPackage.ECONTROLLER__LAST_POLL_RESULT:
				setLastPollResult((Boolean)newValue);
				return;
			case JInputPackage.ECONTROLLER__POJO_CONTROLLER:
				setPojoController((Controller)newValue);
				return;
			case JInputPackage.ECONTROLLER__ECOMPONENTS:
				setEComponents((EComponents)newValue);
				return;
			case JInputPackage.ECONTROLLER__CONTROLLER_COUNT:
				setControllerCount((Integer)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case JInputPackage.ECONTROLLER__LAST_POLL_RESULT:
				setLastPollResult(LAST_POLL_RESULT_EDEFAULT);
				return;
			case JInputPackage.ECONTROLLER__POJO_CONTROLLER:
				setPojoController(POJO_CONTROLLER_EDEFAULT);
				return;
			case JInputPackage.ECONTROLLER__ECOMPONENTS:
				setEComponents((EComponents)null);
				return;
			case JInputPackage.ECONTROLLER__CONTROLLER_COUNT:
				setControllerCount(CONTROLLER_COUNT_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JInputPackage.ECONTROLLER__LAST_POLL_RESULT:
				return lastPollResult != LAST_POLL_RESULT_EDEFAULT;
			case JInputPackage.ECONTROLLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JInputPackage.ECONTROLLER__PORT_NUMBER:
				return getPortNumber() != PORT_NUMBER_EDEFAULT;
			case JInputPackage.ECONTROLLER__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case JInputPackage.ECONTROLLER__PORT_TYPE:
				return PORT_TYPE_EDEFAULT == null ? getPortType() != null : !PORT_TYPE_EDEFAULT.equals(getPortType());
			case JInputPackage.ECONTROLLER__POJO_CONTROLLER:
				return POJO_CONTROLLER_EDEFAULT == null ? pojoController != null : !POJO_CONTROLLER_EDEFAULT.equals(pojoController);
			case JInputPackage.ECONTROLLER__ECOMPONENTS:
				return eComponents != null;
			case JInputPackage.ECONTROLLER__CONTROLLER_COUNT:
				return controllerCount != CONTROLLER_COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JInputPackage.ECONTROLLER___POLL:
				return poll();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lastPollResult: ");
		result.append(lastPollResult);
		result.append(", name: ");
		result.append(name);
		result.append(", pojoController: ");
		result.append(pojoController);
		result.append(", controllerCount: ");
		result.append(controllerCount);
		result.append(')');
		return result.toString();
	}

} //EControllerImpl
