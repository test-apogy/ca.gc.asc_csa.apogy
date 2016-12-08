/**
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
package ca.gc.asc_csa.apogy.common.io.jinput.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.swt.widgets.Display;

import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.io.jinput.Activator;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputFacade;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier;
import ca.gc.asc_csa.apogy.common.io.jinput.EController;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import net.java.games.input.Controller;
import net.java.games.input.Event;
import net.java.games.input.EventQueue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.impl.ApogyCommonIOJInputFacadeImpl#isSelectingComponent <em>Selecting Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApogyCommonIOJInputFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCommonIOJInputFacade {	
	/**
	 * The default value of the '{@link #isSelectingComponent() <em>Selecting Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelectingComponent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTING_COMPONENT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isSelectingComponent() <em>Selecting Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelectingComponent()
	 * @generated
	 * @ordered
	 */
	protected boolean selectingComponent = SELECTING_COMPONENT_EDEFAULT;
	/**
	 * @generated_NOT
	 */
	private static ApogyCommonIOJInputFacade instance = null;

	/**
	 * @generated_NOT
	 */
	public static ApogyCommonIOJInputFacade getInstance() {
		if (instance == null) {
			instance = new ApogyCommonIOJInputFacadeImpl();
		}
		return instance;
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCommonIOJInputFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonIOJInputPackage.Literals.APOGY_COMMON_IOJ_INPUT_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelectingComponent() {
		return selectingComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectingComponent(boolean newSelectingComponent) {
		boolean oldSelectingComponent = selectingComponent;
		selectingComponent = newSelectingComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonIOJInputPackage.APOGY_COMMON_IOJ_INPUT_FACADE__SELECTING_COMPONENT, oldSelectingComponent, selectingComponent));
	}

	/**
	 * @generated_NOT
	 */
	private Adapter selectComponentAdapter;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void startSelectComponent(EComponentQualifier eComponentQualifier) {
		if (isSelectingComponent()) {
			String message = this.getClass().getSimpleName()
					+ "Component selection already started. \nUse ApogyCommonIOJInputFacade.INSTANCE.stopSelectComponent(eComponentQualifier) to stop a selection and prevent memory leaks.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
		}
		for (EController eController : Activator.getEControllerEnvironment().getControllers()) {
			EventQueue queue = eController.getPojoController().getEventQueue();
			Event event = new Event();
			while (queue.getNextEvent(event));
		}
		
		if (selectComponentAdapter == null) {
			selectComponentAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					for (EController eController : Activator.getEControllerEnvironment().getControllers()) {

						Display.getDefault().asyncExec(new Runnable() {
							@Override
							public void run() {
								Controller controller = eController.getPojoController();

								controller.poll();
								EventQueue queue = controller.getEventQueue();
								Event event = new Event();

								while (queue.getNextEvent(event)) {
									System.out.println(event.getComponent());
									if (Math.abs(event.getValue()) > 0.5) {
										ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(eComponentQualifier, ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME, event.getComponent().getName());
										ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(eComponentQualifier, ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME, eController.getName());
//										eComponentQualifier.setEComponentName(event.getComponent().getName());
//										eComponentQualifier.setEControllerName(eController.getName());
									}
								}
							}
						});
					}
					;
				}

			};
		}
		Activator.getEControllerEnvironment().eAdapters().add(selectComponentAdapter);
		setSelectingComponent(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void stopSelectComponent(EComponentQualifier eComponentQualifier) {
		if (selectComponentAdapter != null) {
			Activator.getEControllerEnvironment().eAdapters().remove(selectComponentAdapter);
			selectComponentAdapter = null;
		}
		setSelectingComponent(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonIOJInputPackage.APOGY_COMMON_IOJ_INPUT_FACADE__SELECTING_COMPONENT:
				return isSelectingComponent();
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
			case ApogyCommonIOJInputPackage.APOGY_COMMON_IOJ_INPUT_FACADE__SELECTING_COMPONENT:
				setSelectingComponent((Boolean)newValue);
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
			case ApogyCommonIOJInputPackage.APOGY_COMMON_IOJ_INPUT_FACADE__SELECTING_COMPONENT:
				setSelectingComponent(SELECTING_COMPONENT_EDEFAULT);
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
			case ApogyCommonIOJInputPackage.APOGY_COMMON_IOJ_INPUT_FACADE__SELECTING_COMPONENT:
				return selectingComponent != SELECTING_COMPONENT_EDEFAULT;
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
			case ApogyCommonIOJInputPackage.APOGY_COMMON_IOJ_INPUT_FACADE___START_SELECT_COMPONENT__ECOMPONENTQUALIFIER:
				startSelectComponent((EComponentQualifier)arguments.get(0));
				return null;
			case ApogyCommonIOJInputPackage.APOGY_COMMON_IOJ_INPUT_FACADE___STOP_SELECT_COMPONENT__ECOMPONENTQUALIFIER:
				stopSelectComponent((EComponentQualifier)arguments.get(0));
				return null;
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
		result.append(" (selectingComponent: ");
		result.append(selectingComponent);
		result.append(')');
		return result.toString();
	}

} //ApogyCommonIOJInputFacadeImpl
