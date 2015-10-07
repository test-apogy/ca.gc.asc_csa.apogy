package org.eclipse.symphony.core.environment.ui.jme3.scene_objects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.Callable;

import javax.vecmath.Point3f;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.symphony.core.environment.EnvironmentUtilities;
import org.eclipse.symphony.core.environment.Star;
import org.eclipse.symphony.core.environment.StarField;
import org.eclipse.symphony.core.environment.ui.Activator;
import org.eclipse.symphony.core.environment.ui.EnvironmentUiUtilities;
import org.eclipse.symphony.core.environment.ui.StarFieldSceneObject;
import org.eclipse.symphony.core.environment.ui.preferences.SymphonyEnvironmentUIPreferencesConstants;

import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;

public class StarFieldJME3Object extends DefaultJME3SceneObject<StarField> implements StarFieldSceneObject
{					
	public static final float MAGNITUDE_GROUP_RANGE = 0.5f;
	public static final float MIN_POINT_SIZE = 0.5f;
	public static final float MAX_POINT_SIZE = 4.0f;	
	
	private StarField starField = null;		
	private int minMagnitudeLevel = 0;
	private int maxMagnitudeLevel = 10;

	private SortedMap<Float, Geometry> starsMagnitudeToGeometry = new TreeMap<Float, Geometry>();
	
	private AssetManager assetManager;	
		
	public StarFieldJME3Object(StarField node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);
				
		this.assetManager = jme3Application.getAssetManager();
		this.starField = node;
		
		Job job = new Job("StarFieldJME3Object : Updating Geometry") 
		{			
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{
				updateGeometry();	
				
				IPreferenceStore store = Activator.getDefault().getPreferenceStore();
				float magnitudeCutoff = (float) store.getDouble(SymphonyEnvironmentUIPreferencesConstants.DEFAULT_STAR_MAGNITUDE_CUTOFF_ID);				
				setCutOffMagnitude(magnitudeCutoff);
				return Status.OK_STATUS;
			}
		};
		job.schedule();				
	}
	
	@Override
	public List<Geometry> getGeometries() 
	{		
		List<Geometry> geometries = new ArrayList<Geometry>();
		
		for(Geometry geometry : starsMagnitudeToGeometry.values())
		{
			geometries.add(geometry);
		}
		return geometries;				
	}
		
	public void setCutOffMagnitude(float cutOffMagnitude)
	{		
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{	
				SortedMap<Float, Geometry> toSwitchOff = starsMagnitudeToGeometry.tailMap(new Float(cutOffMagnitude));
				Iterator<Geometry> itOff = toSwitchOff.values().iterator();
				while(itOff.hasNext())
				{
					Geometry s = itOff.next();
					if(s != null) getAttachmentNode().detachChild(s);
				}
				
				SortedMap<Float, Geometry> toSwitchOn = starsMagnitudeToGeometry.headMap(new Float(cutOffMagnitude));
				Iterator<Geometry> itOn = toSwitchOn.values().iterator();
				while(itOn.hasNext())
				{
					Geometry s = itOn.next();
					if(s != null) getAttachmentNode().attachChild(s);
				}
				
				return null;
			}	
		});	
	}
	
	private void updateGeometry()
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{					
				// Detach previous geometry
				for(Geometry geometry : starsMagnitudeToGeometry.values())
				{
					if(geometry != null) getAttachmentNode().detachChild(geometry);					
				}
				
				// Creates the stars.
				createStars();
				
				// Attach new geometry
				for(Geometry geometry : starsMagnitudeToGeometry.values())
				{
					if(geometry != null) getAttachmentNode().attachChild(geometry);	
				}
				
				return null;
			}	
		});		
	}
	
	private void createStars()
	{
		starsMagnitudeToGeometry.clear();
		
		// Sorts the stars by magnitude.
		SortedSet<Star> sortedStars = EnvironmentUtilities.INSTANCE.sortByMagnitude(this.starField.getStars());

		// Gets the minimum and maximum magnitude.		
		minMagnitudeLevel = (int) Math.floor(sortedStars.first().getMagnitude());
		maxMagnitudeLevel = (int) Math.ceil(sortedStars.last().getMagnitude());

		int numberOfMagnitudeLevels = Math.round((maxMagnitudeLevel - minMagnitudeLevel) / MAGNITUDE_GROUP_RANGE);							
		float minMagnitude = minMagnitudeLevel;		

		List<Star> starsWithinMagnitude = new ArrayList<Star>();
		
		
		for(int j = 0; j < numberOfMagnitudeLevels; j++)
		{
			starsWithinMagnitude.clear();			
			Iterator<Star> it = sortedStars.iterator();
			while(it.hasNext())
			{
				Star s = it.next();
				if((s.getMagnitude() >= minMagnitude) && (s.getMagnitude() < (minMagnitude + MAGNITUDE_GROUP_RANGE)))
				{
					starsWithinMagnitude.add(s);
				}								
			}	
			
			if(starsWithinMagnitude.size() > 0)
			{
				Mesh starsGroupMesh = getShapeForStars(starsWithinMagnitude, minMagnitude);
				
				String name = "Stars with " + Float.toString(minMagnitude) + " < Magnitude < " + Float.toString((minMagnitude + MAGNITUDE_GROUP_RANGE));				
				Geometry starsGroupGeometry = new Geometry(name, starsGroupMesh);
				
				// Adds Material
				Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
				mat.setColor("Color", ColorRGBA.White);
				starsGroupGeometry.setMaterial(mat);
								
				starsMagnitudeToGeometry.put(new Float(minMagnitude), starsGroupGeometry);				
			}
			
			minMagnitude += MAGNITUDE_GROUP_RANGE;		
		}				
	}
	
	
	private Mesh getShapeForStars(List<Star> stars, float magnitude)
	{				
		float pointSize = EnvironmentUiUtilities.INSTANCE.getPointSizeForMagnitude(magnitude, minMagnitudeLevel, maxMagnitudeLevel, MIN_POINT_SIZE, MAX_POINT_SIZE);
		
		Vector3f[] vertices = new Vector3f[stars.size()];	
	
		for(int i =0; i < stars.size(); i++)
		{			
			Star star = stars.get(i);	
			Point3f p = EnvironmentUiUtilities.INSTANCE.toPoint3f(star);
			p.scale((float) EarthSkyNodeJME3Object.CELESTIAL_SPHERE_RADIUS);
			vertices[i] = new Vector3f(p.x, p.y, p.z);			
		}
				
		Mesh mesh = new Mesh();		
		mesh.setMode(com.jme3.scene.Mesh.Mode.Points);
		mesh.setPointSize(pointSize);
		mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, com.jme3.util.BufferUtils.createFloatBuffer(vertices));				
		mesh.updateBound();
		mesh.updateCounts();
		
		return mesh;
	}
}