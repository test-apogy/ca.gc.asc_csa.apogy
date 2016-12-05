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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.swt.widgets.Display;

import ca.gc.asc_csa.apogy.common.io.jinput.Activator;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputFacade;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier;
import ca.gc.asc_csa.apogy.common.io.jinput.EController;
import net.java.games.input.Controller;
import net.java.games.input.Event;
import net.java.games.input.EventQueue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCommonIOJInputFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCommonIOJInputFacade {	
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
	 * @generated_NOT
	 */
	private Adapter selectComponentAdapter;
	/**
	 * @generated_NOT
	 */
	private Adapter eComponentQualifierAdapter;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void addSelectComponentAdapter(EComponentQualifier eComponentQualifier) {
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
									if (Math.abs(event.getValue()) > 0.5) {
										eComponentQualifier.setEComponentName(event.getComponent().getName());
										eComponentQualifier.setEControllerName(eController.getName());
									}
								}
							}
						});
					}
					;
				}

			};
		}

		eComponentQualifierAdapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				if (msg.getFeature() == ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME
						|| msg.getFeature() == ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME) {
					forceStopSelectComponent(eComponentQualifier);
				}
			}
		};

		eComponentQualifier.eAdapters().add(eComponentQualifierAdapter);
		Activator.getEControllerEnvironment().eAdapters().add(selectComponentAdapter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void forceStopSelectComponent(EComponentQualifier eComponentQualifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonIOJInputPackage.APOGY_COMMON_IOJ_INPUT_FACADE___ADD_SELECT_COMPONENT_ADAPTER__ECOMPONENTQUALIFIER:
				addSelectComponentAdapter((EComponentQualifier)arguments.get(0));
				return null;
			case ApogyCommonIOJInputPackage.APOGY_COMMON_IOJ_INPUT_FACADE___FORCE_STOP_SELECT_COMPONENT__ECOMPONENTQUALIFIER:
				forceStopSelectComponent((EComponentQualifier)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApogyCommonIOJInputFacadeImpl
