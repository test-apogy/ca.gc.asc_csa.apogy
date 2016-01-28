/**
 * Canadian Space Agency 2007.
 *
 */
package ca.gc.asc_csa.apogy.common.geometry.data25d.impl;

import java.io.IOException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.CoordinatesSet25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Data25DIO;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Mesh25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Polygon25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricCoordinatesSet25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricMesh25D;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonGeometryData25DFactoryImpl extends EFactoryImpl implements ApogyCommonGeometryData25DFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonGeometryData25DFactory init() {
		try {
			ApogyCommonGeometryData25DFactory theApogyCommonGeometryData25DFactory = (ApogyCommonGeometryData25DFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonGeometryData25DPackage.eNS_URI);
			if (theApogyCommonGeometryData25DFactory != null) {
				return theApogyCommonGeometryData25DFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonGeometryData25DFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData25DFactoryImpl() {
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
			case ApogyCommonGeometryData25DPackage.COORDINATES25_D: return createCoordinates25D();
			case ApogyCommonGeometryData25DPackage.COORDINATES_SET25_D: return createCoordinatesSet25D();
			case ApogyCommonGeometryData25DPackage.VOLUMETRIC_COORDINATES_SET25_D: return createVolumetricCoordinatesSet25D();
			case ApogyCommonGeometryData25DPackage.POLYGON25_D: return createPolygon25D();
			case ApogyCommonGeometryData25DPackage.MESH25_D: return createMesh25D();
			case ApogyCommonGeometryData25DPackage.VOLUMETRIC_MESH25_D: return createVolumetricMesh25D();
			case ApogyCommonGeometryData25DPackage.APOGY_COMMON_GEOMETRY_DATA25_DFACADE: return createApogyCommonGeometryData25DFacade();
			case ApogyCommonGeometryData25DPackage.DATA25_DIO: return createData25DIO();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyCommonGeometryData25DPackage.IO_EXCEPTION:
				return createIOExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyCommonGeometryData25DPackage.IO_EXCEPTION:
				return convertIOExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinates25D createCoordinates25D() {
		Coordinates25DImpl coordinates25D = new Coordinates25DImpl();
		return coordinates25D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatesSet25D createCoordinatesSet25D() {
		CoordinatesSet25DImpl coordinatesSet25D = new CoordinatesSet25DImpl();
		return coordinatesSet25D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polygon25D createPolygon25D() {
		Polygon25DImpl polygon25D = new Polygon25DImpl();
		return polygon25D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mesh25D createMesh25D() {
		Mesh25DImpl mesh25D = new Mesh25DImpl();
		return mesh25D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumetricCoordinatesSet25D createVolumetricCoordinatesSet25D()
	{
		VolumetricCoordinatesSet25DImpl volumetricCoordinatesSet25D = new VolumetricCoordinatesSet25DImpl();
		return volumetricCoordinatesSet25D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumetricMesh25D createVolumetricMesh25D()
	{
		VolumetricMesh25DImpl volumetricMesh25D = new VolumetricMesh25DImpl();
		return volumetricMesh25D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData25DFacade createApogyCommonGeometryData25DFacade() {
		ApogyCommonGeometryData25DFacadeImpl apogy__CommonGeometryData25DFacade = new ApogyCommonGeometryData25DFacadeImpl();
		return apogy__CommonGeometryData25DFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data25DIO createData25DIO() {
		Data25DIOImpl data25DIO = new Data25DIOImpl();
		return data25DIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOException createIOExceptionFromString(EDataType eDataType, String initialValue) {
		return (IOException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData25DPackage getApogyCommonGeometryData25DPackage() {
		return (ApogyCommonGeometryData25DPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonGeometryData25DPackage getPackage() {
		return ApogyCommonGeometryData25DPackage.eINSTANCE;
	}

} //ApogyCommonGeometryData25DFactoryImpl
