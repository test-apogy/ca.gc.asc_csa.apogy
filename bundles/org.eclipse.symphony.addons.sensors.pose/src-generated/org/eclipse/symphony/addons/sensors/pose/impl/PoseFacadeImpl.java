/**
 * Canadian Space Agency 2007.
 *
 * $Id: PoseFacadeImpl.java,v 1.6.4.2 2015/05/21 15:51:31 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.pose.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.addons.sensors.pose.CSVDataLogger;
import org.eclipse.symphony.addons.sensors.pose.PoseFacade;
import org.eclipse.symphony.addons.sensors.pose.Symphony__AddonsSensorsPoseFactory;
import org.eclipse.symphony.addons.sensors.pose.Symphony__AddonsSensorsPosePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class PoseFacadeImpl extends MinimalEObjectImpl.Container implements PoseFacade {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PoseFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsSensorsPosePackage.Literals.POSE_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CSVDataLogger createCSVDataLogger(String fileName) {
		CSVDataLogger logger = Symphony__AddonsSensorsPoseFactory.eINSTANCE.createCSVDataLogger();
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
			case Symphony__AddonsSensorsPosePackage.POSE_FACADE___CREATE_CSV_DATA_LOGGER__STRING:
				return createCSVDataLogger((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // PoseFacadeImpl
