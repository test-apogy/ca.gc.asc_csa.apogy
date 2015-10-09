/**
 * <copyright>
 * </copyright>
 *
 * $Id: URLNodeImpl.java,v 1.7.2.3 2015/02/03 20:01:30 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.topology.TopologyPackage;
import org.eclipse.symphony.common.topology.URLNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URL Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.impl.URLNodeImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.impl.URLNodeImpl#getPolygonCount <em>Polygon Count</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.impl.URLNodeImpl#getVertexCount <em>Vertex Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class URLNodeImpl extends LeafImpl implements URLNode {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolygonCount() <em>Polygon Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonCount()
	 * @generated
	 * @ordered
	 */
	protected static final int POLYGON_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPolygonCount() <em>Polygon Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonCount()
	 * @generated
	 * @ordered
	 */
	protected int polygonCount = POLYGON_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVertexCount() <em>Vertex Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertexCount()
	 * @generated
	 * @ordered
	 */
	protected static final int VERTEX_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVertexCount() <em>Vertex Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertexCount()
	 * @generated
	 * @ordered
	 */
	protected int vertexCount = VERTEX_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URLNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyPackage.Literals.URL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.URL_NODE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPolygonCount() {
		return polygonCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolygonCount(int newPolygonCount) {
		int oldPolygonCount = polygonCount;
		polygonCount = newPolygonCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.URL_NODE__POLYGON_COUNT, oldPolygonCount, polygonCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVertexCount() {
		return vertexCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertexCount(int newVertexCount) {
		int oldVertexCount = vertexCount;
		vertexCount = newVertexCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.URL_NODE__VERTEX_COUNT, oldVertexCount, vertexCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TopologyPackage.URL_NODE__URL:
				return getUrl();
			case TopologyPackage.URL_NODE__POLYGON_COUNT:
				return getPolygonCount();
			case TopologyPackage.URL_NODE__VERTEX_COUNT:
				return getVertexCount();
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
			case TopologyPackage.URL_NODE__URL:
				setUrl((String)newValue);
				return;
			case TopologyPackage.URL_NODE__POLYGON_COUNT:
				setPolygonCount((Integer)newValue);
				return;
			case TopologyPackage.URL_NODE__VERTEX_COUNT:
				setVertexCount((Integer)newValue);
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
			case TopologyPackage.URL_NODE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case TopologyPackage.URL_NODE__POLYGON_COUNT:
				setPolygonCount(POLYGON_COUNT_EDEFAULT);
				return;
			case TopologyPackage.URL_NODE__VERTEX_COUNT:
				setVertexCount(VERTEX_COUNT_EDEFAULT);
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
			case TopologyPackage.URL_NODE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case TopologyPackage.URL_NODE__POLYGON_COUNT:
				return polygonCount != POLYGON_COUNT_EDEFAULT;
			case TopologyPackage.URL_NODE__VERTEX_COUNT:
				return vertexCount != VERTEX_COUNT_EDEFAULT;
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
		result.append(" (url: ");
		result.append(url);
		result.append(", polygonCount: ");
		result.append(polygonCount);
		result.append(", vertexCount: ");
		result.append(vertexCount);
		result.append(')');
		return result.toString();
	}

} //URLNodeImpl
