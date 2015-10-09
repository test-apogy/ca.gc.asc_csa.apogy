/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.primitives.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.common.topology.addons.primitives.ui.LabelPresentation;
import org.eclipse.symphony.common.topology.addons.primitives.ui.SpherePrimitivePresentation;
import org.eclipse.symphony.common.topology.addons.primitives.ui.TopologyUIPrimitivesFactory;
import org.eclipse.symphony.common.topology.addons.primitives.ui.TopologyUIPrimitivesPackage;
import org.eclipse.symphony.common.topology.addons.primitives.ui.VectorPresentation;
import org.eclipse.symphony.common.topology.addons.primitives.ui.WayPointPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopologyUIPrimitivesFactoryImpl extends EFactoryImpl implements TopologyUIPrimitivesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TopologyUIPrimitivesFactory init() {
		try {
			TopologyUIPrimitivesFactory theTopologyUIPrimitivesFactory = (TopologyUIPrimitivesFactory)EPackage.Registry.INSTANCE.getEFactory(TopologyUIPrimitivesPackage.eNS_URI);
			if (theTopologyUIPrimitivesFactory != null) {
				return theTopologyUIPrimitivesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TopologyUIPrimitivesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyUIPrimitivesFactoryImpl() {
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
			case TopologyUIPrimitivesPackage.VECTOR_PRESENTATION: return createVectorPresentation();
			case TopologyUIPrimitivesPackage.WAY_POINT_PRESENTATION: return createWayPointPresentation();
			case TopologyUIPrimitivesPackage.LABEL_PRESENTATION: return createLabelPresentation();
			case TopologyUIPrimitivesPackage.SPHERE_PRIMITIVE_PRESENTATION: return createSpherePrimitivePresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorPresentation createVectorPresentation() {
		VectorPresentationImpl vectorPresentation = new VectorPresentationImpl();
		return vectorPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayPointPresentation createWayPointPresentation() {
		WayPointPresentationImpl wayPointPresentation = new WayPointPresentationImpl();
		return wayPointPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelPresentation createLabelPresentation() {
		LabelPresentationImpl labelPresentation = new LabelPresentationImpl();
		return labelPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpherePrimitivePresentation createSpherePrimitivePresentation() {
		SpherePrimitivePresentationImpl spherePrimitivePresentation = new SpherePrimitivePresentationImpl();
		return spherePrimitivePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyUIPrimitivesPackage getTopologyUIPrimitivesPackage() {
		return (TopologyUIPrimitivesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TopologyUIPrimitivesPackage getPackage() {
		return TopologyUIPrimitivesPackage.eINSTANCE;
	}

} //TopologyUIPrimitivesFactoryImpl
