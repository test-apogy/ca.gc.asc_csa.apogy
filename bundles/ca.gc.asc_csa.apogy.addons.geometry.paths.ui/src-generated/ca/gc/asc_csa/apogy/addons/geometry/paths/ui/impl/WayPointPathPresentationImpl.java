package ca.gc.asc_csa.apogy.addons.geometry.paths.ui.impl;
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

import javax.vecmath.Point3d;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.Activator;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.PathPresentationMode;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.ApogyAddonsGeometryPathsUIPackage;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.WayPointPathPresentation;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.WayPointPathSceneObject;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.preferences.MRTPathsPreferencesConstants;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Way Point Path Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.geometry.paths.ui.impl.WayPointPathPresentationImpl#getPointSize <em>Point Size</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.geometry.paths.ui.impl.WayPointPathPresentationImpl#getPresentationMode <em>Presentation Mode</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.geometry.paths.ui.impl.WayPointPathPresentationImpl#getEndPointsRadius <em>End Points Radius</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WayPointPathPresentationImpl extends NodePresentationImpl implements WayPointPathPresentation
{
	protected IPropertyChangeListener preferencesListener = null;
	
	/**
	 * The default value of the '{@link #getPointSize() <em>Point Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointSize()
	 * @generated
	 * @ordered
	 */
	protected static final int POINT_SIZE_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getPointSize() <em>Point Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointSize()
	 * @generated
	 * @ordered
	 */
	protected int pointSize = POINT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPresentationMode() <em>Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationMode()
	 * @generated
	 * @ordered
	 */
	protected static final PathPresentationMode PRESENTATION_MODE_EDEFAULT = PathPresentationMode.POINTS_LINES;

	/**
	 * The cached value of the '{@link #getPresentationMode() <em>Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationMode()
	 * @generated
	 * @ordered
	 */
	protected PathPresentationMode presentationMode = PRESENTATION_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndPointsRadius() <em>End Points Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointsRadius()
	 * @generated
	 * @ordered
	 */
	protected static final float END_POINTS_RADIUS_EDEFAULT = 0.02F;

	/**
	 * The cached value of the '{@link #getEndPointsRadius() <em>End Points Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointsRadius()
	 * @generated
	 * @ordered
	 */
	protected float endPointsRadius = END_POINTS_RADIUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected WayPointPathPresentationImpl()
	{
		super();
		
		// Applies the current preferences values.
		applyPreferences();
		
		// Register a listener to the preference store
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(getPreferencesListener());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ApogyAddonsGeometryPathsUIPackage.Literals.WAY_POINT_PATH_PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPointSize()
	{
		return pointSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointSize(int newPointSize)
	{
		int oldPointSize = pointSize;
		pointSize = newPointSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION__POINT_SIZE, oldPointSize, pointSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathPresentationMode getPresentationMode()
	{
		return presentationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationMode(PathPresentationMode newPresentationMode)
	{
		PathPresentationMode oldPresentationMode = presentationMode;
		presentationMode = newPresentationMode == null ? PRESENTATION_MODE_EDEFAULT : newPresentationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION__PRESENTATION_MODE, oldPresentationMode, presentationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEndPointsRadius() {
		return endPointsRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPointsRadius(float newEndPointsRadius) {
		float oldEndPointsRadius = endPointsRadius;
		endPointsRadius = newEndPointsRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION__END_POINTS_RADIUS, oldEndPointsRadius, endPointsRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ApogyAddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION__POINT_SIZE:
				return getPointSize();
			case ApogyAddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION__PRESENTATION_MODE:
				return getPresentationMode();
			case ApogyAddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION__END_POINTS_RADIUS:
				return getEndPointsRadius();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case ApogyAddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION__POINT_SIZE:
				setPointSize((Integer)newValue);
				return;
			case ApogyAddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION__PRESENTATION_MODE:
				setPresentationMode((PathPresentationMode)newValue);
				return;
			case ApogyAddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION__END_POINTS_RADIUS:
				setEndPointsRadius((Float)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case ApogyAddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION__POINT_SIZE:
				setPointSize(POINT_SIZE_EDEFAULT);
				return;
			case ApogyAddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION__PRESENTATION_MODE:
				setPresentationMode(PRESENTATION_MODE_EDEFAULT);
				return;
			case ApogyAddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION__END_POINTS_RADIUS:
				setEndPointsRadius(END_POINTS_RADIUS_EDEFAULT);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case ApogyAddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION__POINT_SIZE:
				return pointSize != POINT_SIZE_EDEFAULT;
			case ApogyAddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION__PRESENTATION_MODE:
				return presentationMode != PRESENTATION_MODE_EDEFAULT;
			case ApogyAddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION__END_POINTS_RADIUS:
				return endPointsRadius != END_POINTS_RADIUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pointSize: ");
		result.append(pointSize);
		result.append(", presentationMode: ");
		result.append(presentationMode);
		result.append(", endPointsRadius: ");
		result.append(endPointsRadius);
		result.append(')');
		return result.toString();
	}
	
	@Override
	protected void updateSceneObject(Notification notification)
	{
		WayPointPathSceneObject wayPointPathSceneObject = (WayPointPathSceneObject) sceneObject;
		
		if(notification.getNotifier() instanceof WayPointPathPresentation)
		{
			int featureId = notification.getFeatureID(WayPointPathPresentation.class);
			
			switch (featureId) 
			{
				case ApogyAddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION__PRESENTATION_MODE:
					wayPointPathSceneObject.setPathPresentationMode(this.presentationMode);		
				break;
				
				case ApogyAddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION__POINT_SIZE:
					wayPointPathSceneObject.setPointSize(this.pointSize);			
				break;

				case ApogyAddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION__END_POINTS_RADIUS:
					wayPointPathSceneObject.setEndPointsRadius(this.endPointsRadius);		
				break;
				
			default:
				break;
			}
		}
				
		super.updateSceneObject(notification);
	}
	
	@Override
	public Tuple3d basicGetCentroid()
	{		
		Point3d point3d = new Point3d();
		
		if(sceneObject != null)
		{
			point3d = sceneObject.getCentroid();
		}
		
		return ApogyCommonMathFacade.INSTANCE.createTuple3d(point3d);
	}
	
	@Override
	protected void initialSceneObject()
	{				
		WayPointPathSceneObject object3D = (WayPointPathSceneObject) sceneObject;
		object3D.setPathPresentationMode(this.presentationMode);
		object3D.setPointSize(this.pointSize);
		object3D.setEndPointsRadius(this.endPointsRadius);
		
		super.initialSceneObject();
	}
	
	private IPropertyChangeListener getPreferencesListener()
	{
		if(preferencesListener == null)
		{
			preferencesListener = new IPropertyChangeListener() 
			{

				public void propertyChange(PropertyChangeEvent event) 
				{	
					applyPreferences();		
				}	
			};
		}
		
		return preferencesListener;
	}
	
	@Override
	protected void applyPreferences() 
	{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Change color.
		RGB rgb = PreferenceConverter.getColor(store, MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_COLOR_ID);
		if(rgb != null) setColor(rgb);
		
		// Change visibility.
		setVisible(store.getBoolean(MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_VISIBILITY_ID));
						
		// Change mode.
		setPresentationMode(PathPresentationMode.get(store.getInt(MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_PRESENTATION_MODE_ID)));
		
		// Change point size
		setPointSize(store.getInt(MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_POINT_SIZE_ID));
		
		// Change end point radius
		setEndPointsRadius(store.getFloat(MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_END_POINT_RADIUS_ID));
		
		super.applyPreferences();
	}
	
} //WayPointPathPresentationImpl
