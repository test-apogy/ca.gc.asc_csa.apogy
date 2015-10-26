/**
 * Canadian Space Agency 2007.
 *
 * $Id: WayPointPathImpl.java,v 1.7.4.2 2015/05/21 15:50:36 pallard Exp $
 */
package org.eclipse.symphony.addons.geometry.paths.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.geometry.paths.Path;
import org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsPackage;
import org.eclipse.symphony.addons.geometry.paths.WayPointPath;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Geometry3dUtilities;
import org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesSetImpl;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.TopologyPackage;
import org.eclipse.symphony.common.topology.INodeVisitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Way Point Path</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.impl.WayPointPathImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.impl.WayPointPathImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.impl.WayPointPathImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.impl.WayPointPathImpl#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WayPointPathImpl extends CartesianCoordinatesSetImpl implements WayPointPath {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Node parent;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeId() <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeId() <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected String nodeId = NODE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final double LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected double length = LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected WayPointPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsGeometryPathsPackage.Literals.WAY_POINT_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getParent()
	{
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Node)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetParent()
	{
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Node newParent)
	{
		Node oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription)
	{
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeId() {
		return nodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeId(String newNodeId) {
		String oldNodeId = nodeId;
		nodeId = newNodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__NODE_ID, oldNodeId, nodeId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public double getLength() {

		double lenght = 0.0;

		if ((getPoints() != null)&& (getPoints().size() > 1)) 
		{
			CartesianPositionCoordinates p1 = getPoints().get(0);
			CartesianPositionCoordinates p2 = null;
			
			for (int i = 1; i < getPoints().size(); i++) 
			{
				p2 = getPoints().get(i);
				lenght += Geometry3dUtilities.getDistance(p1, p2);
				p1 = p2;
			}
		}

		return lenght;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CartesianPositionCoordinates getEndPoint() 
	{	
		CartesianPositionCoordinates endPoint = null;

		if (getPoints().size() > 0) {
			endPoint = getPoints().get(getPoints().size() - 1);
		}

		return endPoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CartesianPositionCoordinates getStartPoint() {
		
		CartesianPositionCoordinates endPoint = null;
				
		if (getPoints().size() > 0) {
			endPoint = getPoints().get(0);
		}


		return endPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void accept(INodeVisitor visitor) 
	{
		if (visitor.getType().isInstance(this)) {
			visitor.visit(this);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__DESCRIPTION:
				return getDescription();
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__NODE_ID:
				return getNodeId();
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__LENGTH:
				return getLength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__PARENT:
				setParent((Node)newValue);
				return;
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__NODE_ID:
				setNodeId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__PARENT:
				setParent((Node)null);
				return;
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__NODE_ID:
				setNodeId(NODE_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__PARENT:
				return parent != null;
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__NODE_ID:
				return NODE_ID_EDEFAULT == null ? nodeId != null : !NODE_ID_EDEFAULT.equals(nodeId);
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__LENGTH:
				return length != LENGTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__PARENT: return TopologyPackage.NODE__PARENT;
				case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__DESCRIPTION: return TopologyPackage.NODE__DESCRIPTION;
				case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__NODE_ID: return TopologyPackage.NODE__NODE_ID;
				default: return -1;
			}
		}
		if (baseClass == Path.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				case TopologyPackage.NODE__PARENT: return Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__PARENT;
				case TopologyPackage.NODE__DESCRIPTION: return Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__DESCRIPTION;
				case TopologyPackage.NODE__NODE_ID: return Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH__NODE_ID;
				default: return -1;
			}
		}
		if (baseClass == Path.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case TopologyPackage.NODE___ACCEPT__INODEVISITOR: return Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH___ACCEPT__INODEVISITOR;
				default: return -1;
			}
		}
		if (baseClass == Path.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH___GET_START_POINT:
				return getStartPoint();
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH___GET_END_POINT:
				return getEndPoint();
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH___ACCEPT__INODEVISITOR:
				accept((INodeVisitor)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", nodeId: ");
		result.append(nodeId);
		result.append(", length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} // WayPointPathImpl
