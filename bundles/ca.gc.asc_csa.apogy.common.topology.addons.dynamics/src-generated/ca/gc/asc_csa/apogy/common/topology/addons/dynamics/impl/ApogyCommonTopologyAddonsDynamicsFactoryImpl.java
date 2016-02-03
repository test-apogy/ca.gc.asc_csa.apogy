package ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.BoxGeometry;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CapsuleGeometry;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CollisionGeometry;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylinderGeometry;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylindricalConstraint;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.DynamicSystemProperties;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFacade;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.GearRatioConstraint;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.HingeConstraint;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalProperties;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PointOfInterest;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PrismaticConstraint;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.RPROConstraint;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.SphereGeometry;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFactory;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.UniversalConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonTopologyAddonsDynamicsFactoryImpl extends EFactoryImpl implements ApogyCommonTopologyAddonsDynamicsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonTopologyAddonsDynamicsFactory init() {
		try {
			ApogyCommonTopologyAddonsDynamicsFactory theApogyCommonTopologyAddonsDynamicsFactory = (ApogyCommonTopologyAddonsDynamicsFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonTopologyAddonsDynamicsPackage.eNS_URI);
			if (theApogyCommonTopologyAddonsDynamicsFactory != null) {
				return theApogyCommonTopologyAddonsDynamicsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonTopologyAddonsDynamicsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonTopologyAddonsDynamicsFactoryImpl() {
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
			case ApogyCommonTopologyAddonsDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES: return createDynamicSystemProperties();
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY: return createPhysicalBody();
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES: return createPhysicalProperties();
			case ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST: return createPointOfInterest();
			case ApogyCommonTopologyAddonsDynamicsPackage.KINEMATIC_STATE: return createKinematicState();
			case ApogyCommonTopologyAddonsDynamicsPackage.CONSTRAINT_STATE: return createConstraintState();
			case ApogyCommonTopologyAddonsDynamicsPackage.CYLINDRICAL_CONSTRAINT: return createCylindricalConstraint();
			case ApogyCommonTopologyAddonsDynamicsPackage.GEAR_RATIO_CONSTRAINT: return createGearRatioConstraint();
			case ApogyCommonTopologyAddonsDynamicsPackage.HINGE_CONSTRAINT: return createHingeConstraint();
			case ApogyCommonTopologyAddonsDynamicsPackage.PRISMATIC_CONSTRAINT: return createPrismaticConstraint();
			case ApogyCommonTopologyAddonsDynamicsPackage.RPRO_CONSTRAINT: return createRPROConstraint();
			case ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT: return createUniversalConstraint();
			case ApogyCommonTopologyAddonsDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT: return createConstraintAttachmentPoint();
			case ApogyCommonTopologyAddonsDynamicsPackage.COLLISION_GEOMETRY: return createCollisionGeometry();
			case ApogyCommonTopologyAddonsDynamicsPackage.BOX_GEOMETRY: return createBoxGeometry();
			case ApogyCommonTopologyAddonsDynamicsPackage.CAPSULE_GEOMETRY: return createCapsuleGeometry();
			case ApogyCommonTopologyAddonsDynamicsPackage.CYLINDER_GEOMETRY: return createCylinderGeometry();
			case ApogyCommonTopologyAddonsDynamicsPackage.SPHERE_GEOMETRY: return createSphereGeometry();
			case ApogyCommonTopologyAddonsDynamicsPackage.APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE: return createApogyCommonTopologyAddonsDynamicsFacade();
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
			case ApogyCommonTopologyAddonsDynamicsPackage.SET:
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
			case ApogyCommonTopologyAddonsDynamicsPackage.SET:
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
	public ApogyCommonTopologyAddonsDynamicsFacade createApogyCommonTopologyAddonsDynamicsFacade() {
		ApogyCommonTopologyAddonsDynamicsFacadeImpl apogyCommonTopologyAddonsDynamicsFacade = new ApogyCommonTopologyAddonsDynamicsFacadeImpl();
		return apogyCommonTopologyAddonsDynamicsFacade;
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
	public ApogyCommonTopologyAddonsDynamicsPackage getApogyCommonTopologyAddonsDynamicsPackage() {
		return (ApogyCommonTopologyAddonsDynamicsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonTopologyAddonsDynamicsPackage getPackage() {
		return ApogyCommonTopologyAddonsDynamicsPackage.eINSTANCE;
	}

} //ApogyCommonTopologyAddonsDynamicsFactoryImpl
