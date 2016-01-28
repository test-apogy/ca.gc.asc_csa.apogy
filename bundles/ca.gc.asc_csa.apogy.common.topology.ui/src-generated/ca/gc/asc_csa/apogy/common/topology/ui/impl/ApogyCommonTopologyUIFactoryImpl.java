/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology.ui.impl;

import java.util.List;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext;
import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection;
import ca.gc.asc_csa.apogy.common.topology.ui.PositionNodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.RotationNodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;
import ca.gc.asc_csa.apogy.common.topology.ui.ShadowMode;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFactory;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.TransformNodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.URLNodePresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonTopologyUIFactoryImpl extends EFactoryImpl implements ApogyCommonTopologyUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonTopologyUIFactory init() {
		try {
			ApogyCommonTopologyUIFactory theApogyCommonTopologyUIFactory = (ApogyCommonTopologyUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonTopologyUIPackage.eNS_URI);
			if (theApogyCommonTopologyUIFactory != null) {
				return theApogyCommonTopologyUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonTopologyUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonTopologyUIFactoryImpl() {
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
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY: return createTopologyPresentationRegistry();
			case ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT: return createGraphicsContext();
			case ApogyCommonTopologyUIPackage.NODE_SELECTION: return createNodeSelection();
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET: return createTopologyPresentationSet();
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION: return createNodePresentation();
			case ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION: return createTransformNodePresentation();
			case ApogyCommonTopologyUIPackage.ROTATION_NODE_PRESENTATION: return createRotationNodePresentation();
			case ApogyCommonTopologyUIPackage.POSITION_NODE_PRESENTATION: return createPositionNodePresentation();
			case ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION: return createURLNodePresentation();
			case ApogyCommonTopologyUIPackage.APOGY_COMMON_TOPOLOGY_UI_FACADE: return createApogyCommonTopologyUIFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyCommonTopologyUIPackage.SHADOW_MODE:
				return createShadowModeFromString(eDataType, initialValue);
			case ApogyCommonTopologyUIPackage.MESH_PRESENTATION_MODE:
				return createMeshPresentationModeFromString(eDataType, initialValue);
			case ApogyCommonTopologyUIPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case ApogyCommonTopologyUIPackage.RGB:
				return createRGBFromString(eDataType, initialValue);
			case ApogyCommonTopologyUIPackage.POINT3D:
				return createPoint3dFromString(eDataType, initialValue);
			case ApogyCommonTopologyUIPackage.VECTOR3F:
				return createVector3fFromString(eDataType, initialValue);
			case ApogyCommonTopologyUIPackage.SCENE_OBJECT:
				return createSceneObjectFromString(eDataType, initialValue);
			case ApogyCommonTopologyUIPackage.NOTIFICATION:
				return createNotificationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyCommonTopologyUIPackage.SHADOW_MODE:
				return convertShadowModeToString(eDataType, instanceValue);
			case ApogyCommonTopologyUIPackage.MESH_PRESENTATION_MODE:
				return convertMeshPresentationModeToString(eDataType, instanceValue);
			case ApogyCommonTopologyUIPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case ApogyCommonTopologyUIPackage.RGB:
				return convertRGBToString(eDataType, instanceValue);
			case ApogyCommonTopologyUIPackage.POINT3D:
				return convertPoint3dToString(eDataType, instanceValue);
			case ApogyCommonTopologyUIPackage.VECTOR3F:
				return convertVector3fToString(eDataType, instanceValue);
			case ApogyCommonTopologyUIPackage.SCENE_OBJECT:
				return convertSceneObjectToString(eDataType, instanceValue);
			case ApogyCommonTopologyUIPackage.NOTIFICATION:
				return convertNotificationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyPresentationRegistry createTopologyPresentationRegistry() {
		TopologyPresentationRegistryImpl topologyPresentationRegistry = new TopologyPresentationRegistryImpl();
		return topologyPresentationRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicsContext createGraphicsContext() {
		GraphicsContextImpl graphicsContext = new GraphicsContextImpl();
		return graphicsContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSelection createNodeSelection() {
		NodeSelectionImpl nodeSelection = new NodeSelectionImpl();
		return nodeSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyPresentationSet createTopologyPresentationSet() {
		TopologyPresentationSetImpl topologyPresentationSet = new TopologyPresentationSetImpl();
		return topologyPresentationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodePresentation createNodePresentation() {
		NodePresentationImpl nodePresentation = new NodePresentationImpl();
		return nodePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformNodePresentation createTransformNodePresentation() {
		TransformNodePresentationImpl transformNodePresentation = new TransformNodePresentationImpl();
		return transformNodePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotationNodePresentation createRotationNodePresentation() {
		RotationNodePresentationImpl rotationNodePresentation = new RotationNodePresentationImpl();
		return rotationNodePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionNodePresentation createPositionNodePresentation() {
		PositionNodePresentationImpl positionNodePresentation = new PositionNodePresentationImpl();
		return positionNodePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLNodePresentation createURLNodePresentation() {
		URLNodePresentationImpl urlNodePresentation = new URLNodePresentationImpl();
		return urlNodePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonTopologyUIFacade createApogyCommonTopologyUIFacade() {
		ApogyCommonTopologyUIFacadeImpl apogyCommonTopologyUIFacade = new ApogyCommonTopologyUIFacadeImpl();
		return apogyCommonTopologyUIFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShadowMode createShadowModeFromString(EDataType eDataType, String initialValue) {
		ShadowMode result = ShadowMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShadowModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeshPresentationMode createMeshPresentationModeFromString(EDataType eDataType, String initialValue) {
		MeshPresentationMode result = MeshPresentationMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeshPresentationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public RGB createRGBFromString(EDataType eDataType, String initialValue) {		
		String[] values = initialValue.split(",");
		return new RGB(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String convertRGBToString(EDataType eDataType, Object instanceValue) {		
		RGB rgb = (RGB) instanceValue;				
		return Integer.toString(rgb.red) + "," + Integer.toString(rgb.green) + "," + Integer.toString(rgb.blue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point3d createPoint3dFromString(EDataType eDataType, String initialValue) {
		return (Point3d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPoint3dToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3f createVector3fFromString(EDataType eDataType, String initialValue) {
		return (Vector3f)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVector3fToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneObject createSceneObjectFromString(EDataType eDataType, String initialValue) {
		return (SceneObject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSceneObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notification createNotificationFromString(EDataType eDataType, String initialValue) {
		return (Notification)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotificationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonTopologyUIPackage getApogyCommonTopologyUIPackage() {
		return (ApogyCommonTopologyUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonTopologyUIPackage getPackage() {
		return ApogyCommonTopologyUIPackage.eINSTANCE;
	}

} //ApogyCommonTopologyUIFactoryImpl
