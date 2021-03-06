package ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.impl;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.swt.graphics.RGB;

import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.ApogyCommonTopologyAddonsPrimitivesUIPackage;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.VectorPresentation;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.VectorSceneObject;
import ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.impl.VectorPresentationImpl#getLineWidth <em>Line Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VectorPresentationImpl extends NodePresentationImpl implements VectorPresentation {
	/**
	 * The default value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_WIDTH_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected int lineWidth = LINE_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VectorPresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyAddonsPrimitivesUIPackage.Literals.VECTOR_PRESENTATION;
	}

	@Override
	public RGB getColor() 
	{	
		RGB rgb = super.getColor();
		if(rgb == null)
		{
			rgb = new RGB(255, 255, 255);
			setColor(rgb);
		}
		return rgb;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineWidth() {
		return lineWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineWidth(int newLineWidth) {
		int oldLineWidth = lineWidth;
		lineWidth = newLineWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesUIPackage.VECTOR_PRESENTATION__LINE_WIDTH, oldLineWidth, lineWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonTopologyAddonsPrimitivesUIPackage.VECTOR_PRESENTATION__LINE_WIDTH:
				return getLineWidth();
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
			case ApogyCommonTopologyAddonsPrimitivesUIPackage.VECTOR_PRESENTATION__LINE_WIDTH:
				setLineWidth((Integer)newValue);
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
			case ApogyCommonTopologyAddonsPrimitivesUIPackage.VECTOR_PRESENTATION__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
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
			case ApogyCommonTopologyAddonsPrimitivesUIPackage.VECTOR_PRESENTATION__LINE_WIDTH:
				return lineWidth != LINE_WIDTH_EDEFAULT;
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
		result.append(" (lineWidth: ");
		result.append(lineWidth);
		result.append(')');
		return result.toString();
	}

	@Override
	protected void initialSceneObject() 
	{
		VectorSceneObject vectorSceneObject = ((VectorSceneObject) sceneObject);
		vectorSceneObject.initialize();
		vectorSceneObject.setLineWidth(getLineWidth());
		
		super.initialSceneObject();
	}
	
	@Override
	protected void updateSceneObject(Notification notification) 
	{
		if (sceneObject != null) 
		{
			VectorSceneObject vectorSceneObject = (VectorSceneObject) sceneObject;
		
			if(notification.getNotifier() instanceof VectorPresentation)
			{
				int featureID = notification.getFeatureID(VectorPresentation.class);
				switch (featureID) 
				{
					case ApogyCommonTopologyAddonsPrimitivesUIPackage.VECTOR_PRESENTATION__COLOR:
						vectorSceneObject.setColor(getColor());					
					break;

					case ApogyCommonTopologyAddonsPrimitivesUIPackage.VECTOR_PRESENTATION__LINE_WIDTH:
						vectorSceneObject.setLineWidth(getLineWidth());					
					default:
					break;
				}
			}
		}
		super.updateSceneObject(notification);
	}

} //VectorPresentationImpl
