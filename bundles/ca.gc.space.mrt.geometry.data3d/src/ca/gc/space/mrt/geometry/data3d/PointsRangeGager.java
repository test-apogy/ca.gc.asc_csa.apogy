/**
 * Canadian Space Agency 2008.
 *
 * $Id: PointsRangeGager.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d;

import ca.gc.space.mrt.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Points Range Gager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.PointsRangeGager#getMinX <em>Min X</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.PointsRangeGager#getMaxX <em>Max X</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.PointsRangeGager#getMinY <em>Min Y</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.PointsRangeGager#getMaxY <em>Max Y</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.PointsRangeGager#getMinZ <em>Min Z</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.PointsRangeGager#getMaxZ <em>Max Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getPointsRangeGager()
 * @model
 * @generated
 */
public interface PointsRangeGager extends Processor<CartesianCoordinatesSet, CartesianCoordinatesSet> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * Returns the value of the '<em><b>Min X</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min X</em>' attribute.
	 * @see #setMinX(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getPointsRangeGager_MinX()
	 * @model default="-1"
	 * @generated
	 */
	double getMinX();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.PointsRangeGager#getMinX <em>Min X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min X</em>' attribute.
	 * @see #getMinX()
	 * @generated
	 */
	void setMinX(double value);

	/**
	 * Returns the value of the '<em><b>Max X</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max X</em>' attribute.
	 * @see #setMaxX(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getPointsRangeGager_MaxX()
	 * @model default="1"
	 * @generated
	 */
	double getMaxX();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.PointsRangeGager#getMaxX <em>Max X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max X</em>' attribute.
	 * @see #getMaxX()
	 * @generated
	 */
	void setMaxX(double value);

	/**
	 * Returns the value of the '<em><b>Min Y</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Y</em>' attribute.
	 * @see #setMinY(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getPointsRangeGager_MinY()
	 * @model default="-1"
	 * @generated
	 */
	double getMinY();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.PointsRangeGager#getMinY <em>Min Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Y</em>' attribute.
	 * @see #getMinY()
	 * @generated
	 */
	void setMinY(double value);

	/**
	 * Returns the value of the '<em><b>Max Y</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Y</em>' attribute.
	 * @see #setMaxY(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getPointsRangeGager_MaxY()
	 * @model default="1"
	 * @generated
	 */
	double getMaxY();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.PointsRangeGager#getMaxY <em>Max Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Y</em>' attribute.
	 * @see #getMaxY()
	 * @generated
	 */
	void setMaxY(double value);

	/**
	 * Returns the value of the '<em><b>Min Z</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Z</em>' attribute.
	 * @see #setMinZ(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getPointsRangeGager_MinZ()
	 * @model default="-1"
	 * @generated
	 */
	double getMinZ();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.PointsRangeGager#getMinZ <em>Min Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Z</em>' attribute.
	 * @see #getMinZ()
	 * @generated
	 */
	void setMinZ(double value);

	/**
	 * Returns the value of the '<em><b>Max Z</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Z</em>' attribute.
	 * @see #setMaxZ(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getPointsRangeGager_MaxZ()
	 * @model default="1"
	 * @generated
	 */
	double getMaxZ();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.PointsRangeGager#getMaxZ <em>Max Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Z</em>' attribute.
	 * @see #getMaxZ()
	 * @generated
	 */
	void setMaxZ(double value);

} // PointsRangeGager
