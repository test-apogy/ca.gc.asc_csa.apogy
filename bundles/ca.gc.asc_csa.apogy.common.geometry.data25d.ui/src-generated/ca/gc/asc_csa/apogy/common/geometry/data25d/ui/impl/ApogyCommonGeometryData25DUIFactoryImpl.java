/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data25d.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ui.ApogyCommonGeometryData25DUIFactory;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ui.ApogyCommonGeometryData25DUIPackage;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ui.VolumetricCoordinatesSet25DPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonGeometryData25DUIFactoryImpl extends EFactoryImpl implements ApogyCommonGeometryData25DUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonGeometryData25DUIFactory init() {
		try {
			ApogyCommonGeometryData25DUIFactory theApogyCommonGeometryData25DUIFactory = (ApogyCommonGeometryData25DUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonGeometryData25DUIPackage.eNS_URI);
			if (theApogyCommonGeometryData25DUIFactory != null) {
				return theApogyCommonGeometryData25DUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonGeometryData25DUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData25DUIFactoryImpl() {
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
			case ApogyCommonGeometryData25DUIPackage.VOLUMETRIC_COORDINATES_SET25_DPRESENTATION: return createVolumetricCoordinatesSet25DPresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumetricCoordinatesSet25DPresentation createVolumetricCoordinatesSet25DPresentation() {
		VolumetricCoordinatesSet25DPresentationImpl volumetricCoordinatesSet25DPresentation = new VolumetricCoordinatesSet25DPresentationImpl();
		return volumetricCoordinatesSet25DPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData25DUIPackage getApogyCommonGeometryData25DUIPackage() {
		return (ApogyCommonGeometryData25DUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonGeometryData25DUIPackage getPackage() {
		return ApogyCommonGeometryData25DUIPackage.eINSTANCE;
	}

} //ApogyCommonGeometryData25DUIFactoryImpl
