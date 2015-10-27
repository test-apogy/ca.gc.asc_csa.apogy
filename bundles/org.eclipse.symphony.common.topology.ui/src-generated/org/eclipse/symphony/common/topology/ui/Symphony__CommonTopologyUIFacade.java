/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIPackage#getSymphony__CommonTopologyUIFacade()
 * @model
 * @generated
 */
public interface Symphony__CommonTopologyUIFacade extends EObject 
{
	public static final Symphony__CommonTopologyUIFacade INSTANCE = Symphony__CommonTopologyUIFacadeImpl.getInstance();
	
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
	 * @model unique="false" topologyPresentationSetUnique="false" nodePresentationUnique="false" relativePositionDataType="org.eclipse.symphony.common.topology.ui.Point3d" relativePositionUnique="false"
	 * @generated
	 */
	NodeSelection createNodeSelection(TopologyPresentationSet topologyPresentationSet, NodePresentation nodePresentation, Point3d relativePosition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" topologyPresentationSetUnique="false" nodeUnique="false" relativePositionDataType="org.eclipse.symphony.common.topology.ui.Point3d" relativePositionUnique="false" relativeNormalDataType="org.eclipse.symphony.common.topology.ui.Vector3f" relativeNormalUnique="false"
	 * @generated
	 */
	NodeSelection createNodeSelection(TopologyPresentationSet topologyPresentationSet, Node node, Point3d relativePosition, Vector3f relativeNormal);

} // Symphony__CommonTopologyUIFacade
