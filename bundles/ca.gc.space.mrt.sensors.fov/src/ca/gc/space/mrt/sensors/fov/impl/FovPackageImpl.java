/**
 * Canadian Space Agency 2007.
 *
 * $Id: FovPackageImpl.java,v 1.5.4.2 2015/05/21 15:51:25 pallard Exp $
 */
package ca.gc.space.mrt.sensors.fov.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.geometry.data.DataPackage;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.eclipse.symphony.common.math.MathPackage;

import ca.gc.space.mrt.sensors.fov.AngularSpan;
import ca.gc.space.mrt.sensors.fov.CircularSectorFieldOfView;
import ca.gc.space.mrt.sensors.fov.ConicalFieldOfView;
import ca.gc.space.mrt.sensors.fov.DistanceRange;
import ca.gc.space.mrt.sensors.fov.FOVFacade;
import ca.gc.space.mrt.sensors.fov.FieldOfView;
import ca.gc.space.mrt.sensors.fov.FovFactory;
import ca.gc.space.mrt.sensors.fov.FovPackage;
import ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape;
import ca.gc.space.topology.TopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FovPackageImpl extends EPackageImpl implements FovPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

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
	private EClass fovFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangularFrustrumFieldOfViewSamplingShapeEClass = null;

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
	 * @see ca.gc.space.mrt.sensors.fov.FovPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FovPackageImpl() {
		super(eNS_URI, FovFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FovPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FovPackage init() {
		if (isInited) return (FovPackage)EPackage.Registry.INSTANCE.getEPackage(FovPackage.eNS_URI);

		// Obtain or create and register package
		FovPackageImpl theFovPackage = (FovPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FovPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FovPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Data3dPackage.eINSTANCE.eClass();
		TopologyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFovPackage.createPackageContents();

		// Initialize created meta-data
		theFovPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFovPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FovPackage.eNS_URI, theFovPackage);
		return theFovPackage;
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
	public EAttribute getDistanceRange_Distance()
	{
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
	public EAttribute getAngularSpan_SpanningAngle()
	{
		return (EAttribute)angularSpanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularSpan_CenterAngle()
	{
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
	public EAttribute getConicalFieldOfView_FieldOfViewAngle() {
		return (EAttribute)conicalFieldOfViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConicalFieldOfView_Range() {
		return (EReference)conicalFieldOfViewEClass.getEStructuralFeatures().get(1);
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
	public EReference getCircularSectorFieldOfView_AngularSpan() {
		return (EReference)circularSectorFieldOfViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircularSectorFieldOfView_Range() {
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
	public EClass getFOVFacade()
	{
		return fovFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFOVFacade__CreateDistanceRange__double_double() {
		return fovFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFOVFacade__CreateDistanceRange__DistanceRange() {
		return fovFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFOVFacade__CreateAngularSpan__double_double() {
		return fovFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFOVFacade__CreateAngularSpan__AngularSpan() {
		return fovFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFOVFacade__CreateRectangularFrustrumFieldOfView__double_double_double_double() {
		return fovFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFOVFacade__CreateRectangularFrustrumFieldOfView__RectangularFrustrumFieldOfView() {
		return fovFacadeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFOVFacade__CreateConicalFieldOfView__double_double_double() {
		return fovFacadeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFOVFacade__CreateConicalFieldOfView__ConicalFieldOfView() {
		return fovFacadeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFOVFacade__CreateCircularSectorFieldOfView__double_double_double_double() {
		return fovFacadeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFOVFacade__CreateCircularSectorFieldOfView__CircularSectorFieldOfView() {
		return fovFacadeEClass.getEOperations().get(9);
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
	public FovFactory getFovFactory() {
		return (FovFactory)getEFactoryInstance();
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
		createEAttribute(conicalFieldOfViewEClass, CONICAL_FIELD_OF_VIEW__FIELD_OF_VIEW_ANGLE);
		createEReference(conicalFieldOfViewEClass, CONICAL_FIELD_OF_VIEW__RANGE);
		createEAttribute(conicalFieldOfViewEClass, CONICAL_FIELD_OF_VIEW__VOLUME);

		circularSectorFieldOfViewEClass = createEClass(CIRCULAR_SECTOR_FIELD_OF_VIEW);
		createEReference(circularSectorFieldOfViewEClass, CIRCULAR_SECTOR_FIELD_OF_VIEW__ANGULAR_SPAN);
		createEReference(circularSectorFieldOfViewEClass, CIRCULAR_SECTOR_FIELD_OF_VIEW__RANGE);
		createEAttribute(circularSectorFieldOfViewEClass, CIRCULAR_SECTOR_FIELD_OF_VIEW__AREA);

		fovFacadeEClass = createEClass(FOV_FACADE);
		createEOperation(fovFacadeEClass, FOV_FACADE___CREATE_DISTANCE_RANGE__DOUBLE_DOUBLE);
		createEOperation(fovFacadeEClass, FOV_FACADE___CREATE_DISTANCE_RANGE__DISTANCERANGE);
		createEOperation(fovFacadeEClass, FOV_FACADE___CREATE_ANGULAR_SPAN__DOUBLE_DOUBLE);
		createEOperation(fovFacadeEClass, FOV_FACADE___CREATE_ANGULAR_SPAN__ANGULARSPAN);
		createEOperation(fovFacadeEClass, FOV_FACADE___CREATE_RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(fovFacadeEClass, FOV_FACADE___CREATE_RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RECTANGULARFRUSTRUMFIELDOFVIEW);
		createEOperation(fovFacadeEClass, FOV_FACADE___CREATE_CONICAL_FIELD_OF_VIEW__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(fovFacadeEClass, FOV_FACADE___CREATE_CONICAL_FIELD_OF_VIEW__CONICALFIELDOFVIEW);
		createEOperation(fovFacadeEClass, FOV_FACADE___CREATE_CIRCULAR_SECTOR_FIELD_OF_VIEW__DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(fovFacadeEClass, FOV_FACADE___CREATE_CIRCULAR_SECTOR_FIELD_OF_VIEW__CIRCULARSECTORFIELDOFVIEW);

		rectangularFrustrumFieldOfViewSamplingShapeEClass = createEClass(RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE);
		createEReference(rectangularFrustrumFieldOfViewSamplingShapeEClass, RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__TRANSFORM);
		createEReference(rectangularFrustrumFieldOfViewSamplingShapeEClass, RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW);
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
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);
		Data3dPackage theData3dPackage = (Data3dPackage)EPackage.Registry.INSTANCE.getEPackage(Data3dPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		MathPackage theMathPackage = (MathPackage)EPackage.Registry.INSTANCE.getEPackage(MathPackage.eNS_URI);

		// Create type parameters
		ETypeParameter rectangularFrustrumFieldOfViewSamplingShapeEClass_PolygonType = addETypeParameter(rectangularFrustrumFieldOfViewSamplingShapeEClass, "PolygonType");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theData3dPackage.getCartesianPolygon());
		rectangularFrustrumFieldOfViewSamplingShapeEClass_PolygonType.getEBounds().add(g1);

		// Add supertypes to classes
		fieldOfViewEClass.getESuperTypes().add(theTopologyPackage.getNode());
		rectangularFrustrumFieldOfViewEClass.getESuperTypes().add(this.getFieldOfView());
		conicalFieldOfViewEClass.getESuperTypes().add(this.getFieldOfView());
		circularSectorFieldOfViewEClass.getESuperTypes().add(this.getFieldOfView());
		g1 = createEGenericType(theDataPackage.getCoordinatesSamplingShape());
		EGenericType g2 = createEGenericType(theData3dPackage.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		rectangularFrustrumFieldOfViewSamplingShapeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theDataPackage.getPolygonSamplingShape());
		g2 = createEGenericType(theData3dPackage.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(rectangularFrustrumFieldOfViewSamplingShapeEClass_PolygonType);
		g1.getETypeArguments().add(g2);
		rectangularFrustrumFieldOfViewSamplingShapeEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(fieldOfViewEClass, FieldOfView.class, "FieldOfView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(distanceRangeEClass, DistanceRange.class, "DistanceRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistanceRange_MinimumDistance(), ecorePackage.getEDouble(), "minimumDistance", "0.0", 1, 1, DistanceRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceRange_MaximumDistance(), ecorePackage.getEDouble(), "maximumDistance", "1.0", 1, 1, DistanceRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceRange_Distance(), ecorePackage.getEDouble(), "distance", null, 0, 1, DistanceRange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDistanceRange__IsWithinRange__double(), ecorePackage.getEBoolean(), "isWithinRange", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "distance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(angularSpanEClass, AngularSpan.class, "AngularSpan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAngularSpan_MinimumAngle(), ecorePackage.getEDouble(), "minimumAngle", "0.0", 1, 1, AngularSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngularSpan_MaximumAngle(), ecorePackage.getEDouble(), "maximumAngle", "0.0", 1, 1, AngularSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngularSpan_SpanningAngle(), ecorePackage.getEDouble(), "spanningAngle", null, 0, 1, AngularSpan.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngularSpan_CenterAngle(), ecorePackage.getEDouble(), "centerAngle", null, 0, 1, AngularSpan.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAngularSpan__IsWithinRange__double(), ecorePackage.getEBoolean(), "isWithinRange", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "angle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rectangularFrustrumFieldOfViewEClass, RectangularFrustrumFieldOfView.class, "RectangularFrustrumFieldOfView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRectangularFrustrumFieldOfView_Range(), this.getDistanceRange(), null, "range", null, 1, 1, RectangularFrustrumFieldOfView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularFrustrumFieldOfView_HorizontalFieldOfViewAngle(), ecorePackage.getEDouble(), "horizontalFieldOfViewAngle", null, 1, 1, RectangularFrustrumFieldOfView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularFrustrumFieldOfView_VerticalFieldOfViewAngle(), ecorePackage.getEDouble(), "verticalFieldOfViewAngle", null, 1, 1, RectangularFrustrumFieldOfView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularFrustrumFieldOfView_Volume(), ecorePackage.getEDouble(), "volume", "0.0", 1, 1, RectangularFrustrumFieldOfView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(conicalFieldOfViewEClass, ConicalFieldOfView.class, "ConicalFieldOfView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConicalFieldOfView_FieldOfViewAngle(), ecorePackage.getEDouble(), "fieldOfViewAngle", "0.0", 1, 1, ConicalFieldOfView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConicalFieldOfView_Range(), this.getDistanceRange(), null, "range", null, 1, 1, ConicalFieldOfView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConicalFieldOfView_Volume(), ecorePackage.getEDouble(), "volume", "0.0", 1, 1, ConicalFieldOfView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(circularSectorFieldOfViewEClass, CircularSectorFieldOfView.class, "CircularSectorFieldOfView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCircularSectorFieldOfView_AngularSpan(), this.getAngularSpan(), null, "angularSpan", null, 1, 1, CircularSectorFieldOfView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCircularSectorFieldOfView_Range(), this.getDistanceRange(), null, "range", null, 0, 1, CircularSectorFieldOfView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircularSectorFieldOfView_Area(), ecorePackage.getEDouble(), "area", "0.0", 1, 1, CircularSectorFieldOfView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(fovFacadeEClass, FOVFacade.class, "FOVFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getFOVFacade__CreateDistanceRange__double_double(), this.getDistanceRange(), "createDistanceRange", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "minimumDistance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "maximumDistance", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFOVFacade__CreateDistanceRange__DistanceRange(), this.getDistanceRange(), "createDistanceRange", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDistanceRange(), "distanceRange", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFOVFacade__CreateAngularSpan__double_double(), this.getAngularSpan(), "createAngularSpan", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "minimumAngle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "maximumAngle", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFOVFacade__CreateAngularSpan__AngularSpan(), this.getAngularSpan(), "createAngularSpan", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAngularSpan(), "angularSpan", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFOVFacade__CreateRectangularFrustrumFieldOfView__double_double_double_double(), this.getRectangularFrustrumFieldOfView(), "createRectangularFrustrumFieldOfView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "minimumDistance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "maximumDistance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "horizontalFieldOfViewAngle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "verticalFieldOfViewAngle", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFOVFacade__CreateRectangularFrustrumFieldOfView__RectangularFrustrumFieldOfView(), this.getRectangularFrustrumFieldOfView(), "createRectangularFrustrumFieldOfView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRectangularFrustrumFieldOfView(), "rectangularFrustrumFieldOfView", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFOVFacade__CreateConicalFieldOfView__double_double_double(), this.getConicalFieldOfView(), "createConicalFieldOfView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "minimumDistance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "maximumDistance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "fieldOfViewAngle", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFOVFacade__CreateConicalFieldOfView__ConicalFieldOfView(), this.getConicalFieldOfView(), "createConicalFieldOfView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConicalFieldOfView(), "conicalFieldOfView", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFOVFacade__CreateCircularSectorFieldOfView__double_double_double_double(), this.getCircularSectorFieldOfView(), "createCircularSectorFieldOfView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "minimumAngle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "maximumAngle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "minimumDistance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "maximumDistance", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFOVFacade__CreateCircularSectorFieldOfView__CircularSectorFieldOfView(), this.getCircularSectorFieldOfView(), "createCircularSectorFieldOfView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCircularSectorFieldOfView(), "circularSectorFieldOfView", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rectangularFrustrumFieldOfViewSamplingShapeEClass, RectangularFrustrumFieldOfViewSamplingShape.class, "RectangularFrustrumFieldOfViewSamplingShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRectangularFrustrumFieldOfViewSamplingShape_Transform(), theMathPackage.getMatrix4x4(), null, "transform", null, 0, 1, RectangularFrustrumFieldOfViewSamplingShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRectangularFrustrumFieldOfViewSamplingShape_RectangularFrustrumFieldOfView(), this.getRectangularFrustrumFieldOfView(), null, "rectangularFrustrumFieldOfView", null, 0, 1, RectangularFrustrumFieldOfViewSamplingShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
	protected void createGenModelAnnotations()
	{
		String source = "http://www.eclipse.org/emf/2002/GenModel";		
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
		  (getAngularSpan_SpanningAngle(), 
		   source, 
		   new String[] {
			 "documentation", "The total angular span, in radians."
		   });		
		addAnnotation
		  (getAngularSpan_CenterAngle(), 
		   source, 
		   new String[] {
			 "documentation", "The center of the angular span, in radians."
		   });		
		addAnnotation
		  (rectangularFrustrumFieldOfViewEClass, 
		   source, 
		   new String[] {
			 "documentation", "A field of view that has a frustrum shape. This frustrum has a rectangular base and is right (its axis is perpendicular to both bases). See http://en.wikipedia.org/wiki/Frustrum."
		   });		
		addAnnotation
		  (getRectangularFrustrumFieldOfView_HorizontalFieldOfViewAngle(), 
		   source, 
		   new String[] {
			 "documentation", "Total horizontal field of view, in radians."
		   });		
		addAnnotation
		  (getRectangularFrustrumFieldOfView_VerticalFieldOfViewAngle(), 
		   source, 
		   new String[] {
			 "documentation", "Total vertical field of view, in radians."
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
			 "documentation", "The apex angle of the conical field of view."
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
			 "documentation", "A field of view shaped like a circular sector (see http://en.wikipedia.org/wiki/Circular_sector).\n"
		   });		
		addAnnotation
		  (getCircularSectorFieldOfView_Area(), 
		   source, 
		   new String[] {
			 "documentation", "The area of the circular sector."
		   });
	}

} //FovPackageImpl
