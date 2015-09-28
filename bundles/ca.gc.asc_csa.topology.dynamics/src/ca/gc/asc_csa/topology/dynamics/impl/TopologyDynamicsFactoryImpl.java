/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopologyDynamicsFactoryImpl.java,v 1.22.2.3 2015/02/03 20:01:36 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics.impl;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.asc_csa.topology.dynamics.AbstractConstraintSimulationProperties;
import ca.gc.asc_csa.topology.dynamics.AbstractPhysicalBodySimulationProperties;
import ca.gc.asc_csa.topology.dynamics.BoxGeometry;
import ca.gc.asc_csa.topology.dynamics.CapsuleGeometry;
import ca.gc.asc_csa.topology.dynamics.CollisionGeometry;
import ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint;
import ca.gc.asc_csa.topology.dynamics.ConstraintState;
import ca.gc.asc_csa.topology.dynamics.CylinderGeometry;
import ca.gc.asc_csa.topology.dynamics.CylindricalConstraint;
import ca.gc.asc_csa.topology.dynamics.DynamicSystemProperties;
import ca.gc.asc_csa.topology.dynamics.DynamicsFacade;
import ca.gc.asc_csa.topology.dynamics.GearRatioConstraint;
import ca.gc.asc_csa.topology.dynamics.HingeConstraint;
import ca.gc.asc_csa.topology.dynamics.KinematicState;
import ca.gc.asc_csa.topology.dynamics.PhysicalBody;
import ca.gc.asc_csa.topology.dynamics.PhysicalProperties;
import ca.gc.asc_csa.topology.dynamics.PointOfInterest;
import ca.gc.asc_csa.topology.dynamics.PrismaticConstraint;
import ca.gc.asc_csa.topology.dynamics.RPROConstraint;
import ca.gc.asc_csa.topology.dynamics.SphereGeometry;
import ca.gc.asc_csa.topology.dynamics.TopologyDynamicsFactory;
import ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage;
import ca.gc.asc_csa.topology.dynamics.UniversalConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopologyDynamicsFactoryImpl extends EFactoryImpl implements TopologyDynamicsFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyrights Canadian Space Agency 2012.";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TopologyDynamicsFactory init() {
		try {
			TopologyDynamicsFactory theTopologyDynamicsFactory = (TopologyDynamicsFactory)EPackage.Registry.INSTANCE.getEFactory(TopologyDynamicsPackage.eNS_URI);
			if (theTopologyDynamicsFactory != null) {
				return theTopologyDynamicsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TopologyDynamicsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyDynamicsFactoryImpl() {
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
			case TopologyDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES: return createDynamicSystemProperties();
			case TopologyDynamicsPackage.PHYSICAL_BODY: return createPhysicalBody();
			case TopologyDynamicsPackage.PHYSICAL_PROPERTIES: return createPhysicalProperties();
			case TopologyDynamicsPackage.ABSTRACT_PHYSICAL_BODY_SIMULATION_PROPERTIES: return createAbstractPhysicalBodySimulationProperties();
			case TopologyDynamicsPackage.CONSTRAINT_STATE: return createConstraintState();
			case TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT: return createCylindricalConstraint();
			case TopologyDynamicsPackage.GEAR_RATIO_CONSTRAINT: return createGearRatioConstraint();
			case TopologyDynamicsPackage.HINGE_CONSTRAINT: return createHingeConstraint();
			case TopologyDynamicsPackage.PRISMATIC_CONSTRAINT: return createPrismaticConstraint();
			case TopologyDynamicsPackage.RPRO_CONSTRAINT: return createRPROConstraint();
			case TopologyDynamicsPackage.UNIVERSAL_CONSTRAINT: return createUniversalConstraint();
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT: return createConstraintAttachmentPoint();
			case TopologyDynamicsPackage.COLLISION_GEOMETRY: return createCollisionGeometry();
			case TopologyDynamicsPackage.BOX_GEOMETRY: return createBoxGeometry();
			case TopologyDynamicsPackage.CAPSULE_GEOMETRY: return createCapsuleGeometry();
			case TopologyDynamicsPackage.CYLINDER_GEOMETRY: return createCylinderGeometry();
			case TopologyDynamicsPackage.SPHERE_GEOMETRY: return createSphereGeometry();
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT_SIMULATION_PROPERTIES: return createAbstractConstraintSimulationProperties();
			case TopologyDynamicsPackage.POINT_OF_INTEREST: return createPointOfInterest();
			case TopologyDynamicsPackage.KINEMATIC_STATE: return createKinematicState();
			case TopologyDynamicsPackage.DYNAMICS_FACADE: return createDynamicsFacade();
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
			case TopologyDynamicsPackage.SET:
				return createSetFromString(eDataType, initialValue);
			case TopologyDynamicsPackage.CLASS:
				return createClassFromString(eDataType, initialValue);
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
			case TopologyDynamicsPackage.SET:
				return convertSetToString(eDataType, instanceValue);
			case TopologyDynamicsPackage.CLASS:
				return convertClassToString(eDataType, instanceValue);
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
	public AbstractPhysicalBodySimulationProperties createAbstractPhysicalBodySimulationProperties() {
		AbstractPhysicalBodySimulationPropertiesImpl abstractPhysicalBodySimulationProperties = new AbstractPhysicalBodySimulationPropertiesImpl();
		return abstractPhysicalBodySimulationProperties;
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
	public AbstractConstraintSimulationProperties createAbstractConstraintSimulationProperties() {
		AbstractConstraintSimulationPropertiesImpl abstractConstraintSimulationProperties = new AbstractConstraintSimulationPropertiesImpl();
		return abstractConstraintSimulationProperties;
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
	public Class<?> createClassFromString(EDataType eDataType, String initialValue) {
		return (Class<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyDynamicsPackage getTopologyDynamicsPackage() {
		return (TopologyDynamicsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TopologyDynamicsPackage getPackage() {
		return TopologyDynamicsPackage.eINSTANCE;
	}

} //TopologyDynamicsFactoryImpl
