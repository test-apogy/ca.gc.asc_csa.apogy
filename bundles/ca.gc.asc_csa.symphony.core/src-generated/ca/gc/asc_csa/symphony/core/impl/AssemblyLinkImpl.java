/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMember;
import ca.gc.asc_csa.symphony.core.AssemblyLink;
import ca.gc.asc_csa.symphony.core.ConnectionPoint;
import ca.gc.asc_csa.symphony.core.SymphonyCorePackage;
import ca.gc.asc_csa.symphony.core.SymphonySystem;
import ca.gc.space.math.Matrix4x4;
import ca.gc.space.topology.Node;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Assembly Link</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.core.impl.AssemblyLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.impl.AssemblyLinkImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.impl.AssemblyLinkImpl#getParentTypeMember <em>Parent Type Member</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.impl.AssemblyLinkImpl#getSubSystemTypeMember <em>Sub System Type Member</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.impl.AssemblyLinkImpl#getParentConnectionPoint <em>Parent Connection Point</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.impl.AssemblyLinkImpl#getTransformationMatrix <em>Transformation Matrix</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.impl.AssemblyLinkImpl#getGeometryNode <em>Geometry Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.impl.AssemblyLinkImpl#getParentInstance <em>Parent Instance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.impl.AssemblyLinkImpl#getSubSystemInstance <em>Sub System Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblyLinkImpl extends MinimalEObjectImpl.Container implements
		AssemblyLink {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentTypeMember() <em>Parent Type Member</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getParentTypeMember()
	 * @generated
	 * @ordered
	 */
	protected TypeMember parentTypeMember;

	/**
	 * The cached value of the '{@link #getSubSystemTypeMember() <em>Sub System Type Member</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSubSystemTypeMember()
	 * @generated
	 * @ordered
	 */
	protected TypeMember subSystemTypeMember;

	/**
	 * The cached value of the '{@link #getParentConnectionPoint() <em>Parent Connection Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentConnectionPoint()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPoint parentConnectionPoint;

	/**
	 * The cached value of the '{@link #getTransformationMatrix()
	 * <em>Transformation Matrix</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTransformationMatrix()
	 * @generated
	 * @ordered
	 */
	protected Matrix4x4 transformationMatrix;

	/**
	 * The cached value of the '{@link #getGeometryNode() <em>Geometry Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryNode()
	 * @generated
	 * @ordered
	 */
	protected Node geometryNode;

	/**
	 * The cached value of the '{@link #getParentInstance() <em>Parent Instance</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getParentInstance()
	 * @generated
	 * @ordered
	 */
	protected SymphonySystem parentInstance;

	/**
	 * The cached value of the '{@link #getSubSystemInstance() <em>Sub System Instance</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSubSystemInstance()
	 * @generated
	 * @ordered
	 */
	protected SymphonySystem subSystemInstance;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyCorePackage.Literals.ASSEMBLY_LINK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.ASSEMBLY_LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.ASSEMBLY_LINK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMember getSubSystemTypeMember() {
		if (subSystemTypeMember != null && subSystemTypeMember.eIsProxy()) {
			InternalEObject oldSubSystemTypeMember = (InternalEObject)subSystemTypeMember;
			subSystemTypeMember = (TypeMember)eResolveProxy(oldSubSystemTypeMember);
			if (subSystemTypeMember != oldSubSystemTypeMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyCorePackage.ASSEMBLY_LINK__SUB_SYSTEM_TYPE_MEMBER, oldSubSystemTypeMember, subSystemTypeMember));
			}
		}
		return subSystemTypeMember;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMember basicGetSubSystemTypeMember() {
		return subSystemTypeMember;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubSystemTypeMember(TypeMember newSubSystemTypeMember) {
		TypeMember oldSubSystemTypeMember = subSystemTypeMember;
		subSystemTypeMember = newSubSystemTypeMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.ASSEMBLY_LINK__SUB_SYSTEM_TYPE_MEMBER, oldSubSystemTypeMember, subSystemTypeMember));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMember getParentTypeMember() {
		if (parentTypeMember != null && parentTypeMember.eIsProxy()) {
			InternalEObject oldParentTypeMember = (InternalEObject)parentTypeMember;
			parentTypeMember = (TypeMember)eResolveProxy(oldParentTypeMember);
			if (parentTypeMember != oldParentTypeMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyCorePackage.ASSEMBLY_LINK__PARENT_TYPE_MEMBER, oldParentTypeMember, parentTypeMember));
			}
		}
		return parentTypeMember;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMember basicGetParentTypeMember() {
		return parentTypeMember;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentTypeMember(TypeMember newParentTypeMember) {
		TypeMember oldParentTypeMember = parentTypeMember;
		parentTypeMember = newParentTypeMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.ASSEMBLY_LINK__PARENT_TYPE_MEMBER, oldParentTypeMember, parentTypeMember));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoint getParentConnectionPoint() {
		if (parentConnectionPoint != null && parentConnectionPoint.eIsProxy()) {
			InternalEObject oldParentConnectionPoint = (InternalEObject)parentConnectionPoint;
			parentConnectionPoint = (ConnectionPoint)eResolveProxy(oldParentConnectionPoint);
			if (parentConnectionPoint != oldParentConnectionPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyCorePackage.ASSEMBLY_LINK__PARENT_CONNECTION_POINT, oldParentConnectionPoint, parentConnectionPoint));
			}
		}
		return parentConnectionPoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoint basicGetParentConnectionPoint() {
		return parentConnectionPoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentConnectionPoint(
			ConnectionPoint newParentConnectionPoint) {
		ConnectionPoint oldParentConnectionPoint = parentConnectionPoint;
		parentConnectionPoint = newParentConnectionPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.ASSEMBLY_LINK__PARENT_CONNECTION_POINT, oldParentConnectionPoint, parentConnectionPoint));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix4x4 getTransformationMatrix() {
		return transformationMatrix;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformationMatrix(
			Matrix4x4 newTransformationMatrix, NotificationChain msgs) {
		Matrix4x4 oldTransformationMatrix = transformationMatrix;
		transformationMatrix = newTransformationMatrix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.ASSEMBLY_LINK__TRANSFORMATION_MATRIX, oldTransformationMatrix, newTransformationMatrix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationMatrix(Matrix4x4 newTransformationMatrix) {
		if (newTransformationMatrix != transformationMatrix) {
			NotificationChain msgs = null;
			if (transformationMatrix != null)
				msgs = ((InternalEObject)transformationMatrix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyCorePackage.ASSEMBLY_LINK__TRANSFORMATION_MATRIX, null, msgs);
			if (newTransformationMatrix != null)
				msgs = ((InternalEObject)newTransformationMatrix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyCorePackage.ASSEMBLY_LINK__TRANSFORMATION_MATRIX, null, msgs);
			msgs = basicSetTransformationMatrix(newTransformationMatrix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.ASSEMBLY_LINK__TRANSFORMATION_MATRIX, newTransformationMatrix, newTransformationMatrix));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Node getGeometryNode() {
		return geometryNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometryNode(Node newGeometryNode,
			NotificationChain msgs) {
		Node oldGeometryNode = geometryNode;
		geometryNode = newGeometryNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.ASSEMBLY_LINK__GEOMETRY_NODE, oldGeometryNode, newGeometryNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometryNode(Node newGeometryNode) {
		if (newGeometryNode != geometryNode) {
			NotificationChain msgs = null;
			if (geometryNode != null)
				msgs = ((InternalEObject)geometryNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyCorePackage.ASSEMBLY_LINK__GEOMETRY_NODE, null, msgs);
			if (newGeometryNode != null)
				msgs = ((InternalEObject)newGeometryNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyCorePackage.ASSEMBLY_LINK__GEOMETRY_NODE, null, msgs);
			msgs = basicSetGeometryNode(newGeometryNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.ASSEMBLY_LINK__GEOMETRY_NODE, newGeometryNode, newGeometryNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonySystem getParentInstance() {
		if (parentInstance != null && parentInstance.eIsProxy()) {
			InternalEObject oldParentInstance = (InternalEObject)parentInstance;
			parentInstance = (SymphonySystem)eResolveProxy(oldParentInstance);
			if (parentInstance != oldParentInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyCorePackage.ASSEMBLY_LINK__PARENT_INSTANCE, oldParentInstance, parentInstance));
			}
		}
		return parentInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonySystem basicGetParentInstance() {
		return parentInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentInstance(SymphonySystem newParentInstance) {
		SymphonySystem oldParentInstance = parentInstance;
		parentInstance = newParentInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.ASSEMBLY_LINK__PARENT_INSTANCE, oldParentInstance, parentInstance));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonySystem getSubSystemInstance() {
		if (subSystemInstance != null && subSystemInstance.eIsProxy()) {
			InternalEObject oldSubSystemInstance = (InternalEObject)subSystemInstance;
			subSystemInstance = (SymphonySystem)eResolveProxy(oldSubSystemInstance);
			if (subSystemInstance != oldSubSystemInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyCorePackage.ASSEMBLY_LINK__SUB_SYSTEM_INSTANCE, oldSubSystemInstance, subSystemInstance));
			}
		}
		return subSystemInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonySystem basicGetSubSystemInstance() {
		return subSystemInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubSystemInstance(SymphonySystem newSubSystemInstance) {
		SymphonySystem oldSubSystemInstance = subSystemInstance;
		subSystemInstance = newSubSystemInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.ASSEMBLY_LINK__SUB_SYSTEM_INSTANCE, oldSubSystemInstance, subSystemInstance));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyCorePackage.ASSEMBLY_LINK__TRANSFORMATION_MATRIX:
				return basicSetTransformationMatrix(null, msgs);
			case SymphonyCorePackage.ASSEMBLY_LINK__GEOMETRY_NODE:
				return basicSetGeometryNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyCorePackage.ASSEMBLY_LINK__NAME:
				return getName();
			case SymphonyCorePackage.ASSEMBLY_LINK__DESCRIPTION:
				return getDescription();
			case SymphonyCorePackage.ASSEMBLY_LINK__PARENT_TYPE_MEMBER:
				if (resolve) return getParentTypeMember();
				return basicGetParentTypeMember();
			case SymphonyCorePackage.ASSEMBLY_LINK__SUB_SYSTEM_TYPE_MEMBER:
				if (resolve) return getSubSystemTypeMember();
				return basicGetSubSystemTypeMember();
			case SymphonyCorePackage.ASSEMBLY_LINK__PARENT_CONNECTION_POINT:
				if (resolve) return getParentConnectionPoint();
				return basicGetParentConnectionPoint();
			case SymphonyCorePackage.ASSEMBLY_LINK__TRANSFORMATION_MATRIX:
				return getTransformationMatrix();
			case SymphonyCorePackage.ASSEMBLY_LINK__GEOMETRY_NODE:
				return getGeometryNode();
			case SymphonyCorePackage.ASSEMBLY_LINK__PARENT_INSTANCE:
				if (resolve) return getParentInstance();
				return basicGetParentInstance();
			case SymphonyCorePackage.ASSEMBLY_LINK__SUB_SYSTEM_INSTANCE:
				if (resolve) return getSubSystemInstance();
				return basicGetSubSystemInstance();
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
			case SymphonyCorePackage.ASSEMBLY_LINK__NAME:
				setName((String)newValue);
				return;
			case SymphonyCorePackage.ASSEMBLY_LINK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SymphonyCorePackage.ASSEMBLY_LINK__PARENT_TYPE_MEMBER:
				setParentTypeMember((TypeMember)newValue);
				return;
			case SymphonyCorePackage.ASSEMBLY_LINK__SUB_SYSTEM_TYPE_MEMBER:
				setSubSystemTypeMember((TypeMember)newValue);
				return;
			case SymphonyCorePackage.ASSEMBLY_LINK__PARENT_CONNECTION_POINT:
				setParentConnectionPoint((ConnectionPoint)newValue);
				return;
			case SymphonyCorePackage.ASSEMBLY_LINK__TRANSFORMATION_MATRIX:
				setTransformationMatrix((Matrix4x4)newValue);
				return;
			case SymphonyCorePackage.ASSEMBLY_LINK__GEOMETRY_NODE:
				setGeometryNode((Node)newValue);
				return;
			case SymphonyCorePackage.ASSEMBLY_LINK__PARENT_INSTANCE:
				setParentInstance((SymphonySystem)newValue);
				return;
			case SymphonyCorePackage.ASSEMBLY_LINK__SUB_SYSTEM_INSTANCE:
				setSubSystemInstance((SymphonySystem)newValue);
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
			case SymphonyCorePackage.ASSEMBLY_LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SymphonyCorePackage.ASSEMBLY_LINK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SymphonyCorePackage.ASSEMBLY_LINK__PARENT_TYPE_MEMBER:
				setParentTypeMember((TypeMember)null);
				return;
			case SymphonyCorePackage.ASSEMBLY_LINK__SUB_SYSTEM_TYPE_MEMBER:
				setSubSystemTypeMember((TypeMember)null);
				return;
			case SymphonyCorePackage.ASSEMBLY_LINK__PARENT_CONNECTION_POINT:
				setParentConnectionPoint((ConnectionPoint)null);
				return;
			case SymphonyCorePackage.ASSEMBLY_LINK__TRANSFORMATION_MATRIX:
				setTransformationMatrix((Matrix4x4)null);
				return;
			case SymphonyCorePackage.ASSEMBLY_LINK__GEOMETRY_NODE:
				setGeometryNode((Node)null);
				return;
			case SymphonyCorePackage.ASSEMBLY_LINK__PARENT_INSTANCE:
				setParentInstance((SymphonySystem)null);
				return;
			case SymphonyCorePackage.ASSEMBLY_LINK__SUB_SYSTEM_INSTANCE:
				setSubSystemInstance((SymphonySystem)null);
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
			case SymphonyCorePackage.ASSEMBLY_LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SymphonyCorePackage.ASSEMBLY_LINK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SymphonyCorePackage.ASSEMBLY_LINK__PARENT_TYPE_MEMBER:
				return parentTypeMember != null;
			case SymphonyCorePackage.ASSEMBLY_LINK__SUB_SYSTEM_TYPE_MEMBER:
				return subSystemTypeMember != null;
			case SymphonyCorePackage.ASSEMBLY_LINK__PARENT_CONNECTION_POINT:
				return parentConnectionPoint != null;
			case SymphonyCorePackage.ASSEMBLY_LINK__TRANSFORMATION_MATRIX:
				return transformationMatrix != null;
			case SymphonyCorePackage.ASSEMBLY_LINK__GEOMETRY_NODE:
				return geometryNode != null;
			case SymphonyCorePackage.ASSEMBLY_LINK__PARENT_INSTANCE:
				return parentInstance != null;
			case SymphonyCorePackage.ASSEMBLY_LINK__SUB_SYSTEM_INSTANCE:
				return subSystemInstance != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case SymphonyCorePackage.ASSEMBLY_LINK__DESCRIPTION: return EMFEcorePackage.DESCRIBED__DESCRIPTION;
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
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case EMFEcorePackage.DESCRIBED__DESCRIPTION: return SymphonyCorePackage.ASSEMBLY_LINK__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} // AssemblyLinkImpl
