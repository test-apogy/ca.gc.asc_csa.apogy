/**
 * <copyright>
 * </copyright>
 *
 * $Id: DynamicsFacadeImpl.java,v 1.15.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.dynamics.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.addons.dynamics.AbstractConstraint;
import org.eclipse.symphony.common.topology.addons.dynamics.AbstractConstraintSimulationProperties;
import org.eclipse.symphony.common.topology.addons.dynamics.AbstractPhysicalBodySimulationProperties;
import org.eclipse.symphony.common.topology.addons.dynamics.DynamicsFacade;
import org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBody;
import org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBodyNodeCenterOfMassVisitor;
import org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBodyNodeMassVisitor;
import org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBodyNodeVisitor;
import org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamics Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DynamicsFacadeImpl extends MinimalEObjectImpl.Container implements DynamicsFacade 
{
	private static DynamicsFacadeImpl instance;
	
	public static DynamicsFacade getInstance()
	{
		if(instance == null)
		{
			instance =  new DynamicsFacadeImpl();
		}
		
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicsFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyDynamicsPackage.Literals.DYNAMICS_FACADE;
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
			case TopologyDynamicsPackage.DYNAMICS_FACADE___FIND_CENTER_OF_MASS__NODE:
				return findCenterOfMass((Node)arguments.get(0));
			case TopologyDynamicsPackage.DYNAMICS_FACADE___FIND_TOTAL_MASS__NODE:
				return findTotalMass((Node)arguments.get(0));
			case TopologyDynamicsPackage.DYNAMICS_FACADE___GET_PHYSICAL_BODIES__NODE:
				return getPhysicalBodies((Node)arguments.get(0));
			case TopologyDynamicsPackage.DYNAMICS_FACADE___GET_PHYSICAL_NODE_SIMULATION_PROPERTY__PHYSICALBODY_CLASS:
				return getPhysicalNodeSimulationProperty((PhysicalBody)arguments.get(0), (Class)arguments.get(1));
			case TopologyDynamicsPackage.DYNAMICS_FACADE___GET_CONSTRAINT_SIMULATION_PROPERTY__ABSTRACTCONSTRAINT_CLASS:
				return getConstraintSimulationProperty((AbstractConstraint)arguments.get(0), (Class)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}



} //DynamicsFacadeImpl
