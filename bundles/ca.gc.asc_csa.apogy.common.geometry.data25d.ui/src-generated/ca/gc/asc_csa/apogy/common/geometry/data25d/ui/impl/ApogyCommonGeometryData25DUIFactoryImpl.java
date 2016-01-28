/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data25d.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.common.geometry.data25d.ui.Symphony__CommonGeometryData25DUIFactory;
import org.eclipse.symphony.common.geometry.data25d.ui.Symphony__CommonGeometryData25DUIPackage;
import org.eclipse.symphony.common.geometry.data25d.ui.VolumetricCoordinatesSet25DPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonGeometryData25DUIFactoryImpl extends EFactoryImpl implements Symphony__CommonGeometryData25DUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CommonGeometryData25DUIFactory init() {
		try {
			Symphony__CommonGeometryData25DUIFactory theSymphony__CommonGeometryData25DUIFactory = (Symphony__CommonGeometryData25DUIFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonGeometryData25DUIPackage.eNS_URI);
			if (theSymphony__CommonGeometryData25DUIFactory != null) {
				return theSymphony__CommonGeometryData25DUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonGeometryData25DUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonGeometryData25DUIFactoryImpl() {
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
			case Symphony__CommonGeometryData25DUIPackage.VOLUMETRIC_COORDINATES_SET25_DPRESENTATION: return createVolumetricCoordinatesSet25DPresentation();
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
	public Symphony__CommonGeometryData25DUIPackage getSymphony__CommonGeometryData25DUIPackage() {
		return (Symphony__CommonGeometryData25DUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CommonGeometryData25DUIPackage getPackage() {
		return Symphony__CommonGeometryData25DUIPackage.eINSTANCE;
	}

} //Symphony__CommonGeometryData25DUIFactoryImpl
