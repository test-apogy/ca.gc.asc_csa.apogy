/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.topology.ui;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

import org.eclipse.emf.ecore.EObject;

import ca.gc.space.math.Tuple3d;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.impl.TopologyUIFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.topology.ui.TopologyUIPackage#getTopologyUIFacade()
 * @model
 * @generated
 */
public interface TopologyUIFacade extends EObject 
{
	public static final TopologyUIFacade INSTANCE = TopologyUIFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" topologyRootUnique="false"
	 * @generated
	 */
	GraphicsContext createGraphicsContext(Node topologyRoot);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootUnique="false" topologyPresentationSetUnique="false" minUnique="false" maxUnique="false"
	 * @generated
	 */
	void findExtent(Node root, TopologyPresentationSet topologyPresentationSet, Tuple3d min, Tuple3d max);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" topologyPresentationSetUnique="false" nodePresentationUnique="false" relativePositionDataType="ca.gc.space.topology.ui.Point3d" relativePositionUnique="false"
	 * @generated
	 */
	NodeSelection createNodeSelection(TopologyPresentationSet topologyPresentationSet, NodePresentation nodePresentation, Point3d relativePosition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" topologyPresentationSetUnique="false" nodeUnique="false" relativePositionDataType="ca.gc.space.topology.ui.Point3d" relativePositionUnique="false" relativeNormalDataType="ca.gc.space.topology.ui.Vector3f" relativeNormalUnique="false"
	 * @generated
	 */
	NodeSelection createNodeSelection(TopologyPresentationSet topologyPresentationSet, Node node, Point3d relativePosition, Vector3f relativeNormal);

} // TopologyUIFacade
