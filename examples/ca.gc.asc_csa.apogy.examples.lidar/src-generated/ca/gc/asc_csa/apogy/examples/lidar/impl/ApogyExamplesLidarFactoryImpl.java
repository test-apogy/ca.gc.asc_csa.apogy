package ca.gc.asc_csa.apogy.examples.lidar.impl;
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
import ca.gc.asc_csa.apogy.examples.lidar.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesLidarFactoryImpl extends EFactoryImpl implements ApogyExamplesLidarFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyExamplesLidarFactory init()
	{
		try {
			ApogyExamplesLidarFactory theApogyExamplesLidarFactory = (ApogyExamplesLidarFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyExamplesLidarPackage.eNS_URI);
			if (theApogyExamplesLidarFactory != null) {
				return theApogyExamplesLidarFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyExamplesLidarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesLidarFactoryImpl()
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
			case ApogyExamplesLidarPackage.LIDAR_STUB: return createLidarStub();
			case ApogyExamplesLidarPackage.LIDAR_SIMULATED: return createLidarSimulated();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * Returns a new Lidar object, which has the same type as
	 * the given Lidar unit.
	 * 
	 * @param lidar The Lidar unit with a particular implementation. 
	 * @return The new Lidar instance, which has the same type as the other one
	 * @generated_NOT
	 */
	@Override
	public Lidar makeLidarSameType(Lidar lidar)
	{
		// Used to keep track of the new Lidar unit instance
		Lidar newLidar = null;
		
		// If the given Lidar object has a simulated implementation
		if (lidar instanceof LidarSimulated)
		{
			// Create a simulated Lidar object
			newLidar = eINSTANCE.createLidarSimulated();
		}
		// Else if the given Lidar object has a stub implementation
		else if (lidar instanceof LidarStub)
		{
			// Create a stub Lidar object
			newLidar = eINSTANCE.createLidarStub();
		}
		
		// Return the new Lidar instance
		return newLidar;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LidarStub createLidarStub()
	{
		LidarStubImpl lidarStub = new LidarStubImpl();
		return lidarStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LidarSimulated createLidarSimulated() {
		LidarSimulatedImpl lidarSimulated = new LidarSimulatedImpl();
		return lidarSimulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesLidarPackage getApogyExamplesLidarPackage() {
		return (ApogyExamplesLidarPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyExamplesLidarPackage getPackage()
	{
		return ApogyExamplesLidarPackage.eINSTANCE;
	}

} //ApogyExamplesLidarFactoryImpl
