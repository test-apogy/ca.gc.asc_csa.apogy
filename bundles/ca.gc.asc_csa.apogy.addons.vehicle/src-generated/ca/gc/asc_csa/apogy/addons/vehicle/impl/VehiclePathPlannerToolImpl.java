package ca.gc.asc_csa.apogy.addons.vehicle.impl;
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

import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage;
import ca.gc.asc_csa.apogy.addons.vehicle.VehiclePathPlannerTool;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection;
import ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Path Planner Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.VehiclePathPlannerToolImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehiclePathPlannerToolImpl extends PathPlannerToolImpl implements VehiclePathPlannerTool {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehiclePathPlannerToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsVehiclePackage.Literals.VEHICLE_PATH_PLANNER_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsVehiclePackage.VEHICLE_PATH_PLANNER_TOOL__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsVehiclePackage.VEHICLE_PATH_PLANNER_TOOL__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsVehiclePackage.VEHICLE_PATH_PLANNER_TOOL__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
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
			case ApogyAddonsVehiclePackage.VEHICLE_PATH_PLANNER_TOOL__VARIABLE:
				setVariable((Variable)newValue);
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
			case ApogyAddonsVehiclePackage.VEHICLE_PATH_PLANNER_TOOL__VARIABLE:
				setVariable((Variable)null);
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
			case ApogyAddonsVehiclePackage.VEHICLE_PATH_PLANNER_TOOL__VARIABLE:
				return variable != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public boolean isFromNodeLock() 
	{
		return true;
	}

	public void selectionChanged(NodeSelection nodeSelection) 
	{
		if(!isDisposed())
		{
			Node node = nodeSelection.getSelectedNode();
			
			Tuple3d relativePosition = null;
			if(nodeSelection.getRelativeIntersectionPoint() != null)
			{
				relativePosition = ApogyCommonMathFacade.INSTANCE.createTuple3d(nodeSelection.getRelativeIntersectionPoint());
			}
			
			Tuple3d normal = null;
			if(nodeSelection.getAbsoluteIntersectionNormal() != null)
			{				
				normal = ApogyCommonMathFacade.INSTANCE.createTuple3d(nodeSelection.getAbsoluteIntersectionNormal().x, nodeSelection.getAbsoluteIntersectionNormal().y, nodeSelection.getAbsoluteIntersectionNormal().z);
			}
			
			// Always update to Node. From node is the vehicle.
			updateToNode(node, relativePosition, normal);									
		}
	};
	
	@Override
	public Tuple3d getFromAbsolutePosition() 
	{
		if(getVariable() != null)
		{
			try
			{
				// Resolve the variable so as to get is pose provider.
				VariableImplementation variableImplementation = getVariable().getEnvironment().getActiveContext().getVariableImplementationsList().getVariableImplementation(getVariable());
				if(variableImplementation.getAdapterInstance() instanceof ApogySystemApiAdapter)
				{
					ApogySystemApiAdapter apogySystemApiAdapter = (ApogySystemApiAdapter) variableImplementation.getAdapterInstance();
					
					Matrix4d m = null;				
					if(apogySystemApiAdapter.getPoseTransform() != null)
					{					
						m = apogySystemApiAdapter.getPoseTransform().asMatrix4d();
					}
					else
					{
						m = new Matrix4d();
						m.setIdentity();
					}
					Vector3d v = new Vector3d();
					m.get(v);
					
					return ApogyCommonMathFacade.INSTANCE.createTuple3d(v);
				}
			}
			catch(Throwable t)
			{
				t.printStackTrace();
			}
		}
		return super.getFromAbsolutePosition();
	}
} //VehiclePathPlannerToolImpl
