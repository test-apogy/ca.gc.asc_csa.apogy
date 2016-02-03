package ca.gc.asc_csa.apogy.addons.sensors.pose.impl;
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.addons.sensors.pose.CSVDataLogger;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPoseFacade;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPoseFactory;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyAddonsSensorsPoseFacadeImpl extends MinimalEObjectImpl.Container implements ApogyAddonsSensorsPoseFacade {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyAddonsSensorsPoseFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsPosePackage.Literals.APOGY_ADDONS_SENSORS_POSE_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CSVDataLogger createCSVDataLogger(String fileName) {
		CSVDataLogger logger = ApogyAddonsSensorsPoseFactory.eINSTANCE.createCSVDataLogger();
		logger.setOutputFile(fileName);

		return logger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyAddonsSensorsPosePackage.APOGY_ADDONS_SENSORS_POSE_FACADE___CREATE_CSV_DATA_LOGGER__STRING:
				return createCSVDataLogger((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // ApogyAddonsSensorsPoseFacadeImpl
