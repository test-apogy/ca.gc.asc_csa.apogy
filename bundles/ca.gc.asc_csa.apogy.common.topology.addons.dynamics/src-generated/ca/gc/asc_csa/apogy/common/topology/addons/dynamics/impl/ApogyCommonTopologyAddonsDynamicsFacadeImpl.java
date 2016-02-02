package ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl;
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
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraintSimulationProperties;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractPhysicalBodySimulationProperties;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFacade;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBodyNodeCenterOfMassVisitor;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBodyNodeMassVisitor;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBodyNodeVisitor;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamics Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCommonTopologyAddonsDynamicsFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCommonTopologyAddonsDynamicsFacade 
{
	private static ApogyCommonTopologyAddonsDynamicsFacadeImpl instance;
	
	public static ApogyCommonTopologyAddonsDynamicsFacade getInstance()
	{
		if(instance == null)
		{
			instance =  new ApogyCommonTopologyAddonsDynamicsFacadeImpl();
		}
		
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCommonTopologyAddonsDynamicsFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyAddonsDynamicsPackage.Literals.APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Tuple3d findCenterOfMass(Node root) 
	{
		PhysicalBodyNodeCenterOfMassVisitor visitor = new PhysicalBodyNodeCenterOfMassVisitor();
		visitor.setRoot(root);		
		root.accept(visitor);
		return visitor.getCenterOfMassPosition();		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double findTotalMass(Node root) 
	{
		PhysicalBodyNodeMassVisitor visitor = new PhysicalBodyNodeMassVisitor();		
		root.accept(visitor);
		return visitor.getTotalMass();	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@SuppressWarnings("unchecked")
	public <T extends AbstractPhysicalBodySimulationProperties> T getPhysicalNodeSimulationProperty(PhysicalBody physicalBody, Class<T> propertyType) 
	{		
		for(AbstractPhysicalBodySimulationProperties property : physicalBody.getSimulationProperties())
		{
			if(propertyType.isAssignableFrom(property.getClass()))
			{
				return (T) property;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@SuppressWarnings("unchecked")
	public <T extends AbstractConstraintSimulationProperties> T getConstraintSimulationProperty(AbstractConstraint constraint, Class<T> propertyType) 
	{
		for(AbstractConstraintSimulationProperties property : constraint.getSimulationProperties())
		{
			if(propertyType.isAssignableFrom(property.getClass()))
			{
				return (T) property;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Set<PhysicalBody> getPhysicalBodies(Node root) 
	{
		PhysicalBodyNodeVisitor visitor = new PhysicalBodyNodeVisitor();
		root.accept(visitor);
		return visitor.getPhysicalBodies();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonTopologyAddonsDynamicsPackage.APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE___FIND_CENTER_OF_MASS__NODE:
				return findCenterOfMass((Node)arguments.get(0));
			case ApogyCommonTopologyAddonsDynamicsPackage.APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE___FIND_TOTAL_MASS__NODE:
				return findTotalMass((Node)arguments.get(0));
			case ApogyCommonTopologyAddonsDynamicsPackage.APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE___GET_PHYSICAL_BODIES__NODE:
				return getPhysicalBodies((Node)arguments.get(0));
			case ApogyCommonTopologyAddonsDynamicsPackage.APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE___GET_PHYSICAL_NODE_SIMULATION_PROPERTY__PHYSICALBODY_CLASS:
				return getPhysicalNodeSimulationProperty((PhysicalBody)arguments.get(0), (Class)arguments.get(1));
			case ApogyCommonTopologyAddonsDynamicsPackage.APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE___GET_CONSTRAINT_SIMULATION_PROPERTY__ABSTRACTCONSTRAINT_CLASS:
				return getConstraintSimulationProperty((AbstractConstraint)arguments.get(0), (Class)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}



} //ApogyCommonTopologyAddonsDynamicsFacadeImpl
