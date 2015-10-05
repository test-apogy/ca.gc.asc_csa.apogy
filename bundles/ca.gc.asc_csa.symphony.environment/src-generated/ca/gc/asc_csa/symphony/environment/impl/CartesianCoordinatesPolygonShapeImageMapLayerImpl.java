/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.impl;

import ca.gc.asc_csa.symphony.environment.CartesianCoordinatesPolygonShapeImageMapLayer;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Coordinates Polygon Shape Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.CartesianCoordinatesPolygonShapeImageMapLayerImpl#getPolygonVertices <em>Polygon Vertices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CartesianCoordinatesPolygonShapeImageMapLayerImpl extends PolygonShapeImageMapLayerImpl implements CartesianCoordinatesPolygonShapeImageMapLayer {
	/**
	 * The cached value of the '{@link #getPolygonVertices() <em>Polygon Vertices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonVertices()
	 * @generated
	 * @ordered
	 */
	protected EList<Tuple3d> polygonVertices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianCoordinatesPolygonShapeImageMapLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEnvironmentPackage.Literals.CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tuple3d> getPolygonVertices() {
		if (polygonVertices == null) {
			polygonVertices = new EObjectContainmentEList<Tuple3d>(Tuple3d.class, this, SymphonyEnvironmentPackage.CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES);
		}
		return polygonVertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyEnvironmentPackage.CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES:
				return ((InternalEList<?>)getPolygonVertices()).basicRemove(otherEnd, msgs);
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
			case SymphonyEnvironmentPackage.CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES:
				return getPolygonVertices();
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
			case SymphonyEnvironmentPackage.CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES:
				getPolygonVertices().clear();
				getPolygonVertices().addAll((Collection<? extends Tuple3d>)newValue);
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
			case SymphonyEnvironmentPackage.CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES:
				getPolygonVertices().clear();
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
			case SymphonyEnvironmentPackage.CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES:
				return polygonVertices != null && !polygonVertices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public List<Tuple3d> getVertices() 
	{
		return getPolygonVertices();
	}
} //CartesianCoordinatesPolygonShapeImageMapLayerImpl
