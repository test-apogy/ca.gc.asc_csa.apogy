package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.viewers.ISelection;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.AbstractWorldWindLayer;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage;
import ca.gc.asc_csa.apogy.core.impl.UpdatableImpl;
import gov.nasa.worldwind.layers.RenderableLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract World Wind Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl.AbstractWorldWindLayerImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl.AbstractWorldWindLayerImpl#getRenderableLayer <em>Renderable Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractWorldWindLayerImpl extends UpdatableImpl implements AbstractWorldWindLayer {
	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRenderableLayer() <em>Renderable Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderableLayer()
	 * @generated
	 * @ordered
	 */
	protected static final RenderableLayer RENDERABLE_LAYER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRenderableLayer() <em>Renderable Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderableLayer()
	 * @generated
	 * @ordered
	 */
	protected RenderableLayer renderableLayer = RENDERABLE_LAYER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractWorldWindLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthUIPackage.Literals.ABSTRACT_WORLD_WIND_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setVisible(boolean newVisible)
	{
		setVisibleGen(newVisible);
		
		updateRenderableLayer();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleGen(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthUIPackage.ABSTRACT_WORLD_WIND_LAYER__VISIBLE, oldVisible, visible));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public RenderableLayer getRenderableLayer() 
	{
		RenderableLayer tmp = getRenderableLayerGen();
		if(tmp == null)
		{
			tmp = new RenderableLayer();
			setRenderableLayer(tmp);
		}
		return tmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderableLayer getRenderableLayerGen() {
		return renderableLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenderableLayer(RenderableLayer newRenderableLayer) {
		RenderableLayer oldRenderableLayer = renderableLayer;
		renderableLayer = newRenderableLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthUIPackage.ABSTRACT_WORLD_WIND_LAYER__RENDERABLE_LAYER, oldRenderableLayer, renderableLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void update() 
	{		
		if(!isUpdating())
		{
			try
			{			
				updateRenderableLayer();				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void dispose() 
	{		
		// Nothing.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void selectionChanged(ISelection selection) 
	{
		// Nothing to do be default.
	}

	@Override
	public boolean getDefaultAutoUpdateEnabled() 
	{
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthUIPackage.ABSTRACT_WORLD_WIND_LAYER__VISIBLE:
				return isVisible();
			case ApogyCoreEnvironmentOrbitEarthUIPackage.ABSTRACT_WORLD_WIND_LAYER__RENDERABLE_LAYER:
				return getRenderableLayer();
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.ABSTRACT_WORLD_WIND_LAYER__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthUIPackage.ABSTRACT_WORLD_WIND_LAYER__RENDERABLE_LAYER:
				setRenderableLayer((RenderableLayer)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.ABSTRACT_WORLD_WIND_LAYER__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthUIPackage.ABSTRACT_WORLD_WIND_LAYER__RENDERABLE_LAYER:
				setRenderableLayer(RENDERABLE_LAYER_EDEFAULT);
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.ABSTRACT_WORLD_WIND_LAYER__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthUIPackage.ABSTRACT_WORLD_WIND_LAYER__RENDERABLE_LAYER:
				return RENDERABLE_LAYER_EDEFAULT == null ? renderableLayer != null : !RENDERABLE_LAYER_EDEFAULT.equals(renderableLayer);
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.ABSTRACT_WORLD_WIND_LAYER___DISPOSE:
				dispose();
				return null;
			case ApogyCoreEnvironmentOrbitEarthUIPackage.ABSTRACT_WORLD_WIND_LAYER___SELECTION_CHANGED__ISELECTION:
				selectionChanged((ISelection)arguments.get(0));
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
		result.append(" (visible: ");
		result.append(visible);
		result.append(", renderableLayer: ");
		result.append(renderableLayer);
		result.append(')');
		return result.toString();
	}

	protected abstract void updateRenderableLayer();
	
} //AbstractWorldWindLayerImpl
