/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data3d.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.space.mrt.geometry.data3d.ui.CartesianCoordinatesSetPresentation;
import ca.gc.space.mrt.geometry.data3d.ui.Data3DUIFactory;
import ca.gc.space.mrt.geometry.data3d.ui.Data3DUIPackage;
import ca.gc.space.mrt.geometry.data3d.ui.TriangularMeshPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Data3DUIFactoryImpl extends EFactoryImpl implements Data3DUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Data3DUIFactory init() {
		try {
			Data3DUIFactory theData3DUIFactory = (Data3DUIFactory)EPackage.Registry.INSTANCE.getEFactory(Data3DUIPackage.eNS_URI);
			if (theData3DUIFactory != null) {
				return theData3DUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Data3DUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data3DUIFactoryImpl() {
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
			case Data3DUIPackage.CARTESIAN_COORDINATES_SET_PRESENTATION: return createCartesianCoordinatesSetPresentation();
			case Data3DUIPackage.TRIANGULAR_MESH_PRESENTATION: return createTriangularMeshPresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesSetPresentation createCartesianCoordinatesSetPresentation() {
		CartesianCoordinatesSetPresentationImpl cartesianCoordinatesSetPresentation = new CartesianCoordinatesSetPresentationImpl();
		return cartesianCoordinatesSetPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriangularMeshPresentation createTriangularMeshPresentation() {
		TriangularMeshPresentationImpl triangularMeshPresentation = new TriangularMeshPresentationImpl();
		return triangularMeshPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data3DUIPackage getData3DUIPackage() {
		return (Data3DUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Data3DUIPackage getPackage() {
		return Data3DUIPackage.eINSTANCE;
	}

} //Data3DUIFactoryImpl
