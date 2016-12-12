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

import java.util.SortedSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFactory;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage;
import ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode;
import ca.gc.asc_csa.apogy.core.topology.ApogySystemAPIsNode;
import ca.gc.asc_csa.apogy.core.topology.ApogyTopologyController;
import ca.gc.asc_csa.apogy.core.topology.SystemsTopologyAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreTopologyFactoryImpl extends EFactoryImpl implements ApogyCoreTopologyFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyCoreTopologyFactory init()
  {
		try {
			ApogyCoreTopologyFactory theApogyCoreTopologyFactory = (ApogyCoreTopologyFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCoreTopologyPackage.eNS_URI);
			if (theApogyCoreTopologyFactory != null) {
				return theApogyCoreTopologyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreTopologyFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyCoreTopologyFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case ApogyCoreTopologyPackage.APOGY_CORE_TOPOLOGY_FACADE: return createApogyCoreTopologyFacade();
			case ApogyCoreTopologyPackage.APOGY_TOPOLOGY_CONTROLLER: return createApogyTopologyController();
			case ApogyCoreTopologyPackage.SYSTEMS_TOPOLOGY_ADAPTER: return createSystemsTopologyAdapter();
			case ApogyCoreTopologyPackage.APOGY_ENVIRONMENT_NODE: return createApogyEnvironmentNode();
			case ApogyCoreTopologyPackage.APOGY_SYSTEM_AP_IS_NODE: return createApogySystemAPIsNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case ApogyCoreTopologyPackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case ApogyCoreTopologyPackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SystemsTopologyAdapter createSystemsTopologyAdapter()
  {
		SystemsTopologyAdapterImpl systemsTopologyAdapter = new SystemsTopologyAdapterImpl();
		return systemsTopologyAdapter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyEnvironmentNode createApogyEnvironmentNode()
  {
		ApogyEnvironmentNodeImpl apogyEnvironmentNode = new ApogyEnvironmentNodeImpl();
		return apogyEnvironmentNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogySystemAPIsNode createApogySystemAPIsNode()
  {
		ApogySystemAPIsNodeImpl apogySystemAPIsNode = new ApogySystemAPIsNodeImpl();
		return apogySystemAPIsNode;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreTopologyFacade createApogyCoreTopologyFacade() {
		ApogyCoreTopologyFacadeImpl apogyCoreTopologyFacade = new ApogyCoreTopologyFacadeImpl();
		return apogyCoreTopologyFacade;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyTopologyController createApogyTopologyController() {
		ApogyTopologyControllerImpl apogyTopologyController = new ApogyTopologyControllerImpl();
		return apogyTopologyController;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SortedSet<?> createSortedSetFromString(EDataType eDataType, String initialValue)
  {
		return (SortedSet<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertSortedSetToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreTopologyPackage getApogyCoreTopologyPackage() {
		return (ApogyCoreTopologyPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyCoreTopologyPackage getPackage()
  {
		return ApogyCoreTopologyPackage.eINSTANCE;
	}

} //ApogyCoreTopologyFactoryImpl
