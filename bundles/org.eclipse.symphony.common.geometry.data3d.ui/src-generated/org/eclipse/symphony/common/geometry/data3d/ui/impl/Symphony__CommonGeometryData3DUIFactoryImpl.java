/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation;
import org.eclipse.symphony.common.geometry.data3d.ui.Symphony__CommonGeometryData3DUIFactory;
import org.eclipse.symphony.common.geometry.data3d.ui.Symphony__CommonGeometryData3DUIPackage;
import org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonGeometryData3DUIFactoryImpl extends EFactoryImpl implements Symphony__CommonGeometryData3DUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CommonGeometryData3DUIFactory init() {
		try {
			Symphony__CommonGeometryData3DUIFactory theSymphony__CommonGeometryData3DUIFactory = (Symphony__CommonGeometryData3DUIFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonGeometryData3DUIPackage.eNS_URI);
			if (theSymphony__CommonGeometryData3DUIFactory != null) {
				return theSymphony__CommonGeometryData3DUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonGeometryData3DUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonGeometryData3DUIFactoryImpl() {
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
			case Symphony__CommonGeometryData3DUIPackage.CARTESIAN_COORDINATES_SET_PRESENTATION: return createCartesianCoordinatesSetPresentation();
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION: return createTriangularMeshPresentation();
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
	public Symphony__CommonGeometryData3DUIPackage getSymphony__CommonGeometryData3DUIPackage() {
		return (Symphony__CommonGeometryData3DUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CommonGeometryData3DUIPackage getPackage() {
		return Symphony__CommonGeometryData3DUIPackage.eINSTANCE;
	}

} //Symphony__CommonGeometryData3DUIFactoryImpl
