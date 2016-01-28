/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.core.environment.EarthSurfaceWorksite;
import org.eclipse.symphony.core.environment.GeographicCoordinates;
import org.eclipse.symphony.core.environment.GeographicCoordinatesPolygonShapeImageMapLayer;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geographic Coordinates Polygon Shape Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.GeographicCoordinatesPolygonShapeImageMapLayerImpl#getPolygonVerticesGeographicCoordinates <em>Polygon Vertices Geographic Coordinates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeographicCoordinatesPolygonShapeImageMapLayerImpl extends PolygonShapeImageMapLayerImpl implements GeographicCoordinatesPolygonShapeImageMapLayer {
	/**
	 * The cached value of the '{@link #getPolygonVerticesGeographicCoordinates() <em>Polygon Vertices Geographic Coordinates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonVerticesGeographicCoordinates()
	 * @generated
	 * @ordered
	 */
	protected EList<GeographicCoordinates> polygonVerticesGeographicCoordinates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeographicCoordinatesPolygonShapeImageMapLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CoreEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeographicCoordinates> getPolygonVerticesGeographicCoordinates() {
		if (polygonVerticesGeographicCoordinates == null) {
			polygonVerticesGeographicCoordinates = new EObjectContainmentEList<GeographicCoordinates>(GeographicCoordinates.class, this, Symphony__CoreEnvironmentPackage.GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES_GEOGRAPHIC_COORDINATES);
		}
		return polygonVerticesGeographicCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__CoreEnvironmentPackage.GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES_GEOGRAPHIC_COORDINATES:
				return ((InternalEList<?>)getPolygonVerticesGeographicCoordinates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CoreEnvironmentPackage.GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES_GEOGRAPHIC_COORDINATES:
				return getPolygonVerticesGeographicCoordinates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Symphony__CoreEnvironmentPackage.GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES_GEOGRAPHIC_COORDINATES:
				getPolygonVerticesGeographicCoordinates().clear();
				getPolygonVerticesGeographicCoordinates().addAll((Collection<? extends GeographicCoordinates>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Symphony__CoreEnvironmentPackage.GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES_GEOGRAPHIC_COORDINATES:
				getPolygonVerticesGeographicCoordinates().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Symphony__CoreEnvironmentPackage.GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES_GEOGRAPHIC_COORDINATES:
				return polygonVerticesGeographicCoordinates != null && !polygonVerticesGeographicCoordinates.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public List<Tuple3d> getVertices() 
	{
		List<Tuple3d> vertices = new ArrayList<Tuple3d>();
		
		EarthSurfaceWorksite earthSurfaceWorksite = getEarthSurfaceWorksite();
		if(earthSurfaceWorksite != null)
		{
			for(GeographicCoordinates coord : getPolygonVerticesGeographicCoordinates())
			{
				Tuple3d vertex = earthSurfaceWorksite.convertToXYZPosition(coord);
				vertices.add(vertex);
			}
		}		
		
		return vertices;
	}
	
	protected EarthSurfaceWorksite getEarthSurfaceWorksite()
	{
		EarthSurfaceWorksite earthSurfaceWorksite = null;
		EObject container = this.eContainer();
		
		while(earthSurfaceWorksite == null && container != null)
		{
			if(container instanceof EarthSurfaceWorksite)
			{
				earthSurfaceWorksite = (EarthSurfaceWorksite) container;
			}
			else
			{
				container = container.eContainer();
			}
		}
		
		return earthSurfaceWorksite;
	}
} //GeographicCoordinatesPolygonShapeImageMapLayerImpl
