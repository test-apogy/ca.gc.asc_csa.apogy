package ca.gc.asc_csa.apogy.common.geometry.data.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

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
import ca.gc.asc_csa.apogy.common.geometry.data.Coordinates;
import ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage;
import ca.gc.asc_csa.apogy.common.geometry.data.Mesh;
import ca.gc.asc_csa.apogy.common.geometry.data.MeshPolygonShapesSampler;
import ca.gc.asc_csa.apogy.common.geometry.data.Polygon;
import ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingShape;
import ca.gc.asc_csa.apogy.common.geometry.data.ShapeSamplingMode;
import ca.gc.asc_csa.apogy.common.processors.impl.ProcessorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mesh Polygon Shapes Sampler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshPolygonShapesSamplerImpl#getPolygonSamplingShapes <em>Polygon Sampling Shapes</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshPolygonShapesSamplerImpl#getShapeSamplingMode <em>Shape Sampling Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MeshPolygonShapesSamplerImpl<CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> extends ProcessorImpl<Mesh<CoordinatesType, PolygonType>, Mesh<CoordinatesType, PolygonType>> implements MeshPolygonShapesSampler<CoordinatesType, PolygonType>
{
	/**
	 * The cached value of the '{@link #getPolygonSamplingShapes() <em>Polygon Sampling Shapes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonSamplingShapes()
	 * @generated
	 * @ordered
	 */
	protected EList<PolygonSamplingShape<CoordinatesType, PolygonType>> polygonSamplingShapes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeshPolygonShapesSamplerImpl()
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
		return ApogyCommonGeometryDataPackage.Literals.MESH_POLYGON_SHAPES_SAMPLER;
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
	public EList<PolygonSamplingShape<CoordinatesType, PolygonType>> getPolygonSamplingShapes()
	{
		if (polygonSamplingShapes == null) {
			polygonSamplingShapes = new EObjectResolvingEList<PolygonSamplingShape<CoordinatesType, PolygonType>>(PolygonSamplingShape.class, this, ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__POLYGON_SAMPLING_SHAPES);
		}
		return polygonSamplingShapes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE, oldShapeSamplingMode, shapeSamplingMode));
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
			case ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__POLYGON_SAMPLING_SHAPES:
				return getPolygonSamplingShapes();
			case ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE:
				return getShapeSamplingMode();
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
			case ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__POLYGON_SAMPLING_SHAPES:
				getPolygonSamplingShapes().clear();
				getPolygonSamplingShapes().addAll((Collection<? extends PolygonSamplingShape<CoordinatesType, PolygonType>>)newValue);
				return;
			case ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE:
				setShapeSamplingMode((ShapeSamplingMode)newValue);
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
			case ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__POLYGON_SAMPLING_SHAPES:
				getPolygonSamplingShapes().clear();
				return;
			case ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE:
				setShapeSamplingMode(SHAPE_SAMPLING_MODE_EDEFAULT);
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
			case ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__POLYGON_SAMPLING_SHAPES:
				return polygonSamplingShapes != null && !polygonSamplingShapes.isEmpty();
			case ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE:
				return shapeSamplingMode != SHAPE_SAMPLING_MODE_EDEFAULT;
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
		if(getProgressMonitor() != null) getProgressMonitor().beginTask("Sampling using " + getPolygonSamplingShapes().size() + " sampling shapes. ", input.getPoints().size());	

		Mesh<CoordinatesType, PolygonType> sampledMesh = createMesh();
		
		// Goes through the list of polygons of the original mesh to see which one are to be kept.
		List<PolygonType> polygonsKept = new ArrayList<PolygonType>();
		for(PolygonType polygon : input.getPolygons())
		{
			if(isPolygonInside(polygon))
			{
				polygonsKept.add(polygon);
			}
		}		
		
		// Populate the sampled mesh with copies of the vertices of the polygons kept.
		Map<CoordinatesType, CoordinatesType> originalToNewPointMap = new HashMap<CoordinatesType, CoordinatesType>();		
		for(PolygonType polygon : polygonsKept)
		{
			for(CoordinatesType point : polygon.getVertices())
			{
				if(originalToNewPointMap.get(point) == null)
				{					
					originalToNewPointMap.put(point, copyCoordinates(point));
				}
			}			
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
				newPolygon.getVertices().add(originalToNewPointMap.get(originalpoint));
			}
			
			polygonCopies.add(newPolygon);
		}
		sampledMesh.getPolygons().addAll(polygonCopies);
		
		if(getProgressMonitor() != null) getProgressMonitor().done();
		
		return sampledMesh;
	}
	
	/**
	 * Returns whether the specified polygon is inside based on the PolygonSamplingShapes and the ShapeSamplingMode.
	 * @param polygon The polygon.
	 * @return True if the polygon is inside, false otherwise.
	 */
	private boolean isPolygonInside(PolygonType polygon)
	{
		boolean inside = false;
		
		if(getShapeSamplingMode() == ShapeSamplingMode.UNION)
		{
			inside = false;
			int j = 0;
			
			while (j < getPolygonSamplingShapes().size() && !inside)
			{
				PolygonSamplingShape<CoordinatesType,PolygonType> samplingShape = getPolygonSamplingShapes().get(j);
				inside |= samplingShape.isPolygonInside(polygon);									
				j++;
			}							
		}
		else if(getShapeSamplingMode() == ShapeSamplingMode.INTERSECTION)
		{
			inside = true;
			int j = 0;
			
			while (j < getPolygonSamplingShapes().size() && inside)
			{
				PolygonSamplingShape<CoordinatesType,PolygonType> samplingShape = getPolygonSamplingShapes().get(j);
				inside &= samplingShape.isPolygonInside(polygon);																						
				j++;
			}	
		}
		
		return inside;
	}
	
} //MeshPolygonShapesSamplerImpl
