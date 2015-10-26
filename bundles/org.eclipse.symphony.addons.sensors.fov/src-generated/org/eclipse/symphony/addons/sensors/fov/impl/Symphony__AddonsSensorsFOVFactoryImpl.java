/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.fov.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.symphony.addons.sensors.fov.*;

import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsSensorsFOVFactoryImpl extends EFactoryImpl implements Symphony__AddonsSensorsFOVFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__AddonsSensorsFOVFactory init() {
		try {
			Symphony__AddonsSensorsFOVFactory theSymphony__AddonsSensorsFOVFactory = (Symphony__AddonsSensorsFOVFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsSensorsFOVPackage.eNS_URI);
			if (theSymphony__AddonsSensorsFOVFactory != null) {
				return theSymphony__AddonsSensorsFOVFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsSensorsFOVFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsSensorsFOVFactoryImpl() {
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
			case Symphony__AddonsSensorsFOVPackage.FIELD_OF_VIEW: return createFieldOfView();
			case Symphony__AddonsSensorsFOVPackage.DISTANCE_RANGE: return createDistanceRange();
			case Symphony__AddonsSensorsFOVPackage.ANGULAR_SPAN: return createAngularSpan();
			case Symphony__AddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW: return createRectangularFrustrumFieldOfView();
			case Symphony__AddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW: return createConicalFieldOfView();
			case Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW: return createCircularSectorFieldOfView();
			case Symphony__AddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE: return createRectangularFrustrumFieldOfViewSamplingShape();
			case Symphony__AddonsSensorsFOVPackage.FOV_FACADE: return createFOVFacade();
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
	public FOVFacade createFOVFacade() {
		FOVFacadeImpl fovFacade = new FOVFacadeImpl();
		return fovFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsSensorsFOVPackage getSymphony__AddonsSensorsFOVPackage() {
		return (Symphony__AddonsSensorsFOVPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__AddonsSensorsFOVPackage getPackage() {
		return Symphony__AddonsSensorsFOVPackage.eINSTANCE;
	}

} //Symphony__AddonsSensorsFOVFactoryImpl
