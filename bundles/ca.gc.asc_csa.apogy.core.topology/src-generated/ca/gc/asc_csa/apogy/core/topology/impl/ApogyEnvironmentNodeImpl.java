package ca.gc.asc_csa.apogy.core.topology.impl;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.common.topology.impl.ReferencedGroupNodeImpl;
import ca.gc.asc_csa.apogy.core.ApogyCoreFactory;
import ca.gc.asc_csa.apogy.core.ResultsListNode;
import ca.gc.asc_csa.apogy.core.environment.AbstractWorksite;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.environment.Worksite;
import ca.gc.asc_csa.apogy.core.environment.WorksiteNode;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.ResultsList;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFactory;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage;
import ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode;
import ca.gc.asc_csa.apogy.core.topology.ApogySystemAPIsNode;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Deployment Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link ca.gc.asc_csa.apogy.core.topology.impl.ApogyEnvironmentNodeImpl#getApogyEnvironment
 * <em>Apogy Environment</em>}</li>
 * <li>{@link ca.gc.asc_csa.apogy.core.topology.impl.ApogyEnvironmentNodeImpl#getWorksiteNode
 * <em>Worksite Node</em>}</li>
 * <li>{@link ca.gc.asc_csa.apogy.core.topology.impl.ApogyEnvironmentNodeImpl#getResultsListNode
 * <em>Results List Node</em>}</li>
 * <li>{@link ca.gc.asc_csa.apogy.core.topology.impl.ApogyEnvironmentNodeImpl#getApogySystemAPIsNode
 * <em>Apogy System AP Is Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApogyEnvironmentNodeImpl extends ReferencedGroupNodeImpl implements ApogyEnvironmentNode {
	/**
	 * The cached value of the '{@link #getApogyEnvironment() <em>Apogy
	 * Environment</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getApogyEnvironment()
	 * @generated
	 * @ordered
	 */
	protected ApogyEnvironment apogyEnvironment;

	private Adapter adapter = null;

	/**
	 * The cached value of the '{@link #getWorksiteNode() <em>Worksite
	 * Node</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWorksiteNode()
	 * @generated
	 * @ordered
	 */
	protected WorksiteNode worksiteNode;

	/**
	 * The cached value of the '{@link #getResultsListNode() <em>Results List
	 * Node</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getResultsListNode()
	 * @generated
	 * @ordered
	 */
	protected ResultsListNode resultsListNode;

	/**
	 * The cached value of the '{@link #getApogySystemAPIsNode() <em>Apogy
	 * System AP Is Node</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getApogySystemAPIsNode()
	 * @generated
	 * @ordered
	 */
	protected ApogySystemAPIsNode apogySystemAPIsNode;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ApogyEnvironmentNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreTopologyPackage.Literals.APOGY_ENVIRONMENT_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ApogyEnvironment getApogyEnvironment() {
		if (apogyEnvironment != null && apogyEnvironment.eIsProxy()) {
			InternalEObject oldApogyEnvironment = (InternalEObject) apogyEnvironment;
			apogyEnvironment = (ApogyEnvironment) eResolveProxy(oldApogyEnvironment);
			if (apogyEnvironment != oldApogyEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__APOGY_ENVIRONMENT, oldApogyEnvironment,
							apogyEnvironment));
			}
		}
		return apogyEnvironment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ApogyEnvironment basicGetApogyEnvironment() {
		return apogyEnvironment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setApogyEnvironment(ApogyEnvironment newApogyEnvironment) {
		updateApogyEnvironment(getApogyEnvironment(), newApogyEnvironment);
		setApogyEnvironmentGen(newApogyEnvironment);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setApogyEnvironmentGen(ApogyEnvironment newApogyEnvironment) {
		ApogyEnvironment oldApogyEnvironment = apogyEnvironment;
		apogyEnvironment = newApogyEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__APOGY_ENVIRONMENT, oldApogyEnvironment,
					apogyEnvironment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WorksiteNode getWorksiteNode() {
		if (worksiteNode != null && worksiteNode.eIsProxy()) {
			InternalEObject oldWorksiteNode = (InternalEObject) worksiteNode;
			worksiteNode = (WorksiteNode) eResolveProxy(oldWorksiteNode);
			if (worksiteNode != oldWorksiteNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__WORKSITE_NODE, oldWorksiteNode,
							worksiteNode));
			}
		}
		return worksiteNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WorksiteNode getWorksiteNodeGen() {
		if (worksiteNode != null && worksiteNode.eIsProxy()) {
			InternalEObject oldWorksiteNode = (InternalEObject) worksiteNode;
			worksiteNode = (WorksiteNode) eResolveProxy(oldWorksiteNode);
			if (worksiteNode != oldWorksiteNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__WORKSITE_NODE, oldWorksiteNode,
							worksiteNode));
			}
		}
		return worksiteNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WorksiteNode basicGetWorksiteNode() {
		return worksiteNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setWorksiteNode(WorksiteNode newWorksiteNode) {
		// Detach previous worksite node if applicable.
		if (getWorksiteNode() != null)
			getChildren().remove(getWorksiteNode());

		// Attache new worksite node if applicable.
		if (newWorksiteNode != null)
			getChildren().add(newWorksiteNode);

		setWorksiteNodeGen(newWorksiteNode);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setWorksiteNodeGen(WorksiteNode newWorksiteNode) {
		WorksiteNode oldWorksiteNode = worksiteNode;
		worksiteNode = newWorksiteNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__WORKSITE_NODE, oldWorksiteNode, worksiteNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public ResultsListNode getResultsListNode() {
		if (getResultsListNodeGen() == null) {
			resultsListNode = ApogyCoreFactory.eINSTANCE.createResultsListNode();
			resultsListNode.setDescription("Results" + getNodeId());
			resultsListNode.setNodeId("RESULTS");

			// Attaches the results.
			getReferencedChildren().add(resultsListNode);
			resultsListNode.setParent(this);
		}

		return getResultsListNodeGen();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResultsListNode getResultsListNodeGen() {
		if (resultsListNode != null && resultsListNode.eIsProxy()) {
			InternalEObject oldResultsListNode = (InternalEObject) resultsListNode;
			resultsListNode = (ResultsListNode) eResolveProxy(oldResultsListNode);
			if (resultsListNode != oldResultsListNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__RESULTS_LIST_NODE, oldResultsListNode,
							resultsListNode));
			}
		}
		return resultsListNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResultsListNode basicGetResultsListNode() {
		return resultsListNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public ApogySystemAPIsNode getApogySystemAPIsNode() {
		if (getApogySystemAPIsNodeGen() == null) {
			apogySystemAPIsNode = ApogyCoreTopologyFactory.eINSTANCE.createApogySystemAPIsNode();
			apogySystemAPIsNode.setNodeId("SYSTEMS" + getNodeId());
			apogySystemAPIsNode.setDescription("Systems");

			// Attaches the Systems
			getChildren().add(apogySystemAPIsNode);

			apogySystemAPIsNode.setApogyEnvironment(getApogyEnvironment());
		}

		return getApogySystemAPIsNodeGen();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ApogySystemAPIsNode getApogySystemAPIsNodeGen() {
		if (apogySystemAPIsNode != null && apogySystemAPIsNode.eIsProxy()) {
			InternalEObject oldApogySystemAPIsNode = (InternalEObject) apogySystemAPIsNode;
			apogySystemAPIsNode = (ApogySystemAPIsNode) eResolveProxy(oldApogySystemAPIsNode);
			if (apogySystemAPIsNode != oldApogySystemAPIsNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__APOGY_SYSTEM_AP_IS_NODE,
							oldApogySystemAPIsNode, apogySystemAPIsNode));
			}
		}
		return apogySystemAPIsNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ApogySystemAPIsNode basicGetApogySystemAPIsNode() {
		return apogySystemAPIsNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void dispose() {
		setApogyEnvironment(null);

		getWorksiteNode().setWorksite(null);
		setWorksiteNode(null);

		getResultsListNode().setResultsList(null);

		getApogySystemAPIsNode().setApogyEnvironment(null);

		getChildren().clear();

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__APOGY_ENVIRONMENT:
			if (resolve)
				return getApogyEnvironment();
			return basicGetApogyEnvironment();
		case ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__WORKSITE_NODE:
			if (resolve)
				return getWorksiteNode();
			return basicGetWorksiteNode();
		case ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__RESULTS_LIST_NODE:
			if (resolve)
				return getResultsListNode();
			return basicGetResultsListNode();
		case ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__APOGY_SYSTEM_AP_IS_NODE:
			if (resolve)
				return getApogySystemAPIsNode();
			return basicGetApogySystemAPIsNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__APOGY_ENVIRONMENT:
			setApogyEnvironment((ApogyEnvironment) newValue);
			return;
		case ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__WORKSITE_NODE:
			setWorksiteNode((WorksiteNode) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__APOGY_ENVIRONMENT:
			setApogyEnvironment((ApogyEnvironment) null);
			return;
		case ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__WORKSITE_NODE:
			setWorksiteNode((WorksiteNode) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__APOGY_ENVIRONMENT:
			return apogyEnvironment != null;
		case ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__WORKSITE_NODE:
			return worksiteNode != null;
		case ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__RESULTS_LIST_NODE:
			return resultsListNode != null;
		case ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE__APOGY_SYSTEM_AP_IS_NODE:
			return apogySystemAPIsNode != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE___DISPOSE:
			dispose();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	private void updateApogyEnvironment(ApogyEnvironment oldApogyEnvironment, ApogyEnvironment newApogyEnvironment) {
		ResultsList oldResultsList = null;
		ResultsList newResultsList = null;

		AbstractWorksite oldWorksite = null;
		AbstractWorksite newWorksite = null;

		if (oldApogyEnvironment != null) {
			// Unregister from old environment, if applicable.
			oldApogyEnvironment.eAdapters().remove(getAdapter());

			// Gets the old worksite.
			oldWorksite = oldApogyEnvironment.getActiveWorksite();

			// If the Context was set
			if (oldApogyEnvironment.getActiveContext() != null) {
				if (oldApogyEnvironment.getActiveContext().getDataProductsList() != null) {
					oldResultsList = oldApogyEnvironment.getActiveContext().getDataProductsList()
							.getOperationCallResultsList();
				}
			}
		}

		// Sets up the newEnvironement
		if (newApogyEnvironment != null) {
			if (newApogyEnvironment.getName() != null) {
				setNodeId(newApogyEnvironment.getName());
			}

			setDescription("Apogy Environment Node");

			// Gets the new Worksite.
			newWorksite = newApogyEnvironment.getActiveWorksite();

			// Register listener to the new ApogyEnvironment.
			newApogyEnvironment.eAdapters().add(getAdapter());

			// If the context is set.
			if (newApogyEnvironment.getActiveContext() != null) {
				newResultsList = newApogyEnvironment.getActiveContext().getDataProductsList()
						.getOperationCallResultsList();
			}
		}

		// Updates Result list.
		updateResultLists(oldResultsList, newResultsList);

		// Updates Worksite
		updateWorksite(oldWorksite, newWorksite);

		// Updates the Systems.
		updateSystems(oldApogyEnvironment, newApogyEnvironment);

	}

	private void updateContext(Context oldContext, Context newContext) {
		ResultsList oldResultsList = null;
		ResultsList newResultsList = null;

		if (oldContext != null) {
			// Unregister from previous Context,
			oldContext.eAdapters().remove(getAdapter());

			// Gets old ResultsList.
			if (oldContext.getDataProductsList() != null) {
				oldResultsList = oldContext.getDataProductsList().getOperationCallResultsList();
			}
		}

		if (newContext != null) {
			// Register to new Context.
			newContext.eAdapters().add(getAdapter());

			// Gets new ResultsList.
			if (newContext.getDataProductsList() != null) {
				newResultsList = newContext.getDataProductsList().getOperationCallResultsList();
			}
		}

		// Updates Results.
		updateResultLists(oldResultsList, newResultsList);
	}

	private void updateSystems(ApogyEnvironment oldApogyEnvironment, ApogyEnvironment newApogyEnvironment) {
		getApogySystemAPIsNode().setApogyEnvironment(newApogyEnvironment);
	}

	private void updateResultLists(ResultsList oldResultsList, ResultsList newResultsList) {
		if (oldResultsList != null)
			oldResultsList.eAdapters().remove(getAdapter());

		if (newResultsList != null)
			newResultsList.eAdapters().add(getAdapter());

		// Updates the getResultsListNode ResultList.
		getResultsListNode().setResultsList(newResultsList);

	}

	private void updateWorksite(AbstractWorksite oldWorksite, AbstractWorksite newWorksite) {
		// Updates the WorksiteNode worksite if applicable.
		if (newWorksite instanceof Worksite) {
			Worksite worksite = (Worksite) newWorksite;
			setWorksiteNode(worksite.getWorksiteNode());
		} else {
			// Clears worksite.
			setWorksiteNode(null);
		}
	}

	protected Adapter getAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					super.notifyChanged(msg);

					if (msg.getNotifier() instanceof ApogyEnvironment) {
						if (msg.getFeatureID(
								ApogyEnvironment.class) == ApogyCoreEnvironmentPackage.APOGY_ENVIRONMENT__ACTIVE_CONTEXT) {
							// Active Context has changed.
							Context oldContext = (Context) msg.getOldValue();
							Context newContext = (Context) msg.getOldValue();
							updateContext(oldContext, newContext);
						} else if (msg.getFeatureID(
								ApogyEnvironment.class) == ApogyCoreEnvironmentPackage.APOGY_ENVIRONMENT__ACTIVE_WORKSITE) {
							// Active Worksite has changed.
							AbstractWorksite oldWorksite = (AbstractWorksite) msg.getOldValue();
							AbstractWorksite newWorksite = (AbstractWorksite) msg.getNewValue();
							updateWorksite(oldWorksite, newWorksite);
						}
					} else if (msg.getNotifier() instanceof Context) {
						if (msg.getFeatureID(Context.class) == ApogyCoreInvocatorPackage.CONTEXT__DATA_PRODUCTS_LIST) {
							// ResultsList has changed.
							ResultsList oldResultsList = (ResultsList) msg.getOldValue();
							ResultsList newResultsList = (ResultsList) msg.getNewValue();
							updateResultLists(oldResultsList, newResultsList);
						}
					}
				}
			};
		}
		return adapter;
	}
} // DeploymentNodeImpl
