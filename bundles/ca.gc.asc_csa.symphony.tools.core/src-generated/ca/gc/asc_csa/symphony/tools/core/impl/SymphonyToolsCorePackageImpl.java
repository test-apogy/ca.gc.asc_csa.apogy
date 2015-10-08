/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.core.impl;

import javax.vecmath.Color3f;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.math.MathPackage;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.symphony.tools.core.AbstractTool;
import ca.gc.asc_csa.symphony.tools.core.AbstractTwoPoints3DTool;
import ca.gc.asc_csa.symphony.tools.core.FeatureOfInterestPickingTool;
import ca.gc.asc_csa.symphony.tools.core.Ruler3DTool;
import ca.gc.asc_csa.symphony.tools.core.Ruler3dToolNode;
import ca.gc.asc_csa.symphony.tools.core.Simple3DTool;
import ca.gc.asc_csa.symphony.tools.core.SimpleTool;
import ca.gc.asc_csa.symphony.tools.core.SimpleToolList;
import ca.gc.asc_csa.symphony.tools.core.SunVector3DTool;
import ca.gc.asc_csa.symphony.tools.core.SunVector3DToolNode;
import ca.gc.asc_csa.symphony.tools.core.SymphonyToolsCoreFactory;
import ca.gc.asc_csa.symphony.tools.core.SymphonyToolsCorePackage;
import ca.gc.asc_csa.symphony.tools.core.Trajectory3DTool;
import ca.gc.asc_csa.symphony.tools.core.Trajectory3DToolNode;
import ca.gc.space.mrt.geometry.paths.PathsPackage;
import ca.gc.space.topology.TopologyPackage;
import ca.gc.space.topology.ui.NodeSelection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyToolsCorePackageImpl extends EPackageImpl implements SymphonyToolsCorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleToolListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simple3DToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTwoPoints3DToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruler3DToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruler3dToolNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureOfInterestPickingToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sunVector3DToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sunVector3DToolNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trajectory3DToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trajectory3DToolNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType color3fEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nodeSelectionEDataType = null;

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
	 * @see ca.gc.asc_csa.symphony.tools.core.SymphonyToolsCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SymphonyToolsCorePackageImpl() {
		super(eNS_URI, SymphonyToolsCoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SymphonyToolsCorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SymphonyToolsCorePackage init() {
		if (isInited) return (SymphonyToolsCorePackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyToolsCorePackage.eNS_URI);

		// Obtain or create and register package
		SymphonyToolsCorePackageImpl theSymphonyToolsCorePackage = (SymphonyToolsCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SymphonyToolsCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SymphonyToolsCorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SymphonyCorePackage.eINSTANCE.eClass();
		PathsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphonyToolsCorePackage.createPackageContents();

		// Initialize created meta-data
		theSymphonyToolsCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphonyToolsCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SymphonyToolsCorePackage.eNS_URI, theSymphonyToolsCorePackage);
		return theSymphonyToolsCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTool() {
		return abstractToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleToolList() {
		return simpleToolListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleToolList_SimpleTools() {
		return (EReference)simpleToolListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleTool() {
		return simpleToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTool_ToolList() {
		return (EReference)simpleToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTool_Active() {
		return (EAttribute)simpleToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTool_Disposed() {
		return (EAttribute)simpleToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSimpleTool__Dispose() {
		return simpleToolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimple3DTool() {
		return simple3DToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimple3DTool_Visible() {
		return (EAttribute)simple3DToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimple3DTool_RootNode() {
		return (EReference)simple3DToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSimple3DTool__SelectionChanged__NodeSelection() {
		return simple3DToolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTwoPoints3DTool() {
		return abstractTwoPoints3DToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTwoPoints3DTool_FromAbsolutePosition() {
		return (EReference)abstractTwoPoints3DToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTwoPoints3DTool_FromRelativePosition() {
		return (EReference)abstractTwoPoints3DToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTwoPoints3DTool_FromNode() {
		return (EReference)abstractTwoPoints3DToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTwoPoints3DTool_FromNodeLock() {
		return (EAttribute)abstractTwoPoints3DToolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTwoPoints3DTool_ToAbsolutePosition() {
		return (EReference)abstractTwoPoints3DToolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTwoPoints3DTool_ToRelativePosition() {
		return (EReference)abstractTwoPoints3DToolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTwoPoints3DTool_ToNode() {
		return (EReference)abstractTwoPoints3DToolEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTwoPoints3DTool_ToNodeLock() {
		return (EAttribute)abstractTwoPoints3DToolEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTwoPoints3DTool_Distance() {
		return (EAttribute)abstractTwoPoints3DToolEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractTwoPoints3DTool__PointsRelativePoseChanged__Matrix4d() {
		return abstractTwoPoints3DToolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuler3DTool() {
		return ruler3DToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuler3DTool_RulerColor() {
		return (EAttribute)ruler3DToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuler3DTool_ExtremitiesRadius() {
		return (EAttribute)ruler3DToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuler3DTool_MinorTickColor() {
		return (EAttribute)ruler3DToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuler3DTool_MinorTickSpacing() {
		return (EAttribute)ruler3DToolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuler3DTool_MinorTickLenght() {
		return (EAttribute)ruler3DToolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuler3DTool_MajorTickColor() {
		return (EAttribute)ruler3DToolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuler3DTool_MajorTickSpacing() {
		return (EAttribute)ruler3DToolEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuler3DTool_MajorTickLenght() {
		return (EAttribute)ruler3DToolEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuler3DTool_Ruler3dToolNode() {
		return (EReference)ruler3DToolEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuler3dToolNode() {
		return ruler3dToolNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuler3dToolNode_Ruler3DTool() {
		return (EReference)ruler3dToolNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureOfInterestPickingTool() {
		return featureOfInterestPickingToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureOfInterestPickingTool_FeatureOfInterestList() {
		return (EReference)featureOfInterestPickingToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureOfInterestPickingTool_PickAbsolutePosition() {
		return (EReference)featureOfInterestPickingToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureOfInterestPickingTool_PickRelativePosition() {
		return (EReference)featureOfInterestPickingToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureOfInterestPickingTool_PickedNode() {
		return (EReference)featureOfInterestPickingToolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureOfInterestPickingTool_PickAbsoluteNormal() {
		return (EReference)featureOfInterestPickingToolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureOfInterestPickingTool_PickRelativeNormal() {
		return (EReference)featureOfInterestPickingToolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSunVector3DTool() {
		return sunVector3DToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSunVector3DTool_VectorColor() {
		return (EAttribute)sunVector3DToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSunVector3DTool_VectorLength() {
		return (EAttribute)sunVector3DToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSunVector3DTool_EndPointRadius() {
		return (EAttribute)sunVector3DToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSunVector3DTool_SunIntensity() {
		return (EAttribute)sunVector3DToolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSunVector3DTool_CurrentDayMaximumSunIntensity() {
		return (EAttribute)sunVector3DToolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSunVector3DTool_CurrentSunIntensityPercentage() {
		return (EAttribute)sunVector3DToolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSunVector3DTool_SunVector3DToolNode() {
		return (EReference)sunVector3DToolEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSunVector3DToolNode() {
		return sunVector3DToolNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSunVector3DToolNode_SunVector3DTool() {
		return (EReference)sunVector3DToolNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrajectory3DTool() {
		return trajectory3DToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrajectory3DTool_PenDown() {
		return (EAttribute)trajectory3DToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrajectory3DTool_Variable() {
		return (EReference)trajectory3DToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrajectory3DTool_DistanceThreshold() {
		return (EAttribute)trajectory3DToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrajectory3DTool_TotalDistance() {
		return (EAttribute)trajectory3DToolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrajectory3DTool_Paths() {
		return (EReference)trajectory3DToolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrajectory3DTool_PoseProvider() {
		return (EReference)trajectory3DToolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrajectory3DTool_Trajectory3DToolNode() {
		return (EReference)trajectory3DToolEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrajectory3DToolNode() {
		return trajectory3DToolNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrajectory3DToolNode_Trajectory3DTool() {
		return (EReference)trajectory3DToolNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor3f() {
		return color3fEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNodeSelection() {
		return nodeSelectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyToolsCoreFactory getSymphonyToolsCoreFactory() {
		return (SymphonyToolsCoreFactory)getEFactoryInstance();
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
		abstractToolEClass = createEClass(ABSTRACT_TOOL);

		simpleToolListEClass = createEClass(SIMPLE_TOOL_LIST);
		createEReference(simpleToolListEClass, SIMPLE_TOOL_LIST__SIMPLE_TOOLS);

		simpleToolEClass = createEClass(SIMPLE_TOOL);
		createEReference(simpleToolEClass, SIMPLE_TOOL__TOOL_LIST);
		createEAttribute(simpleToolEClass, SIMPLE_TOOL__ACTIVE);
		createEAttribute(simpleToolEClass, SIMPLE_TOOL__DISPOSED);
		createEOperation(simpleToolEClass, SIMPLE_TOOL___DISPOSE);

		simple3DToolEClass = createEClass(SIMPLE3_DTOOL);
		createEAttribute(simple3DToolEClass, SIMPLE3_DTOOL__VISIBLE);
		createEReference(simple3DToolEClass, SIMPLE3_DTOOL__ROOT_NODE);
		createEOperation(simple3DToolEClass, SIMPLE3_DTOOL___SELECTION_CHANGED__NODESELECTION);

		abstractTwoPoints3DToolEClass = createEClass(ABSTRACT_TWO_POINTS3_DTOOL);
		createEReference(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL__FROM_ABSOLUTE_POSITION);
		createEReference(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL__FROM_RELATIVE_POSITION);
		createEReference(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE);
		createEAttribute(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE_LOCK);
		createEReference(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL__TO_ABSOLUTE_POSITION);
		createEReference(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL__TO_RELATIVE_POSITION);
		createEReference(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE);
		createEAttribute(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE_LOCK);
		createEAttribute(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL__DISTANCE);
		createEOperation(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL___POINTS_RELATIVE_POSE_CHANGED__MATRIX4D);

		ruler3DToolEClass = createEClass(RULER3_DTOOL);
		createEAttribute(ruler3DToolEClass, RULER3_DTOOL__RULER_COLOR);
		createEAttribute(ruler3DToolEClass, RULER3_DTOOL__EXTREMITIES_RADIUS);
		createEAttribute(ruler3DToolEClass, RULER3_DTOOL__MINOR_TICK_COLOR);
		createEAttribute(ruler3DToolEClass, RULER3_DTOOL__MINOR_TICK_SPACING);
		createEAttribute(ruler3DToolEClass, RULER3_DTOOL__MINOR_TICK_LENGHT);
		createEAttribute(ruler3DToolEClass, RULER3_DTOOL__MAJOR_TICK_COLOR);
		createEAttribute(ruler3DToolEClass, RULER3_DTOOL__MAJOR_TICK_SPACING);
		createEAttribute(ruler3DToolEClass, RULER3_DTOOL__MAJOR_TICK_LENGHT);
		createEReference(ruler3DToolEClass, RULER3_DTOOL__RULER3D_TOOL_NODE);

		ruler3dToolNodeEClass = createEClass(RULER3D_TOOL_NODE);
		createEReference(ruler3dToolNodeEClass, RULER3D_TOOL_NODE__RULER3_DTOOL);

		featureOfInterestPickingToolEClass = createEClass(FEATURE_OF_INTEREST_PICKING_TOOL);
		createEReference(featureOfInterestPickingToolEClass, FEATURE_OF_INTEREST_PICKING_TOOL__FEATURE_OF_INTEREST_LIST);
		createEReference(featureOfInterestPickingToolEClass, FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_POSITION);
		createEReference(featureOfInterestPickingToolEClass, FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_POSITION);
		createEReference(featureOfInterestPickingToolEClass, FEATURE_OF_INTEREST_PICKING_TOOL__PICKED_NODE);
		createEReference(featureOfInterestPickingToolEClass, FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_NORMAL);
		createEReference(featureOfInterestPickingToolEClass, FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_NORMAL);

		sunVector3DToolEClass = createEClass(SUN_VECTOR3_DTOOL);
		createEAttribute(sunVector3DToolEClass, SUN_VECTOR3_DTOOL__VECTOR_COLOR);
		createEAttribute(sunVector3DToolEClass, SUN_VECTOR3_DTOOL__VECTOR_LENGTH);
		createEAttribute(sunVector3DToolEClass, SUN_VECTOR3_DTOOL__END_POINT_RADIUS);
		createEAttribute(sunVector3DToolEClass, SUN_VECTOR3_DTOOL__SUN_INTENSITY);
		createEAttribute(sunVector3DToolEClass, SUN_VECTOR3_DTOOL__CURRENT_DAY_MAXIMUM_SUN_INTENSITY);
		createEAttribute(sunVector3DToolEClass, SUN_VECTOR3_DTOOL__CURRENT_SUN_INTENSITY_PERCENTAGE);
		createEReference(sunVector3DToolEClass, SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE);

		sunVector3DToolNodeEClass = createEClass(SUN_VECTOR3_DTOOL_NODE);
		createEReference(sunVector3DToolNodeEClass, SUN_VECTOR3_DTOOL_NODE__SUN_VECTOR3_DTOOL);

		trajectory3DToolEClass = createEClass(TRAJECTORY3_DTOOL);
		createEAttribute(trajectory3DToolEClass, TRAJECTORY3_DTOOL__PEN_DOWN);
		createEReference(trajectory3DToolEClass, TRAJECTORY3_DTOOL__VARIABLE);
		createEAttribute(trajectory3DToolEClass, TRAJECTORY3_DTOOL__DISTANCE_THRESHOLD);
		createEAttribute(trajectory3DToolEClass, TRAJECTORY3_DTOOL__TOTAL_DISTANCE);
		createEReference(trajectory3DToolEClass, TRAJECTORY3_DTOOL__PATHS);
		createEReference(trajectory3DToolEClass, TRAJECTORY3_DTOOL__POSE_PROVIDER);
		createEReference(trajectory3DToolEClass, TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE);

		trajectory3DToolNodeEClass = createEClass(TRAJECTORY3_DTOOL_NODE);
		createEReference(trajectory3DToolNodeEClass, TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL);

		// Create data types
		color3fEDataType = createEDataType(COLOR3F);
		nodeSelectionEDataType = createEDataType(NODE_SELECTION);
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
		EMFEcorePackage theEMFEcorePackage = (EMFEcorePackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcorePackage.eNS_URI);
		EMFEcoreInvocatorPackage theEMFEcoreInvocatorPackage = (EMFEcoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreInvocatorPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);
		MathPackage theMathPackage = (MathPackage)EPackage.Registry.INSTANCE.getEPackage(MathPackage.eNS_URI);
		SymphonyCorePackage theSymphonyCorePackage = (SymphonyCorePackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyCorePackage.eNS_URI);
		PathsPackage thePathsPackage = (PathsPackage)EPackage.Registry.INSTANCE.getEPackage(PathsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractToolEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		abstractToolEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		simpleToolListEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getAbstractToolsListContainer());
		simpleToolEClass.getESuperTypes().add(this.getAbstractTool());
		simple3DToolEClass.getESuperTypes().add(this.getSimpleTool());
		abstractTwoPoints3DToolEClass.getESuperTypes().add(this.getSimple3DTool());
		ruler3DToolEClass.getESuperTypes().add(this.getAbstractTwoPoints3DTool());
		ruler3dToolNodeEClass.getESuperTypes().add(theTopologyPackage.getNode());
		featureOfInterestPickingToolEClass.getESuperTypes().add(this.getSimple3DTool());
		sunVector3DToolEClass.getESuperTypes().add(this.getAbstractTwoPoints3DTool());
		sunVector3DToolNodeEClass.getESuperTypes().add(theTopologyPackage.getNode());
		trajectory3DToolEClass.getESuperTypes().add(this.getSimple3DTool());
		trajectory3DToolNodeEClass.getESuperTypes().add(theTopologyPackage.getAggregateGroupNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractToolEClass, AbstractTool.class, "AbstractTool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleToolListEClass, SimpleToolList.class, "SimpleToolList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleToolList_SimpleTools(), this.getSimpleTool(), this.getSimpleTool_ToolList(), "simpleTools", null, 0, -1, SimpleToolList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleToolEClass, SimpleTool.class, "SimpleTool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleTool_ToolList(), this.getSimpleToolList(), this.getSimpleToolList_SimpleTools(), "toolList", null, 0, 1, SimpleTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleTool_Active(), theEcorePackage.getEBoolean(), "active", "false", 0, 1, SimpleTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleTool_Disposed(), theEcorePackage.getEBoolean(), "disposed", "false", 0, 1, SimpleTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSimpleTool__Dispose(), null, "dispose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(simple3DToolEClass, Simple3DTool.class, "Simple3DTool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimple3DTool_Visible(), theEcorePackage.getEBoolean(), "visible", "true", 0, 1, Simple3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple3DTool_RootNode(), theTopologyPackage.getNode(), null, "rootNode", null, 0, 1, Simple3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getSimple3DTool__SelectionChanged__NodeSelection(), null, "selectionChanged", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNodeSelection(), "nodeSelection", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(abstractTwoPoints3DToolEClass, AbstractTwoPoints3DTool.class, "AbstractTwoPoints3DTool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractTwoPoints3DTool_FromAbsolutePosition(), theMathPackage.getTuple3d(), null, "fromAbsolutePosition", null, 0, 1, AbstractTwoPoints3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTwoPoints3DTool_FromRelativePosition(), theMathPackage.getTuple3d(), null, "fromRelativePosition", null, 0, 1, AbstractTwoPoints3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTwoPoints3DTool_FromNode(), theTopologyPackage.getNode(), null, "fromNode", null, 0, 1, AbstractTwoPoints3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTwoPoints3DTool_FromNodeLock(), theEcorePackage.getEBoolean(), "fromNodeLock", "false", 0, 1, AbstractTwoPoints3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTwoPoints3DTool_ToAbsolutePosition(), theMathPackage.getTuple3d(), null, "toAbsolutePosition", null, 0, 1, AbstractTwoPoints3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTwoPoints3DTool_ToRelativePosition(), theMathPackage.getTuple3d(), null, "toRelativePosition", null, 0, 1, AbstractTwoPoints3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTwoPoints3DTool_ToNode(), theTopologyPackage.getNode(), null, "toNode", null, 0, 1, AbstractTwoPoints3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTwoPoints3DTool_ToNodeLock(), theEcorePackage.getEBoolean(), "toNodeLock", "false", 0, 1, AbstractTwoPoints3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTwoPoints3DTool_Distance(), theEcorePackage.getEDouble(), "distance", "0", 0, 1, AbstractTwoPoints3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAbstractTwoPoints3DTool__PointsRelativePoseChanged__Matrix4d(), null, "pointsRelativePoseChanged", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getMatrix4d(), "newPose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(ruler3DToolEClass, Ruler3DTool.class, "Ruler3DTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuler3DTool_RulerColor(), this.getColor3f(), "rulerColor", "0.0,1.0,0.0", 0, 1, Ruler3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuler3DTool_ExtremitiesRadius(), theEcorePackage.getEDouble(), "extremitiesRadius", "0.01", 0, 1, Ruler3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuler3DTool_MinorTickColor(), this.getColor3f(), "minorTickColor", "0.0,1.0,0.0", 0, 1, Ruler3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuler3DTool_MinorTickSpacing(), theEcorePackage.getEDouble(), "minorTickSpacing", "0.1", 0, 1, Ruler3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuler3DTool_MinorTickLenght(), theEcorePackage.getEDouble(), "minorTickLenght", "0.1", 0, 1, Ruler3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuler3DTool_MajorTickColor(), this.getColor3f(), "majorTickColor", "0.0,1.0,0.0", 0, 1, Ruler3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuler3DTool_MajorTickSpacing(), theEcorePackage.getEDouble(), "majorTickSpacing", "1.0", 0, 1, Ruler3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuler3DTool_MajorTickLenght(), theEcorePackage.getEDouble(), "majorTickLenght", "0.2", 0, 1, Ruler3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuler3DTool_Ruler3dToolNode(), this.getRuler3dToolNode(), this.getRuler3dToolNode_Ruler3DTool(), "ruler3dToolNode", null, 0, 1, Ruler3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruler3dToolNodeEClass, Ruler3dToolNode.class, "Ruler3dToolNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuler3dToolNode_Ruler3DTool(), this.getRuler3DTool(), this.getRuler3DTool_Ruler3dToolNode(), "ruler3DTool", null, 0, 1, Ruler3dToolNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureOfInterestPickingToolEClass, FeatureOfInterestPickingTool.class, "FeatureOfInterestPickingTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureOfInterestPickingTool_FeatureOfInterestList(), theSymphonyCorePackage.getFeatureOfInterestList(), null, "featureOfInterestList", null, 0, 1, FeatureOfInterestPickingTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureOfInterestPickingTool_PickAbsolutePosition(), theMathPackage.getTuple3d(), null, "pickAbsolutePosition", null, 0, 1, FeatureOfInterestPickingTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureOfInterestPickingTool_PickRelativePosition(), theMathPackage.getTuple3d(), null, "pickRelativePosition", null, 0, 1, FeatureOfInterestPickingTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureOfInterestPickingTool_PickedNode(), theTopologyPackage.getNode(), null, "pickedNode", null, 0, 1, FeatureOfInterestPickingTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureOfInterestPickingTool_PickAbsoluteNormal(), theMathPackage.getTuple3d(), null, "pickAbsoluteNormal", null, 0, 1, FeatureOfInterestPickingTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureOfInterestPickingTool_PickRelativeNormal(), theMathPackage.getTuple3d(), null, "pickRelativeNormal", null, 0, 1, FeatureOfInterestPickingTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sunVector3DToolEClass, SunVector3DTool.class, "SunVector3DTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSunVector3DTool_VectorColor(), this.getColor3f(), "vectorColor", "1.0,1.0,0.0", 0, 1, SunVector3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSunVector3DTool_VectorLength(), theEcorePackage.getEDouble(), "vectorLength", "10.0", 0, 1, SunVector3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSunVector3DTool_EndPointRadius(), theEcorePackage.getEDouble(), "endPointRadius", "0.01", 0, 1, SunVector3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSunVector3DTool_SunIntensity(), theEcorePackage.getEDouble(), "sunIntensity", "0.0", 0, 1, SunVector3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSunVector3DTool_CurrentDayMaximumSunIntensity(), theEcorePackage.getEDouble(), "currentDayMaximumSunIntensity", "0.0", 0, 1, SunVector3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSunVector3DTool_CurrentSunIntensityPercentage(), theEcorePackage.getEDouble(), "currentSunIntensityPercentage", "0.0", 0, 1, SunVector3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSunVector3DTool_SunVector3DToolNode(), this.getSunVector3DToolNode(), this.getSunVector3DToolNode_SunVector3DTool(), "sunVector3DToolNode", null, 0, 1, SunVector3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sunVector3DToolNodeEClass, SunVector3DToolNode.class, "SunVector3DToolNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSunVector3DToolNode_SunVector3DTool(), this.getSunVector3DTool(), this.getSunVector3DTool_SunVector3DToolNode(), "sunVector3DTool", null, 0, 1, SunVector3DToolNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trajectory3DToolEClass, Trajectory3DTool.class, "Trajectory3DTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrajectory3DTool_PenDown(), theEcorePackage.getEBoolean(), "penDown", "true", 0, 1, Trajectory3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectory3DTool_Variable(), theEMFEcoreInvocatorPackage.getVariable(), null, "variable", null, 1, 1, Trajectory3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrajectory3DTool_DistanceThreshold(), theEcorePackage.getEDouble(), "distanceThreshold", "0.01", 0, 1, Trajectory3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrajectory3DTool_TotalDistance(), theEcorePackage.getEDouble(), "totalDistance", "0.0", 0, 1, Trajectory3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectory3DTool_Paths(), thePathsPackage.getWayPointPath(), null, "paths", null, 0, -1, Trajectory3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectory3DTool_PoseProvider(), theSymphonyCorePackage.getPoseProvider(), null, "poseProvider", null, 0, 1, Trajectory3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectory3DTool_Trajectory3DToolNode(), this.getTrajectory3DToolNode(), this.getTrajectory3DToolNode_Trajectory3DTool(), "trajectory3DToolNode", null, 0, 1, Trajectory3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trajectory3DToolNodeEClass, Trajectory3DToolNode.class, "Trajectory3DToolNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrajectory3DToolNode_Trajectory3DTool(), this.getTrajectory3DTool(), this.getTrajectory3DTool_Trajectory3DToolNode(), "trajectory3DTool", null, 0, 1, Trajectory3DToolNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(color3fEDataType, Color3f.class, "Color3f", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nodeSelectionEDataType, NodeSelection.class, "NodeSelection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "SymphonyToolsCore",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)",
			 "modelName", "SymphonyToolsCore",
			 "complianceLevel", "6.0",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/ca.gc.asc_csa.symphony.tools.core/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.symphony.tools.core.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.symphony.tools"
		   });	
		addAnnotation
		  (getSimpleToolList_SimpleTools(), 
		   source, 
		   new String[] {
			 "property", "None"
		   });	
		addAnnotation
		  (getSimpleTool_Disposed(), 
		   source, 
		   new String[] {
			 "property", "Readonly"
		   });	
		addAnnotation
		  (getSimple3DTool__SelectionChanged__NodeSelection(), 
		   source, 
		   new String[] {
			 "documentation", "* Method called upon a user selection in the 3D viewer. Sub-classes should implement."
		   });	
		addAnnotation
		  (getSimple3DTool_RootNode(), 
		   source, 
		   new String[] {
			 "documentation", "* The root node of the current topology. Set automatically by Symphony after the too is registered."
		   });	
		addAnnotation
		  (abstractTwoPoints3DToolEClass, 
		   source, 
		   new String[] {
			 "documentation", "An abstract tool that is defined by two points."
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool__PointsRelativePoseChanged__Matrix4d(), 
		   source, 
		   new String[] {
			 "documentation", " Method called when the pose between from and to changes."
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool_FromAbsolutePosition(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "FROM_NODE"
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool_FromRelativePosition(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "FROM_NODE"
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool_FromNode(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "FROM_NODE"
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool_FromNodeLock(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "propertyCategory", "FROM_NODE"
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool_ToAbsolutePosition(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "TO_NODE"
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool_ToRelativePosition(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "TO_NODE"
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool_ToNode(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "TO_NODE"
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool_ToNodeLock(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "propertyCategory", "TO_NODE"
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool_Distance(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "property", "Readonly",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (ruler3DToolEClass, 
		   source, 
		   new String[] {
			 "documentation", "A 3D tool used to measure distance between two points."
		   });	
		addAnnotation
		  (getRuler3DTool_RulerColor(), 
		   source, 
		   new String[] {
			 "documentation", " The ruler color.",
			 "propertyCategory", "RULER_PROPERTIES"
		   });	
		addAnnotation
		  (getRuler3DTool_ExtremitiesRadius(), 
		   source, 
		   new String[] {
			 "documentation", " Radius of sphere used as ruler end points.",
			 "notify", "true",
			 "csa_units", "m",
			 "propertyCategory", "RULER_PROPERTIES"
		   });	
		addAnnotation
		  (getRuler3DTool_MinorTickColor(), 
		   source, 
		   new String[] {
			 "documentation", " Minor tick color.",
			 "propertyCategory", "MINOR_TICKS_PROPERTIES"
		   });	
		addAnnotation
		  (getRuler3DTool_MinorTickSpacing(), 
		   source, 
		   new String[] {
			 "documentation", " Spacing between minor tick mark.",
			 "notify", "true",
			 "csa_units", "m",
			 "propertyCategory", "MINOR_TICKS_PROPERTIES"
		   });	
		addAnnotation
		  (getRuler3DTool_MinorTickLenght(), 
		   source, 
		   new String[] {
			 "documentation", " Length of the minor tick marks as displayed on the ruler.",
			 "notify", "true",
			 "csa_units", "m",
			 "propertyCategory", "MINOR_TICKS_PROPERTIES"
		   });	
		addAnnotation
		  (getRuler3DTool_MajorTickColor(), 
		   source, 
		   new String[] {
			 "documentation", " Major tick color.",
			 "propertyCategory", "MAJOR_TICKS_PROPERTIES"
		   });	
		addAnnotation
		  (getRuler3DTool_MajorTickSpacing(), 
		   source, 
		   new String[] {
			 "documentation", " Spacing between major tick mark.",
			 "notify", "true",
			 "csa_units", "m",
			 "propertyCategory", "MAJOR_TICKS_PROPERTIES"
		   });	
		addAnnotation
		  (getRuler3DTool_MajorTickLenght(), 
		   source, 
		   new String[] {
			 "documentation", " Length of the major tick marks as displayed on the ruler.",
			 "notify", "true",
			 "csa_units", "m",
			 "propertyCategory", "MAJOR_TICKS_PROPERTIES"
		   });	
		addAnnotation
		  (getRuler3DTool_Ruler3dToolNode(), 
		   source, 
		   new String[] {
			 "documentation", " Topology Node associated with the tool.",
			 "notify", "true",
			 "children", "true",
			 "property", "Readonly",
			 "propertyCategory", "RULER_PROPERTIES"
		   });	
		addAnnotation
		  (featureOfInterestPickingToolEClass, 
		   source, 
		   new String[] {
			 "documentation", "A 3D tool used to create FeatureOfInterest."
		   });	
		addAnnotation
		  (getFeatureOfInterestPickingTool_FeatureOfInterestList(), 
		   source, 
		   new String[] {
			 "documentation", " List of Feature Of Interest where to add Feature Of Interest.",
			 "notify", "true",
			 "children", "false"
		   });	
		addAnnotation
		  (getFeatureOfInterestPickingTool_PickAbsolutePosition(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "PICKED_NODE"
		   });	
		addAnnotation
		  (getFeatureOfInterestPickingTool_PickRelativePosition(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "propertyCategory", "PICKED_NODE"
		   });	
		addAnnotation
		  (getFeatureOfInterestPickingTool_PickedNode(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "propertyCategory", "PICKED_NODE"
		   });	
		addAnnotation
		  (getFeatureOfInterestPickingTool_PickAbsoluteNormal(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "propertyCategory", "PICKED_NODE"
		   });	
		addAnnotation
		  (getFeatureOfInterestPickingTool_PickRelativeNormal(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "propertyCategory", "PICKED_NODE"
		   });	
		addAnnotation
		  (sunVector3DToolEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA 3D tool used to show the direction and intensity of the Sun."
		   });	
		addAnnotation
		  (getSunVector3DTool_VectorColor(), 
		   source, 
		   new String[] {
			 "documentation", " The vector color.",
			 "propertyCategory", "SUN_VECTOR_PROPERTIES"
		   });	
		addAnnotation
		  (getSunVector3DTool_VectorLength(), 
		   source, 
		   new String[] {
			 "documentation", " Length of the vector.",
			 "notify", "true",
			 "csa_units", "m",
			 "propertyCategory", "SUN_VECTOR_PROPERTIES"
		   });	
		addAnnotation
		  (getSunVector3DTool_EndPointRadius(), 
		   source, 
		   new String[] {
			 "documentation", " Radius of sphere used as end point to vector.",
			 "notify", "true",
			 "csa_units", "m",
			 "propertyCategory", "SUN_VECTOR_PROPERTIES"
		   });	
		addAnnotation
		  (getSunVector3DTool_SunIntensity(), 
		   source, 
		   new String[] {
			 "documentation", " The current sun intensity.",
			 "notify", "true",
			 "csa_units", "W/m*m",
			 "property", "Readonly",
			 "propertyCategory", "SUN_VECTOR_LIGHT_PROPERTIES"
		   });	
		addAnnotation
		  (getSunVector3DTool_CurrentDayMaximumSunIntensity(), 
		   source, 
		   new String[] {
			 "documentation", " The current day maximum sun intensity.",
			 "notify", "true",
			 "csa_units", "W/m*m",
			 "property", "Readonly",
			 "propertyCategory", "SUN_VECTOR_LIGHT_PROPERTIES"
		   });	
		addAnnotation
		  (getSunVector3DTool_CurrentSunIntensityPercentage(), 
		   source, 
		   new String[] {
			 "documentation", " The current sun intensity.",
			 "notify", "true",
			 "csa_units", "%",
			 "property", "Readonly",
			 "propertyCategory", "SUN_VECTOR_LIGHT_PROPERTIES"
		   });	
		addAnnotation
		  (getSunVector3DTool_SunVector3DToolNode(), 
		   source, 
		   new String[] {
			 "documentation", " Topology Node associated with the tool.",
			 "notify", "true",
			 "children", "true",
			 "property", "Readonly",
			 "propertyCategory", "SUN_VECTOR_PROPERTIES"
		   });	
		addAnnotation
		  (trajectory3DToolEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA 3D tool used to trace the trajectory of a Variable."
		   });	
		addAnnotation
		  (getTrajectory3DTool_PenDown(), 
		   source, 
		   new String[] {
			 "documentation", "* Whether of not the trajectory is traced.",
			 "propertyCategory", "TRAJECTORY_3D_TOOL"
		   });	
		addAnnotation
		  (getTrajectory3DTool_Variable(), 
		   source, 
		   new String[] {
			 "documentation", " The Symphony System being displayed.",
			 "propertyCategory", "TRAJECTORY_3D_TOOL"
		   });	
		addAnnotation
		  (getTrajectory3DTool_DistanceThreshold(), 
		   source, 
		   new String[] {
			 "documentation", "* Minimum distance used to trigger a new point being accepted.",
			 "propertyCategory", "TRAJECTORY_3D_TOOL",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getTrajectory3DTool_TotalDistance(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "TRAJECTORY_3D_TOOL",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getTrajectory3DTool_Paths(), 
		   source, 
		   new String[] {
			 "documentation", "* The  WayPointPath currently recorded."
		   });	
		addAnnotation
		  (getTrajectory3DTool_PoseProvider(), 
		   source, 
		   new String[] {
			 "documentation", "* The pose provide providing pose data.",
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "TRAJECTORY_3D_TOOL"
		   });	
		addAnnotation
		  (getTrajectory3DTool_Trajectory3DToolNode(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "TRAJECTORY_3D_TOOL"
		   });	
		addAnnotation
		  (trajectory3DToolNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nNode representing the Trajectory3DTool in the topology."
		   });
	}

} //SymphonyToolsCorePackageImpl
