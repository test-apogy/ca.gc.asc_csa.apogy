package ca.gc.asc_csa.apogy.examples.lander.apogy.impl;
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
import ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData;
import ca.gc.asc_csa.apogy.examples.lander.apogy.LanderApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyFactory;
import ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesLanderApogyFactoryImpl extends EFactoryImpl implements ApogyExamplesLanderApogyFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyExamplesLanderApogyFactory init()
  {
		try {
			ApogyExamplesLanderApogyFactory theApogyExamplesLanderApogyFactory = (ApogyExamplesLanderApogyFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyExamplesLanderApogyPackage.eNS_URI);
			if (theApogyExamplesLanderApogyFactory != null) {
				return theApogyExamplesLanderApogyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyExamplesLanderApogyFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyExamplesLanderApogyFactoryImpl()
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
			case ApogyExamplesLanderApogyPackage.LANDER_APOGY_SYSTEM_API_ADAPTER: return createLanderApogySystemApiAdapter();
			case ApogyExamplesLanderApogyPackage.LANDER_DATA: return createLanderData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LanderApogySystemApiAdapter createLanderApogySystemApiAdapter()
  {
		LanderApogySystemApiAdapterImpl landerApogySystemApiAdapter = new LanderApogySystemApiAdapterImpl();
		return landerApogySystemApiAdapter;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanderData createLanderData() {
		LanderDataImpl landerData = new LanderDataImpl();
		return landerData;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesLanderApogyPackage getApogyExamplesLanderApogyPackage() {
		return (ApogyExamplesLanderApogyPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyExamplesLanderApogyPackage getPackage()
  {
		return ApogyExamplesLanderApogyPackage.eINSTANCE;
	}

} //ApogyExamplesLanderApogyFactoryImpl
