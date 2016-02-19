/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.impl;

import java.awt.Color;

import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshColorizerBySlope;
import ca.gc.asc_csa.apogy.common.geometry.data3d.RGBAColor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Triangular Mesh Colorizer By Slope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshColorizerBySlopeImpl#getNormalAxis <em>Normal Axis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CartesianTriangularMeshColorizerBySlopeImpl extends CartesianTriangularMeshColorizerImpl implements CartesianTriangularMeshColorizerBySlope {
	/**
	 * The default value of the '{@link #getNormalAxis() <em>Normal Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalAxis()
	 * @generated
	 * @ordered
	 */
	protected static final CartesianAxis NORMAL_AXIS_EDEFAULT = CartesianAxis.X;

	/**
	 * The cached value of the '{@link #getNormalAxis() <em>Normal Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalAxis()
	 * @generated
	 * @ordered
	 */
	protected CartesianAxis normalAxis = NORMAL_AXIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianTriangularMeshColorizerBySlopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianAxis getNormalAxis() {
		return normalAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalAxis(CartesianAxis newNormalAxis) {
		CartesianAxis oldNormalAxis = normalAxis;
		normalAxis = newNormalAxis == null ? NORMAL_AXIS_EDEFAULT : newNormalAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE__NORMAL_AXIS, oldNormalAxis, normalAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonGeometryData3DPackage.CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE__NORMAL_AXIS:
				return getNormalAxis();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCommonGeometryData3DPackage.CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE__NORMAL_AXIS:
				setNormalAxis((CartesianAxis)newValue);
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
			case ApogyCommonGeometryData3DPackage.CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE__NORMAL_AXIS:
				setNormalAxis(NORMAL_AXIS_EDEFAULT);
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
			case ApogyCommonGeometryData3DPackage.CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE__NORMAL_AXIS:
				return normalAxis != NORMAL_AXIS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (normalAxis: ");
		result.append(normalAxis);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public RGBAColor computeColor(CartesianTriangularMesh mesh, CartesianPositionCoordinates point) 
	{	
		// First, computes the normal at the vertex.
		Vector3d normal = Data3DUtilsImpl.getInstance().computeNormalAtVertex(mesh, point);
		
		// Normalize the normal
		normal.normalize();
				
		// Computes the angle relative to the specified AXIS.
		Vector3d axis = null;
		switch(getNormalAxis().getValue())
		{
			case CartesianAxis.X_VALUE:
				axis = new Vector3d(1, 0, 0);
			break;
			case CartesianAxis.Y_VALUE:
				axis = new Vector3d(0, 1, 0);
			break;
			case CartesianAxis.Z_VALUE:
				axis = new Vector3d(0, 0, 1);
			break;
		}		
		double angle = axis.angle(normal);
		
		// Assigns a color based on the angle value.
		double factor = angle / Math.PI;
		if(factor < 0) factor = 0;
		if(factor > 1) factor = 1;
	  
	    float hue = (float)(0.666 - (factor * 0.666));	    
	    Color color = Color.getHSBColor(hue, 0.9f, 0.9f);    	    	    
				
		return ApogyCommonGeometryData3DFacade.INSTANCE.createRGBAColor((byte) color.getAlpha(), (byte) color.getRed(), (byte) color.getGreen(), (byte) color.getBlue());
	}		
} //CartesianTriangularMeshColorizerBySlopeImpl
