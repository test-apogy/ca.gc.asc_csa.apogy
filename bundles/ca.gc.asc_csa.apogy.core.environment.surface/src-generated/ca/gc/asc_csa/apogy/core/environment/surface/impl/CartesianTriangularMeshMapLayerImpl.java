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

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesFactory;
import ca.gc.asc_csa.apogy.common.images.EImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.surface.Activator;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.MapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion;

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
public class CartesianTriangularMeshMapLayerImpl extends AbstractMapLayerImpl implements CartesianTriangularMeshMapLayer 
{
	protected boolean verbose = true;	
	protected CartesianTriangularMesh emptyMesh = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianTriangularMesh();
	protected boolean textureImageIsDirty = true;
	private EContentAdapter meshTextureAdapter = null;

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
	 * @generated_NOT
	 */
	protected CartesianTriangularMeshMapLayerImpl() 
	{
		super();
		
		this.eAdapters().add(getMeshTextureAdapter());
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
	 * @generated_NOT
	 */
	public AbstractEImage getTextureImage()
	{
		System.err.println("CartesianTriangularMeshMapLayerImpl.getTextureImage() " + textureImageIsDirty);
				
		if(textureImageIsDirty)
		{	
			textureImageIsDirty = false;
			AbstractEImage img = createMeshTextureImage();
			
			try
			{		
				EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(this);
				if(domain instanceof TransactionalEditingDomain)
				{
					domain.getCommandStack().execute(new RecordingCommand((TransactionalEditingDomain)domain) {
						@Override
						protected void doExecute() 
						{							
							setTextureImage(img);
						}
					});										
				}							
			}
			catch(Throwable t)
			{				
				t.printStackTrace();
			}						
		}				
		
		return getTextureImageGen();
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEImage getTextureImageGen() {
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

	@Override
	public AbstractMapLayerNode getAbstractMapLayerNode() 
	{	
		return getCartesianTriangularMeshMapLayerNode();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianTriangularMeshMapLayerNode getCartesianTriangularMeshMapLayerNode() 
	{
		CartesianTriangularMeshMapLayerNode node = getCartesianTriangularMeshMapLayerNodeGen();
		
		if(node == null)
		{
			node = ApogySurfaceEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshMapLayerNode();
			node.setAbstractMapLayer(this);			
			setCartesianTriangularMeshMapLayerNode(node);
		}
		
		return node;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshMapLayerNode getCartesianTriangularMeshMapLayerNodeGen() {
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
	 * @generated_NOT
	 */
	public void forceUpdateTextureImage() 
	{
		AbstractEImage img = createMeshTextureImage();		
		setTextureImage(img);
		textureImageIsDirty = false;	
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

	protected List<ImageMapLayerPresentation> getImageMapLayerPresentation()
	{
		List<ImageMapLayerPresentation> list = new ArrayList<ImageMapLayerPresentation>();
		
		for(MapLayerPresentation mapLayerPresentation : getMapLayerPresentations())		
		{
			if(mapLayerPresentation instanceof ImageMapLayerPresentation)
			{
				list.add((ImageMapLayerPresentation) mapLayerPresentation);
			}
		}
		
		return list;
	}
		
	protected AbstractEImage createMeshTextureImage()
	{		
		Logger.INSTANCE.log(Activator.ID, this, getName() + " : Updating Texture Image starts.", EventSeverity.INFO);
		
		// First, finds the mesh extent in its own frame.		
		RectangularRegion meshRegion = ApogySurfaceEnvironmentFacade.INSTANCE.getRectangularVolumeRegion(getCurrentMesh());
		
		// Finds the mesh extent transform relative to the worksite origin.		
		Matrix4d meshTransformMatrix = new Matrix4d();
		meshTransformMatrix.setIdentity();		
		if(getMap().getTransformation() != null) 
		{
			meshTransformMatrix.mul(getMap().getTransformation().asMatrix4d());
		}
		
		// Do a first pass through the ImageMapLayerPresentation to select the ones that are visible and that intersects and
		// find the best resolution image, in meters/pixel. The smallest, the better.
				
		double bestResolution = 10000;
		java.util.Map<ImageMapLayerPresentation, Matrix4d> layerPresentationToTransformMap = new HashMap<ImageMapLayerPresentation, Matrix4d>();
		List<ImageMapLayerPresentation> imageMapLayerPresentationsToProcess = new ArrayList<ImageMapLayerPresentation>();		
		List<ImageMapLayerPresentation> imageMapLayerPresentationList = getImageMapLayerPresentation();		
				
		for(ImageMapLayerPresentation imageMapLayerPresentation : imageMapLayerPresentationList)
		{
			// If the layer is visible.
			if(imageMapLayerPresentation.isVisible() && imageMapLayerPresentation.getRegionImage() != null)
			{								
				// Finds the layer transform relative to the mesh origin.	
				if(verbose)
				{
					System.out.println("Mesh Transform   : " + meshTransformMatrix);
					System.out.println("Region Transform : " + imageMapLayerPresentation.getRegion().getTransformation().asMatrix4d());
				}
				
				Matrix4d imageToMeshTransform = new Matrix4d(meshTransformMatrix);												
				imageToMeshTransform.invert();				
				imageToMeshTransform.mul(imageMapLayerPresentation.getRegion().getTransformation().asMatrix4d());
												
				// If the regions intersect the mesh.
				if(ApogySurfaceEnvironmentFacade.INSTANCE.intersects(meshRegion, imageMapLayerPresentation.getRegion(), ApogyCommonMathFacade.INSTANCE.createMatrix4x4(imageToMeshTransform)))
				{
					// Check to see if it has a better resolution as what we currently have.
					if(imageMapLayerPresentation.getResolution() < bestResolution) bestResolution = imageMapLayerPresentation.getResolution();
					
					// Adds the layer to the list of the ones we will process.
					imageMapLayerPresentationsToProcess.add(imageMapLayerPresentation);
					
					// Saves the corresponding parameters (to save some processing latter).
					layerPresentationToTransformMap.put(imageMapLayerPresentation, imageToMeshTransform);
				}
			}
		}
		
		if(verbose)
		{
			System.out.println("Layer To Processs : " + imageMapLayerPresentationsToProcess.size());
			System.out.println("Best Resolution   : " + bestResolution + " m/pixel");
		}
		
		// Computes the mesh texture image size.
		int meshImageWidth = (int) Math.round(meshRegion.getXDimension() / bestResolution);
		int meshImageHeight = (int) Math.round(meshRegion.getYDimension() / bestResolution);;
		

		if(verbose)
		{		
			System.out.println("meshImageWidth : " + meshImageWidth);
			System.out.println("meshImageHeight : " + meshImageHeight);
		}
		
		if(meshImageHeight > 0 && meshImageWidth > 0)
		{		
			// Creates a transparent image as the base image for the mesh texture.
			AbstractEImage meshTextureImage = EImagesUtilities.INSTANCE.createTransparentImage(meshImageWidth, meshImageHeight);
					
			// Process all the applicable ImageMapLayerPresentation
			for(ImageMapLayerPresentation imageMapLayerPresentation : imageMapLayerPresentationsToProcess)
			{
				
				if(verbose) System.out.println("ImageMapLayerPresentation " + imageMapLayerPresentation.getName());
				
				try
				{
					Matrix4d imageToMeshTransform = new Matrix4d(layerPresentationToTransformMap.get(imageMapLayerPresentation));
															
					// Finds the relative rotation around +Z between the image and the mesh.	
					Tuple3d rotation = ApogyCommonMathFacade.INSTANCE.extractOrientation(ApogyCommonMathFacade.INSTANCE.createMatrix4x4(imageToMeshTransform));
					double zRotationAngle = -rotation.getZ();				
					
					// Finds the translation between the image and the mesh in the XY plane.
					Vector3d translation = new Vector3d();
					imageToMeshTransform.get(translation);
					
					// Converts the transform into pixels.				
					double xTranslation = translation.x / bestResolution;
					double yTranslation = translation.y / bestResolution;
					
					if(verbose)
					{
						System.out.println("Image To Mesh Transform : " + imageToMeshTransform);
						System.out.println("\t xTranslation   : " + xTranslation);
						System.out.println("\t yTranslation   : " + yTranslation);
						System.out.println("\t zRotationAngle : " + Math.toDegrees(zRotationAngle) + " deg");
					}
					
					// Resize the layer image to match the best resolution
					double scaleFactor = imageMapLayerPresentation.getResolution() /bestResolution ;
					AbstractEImage scaledLayerImage = EImagesUtilities.INSTANCE.resize(imageMapLayerPresentation.getRegionImage(), scaleFactor);
					
					if(verbose)
					{
						System.out.println("\t scaling factor : " + scaleFactor);
						System.out.println("\t layer image scaled : " + scaledLayerImage.getWidth() + " X " + scaledLayerImage.getHeight());
					}
					
					double Y = meshImageHeight - (scaledLayerImage.getHeight() + yTranslation);
					
					// Creates a rotation about the lower left corner of the layer image
					AffineTransform translationTransform = new AffineTransform();							
					translationTransform.translate(xTranslation, Y);
					
					AffineTransform rotationTranform = new AffineTransform();	
					rotationTranform.rotate(zRotationAngle, 0, scaledLayerImage.getHeight());
					
					translationTransform.concatenate(rotationTranform);
					
					// Applies the transform onto the layer image to get its projection on the mesh extent.
					BufferedImage bufferedImage = new BufferedImage(meshImageWidth, meshImageHeight, BufferedImage.TYPE_INT_ARGB);
					Graphics2D g = (Graphics2D) bufferedImage.createGraphics();
				    g.drawImage(scaledLayerImage.asBufferedImage(), translationTransform, null);
				    g.dispose();
								    
				    EImage layerMeshImage = ApogyCommonImagesFactory.eINSTANCE.createEImage();
				    layerMeshImage.setImageContent(bufferedImage);
				    				    
				    // Adds the resulting image on top of the mesh image.
				    meshTextureImage = EImagesUtilities.INSTANCE.applyOverlay(meshTextureImage, layerMeshImage, false);	
				    				    
				}
				catch(Throwable t)
				{
					t.printStackTrace();
				}
			}
			
			Logger.INSTANCE.log(Activator.ID, this, getName() + " : Updating Texture Image completed.", EventSeverity.OK);
			return meshTextureImage;
		}
		
		Logger.INSTANCE.log(Activator.ID, this, getName() + " : Updating Texture Image returned no image.", EventSeverity.WARNING);
		return null;
		
	}	
	
	private EContentAdapter getMeshTextureAdapter()
	{
		if(meshTextureAdapter == null)
		{
			meshTextureAdapter = new EContentAdapter()
			{
				@Override
				public void notifyChanged(Notification notification) 
				{
					super.notifyChanged(notification);
					
					boolean updateImage = false;
					
					if(notification.getNotifier() instanceof CartesianTriangularMeshMapLayer)
					{
						int featureId = notification.getFeatureID(CartesianTriangularMeshMapLayer.class);
						switch (featureId) 
						{
							case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS:
								updateImage = true;
							break;

						default:
							break;
						}
					}
					
					if(notification.getNotifier() instanceof MapLayerPresentation)
					{
						int featureId = notification.getFeatureID(MapLayerPresentation.class);
						switch (featureId) 
						{
							case ApogySurfaceEnvironmentPackage.MAP_LAYER_PRESENTATION__VISIBLE:						
								updateImage = true;
							break;

						default:
							break;
						}
					}
					
					if(notification.getNotifier() instanceof ImageMapLayerPresentation)
					{
						int featureId = notification.getFeatureID(ImageMapLayerPresentation.class);
						switch (featureId) 
						{
							// Cases where NOT to update the images.
							case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION__NAME:	
							case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION__DESCRIPTION:	
							break;																					
							
							default:
								updateImage = true;
							break;						
						}
					}
					
					if(updateImage)
					{
						AbstractEImage img = createMeshTextureImage();		
						setTextureImage(img);
						textureImageIsDirty = false;
					}
				}
			};
		}
		
		return meshTextureAdapter;
	}
		
//	protected void transactionSet(EObject owner, EStructuralFeature feature, Object value)
//	{
//		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(owner);
//		if(domain instanceof TransactionalEditingDomain)
//		{
//			SetCommand command = new SetCommand(domain, owner, feature, value);
//			domain.getCommandStack().execute(command);
//		}
//	}
	
} //CartesianTriangularMeshMapLayerImpl
