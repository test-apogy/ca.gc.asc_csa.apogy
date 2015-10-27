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
import org.eclipse.symphony.common.topology.addons.primitives.ui.Symphony__CommonTopologyAddonsPrimitivesUIFactory;
import org.eclipse.symphony.common.topology.addons.primitives.ui.Symphony__CommonTopologyAddonsPrimitivesUIPackage;
import org.eclipse.symphony.common.topology.addons.primitives.ui.VectorPresentation;
import org.eclipse.symphony.common.topology.addons.primitives.ui.WayPointPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonTopologyAddonsPrimitivesUIFactoryImpl extends EFactoryImpl implements Symphony__CommonTopologyAddonsPrimitivesUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CommonTopologyAddonsPrimitivesUIFactory init() {
		try {
			Symphony__CommonTopologyAddonsPrimitivesUIFactory theSymphony__CommonTopologyAddonsPrimitivesUIFactory = (Symphony__CommonTopologyAddonsPrimitivesUIFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonTopologyAddonsPrimitivesUIPackage.eNS_URI);
			if (theSymphony__CommonTopologyAddonsPrimitivesUIFactory != null) {
				return theSymphony__CommonTopologyAddonsPrimitivesUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonTopologyAddonsPrimitivesUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonTopologyAddonsPrimitivesUIFactoryImpl() {
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
			case Symphony__CommonTopologyAddonsPrimitivesUIPackage.VECTOR_PRESENTATION: return createVectorPresentation();
			case Symphony__CommonTopologyAddonsPrimitivesUIPackage.WAY_POINT_PRESENTATION: return createWayPointPresentation();
			case Symphony__CommonTopologyAddonsPrimitivesUIPackage.LABEL_PRESENTATION: return createLabelPresentation();
			case Symphony__CommonTopologyAddonsPrimitivesUIPackage.SPHERE_PRIMITIVE_PRESENTATION: return createSpherePrimitivePresentation();
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
	public Symphony__CommonTopologyAddonsPrimitivesUIPackage getSymphony__CommonTopologyAddonsPrimitivesUIPackage() {
		return (Symphony__CommonTopologyAddonsPrimitivesUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CommonTopologyAddonsPrimitivesUIPackage getPackage() {
		return Symphony__CommonTopologyAddonsPrimitivesUIPackage.eINSTANCE;
	}

} //Symphony__CommonTopologyAddonsPrimitivesUIFactoryImpl
