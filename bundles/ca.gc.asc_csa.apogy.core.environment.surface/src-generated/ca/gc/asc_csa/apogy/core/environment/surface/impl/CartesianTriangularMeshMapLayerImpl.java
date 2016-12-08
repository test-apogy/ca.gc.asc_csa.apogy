/**
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
package ca.gc.asc_csa.apogy.core.environment.surface.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.surface.MapLayerPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Triangular Mesh Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshMapLayerImpl#isMeshIsDirty <em>Mesh Is Dirty</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshMapLayerImpl#getMapLayerPresentations <em>Map Layer Presentations</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshMapLayerImpl#getTextureImage <em>Texture Image</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshMapLayerImpl#getCartesianTriangularMeshMapLayerNode <em>Cartesian Triangular Mesh Map Layer Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CartesianTriangularMeshMapLayerImpl extends AbstractMapLayerImpl implements CartesianTriangularMeshMapLayer {
	/**
	 * The default value of the '{@link #isMeshIsDirty() <em>Mesh Is Dirty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMeshIsDirty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MESH_IS_DIRTY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMeshIsDirty() <em>Mesh Is Dirty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMeshIsDirty()
	 * @generated
	 * @ordered
	 */
	protected boolean meshIsDirty = MESH_IS_DIRTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMapLayerPresentations() <em>Map Layer Presentations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapLayerPresentations()
	 * @generated
	 * @ordered
	 */
	protected EList<MapLayerPresentation> mapLayerPresentations;

	/**
	 * The cached value of the '{@link #getTextureImage() <em>Texture Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureImage()
	 * @generated
	 * @ordered
	 */
	protected AbstractEImage textureImage;

	/**
	 * The cached value of the '{@link #getCartesianTriangularMeshMapLayerNode() <em>Cartesian Triangular Mesh Map Layer Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartesianTriangularMeshMapLayerNode()
	 * @generated
	 * @ordered
	 */
	protected CartesianTriangularMeshMapLayerNode cartesianTriangularMeshMapLayerNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianTriangularMeshMapLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMeshIsDirty() {
		return meshIsDirty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeshIsDirty(boolean newMeshIsDirty) {
		boolean oldMeshIsDirty = meshIsDirty;
		meshIsDirty = newMeshIsDirty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY, oldMeshIsDirty, meshIsDirty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MapLayerPresentation> getMapLayerPresentations() {
		if (mapLayerPresentations == null) {
			mapLayerPresentations = new EObjectContainmentEList<MapLayerPresentation>(MapLayerPresentation.class, this, ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS);
		}
		return mapLayerPresentations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEImage getTextureImage() {
		if (textureImage != null && textureImage.eIsProxy()) {
			InternalEObject oldTextureImage = (InternalEObject)textureImage;
			textureImage = (AbstractEImage)eResolveProxy(oldTextureImage);
			if (textureImage != oldTextureImage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE, oldTextureImage, textureImage));
			}
		}
		return textureImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEImage basicGetTextureImage() {
		return textureImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureImage(AbstractEImage newTextureImage) {
		AbstractEImage oldTextureImage = textureImage;
		textureImage = newTextureImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE, oldTextureImage, textureImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshMapLayerNode getCartesianTriangularMeshMapLayerNode() {
		if (cartesianTriangularMeshMapLayerNode != null && cartesianTriangularMeshMapLayerNode.eIsProxy()) {
			InternalEObject oldCartesianTriangularMeshMapLayerNode = (InternalEObject)cartesianTriangularMeshMapLayerNode;
			cartesianTriangularMeshMapLayerNode = (CartesianTriangularMeshMapLayerNode)eResolveProxy(oldCartesianTriangularMeshMapLayerNode);
			if (cartesianTriangularMeshMapLayerNode != oldCartesianTriangularMeshMapLayerNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE, oldCartesianTriangularMeshMapLayerNode, cartesianTriangularMeshMapLayerNode));
			}
		}
		return cartesianTriangularMeshMapLayerNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshMapLayerNode basicGetCartesianTriangularMeshMapLayerNode() {
		return cartesianTriangularMeshMapLayerNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCartesianTriangularMeshMapLayerNode(CartesianTriangularMeshMapLayerNode newCartesianTriangularMeshMapLayerNode) {
		CartesianTriangularMeshMapLayerNode oldCartesianTriangularMeshMapLayerNode = cartesianTriangularMeshMapLayerNode;
		cartesianTriangularMeshMapLayerNode = newCartesianTriangularMeshMapLayerNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE, oldCartesianTriangularMeshMapLayerNode, cartesianTriangularMeshMapLayerNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMesh getCurrentMesh() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void forceUpdateTextureImage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS:
				return ((InternalEList<?>)getMapLayerPresentations()).basicRemove(otherEnd, msgs);
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
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY:
				return isMeshIsDirty();
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS:
				return getMapLayerPresentations();
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE:
				if (resolve) return getTextureImage();
				return basicGetTextureImage();
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE:
				if (resolve) return getCartesianTriangularMeshMapLayerNode();
				return basicGetCartesianTriangularMeshMapLayerNode();
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
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY:
				setMeshIsDirty((Boolean)newValue);
				return;
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS:
				getMapLayerPresentations().clear();
				getMapLayerPresentations().addAll((Collection<? extends MapLayerPresentation>)newValue);
				return;
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE:
				setTextureImage((AbstractEImage)newValue);
				return;
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE:
				setCartesianTriangularMeshMapLayerNode((CartesianTriangularMeshMapLayerNode)newValue);
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
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY:
				setMeshIsDirty(MESH_IS_DIRTY_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS:
				getMapLayerPresentations().clear();
				return;
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE:
				setTextureImage((AbstractEImage)null);
				return;
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE:
				setCartesianTriangularMeshMapLayerNode((CartesianTriangularMeshMapLayerNode)null);
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
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY:
				return meshIsDirty != MESH_IS_DIRTY_EDEFAULT;
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS:
				return mapLayerPresentations != null && !mapLayerPresentations.isEmpty();
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE:
				return textureImage != null;
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE:
				return cartesianTriangularMeshMapLayerNode != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___GET_CURRENT_MESH:
				return getCurrentMesh();
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___FORCE_UPDATE_TEXTURE_IMAGE:
				forceUpdateTextureImage();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (meshIsDirty: ");
		result.append(meshIsDirty);
		result.append(')');
		return result.toString();
	}

} //CartesianTriangularMeshMapLayerImpl
