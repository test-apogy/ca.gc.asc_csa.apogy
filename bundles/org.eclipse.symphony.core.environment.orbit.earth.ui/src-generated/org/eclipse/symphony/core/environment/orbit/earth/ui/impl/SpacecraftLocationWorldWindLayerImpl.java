/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui.impl;

import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.geom.Angle;
import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.layers.RenderableLayer;
import gov.nasa.worldwind.render.AnnotationAttributes;
import gov.nasa.worldwind.render.BasicShapeAttributes;
import gov.nasa.worldwind.render.GlobeAnnotation;
import gov.nasa.worldwind.render.Material;
import gov.nasa.worldwind.render.SurfaceCircle;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;

import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.common.emf.Timed;
import org.eclipse.symphony.core.environment.GeographicCoordinates;
import org.eclipse.symphony.core.environment.orbit.OrbitModel;
import org.eclipse.symphony.core.environment.orbit.SpacecraftState;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitFacade;
import org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedSpacecraftState;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spacecraft Location World Wind Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftLocationWorldWindLayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftLocationWorldWindLayerImpl#getOrbitModel <em>Orbit Model</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftLocationWorldWindLayerImpl#getTimeSource <em>Time Source</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftLocationWorldWindLayerImpl#isShowGroundProjection <em>Show Ground Projection</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftLocationWorldWindLayerImpl#isShowLatLon <em>Show Lat Lon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpacecraftLocationWorldWindLayerImpl extends AbstractWorldWindLayerImpl implements SpacecraftLocationWorldWindLayer 
{
	public static final String DEGREE_STRING = 	"\u00b0";
	private Adapter timedAdapter = null;
	
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrbitModel() <em>Orbit Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbitModel()
	 * @generated
	 * @ordered
	 */
	protected OrbitModel orbitModel;

	/**
	 * The cached value of the '{@link #getTimeSource() <em>Time Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSource()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.symphony.common.emf.Timed timeSource;

	/**
	 * The default value of the '{@link #isShowGroundProjection() <em>Show Ground Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowGroundProjection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_GROUND_PROJECTION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowGroundProjection() <em>Show Ground Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowGroundProjection()
	 * @generated
	 * @ordered
	 */
	protected boolean showGroundProjection = SHOW_GROUND_PROJECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowLatLon() <em>Show Lat Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowLatLon()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_LAT_LON_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowLatLon() <em>Show Lat Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowLatLon()
	 * @generated
	 * @ordered
	 */
	protected boolean showLatLon = SHOW_LAT_LON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpacecraftLocationWorldWindLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEarthOrbitEnvironmentUIPackage.Literals.SPACECRAFT_LOCATION_WORLD_WIND_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setName(String newName)
	{
		setNameGen(newName);
		
		updateRenderableLayer();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameGen(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitModel getOrbitModel() {
		if (orbitModel != null && orbitModel.eIsProxy()) {
			InternalEObject oldOrbitModel = (InternalEObject)orbitModel;
			orbitModel = (OrbitModel)eResolveProxy(oldOrbitModel);
			if (orbitModel != oldOrbitModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__ORBIT_MODEL, oldOrbitModel, orbitModel));
			}
		}
		return orbitModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitModel basicGetOrbitModel() {
		return orbitModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrbitModel(OrbitModel newOrbitModel) {
		OrbitModel oldOrbitModel = orbitModel;
		orbitModel = newOrbitModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__ORBIT_MODEL, oldOrbitModel, orbitModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.symphony.common.emf.Timed getTimeSource() {
		if (timeSource != null && timeSource.eIsProxy()) {
			InternalEObject oldTimeSource = (InternalEObject)timeSource;
			timeSource = (org.eclipse.symphony.common.emf.Timed)eResolveProxy(oldTimeSource);
			if (timeSource != oldTimeSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__TIME_SOURCE, oldTimeSource, timeSource));
			}
		}
		return timeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.symphony.common.emf.Timed basicGetTimeSource() {
		return timeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSourceGen(Timed newTimeSource) {
		Timed oldTimeSource = timeSource;
		timeSource = newTimeSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__TIME_SOURCE, oldTimeSource, timeSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setTimeSource(Timed newTimeSource)
	{
		// Unregister from previous timed if applicable.
		if(timeSource != null)
		{
			timeSource.eAdapters().remove(getTimedAdapter());
		}
		
		// Updates timesource
		setTimeSourceGen(newTimeSource);
		
		// Register to new timed if applicable.
		if(newTimeSource != null)
		{
			if(isAutoUpdateEnabled()) update();
			
			newTimeSource.eAdapters().add(getTimedAdapter());
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowGroundProjection() {
		return showGroundProjection;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setShowGroundProjection(boolean newShowGroundProjection)
	{
		setShowGroundProjectionGen(newShowGroundProjection);
		
		if(isAutoUpdateEnabled()) update();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowGroundProjectionGen(boolean newShowGroundProjection) {
		boolean oldShowGroundProjection = showGroundProjection;
		showGroundProjection = newShowGroundProjection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_GROUND_PROJECTION, oldShowGroundProjection, showGroundProjection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowLatLon() {
		return showLatLon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setShowLatLon(boolean newShowLatLon) 
	{
		setShowLatLonGen(newShowLatLon);
		
		if(isAutoUpdateEnabled()) update();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowLatLonGen(boolean newShowLatLon) {
		boolean oldShowLatLon = showLatLon;
		showLatLon = newShowLatLon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_LAT_LON, oldShowLatLon, showLatLon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__NAME:
				return getName();
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__ORBIT_MODEL:
				if (resolve) return getOrbitModel();
				return basicGetOrbitModel();
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__TIME_SOURCE:
				if (resolve) return getTimeSource();
				return basicGetTimeSource();
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_GROUND_PROJECTION:
				return isShowGroundProjection();
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_LAT_LON:
				return isShowLatLon();
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
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__NAME:
				setName((String)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__ORBIT_MODEL:
				setOrbitModel((OrbitModel)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__TIME_SOURCE:
				setTimeSource((org.eclipse.symphony.common.emf.Timed)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_GROUND_PROJECTION:
				setShowGroundProjection((Boolean)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_LAT_LON:
				setShowLatLon((Boolean)newValue);
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
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__ORBIT_MODEL:
				setOrbitModel((OrbitModel)null);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__TIME_SOURCE:
				setTimeSource((org.eclipse.symphony.common.emf.Timed)null);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_GROUND_PROJECTION:
				setShowGroundProjection(SHOW_GROUND_PROJECTION_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_LAT_LON:
				setShowLatLon(SHOW_LAT_LON_EDEFAULT);
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
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__ORBIT_MODEL:
				return orbitModel != null;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__TIME_SOURCE:
				return timeSource != null;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_GROUND_PROJECTION:
				return showGroundProjection != SHOW_GROUND_PROJECTION_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_LAT_LON:
				return showLatLon != SHOW_LAT_LON_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Named.class) {
			switch (derivedFeatureID) {
				case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__NAME: return org.eclipse.symphony.common.emf.EMFEcorePackage.NAMED__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Named.class) {
			switch (baseFeatureID) {
				case org.eclipse.symphony.common.emf.EMFEcorePackage.NAMED__NAME: return SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", showGroundProjection: ");
		result.append(showGroundProjection);
		result.append(", showLatLon: ");
		result.append(showLatLon);
		result.append(')');
		return result.toString();
	}

	protected void updateRenderableLayer()
	{				
		if(!isUpdating())
		{
			setUpdating(true);						
			
			RenderableLayer layer = getRenderableLayer();
			layer.removeAllRenderables();
		
			Job job = new Job("SpacecraftLocationWorldWindLayer updateRenderableLayer")
			{
				protected org.eclipse.core.runtime.IStatus run(org.eclipse.core.runtime.IProgressMonitor monitor) 
				{
					
					if(getOrbitModel() != null && getTimeSource() != null && isVisible())
					{
						try 
						{				
							SpacecraftState ss = getOrbitModel().getPropagator().propagate( getTimeSource().getTime());								
							GeographicCoordinates coord = EarthOrbitFacade.INSTANCE.convertToGeographicCoordinates((OreKitBackedSpacecraftState) ss);
	
							// Create latitude, longitude and elevation values.
				            Angle latitude = Angle.fromRadiansLatitude(coord.getLatitude());
				            Angle longitude = Angle.fromRadiansLongitude(coord.getLongitude());
				            double elevation = coord.getElevation();
				            
				            // Show the Globe annotation at 0 altitude if show ground projection is enabled.
				            if(isShowGroundProjection()) elevation = 0;
				            
				            Position position = new Position(latitude, longitude, elevation);
				            
				            // Creates an annotation.
				            String text = getDisplayedText(ss, coord);
				            GlobeAnnotation annotation = new GlobeAnnotation(text, position);	
				            
				            AnnotationAttributes annotationAttributes = new AnnotationAttributes();	            
				            annotationAttributes.setVisible(true);
				            
				            Font font = annotationAttributes.getFont();	               
				            font = font.deriveFont(Font.BOLD, 16.0f);
				            annotationAttributes.setFont(font);
				            
				            Color transparent = new Color(0, 0, 1f, 0.3f);
				            annotationAttributes.setBackgroundColor(transparent);
				            annotationAttributes.setTextColor(Color.RED);	
				            
				            annotation.setAttributes(annotationAttributes);	            
				            layer.addRenderable(annotation);
				            
				            if(isShowGroundProjection())
				            {
				    	        BasicShapeAttributes attributes = new BasicShapeAttributes();
				    	        attributes.setDrawInterior(true);
				    	        
				    	        Material mat = new Material(Color.RED);
				    	        attributes.setInteriorMaterial(mat);
				    	        SurfaceCircle surfaceCircle = new SurfaceCircle(attributes, position, 50000, 24);	    
				    	        surfaceCircle.setVisible(true);
				    	        layer.addRenderable(surfaceCircle);	    	        
				            }
						} 
						catch (Exception e) 
						{				
							e.printStackTrace();
						}
					}
					
					// Force layer to update.
					getRenderableLayer().firePropertyChange(AVKey.LAYER, null, this);
					setUpdating(false);					
					return Status.OK_STATUS;
				}
			};
			job.schedule();
		}	
	}
	
	protected String getDisplayedText(SpacecraftState ss, GeographicCoordinates coord)
	{
		String text = getName();
		
		if(isShowLatLon())
		{
			DecimalFormat format = new DecimalFormat("0.000");
			double lat = Math.toDegrees(coord.getLatitude());
			double lon = Math.toDegrees(coord.getLongitude());		
			
			text += "\n (lat " + format.format(lat) + DEGREE_STRING + " , lon " + format.format(lon) + DEGREE_STRING + ")";
			
		}		
		
		return text;
	}

	protected Adapter getTimedAdapter() 
	{
		if(timedAdapter == null)
		{
			timedAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{				
					if(msg.getNotifier() instanceof Timed)
					{
						int featureId = msg.getFeatureID(Timed.class);
						
						switch (featureId) 
						{
							case EMFEcorePackage.TIMED__TIME:
								if(isAutoUpdateEnabled()) update();
							break;

							default:
							break;
						}
					}						
				}
			};
		}
		return timedAdapter;
	}

} //SpacecraftLocationWorldWindLayerImpl
