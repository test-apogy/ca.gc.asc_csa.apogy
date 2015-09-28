/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data25d.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.space.mrt.geometry.data25d.ui.Data25DUIFactory;
import ca.gc.space.mrt.geometry.data25d.ui.Data25DUIPackage;
import ca.gc.space.mrt.geometry.data25d.ui.VolumetricCoordinatesSet25DPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Data25DUIFactoryImpl extends EFactoryImpl implements Data25DUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Data25DUIFactory init() {
		try {
			Data25DUIFactory theData25DUIFactory = (Data25DUIFactory)EPackage.Registry.INSTANCE.getEFactory(Data25DUIPackage.eNS_URI);
			if (theData25DUIFactory != null) {
				return theData25DUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Data25DUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data25DUIFactoryImpl() {
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
			case Data25DUIPackage.VOLUMETRIC_COORDINATES_SET25_DPRESENTATION: return createVolumetricCoordinatesSet25DPresentation();
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
	public Data25DUIPackage getData25DUIPackage() {
		return (Data25DUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Data25DUIPackage getPackage() {
		return Data25DUIPackage.eINSTANCE;
	}

} //Data25DUIFactoryImpl
