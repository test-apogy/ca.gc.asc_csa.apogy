/**
 */
package ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import javax.vecmath.Point3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pick Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PickVectorImpl#getIntersectionDistance <em>Intersection Distance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PickVectorImpl#getIntersectedNode <em>Intersected Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PickVectorImpl#getRelativeIntersectionPosition <em>Relative Intersection Position</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PickVectorImpl#getAbsoluteIntersectionPosition <em>Absolute Intersection Position</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PickVectorImpl#getNodeTypesInIntersection <em>Node Types In Intersection</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PickVectorImpl#getNodeTypesToExcludeFromIntersection <em>Node Types To Exclude From Intersection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PickVectorImpl extends VectorImpl implements PickVector {
	/**
	 * The default value of the '{@link #getIntersectionDistance() <em>Intersection Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntersectionDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double INTERSECTION_DISTANCE_EDEFAULT = -1.0;

	/**
	 * The cached value of the '{@link #getIntersectionDistance() <em>Intersection Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntersectionDistance()
	 * @generated
	 * @ordered
	 */
	protected double intersectionDistance = INTERSECTION_DISTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIntersectedNode() <em>Intersected Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntersectedNode()
	 * @generated
	 * @ordered
	 */
	protected Node intersectedNode;

	/**
	 * The default value of the '{@link #getRelativeIntersectionPosition() <em>Relative Intersection Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeIntersectionPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Point3d RELATIVE_INTERSECTION_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativeIntersectionPosition() <em>Relative Intersection Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeIntersectionPosition()
	 * @generated
	 * @ordered
	 */
	protected Point3d relativeIntersectionPosition = RELATIVE_INTERSECTION_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbsoluteIntersectionPosition() <em>Absolute Intersection Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteIntersectionPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Point3d ABSOLUTE_INTERSECTION_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbsoluteIntersectionPosition() <em>Absolute Intersection Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteIntersectionPosition()
	 * @generated
	 * @ordered
	 */
	protected Point3d absoluteIntersectionPosition = ABSOLUTE_INTERSECTION_POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodeTypesInIntersection() <em>Node Types In Intersection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeTypesInIntersection()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> nodeTypesInIntersection;

	/**
	 * The cached value of the '{@link #getNodeTypesToExcludeFromIntersection() <em>Node Types To Exclude From Intersection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeTypesToExcludeFromIntersection()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> nodeTypesToExcludeFromIntersection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PickVectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyAddonsPrimitivesPackage.Literals.PICK_VECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIntersectionDistance() {
		return intersectionDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntersectionDistance(double newIntersectionDistance) {
		double oldIntersectionDistance = intersectionDistance;
		intersectionDistance = newIntersectionDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__INTERSECTION_DISTANCE, oldIntersectionDistance, intersectionDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getIntersectedNode() {
		if (intersectedNode != null && intersectedNode.eIsProxy()) {
			InternalEObject oldIntersectedNode = (InternalEObject)intersectedNode;
			intersectedNode = (Node)eResolveProxy(oldIntersectedNode);
			if (intersectedNode != oldIntersectedNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__INTERSECTED_NODE, oldIntersectedNode, intersectedNode));
			}
		}
		return intersectedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetIntersectedNode() {
		return intersectedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntersectedNode(Node newIntersectedNode) {
		Node oldIntersectedNode = intersectedNode;
		intersectedNode = newIntersectedNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__INTERSECTED_NODE, oldIntersectedNode, intersectedNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getNodeTypesInIntersection() {
		if (nodeTypesInIntersection == null) {
			nodeTypesInIntersection = new EObjectResolvingEList<EClass>(EClass.class, this, ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__NODE_TYPES_IN_INTERSECTION);
		}
		return nodeTypesInIntersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point3d getRelativeIntersectionPosition() {
		return relativeIntersectionPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeIntersectionPosition(Point3d newRelativeIntersectionPosition) {
		Point3d oldRelativeIntersectionPosition = relativeIntersectionPosition;
		relativeIntersectionPosition = newRelativeIntersectionPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__RELATIVE_INTERSECTION_POSITION, oldRelativeIntersectionPosition, relativeIntersectionPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point3d getAbsoluteIntersectionPosition() {
		return absoluteIntersectionPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsoluteIntersectionPosition(Point3d newAbsoluteIntersectionPosition) {
		Point3d oldAbsoluteIntersectionPosition = absoluteIntersectionPosition;
		absoluteIntersectionPosition = newAbsoluteIntersectionPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__ABSOLUTE_INTERSECTION_POSITION, oldAbsoluteIntersectionPosition, absoluteIntersectionPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getNodeTypesToExcludeFromIntersection() {
		if (nodeTypesToExcludeFromIntersection == null) {
			nodeTypesToExcludeFromIntersection = new EObjectResolvingEList<EClass>(EClass.class, this, ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__NODE_TYPES_TO_EXCLUDE_FROM_INTERSECTION);
		}
		return nodeTypesToExcludeFromIntersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@SuppressWarnings("rawtypes")
	public boolean isNodeIncludedInIntersection(Node node) 
	{
		boolean included = false;
		
		// Check first if the class of the node has been excluded from selection.
		for(EClass eClass : getNodeTypesToExcludeFromIntersection())
		{
			if(eClass.isSuperTypeOf(node.eClass()))
			{
				return false;
			}
		}
		
		// Then check if the class of the node has been included in the selection.
		for(EClass eClass : getNodeTypesInIntersection())
		{
			if(eClass.isSuperTypeOf(node.eClass()))
			{
				included = true;
			}
			
			if(node instanceof ContentNode)
			{				
				ContentNode contentNode = (ContentNode) node;
				if(contentNode.getContent() instanceof EObject)					
				{
					EObject eObject = (EObject) contentNode.getContent();
															
					if(eClass.isSuperTypeOf(eObject.eClass()))
					{
						included = true;
					}
				} 
			}
		}
		
		return included;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__INTERSECTION_DISTANCE:
				return getIntersectionDistance();
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__INTERSECTED_NODE:
				if (resolve) return getIntersectedNode();
				return basicGetIntersectedNode();
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__RELATIVE_INTERSECTION_POSITION:
				return getRelativeIntersectionPosition();
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__ABSOLUTE_INTERSECTION_POSITION:
				return getAbsoluteIntersectionPosition();
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__NODE_TYPES_IN_INTERSECTION:
				return getNodeTypesInIntersection();
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__NODE_TYPES_TO_EXCLUDE_FROM_INTERSECTION:
				return getNodeTypesToExcludeFromIntersection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__INTERSECTION_DISTANCE:
				setIntersectionDistance((Double)newValue);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__INTERSECTED_NODE:
				setIntersectedNode((Node)newValue);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__RELATIVE_INTERSECTION_POSITION:
				setRelativeIntersectionPosition((Point3d)newValue);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__ABSOLUTE_INTERSECTION_POSITION:
				setAbsoluteIntersectionPosition((Point3d)newValue);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__NODE_TYPES_IN_INTERSECTION:
				getNodeTypesInIntersection().clear();
				getNodeTypesInIntersection().addAll((Collection<? extends EClass>)newValue);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__NODE_TYPES_TO_EXCLUDE_FROM_INTERSECTION:
				getNodeTypesToExcludeFromIntersection().clear();
				getNodeTypesToExcludeFromIntersection().addAll((Collection<? extends EClass>)newValue);
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
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__INTERSECTION_DISTANCE:
				setIntersectionDistance(INTERSECTION_DISTANCE_EDEFAULT);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__INTERSECTED_NODE:
				setIntersectedNode((Node)null);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__RELATIVE_INTERSECTION_POSITION:
				setRelativeIntersectionPosition(RELATIVE_INTERSECTION_POSITION_EDEFAULT);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__ABSOLUTE_INTERSECTION_POSITION:
				setAbsoluteIntersectionPosition(ABSOLUTE_INTERSECTION_POSITION_EDEFAULT);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__NODE_TYPES_IN_INTERSECTION:
				getNodeTypesInIntersection().clear();
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__NODE_TYPES_TO_EXCLUDE_FROM_INTERSECTION:
				getNodeTypesToExcludeFromIntersection().clear();
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
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__INTERSECTION_DISTANCE:
				return intersectionDistance != INTERSECTION_DISTANCE_EDEFAULT;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__INTERSECTED_NODE:
				return intersectedNode != null;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__RELATIVE_INTERSECTION_POSITION:
				return RELATIVE_INTERSECTION_POSITION_EDEFAULT == null ? relativeIntersectionPosition != null : !RELATIVE_INTERSECTION_POSITION_EDEFAULT.equals(relativeIntersectionPosition);
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__ABSOLUTE_INTERSECTION_POSITION:
				return ABSOLUTE_INTERSECTION_POSITION_EDEFAULT == null ? absoluteIntersectionPosition != null : !ABSOLUTE_INTERSECTION_POSITION_EDEFAULT.equals(absoluteIntersectionPosition);
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__NODE_TYPES_IN_INTERSECTION:
				return nodeTypesInIntersection != null && !nodeTypesInIntersection.isEmpty();
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR__NODE_TYPES_TO_EXCLUDE_FROM_INTERSECTION:
				return nodeTypesToExcludeFromIntersection != null && !nodeTypesToExcludeFromIntersection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR___IS_NODE_INCLUDED_IN_INTERSECTION__NODE:
				return isNodeIncludedInIntersection((Node)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (intersectionDistance: ");
		result.append(intersectionDistance);
		result.append(", relativeIntersectionPosition: ");
		result.append(relativeIntersectionPosition);
		result.append(", absoluteIntersectionPosition: ");
		result.append(absoluteIntersectionPosition);
		result.append(')');
		return result.toString();
	}

} //PickVectorImpl
