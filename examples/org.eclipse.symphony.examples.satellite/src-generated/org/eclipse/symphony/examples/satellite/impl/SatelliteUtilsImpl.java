/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatelliteFactory;
import org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage;
import org.eclipse.symphony.examples.satellite.ImageOrder;
import org.eclipse.symphony.examples.satellite.Satellite;
import org.eclipse.symphony.examples.satellite.SatelliteCommandAcquireImage;
import org.eclipse.symphony.examples.satellite.SatelliteCommandRoll;
import org.eclipse.symphony.examples.satellite.SatelliteUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satellite Utils</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SatelliteUtilsImpl extends MinimalEObjectImpl.Container implements SatelliteUtils 
{
	private static SatelliteUtils instance = null;
	
	public static SatelliteUtils getInstance()
	{
		if(instance == null)
		{
			instance = new SatelliteUtilsImpl();
		}
		
		return instance;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatelliteUtilsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__ExamplesSatellitePackage.Literals.SATELLITE_UTILS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public SatelliteCommandRoll createSatelliteCommandRoll(Satellite satellite, Date startTime, double rollAngle) 
	{
		SatelliteCommandRoll cmd = Symphony__ExamplesSatelliteFactory.eINSTANCE.createSatelliteCommandRoll();
		
		cmd.setCommandStartTime(startTime);
		cmd.setSatellite(satellite);
		cmd.setTargetRollAngle(rollAngle);
		
		return cmd;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public SatelliteCommandAcquireImage createSatelliteCommandAcquireImage(Satellite satellite, Date imageTime, ImageOrder imageOrder) 
	{
		SatelliteCommandAcquireImage cmd = Symphony__ExamplesSatelliteFactory.eINSTANCE.createSatelliteCommandAcquireImage();
		
		cmd.setCommandStartTime(imageTime);
		cmd.setSatellite(satellite);
		cmd.setImageOrder(imageOrder);
		
		return cmd;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public SortedSet<ImageOrder> sortImageOrderByPriority(List<ImageOrder> imageOrders) 
	{
		SortedSet<ImageOrder> sortedSet = new TreeSet<ImageOrder>(new ImageOrderPriorityComparator());
		sortedSet.addAll(imageOrders);
		return sortedSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__ExamplesSatellitePackage.SATELLITE_UTILS___CREATE_SATELLITE_COMMAND_ROLL__SATELLITE_DATE_DOUBLE:
				return createSatelliteCommandRoll((Satellite)arguments.get(0), (Date)arguments.get(1), (Double)arguments.get(2));
			case Symphony__ExamplesSatellitePackage.SATELLITE_UTILS___CREATE_SATELLITE_COMMAND_ACQUIRE_IMAGE__SATELLITE_DATE_IMAGEORDER:
				return createSatelliteCommandAcquireImage((Satellite)arguments.get(0), (Date)arguments.get(1), (ImageOrder)arguments.get(2));
			case Symphony__ExamplesSatellitePackage.SATELLITE_UTILS___SORT_IMAGE_ORDER_BY_PRIORITY__LIST:
				return sortImageOrderByPriority((List<ImageOrder>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	private class ImageOrderPriorityComparator implements Comparator<ImageOrder>
	{
		@Override
		public int compare(ImageOrder arg0, ImageOrder arg1) 
		{
			if(arg0.getPriority() > arg1.getPriority())
			{
				return 1;
			}
			else if(arg0.getPriority() < arg1.getPriority())
			{
				return -1;
			}
			else
			{
				return arg0.getOrderId() - arg1.getOrderId();
			}
		}
		
	}
} //SatelliteUtilsImpl
