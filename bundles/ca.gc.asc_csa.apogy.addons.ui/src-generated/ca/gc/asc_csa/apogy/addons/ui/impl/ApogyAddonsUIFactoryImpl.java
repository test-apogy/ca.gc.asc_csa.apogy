/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.addons.ui.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsUIFactoryImpl extends EFactoryImpl implements ApogyAddonsUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyAddonsUIFactory init() {
		try {
			ApogyAddonsUIFactory theApogyAddonsUIFactory = (ApogyAddonsUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsUIPackage.eNS_URI);
			if (theApogyAddonsUIFactory != null) {
				return theApogyAddonsUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsUIFactoryImpl() {
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
			case ApogyAddonsUIPackage.RULER3D_TOOL_NODE_PRESENTATION: return createRuler3dToolNodePresentation();
			case ApogyAddonsUIPackage.SUN_VECTOR3_DTOOL_NODE_PRESENTATION: return createSunVector3DToolNodePresentation();
			case ApogyAddonsUIPackage.TRAJECTORY3_DTOOL_NODE_PRESENTATION: return createTrajectory3DToolNodePresentation();
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
	public ApogyAddonsUIPackage getApogyAddonsUIPackage() {
		return (ApogyAddonsUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyAddonsUIPackage getPackage() {
		return ApogyAddonsUIPackage.eINSTANCE;
	}

} //ApogyAddonsUIFactoryImpl
