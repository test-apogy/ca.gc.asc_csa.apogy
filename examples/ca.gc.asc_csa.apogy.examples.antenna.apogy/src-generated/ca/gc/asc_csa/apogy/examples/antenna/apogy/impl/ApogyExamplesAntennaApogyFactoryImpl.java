package ca.gc.asc_csa.apogy.examples.antenna.apogy.impl;
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
import ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData;
import ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.antenna.apogy.ApogyExamplesAntennaApogyFactory;
import ca.gc.asc_csa.apogy.examples.antenna.apogy.ApogyExamplesAntennaApogyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesAntennaApogyFactoryImpl extends EFactoryImpl implements ApogyExamplesAntennaApogyFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyExamplesAntennaApogyFactory init()
  {
		try {
			ApogyExamplesAntennaApogyFactory theApogyExamplesAntennaApogyFactory = (ApogyExamplesAntennaApogyFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyExamplesAntennaApogyPackage.eNS_URI);
			if (theApogyExamplesAntennaApogyFactory != null) {
				return theApogyExamplesAntennaApogyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyExamplesAntennaApogyFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyExamplesAntennaApogyFactoryImpl()
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
			case ApogyExamplesAntennaApogyPackage.PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER: return createPTUDishAntennaApogySystemApiAdapter();
			case ApogyExamplesAntennaApogyPackage.PTU_DISH_ANTENNA_DATA: return createPTUDishAntennaData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PTUDishAntennaApogySystemApiAdapter createPTUDishAntennaApogySystemApiAdapter()
  {
		PTUDishAntennaApogySystemApiAdapterImpl ptuDishAntennaApogySystemApiAdapter = new PTUDishAntennaApogySystemApiAdapterImpl();
		return ptuDishAntennaApogySystemApiAdapter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PTUDishAntennaData createPTUDishAntennaData()
  {
		PTUDishAntennaDataImpl ptuDishAntennaData = new PTUDishAntennaDataImpl();
		return ptuDishAntennaData;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesAntennaApogyPackage getApogyExamplesAntennaApogyPackage() {
		return (ApogyExamplesAntennaApogyPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyExamplesAntennaApogyPackage getPackage()
  {
		return ApogyExamplesAntennaApogyPackage.eINSTANCE;
	}

} //ApogyExamplesAntennaApogyFactoryImpl
