/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.fov.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.asc_csa.apogy.addons.sensors.fov.*;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsFOVFactoryImpl extends EFactoryImpl implements ApogyAddonsSensorsFOVFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyAddonsSensorsFOVFactory init() {
		try {
			ApogyAddonsSensorsFOVFactory theApogyAddonsSensorsFOVFactory = (ApogyAddonsSensorsFOVFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsSensorsFOVPackage.eNS_URI);
			if (theApogyAddonsSensorsFOVFactory != null) {
				return theApogyAddonsSensorsFOVFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsSensorsFOVFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsSensorsFOVFactoryImpl() {
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
			case ApogyAddonsSensorsFOVPackage.FIELD_OF_VIEW: return createFieldOfView();
			case ApogyAddonsSensorsFOVPackage.DISTANCE_RANGE: return createDistanceRange();
			case ApogyAddonsSensorsFOVPackage.ANGULAR_SPAN: return createAngularSpan();
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW: return createRectangularFrustrumFieldOfView();
			case ApogyAddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW: return createConicalFieldOfView();
			case ApogyAddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW: return createCircularSectorFieldOfView();
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE: return createRectangularFrustrumFieldOfViewSamplingShape();
			case ApogyAddonsSensorsFOVPackage.APOGY_ADDONS_SENSORS_FOV_FACADE: return createApogyAddonsSensorsFOVFacade();
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
	 * @generated
	 */
	public RectangularFrustrumFieldOfView createRectangularFrustrumFieldOfView() {
		RectangularFrustrumFieldOfViewImpl rectangularFrustrumFieldOfView = new RectangularFrustrumFieldOfViewImpl();
		return rectangularFrustrumFieldOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConicalFieldOfView createConicalFieldOfView() {
		ConicalFieldOfViewImpl conicalFieldOfView = new ConicalFieldOfViewImpl();
		return conicalFieldOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircularSectorFieldOfView createCircularSectorFieldOfView() {
		CircularSectorFieldOfViewImpl circularSectorFieldOfView = new CircularSectorFieldOfViewImpl();
		return circularSectorFieldOfView;
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
	public ApogyAddonsSensorsFOVFacade createApogyAddonsSensorsFOVFacade() {
		ApogyAddonsSensorsFOVFacadeImpl apogy__AddonsSensorsFOVFacade = new ApogyAddonsSensorsFOVFacadeImpl();
		return apogy__AddonsSensorsFOVFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsSensorsFOVPackage getApogyAddonsSensorsFOVPackage() {
		return (ApogyAddonsSensorsFOVPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyAddonsSensorsFOVPackage getPackage() {
		return ApogyAddonsSensorsFOVPackage.eINSTANCE;
	}

} //ApogyAddonsSensorsFOVFactoryImpl
