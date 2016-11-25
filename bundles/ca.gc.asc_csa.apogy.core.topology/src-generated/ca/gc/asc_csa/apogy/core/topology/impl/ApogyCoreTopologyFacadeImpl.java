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
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.core.ApogyTopology;
import ca.gc.asc_csa.apogy.core.FeatureOfInterest;
import ca.gc.asc_csa.apogy.core.FeatureOfInterestNode;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;
import ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFactory;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyFacadeImpl#getApogyTopology <em>Apogy Topology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApogyCoreTopologyFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCoreTopologyFacade
{
	
	/**
	 * The cached value of the '{@link #getApogyTopology() <em>Apogy Topology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApogyTopology()
	 * @generated
	 * @ordered
	 */
	protected ApogyTopology apogyTopology;
	private static ApogyCoreTopologyFacade instance = null;
	
	public static ApogyCoreTopologyFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new ApogyCoreTopologyFacadeImpl();
		}
		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ApogyCoreTopologyFacadeImpl()
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
		return ApogyCoreTopologyPackage.Literals.APOGY_CORE_TOPOLOGY_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyTopology getApogyTopology() {
		if (apogyTopology != null && apogyTopology.eIsProxy()) {
			InternalEObject oldApogyTopology = (InternalEObject)apogyTopology;
			apogyTopology = (ApogyTopology)eResolveProxy(oldApogyTopology);
			if (apogyTopology != oldApogyTopology) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreTopologyPackage.APOGY_CORE_TOPOLOGY_FACADE__APOGY_TOPOLOGY, oldApogyTopology, apogyTopology));
			}
		}
		return apogyTopology;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyTopology basicGetApogyTopology() {
		return apogyTopology;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApogyTopology(ApogyTopology newApogyTopology) {
		ApogyTopology oldApogyTopology = apogyTopology;
		apogyTopology = newApogyTopology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreTopologyPackage.APOGY_CORE_TOPOLOGY_FACADE__APOGY_TOPOLOGY, oldApogyTopology, apogyTopology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Node getVariableOriginNode(Variable variable) 
	{
		Node node = null;
		
		AbstractTypeImplementation ati = ApogyCoreInvocatorFacade.INSTANCE.getTypeImplementation(variable);
		if(ati instanceof VariableImplementation)
		{
			VariableImplementation va = (VariableImplementation) ati;
			if(va.getAdapterInstance() instanceof ApogySystemApiAdapter)
			{
				ApogySystemApiAdapter ssaa = (ApogySystemApiAdapter) va.getAdapterInstance();
				
				if(ssaa.getApogySystem() != null && ssaa.getApogySystem().getTopologyRoot() != null)
				{
					node = ssaa.getApogySystem().getTopologyRoot().getOriginNode();
				}
			}
		}
		
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public Node getAbstractTypeImplementationOriginNode(AbstractTypeImplementation abstractTypeImplementation) 
	{
		Node root = null;		
		
		VariableImplementation vi = resolveVariableImplementation(abstractTypeImplementation);
		if(vi != null)
		{
			root = ApogyCoreTopologyFacade.INSTANCE.getVariableOriginNode(vi.getVariable());
		}		
		return root;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public ApogyEnvironmentNode createApogyEnvironmentNode(ApogyEnvironment apogyEnvironment) 
	{
		ApogyEnvironmentNode apogyEnvironmentNode = ApogyCoreTopologyFactory.eINSTANCE.createApogyEnvironmentNode();						
		apogyEnvironmentNode.setApogyEnvironment(apogyEnvironment);										
		
		// Forces the update of the child nodes.
		apogyEnvironmentNode.getApogySystemAPIsNode();
		apogyEnvironmentNode.getWorksiteNode();		
		apogyEnvironmentNode.getResultsListNode();
		
		return apogyEnvironmentNode;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initApogyTopology(ApogyEnvironment environment) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void disposeApogyTopology() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public FeatureOfInterestNode getFeatureOfInterestNode(FeatureOfInterest featureOfInterest) {
		if (featureOfInterest != null) {
			ApogyTopology apogyTopology = getApogyTopology();
			if (apogyTopology != null && apogyTopology.getRootNode() != null) {
				List<Node> nodes = ApogyCommonTopologyFacade.INSTANCE.findNodesByType(
						ApogyCorePackage.Literals.FEATURE_OF_INTEREST_NODE, apogyTopology.getRootNode());

				FeatureOfInterestNode featureOfInterestNode = null;
				Iterator<Node> it = nodes.iterator();
				while (it.hasNext() && featureOfInterestNode == null) {
					Node n = it.next();
					if (n instanceof FeatureOfInterestNode) {
						FeatureOfInterestNode foin = (FeatureOfInterestNode) n;
						if (foin.getFeatureOfInterest() == featureOfInterest) {
							featureOfInterestNode = foin;
						}
					}
				}

				return featureOfInterestNode;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreTopologyPackage.APOGY_CORE_TOPOLOGY_FACADE__APOGY_TOPOLOGY:
				if (resolve) return getApogyTopology();
				return basicGetApogyTopology();
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
			case ApogyCoreTopologyPackage.APOGY_CORE_TOPOLOGY_FACADE__APOGY_TOPOLOGY:
				setApogyTopology((ApogyTopology)newValue);
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
			case ApogyCoreTopologyPackage.APOGY_CORE_TOPOLOGY_FACADE__APOGY_TOPOLOGY:
				setApogyTopology((ApogyTopology)null);
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
			case ApogyCoreTopologyPackage.APOGY_CORE_TOPOLOGY_FACADE__APOGY_TOPOLOGY:
				return apogyTopology != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Attempts to find the VariableImplementation ultimately defining the specified AbstractTypeImplementation.
	 * @param ati The AbstractTypeImplementation for which to find the declaring Variable.
	 * @return The VariableImplementation associated with the AbstractTypeImplementation, null is none is found.
	 */
	private VariableImplementation resolveVariableImplementation(AbstractTypeImplementation ati)
	{
		if(ati instanceof VariableImplementation)
		{
			return (VariableImplementation) ati;
		}
		else if(ati.eContainer() instanceof VariableImplementation)
		{
			return (VariableImplementation) ati.eContainer();
		}
		else if(eContainer instanceof AbstractTypeImplementation)
		{
			AbstractTypeImplementation atiContainer = (AbstractTypeImplementation) ati.eContainer();
			return resolveVariableImplementation(atiContainer);
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
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreTopologyPackage.APOGY_CORE_TOPOLOGY_FACADE___GET_VARIABLE_ORIGIN_NODE__VARIABLE:
				return getVariableOriginNode((Variable)arguments.get(0));
			case ApogyCoreTopologyPackage.APOGY_CORE_TOPOLOGY_FACADE___GET_ABSTRACT_TYPE_IMPLEMENTATION_ORIGIN_NODE__ABSTRACTTYPEIMPLEMENTATION:
				return getAbstractTypeImplementationOriginNode((AbstractTypeImplementation)arguments.get(0));
			case ApogyCoreTopologyPackage.APOGY_CORE_TOPOLOGY_FACADE___CREATE_APOGY_ENVIRONMENT_NODE__APOGYENVIRONMENT:
				return createApogyEnvironmentNode((ApogyEnvironment)arguments.get(0));
			case ApogyCoreTopologyPackage.APOGY_CORE_TOPOLOGY_FACADE___INIT_APOGY_TOPOLOGY__APOGYENVIRONMENT:
				initApogyTopology((ApogyEnvironment)arguments.get(0));
				return null;
			case ApogyCoreTopologyPackage.APOGY_CORE_TOPOLOGY_FACADE___DISPOSE_APOGY_TOPOLOGY:
				disposeApogyTopology();
				return null;
			case ApogyCoreTopologyPackage.APOGY_CORE_TOPOLOGY_FACADE___GET_FEATURE_OF_INTEREST_NODE__FEATUREOFINTEREST:
				return getFeatureOfInterestNode((FeatureOfInterest)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}




} //ApogyCoreTopologyFacadeImpl
