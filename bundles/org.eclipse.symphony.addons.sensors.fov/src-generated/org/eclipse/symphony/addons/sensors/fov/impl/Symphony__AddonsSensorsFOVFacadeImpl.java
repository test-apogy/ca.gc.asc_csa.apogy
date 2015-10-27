/**
 * Canadian Space Agency 2007.
 *
 * $Id: Symphony__AddonsSensorsFOVFacadeImpl.java,v 1.4.4.2 2015/05/21 15:51:25 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.fov.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.addons.sensors.fov.AngularSpan;
import org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.DistanceRange;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVFacade;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVFactory;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVPackage;
import org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FOV Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Symphony__AddonsSensorsFOVFacadeImpl extends MinimalEObjectImpl.Container implements Symphony__AddonsSensorsFOVFacade
{
	private static Symphony__AddonsSensorsFOVFacade instance;

	public static Symphony__AddonsSensorsFOVFacade getInstance()
	{
		if (instance == null)
		{
			instance = new Symphony__AddonsSensorsFOVFacadeImpl();
		}

		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Symphony__AddonsSensorsFOVFacadeImpl()
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
		return Symphony__AddonsSensorsFOVPackage.Literals.SYMPHONY_ADDONS_SENSORS_FOV_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public DistanceRange createDistanceRange(double minimumDistance, double maximumDistance)
	{
		DistanceRange distanceRange = Symphony__AddonsSensorsFOVFactory.eINSTANCE.createDistanceRange();
		distanceRange.setMinimumDistance(minimumDistance);
		distanceRange.setMaximumDistance(maximumDistance);		
		return distanceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public DistanceRange createDistanceRange(DistanceRange distanceRange)
	{
		DistanceRange newDistanceRange = Symphony__AddonsSensorsFOVFactory.eINSTANCE.createDistanceRange();
		newDistanceRange.setMinimumDistance(distanceRange.getMinimumDistance());
		newDistanceRange.setMaximumDistance(distanceRange.getMaximumDistance());		
		return newDistanceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AngularSpan createAngularSpan(double minimumAngle, double maximumAngle)
	{
		AngularSpan angularSpan = Symphony__AddonsSensorsFOVFactory.eINSTANCE.createAngularSpan();
		angularSpan.setMinimumAngle(minimumAngle);
		angularSpan.setMaximumAngle(maximumAngle);
		return angularSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AngularSpan createAngularSpan(AngularSpan angularSpan)
	{
		AngularSpan newAngularSpan = Symphony__AddonsSensorsFOVFactory.eINSTANCE.createAngularSpan();
		newAngularSpan.setMinimumAngle(angularSpan.getMinimumAngle());
		newAngularSpan.setMaximumAngle(angularSpan.getMaximumAngle());
		return newAngularSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public RectangularFrustrumFieldOfView createRectangularFrustrumFieldOfView(double minimumDistance, double maximumDistance, double horizontalFieldOfViewAngle, double verticalFieldOfViewAngle)
	{
		RectangularFrustrumFieldOfView rectangularFrustrumFieldOfView = Symphony__AddonsSensorsFOVFactory.eINSTANCE.createRectangularFrustrumFieldOfView();
		DistanceRange distanceRange = createDistanceRange(minimumDistance, maximumDistance);
		rectangularFrustrumFieldOfView.setRange(distanceRange);
		rectangularFrustrumFieldOfView.setHorizontalFieldOfViewAngle(horizontalFieldOfViewAngle);
		rectangularFrustrumFieldOfView.setVerticalFieldOfViewAngle(verticalFieldOfViewAngle);
		return rectangularFrustrumFieldOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public RectangularFrustrumFieldOfView createRectangularFrustrumFieldOfView(RectangularFrustrumFieldOfView rectangularFrustrumFieldOfView)
	{
		RectangularFrustrumFieldOfView newRectangularFrustrumFieldOfView = Symphony__AddonsSensorsFOVFactory.eINSTANCE.createRectangularFrustrumFieldOfView();
		
		if(rectangularFrustrumFieldOfView.getRange() != null)
		{
			DistanceRange distanceRange = createDistanceRange(rectangularFrustrumFieldOfView.getRange());
			newRectangularFrustrumFieldOfView.setRange(distanceRange);
		}
				
		newRectangularFrustrumFieldOfView.setDescription(rectangularFrustrumFieldOfView.getDescription());
		newRectangularFrustrumFieldOfView.setHorizontalFieldOfViewAngle(rectangularFrustrumFieldOfView.getHorizontalFieldOfViewAngle());
		newRectangularFrustrumFieldOfView.setVerticalFieldOfViewAngle(rectangularFrustrumFieldOfView.getVerticalFieldOfViewAngle());
		return newRectangularFrustrumFieldOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public ConicalFieldOfView createConicalFieldOfView(double minimumDistance, double maximumDistance, double fieldOfViewAngle)
	{
		ConicalFieldOfView conicalFieldOfView = Symphony__AddonsSensorsFOVFactory.eINSTANCE.createConicalFieldOfView();
		DistanceRange distanceRange = createDistanceRange(minimumDistance, maximumDistance);
		conicalFieldOfView.setRange(distanceRange);
		conicalFieldOfView.setFieldOfViewAngle(fieldOfViewAngle);		
		return conicalFieldOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public ConicalFieldOfView createConicalFieldOfView(ConicalFieldOfView conicalFieldOfView)
	{
		ConicalFieldOfView newConicalFieldOfView = Symphony__AddonsSensorsFOVFactory.eINSTANCE.createConicalFieldOfView();
		if(conicalFieldOfView.getRange() != null)
		{
			DistanceRange distanceRange = createDistanceRange(conicalFieldOfView.getRange());
			newConicalFieldOfView.setRange(distanceRange);
		}
		newConicalFieldOfView.setFieldOfViewAngle(conicalFieldOfView.getFieldOfViewAngle());
		newConicalFieldOfView.setDescription(conicalFieldOfView.getDescription());
		return newConicalFieldOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CircularSectorFieldOfView createCircularSectorFieldOfView(double minimumAngle, double maximumAngle, double minimumDistance, double maximumDistance)
	{
		CircularSectorFieldOfView circularSectorFieldOfView = Symphony__AddonsSensorsFOVFactory.eINSTANCE.createCircularSectorFieldOfView();
		DistanceRange distanceRange = createDistanceRange(minimumDistance, maximumDistance);
		circularSectorFieldOfView.setRange(distanceRange);		
		AngularSpan angularSpan = createAngularSpan(minimumAngle, maximumAngle);
		circularSectorFieldOfView.setAngularSpan(angularSpan);		
		return circularSectorFieldOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CircularSectorFieldOfView createCircularSectorFieldOfView(CircularSectorFieldOfView circularSectorFieldOfView)
	{
		CircularSectorFieldOfView newcircularSectorFieldOfView = Symphony__AddonsSensorsFOVFactory.eINSTANCE.createCircularSectorFieldOfView();
		
		if(circularSectorFieldOfView.getRange() != null)
		{
			DistanceRange distanceRange = createDistanceRange(circularSectorFieldOfView.getRange());
			newcircularSectorFieldOfView.setRange(distanceRange);
		}
		
		if(circularSectorFieldOfView.getAngularSpan() != null)
		{
			AngularSpan angularSpan = createAngularSpan(circularSectorFieldOfView.getAngularSpan());
			newcircularSectorFieldOfView.setAngularSpan(angularSpan);
		}
		
		newcircularSectorFieldOfView.setDescription(circularSectorFieldOfView.getDescription());
		
		return newcircularSectorFieldOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__AddonsSensorsFOVPackage.SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_DISTANCE_RANGE__DOUBLE_DOUBLE:
				return createDistanceRange((Double)arguments.get(0), (Double)arguments.get(1));
			case Symphony__AddonsSensorsFOVPackage.SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_DISTANCE_RANGE__DISTANCERANGE:
				return createDistanceRange((DistanceRange)arguments.get(0));
			case Symphony__AddonsSensorsFOVPackage.SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_ANGULAR_SPAN__DOUBLE_DOUBLE:
				return createAngularSpan((Double)arguments.get(0), (Double)arguments.get(1));
			case Symphony__AddonsSensorsFOVPackage.SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_ANGULAR_SPAN__ANGULARSPAN:
				return createAngularSpan((AngularSpan)arguments.get(0));
			case Symphony__AddonsSensorsFOVPackage.SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__DOUBLE_DOUBLE_DOUBLE_DOUBLE:
				return createRectangularFrustrumFieldOfView((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3));
			case Symphony__AddonsSensorsFOVPackage.SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RECTANGULARFRUSTRUMFIELDOFVIEW:
				return createRectangularFrustrumFieldOfView((RectangularFrustrumFieldOfView)arguments.get(0));
			case Symphony__AddonsSensorsFOVPackage.SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_CONICAL_FIELD_OF_VIEW__DOUBLE_DOUBLE_DOUBLE:
				return createConicalFieldOfView((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case Symphony__AddonsSensorsFOVPackage.SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_CONICAL_FIELD_OF_VIEW__CONICALFIELDOFVIEW:
				return createConicalFieldOfView((ConicalFieldOfView)arguments.get(0));
			case Symphony__AddonsSensorsFOVPackage.SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_CIRCULAR_SECTOR_FIELD_OF_VIEW__DOUBLE_DOUBLE_DOUBLE_DOUBLE:
				return createCircularSectorFieldOfView((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3));
			case Symphony__AddonsSensorsFOVPackage.SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_CIRCULAR_SECTOR_FIELD_OF_VIEW__CIRCULARSECTORFIELDOFVIEW:
				return createCircularSectorFieldOfView((CircularSectorFieldOfView)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //Symphony__AddonsSensorsFOVFacadeImpl
