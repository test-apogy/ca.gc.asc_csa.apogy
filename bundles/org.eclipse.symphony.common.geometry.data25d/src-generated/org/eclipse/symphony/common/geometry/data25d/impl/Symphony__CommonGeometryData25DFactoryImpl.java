/**
 * Canadian Space Agency 2007.
 *
 */
package org.eclipse.symphony.common.geometry.data25d.impl;

import java.io.IOException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.common.geometry.data25d.Coordinates25D;
import org.eclipse.symphony.common.geometry.data25d.CoordinatesSet25D;
import org.eclipse.symphony.common.geometry.data25d.Data25DIO;
import org.eclipse.symphony.common.geometry.data25d.Symphony__CommonGeometryData25DFactory;
import org.eclipse.symphony.common.geometry.data25d.Symphony__CommonGeometryData25DPackage;
import org.eclipse.symphony.common.geometry.data25d.Symphony__CommonGeometryData25DFacade;
import org.eclipse.symphony.common.geometry.data25d.Mesh25D;
import org.eclipse.symphony.common.geometry.data25d.Polygon25D;
import org.eclipse.symphony.common.geometry.data25d.VolumetricCoordinatesSet25D;
import org.eclipse.symphony.common.geometry.data25d.VolumetricMesh25D;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonGeometryData25DFactoryImpl extends EFactoryImpl implements Symphony__CommonGeometryData25DFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CommonGeometryData25DFactory init() {
		try {
			Symphony__CommonGeometryData25DFactory theSymphony__CommonGeometryData25DFactory = (Symphony__CommonGeometryData25DFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonGeometryData25DPackage.eNS_URI);
			if (theSymphony__CommonGeometryData25DFactory != null) {
				return theSymphony__CommonGeometryData25DFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonGeometryData25DFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonGeometryData25DFactoryImpl() {
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
			case Symphony__CommonGeometryData25DPackage.COORDINATES25_D: return createCoordinates25D();
			case Symphony__CommonGeometryData25DPackage.COORDINATES_SET25_D: return createCoordinatesSet25D();
			case Symphony__CommonGeometryData25DPackage.VOLUMETRIC_COORDINATES_SET25_D: return createVolumetricCoordinatesSet25D();
			case Symphony__CommonGeometryData25DPackage.POLYGON25_D: return createPolygon25D();
			case Symphony__CommonGeometryData25DPackage.MESH25_D: return createMesh25D();
			case Symphony__CommonGeometryData25DPackage.VOLUMETRIC_MESH25_D: return createVolumetricMesh25D();
			case Symphony__CommonGeometryData25DPackage.SYMPHONY_COMMON_GEOMETRY_DATA25_DFACADE: return createSymphony__CommonGeometryData25DFacade();
			case Symphony__CommonGeometryData25DPackage.DATA25_DIO: return createData25DIO();
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
			case Symphony__CommonGeometryData25DPackage.IO_EXCEPTION:
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
			case Symphony__CommonGeometryData25DPackage.IO_EXCEPTION:
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
	public Symphony__CommonGeometryData25DFacade createSymphony__CommonGeometryData25DFacade() {
		Symphony__CommonGeometryData25DFacadeImpl symphony__CommonGeometryData25DFacade = new Symphony__CommonGeometryData25DFacadeImpl();
		return symphony__CommonGeometryData25DFacade;
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
	public Symphony__CommonGeometryData25DPackage getSymphony__CommonGeometryData25DPackage() {
		return (Symphony__CommonGeometryData25DPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CommonGeometryData25DPackage getPackage() {
		return Symphony__CommonGeometryData25DPackage.eINSTANCE;
	}

} //Symphony__CommonGeometryData25DFactoryImpl
