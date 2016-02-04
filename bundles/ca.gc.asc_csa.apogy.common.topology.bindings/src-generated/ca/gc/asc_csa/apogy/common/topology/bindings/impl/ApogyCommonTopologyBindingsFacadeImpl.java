package ca.gc.asc_csa.apogy.common.topology.bindings.impl;
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
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFacade;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCommonTopologyBindingsFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCommonTopologyBindingsFacade
{
	private static ApogyCommonTopologyBindingsFacade instance;

	public static ApogyCommonTopologyBindingsFacade getInstance() {
		if (instance == null) {
			instance = new ApogyCommonTopologyBindingsFacadeImpl();
		}

		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ApogyCommonTopologyBindingsFacadeImpl()
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
		return ApogyCommonTopologyBindingsPackage.Literals.APOGY_COMMON_TOPOLOGY_BINDINGS_FACADE;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public AbstractTopologyBinding copy(AbstractTopologyBinding originalBinding, Map<Node, Node> originalToCopyNodeMap)
  {
	  return originalBinding.clone(originalToCopyNodeMap);	  	
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  @SuppressWarnings("unchecked")
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case ApogyCommonTopologyBindingsPackage.APOGY_COMMON_TOPOLOGY_BINDINGS_FACADE___COPY__ABSTRACTTOPOLOGYBINDING_MAP:
				return copy((AbstractTopologyBinding)arguments.get(0), (Map<Node, Node>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApogyCommonTopologyBindingsFacadeImpl
