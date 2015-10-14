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
public class FovFactoryImpl extends EFactoryImpl implements FovFactory {
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
			case FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE: return createRectangularFrustrumFieldOfViewSamplingShape();
			case FovPackage.FOV_FACADE: return createFOVFacade();
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
