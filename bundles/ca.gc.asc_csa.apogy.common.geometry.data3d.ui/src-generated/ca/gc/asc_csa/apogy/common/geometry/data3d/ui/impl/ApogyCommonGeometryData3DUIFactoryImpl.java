/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.TriangularMeshPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonGeometryData3DUIFactoryImpl extends EFactoryImpl implements ApogyCommonGeometryData3DUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonGeometryData3DUIFactory init() {
		try {
			ApogyCommonGeometryData3DUIFactory theApogyCommonGeometryData3DUIFactory = (ApogyCommonGeometryData3DUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonGeometryData3DUIPackage.eNS_URI);
			if (theApogyCommonGeometryData3DUIFactory != null) {
				return theApogyCommonGeometryData3DUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonGeometryData3DUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData3DUIFactoryImpl() {
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
			case ApogyCommonGeometryData3DUIPackage.CARTESIAN_COORDINATES_SET_PRESENTATION: return createCartesianCoordinatesSetPresentation();
			case ApogyCommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION: return createTriangularMeshPresentation();
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
	public ApogyCommonGeometryData3DUIPackage getApogyCommonGeometryData3DUIPackage() {
		return (ApogyCommonGeometryData3DUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonGeometryData3DUIPackage getPackage() {
		return ApogyCommonGeometryData3DUIPackage.eINSTANCE;
	}

} //ApogyCommonGeometryData3DUIFactoryImpl
