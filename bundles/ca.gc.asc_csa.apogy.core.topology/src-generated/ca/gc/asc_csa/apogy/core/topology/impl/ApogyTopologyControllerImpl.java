/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.topology.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage;
import ca.gc.asc_csa.apogy.core.topology.ApogyTopologyController;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apogy Topology Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyTopologyControllerImpl extends MinimalEObjectImpl.Container implements ApogyTopologyController {
	
	/**
	 * @generated_NOT
	 */
	private static ApogyTopologyController instance = null;

	/**
	 * @generated_NOT
	 */
	public static ApogyTopologyController getInstance() {
		if (instance == null) {
			instance = new ApogyTopologyControllerImpl();
		}
		return instance;
	}

	private Adapter adapter;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyTopologyControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreTopologyPackage.Literals.APOGY_TOPOLOGY_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void init() {
		initApogyTopology(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().add(getAdapter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void dispose() {
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().remove(getAdapter());
		initApogyTopology(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void initApogyTopology(InvocatorSession session) {
		ApogyCoreTopologyFacade.INSTANCE.disposeApogyTopology();
		if (session != null){
			ApogyCoreTopologyFacade.INSTANCE.disposeApogyTopology();
			
			Environment environment = session.getEnvironment();
			
			if (environment != null && environment instanceof ApogyEnvironment){
				ApogyCoreTopologyFacade.INSTANCE.initApogyTopology((ApogyEnvironment) environment);	
			}
		}
	}

	private Adapter getAdapter() {
		if (adapter == null){
			adapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeatureID(ApogyCoreInvocatorFacade.class) == ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION){
						initApogyTopology((InvocatorSession) msg.getNewValue());
					}
				}
			};
		}
		return adapter;
	} 

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreTopologyPackage.APOGY_TOPOLOGY_CONTROLLER___INIT:
				init();
				return null;
			case ApogyCoreTopologyPackage.APOGY_TOPOLOGY_CONTROLLER___DISPOSE:
				dispose();
				return null;
			case ApogyCoreTopologyPackage.APOGY_TOPOLOGY_CONTROLLER___INIT_APOGY_TOPOLOGY__INVOCATORSESSION:
				initApogyTopology((InvocatorSession)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApogyTopologyControllerImpl
