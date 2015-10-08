/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.ui.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyToolsUIFactoryImpl extends EFactoryImpl implements SymphonyToolsUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SymphonyToolsUIFactory init() {
		try {
			SymphonyToolsUIFactory theSymphonyToolsUIFactory = (SymphonyToolsUIFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyToolsUIPackage.eNS_URI);
			if (theSymphonyToolsUIFactory != null) {
				return theSymphonyToolsUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyToolsUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyToolsUIFactoryImpl() {
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
			case SymphonyToolsUIPackage.RULER3D_TOOL_NODE_PRESENTATION: return createRuler3dToolNodePresentation();
			case SymphonyToolsUIPackage.SUN_VECTOR3_DTOOL_NODE_PRESENTATION: return createSunVector3DToolNodePresentation();
			case SymphonyToolsUIPackage.TRAJECTORY3_DTOOL_NODE_PRESENTATION: return createTrajectory3DToolNodePresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruler3dToolNodePresentation createRuler3dToolNodePresentation() {
		Ruler3dToolNodePresentationImpl ruler3dToolNodePresentation = new Ruler3dToolNodePresentationImpl();
		return ruler3dToolNodePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunVector3DToolNodePresentation createSunVector3DToolNodePresentation() {
		SunVector3DToolNodePresentationImpl sunVector3DToolNodePresentation = new SunVector3DToolNodePresentationImpl();
		return sunVector3DToolNodePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trajectory3DToolNodePresentation createTrajectory3DToolNodePresentation() {
		Trajectory3DToolNodePresentationImpl trajectory3DToolNodePresentation = new Trajectory3DToolNodePresentationImpl();
		return trajectory3DToolNodePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyToolsUIPackage getSymphonyToolsUIPackage() {
		return (SymphonyToolsUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SymphonyToolsUIPackage getPackage() {
		return SymphonyToolsUIPackage.eINSTANCE;
	}

} //SymphonyToolsUIFactoryImpl
