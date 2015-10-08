/**
 * Canadian Space Agency 2008
 *
 * $Id: MeshCoordinatesShapesSamplerImpl.java,v 1.5.4.2 2015/05/21 15:50:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ca.gc.space.mrt.common.processors.impl.ProcessorImpl;
import ca.gc.space.mrt.geometry.data.Coordinates;
import ca.gc.space.mrt.geometry.data.CoordinatesSamplingShape;
import ca.gc.space.mrt.geometry.data.DataPackage;
import ca.gc.space.mrt.geometry.data.Mesh;
import ca.gc.space.mrt.geometry.data.MeshCoordinatesShapesSampler;
import ca.gc.space.mrt.geometry.data.Polygon;
import ca.gc.space.mrt.geometry.data.PolygonSamplingMode;
import ca.gc.space.mrt.geometry.data.ShapeSamplingMode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mesh Coordinates Shapes Sampler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data.impl.MeshCoordinatesShapesSamplerImpl#getCoordinatesSamplingShapes <em>Coordinates Sampling Shapes</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data.impl.MeshCoordinatesShapesSamplerImpl#getShapeSamplingMode <em>Shape Sampling Mode</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data.impl.MeshCoordinatesShapesSamplerImpl#getPolygonSamplingMode <em>Polygon Sampling Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeshCoordinatesShapesSamplerImpl<CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> extends ProcessorImpl<Mesh<CoordinatesType, PolygonType>, Mesh<CoordinatesType, PolygonType>> implements MeshCoordinatesShapesSampler<CoordinatesType, PolygonType>
{
	/**
	 * The cached value of the '{@link #getCoordinatesSamplingShapes() <em>Coordinates Sampling Shapes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinatesSamplingShapes()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinatesSamplingShape<CoordinatesType>> coordinatesSamplingShapes;

	/**
	 * The default value of the '{@link #getShapeSamplingMode() <em>Shape Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeSamplingMode()
	 * @generated
	 * @ordered
	 */
	protected static final ShapeSamplingMode SHAPE_SAMPLING_MODE_EDEFAULT = ShapeSamplingMode.UNION;

	/**
	 * The cached value of the '{@link #getShapeSamplingMode() <em>Shape Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeSamplingMode()
	 * @generated
	 * @ordered
	 */
	protected ShapeSamplingMode shapeSamplingMode = SHAPE_SAMPLING_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolygonSamplingMode() <em>Polygon Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonSamplingMode()
	 * @generated
	 * @ordered
	 */
	protected static final PolygonSamplingMode POLYGON_SAMPLING_MODE_EDEFAULT = PolygonSamplingMode.AT_LEAST_ONE_VERTEX;

	/**
	 * The cached value of the '{@link #getPolygonSamplingMode() <em>Polygon Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonSamplingMode()
	 * @generated
	 * @ordered
	 */
	protected PolygonSamplingMode polygonSamplingMode = POLYGON_SAMPLING_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeshCoordinatesShapesSamplerImpl()
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
		return DataPackage.Literals.MESH_COORDINATES_SHAPES_SAMPLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInput(Mesh<CoordinatesType, PolygonType> newInput) {
		super.setInput(newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setOutput(Mesh<CoordinatesType, PolygonType> newOutput) {
		super.setOutput(newOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoordinatesSamplingShape<CoordinatesType>> getCoordinatesSamplingShapes()
	{
		if (coordinatesSamplingShapes == null) {
			coordinatesSamplingShapes = new EObjectResolvingEList<CoordinatesSamplingShape<CoordinatesType>>(CoordinatesSamplingShape.class, this, DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES);
		}
		return coordinatesSamplingShapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeSamplingMode getShapeSamplingMode()
	{
		return shapeSamplingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeSamplingMode(ShapeSamplingMode newShapeSamplingMode)
	{
		ShapeSamplingMode oldShapeSamplingMode = shapeSamplingMode;
		shapeSamplingMode = newShapeSamplingMode == null ? SHAPE_SAMPLING_MODE_EDEFAULT : newShapeSamplingMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE, oldShapeSamplingMode, shapeSamplingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonSamplingMode getPolygonSamplingMode()
	{
		return polygonSamplingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolygonSamplingMode(PolygonSamplingMode newPolygonSamplingMode)
	{
		PolygonSamplingMode oldPolygonSamplingMode = polygonSamplingMode;
		polygonSamplingMode = newPolygonSamplingMode == null ? POLYGON_SAMPLING_MODE_EDEFAULT : newPolygonSamplingMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__POLYGON_SAMPLING_MODE, oldPolygonSamplingMode, polygonSamplingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES:
				return getCoordinatesSamplingShapes();
			case DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE:
				return getShapeSamplingMode();
			case DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__POLYGON_SAMPLING_MODE:
				return getPolygonSamplingMode();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES:
				getCoordinatesSamplingShapes().clear();
				getCoordinatesSamplingShapes().addAll((Collection<? extends CoordinatesSamplingShape<CoordinatesType>>)newValue);
				return;
			case DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE:
				setShapeSamplingMode((ShapeSamplingMode)newValue);
				return;
			case DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__POLYGON_SAMPLING_MODE:
				setPolygonSamplingMode((PolygonSamplingMode)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES:
				getCoordinatesSamplingShapes().clear();
				return;
			case DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE:
				setShapeSamplingMode(SHAPE_SAMPLING_MODE_EDEFAULT);
				return;
			case DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__POLYGON_SAMPLING_MODE:
				setPolygonSamplingMode(POLYGON_SAMPLING_MODE_EDEFAULT);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES:
				return coordinatesSamplingShapes != null && !coordinatesSamplingShapes.isEmpty();
			case DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE:
				return shapeSamplingMode != SHAPE_SAMPLING_MODE_EDEFAULT;
			case DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__POLYGON_SAMPLING_MODE:
				return polygonSamplingMode != POLYGON_SAMPLING_MODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (shapeSamplingMode: ");
		result.append(shapeSamplingMode);
		result.append(", polygonSamplingMode: ");
		result.append(polygonSamplingMode);
		result.append(')');
		return result.toString();
	}

	/**
	 * Must be overwritten by sub-classes to create the right kind of mesh
	 * produced by the process method.
	 * @param mesh
	 * @return
	 */
	protected abstract Mesh<CoordinatesType, PolygonType> createMesh();	
	
	/**
	 * Must be overwritten by sub-classes to create the right kind of coordinates that is inside the
	 * coordinates set produced by the process method.
	 * @param point
	 * @return
	 */
	protected abstract CoordinatesType copyCoordinates(CoordinatesType point);
	
	/**
	 * Must be overwritten by sub-classes to create the right kind of polygon that is inside the
	 * coordinates set produced by the process method.
	 * @return The Polygon.
	 */
	protected abstract PolygonType createPolygon();
	
	@Override
	public Mesh<CoordinatesType, PolygonType> process(Mesh<CoordinatesType, PolygonType> input) throws Exception
	{
		if(getProgressMonitor() != null) getProgressMonitor().beginTask("Sampling using " + getCoordinatesSamplingShapes().size() + " sampling shapes. ", input.getPoints().size());	
		
		Mesh<CoordinatesType, PolygonType> sampledMesh = createMesh();
		
		// First goes through the list of points and finds the ones that fall 
		// inside the sample and that should be kept.
		List<CoordinatesType> pointsKept = new ArrayList<CoordinatesType>();
		for(CoordinatesType point : input.getPoints())
		{
			if(isPointInside(point))
			{
				pointsKept.add(point);								
			}
		}
		
		System.out.println("Points Kept : ");
		for(int i = 0; i < pointsKept.size(); i++)
		{
			System.out.println("\t" + pointsKept.get(i));
		}
		
		// Second, goes through the list of point being kept and check
		// each of the polygon they belong to should be kept. 
		List<PolygonType> polygonsKept = new ArrayList<PolygonType>();		
		for(CoordinatesType point : pointsKept)
		{
			List<PolygonType> polygonsSharingPoint = input.getPolygonsSharingPoint(point);
			for(PolygonType polygon : polygonsSharingPoint)
			{								
				// If the polygon has not yet been found to be kept.
				if(!polygonsKept.contains(polygon))
				{
					List<CoordinatesType> vertices = polygon.getVertices();
					
					if(getPolygonSamplingMode() == PolygonSamplingMode.AT_LEAST_ONE_VERTEX)
					{
						polygonsKept.add(polygon);						
					}
					else if(getPolygonSamplingMode() == PolygonSamplingMode.ALL_VERTEX)
					{					
						if(pointsKept.containsAll(vertices))
						{
							polygonsKept.add(polygon);
						}
					}
				}
			}
		}
								
		// Populate the sampled mesh with copies of the points kept.
		Map<CoordinatesType, CoordinatesType> originalToNewPointMap = new HashMap<CoordinatesType, CoordinatesType>();		
		for(CoordinatesType point : pointsKept)
		{
			// Adds an entry in the original->new point map.
			originalToNewPointMap.put(point, copyCoordinates(point));
		}
		sampledMesh.getPoints().addAll(originalToNewPointMap.values());		
		
		// Populate the sampled mesh with copies of the polygons kept.
		List<PolygonType> polygonCopies = new ArrayList<PolygonType>();
		for(PolygonType polygon : polygonsKept)
		{
			// Creates a new polygon.
			PolygonType newPolygon = createPolygon();
			
			// Gets the list of vertices from the original polygon.
			for(CoordinatesType originalpoint : polygon.getVertices())
			{
				CoordinatesType newPoint = originalToNewPointMap.get(originalpoint);
				if(newPoint == null)				
				{
					// Point need to be created and added to Map.
					newPoint = copyCoordinates(originalpoint);
					originalToNewPointMap.put(originalpoint, newPoint);
					
					// Adds the new point to the mesh
					sampledMesh.getPoints().add(newPoint);
				}
				newPolygon.getVertices().add(newPoint);				
			}
			
			polygonCopies.add(newPolygon);
		}
		sampledMesh.getPolygons().addAll(polygonCopies);
		
		System.out.println("sampledMesh Points : ");
		for(int i = 0; i < sampledMesh.getPoints().size(); i++)
		{
			System.out.println("\t" + sampledMesh.getPoints().get(i));
		}
		
		if(getProgressMonitor() != null) getProgressMonitor().done();
		
		return sampledMesh;
	}
	
	/**
	 * Return whether or not a point is inside at least one sampling shape
	 * @param point The point.
	 * @return True if the point is inside, false otherwise.
	 */
	private boolean isPointInside(CoordinatesType point)
	{
		boolean inside = false;

		if(getShapeSamplingMode() == ShapeSamplingMode.UNION)
		{
			inside = false;
			int j = 0;
			
			while (j < getCoordinatesSamplingShapes().size() && !inside)
			{
				CoordinatesSamplingShape<CoordinatesType> samplingShape = getCoordinatesSamplingShapes().get(j);
				inside |= samplingShape.isInside(point);											
				j++;
			}							
		}
		else if(getShapeSamplingMode() == ShapeSamplingMode.INTERSECTION)
		{
			inside = true;
			int j = 0;
			
			while (j < getCoordinatesSamplingShapes().size() && inside)
			{
				CoordinatesSamplingShape<CoordinatesType> samplingShape = getCoordinatesSamplingShapes().get(j);
				inside &= samplingShape.isInside(point);																						
				j++;
			}	
		}
			
		return inside;
	}
} //MeshCoordinatesShapesSamplerImpl
