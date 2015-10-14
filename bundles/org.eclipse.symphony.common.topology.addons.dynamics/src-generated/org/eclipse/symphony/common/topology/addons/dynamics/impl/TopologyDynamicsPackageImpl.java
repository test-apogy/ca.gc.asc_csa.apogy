/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopologyDynamicsPackageImpl.java,v 1.29.2.2 2015/02/03 20:01:36 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.dynamics.impl;

import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.math.MathPackage;
import org.eclipse.symphony.common.topology.TopologyPackage;
import org.eclipse.symphony.common.topology.addons.dynamics.AbstractCollisionGeometrySimulationProperties;
import org.eclipse.symphony.common.topology.addons.dynamics.AbstractConstraint;
import org.eclipse.symphony.common.topology.addons.dynamics.AbstractConstraintSimulationProperties;
import org.eclipse.symphony.common.topology.addons.dynamics.AbstractDynamicsEngine;
import org.eclipse.symphony.common.topology.addons.dynamics.AbstractMaterial;
import org.eclipse.symphony.common.topology.addons.dynamics.AbstractPhysicalBodySimulationProperties;
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
import org.eclipse.symphony.common.topology.addons.dynamics.Geometry;
import org.eclipse.symphony.common.topology.addons.dynamics.HingeConstraint;
import org.eclipse.symphony.common.topology.addons.dynamics.KinematicState;
import org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBody;
import org.eclipse.symphony.common.topology.addons.dynamics.PhysicalProperties;
import org.eclipse.symphony.common.topology.addons.dynamics.PointOfInterest;
import org.eclipse.symphony.common.topology.addons.dynamics.PrismaticConstraint;
import org.eclipse.symphony.common.topology.addons.dynamics.RPROConstraint;
import org.eclipse.symphony.common.topology.addons.dynamics.SphereGeometry;
import org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsFactory;
import org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage;
import org.eclipse.symphony.common.topology.addons.dynamics.UniversalConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopologyDynamicsPackageImpl extends EPackageImpl implements TopologyDynamicsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDynamicsEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicSystemPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPhysicalBodySimulationPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cylindricalConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gearRatioConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hingeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prismaticConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rproConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universalConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintAttachmentPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collisionGeometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMaterialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCollisionGeometrySimulationPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boxGeometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capsuleGeometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cylinderGeometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphereGeometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConstraintSimulationPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointOfInterestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kinematicStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicsFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType setEDataType = null;

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
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TopologyDynamicsPackageImpl() {
		super(eNS_URI, TopologyDynamicsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TopologyDynamicsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TopologyDynamicsPackage init() {
		if (isInited) return (TopologyDynamicsPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyDynamicsPackage.eNS_URI);

		// Obtain or create and register package
		TopologyDynamicsPackageImpl theTopologyDynamicsPackage = (TopologyDynamicsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TopologyDynamicsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TopologyDynamicsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TopologyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTopologyDynamicsPackage.createPackageContents();

		// Initialize created meta-data
		theTopologyDynamicsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTopologyDynamicsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TopologyDynamicsPackage.eNS_URI, theTopologyDynamicsPackage);
		return theTopologyDynamicsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDynamicsEngine() {
		return abstractDynamicsEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractDynamicsEngine__StartSimulation() {
		return abstractDynamicsEngineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractDynamicsEngine__StopSimulation() {
		return abstractDynamicsEngineEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicSystemProperties() {
		return dynamicSystemPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicSystemProperties_Constraints() {
		return (EReference)dynamicSystemPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicSystemProperties_Materials() {
		return (EReference)dynamicSystemPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalBody() {
		return physicalBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalBody_PhysicalProperties() {
		return (EReference)physicalBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalBody_ConstraintAttachmentPoints() {
		return (EReference)physicalBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalBody_SimulationProperties() {
		return (EReference)physicalBodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalBody_CenterOfMassKinematicState() {
		return (EReference)physicalBodyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalBody_PointsOfInterest() {
		return (EReference)physicalBodyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalBody_CollisionGeometry() {
		return (EReference)physicalBodyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalProperties() {
		return physicalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalProperties_Mass() {
		return (EAttribute)physicalPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalProperties_InertiaMatrix() {
		return (EReference)physicalPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalProperties_CenterOfMassLocation() {
		return (EReference)physicalPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPhysicalBodySimulationProperties() {
		return abstractPhysicalBodySimulationPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConstraint() {
		return abstractConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConstraint_AttachmentPoints() {
		return (EReference)abstractConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConstraint_SimulationProperties() {
		return (EReference)abstractConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConstraint_Description() {
		return (EAttribute)abstractConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConstraint_ConstaintId() {
		return (EAttribute)abstractConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConstraint_Enabled() {
		return (EAttribute)abstractConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintState() {
		return constraintStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintState_Position() {
		return (EAttribute)constraintStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintState_Velocity() {
		return (EAttribute)constraintStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintState_Force() {
		return (EAttribute)constraintStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCylindricalConstraint() {
		return cylindricalConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCylindricalConstraint_AngularCurrentState() {
		return (EReference)cylindricalConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCylindricalConstraint_LinearCurrentState() {
		return (EReference)cylindricalConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGearRatioConstraint() {
		return gearRatioConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGearRatioConstraint_Force() {
		return (EAttribute)gearRatioConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHingeConstraint() {
		return hingeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHingeConstraint_AngularCurrentState() {
		return (EReference)hingeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrismaticConstraint() {
		return prismaticConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrismaticConstraint_LinearCurrentState() {
		return (EReference)prismaticConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPROConstraint() {
		return rproConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPROConstraint_LinearStrength() {
		return (EReference)rproConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPROConstraint_AngularStrength() {
		return (EReference)rproConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniversalConstraint() {
		return universalConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversalConstraint_Angular0CurrentState() {
		return (EReference)universalConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversalConstraint_Angular1CurrentState() {
		return (EReference)universalConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintAttachmentPoint() {
		return constraintAttachmentPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintAttachmentPoint_PhysicalBody() {
		return (EReference)constraintAttachmentPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintAttachmentPoint_Constraint() {
		return (EReference)constraintAttachmentPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintAttachmentPoint_Transform() {
		return (EReference)constraintAttachmentPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintAttachmentPoint_Description() {
		return (EAttribute)constraintAttachmentPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintAttachmentPoint_PointId() {
		return (EAttribute)constraintAttachmentPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollisionGeometry() {
		return collisionGeometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollisionGeometry_SimulationProperties() {
		return (EReference)collisionGeometryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollisionGeometry_Geometry() {
		return (EReference)collisionGeometryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollisionGeometry_Transform() {
		return (EReference)collisionGeometryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollisionGeometry_Material() {
		return (EReference)collisionGeometryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollisionGeometry_Description() {
		return (EAttribute)collisionGeometryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollisionGeometry_GeometryId() {
		return (EAttribute)collisionGeometryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMaterial() {
		return abstractMaterialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMaterial_MaterialId() {
		return (EAttribute)abstractMaterialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCollisionGeometrySimulationProperties() {
		return abstractCollisionGeometrySimulationPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometry() {
		return geometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoxGeometry() {
		return boxGeometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoxGeometry_Dimension() {
		return (EReference)boxGeometryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapsuleGeometry() {
		return capsuleGeometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapsuleGeometry_Radius() {
		return (EAttribute)capsuleGeometryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapsuleGeometry_Length() {
		return (EAttribute)capsuleGeometryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCylinderGeometry() {
		return cylinderGeometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylinderGeometry_Radius() {
		return (EAttribute)cylinderGeometryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylinderGeometry_Length() {
		return (EAttribute)cylinderGeometryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphereGeometry() {
		return sphereGeometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphereGeometry_Radius() {
		return (EAttribute)sphereGeometryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConstraintSimulationProperties() {
		return abstractConstraintSimulationPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointOfInterest() {
		return pointOfInterestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointOfInterest_Offset() {
		return (EReference)pointOfInterestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointOfInterest_KinematicState() {
		return (EReference)pointOfInterestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKinematicState() {
		return kinematicStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKinematicState_Position() {
		return (EReference)kinematicStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKinematicState_Orientation() {
		return (EReference)kinematicStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKinematicState_LinearVelocity() {
		return (EReference)kinematicStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKinematicState_AngularVelocity() {
		return (EReference)kinematicStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKinematicState_LinearAcceleration() {
		return (EReference)kinematicStateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKinematicState_AngularAcceleration() {
		return (EReference)kinematicStateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicsFacade() {
		return dynamicsFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDynamicsFacade__FindCenterOfMass__Node() {
		return dynamicsFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDynamicsFacade__FindTotalMass__Node() {
		return dynamicsFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDynamicsFacade__GetPhysicalNodeSimulationProperty__PhysicalBody_Class() {
		return dynamicsFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDynamicsFacade__GetConstraintSimulationProperty__AbstractConstraint_Class() {
		return dynamicsFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDynamicsFacade__GetPhysicalBodies__Node() {
		return dynamicsFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSet() {
		return setEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyDynamicsFactory getTopologyDynamicsFactory() {
		return (TopologyDynamicsFactory)getEFactoryInstance();
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
		dynamicSystemPropertiesEClass = createEClass(DYNAMIC_SYSTEM_PROPERTIES);
		createEReference(dynamicSystemPropertiesEClass, DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS);
		createEReference(dynamicSystemPropertiesEClass, DYNAMIC_SYSTEM_PROPERTIES__MATERIALS);

		abstractDynamicsEngineEClass = createEClass(ABSTRACT_DYNAMICS_ENGINE);
		createEOperation(abstractDynamicsEngineEClass, ABSTRACT_DYNAMICS_ENGINE___START_SIMULATION);
		createEOperation(abstractDynamicsEngineEClass, ABSTRACT_DYNAMICS_ENGINE___STOP_SIMULATION);

		physicalBodyEClass = createEClass(PHYSICAL_BODY);
		createEReference(physicalBodyEClass, PHYSICAL_BODY__PHYSICAL_PROPERTIES);
		createEReference(physicalBodyEClass, PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS);
		createEReference(physicalBodyEClass, PHYSICAL_BODY__SIMULATION_PROPERTIES);
		createEReference(physicalBodyEClass, PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE);
		createEReference(physicalBodyEClass, PHYSICAL_BODY__POINTS_OF_INTEREST);
		createEReference(physicalBodyEClass, PHYSICAL_BODY__COLLISION_GEOMETRY);

		physicalPropertiesEClass = createEClass(PHYSICAL_PROPERTIES);
		createEAttribute(physicalPropertiesEClass, PHYSICAL_PROPERTIES__MASS);
		createEReference(physicalPropertiesEClass, PHYSICAL_PROPERTIES__INERTIA_MATRIX);
		createEReference(physicalPropertiesEClass, PHYSICAL_PROPERTIES__CENTER_OF_MASS_LOCATION);

		abstractPhysicalBodySimulationPropertiesEClass = createEClass(ABSTRACT_PHYSICAL_BODY_SIMULATION_PROPERTIES);

		abstractConstraintSimulationPropertiesEClass = createEClass(ABSTRACT_CONSTRAINT_SIMULATION_PROPERTIES);

		abstractCollisionGeometrySimulationPropertiesEClass = createEClass(ABSTRACT_COLLISION_GEOMETRY_SIMULATION_PROPERTIES);

		pointOfInterestEClass = createEClass(POINT_OF_INTEREST);
		createEReference(pointOfInterestEClass, POINT_OF_INTEREST__OFFSET);
		createEReference(pointOfInterestEClass, POINT_OF_INTEREST__KINEMATIC_STATE);

		kinematicStateEClass = createEClass(KINEMATIC_STATE);
		createEReference(kinematicStateEClass, KINEMATIC_STATE__POSITION);
		createEReference(kinematicStateEClass, KINEMATIC_STATE__ORIENTATION);
		createEReference(kinematicStateEClass, KINEMATIC_STATE__LINEAR_VELOCITY);
		createEReference(kinematicStateEClass, KINEMATIC_STATE__ANGULAR_VELOCITY);
		createEReference(kinematicStateEClass, KINEMATIC_STATE__LINEAR_ACCELERATION);
		createEReference(kinematicStateEClass, KINEMATIC_STATE__ANGULAR_ACCELERATION);

		constraintStateEClass = createEClass(CONSTRAINT_STATE);
		createEAttribute(constraintStateEClass, CONSTRAINT_STATE__POSITION);
		createEAttribute(constraintStateEClass, CONSTRAINT_STATE__VELOCITY);
		createEAttribute(constraintStateEClass, CONSTRAINT_STATE__FORCE);

		abstractConstraintEClass = createEClass(ABSTRACT_CONSTRAINT);
		createEReference(abstractConstraintEClass, ABSTRACT_CONSTRAINT__ATTACHMENT_POINTS);
		createEReference(abstractConstraintEClass, ABSTRACT_CONSTRAINT__SIMULATION_PROPERTIES);
		createEAttribute(abstractConstraintEClass, ABSTRACT_CONSTRAINT__DESCRIPTION);
		createEAttribute(abstractConstraintEClass, ABSTRACT_CONSTRAINT__CONSTAINT_ID);
		createEAttribute(abstractConstraintEClass, ABSTRACT_CONSTRAINT__ENABLED);

		cylindricalConstraintEClass = createEClass(CYLINDRICAL_CONSTRAINT);
		createEReference(cylindricalConstraintEClass, CYLINDRICAL_CONSTRAINT__ANGULAR_CURRENT_STATE);
		createEReference(cylindricalConstraintEClass, CYLINDRICAL_CONSTRAINT__LINEAR_CURRENT_STATE);

		gearRatioConstraintEClass = createEClass(GEAR_RATIO_CONSTRAINT);
		createEAttribute(gearRatioConstraintEClass, GEAR_RATIO_CONSTRAINT__FORCE);

		hingeConstraintEClass = createEClass(HINGE_CONSTRAINT);
		createEReference(hingeConstraintEClass, HINGE_CONSTRAINT__ANGULAR_CURRENT_STATE);

		prismaticConstraintEClass = createEClass(PRISMATIC_CONSTRAINT);
		createEReference(prismaticConstraintEClass, PRISMATIC_CONSTRAINT__LINEAR_CURRENT_STATE);

		rproConstraintEClass = createEClass(RPRO_CONSTRAINT);
		createEReference(rproConstraintEClass, RPRO_CONSTRAINT__LINEAR_STRENGTH);
		createEReference(rproConstraintEClass, RPRO_CONSTRAINT__ANGULAR_STRENGTH);

		universalConstraintEClass = createEClass(UNIVERSAL_CONSTRAINT);
		createEReference(universalConstraintEClass, UNIVERSAL_CONSTRAINT__ANGULAR0_CURRENT_STATE);
		createEReference(universalConstraintEClass, UNIVERSAL_CONSTRAINT__ANGULAR1_CURRENT_STATE);

		constraintAttachmentPointEClass = createEClass(CONSTRAINT_ATTACHMENT_POINT);
		createEReference(constraintAttachmentPointEClass, CONSTRAINT_ATTACHMENT_POINT__PHYSICAL_BODY);
		createEReference(constraintAttachmentPointEClass, CONSTRAINT_ATTACHMENT_POINT__CONSTRAINT);
		createEReference(constraintAttachmentPointEClass, CONSTRAINT_ATTACHMENT_POINT__TRANSFORM);
		createEAttribute(constraintAttachmentPointEClass, CONSTRAINT_ATTACHMENT_POINT__DESCRIPTION);
		createEAttribute(constraintAttachmentPointEClass, CONSTRAINT_ATTACHMENT_POINT__POINT_ID);

		collisionGeometryEClass = createEClass(COLLISION_GEOMETRY);
		createEReference(collisionGeometryEClass, COLLISION_GEOMETRY__SIMULATION_PROPERTIES);
		createEReference(collisionGeometryEClass, COLLISION_GEOMETRY__GEOMETRY);
		createEReference(collisionGeometryEClass, COLLISION_GEOMETRY__TRANSFORM);
		createEReference(collisionGeometryEClass, COLLISION_GEOMETRY__MATERIAL);
		createEAttribute(collisionGeometryEClass, COLLISION_GEOMETRY__DESCRIPTION);
		createEAttribute(collisionGeometryEClass, COLLISION_GEOMETRY__GEOMETRY_ID);

		abstractMaterialEClass = createEClass(ABSTRACT_MATERIAL);
		createEAttribute(abstractMaterialEClass, ABSTRACT_MATERIAL__MATERIAL_ID);

		geometryEClass = createEClass(GEOMETRY);

		boxGeometryEClass = createEClass(BOX_GEOMETRY);
		createEReference(boxGeometryEClass, BOX_GEOMETRY__DIMENSION);

		capsuleGeometryEClass = createEClass(CAPSULE_GEOMETRY);
		createEAttribute(capsuleGeometryEClass, CAPSULE_GEOMETRY__RADIUS);
		createEAttribute(capsuleGeometryEClass, CAPSULE_GEOMETRY__LENGTH);

		cylinderGeometryEClass = createEClass(CYLINDER_GEOMETRY);
		createEAttribute(cylinderGeometryEClass, CYLINDER_GEOMETRY__RADIUS);
		createEAttribute(cylinderGeometryEClass, CYLINDER_GEOMETRY__LENGTH);

		sphereGeometryEClass = createEClass(SPHERE_GEOMETRY);
		createEAttribute(sphereGeometryEClass, SPHERE_GEOMETRY__RADIUS);

		dynamicsFacadeEClass = createEClass(DYNAMICS_FACADE);
		createEOperation(dynamicsFacadeEClass, DYNAMICS_FACADE___FIND_CENTER_OF_MASS__NODE);
		createEOperation(dynamicsFacadeEClass, DYNAMICS_FACADE___FIND_TOTAL_MASS__NODE);
		createEOperation(dynamicsFacadeEClass, DYNAMICS_FACADE___GET_PHYSICAL_BODIES__NODE);
		createEOperation(dynamicsFacadeEClass, DYNAMICS_FACADE___GET_PHYSICAL_NODE_SIMULATION_PROPERTY__PHYSICALBODY_CLASS);
		createEOperation(dynamicsFacadeEClass, DYNAMICS_FACADE___GET_CONSTRAINT_SIMULATION_PROPERTY__ABSTRACTCONSTRAINT_CLASS);

		// Create data types
		setEDataType = createEDataType(SET);
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
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		MathPackage theMathPackage = (MathPackage)EPackage.Registry.INSTANCE.getEPackage(MathPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(setEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		dynamicSystemPropertiesEClass.getESuperTypes().add(theTopologyPackage.getAggregateGroupNode());
		physicalBodyEClass.getESuperTypes().add(theTopologyPackage.getAggregateGroupNode());
		cylindricalConstraintEClass.getESuperTypes().add(this.getAbstractConstraint());
		gearRatioConstraintEClass.getESuperTypes().add(this.getAbstractConstraint());
		hingeConstraintEClass.getESuperTypes().add(this.getAbstractConstraint());
		prismaticConstraintEClass.getESuperTypes().add(this.getAbstractConstraint());
		rproConstraintEClass.getESuperTypes().add(this.getAbstractConstraint());
		universalConstraintEClass.getESuperTypes().add(this.getAbstractConstraint());
		boxGeometryEClass.getESuperTypes().add(this.getGeometry());
		capsuleGeometryEClass.getESuperTypes().add(this.getGeometry());
		cylinderGeometryEClass.getESuperTypes().add(this.getGeometry());
		sphereGeometryEClass.getESuperTypes().add(this.getGeometry());

		// Initialize classes, features, and operations; add parameters
		initEClass(dynamicSystemPropertiesEClass, DynamicSystemProperties.class, "DynamicSystemProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicSystemProperties_Constraints(), this.getAbstractConstraint(), null, "constraints", null, 0, -1, DynamicSystemProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicSystemProperties_Materials(), this.getAbstractMaterial(), null, "materials", null, 0, -1, DynamicSystemProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractDynamicsEngineEClass, AbstractDynamicsEngine.class, "AbstractDynamicsEngine", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAbstractDynamicsEngine__StartSimulation(), null, "startSimulation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractDynamicsEngine__StopSimulation(), null, "stopSimulation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(physicalBodyEClass, PhysicalBody.class, "PhysicalBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalBody_PhysicalProperties(), this.getPhysicalProperties(), null, "physicalProperties", null, 1, 1, PhysicalBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalBody_ConstraintAttachmentPoints(), this.getConstraintAttachmentPoint(), this.getConstraintAttachmentPoint_PhysicalBody(), "constraintAttachmentPoints", null, 0, -1, PhysicalBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalBody_SimulationProperties(), this.getAbstractPhysicalBodySimulationProperties(), null, "simulationProperties", null, 0, -1, PhysicalBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalBody_CenterOfMassKinematicState(), this.getKinematicState(), null, "centerOfMassKinematicState", null, 0, 1, PhysicalBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalBody_PointsOfInterest(), this.getPointOfInterest(), null, "pointsOfInterest", null, 0, -1, PhysicalBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalBody_CollisionGeometry(), this.getCollisionGeometry(), null, "collisionGeometry", null, 0, -1, PhysicalBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalPropertiesEClass, PhysicalProperties.class, "PhysicalProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalProperties_Mass(), theEcorePackage.getEDouble(), "mass", null, 0, 1, PhysicalProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalProperties_InertiaMatrix(), theMathPackage.getMatrix3x3(), null, "inertiaMatrix", null, 1, 1, PhysicalProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalProperties_CenterOfMassLocation(), theMathPackage.getTuple3d(), null, "centerOfMassLocation", null, 1, 1, PhysicalProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractPhysicalBodySimulationPropertiesEClass, AbstractPhysicalBodySimulationProperties.class, "AbstractPhysicalBodySimulationProperties", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractConstraintSimulationPropertiesEClass, AbstractConstraintSimulationProperties.class, "AbstractConstraintSimulationProperties", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractCollisionGeometrySimulationPropertiesEClass, AbstractCollisionGeometrySimulationProperties.class, "AbstractCollisionGeometrySimulationProperties", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pointOfInterestEClass, PointOfInterest.class, "PointOfInterest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointOfInterest_Offset(), theMathPackage.getTuple3d(), null, "offset", null, 0, 1, PointOfInterest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointOfInterest_KinematicState(), this.getKinematicState(), null, "kinematicState", null, 0, 1, PointOfInterest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kinematicStateEClass, KinematicState.class, "KinematicState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKinematicState_Position(), theMathPackage.getTuple3d(), null, "position", null, 0, 1, KinematicState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKinematicState_Orientation(), theMathPackage.getTuple3d(), null, "orientation", null, 0, 1, KinematicState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKinematicState_LinearVelocity(), theMathPackage.getTuple3d(), null, "linearVelocity", null, 0, 1, KinematicState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKinematicState_AngularVelocity(), theMathPackage.getTuple3d(), null, "angularVelocity", null, 0, 1, KinematicState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKinematicState_LinearAcceleration(), theMathPackage.getTuple3d(), null, "linearAcceleration", null, 0, 1, KinematicState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKinematicState_AngularAcceleration(), theMathPackage.getTuple3d(), null, "angularAcceleration", null, 0, 1, KinematicState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintStateEClass, ConstraintState.class, "ConstraintState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraintState_Position(), theEcorePackage.getEDouble(), "position", null, 0, 1, ConstraintState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraintState_Velocity(), theEcorePackage.getEDouble(), "velocity", null, 0, 1, ConstraintState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraintState_Force(), theEcorePackage.getEDouble(), "force", null, 0, 1, ConstraintState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConstraintEClass, AbstractConstraint.class, "AbstractConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractConstraint_AttachmentPoints(), this.getConstraintAttachmentPoint(), this.getConstraintAttachmentPoint_Constraint(), "attachmentPoints", null, 0, -1, AbstractConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConstraint_SimulationProperties(), this.getAbstractConstraintSimulationProperties(), null, "simulationProperties", null, 0, -1, AbstractConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConstraint_Description(), theEcorePackage.getEString(), "description", null, 0, 1, AbstractConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConstraint_ConstaintId(), theEcorePackage.getEString(), "constaintId", null, 0, 1, AbstractConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConstraint_Enabled(), theEcorePackage.getEBoolean(), "enabled", "false", 0, 1, AbstractConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cylindricalConstraintEClass, CylindricalConstraint.class, "CylindricalConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCylindricalConstraint_AngularCurrentState(), this.getConstraintState(), null, "angularCurrentState", null, 1, 1, CylindricalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCylindricalConstraint_LinearCurrentState(), this.getConstraintState(), null, "linearCurrentState", null, 1, 1, CylindricalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gearRatioConstraintEClass, GearRatioConstraint.class, "GearRatioConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGearRatioConstraint_Force(), theEcorePackage.getEDouble(), "force", null, 0, 1, GearRatioConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hingeConstraintEClass, HingeConstraint.class, "HingeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHingeConstraint_AngularCurrentState(), this.getConstraintState(), null, "angularCurrentState", null, 1, 1, HingeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prismaticConstraintEClass, PrismaticConstraint.class, "PrismaticConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrismaticConstraint_LinearCurrentState(), this.getConstraintState(), null, "linearCurrentState", null, 1, 1, PrismaticConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rproConstraintEClass, RPROConstraint.class, "RPROConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPROConstraint_LinearStrength(), theMathPackage.getTuple3d(), null, "linearStrength", null, 0, 1, RPROConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPROConstraint_AngularStrength(), theMathPackage.getTuple3d(), null, "angularStrength", null, 0, 1, RPROConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(universalConstraintEClass, UniversalConstraint.class, "UniversalConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniversalConstraint_Angular0CurrentState(), this.getConstraintState(), null, "angular0CurrentState", null, 1, 1, UniversalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversalConstraint_Angular1CurrentState(), this.getConstraintState(), null, "angular1CurrentState", null, 1, 1, UniversalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintAttachmentPointEClass, ConstraintAttachmentPoint.class, "ConstraintAttachmentPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintAttachmentPoint_PhysicalBody(), this.getPhysicalBody(), this.getPhysicalBody_ConstraintAttachmentPoints(), "physicalBody", null, 0, 1, ConstraintAttachmentPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintAttachmentPoint_Constraint(), this.getAbstractConstraint(), this.getAbstractConstraint_AttachmentPoints(), "constraint", null, 0, 1, ConstraintAttachmentPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintAttachmentPoint_Transform(), theMathPackage.getMatrix4x4(), null, "transform", null, 0, 1, ConstraintAttachmentPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraintAttachmentPoint_Description(), theEcorePackage.getEString(), "description", null, 0, 1, ConstraintAttachmentPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraintAttachmentPoint_PointId(), theEcorePackage.getEString(), "pointId", null, 0, 1, ConstraintAttachmentPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collisionGeometryEClass, CollisionGeometry.class, "CollisionGeometry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollisionGeometry_SimulationProperties(), this.getAbstractCollisionGeometrySimulationProperties(), null, "simulationProperties", null, 0, -1, CollisionGeometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollisionGeometry_Geometry(), this.getGeometry(), null, "geometry", null, 0, 1, CollisionGeometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollisionGeometry_Transform(), theMathPackage.getMatrix4x4(), null, "transform", null, 0, 1, CollisionGeometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollisionGeometry_Material(), this.getAbstractMaterial(), null, "material", null, 0, 1, CollisionGeometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollisionGeometry_Description(), theEcorePackage.getEString(), "description", null, 0, 1, CollisionGeometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollisionGeometry_GeometryId(), theEcorePackage.getEString(), "geometryId", null, 0, 1, CollisionGeometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractMaterialEClass, AbstractMaterial.class, "AbstractMaterial", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractMaterial_MaterialId(), theEcorePackage.getEString(), "materialId", null, 0, 1, AbstractMaterial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geometryEClass, Geometry.class, "Geometry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boxGeometryEClass, BoxGeometry.class, "BoxGeometry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoxGeometry_Dimension(), theMathPackage.getTuple3d(), null, "dimension", null, 0, 1, BoxGeometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capsuleGeometryEClass, CapsuleGeometry.class, "CapsuleGeometry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapsuleGeometry_Radius(), theEcorePackage.getEDouble(), "radius", null, 0, 1, CapsuleGeometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapsuleGeometry_Length(), theEcorePackage.getEDouble(), "length", null, 0, 1, CapsuleGeometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cylinderGeometryEClass, CylinderGeometry.class, "CylinderGeometry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCylinderGeometry_Radius(), theEcorePackage.getEDouble(), "radius", null, 0, 1, CylinderGeometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCylinderGeometry_Length(), theEcorePackage.getEDouble(), "length", null, 0, 1, CylinderGeometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sphereGeometryEClass, SphereGeometry.class, "SphereGeometry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSphereGeometry_Radius(), theEcorePackage.getEDouble(), "radius", null, 0, 1, SphereGeometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicsFacadeEClass, DynamicsFacade.class, "DynamicsFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getDynamicsFacade__FindCenterOfMass__Node(), theMathPackage.getTuple3d(), "findCenterOfMass", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTopologyPackage.getNode(), "root", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDynamicsFacade__FindTotalMass__Node(), theEcorePackage.getEDouble(), "findTotalMass", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTopologyPackage.getNode(), "root", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDynamicsFacade__GetPhysicalBodies__Node(), null, "getPhysicalBodies", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTopologyPackage.getNode(), "root", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getSet());
		EGenericType g2 = createEGenericType(this.getPhysicalBody());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getDynamicsFacade__GetPhysicalNodeSimulationProperty__PhysicalBody_Class(), null, "getPhysicalNodeSimulationProperty", 0, 1, !IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getAbstractPhysicalBodySimulationProperties());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getPhysicalBody(), "physicalBody", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "propertyType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getDynamicsFacade__GetConstraintSimulationProperty__AbstractConstraint_Class(), null, "getConstraintSimulationProperty", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getAbstractConstraintSimulationProperties());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getAbstractConstraint(), "constraint", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "propertyType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		// Initialize data types
		initEDataType(setEDataType, Set.class, "Set", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "TopologyDynamics",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)",
			 "modelName", "TopologyDynamics",
			 "operationReflection", "true",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.common.topology.addons.dynamics/src-generated",
			 "editDirectory", "/org.eclipse.symphony.common.topology.addons.dynamics.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.common.topology.addons"
		   });	
		addAnnotation
		  (dynamicSystemPropertiesEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class for Dynamics System that is used as a container for many Dynamic System attributes."
		   });	
		addAnnotation
		  (getDynamicSystemProperties_Constraints(), 
		   source, 
		   new String[] {
			 "documentation", "The list of AbstractConstraint used with a Dynamic System."
		   });	
		addAnnotation
		  (getDynamicSystemProperties_Materials(), 
		   source, 
		   new String[] {
			 "documentation", "The list of AbstractMaterial used in the world."
		   });	
		addAnnotation
		  (abstractDynamicsEngineEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines a generic Dynamics Engine."
		   });	
		addAnnotation
		  (getAbstractDynamicsEngine__StartSimulation(), 
		   source, 
		   new String[] {
			 "documentation", "Method that starts the simulation."
		   });	
		addAnnotation
		  (getAbstractDynamicsEngine__StopSimulation(), 
		   source, 
		   new String[] {
			 "documentation", "Method that stops the simulation."
		   });	
		addAnnotation
		  (physicalBodyEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines a physical body."
		   });	
		addAnnotation
		  (getPhysicalBody_PhysicalProperties(), 
		   source, 
		   new String[] {
			 "documentation", "The physical properties of the body."
		   });	
		addAnnotation
		  (getPhysicalBody_ConstraintAttachmentPoints(), 
		   source, 
		   new String[] {
			 "documentation", "The list of constraints associated with this body."
		   });	
		addAnnotation
		  (getPhysicalBody_SimulationProperties(), 
		   source, 
		   new String[] {
			 "documentation", "The list of simulation properties associated with this body.\n\nNote that this list can contain items for different implementation of Dynamic Engine."
		   });	
		addAnnotation
		  (getPhysicalBody_CenterOfMassKinematicState(), 
		   source, 
		   new String[] {
			 "documentation", "The kinematic state of the center of mass of the Physical body."
		   });	
		addAnnotation
		  (getPhysicalBody_PointsOfInterest(), 
		   source, 
		   new String[] {
			 "documentation", "The list of PointOfInterest currently defined for the PhysicalBody."
		   });	
		addAnnotation
		  (getPhysicalBody_CollisionGeometry(), 
		   source, 
		   new String[] {
			 "documentation", "The list of collision geometries used to defined the collision volume of the PhysicalBody."
		   });	
		addAnnotation
		  (physicalPropertiesEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class defining the physical properties of a body."
		   });	
		addAnnotation
		  (getPhysicalProperties_Mass(), 
		   source, 
		   new String[] {
			 "documentation", "Defines the mass of the physical body, in kilograms.",
			 "csa_units", "kg"
		   });	
		addAnnotation
		  (getPhysicalProperties_InertiaMatrix(), 
		   source, 
		   new String[] {
			 "documentation", "The matrix of inertia of the body defined for the specified location of the center of mass."
		   });	
		addAnnotation
		  (getPhysicalProperties_CenterOfMassLocation(), 
		   source, 
		   new String[] {
			 "documentation", "The location of the center of mass of the body expressed in the body frame of reference."
		   });	
		addAnnotation
		  (abstractPhysicalBodySimulationPropertiesEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class defining simulation specific properties of a body."
		   });	
		addAnnotation
		  (abstractConstraintSimulationPropertiesEClass, 
		   source, 
		   new String[] {
			 "documentation", "Abstract base class used to represent constraint properties that are\nspecific to a particular simulation engine."
		   });	
		addAnnotation
		  (abstractCollisionGeometrySimulationPropertiesEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class defining simulation specific properties of an AbstractCollisionGeometry."
		   });	
		addAnnotation
		  (pointOfInterestEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class defining a location in space relative to a Physical Body."
		   });	
		addAnnotation
		  (kinematicStateEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class defining a kinematic state. Such state defines position, velocity and acceleration."
		   });	
		addAnnotation
		  (constraintStateEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines the constraint\'s state which are position, velocity and force.\n\nEach values are represented on the constraint axis (e.g. if the constraint is prismatic,\nposition will be the distance from the origin of the constraint, for angular constraints,\nthe position will be the angle from the origin of the constraint."
		   });	
		addAnnotation
		  (abstractConstraintEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class defining a constraint between two physical bodies."
		   });	
		addAnnotation
		  (getAbstractConstraint_SimulationProperties(), 
		   source, 
		   new String[] {
			 "documentation", "The list of simulation properties associated with this constraint.\n\nNote that this list can contain items for different implementation of Dynamic Engine."
		   });	
		addAnnotation
		  (getAbstractConstraint_Description(), 
		   source, 
		   new String[] {
			 "documentation", "A textual description of this contraint."
		   });	
		addAnnotation
		  (getAbstractConstraint_ConstaintId(), 
		   source, 
		   new String[] {
			 "documentation", "An identifier for the constraint."
		   });	
		addAnnotation
		  (cylindricalConstraintEClass, 
		   source, 
		   new String[] {
			 "documentation", "The cylindrical constraint is a 2 DOF constraint (one prismatic and one angular)."
		   });	
		addAnnotation
		  (gearRatioConstraintEClass, 
		   source, 
		   new String[] {
			 "documentation", "This constraint is a velocity-based constraint that constrains the velocity of a body\nrelative to its primary attachment axis to the velocity of another body relative to its\nprimary attachment axis."
		   });	
		addAnnotation
		  (hingeConstraintEClass, 
		   source, 
		   new String[] {
			 "documentation", "This constraint is used to rotate a pair of bodies about a single axis (no translation)."
		   });	
		addAnnotation
		  (prismaticConstraintEClass, 
		   source, 
		   new String[] {
			 "documentation", "This constraint is used to move a body to move along an axis (no rotation)."
		   });	
		addAnnotation
		  (rproConstraintEClass, 
		   source, 
		   new String[] {
			 "documentation", "Relative Position Relative Orientation (RPRO) is a constraint used to fix two parts with a\ngiven distance and orientation. Both linear and angular strengths describes the forces needed\nto respect this constraint."
		   });	
		addAnnotation
		  (universalConstraintEClass, 
		   source, 
		   new String[] {
			 "documentation", "This constraint is two-axis rotation constraint."
		   });	
		addAnnotation
		  (constraintAttachmentPointEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class defining a location on a PhysicalBody where a Constraint is applied."
		   });	
		addAnnotation
		  (getConstraintAttachmentPoint_PhysicalBody(), 
		   source, 
		   new String[] {
			 "documentation", "The PhysicalBody to which the AttachmentPoint is attached."
		   });	
		addAnnotation
		  (getConstraintAttachmentPoint_Constraint(), 
		   source, 
		   new String[] {
			 "documentation", "The Constraint attached to this attachment point."
		   });	
		addAnnotation
		  (getConstraintAttachmentPoint_Transform(), 
		   source, 
		   new String[] {
			 "documentation", "The transform expressing the position of the ConstraintAttachmentPoint\nexpressed in the PhysicalBody reference frame."
		   });	
		addAnnotation
		  (getConstraintAttachmentPoint_Description(), 
		   source, 
		   new String[] {
			 "documentation", "A textual description of this ContraintAttachmentPoint."
		   });	
		addAnnotation
		  (getConstraintAttachmentPoint_PointId(), 
		   source, 
		   new String[] {
			 "documentation", "An identifier for this ConstraintAttachmentPoint."
		   });	
		addAnnotation
		  (collisionGeometryEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class defining the bounding volume used in collision detection and handling."
		   });	
		addAnnotation
		  (getCollisionGeometry_SimulationProperties(), 
		   source, 
		   new String[] {
			 "documentation", "Simulation specific collision geometry properties."
		   });	
		addAnnotation
		  (getCollisionGeometry_Geometry(), 
		   source, 
		   new String[] {
			 "documentation", "The collision geometry."
		   });	
		addAnnotation
		  (getCollisionGeometry_Transform(), 
		   source, 
		   new String[] {
			 "documentation", "The transform matrix locating the geometry relative to the AbstractCollisionGeometry owner."
		   });	
		addAnnotation
		  (getCollisionGeometry_Material(), 
		   source, 
		   new String[] {
			 "documentation", "A reference to the material associated with this collision geometry."
		   });	
		addAnnotation
		  (getCollisionGeometry_Description(), 
		   source, 
		   new String[] {
			 "documentation", "A textual description of this collision geometry."
		   });	
		addAnnotation
		  (getCollisionGeometry_GeometryId(), 
		   source, 
		   new String[] {
			 "documentation", "An identifier for the collision geometry."
		   });	
		addAnnotation
		  (abstractMaterialEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class defining the material properties of a body."
		   });	
		addAnnotation
		  (geometryEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class defining a geometry element used in defining collision volume."
		   });	
		addAnnotation
		  (boxGeometryEClass, 
		   source, 
		   new String[] {
			 "documentation", "This geometry is a box defined by its dimension parameter (x, y and z size)."
		   });	
		addAnnotation
		  (capsuleGeometryEClass, 
		   source, 
		   new String[] {
			 "documentation", "The capsule is like a cylinder with rounded extremities. The shape is defined\nby the radius of the capsule (width) and its length (from one rounded extremity to the other)."
		   });	
		addAnnotation
		  (cylinderGeometryEClass, 
		   source, 
		   new String[] {
			 "documentation", "The cylinder is defined by its radius (width) and its length (from one side to the other)."
		   });	
		addAnnotation
		  (sphereGeometryEClass, 
		   source, 
		   new String[] {
			 "documentation", "The sphere geometry is defined by its radius."
		   });	
		addAnnotation
		  (dynamicsFacadeEClass, 
		   source, 
		   new String[] {
			 "documentation", "Helper class containing a variety of dynamic topology utilities methods."
		   });	
		addAnnotation
		  (getDynamicsFacade__FindCenterOfMass__Node(), 
		   source, 
		   new String[] {
			 "documentation", "Given a node in a topology, traverse the tree and computes the location of the center of mass of the tree.\n@param root The root of the topology for which the position of the center of mass is to be computed."
		   });	
		addAnnotation
		  (getDynamicsFacade__FindTotalMass__Node(), 
		   source, 
		   new String[] {
			 "documentation", "Given a node in a topology, traverse the tree and compute the mass of the tree.\n@param root The root of the topology for which the total mass is to be computed."
		   });	
		addAnnotation
		  (getDynamicsFacade__GetPhysicalBodies__Node(), 
		   source, 
		   new String[] {
			 "documentation", "Given a node in a topology, traverse the tree and extracts the Set of PhysicalBody defined in the topology."
		   });
	}

} //TopologyDynamicsPackageImpl
