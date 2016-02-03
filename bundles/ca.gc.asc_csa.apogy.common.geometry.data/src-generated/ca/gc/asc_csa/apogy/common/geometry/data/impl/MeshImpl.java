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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.common.geometry.data.Coordinates;
import ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage;
import ca.gc.asc_csa.apogy.common.geometry.data.Mesh;
import ca.gc.asc_csa.apogy.common.geometry.data.Polygon;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Mesh</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshImpl#getPolygons <em>Polygons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeshImpl<CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>>
		extends CoordinatesSetImpl<CoordinatesType> implements
		Mesh<CoordinatesType, PolygonType> {
	/**
	 * The map of the point and the polygons.
	 */
	private Map<CoordinatesType, List<PolygonType>> pointToPolygonsMap;

	/**
	 * The cached value of the '{@link #getPolygons() <em>Polygons</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPolygons()
	 * @generated
	 * @ordered
	 */
	protected EList<PolygonType> polygons;

	private Adapter adapter;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected MeshImpl() {
		super();

		// We add an adapter to this list. This is used to maintain the
		// point->polygons
		// map up to date.
		// Finally, we a ourselves as a listener of this point cloud.
		this.eAdapters().add(getAdapter());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryDataPackage.Literals.MESH;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@SuppressWarnings("serial")
	public EList<PolygonType> getPolygons() {
		if (polygons == null) {
			polygons = new EObjectContainmentEList<PolygonType>(Polygon.class,
					this, ApogyCommonGeometryDataPackage.MESH__POLYGONS) {
				@Override
				protected boolean isUnique() {
					return false;
				}
			};
		}
		return polygons;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<PolygonType> getPolygonNeighbours(PolygonType polygon) {
		EList<PolygonType> neighbours = new UniqueEList<PolygonType>();

		// For each of the point contained on this polygon, we add the vertex.
		for (CoordinatesType triangleVertex : polygon.getVertices()) {
			// We get the polygons.
			List<PolygonType> polygons = getPointToPolygonsMap().get(
					triangleVertex);
			for (PolygonType currentPolygon : polygons) {
				if (currentPolygon != polygon) {
					neighbours.add(currentPolygon);
				}
			}
		}

		return neighbours;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<CoordinatesType> getPointNeighbours(CoordinatesType point) {
		// We get all the polygons that contain this point.
		List<PolygonType> polygons = getPointToPolygonsMap().get(point);

		// For each of these polygon, we get their points.
		UniqueEList<CoordinatesType> points = new UniqueEList<CoordinatesType>();

		for (PolygonType polygon : polygons) {
			// We add each of the vertex contained in this polygon, if
			// the vertex is on equal to 'point'.
			for (CoordinatesType tPoint : polygon.getVertices()) {
				if (tPoint != point) {
					points.add(tPoint);
				}
			}
		}

		return points;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<PolygonType> getPolygonsSharingPoint(CoordinatesType point) {
		UniqueEList<PolygonType> polygons = new UniqueEList<PolygonType>();

		List<PolygonType> list = this.getPointToPolygonsMap().get(point);
		if (list != null) {
			polygons.addAll(list);
		}
		return polygons;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonGeometryDataPackage.MESH__POLYGONS:
				return ((InternalEList<?>)getPolygons()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonGeometryDataPackage.MESH__POLYGONS:
				return getPolygons();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCommonGeometryDataPackage.MESH__POLYGONS:
				getPolygons().clear();
				getPolygons().addAll((Collection<? extends PolygonType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCommonGeometryDataPackage.MESH__POLYGONS:
				getPolygons().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCommonGeometryDataPackage.MESH__POLYGONS:
				return polygons != null && !polygons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  @SuppressWarnings("unchecked")
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case ApogyCommonGeometryDataPackage.MESH___GET_POLYGON_NEIGHBOURS__POLYGON:
				return getPolygonNeighbours((PolygonType)arguments.get(0));
			case ApogyCommonGeometryDataPackage.MESH___GET_POINT_NEIGHBOURS__COORDINATES:
				return getPointNeighbours((CoordinatesType)arguments.get(0));
			case ApogyCommonGeometryDataPackage.MESH___GET_POLYGONS_SHARING_POINT__COORDINATES:
				return getPolygonsSharingPoint((CoordinatesType)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

  private void polygonAdded(PolygonType polygon) {

		// We add the vertices.
		for (CoordinatesType point : polygon.getVertices()) {
			List<PolygonType> polygons = null;
			// Checks if an entry has not yet been created in the map for the
			// point.
			if (!getPointToPolygonsMap().containsKey(point)) {

				polygons = new LinkedList<PolygonType>();

				getPointToPolygonsMap().put(point, polygons);
			} else {
				polygons = getPointToPolygonsMap().get(point);
			}

			// We add a reference to this triangle.
			polygons.add(polygon);
		}
	}

	private void polygonRemoved(PolygonType polygon) {
		// Updates the point->polygons map.
		int numberOfVertices = polygon.getVertices().size();
		for (int i = 0; i < numberOfVertices; i++) {
			List<PolygonType> polygons = getPointToPolygonsMap().get(
					polygon.getVertices().get(i));
			polygons.remove(polygon);
		}
	}

	private void pointRemoved(CoordinatesType point) {
		// Removes the affected polygons from the list.
		List<PolygonType> polygonsAffected = getPointToPolygonsMap().get(point);
		for (PolygonType polygon : polygonsAffected) {
			getPolygons().remove(polygon);
		}

		// Updates the point->polygons map.
		getPointToPolygonsMap().remove(point);
	}

	/**
	 * Return the map that maps point to polygons.
	 * 
	 * @return The map.
	 */
	protected Map<CoordinatesType, List<PolygonType>> getPointToPolygonsMap() {

		if (pointToPolygonsMap == null) {
			pointToPolygonsMap = new WeakHashMap<CoordinatesType, List<PolygonType>>();

			// We build the map.
			for (PolygonType polygon : getPolygons()) {
				polygonAdded(polygon);
			}

		}

		return pointToPolygonsMap;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		boolean equals = false;

		if (obj instanceof Mesh) {
			Mesh<CoordinatesType, PolygonType> mesh = (Mesh<CoordinatesType, PolygonType>) obj;
			equals = (mesh.getPolygons().size() == this.getPolygons().size());

			if (equals) {
				// We verify that every polygon are the same.
				for (int i = 0; i < mesh.getPolygons().size() && equals; i++) {
					PolygonType pSource = mesh.getPolygons().get(i);
					PolygonType pTarget = this.getPolygons().get(i);

					// Check to ensure the number of vertices are the same.
					equals = (pSource.getVertices().size() == pTarget
							.getVertices().size());

					// Check to make sure all the vertices are the same.
					if (equals) {
						int j = 0;
						while ((j < pSource.getVertices().size()) && (equals)) {
							equals = pSource.getVertices().get(j)
									.equals(pTarget.getVertices().get(j));
							j++;
						}
					}
				}
			}
		}

		return equals;
	}

	private Adapter getAdapter() {
		if (adapter == null) {
			adapter = new Adapter() {

				@Override
				public Notifier getTarget() {
					return null;
				}

				@Override
				public boolean isAdapterForType(Object type) {
					return false;
				}

				@SuppressWarnings("unchecked")
				@Override
				public void notifyChanged(Notification notification) {
					if (notification.getFeatureID(Mesh.class) == ApogyCommonGeometryDataPackage.MESH__POLYGONS) {
						if (notification.getEventType() == Notification.ADD
								|| notification.getEventType() == Notification.ADD_MANY) {
							// if (notification.getNewValue() != null) {
							// if (notification.getNewValue() instanceof List) {
							// List<PolygonType> polygons = (List<PolygonType>)
							// notification
							// .getNewValue();
							// for (PolygonType polygon : polygons) {
							// polygonAdded(polygon);
							// }
							// } else {
							// PolygonType polygon = (PolygonType) notification
							// .getNewValue();
							// polygonAdded(polygon);
							// }
							// }
							// We clear the map.
							pointToPolygonsMap = null;
						} else if (notification.getEventType() == Notification.REMOVE || notification.getEventType() == Notification.REMOVE_MANY) 
						{
							if (notification.getOldValue() != null) 
							{
								if (notification.getNewValue() instanceof List) 
								{
									List<PolygonType> polygons = (List<PolygonType>) notification
											.getOldValue();
									for (PolygonType polygon : polygons) {
										polygonRemoved(polygon);
									}
								} 
								else if(notification.getOldValue() instanceof Polygon) 
								{
									PolygonType polygon = (PolygonType) notification.getOldValue();
									polygonRemoved(polygon);
								}
							}
						}
					}

					if (notification.getFeatureID(Mesh.class) == ApogyCommonGeometryDataPackage.MESH__POINTS) {
						if (notification.getEventType() == Notification.REMOVE
								|| notification.getEventType() == Notification.REMOVE_MANY) {
							if (notification.getNewValue() != null) {
								if (notification.getNewValue() instanceof List) {
									List<CoordinatesType> pointsRemoved = (List<CoordinatesType>) notification
											.getNewValue();
									for (CoordinatesType point : pointsRemoved) {
										pointRemoved(point);
									}
								}
							}
						}
					}
				}

				@Override
				public void setTarget(Notifier newTarget) {
				}
			};
		}
		return adapter;
	}

	@Override
	protected void finalize() throws Throwable {

		if (adapter != null) {
			eAdapters().remove(adapter);
		}

		super.finalize();
	}

} // MeshImpl
