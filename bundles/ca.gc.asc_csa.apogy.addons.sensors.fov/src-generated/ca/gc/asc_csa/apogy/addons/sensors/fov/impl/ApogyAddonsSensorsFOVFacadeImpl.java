/**
 * Canadian Space Agency 2007.
 *
 * $Id: ApogyAddonsSensorsFOVFacadeImpl.java,v 1.4.4.2 2015/05/21 15:51:25 pallard Exp $
 */
package ca.gc.asc_csa.apogy.addons.sensors.fov.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.addons.sensors.fov.AngularSpan;
import ca.gc.asc_csa.apogy.addons.sensors.fov.CircularSectorFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ConicalFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.fov.DistanceRange;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVFacade;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVFactory;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage;
import ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FOV Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyAddonsSensorsFOVFacadeImpl extends MinimalEObjectImpl.Container implements ApogyAddonsSensorsFOVFacade
{
	private static ApogyAddonsSensorsFOVFacade instance;

	public static ApogyAddonsSensorsFOVFacade getInstance()
	{
		if (instance == null)
		{
			instance = new ApogyAddonsSensorsFOVFacadeImpl();
		}

		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyAddonsSensorsFOVFacadeImpl()
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
		return ApogyAddonsSensorsFOVPackage.Literals.APOGY_ADDONS_SENSORS_FOV_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public DistanceRange createDistanceRange(double minimumDistance, double maximumDistance)
	{
		DistanceRange distanceRange = ApogyAddonsSensorsFOVFactory.eINSTANCE.createDistanceRange();
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
		DistanceRange newDistanceRange = ApogyAddonsSensorsFOVFactory.eINSTANCE.createDistanceRange();
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
		AngularSpan angularSpan = ApogyAddonsSensorsFOVFactory.eINSTANCE.createAngularSpan();
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
		AngularSpan newAngularSpan = ApogyAddonsSensorsFOVFactory.eINSTANCE.createAngularSpan();
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
		RectangularFrustrumFieldOfView rectangularFrustrumFieldOfView = ApogyAddonsSensorsFOVFactory.eINSTANCE.createRectangularFrustrumFieldOfView();
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
		RectangularFrustrumFieldOfView newRectangularFrustrumFieldOfView = ApogyAddonsSensorsFOVFactory.eINSTANCE.createRectangularFrustrumFieldOfView();
		
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
		ConicalFieldOfView conicalFieldOfView = ApogyAddonsSensorsFOVFactory.eINSTANCE.createConicalFieldOfView();
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
		ConicalFieldOfView newConicalFieldOfView = ApogyAddonsSensorsFOVFactory.eINSTANCE.createConicalFieldOfView();
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
		CircularSectorFieldOfView circularSectorFieldOfView = ApogyAddonsSensorsFOVFactory.eINSTANCE.createCircularSectorFieldOfView();
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
		CircularSectorFieldOfView newcircularSectorFieldOfView = ApogyAddonsSensorsFOVFactory.eINSTANCE.createCircularSectorFieldOfView();
		
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
			case ApogyAddonsSensorsFOVPackage.APOGY_ADDONS_SENSORS_FOV_FACADE___CREATE_DISTANCE_RANGE__DOUBLE_DOUBLE:
				return createDistanceRange((Double)arguments.get(0), (Double)arguments.get(1));
			case ApogyAddonsSensorsFOVPackage.APOGY_ADDONS_SENSORS_FOV_FACADE___CREATE_DISTANCE_RANGE__DISTANCERANGE:
				return createDistanceRange((DistanceRange)arguments.get(0));
			case ApogyAddonsSensorsFOVPackage.APOGY_ADDONS_SENSORS_FOV_FACADE___CREATE_ANGULAR_SPAN__DOUBLE_DOUBLE:
				return createAngularSpan((Double)arguments.get(0), (Double)arguments.get(1));
			case ApogyAddonsSensorsFOVPackage.APOGY_ADDONS_SENSORS_FOV_FACADE___CREATE_ANGULAR_SPAN__ANGULARSPAN:
				return createAngularSpan((AngularSpan)arguments.get(0));
			case ApogyAddonsSensorsFOVPackage.APOGY_ADDONS_SENSORS_FOV_FACADE___CREATE_RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__DOUBLE_DOUBLE_DOUBLE_DOUBLE:
				return createRectangularFrustrumFieldOfView((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3));
			case ApogyAddonsSensorsFOVPackage.APOGY_ADDONS_SENSORS_FOV_FACADE___CREATE_RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RECTANGULARFRUSTRUMFIELDOFVIEW:
				return createRectangularFrustrumFieldOfView((RectangularFrustrumFieldOfView)arguments.get(0));
			case ApogyAddonsSensorsFOVPackage.APOGY_ADDONS_SENSORS_FOV_FACADE___CREATE_CONICAL_FIELD_OF_VIEW__DOUBLE_DOUBLE_DOUBLE:
				return createConicalFieldOfView((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case ApogyAddonsSensorsFOVPackage.APOGY_ADDONS_SENSORS_FOV_FACADE___CREATE_CONICAL_FIELD_OF_VIEW__CONICALFIELDOFVIEW:
				return createConicalFieldOfView((ConicalFieldOfView)arguments.get(0));
			case ApogyAddonsSensorsFOVPackage.APOGY_ADDONS_SENSORS_FOV_FACADE___CREATE_CIRCULAR_SECTOR_FIELD_OF_VIEW__DOUBLE_DOUBLE_DOUBLE_DOUBLE:
				return createCircularSectorFieldOfView((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3));
			case ApogyAddonsSensorsFOVPackage.APOGY_ADDONS_SENSORS_FOV_FACADE___CREATE_CIRCULAR_SECTOR_FIELD_OF_VIEW__CIRCULARSECTORFIELDOFVIEW:
				return createCircularSectorFieldOfView((CircularSectorFieldOfView)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApogyAddonsSensorsFOVFacadeImpl
