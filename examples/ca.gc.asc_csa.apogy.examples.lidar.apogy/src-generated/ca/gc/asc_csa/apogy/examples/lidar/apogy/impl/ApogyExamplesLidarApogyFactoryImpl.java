package ca.gc.asc_csa.apogy.examples.lidar.apogy.impl;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.examples.lidar.apogy.LidarData;
import ca.gc.asc_csa.apogy.examples.lidar.apogy.LidarApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.lidar.apogy.ApogyExamplesLidarApogyFactory;
import ca.gc.asc_csa.apogy.examples.lidar.apogy.ApogyExamplesLidarApogyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesLidarApogyFactoryImpl extends EFactoryImpl implements ApogyExamplesLidarApogyFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyExamplesLidarApogyFactory init()
  {
		try {
			ApogyExamplesLidarApogyFactory theApogyExamplesLidarApogyFactory = (ApogyExamplesLidarApogyFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyExamplesLidarApogyPackage.eNS_URI);
			if (theApogyExamplesLidarApogyFactory != null) {
				return theApogyExamplesLidarApogyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyExamplesLidarApogyFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyExamplesLidarApogyFactoryImpl()
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
			case ApogyExamplesLidarApogyPackage.LIDAR_APOGY_SYSTEM_API_ADAPTER: return createLidarApogySystemApiAdapter();
			case ApogyExamplesLidarApogyPackage.LIDAR_DATA: return createLidarData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LidarApogySystemApiAdapter createLidarApogySystemApiAdapter() {
		LidarApogySystemApiAdapterImpl lidarApogySystemApiAdapter = new LidarApogySystemApiAdapterImpl();
		return lidarApogySystemApiAdapter;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LidarData createLidarData() {
		LidarDataImpl lidarData = new LidarDataImpl();
		return lidarData;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesLidarApogyPackage getApogyExamplesLidarApogyPackage() {
		return (ApogyExamplesLidarApogyPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyExamplesLidarApogyPackage getPackage()
  {
		return ApogyExamplesLidarApogyPackage.eINSTANCE;
	}

} //ApogyExamplesLidarApogyFactoryImpl
