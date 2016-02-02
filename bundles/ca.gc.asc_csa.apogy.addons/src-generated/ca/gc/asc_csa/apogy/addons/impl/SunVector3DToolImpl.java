package ca.gc.asc_csa.apogy.addons.impl;
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

import java.util.Calendar;
import java.util.Date;

import javax.vecmath.Color3f;
import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.SunVector3DTool;
import ca.gc.asc_csa.apogy.addons.SunVector3DToolNode;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsFactory;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.environment.AstronomyUtils;
import ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils;
import ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates;
import ca.gc.asc_csa.apogy.core.environment.Sun;
import ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite;
import ca.gc.asc_csa.apogy.core.invocator.Environment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sun Vector3 DTool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.SunVector3DToolImpl#getVectorColor <em>Vector Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.SunVector3DToolImpl#getVectorLength <em>Vector Length</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.SunVector3DToolImpl#getEndPointRadius <em>End Point Radius</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.SunVector3DToolImpl#getSunIntensity <em>Sun Intensity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.SunVector3DToolImpl#getCurrentDayMaximumSunIntensity <em>Current Day Maximum Sun Intensity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.SunVector3DToolImpl#getCurrentSunIntensityPercentage <em>Current Sun Intensity Percentage</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.SunVector3DToolImpl#getSunVector3DToolNode <em>Sun Vector3 DTool Node</em>}</li>
 * </ul>
 *
 * @generated
 */
										 
public class SunVector3DToolImpl extends AbstractTwoPoints3DToolImpl implements SunVector3DTool 
{
	private ApogyEnvironment apogyEnvironment = null;
	private Date previousTime = null;
	
	/**
	 * The default value of the '{@link #getVectorColor() <em>Vector Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color3f VECTOR_COLOR_EDEFAULT = (Color3f)ApogyAddonsFactory.eINSTANCE.createFromString(ApogyAddonsPackage.eINSTANCE.getColor3f(), "1.0,1.0,0.0");

	/**
	 * The cached value of the '{@link #getVectorColor() <em>Vector Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorColor()
	 * @generated
	 * @ordered
	 */
	protected Color3f vectorColor = VECTOR_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVectorLength() <em>Vector Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorLength()
	 * @generated
	 * @ordered
	 */
	protected static final double VECTOR_LENGTH_EDEFAULT = 10.0;

	/**
	 * The cached value of the '{@link #getVectorLength() <em>Vector Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorLength()
	 * @generated
	 * @ordered
	 */
	protected double vectorLength = VECTOR_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndPointRadius() <em>End Point Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double END_POINT_RADIUS_EDEFAULT = 0.01;

	/**
	 * The cached value of the '{@link #getEndPointRadius() <em>End Point Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointRadius()
	 * @generated
	 * @ordered
	 */
	protected double endPointRadius = END_POINT_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSunIntensity() <em>Sun Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSunIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final double SUN_INTENSITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSunIntensity() <em>Sun Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSunIntensity()
	 * @generated
	 * @ordered
	 */
	protected double sunIntensity = SUN_INTENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentDayMaximumSunIntensity() <em>Current Day Maximum Sun Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDayMaximumSunIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final double CURRENT_DAY_MAXIMUM_SUN_INTENSITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCurrentDayMaximumSunIntensity() <em>Current Day Maximum Sun Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDayMaximumSunIntensity()
	 * @generated
	 * @ordered
	 */
	protected double currentDayMaximumSunIntensity = CURRENT_DAY_MAXIMUM_SUN_INTENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentSunIntensityPercentage() <em>Current Sun Intensity Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSunIntensityPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final double CURRENT_SUN_INTENSITY_PERCENTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCurrentSunIntensityPercentage() <em>Current Sun Intensity Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSunIntensityPercentage()
	 * @generated
	 * @ordered
	 */
	protected double currentSunIntensityPercentage = CURRENT_SUN_INTENSITY_PERCENTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSunVector3DToolNode() <em>Sun Vector3 DTool Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSunVector3DToolNode()
	 * @generated
	 * @ordered
	 */
	protected SunVector3DToolNode sunVector3DToolNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SunVector3DToolImpl() 
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsPackage.Literals.SUN_VECTOR3_DTOOL;
	}		

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f getVectorColor() {
		return vectorColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorColor(Color3f newVectorColor) {
		Color3f oldVectorColor = vectorColor;
		vectorColor = newVectorColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.SUN_VECTOR3_DTOOL__VECTOR_COLOR, oldVectorColor, vectorColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVectorLength() {
		return vectorLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setVectorLength(double newVectorLength)
	{
		setVectorLengthGen(Math.abs(newVectorLength));		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorLengthGen(double newVectorLength) {
		double oldVectorLength = vectorLength;
		vectorLength = newVectorLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.SUN_VECTOR3_DTOOL__VECTOR_LENGTH, oldVectorLength, vectorLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEndPointRadius() {
		return endPointRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPointRadius(double newEndPointRadius) {
		double oldEndPointRadius = endPointRadius;
		endPointRadius = newEndPointRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.SUN_VECTOR3_DTOOL__END_POINT_RADIUS, oldEndPointRadius, endPointRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSunIntensity() {
		return sunIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSunIntensity(double newSunIntensity) {
		double oldSunIntensity = sunIntensity;
		sunIntensity = newSunIntensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.SUN_VECTOR3_DTOOL__SUN_INTENSITY, oldSunIntensity, sunIntensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrentDayMaximumSunIntensity() {
		return currentDayMaximumSunIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentDayMaximumSunIntensity(double newCurrentDayMaximumSunIntensity) {
		double oldCurrentDayMaximumSunIntensity = currentDayMaximumSunIntensity;
		currentDayMaximumSunIntensity = newCurrentDayMaximumSunIntensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.SUN_VECTOR3_DTOOL__CURRENT_DAY_MAXIMUM_SUN_INTENSITY, oldCurrentDayMaximumSunIntensity, currentDayMaximumSunIntensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrentSunIntensityPercentage() {
		return currentSunIntensityPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentSunIntensityPercentage(double newCurrentSunIntensityPercentage) {
		double oldCurrentSunIntensityPercentage = currentSunIntensityPercentage;
		currentSunIntensityPercentage = newCurrentSunIntensityPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.SUN_VECTOR3_DTOOL__CURRENT_SUN_INTENSITY_PERCENTAGE, oldCurrentSunIntensityPercentage, currentSunIntensityPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunVector3DToolNode getSunVector3DToolNode() {
		if (sunVector3DToolNode != null && sunVector3DToolNode.eIsProxy()) {
			InternalEObject oldSunVector3DToolNode = (InternalEObject)sunVector3DToolNode;
			sunVector3DToolNode = (SunVector3DToolNode)eResolveProxy(oldSunVector3DToolNode);
			if (sunVector3DToolNode != oldSunVector3DToolNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsPackage.SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE, oldSunVector3DToolNode, sunVector3DToolNode));
			}
		}
		return sunVector3DToolNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunVector3DToolNode basicGetSunVector3DToolNode() {
		return sunVector3DToolNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSunVector3DToolNode(SunVector3DToolNode newSunVector3DToolNode, NotificationChain msgs) {
		SunVector3DToolNode oldSunVector3DToolNode = sunVector3DToolNode;
		sunVector3DToolNode = newSunVector3DToolNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE, oldSunVector3DToolNode, newSunVector3DToolNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSunVector3DToolNode(SunVector3DToolNode newSunVector3DToolNode) {
		if (newSunVector3DToolNode != sunVector3DToolNode) {
			NotificationChain msgs = null;
			if (sunVector3DToolNode != null)
				msgs = ((InternalEObject)sunVector3DToolNode).eInverseRemove(this, ApogyAddonsPackage.SUN_VECTOR3_DTOOL_NODE__SUN_VECTOR3_DTOOL, SunVector3DToolNode.class, msgs);
			if (newSunVector3DToolNode != null)
				msgs = ((InternalEObject)newSunVector3DToolNode).eInverseAdd(this, ApogyAddonsPackage.SUN_VECTOR3_DTOOL_NODE__SUN_VECTOR3_DTOOL, SunVector3DToolNode.class, msgs);
			msgs = basicSetSunVector3DToolNode(newSunVector3DToolNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE, newSunVector3DToolNode, newSunVector3DToolNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE:
				if (sunVector3DToolNode != null)
					msgs = ((InternalEObject)sunVector3DToolNode).eInverseRemove(this, ApogyAddonsPackage.SUN_VECTOR3_DTOOL_NODE__SUN_VECTOR3_DTOOL, SunVector3DToolNode.class, msgs);
				return basicSetSunVector3DToolNode((SunVector3DToolNode)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE:
				return basicSetSunVector3DToolNode(null, msgs);
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
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__VECTOR_COLOR:
				return getVectorColor();
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__VECTOR_LENGTH:
				return getVectorLength();
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__END_POINT_RADIUS:
				return getEndPointRadius();
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__SUN_INTENSITY:
				return getSunIntensity();
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__CURRENT_DAY_MAXIMUM_SUN_INTENSITY:
				return getCurrentDayMaximumSunIntensity();
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__CURRENT_SUN_INTENSITY_PERCENTAGE:
				return getCurrentSunIntensityPercentage();
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE:
				if (resolve) return getSunVector3DToolNode();
				return basicGetSunVector3DToolNode();
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
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__VECTOR_COLOR:
				setVectorColor((Color3f)newValue);
				return;
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__VECTOR_LENGTH:
				setVectorLength((Double)newValue);
				return;
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__END_POINT_RADIUS:
				setEndPointRadius((Double)newValue);
				return;
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__SUN_INTENSITY:
				setSunIntensity((Double)newValue);
				return;
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__CURRENT_DAY_MAXIMUM_SUN_INTENSITY:
				setCurrentDayMaximumSunIntensity((Double)newValue);
				return;
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__CURRENT_SUN_INTENSITY_PERCENTAGE:
				setCurrentSunIntensityPercentage((Double)newValue);
				return;
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE:
				setSunVector3DToolNode((SunVector3DToolNode)newValue);
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
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__VECTOR_COLOR:
				setVectorColor(VECTOR_COLOR_EDEFAULT);
				return;
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__VECTOR_LENGTH:
				setVectorLength(VECTOR_LENGTH_EDEFAULT);
				return;
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__END_POINT_RADIUS:
				setEndPointRadius(END_POINT_RADIUS_EDEFAULT);
				return;
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__SUN_INTENSITY:
				setSunIntensity(SUN_INTENSITY_EDEFAULT);
				return;
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__CURRENT_DAY_MAXIMUM_SUN_INTENSITY:
				setCurrentDayMaximumSunIntensity(CURRENT_DAY_MAXIMUM_SUN_INTENSITY_EDEFAULT);
				return;
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__CURRENT_SUN_INTENSITY_PERCENTAGE:
				setCurrentSunIntensityPercentage(CURRENT_SUN_INTENSITY_PERCENTAGE_EDEFAULT);
				return;
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE:
				setSunVector3DToolNode((SunVector3DToolNode)null);
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
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__VECTOR_COLOR:
				return VECTOR_COLOR_EDEFAULT == null ? vectorColor != null : !VECTOR_COLOR_EDEFAULT.equals(vectorColor);
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__VECTOR_LENGTH:
				return vectorLength != VECTOR_LENGTH_EDEFAULT;
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__END_POINT_RADIUS:
				return endPointRadius != END_POINT_RADIUS_EDEFAULT;
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__SUN_INTENSITY:
				return sunIntensity != SUN_INTENSITY_EDEFAULT;
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__CURRENT_DAY_MAXIMUM_SUN_INTENSITY:
				return currentDayMaximumSunIntensity != CURRENT_DAY_MAXIMUM_SUN_INTENSITY_EDEFAULT;
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__CURRENT_SUN_INTENSITY_PERCENTAGE:
				return currentSunIntensityPercentage != CURRENT_SUN_INTENSITY_PERCENTAGE_EDEFAULT;
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE:
				return sunVector3DToolNode != null;
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
		result.append(" (vectorColor: ");
		result.append(vectorColor);
		result.append(", vectorLength: ");
		result.append(vectorLength);
		result.append(", endPointRadius: ");
		result.append(endPointRadius);
		result.append(", sunIntensity: ");
		result.append(sunIntensity);
		result.append(", currentDayMaximumSunIntensity: ");
		result.append(currentDayMaximumSunIntensity);
		result.append(", currentSunIntensityPercentage: ");
		result.append(currentSunIntensityPercentage);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public void selectionChanged(NodeSelection nodeSelection) 
	{
		if(!isDisposed())
		{
			Node node = nodeSelection.getSelectedNode();
			
			Tuple3d relativePosition = null;
			if(nodeSelection.getRelativeIntersectionPoint() != null)
			{
				relativePosition = ApogyCommonMathFacade.INSTANCE.createTuple3d(nodeSelection.getRelativeIntersectionPoint());
			}
			
			if(!isToNodeLock())
			{
				setToNode(node);
				setToRelativePosition(relativePosition);
			}	
			
			updateSunVector();
		}
	}
	
	@Override
	public void pointsRelativePoseChanged(Matrix4d newPose) 
	{		
		if(!isDisposed()) updateSunVector();
	}
	
	@Override
	public boolean isFromNodeLock() 
	{	
		return true;
	}
	
	@Override
	public Node getFromNode() 
	{
		Node node = super.getFromNode();
		if(node == null)
		{
			node = getSun();
			setFromNode(node);
		}
		return node;
	}
		
	@Override
	public void dispose() 
	{
		if(getSunVector3DToolNode() != null)
		{
			detachSunVector3DToolNode();			
		}
		setSunVector3DToolNode(null);
		
		super.dispose();
	}
	
	protected void updateSunVector()
	{
		if(!isDisposed())
		{
			if(getSunVector3DToolNode() == null)
			{
				setSunVector3DToolNode(ApogyAddonsFactory.eINSTANCE.createSunVector3DToolNode());
			}
			attachSunVector3DToolNode();	
			
			// Updates sun intensity
			updateSunIntensity();
		}
	}
	
	protected void updateSunIntensity()
	{
		double sunIntensity = 0.0;		
		double currentSunIntensityPercentage = 0.0;
		
		ApogyEnvironment env = getApogyEnvironment();
		
		if(env != null)
		{
			 if(env.getActiveWorksite() instanceof EarthSurfaceWorksite)
			 {
				 EarthSurfaceWorksite earthSurfaceWorksite = (EarthSurfaceWorksite) getApogyEnvironment().getActiveWorksite();				 
				 Date date = earthSurfaceWorksite.getSky().getTime();					
				 
				 double observerLongitude = earthSurfaceWorksite.getGeographicalCoordinates().getLongitude();
				 double observerLatitude = earthSurfaceWorksite.getGeographicalCoordinates().getLatitude();
				 
				 HorizontalCoordinates sunCoordinates = AstronomyUtils.INSTANCE.getHorizontalSunPosition(date, observerLongitude, observerLatitude);					
				 sunIntensity = AtmosphereUtils.INSTANCE.getDirectSunIntensity(sunCoordinates.getAltitude(), earthSurfaceWorksite.getGeographicalCoordinates().getElevation());
				 
				 updateMaximumSunIntensity(earthSurfaceWorksite, date, observerLongitude, observerLatitude);
				 
				 currentSunIntensityPercentage = (sunIntensity / getCurrentDayMaximumSunIntensity()) * 100.0;
				 if(currentSunIntensityPercentage > 100.0) currentSunIntensityPercentage = 100.0;				 				 			
			 }
		}
		setSunIntensity(sunIntensity);		
		setCurrentSunIntensityPercentage(currentSunIntensityPercentage);
	}
	
	private boolean dayHasChanged(Date currentDate, Date previousDate)
	{
		Calendar calendarCurrent = Calendar.getInstance();
		calendarCurrent.setTime(currentDate);
		
		Calendar calendarPrevious = Calendar.getInstance();
		calendarPrevious.setTime(previousDate);
		
		if(calendarCurrent.get(Calendar.YEAR) != calendarPrevious.get(Calendar.YEAR))
		{
			return true;
		}
		else if(calendarCurrent.get(Calendar.MONTH) != calendarPrevious.get(Calendar.MONTH))
		{
			return true;
		}
		else if(calendarCurrent.get(Calendar.DAY_OF_MONTH) != calendarPrevious.get(Calendar.DAY_OF_MONTH))
		{
			return true;
		}
		
		return false;
	}
	
	private void updateMaximumSunIntensity(EarthSurfaceWorksite earthSurfaceWorksite, Date date, double observerLongitude, double observerLatitude)
	{
		if(previousTime == null || dayHasChanged(date, previousTime))
		{
			Date highestSunTime = AstronomyUtils.INSTANCE.getSunHighestElevationTime(date, observerLongitude, observerLatitude);
			if(highestSunTime != null)
			{
				HorizontalCoordinates highestSunCoordinates = AstronomyUtils.INSTANCE.getHorizontalSunPosition(highestSunTime, observerLongitude, observerLatitude);					
				double maximumSunIntensity = AtmosphereUtils.INSTANCE.getDirectSunIntensity(highestSunCoordinates.getAltitude(), earthSurfaceWorksite.getGeographicalCoordinates().getElevation());
				setCurrentDayMaximumSunIntensity(maximumSunIntensity);
			} 			
		}
		
		previousTime = date;
	}
		
	
	protected void attachSunVector3DToolNode()
	{
		GroupNode groupNode = null;
		
		if(getToNode() == null)
		{
			detachSunVector3DToolNode();
		}
		else
		{
			if(getToNode() instanceof GroupNode)
			{
				groupNode = (GroupNode) getToNode();
			}
			else if(getToNode().getParent() instanceof GroupNode)
			{
				groupNode = (GroupNode) getToNode().getParent();
			}
			
			if(groupNode != null && !groupNode.getChildren().contains(getSunVector3DToolNode()))
			{
				groupNode.getChildren().add(getSunVector3DToolNode());
			}
		}	
	}
	
	protected void detachSunVector3DToolNode()
	{
		if(getSunVector3DToolNode() != null && getSunVector3DToolNode().getParent() instanceof GroupNode)
		{
			GroupNode parent = (GroupNode) getSunVector3DToolNode().getParent();
			parent.getChildren().remove(getSunVector3DToolNode());			
		}
	}
	
	protected ApogyEnvironment getApogyEnvironment()
	{
		if(apogyEnvironment == null)
		{
			try
			{				
				Environment env = getToolList().getToolsList().getInvocatorSession().getEnvironment();
				if(env instanceof ApogyEnvironment)
				{
					apogyEnvironment = (ApogyEnvironment) env;					
				}			
			}
			catch(Throwable t)
			{
				t.printStackTrace();
			}
		}
		return apogyEnvironment;
	}
	
	protected Sun getSun()
	{
		 if(getApogyEnvironment().getActiveWorksite() instanceof SurfaceWorksite)
		 {
			 SurfaceWorksite surfaceWorksite = (SurfaceWorksite) getApogyEnvironment().getActiveWorksite();
			 return surfaceWorksite.getSky().getSun();
		 }
		 return null;
	}
} //SunVector3DToolImpl
