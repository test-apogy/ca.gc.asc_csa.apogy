/**
 * Canadian Space Agency 2007.
 *
 * $Id: FovFactoryImpl.java,v 1.7.4.3 2015/09/22 19:39:40 rlarcheveque Exp $
 */
package org.eclipse.symphony.addons.sensors.fov.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.sensors.fov.AngularSpan;
import org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.DistanceRange;
import org.eclipse.symphony.addons.sensors.fov.FOVFacade;
import org.eclipse.symphony.addons.sensors.fov.FieldOfView;
import org.eclipse.symphony.addons.sensors.fov.FovFactory;
import org.eclipse.symphony.addons.sensors.fov.FovPackage;
import org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FovFactoryImpl extends EFactoryImpl implements FovFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FovFactory init() {
		try {
			FovFactory theFovFactory = (FovFactory)EPackage.Registry.INSTANCE.getEFactory(FovPackage.eNS_URI);
			if (theFovFactory != null) {
				return theFovFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FovFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FovFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FovPackage.FIELD_OF_VIEW: return createFieldOfView();
			case FovPackage.DISTANCE_RANGE: return createDistanceRange();
			case FovPackage.ANGULAR_SPAN: return createAngularSpan();
			case FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW: return createRectangularFrustrumFieldOfView();
			case FovPackage.CONICAL_FIELD_OF_VIEW: return createConicalFieldOfView();
			case FovPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW: return createCircularSectorFieldOfView();
			case FovPackage.FOV_FACADE: return createFOVFacade();
			case FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE: return createRectangularFrustrumFieldOfViewSamplingShape();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfView createFieldOfView() {
		FieldOfViewImpl fieldOfView = new FieldOfViewImpl();
		return fieldOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceRange createDistanceRange() {
		DistanceRangeImpl distanceRange = new DistanceRangeImpl();
		return distanceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngularSpan createAngularSpan() {
		AngularSpanImpl angularSpan = new AngularSpanImpl();
		return angularSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public RectangularFrustrumFieldOfView createRectangularFrustrumFieldOfView() 
	{
		RectangularFrustrumFieldOfViewImpl rectangularFrustrumFieldOfView = new RectangularFrustrumFieldOfViewImpl();
		DistanceRange dr = createDistanceRange();
		dr.setMaximumDistance(.5);
		dr.setMaximumDistance(5);
		rectangularFrustrumFieldOfView.setHorizontalFieldOfViewAngle(Math.PI/1.6);
		rectangularFrustrumFieldOfView.setVerticalFieldOfViewAngle(Math.PI/4);
		rectangularFrustrumFieldOfView.setRange(dr);
		return rectangularFrustrumFieldOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public ConicalFieldOfView createConicalFieldOfView() {
		ConicalFieldOfViewImpl conicalFieldOfView = new ConicalFieldOfViewImpl();
		
		DistanceRange range = FovFactory.eINSTANCE.createDistanceRange();
		conicalFieldOfView.setRange(range);		
		
		return conicalFieldOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CircularSectorFieldOfView createCircularSectorFieldOfView() {
		CircularSectorFieldOfViewImpl circularSectorFieldOfView = new CircularSectorFieldOfViewImpl();
		
		DistanceRange range = FovFactory.eINSTANCE.createDistanceRange();
		circularSectorFieldOfView.setRange(range);
		
		AngularSpan angularSpan = FovFactory.eINSTANCE.createAngularSpan();
		circularSectorFieldOfView.setAngularSpan(angularSpan);
				
		return circularSectorFieldOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FOVFacade createFOVFacade()
	{
		FOVFacadeImpl fovFacade = new FOVFacadeImpl();
		return fovFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <PolygonType extends CartesianPolygon> RectangularFrustrumFieldOfViewSamplingShape<PolygonType> createRectangularFrustrumFieldOfViewSamplingShape() {
		RectangularFrustrumFieldOfViewSamplingShapeImpl<PolygonType> rectangularFrustrumFieldOfViewSamplingShape = new RectangularFrustrumFieldOfViewSamplingShapeImpl<PolygonType>();
		return rectangularFrustrumFieldOfViewSamplingShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FovPackage getFovPackage() {
		return (FovPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FovPackage getPackage() {
		return FovPackage.eINSTANCE;
	}

} //FovFactoryImpl
