/**
 * Canadian Space Agency 2007.
 *
 * $Id: Symphony__CommonGeometryData25DFacadeImpl.java,v 1.5.4.3 2015/09/22 19:39:38 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.geometry.data25d.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.geometry.data25d.Coordinates25D;
import org.eclipse.symphony.common.geometry.data25d.Symphony__CommonGeometryData25DFactory;
import org.eclipse.symphony.common.geometry.data25d.Symphony__CommonGeometryData25DPackage;
import org.eclipse.symphony.common.geometry.data25d.Symphony__CommonGeometryData25DFacade;
import org.eclipse.symphony.common.geometry.data25d.VolumetricCoordinatesSet25D;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFacade;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Symphony__CommonGeometryData25DFacadeImpl extends MinimalEObjectImpl.Container implements Symphony__CommonGeometryData25DFacade
{
	private static Symphony__CommonGeometryData25DFacade instance;

	public static Symphony__CommonGeometryData25DFacade getInstance() {
		if (instance == null) {
			instance = new Symphony__CommonGeometryData25DFacadeImpl();
		}

		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Symphony__CommonGeometryData25DFacadeImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Symphony__CommonGeometryData25DPackage.Literals.SYMPHONY_COMMON_GEOMETRY_DATA25_DFACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Coordinates25D createCoordinates25D(Coordinates25D coordinates25D)
	{
		return createCoordinates25D(coordinates25D.getU(), coordinates25D.getV(), coordinates25D.getW());		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Coordinates25D createCoordinates25D(double u, double v, double w)
	{
		Coordinates25D coord = Symphony__CommonGeometryData25DFactory.eINSTANCE.createCoordinates25D();
		
		coord.setU(u);
		coord.setV(v);
		coord.setW(w);
		
		return coord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public <T extends VolumetricCoordinatesSet25D> CartesianCoordinatesSet createCartesianCoordinatesSet(T volumetricCoordinatesSet25D)
	{				
		List<CartesianPositionCoordinates> pointList = new ArrayList<CartesianPositionCoordinates>();
		int numberOfPoints = volumetricCoordinatesSet25D.getPoints().size();
		for(int i = 0; i < numberOfPoints; i++)
		{
			Coordinates25D point25D = volumetricCoordinatesSet25D.getPoints().get(i);
		
			CartesianPositionCoordinates point = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(volumetricCoordinatesSet25D.getCartesianPositionCoordinates(point25D));
			pointList.add(point);						
		}
		
		// Adds all the point to the set in one shot.
		CartesianCoordinatesSet coordinateSet = Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();
		coordinateSet.getPoints().addAll(pointList);
		
		return coordinateSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__CommonGeometryData25DPackage.SYMPHONY_COMMON_GEOMETRY_DATA25_DFACADE___CREATE_COORDINATES25_D__COORDINATES25D:
				return createCoordinates25D((Coordinates25D)arguments.get(0));
			case Symphony__CommonGeometryData25DPackage.SYMPHONY_COMMON_GEOMETRY_DATA25_DFACADE___CREATE_COORDINATES25_D__DOUBLE_DOUBLE_DOUBLE:
				return createCoordinates25D((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case Symphony__CommonGeometryData25DPackage.SYMPHONY_COMMON_GEOMETRY_DATA25_DFACADE___CREATE_CARTESIAN_COORDINATES_SET__VOLUMETRICCOORDINATESSET25D:
				return createCartesianCoordinatesSet((VolumetricCoordinatesSet25D)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //Symphony__CommonGeometryData25DFacadeImpl
