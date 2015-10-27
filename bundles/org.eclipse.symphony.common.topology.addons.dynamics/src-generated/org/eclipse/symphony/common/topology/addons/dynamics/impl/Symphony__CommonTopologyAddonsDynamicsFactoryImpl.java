/**
 * <copyright>
 * </copyright>
 *
 * $Id: Symphony__CommonTopologyAddonsDynamicsFactoryImpl.java,v 1.22.2.3 2015/02/03 20:01:36 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.dynamics.impl;

import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.common.topology.addons.dynamics.BoxGeometry;
import org.eclipse.symphony.common.topology.addons.dynamics.CapsuleGeometry;
import org.eclipse.symphony.common.topology.addons.dynamics.CollisionGeometry;
import org.eclipse.symphony.common.topology.addons.dynamics.ConstraintAttachmentPoint;
import org.eclipse.symphony.common.topology.addons.dynamics.ConstraintState;
import org.eclipse.symphony.common.topology.addons.dynamics.CylinderGeometry;
import org.eclipse.symphony.common.topology.addons.dynamics.CylindricalConstraint;
import org.eclipse.symphony.common.topology.addons.dynamics.DynamicSystemProperties;
import org.eclipse.symphony.common.topology.addons.dynamics.DynamicsFacade;
import org.eclipse.symphony.common.topology.addons.dynamics.GearRatioConstraint;
import org.eclipse.symphony.common.topology.addons.dynamics.HingeConstraint;
import org.eclipse.symphony.common.topology.addons.dynamics.KinematicState;
import org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBody;
import org.eclipse.symphony.common.topology.addons.dynamics.PhysicalProperties;
import org.eclipse.symphony.common.topology.addons.dynamics.PointOfInterest;
import org.eclipse.symphony.common.topology.addons.dynamics.PrismaticConstraint;
import org.eclipse.symphony.common.topology.addons.dynamics.RPROConstraint;
import org.eclipse.symphony.common.topology.addons.dynamics.SphereGeometry;
import org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyAddonsDynamicsFactory;
import org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyAddonsDynamicsPackage;
import org.eclipse.symphony.common.topology.addons.dynamics.UniversalConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonTopologyAddonsDynamicsFactoryImpl extends EFactoryImpl implements Symphony__CommonTopologyAddonsDynamicsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CommonTopologyAddonsDynamicsFactory init() {
		try {
			Symphony__CommonTopologyAddonsDynamicsFactory theSymphony__CommonTopologyAddonsDynamicsFactory = (Symphony__CommonTopologyAddonsDynamicsFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonTopologyAddonsDynamicsPackage.eNS_URI);
			if (theSymphony__CommonTopologyAddonsDynamicsFactory != null) {
				return theSymphony__CommonTopologyAddonsDynamicsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonTopologyAddonsDynamicsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonTopologyAddonsDynamicsFactoryImpl() {
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
			case Symphony__CommonTopologyAddonsDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES: return createDynamicSystemProperties();
			case Symphony__CommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY: return createPhysicalBody();
			case Symphony__CommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES: return createPhysicalProperties();
			case Symphony__CommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST: return createPointOfInterest();
			case Symphony__CommonTopologyAddonsDynamicsPackage.KINEMATIC_STATE: return createKinematicState();
			case Symphony__CommonTopologyAddonsDynamicsPackage.CONSTRAINT_STATE: return createConstraintState();
			case Symphony__CommonTopologyAddonsDynamicsPackage.CYLINDRICAL_CONSTRAINT: return createCylindricalConstraint();
			case Symphony__CommonTopologyAddonsDynamicsPackage.GEAR_RATIO_CONSTRAINT: return createGearRatioConstraint();
			case Symphony__CommonTopologyAddonsDynamicsPackage.HINGE_CONSTRAINT: return createHingeConstraint();
			case Symphony__CommonTopologyAddonsDynamicsPackage.PRISMATIC_CONSTRAINT: return createPrismaticConstraint();
			case Symphony__CommonTopologyAddonsDynamicsPackage.RPRO_CONSTRAINT: return createRPROConstraint();
			case Symphony__CommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT: return createUniversalConstraint();
			case Symphony__CommonTopologyAddonsDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT: return createConstraintAttachmentPoint();
			case Symphony__CommonTopologyAddonsDynamicsPackage.COLLISION_GEOMETRY: return createCollisionGeometry();
			case Symphony__CommonTopologyAddonsDynamicsPackage.BOX_GEOMETRY: return createBoxGeometry();
			case Symphony__CommonTopologyAddonsDynamicsPackage.CAPSULE_GEOMETRY: return createCapsuleGeometry();
			case Symphony__CommonTopologyAddonsDynamicsPackage.CYLINDER_GEOMETRY: return createCylinderGeometry();
			case Symphony__CommonTopologyAddonsDynamicsPackage.SPHERE_GEOMETRY: return createSphereGeometry();
			case Symphony__CommonTopologyAddonsDynamicsPackage.DYNAMICS_FACADE: return createDynamicsFacade();
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
			case Symphony__CommonTopologyAddonsDynamicsPackage.SET:
				return createSetFromString(eDataType, initialValue);
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
			case Symphony__CommonTopologyAddonsDynamicsPackage.SET:
				return convertSetToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicSystemProperties createDynamicSystemProperties() {
		DynamicSystemPropertiesImpl dynamicSystemProperties = new DynamicSystemPropertiesImpl();
		return dynamicSystemProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalBody createPhysicalBody() {
		PhysicalBodyImpl physicalBody = new PhysicalBodyImpl();
		return physicalBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalProperties createPhysicalProperties() {
		PhysicalPropertiesImpl physicalProperties = new PhysicalPropertiesImpl();
		return physicalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintState createConstraintState() {
		ConstraintStateImpl constraintState = new ConstraintStateImpl();
		return constraintState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CylindricalConstraint createCylindricalConstraint() {
		CylindricalConstraintImpl cylindricalConstraint = new CylindricalConstraintImpl();
		return cylindricalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GearRatioConstraint createGearRatioConstraint() {
		GearRatioConstraintImpl gearRatioConstraint = new GearRatioConstraintImpl();
		return gearRatioConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HingeConstraint createHingeConstraint() {
		HingeConstraintImpl hingeConstraint = new HingeConstraintImpl();
		return hingeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrismaticConstraint createPrismaticConstraint() {
		PrismaticConstraintImpl prismaticConstraint = new PrismaticConstraintImpl();
		return prismaticConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPROConstraint createRPROConstraint() {
		RPROConstraintImpl rproConstraint = new RPROConstraintImpl();
		return rproConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversalConstraint createUniversalConstraint() {
		UniversalConstraintImpl universalConstraint = new UniversalConstraintImpl();
		return universalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintAttachmentPoint createConstraintAttachmentPoint() {
		ConstraintAttachmentPointImpl constraintAttachmentPoint = new ConstraintAttachmentPointImpl();
		return constraintAttachmentPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollisionGeometry createCollisionGeometry() {
		CollisionGeometryImpl collisionGeometry = new CollisionGeometryImpl();
		return collisionGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoxGeometry createBoxGeometry() {
		BoxGeometryImpl boxGeometry = new BoxGeometryImpl();
		return boxGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapsuleGeometry createCapsuleGeometry() {
		CapsuleGeometryImpl capsuleGeometry = new CapsuleGeometryImpl();
		return capsuleGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CylinderGeometry createCylinderGeometry() {
		CylinderGeometryImpl cylinderGeometry = new CylinderGeometryImpl();
		return cylinderGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SphereGeometry createSphereGeometry() {
		SphereGeometryImpl sphereGeometry = new SphereGeometryImpl();
		return sphereGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointOfInterest createPointOfInterest() {
		PointOfInterestImpl pointOfInterest = new PointOfInterestImpl();
		return pointOfInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KinematicState createKinematicState() {
		KinematicStateImpl kinematicState = new KinematicStateImpl();
		return kinematicState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicsFacade createDynamicsFacade() {
		DynamicsFacadeImpl dynamicsFacade = new DynamicsFacadeImpl();
		return dynamicsFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<?> createSetFromString(EDataType eDataType, String initialValue) {
		return (Set<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonTopologyAddonsDynamicsPackage getSymphony__CommonTopologyAddonsDynamicsPackage() {
		return (Symphony__CommonTopologyAddonsDynamicsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CommonTopologyAddonsDynamicsPackage getPackage() {
		return Symphony__CommonTopologyAddonsDynamicsPackage.eINSTANCE;
	}

} //Symphony__CommonTopologyAddonsDynamicsFactoryImpl
