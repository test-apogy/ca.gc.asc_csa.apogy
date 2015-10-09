/**
 * Canadian Space Agency 2007.
 *
 * $Id: Data25dFactoryImpl.java,v 1.6.4.3 2015/09/22 19:39:38 rlarcheveque Exp $
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
import org.eclipse.symphony.common.geometry.data25d.Data25dFactory;
import org.eclipse.symphony.common.geometry.data25d.Data25dPackage;
import org.eclipse.symphony.common.geometry.data25d.DataFacade;
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
public class Data25dFactoryImpl extends EFactoryImpl implements Data25dFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Data25dFactory init() {
		try {
			Data25dFactory theData25dFactory = (Data25dFactory)EPackage.Registry.INSTANCE.getEFactory(Data25dPackage.eNS_URI);
			if (theData25dFactory != null) {
				return theData25dFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Data25dFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data25dFactoryImpl() {
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
			case Data25dPackage.COORDINATES25_D: return createCoordinates25D();
			case Data25dPackage.COORDINATES_SET25_D: return createCoordinatesSet25D();
			case Data25dPackage.VOLUMETRIC_COORDINATES_SET25_D: return createVolumetricCoordinatesSet25D();
			case Data25dPackage.POLYGON25_D: return createPolygon25D();
			case Data25dPackage.MESH25_D: return createMesh25D();
			case Data25dPackage.VOLUMETRIC_MESH25_D: return createVolumetricMesh25D();
			case Data25dPackage.DATA_FACADE: return createDataFacade();
			case Data25dPackage.DATA25_DIO: return createData25DIO();
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
			case Data25dPackage.IO_EXCEPTION:
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
			case Data25dPackage.IO_EXCEPTION:
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
	public DataFacade createDataFacade()
	{
		DataFacadeImpl dataFacade = new DataFacadeImpl();
		return dataFacade;
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
	public Data25dPackage getData25dPackage() {
		return (Data25dPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Data25dPackage getPackage() {
		return Data25dPackage.eINSTANCE;
	}

} //Data25dFactoryImpl
