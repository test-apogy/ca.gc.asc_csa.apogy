/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.topology.ui.impl;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodeSelection;
import ca.gc.space.topology.ui.TopologyPresentationSet;
import ca.gc.space.topology.ui.TopologyUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.topology.ui.impl.NodeSelectionImpl#getTopologyPresentationSet <em>Topology Presentation Set</em>}</li>
 *   <li>{@link ca.gc.space.topology.ui.impl.NodeSelectionImpl#getSelectedNode <em>Selected Node</em>}</li>
 *   <li>{@link ca.gc.space.topology.ui.impl.NodeSelectionImpl#getNodePresentation <em>Node Presentation</em>}</li>
 *   <li>{@link ca.gc.space.topology.ui.impl.NodeSelectionImpl#getRelativeIntersectionPoint <em>Relative Intersection Point</em>}</li>
 *   <li>{@link ca.gc.space.topology.ui.impl.NodeSelectionImpl#getAbsoluteIntersectionPoint <em>Absolute Intersection Point</em>}</li>
 *   <li>{@link ca.gc.space.topology.ui.impl.NodeSelectionImpl#getRelativeIntersectionNormal <em>Relative Intersection Normal</em>}</li>
 *   <li>{@link ca.gc.space.topology.ui.impl.NodeSelectionImpl#getAbsoluteIntersectionNormal <em>Absolute Intersection Normal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeSelectionImpl extends MinimalEObjectImpl.Container implements NodeSelection {
	/**
	 * The cached value of the '{@link #getTopologyPresentationSet() <em>Topology Presentation Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologyPresentationSet()
	 * @generated
	 * @ordered
	 */
	protected TopologyPresentationSet topologyPresentationSet;

	/**
	 * The cached value of the '{@link #getSelectedNode() <em>Selected Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedNode()
	 * @generated
	 * @ordered
	 */
	protected Node selectedNode;

	/**
	 * The cached value of the '{@link #getNodePresentation() <em>Node Presentation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodePresentation()
	 * @generated
	 * @ordered
	 */
	protected NodePresentation nodePresentation;

	/**
	 * The default value of the '{@link #getRelativeIntersectionPoint() <em>Relative Intersection Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeIntersectionPoint()
	 * @generated
	 * @ordered
	 */
	protected static final Point3d RELATIVE_INTERSECTION_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativeIntersectionPoint() <em>Relative Intersection Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeIntersectionPoint()
	 * @generated
	 * @ordered
	 */
	protected Point3d relativeIntersectionPoint = RELATIVE_INTERSECTION_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbsoluteIntersectionPoint() <em>Absolute Intersection Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteIntersectionPoint()
	 * @generated
	 * @ordered
	 */
	protected static final Point3d ABSOLUTE_INTERSECTION_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbsoluteIntersectionPoint() <em>Absolute Intersection Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteIntersectionPoint()
	 * @generated
	 * @ordered
	 */
	protected Point3d absoluteIntersectionPoint = ABSOLUTE_INTERSECTION_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativeIntersectionNormal() <em>Relative Intersection Normal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeIntersectionNormal()
	 * @generated
	 * @ordered
	 */
	protected static final Vector3f RELATIVE_INTERSECTION_NORMAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativeIntersectionNormal() <em>Relative Intersection Normal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeIntersectionNormal()
	 * @generated
	 * @ordered
	 */
	protected Vector3f relativeIntersectionNormal = RELATIVE_INTERSECTION_NORMAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbsoluteIntersectionNormal() <em>Absolute Intersection Normal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteIntersectionNormal()
	 * @generated
	 * @ordered
	 */
	protected static final Vector3f ABSOLUTE_INTERSECTION_NORMAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbsoluteIntersectionNormal() <em>Absolute Intersection Normal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteIntersectionNormal()
	 * @generated
	 * @ordered
	 */
	protected Vector3f absoluteIntersectionNormal = ABSOLUTE_INTERSECTION_NORMAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyUIPackage.Literals.NODE_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyPresentationSet getTopologyPresentationSet() {
		if (topologyPresentationSet != null && topologyPresentationSet.eIsProxy()) {
			InternalEObject oldTopologyPresentationSet = (InternalEObject)topologyPresentationSet;
			topologyPresentationSet = (TopologyPresentationSet)eResolveProxy(oldTopologyPresentationSet);
			if (topologyPresentationSet != oldTopologyPresentationSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyUIPackage.NODE_SELECTION__TOPOLOGY_PRESENTATION_SET, oldTopologyPresentationSet, topologyPresentationSet));
			}
		}
		return topologyPresentationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyPresentationSet basicGetTopologyPresentationSet() {
		return topologyPresentationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologyPresentationSet(TopologyPresentationSet newTopologyPresentationSet) {
		TopologyPresentationSet oldTopologyPresentationSet = topologyPresentationSet;
		topologyPresentationSet = newTopologyPresentationSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyUIPackage.NODE_SELECTION__TOPOLOGY_PRESENTATION_SET, oldTopologyPresentationSet, topologyPresentationSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getSelectedNode() {
		if (selectedNode != null && selectedNode.eIsProxy()) {
			InternalEObject oldSelectedNode = (InternalEObject)selectedNode;
			selectedNode = (Node)eResolveProxy(oldSelectedNode);
			if (selectedNode != oldSelectedNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyUIPackage.NODE_SELECTION__SELECTED_NODE, oldSelectedNode, selectedNode));
			}
		}
		return selectedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSelectedNode() {
		return selectedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedNode(Node newSelectedNode) {
		Node oldSelectedNode = selectedNode;
		selectedNode = newSelectedNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyUIPackage.NODE_SELECTION__SELECTED_NODE, oldSelectedNode, selectedNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodePresentation getNodePresentation() {
		if (nodePresentation != null && nodePresentation.eIsProxy()) {
			InternalEObject oldNodePresentation = (InternalEObject)nodePresentation;
			nodePresentation = (NodePresentation)eResolveProxy(oldNodePresentation);
			if (nodePresentation != oldNodePresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyUIPackage.NODE_SELECTION__NODE_PRESENTATION, oldNodePresentation, nodePresentation));
			}
		}
		return nodePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodePresentation basicGetNodePresentation() {
		return nodePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodePresentation(NodePresentation newNodePresentation) {
		NodePresentation oldNodePresentation = nodePresentation;
		nodePresentation = newNodePresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyUIPackage.NODE_SELECTION__NODE_PRESENTATION, oldNodePresentation, nodePresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point3d getRelativeIntersectionPoint() {
		return relativeIntersectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeIntersectionPoint(Point3d newRelativeIntersectionPoint) {
		Point3d oldRelativeIntersectionPoint = relativeIntersectionPoint;
		relativeIntersectionPoint = newRelativeIntersectionPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyUIPackage.NODE_SELECTION__RELATIVE_INTERSECTION_POINT, oldRelativeIntersectionPoint, relativeIntersectionPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Point3d getAbsoluteIntersectionPoint() 
	{
		if(absoluteIntersectionPoint == null)
		{
			if(getSelectedNode() != null && getRelativeIntersectionPoint() != null)
			{
				absoluteIntersectionPoint = new Point3d(getRelativeIntersectionPoint());	
				Matrix4d m = ca.gc.space.topology.TopologyFacade.INSTANCE.expressNodeInRootFrame(getSelectedNode());
				m.transform(absoluteIntersectionPoint);
				
				setAbsoluteIntersectionPoint(absoluteIntersectionPoint);
			}							
		}
		
		return absoluteIntersectionPoint;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsoluteIntersectionPoint(Point3d newAbsoluteIntersectionPoint) {
		Point3d oldAbsoluteIntersectionPoint = absoluteIntersectionPoint;
		absoluteIntersectionPoint = newAbsoluteIntersectionPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyUIPackage.NODE_SELECTION__ABSOLUTE_INTERSECTION_POINT, oldAbsoluteIntersectionPoint, absoluteIntersectionPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3f getRelativeIntersectionNormal() {
		return relativeIntersectionNormal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeIntersectionNormal(Vector3f newRelativeIntersectionNormal) {
		Vector3f oldRelativeIntersectionNormal = relativeIntersectionNormal;
		relativeIntersectionNormal = newRelativeIntersectionNormal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyUIPackage.NODE_SELECTION__RELATIVE_INTERSECTION_NORMAL, oldRelativeIntersectionNormal, relativeIntersectionNormal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Vector3f getAbsoluteIntersectionNormal() 
	{
		if(absoluteIntersectionNormal == null)
		{
			if(getSelectedNode() != null && getRelativeIntersectionNormal() != null)
			{
				absoluteIntersectionNormal = new Vector3f(getRelativeIntersectionNormal());	
				Matrix4d m = ca.gc.space.topology.TopologyFacade.INSTANCE.expressNodeInRootFrame(getSelectedNode());
				m.transform(absoluteIntersectionNormal);
				
				setAbsoluteIntersectionNormal(absoluteIntersectionNormal);
			}
		}
		return absoluteIntersectionNormal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsoluteIntersectionNormal(Vector3f newAbsoluteIntersectionNormal) {
		Vector3f oldAbsoluteIntersectionNormal = absoluteIntersectionNormal;
		absoluteIntersectionNormal = newAbsoluteIntersectionNormal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyUIPackage.NODE_SELECTION__ABSOLUTE_INTERSECTION_NORMAL, oldAbsoluteIntersectionNormal, absoluteIntersectionNormal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TopologyUIPackage.NODE_SELECTION__TOPOLOGY_PRESENTATION_SET:
				if (resolve) return getTopologyPresentationSet();
				return basicGetTopologyPresentationSet();
			case TopologyUIPackage.NODE_SELECTION__SELECTED_NODE:
				if (resolve) return getSelectedNode();
				return basicGetSelectedNode();
			case TopologyUIPackage.NODE_SELECTION__NODE_PRESENTATION:
				if (resolve) return getNodePresentation();
				return basicGetNodePresentation();
			case TopologyUIPackage.NODE_SELECTION__RELATIVE_INTERSECTION_POINT:
				return getRelativeIntersectionPoint();
			case TopologyUIPackage.NODE_SELECTION__ABSOLUTE_INTERSECTION_POINT:
				return getAbsoluteIntersectionPoint();
			case TopologyUIPackage.NODE_SELECTION__RELATIVE_INTERSECTION_NORMAL:
				return getRelativeIntersectionNormal();
			case TopologyUIPackage.NODE_SELECTION__ABSOLUTE_INTERSECTION_NORMAL:
				return getAbsoluteIntersectionNormal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TopologyUIPackage.NODE_SELECTION__TOPOLOGY_PRESENTATION_SET:
				setTopologyPresentationSet((TopologyPresentationSet)newValue);
				return;
			case TopologyUIPackage.NODE_SELECTION__SELECTED_NODE:
				setSelectedNode((Node)newValue);
				return;
			case TopologyUIPackage.NODE_SELECTION__NODE_PRESENTATION:
				setNodePresentation((NodePresentation)newValue);
				return;
			case TopologyUIPackage.NODE_SELECTION__RELATIVE_INTERSECTION_POINT:
				setRelativeIntersectionPoint((Point3d)newValue);
				return;
			case TopologyUIPackage.NODE_SELECTION__ABSOLUTE_INTERSECTION_POINT:
				setAbsoluteIntersectionPoint((Point3d)newValue);
				return;
			case TopologyUIPackage.NODE_SELECTION__RELATIVE_INTERSECTION_NORMAL:
				setRelativeIntersectionNormal((Vector3f)newValue);
				return;
			case TopologyUIPackage.NODE_SELECTION__ABSOLUTE_INTERSECTION_NORMAL:
				setAbsoluteIntersectionNormal((Vector3f)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TopologyUIPackage.NODE_SELECTION__TOPOLOGY_PRESENTATION_SET:
				setTopologyPresentationSet((TopologyPresentationSet)null);
				return;
			case TopologyUIPackage.NODE_SELECTION__SELECTED_NODE:
				setSelectedNode((Node)null);
				return;
			case TopologyUIPackage.NODE_SELECTION__NODE_PRESENTATION:
				setNodePresentation((NodePresentation)null);
				return;
			case TopologyUIPackage.NODE_SELECTION__RELATIVE_INTERSECTION_POINT:
				setRelativeIntersectionPoint(RELATIVE_INTERSECTION_POINT_EDEFAULT);
				return;
			case TopologyUIPackage.NODE_SELECTION__ABSOLUTE_INTERSECTION_POINT:
				setAbsoluteIntersectionPoint(ABSOLUTE_INTERSECTION_POINT_EDEFAULT);
				return;
			case TopologyUIPackage.NODE_SELECTION__RELATIVE_INTERSECTION_NORMAL:
				setRelativeIntersectionNormal(RELATIVE_INTERSECTION_NORMAL_EDEFAULT);
				return;
			case TopologyUIPackage.NODE_SELECTION__ABSOLUTE_INTERSECTION_NORMAL:
				setAbsoluteIntersectionNormal(ABSOLUTE_INTERSECTION_NORMAL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TopologyUIPackage.NODE_SELECTION__TOPOLOGY_PRESENTATION_SET:
				return topologyPresentationSet != null;
			case TopologyUIPackage.NODE_SELECTION__SELECTED_NODE:
				return selectedNode != null;
			case TopologyUIPackage.NODE_SELECTION__NODE_PRESENTATION:
				return nodePresentation != null;
			case TopologyUIPackage.NODE_SELECTION__RELATIVE_INTERSECTION_POINT:
				return RELATIVE_INTERSECTION_POINT_EDEFAULT == null ? relativeIntersectionPoint != null : !RELATIVE_INTERSECTION_POINT_EDEFAULT.equals(relativeIntersectionPoint);
			case TopologyUIPackage.NODE_SELECTION__ABSOLUTE_INTERSECTION_POINT:
				return ABSOLUTE_INTERSECTION_POINT_EDEFAULT == null ? absoluteIntersectionPoint != null : !ABSOLUTE_INTERSECTION_POINT_EDEFAULT.equals(absoluteIntersectionPoint);
			case TopologyUIPackage.NODE_SELECTION__RELATIVE_INTERSECTION_NORMAL:
				return RELATIVE_INTERSECTION_NORMAL_EDEFAULT == null ? relativeIntersectionNormal != null : !RELATIVE_INTERSECTION_NORMAL_EDEFAULT.equals(relativeIntersectionNormal);
			case TopologyUIPackage.NODE_SELECTION__ABSOLUTE_INTERSECTION_NORMAL:
				return ABSOLUTE_INTERSECTION_NORMAL_EDEFAULT == null ? absoluteIntersectionNormal != null : !ABSOLUTE_INTERSECTION_NORMAL_EDEFAULT.equals(absoluteIntersectionNormal);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (relativeIntersectionPoint: ");
		result.append(relativeIntersectionPoint);
		result.append(", absoluteIntersectionPoint: ");
		result.append(absoluteIntersectionPoint);
		result.append(", relativeIntersectionNormal: ");
		result.append(relativeIntersectionNormal);
		result.append(", absoluteIntersectionNormal: ");
		result.append(absoluteIntersectionNormal);
		result.append(')');
		return result.toString();
	}

} //NodeSelectionImpl
