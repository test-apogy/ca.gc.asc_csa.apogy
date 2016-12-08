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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.ImageMapLayerImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.ImageMapLayerImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.ImageMapLayerImpl#isOpaque <em>Opaque</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.ImageMapLayerImpl#getImage <em>Image</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.ImageMapLayerImpl#getLegend <em>Legend</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.ImageMapLayerImpl#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageMapLayerImpl extends AbstractMapLayerImpl implements ImageMapLayer {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isOpaque() <em>Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpaque()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPAQUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOpaque() <em>Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpaque()
	 * @generated
	 * @ordered
	 */
	protected boolean opaque = OPAQUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected AbstractEImage image;

	/**
	 * The cached value of the '{@link #getLegend() <em>Legend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegend()
	 * @generated
	 * @ordered
	 */
	protected AbstractEImage legend;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final double RESOLUTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected double resolution = RESOLUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageMapLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentPackage.Literals.IMAGE_MAP_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpaque() {
		return opaque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpaque(boolean newOpaque) {
		boolean oldOpaque = opaque;
		opaque = newOpaque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__OPAQUE, oldOpaque, opaque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEImage getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(AbstractEImage newImage, NotificationChain msgs) {
		AbstractEImage oldImage = image;
		image = newImage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__IMAGE, oldImage, newImage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(AbstractEImage newImage) {
		if (newImage != image) {
			NotificationChain msgs = null;
			if (image != null)
				msgs = ((InternalEObject)image).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__IMAGE, null, msgs);
			if (newImage != null)
				msgs = ((InternalEObject)newImage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__IMAGE, null, msgs);
			msgs = basicSetImage(newImage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__IMAGE, newImage, newImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEImage getLegend() {
		return legend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegend(AbstractEImage newLegend, NotificationChain msgs) {
		AbstractEImage oldLegend = legend;
		legend = newLegend;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__LEGEND, oldLegend, newLegend);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegend(AbstractEImage newLegend) {
		if (newLegend != legend) {
			NotificationChain msgs = null;
			if (legend != null)
				msgs = ((InternalEObject)legend).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__LEGEND, null, msgs);
			if (newLegend != null)
				msgs = ((InternalEObject)newLegend).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__LEGEND, null, msgs);
			msgs = basicSetLegend(newLegend, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__LEGEND, newLegend, newLegend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getResolution() 
	{
		  resolution = -1;
		  if(getImage() != null)
		  {
			  double hResolution = getWidth() / getImage().getWidth();
			  double vResolution = getHeight() / getImage().getHeight();		  		  
			  resolution = (hResolution + vResolution) / 2.0;
		  }	  
		  return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateImage(IProgressMonitor progressMonitor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public RectangularRegion getImageMapLayerRegion() 
	{
 		RectangularRegion rectangularRegion = ApogySurfaceEnvironmentFactory.eINSTANCE.createRectangularRegion();
 		rectangularRegion.setTransformation(ApogyCommonMathFacade.INSTANCE.createIdentityMatrix4x4());
 		
 		if(getMap() != null && getMap().getTransformation() != null)
 		{ 			 
 			Matrix4x4 copy = EcoreUtil.copy(getMap().getTransformation());
 			rectangularRegion.setTransformation(copy);   			 		
 		} 		
 		
 		// Fills in the extent.
 		rectangularRegion.setXMin(0);
 		rectangularRegion.setXMax(getWidth());
 		rectangularRegion.setYMin(0);
 		rectangularRegion.setYMax(getHeight());
 		 		
 		return rectangularRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage getRegionImage() {
		return getImage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public RectangularRegion getRegion() {
		return getImageMapLayerRegion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__IMAGE:
				return basicSetImage(null, msgs);
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__LEGEND:
				return basicSetLegend(null, msgs);
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
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__WIDTH:
				return getWidth();
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__HEIGHT:
				return getHeight();
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__OPAQUE:
				return isOpaque();
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__IMAGE:
				return getImage();
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__LEGEND:
				return getLegend();
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__RESOLUTION:
				return getResolution();
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
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__WIDTH:
				setWidth((Double)newValue);
				return;
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__HEIGHT:
				setHeight((Double)newValue);
				return;
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__OPAQUE:
				setOpaque((Boolean)newValue);
				return;
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__IMAGE:
				setImage((AbstractEImage)newValue);
				return;
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__LEGEND:
				setLegend((AbstractEImage)newValue);
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
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__OPAQUE:
				setOpaque(OPAQUE_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__IMAGE:
				setImage((AbstractEImage)null);
				return;
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__LEGEND:
				setLegend((AbstractEImage)null);
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
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__WIDTH:
				return width != WIDTH_EDEFAULT;
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__OPAQUE:
				return opaque != OPAQUE_EDEFAULT;
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__IMAGE:
				return image != null;
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__LEGEND:
				return legend != null;
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__RESOLUTION:
				return resolution != RESOLUTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == RectangularRegionProvider.class) {
			switch (baseOperationID) {
				case ApogySurfaceEnvironmentPackage.RECTANGULAR_REGION_PROVIDER___GET_REGION: return ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER___GET_REGION;
				default: return -1;
			}
		}
		if (baseClass == RectangularRegionImage.class) {
			switch (baseOperationID) {
				case ApogySurfaceEnvironmentPackage.RECTANGULAR_REGION_IMAGE___GET_REGION_IMAGE: return ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER___GET_REGION_IMAGE;
				case ApogySurfaceEnvironmentPackage.RECTANGULAR_REGION_IMAGE___GET_RESOLUTION: return ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER___GET_RESOLUTION;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR:
				updateImage((IProgressMonitor)arguments.get(0));
				return null;
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION:
				return getImageMapLayerRegion();
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER___GET_REGION_IMAGE:
				return getRegionImage();
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER___GET_REGION:
				return getRegion();
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", opaque: ");
		result.append(opaque);
		result.append(", resolution: ");
		result.append(resolution);
		result.append(')');
		return result.toString();
	}

} //ImageMapLayerImpl
