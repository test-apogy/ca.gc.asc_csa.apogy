/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.fov.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.symphony.addons.sensors.fov.AngularSpan;
import org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.DistanceRange;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVFacade;
import org.eclipse.symphony.addons.sensors.fov.FieldOfView;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVFactory;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVPackage;
import org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape;

import org.eclipse.symphony.common.geometry.data.Symphony__CommonGeometryDataPackage;

import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;

import org.eclipse.symphony.common.math.Symphony__CommonMathPackage;

import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsSensorsFOVPackageImpl extends EPackageImpl implements Symphony__AddonsSensorsFOVPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldOfViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angularSpanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangularFrustrumFieldOfViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conicalFieldOfViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circularSectorFieldOfViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangularFrustrumFieldOfViewSamplingShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symphony__AddonsSensorsFOVFacadeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__AddonsSensorsFOVPackageImpl() {
		super(eNS_URI, Symphony__AddonsSensorsFOVFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Symphony__AddonsSensorsFOVPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__AddonsSensorsFOVPackage init() {
		if (isInited) return (Symphony__AddonsSensorsFOVPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsSensorsFOVPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__AddonsSensorsFOVPackageImpl theSymphony__AddonsSensorsFOVPackage = (Symphony__AddonsSensorsFOVPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__AddonsSensorsFOVPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__AddonsSensorsFOVPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__CommonTopologyPackage.eINSTANCE.eClass();
		Symphony__CommonGeometryData3DPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__AddonsSensorsFOVPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__AddonsSensorsFOVPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__AddonsSensorsFOVPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__AddonsSensorsFOVPackage.eNS_URI, theSymphony__AddonsSensorsFOVPackage);
		return theSymphony__AddonsSensorsFOVPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldOfView() {
		return fieldOfViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistanceRange() {
		return distanceRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceRange_MinimumDistance() {
		return (EAttribute)distanceRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceRange_MaximumDistance() {
		return (EAttribute)distanceRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceRange_Distance() {
		return (EAttribute)distanceRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistanceRange__IsWithinRange__double() {
		return distanceRangeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngularSpan() {
		return angularSpanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularSpan_MinimumAngle() {
		return (EAttribute)angularSpanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularSpan_MaximumAngle() {
		return (EAttribute)angularSpanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularSpan_SpanningAngle() {
		return (EAttribute)angularSpanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularSpan_CenterAngle() {
		return (EAttribute)angularSpanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAngularSpan__IsWithinRange__double() {
		return angularSpanEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangularFrustrumFieldOfView() {
		return rectangularFrustrumFieldOfViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectangularFrustrumFieldOfView_Range() {
		return (EReference)rectangularFrustrumFieldOfViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularFrustrumFieldOfView_HorizontalFieldOfViewAngle() {
		return (EAttribute)rectangularFrustrumFieldOfViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularFrustrumFieldOfView_VerticalFieldOfViewAngle() {
		return (EAttribute)rectangularFrustrumFieldOfViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularFrustrumFieldOfView_Volume() {
		return (EAttribute)rectangularFrustrumFieldOfViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConicalFieldOfView() {
		return conicalFieldOfViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConicalFieldOfView_Range() {
		return (EReference)conicalFieldOfViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConicalFieldOfView_FieldOfViewAngle() {
		return (EAttribute)conicalFieldOfViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConicalFieldOfView_Volume() {
		return (EAttribute)conicalFieldOfViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircularSectorFieldOfView() {
		return circularSectorFieldOfViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircularSectorFieldOfView_Range() {
		return (EReference)circularSectorFieldOfViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircularSectorFieldOfView_AngularSpan() {
		return (EReference)circularSectorFieldOfViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircularSectorFieldOfView_Area() {
		return (EAttribute)circularSectorFieldOfViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangularFrustrumFieldOfViewSamplingShape() {
		return rectangularFrustrumFieldOfViewSamplingShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectangularFrustrumFieldOfViewSamplingShape_Transform() {
		return (EReference)rectangularFrustrumFieldOfViewSamplingShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectangularFrustrumFieldOfViewSamplingShape_RectangularFrustrumFieldOfView() {
		return (EReference)rectangularFrustrumFieldOfViewSamplingShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymphony__AddonsSensorsFOVFacade() {
		return symphony__AddonsSensorsFOVFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__AddonsSensorsFOVFacade__CreateDistanceRange__double_double() {
		return symphony__AddonsSensorsFOVFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__AddonsSensorsFOVFacade__CreateDistanceRange__DistanceRange() {
		return symphony__AddonsSensorsFOVFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__AddonsSensorsFOVFacade__CreateAngularSpan__double_double() {
		return symphony__AddonsSensorsFOVFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__AddonsSensorsFOVFacade__CreateAngularSpan__AngularSpan() {
		return symphony__AddonsSensorsFOVFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__AddonsSensorsFOVFacade__CreateRectangularFrustrumFieldOfView__double_double_double_double() {
		return symphony__AddonsSensorsFOVFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__AddonsSensorsFOVFacade__CreateRectangularFrustrumFieldOfView__RectangularFrustrumFieldOfView() {
		return symphony__AddonsSensorsFOVFacadeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__AddonsSensorsFOVFacade__CreateConicalFieldOfView__double_double_double() {
		return symphony__AddonsSensorsFOVFacadeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__AddonsSensorsFOVFacade__CreateConicalFieldOfView__ConicalFieldOfView() {
		return symphony__AddonsSensorsFOVFacadeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__AddonsSensorsFOVFacade__CreateCircularSectorFieldOfView__double_double_double_double() {
		return symphony__AddonsSensorsFOVFacadeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__AddonsSensorsFOVFacade__CreateCircularSectorFieldOfView__CircularSectorFieldOfView() {
		return symphony__AddonsSensorsFOVFacadeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsSensorsFOVFactory getSymphony__AddonsSensorsFOVFactory() {
		return (Symphony__AddonsSensorsFOVFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		fieldOfViewEClass = createEClass(FIELD_OF_VIEW);

		distanceRangeEClass = createEClass(DISTANCE_RANGE);
		createEAttribute(distanceRangeEClass, DISTANCE_RANGE__MINIMUM_DISTANCE);
		createEAttribute(distanceRangeEClass, DISTANCE_RANGE__MAXIMUM_DISTANCE);
		createEAttribute(distanceRangeEClass, DISTANCE_RANGE__DISTANCE);
		createEOperation(distanceRangeEClass, DISTANCE_RANGE___IS_WITHIN_RANGE__DOUBLE);

		angularSpanEClass = createEClass(ANGULAR_SPAN);
		createEAttribute(angularSpanEClass, ANGULAR_SPAN__MINIMUM_ANGLE);
		createEAttribute(angularSpanEClass, ANGULAR_SPAN__MAXIMUM_ANGLE);
		createEAttribute(angularSpanEClass, ANGULAR_SPAN__SPANNING_ANGLE);
		createEAttribute(angularSpanEClass, ANGULAR_SPAN__CENTER_ANGLE);
		createEOperation(angularSpanEClass, ANGULAR_SPAN___IS_WITHIN_RANGE__DOUBLE);

		rectangularFrustrumFieldOfViewEClass = createEClass(RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW);
		createEReference(rectangularFrustrumFieldOfViewEClass, RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RANGE);
		createEAttribute(rectangularFrustrumFieldOfViewEClass, RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__HORIZONTAL_FIELD_OF_VIEW_ANGLE);
		createEAttribute(rectangularFrustrumFieldOfViewEClass, RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VERTICAL_FIELD_OF_VIEW_ANGLE);
		createEAttribute(rectangularFrustrumFieldOfViewEClass, RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VOLUME);

		conicalFieldOfViewEClass = createEClass(CONICAL_FIELD_OF_VIEW);
		createEReference(conicalFieldOfViewEClass, CONICAL_FIELD_OF_VIEW__RANGE);
		createEAttribute(conicalFieldOfViewEClass, CONICAL_FIELD_OF_VIEW__FIELD_OF_VIEW_ANGLE);
		createEAttribute(conicalFieldOfViewEClass, CONICAL_FIELD_OF_VIEW__VOLUME);

		circularSectorFieldOfViewEClass = createEClass(CIRCULAR_SECTOR_FIELD_OF_VIEW);
		createEReference(circularSectorFieldOfViewEClass, CIRCULAR_SECTOR_FIELD_OF_VIEW__RANGE);
		createEReference(circularSectorFieldOfViewEClass, CIRCULAR_SECTOR_FIELD_OF_VIEW__ANGULAR_SPAN);
		createEAttribute(circularSectorFieldOfViewEClass, CIRCULAR_SECTOR_FIELD_OF_VIEW__AREA);

		rectangularFrustrumFieldOfViewSamplingShapeEClass = createEClass(RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE);
		createEReference(rectangularFrustrumFieldOfViewSamplingShapeEClass, RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__TRANSFORM);
		createEReference(rectangularFrustrumFieldOfViewSamplingShapeEClass, RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW);

		symphony__AddonsSensorsFOVFacadeEClass = createEClass(SYMPHONY_ADDONS_SENSORS_FOV_FACADE);
		createEOperation(symphony__AddonsSensorsFOVFacadeEClass, SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_DISTANCE_RANGE__DOUBLE_DOUBLE);
		createEOperation(symphony__AddonsSensorsFOVFacadeEClass, SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_DISTANCE_RANGE__DISTANCERANGE);
		createEOperation(symphony__AddonsSensorsFOVFacadeEClass, SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_ANGULAR_SPAN__DOUBLE_DOUBLE);
		createEOperation(symphony__AddonsSensorsFOVFacadeEClass, SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_ANGULAR_SPAN__ANGULARSPAN);
		createEOperation(symphony__AddonsSensorsFOVFacadeEClass, SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(symphony__AddonsSensorsFOVFacadeEClass, SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RECTANGULARFRUSTRUMFIELDOFVIEW);
		createEOperation(symphony__AddonsSensorsFOVFacadeEClass, SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_CONICAL_FIELD_OF_VIEW__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(symphony__AddonsSensorsFOVFacadeEClass, SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_CONICAL_FIELD_OF_VIEW__CONICALFIELDOFVIEW);
		createEOperation(symphony__AddonsSensorsFOVFacadeEClass, SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_CIRCULAR_SECTOR_FIELD_OF_VIEW__DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(symphony__AddonsSensorsFOVFacadeEClass, SYMPHONY_ADDONS_SENSORS_FOV_FACADE___CREATE_CIRCULAR_SECTOR_FIELD_OF_VIEW__CIRCULARSECTORFIELDOFVIEW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Symphony__CommonTopologyPackage theSymphony__CommonTopologyPackage = (Symphony__CommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonTopologyPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		Symphony__CommonGeometryData3DPackage theSymphony__CommonGeometryData3DPackage = (Symphony__CommonGeometryData3DPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonGeometryData3DPackage.eNS_URI);
		Symphony__CommonGeometryDataPackage theSymphony__CommonGeometryDataPackage = (Symphony__CommonGeometryDataPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonGeometryDataPackage.eNS_URI);
		Symphony__CommonMathPackage theSymphony__CommonMathPackage = (Symphony__CommonMathPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonMathPackage.eNS_URI);

		// Create type parameters
		ETypeParameter rectangularFrustrumFieldOfViewSamplingShapeEClass_PolygonType = addETypeParameter(rectangularFrustrumFieldOfViewSamplingShapeEClass, "PolygonType");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theSymphony__CommonGeometryData3DPackage.getCartesianPolygon());
		rectangularFrustrumFieldOfViewSamplingShapeEClass_PolygonType.getEBounds().add(g1);

		// Add supertypes to classes
		fieldOfViewEClass.getESuperTypes().add(theSymphony__CommonTopologyPackage.getNode());
		rectangularFrustrumFieldOfViewEClass.getESuperTypes().add(this.getFieldOfView());
		conicalFieldOfViewEClass.getESuperTypes().add(this.getFieldOfView());
		circularSectorFieldOfViewEClass.getESuperTypes().add(this.getFieldOfView());
		g1 = createEGenericType(theSymphony__CommonGeometryDataPackage.getCoordinatesSamplingShape());
		EGenericType g2 = createEGenericType(theSymphony__CommonGeometryData3DPackage.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		rectangularFrustrumFieldOfViewSamplingShapeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theSymphony__CommonGeometryDataPackage.getPolygonSamplingShape());
		g2 = createEGenericType(theSymphony__CommonGeometryData3DPackage.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(rectangularFrustrumFieldOfViewSamplingShapeEClass_PolygonType);
		g1.getETypeArguments().add(g2);
		rectangularFrustrumFieldOfViewSamplingShapeEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(fieldOfViewEClass, FieldOfView.class, "FieldOfView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(distanceRangeEClass, DistanceRange.class, "DistanceRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistanceRange_MinimumDistance(), theEcorePackage.getEDouble(), "minimumDistance", "0.0", 0, 1, DistanceRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceRange_MaximumDistance(), theEcorePackage.getEDouble(), "maximumDistance", "1.0", 0, 1, DistanceRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceRange_Distance(), theEcorePackage.getEDouble(), "distance", null, 0, 1, DistanceRange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDistanceRange__IsWithinRange__double(), theEcorePackage.getEBoolean(), "isWithinRange", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "distance", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(angularSpanEClass, AngularSpan.class, "AngularSpan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAngularSpan_MinimumAngle(), theEcorePackage.getEDouble(), "minimumAngle", "0.0", 0, 1, AngularSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngularSpan_MaximumAngle(), theEcorePackage.getEDouble(), "maximumAngle", "0.0", 0, 1, AngularSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngularSpan_SpanningAngle(), theEcorePackage.getEDouble(), "spanningAngle", null, 0, 1, AngularSpan.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngularSpan_CenterAngle(), theEcorePackage.getEDouble(), "centerAngle", null, 0, 1, AngularSpan.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAngularSpan__IsWithinRange__double(), theEcorePackage.getEBoolean(), "isWithinRange", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "angle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rectangularFrustrumFieldOfViewEClass, RectangularFrustrumFieldOfView.class, "RectangularFrustrumFieldOfView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRectangularFrustrumFieldOfView_Range(), this.getDistanceRange(), null, "range", null, 0, 1, RectangularFrustrumFieldOfView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularFrustrumFieldOfView_HorizontalFieldOfViewAngle(), theEcorePackage.getEDouble(), "horizontalFieldOfViewAngle", null, 0, 1, RectangularFrustrumFieldOfView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularFrustrumFieldOfView_VerticalFieldOfViewAngle(), theEcorePackage.getEDouble(), "verticalFieldOfViewAngle", null, 0, 1, RectangularFrustrumFieldOfView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularFrustrumFieldOfView_Volume(), theEcorePackage.getEDouble(), "volume", null, 0, 1, RectangularFrustrumFieldOfView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(conicalFieldOfViewEClass, ConicalFieldOfView.class, "ConicalFieldOfView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConicalFieldOfView_Range(), this.getDistanceRange(), null, "range", null, 0, 1, ConicalFieldOfView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConicalFieldOfView_FieldOfViewAngle(), theEcorePackage.getEDouble(), "fieldOfViewAngle", null, 0, 1, ConicalFieldOfView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConicalFieldOfView_Volume(), theEcorePackage.getEDouble(), "volume", null, 0, 1, ConicalFieldOfView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(circularSectorFieldOfViewEClass, CircularSectorFieldOfView.class, "CircularSectorFieldOfView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCircularSectorFieldOfView_Range(), this.getDistanceRange(), null, "range", null, 0, 1, CircularSectorFieldOfView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCircularSectorFieldOfView_AngularSpan(), this.getAngularSpan(), null, "angularSpan", null, 1, 1, CircularSectorFieldOfView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircularSectorFieldOfView_Area(), theEcorePackage.getEDouble(), "area", null, 0, 1, CircularSectorFieldOfView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rectangularFrustrumFieldOfViewSamplingShapeEClass, RectangularFrustrumFieldOfViewSamplingShape.class, "RectangularFrustrumFieldOfViewSamplingShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRectangularFrustrumFieldOfViewSamplingShape_Transform(), theSymphony__CommonMathPackage.getMatrix4x4(), null, "transform", null, 0, 1, RectangularFrustrumFieldOfViewSamplingShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRectangularFrustrumFieldOfViewSamplingShape_RectangularFrustrumFieldOfView(), this.getRectangularFrustrumFieldOfView(), null, "rectangularFrustrumFieldOfView", null, 0, 1, RectangularFrustrumFieldOfViewSamplingShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symphony__AddonsSensorsFOVFacadeEClass, Symphony__AddonsSensorsFOVFacade.class, "Symphony__AddonsSensorsFOVFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSymphony__AddonsSensorsFOVFacade__CreateDistanceRange__double_double(), this.getDistanceRange(), "createDistanceRange", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "minimumDistance", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "maximumDistance", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__AddonsSensorsFOVFacade__CreateDistanceRange__DistanceRange(), this.getDistanceRange(), "createDistanceRange", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDistanceRange(), "distanceRange", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__AddonsSensorsFOVFacade__CreateAngularSpan__double_double(), this.getAngularSpan(), "createAngularSpan", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "minimumAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "maximumAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__AddonsSensorsFOVFacade__CreateAngularSpan__AngularSpan(), this.getAngularSpan(), "createAngularSpan", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAngularSpan(), "angularSpan", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__AddonsSensorsFOVFacade__CreateRectangularFrustrumFieldOfView__double_double_double_double(), this.getRectangularFrustrumFieldOfView(), "createRectangularFrustrumFieldOfView", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "minimumDistance", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "maximumDistance", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "horizontalFieldOfViewAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "verticalFieldOfViewAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__AddonsSensorsFOVFacade__CreateRectangularFrustrumFieldOfView__RectangularFrustrumFieldOfView(), this.getRectangularFrustrumFieldOfView(), "createRectangularFrustrumFieldOfView", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRectangularFrustrumFieldOfView(), "rectangularFrustrumFieldOfView", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__AddonsSensorsFOVFacade__CreateConicalFieldOfView__double_double_double(), this.getConicalFieldOfView(), "createConicalFieldOfView", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "minimumDistance", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "maximumDistance", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "fieldOfViewAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__AddonsSensorsFOVFacade__CreateConicalFieldOfView__ConicalFieldOfView(), this.getConicalFieldOfView(), "createConicalFieldOfView", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConicalFieldOfView(), "conicalFieldOfView", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__AddonsSensorsFOVFacade__CreateCircularSectorFieldOfView__double_double_double_double(), this.getCircularSectorFieldOfView(), "createCircularSectorFieldOfView", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "minimumAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "maximumAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "minimumDistance", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "maximumDistance", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__AddonsSensorsFOVFacade__CreateCircularSectorFieldOfView__CircularSectorFieldOfView(), this.getCircularSectorFieldOfView(), "createCircularSectorFieldOfView", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCircularSectorFieldOfView(), "circularSectorFieldOfView", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "prefix", "Symphony__AddonsSensorsFOV",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)",
			 "modelName", "Symphony__AddonsSensorsFOV",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.addons.sensors.fov/src-generated",
			 "editDirectory", "/org.eclipse.symphony.addons.sensors.fov.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.addons.sensors"
		   });	
		addAnnotation
		  (distanceRangeEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines an distance range by specifying a minimum and maximum distance."
		   });	
		addAnnotation
		  (getDistanceRange__IsWithinRange__double(), 
		   source, 
		   new String[] {
			 "documentation", "Returns whether or not the specified distance falls within the range."
		   });	
		addAnnotation
		  (angularSpanEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines an angular span by specifying a maximum and a minimum angle (in radians)."
		   });	
		addAnnotation
		  (getAngularSpan__IsWithinRange__double(), 
		   source, 
		   new String[] {
			 "documentation", "Returns whether or not the specified angle (in radians) falls within the angular range."
		   });	
		addAnnotation
		  (getAngularSpan_MinimumAngle(), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getAngularSpan_MaximumAngle(), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getAngularSpan_SpanningAngle(), 
		   source, 
		   new String[] {
			 "documentation", "The total angular span, in radians.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getAngularSpan_CenterAngle(), 
		   source, 
		   new String[] {
			 "documentation", "The center of the angular span, in radians.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (rectangularFrustrumFieldOfViewEClass, 
		   source, 
		   new String[] {
			 "documentation", "A field of view that has a frustrum shape. This frustrum has a\nrectangular base and is right (its axis is perpendicular to both bases).\nSee http://en.wikipedia.org/wiki/Frustrum."
		   });	
		addAnnotation
		  (getRectangularFrustrumFieldOfView_HorizontalFieldOfViewAngle(), 
		   source, 
		   new String[] {
			 "documentation", "Total horizontal field of view, in radians.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getRectangularFrustrumFieldOfView_VerticalFieldOfViewAngle(), 
		   source, 
		   new String[] {
			 "documentation", "Total vertical field of view, in radians.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getRectangularFrustrumFieldOfView_Volume(), 
		   source, 
		   new String[] {
			 "documentation", "The volume of the contained within the field of view."
		   });	
		addAnnotation
		  (conicalFieldOfViewEClass, 
		   source, 
		   new String[] {
			 "documentation", "A conical field of view defined by its apex angle."
		   });	
		addAnnotation
		  (getConicalFieldOfView_FieldOfViewAngle(), 
		   source, 
		   new String[] {
			 "documentation", "The apex angle, in radians, of the conical field of view.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getConicalFieldOfView_Volume(), 
		   source, 
		   new String[] {
			 "documentation", "The volume of the contained within the field of view."
		   });	
		addAnnotation
		  (circularSectorFieldOfViewEClass, 
		   source, 
		   new String[] {
			 "documentation", "A field of view shaped like a circular sector;\nfor more info, see http://en.wikipedia.org/wiki/Circular_sector."
		   });	
		addAnnotation
		  (getCircularSectorFieldOfView_Area(), 
		   source, 
		   new String[] {
			 "documentation", "The area of the circular sector."
		   });
	}

} //Symphony__AddonsSensorsFOVPackageImpl