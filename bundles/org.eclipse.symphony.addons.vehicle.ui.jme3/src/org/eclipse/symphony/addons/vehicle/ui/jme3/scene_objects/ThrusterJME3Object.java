package org.eclipse.symphony.addons.vehicle.ui.jme3.scene_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage;
import org.eclipse.symphony.addons.vehicle.Thruster;
import org.eclipse.symphony.addons.vehicle.ui.ThrusterSceneObject;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;
import org.eclipse.symphony.common.topology.ui.jme3.JME3Utilities;
import org.eclipse.symphony.common.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;
import org.eclipse.symphony.core.topology.ui.Activator;

import com.jme3.asset.AssetManager;
import com.jme3.effect.ParticleEmitter;
import com.jme3.effect.ParticleMesh.Type;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.util.BufferUtils;

public class ThrusterJME3Object extends DefaultJME3SceneObject<Thruster> implements ThrusterSceneObject
{							
	private static final float FIRE_PARTICLE_SPEED = 30.0f;
	private static final float SMOKE_PARTICLE_SPEED = 10.0f;
	
	private static final int FIRE_PARTICLE_NUMBER = 3000;
	private static final int SMOKE_PARTICLE_NUMBER = 1500;
	
	private Adapter adapter;			
	private AssetManager assetManager;	
	
	private Geometry plumeGeometry = null;
	private boolean plumeEnvelopeVisible = false;
	private double plumeEnvelopeLenght = 1.0;
	private ColorRGBA plumeEnvelopeColor = ColorRGBA.White;
	
	private ParticleEmitter fireEmitter;
	private ParticleEmitter smokeEmitter;

	
	
	public ThrusterJME3Object(Thruster node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);
				
		this.assetManager = jme3Application.getAssetManager();
						
		plumeGeometry = createPlumeGeometry();
		// getAttachmentNode().attachChild(plumeGeometry);
		
		fireEmitter = createFireEmitter((float) node.getPlumeAngle());		
		getAttachmentNode().attachChild(fireEmitter);
		
		smokeEmitter = createSmokeEmitter((float) node.getPlumeAngle());
		getAttachmentNode().attachChild(smokeEmitter);
		
		// Updates the plume.
		updateExhaustPlume((float) getTopologyNode().getThrustLevel(), (float) getTopologyNode().getPlumeAngle());
		
		// Listens for change of the thruster.
		getTopologyNode().eAdapters().add(getAdapter());				
	}
	
	@Override
	public List<Geometry> getGeometries() 
	{		
		List<Geometry> geometries = new ArrayList<Geometry>();
		geometries.add(plumeGeometry);
		return geometries;
	}
		
	
	@Override
	public void dispose()
	{
		if(getTopologyNode() != null)
		{
			getTopologyNode().eAdapters().remove(getAdapter());
		}
					
		if(fireEmitter != null)
		{
			fireEmitter.killAllParticles();			
		}
		
		if(smokeEmitter != null)
		{
			smokeEmitter.killAllParticles();			
		}
		
		// Calls super.
		super.dispose();
	}
			
	private void updateGeometry()
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{						
				// Detach previous geometry.
				if(plumeGeometry != null)
				{
					getAttachmentNode().detachChild(plumeGeometry);
				}
				
				plumeGeometry = createPlumeGeometry();
				
				if(plumeEnvelopeVisible) getAttachmentNode().attachChild(plumeGeometry);
				
				return null;
			}	
		});		
	}
	
	@Override
	public void setColor(RGB rgb) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Setting Plume Envelope Color to <" + rgb + "> ...", EventSeverity.INFO);
		this.plumeEnvelopeColor = JME3Utilities.convertToColorRGBA(rgb);
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{										
				if(plumeGeometry != null)
				{		
					Material mat = plumeGeometry.getMaterial();
					mat.setColor("Diffuse", plumeEnvelopeColor.clone());
					mat.setColor("Ambient", plumeEnvelopeColor.clone());
					mat.setColor("Specular", plumeEnvelopeColor.clone());								
				}														
				return null;
			}	
		});	
	}
	
	@Override
	public void setPlumeEnvelopeVisible(boolean visible) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Setting Plume Visibility to <" + visible + ">...", EventSeverity.INFO);
		this.plumeEnvelopeVisible = visible;
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{						
				if(plumeEnvelopeVisible)
				{
					if(plumeGeometry == null) plumeGeometry = createPlumeGeometry();
					
					if(!getAttachmentNode().hasChild(plumeGeometry))
					{
						getAttachmentNode().attachChild(plumeGeometry);
					}
					
				}
				else
				{
					if(plumeGeometry != null) getAttachmentNode().detachChild(plumeGeometry);					
				}
				
				return null;
			}	
		});	
	}
	
	@Override
	public void setPlumeEnvelopeLenght(double lenght) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Setting Plume Lenght to <" + lenght + "> m...", EventSeverity.INFO);
		this.plumeEnvelopeLenght = lenght;
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{		
				// Detach previous plume envelope.
				if(plumeGeometry != null)
				{
					getAttachmentNode().detachChild(plumeGeometry);
				}
				
				// Update the plume geometry
				plumeGeometry = createPlumeGeometry();
				
				// Attach plume envelope if visibile.
				if(plumeEnvelopeVisible)
				{
					getAttachmentNode().attachChild(plumeGeometry);							
				}				
				return null;
			}	
		});			
	}
	
	private Geometry createPlumeGeometry()
	{
		Geometry geometry = new Geometry("Plume Envelope", createPlumeMesh());				
		geometry.setMaterial(createPlumeMaterial());		
		return geometry;
	}
	
	private Mesh createPlumeMesh()
	{
		Mesh cone = createPlumeEnvelop((float) getTopologyNode().getPlumeAngle(), (float) plumeEnvelopeLenght, 32);					
		return cone;
	}
	
	private Material createPlumeMaterial()
	{
		ColorRGBA color = plumeEnvelopeColor.clone();				
		Material mat = new Material(assetManager,  "Common/MatDefs/Light/Lighting.j3md");	
									
		if(color != null)
		{
			mat.setColor("Diffuse", color);
			mat.setColor("Ambient", color);
			mat.setColor("Specular", color);
		}		
				
		mat.setFloat("Shininess",64f); 	
		mat.setBoolean("UseMaterialColors",true);  											
		
		return mat;
	}
	
	private ParticleEmitter createFireEmitter(float angle)
	{
		ParticleEmitter emit = new ParticleEmitter("ThrusterFireEmitter", Type.Triangle, FIRE_PARTICLE_NUMBER);
		emit.setGravity(0, 0, 0);
		emit.getParticleInfluencer().setInitialVelocity(new Vector3f(0,0,FIRE_PARTICLE_SPEED));		
		
		float velVariation = angle / FastMath.TWO_PI;
		emit.getParticleInfluencer().setVelocityVariation(velVariation);
		emit.setLowLife(0.015f);
		emit.setHighLife(0.016f);		
		emit.setStartSize(0.1f);
		emit.setEndSize(0.01f);		
		emit.setEndColor(  new ColorRGBA(1f, 0f, 0f, 1f));   // red
		emit.setStartColor(new ColorRGBA(1f, 1f, 0f, 0.0f)); // yellow
		
		emit.setImagesX(15);
		Material mat = new Material(assetManager,"Common/MatDefs/Misc/Particle.j3md");
		mat.setTexture("Texture",assetManager.loadTexture("Effects/Smoke/Smoke.png"));
		emit.setMaterial(mat);
		
		emit.setParticlesPerSec(0);
		return emit;
	}
	
	private ParticleEmitter createSmokeEmitter(float angle)
	{
		ParticleEmitter emit = new ParticleEmitter("ThrusterSmokeEmitter", Type.Triangle, SMOKE_PARTICLE_NUMBER);
		emit.setGravity(0, 0, 0);
		emit.getParticleInfluencer().setInitialVelocity(new Vector3f(0,0,SMOKE_PARTICLE_SPEED));	
		
		float velVariation = angle / FastMath.TWO_PI;
		emit.getParticleInfluencer().setVelocityVariation(velVariation);
		emit.setLowLife(0.1f);
		emit.setHighLife(0.5f);		
		emit.setStartSize(0.05f);
		emit.setEndSize(0.5f);		   
		emit.setStartColor(new ColorRGBA(0.588f, 0.20f, 0.0f, 0.3f)); // brown
		emit.setEndColor(new ColorRGBA(0.5f, 0.5f, 0.5f, 0.1f)); // gray
		emit.setImagesX(15);
		Material mat = new Material(assetManager,"Common/MatDefs/Misc/Particle.j3md");
		mat.setTexture("Texture",assetManager.loadTexture("Effects/Smoke/Smoke.png"));
		emit.setMaterial(mat);
		
		emit.setParticlesPerSec(0);		
		return emit;
	}
	
	private Mesh createPlumeEnvelop(float apexAngle, float maxRadius, int numberOfFaces)
	{
		Mesh mesh = null;	
		
		List<Vector3f> verticesList = new ArrayList<Vector3f>();
		List<Integer> indexesList = new ArrayList<Integer>();
		List<Vector3f> normalslList = new ArrayList<Vector3f>();	
		
		if(apexAngle != 0)
		{
			// If the apex angle is larger than one, creates the geometry to represents the truncated cone.				
			int verticeIndex = 0;	
			
			double angle = 0;
			double angleIncrement = (Math.toRadians(360) / numberOfFaces);
			
			float x0 = 0;
			float y0 = 0;
			float z0 = 0;
			
			float x1 = 0;
			float y1 = 0;
			float z1 = 0;
			
			for(int i = 0; i < numberOfFaces; i++)
			{
				float rXY = (float) (maxRadius * Math.tan(apexAngle / 2.0f));
				
				x0 = (float) (rXY * Math.cos(angle));
				y0 = (float) (rXY * Math.sin(angle));
				
				x1 = (float) (rXY * Math.cos(angle + angleIncrement));
				y1 = (float) (rXY * Math.sin(angle + angleIncrement));
				
				z0 = maxRadius;
				z1 = maxRadius;
								
				Vector3f origin = new Vector3f();
				Vector3f p0 = new Vector3f(x0,y0,z0);
				Vector3f p1 = new Vector3f(x1,y1,z1);
				
				// First Triangle.
				verticesList.add(origin);					
				indexesList.add(new Integer(verticeIndex));
				verticeIndex++;
				
				verticesList.add(p1);
				indexesList.add(new Integer(verticeIndex));
				verticeIndex++;
				
				verticesList.add(p0);
				indexesList.add(new Integer(verticeIndex));
				verticeIndex++;
				
				// First Triangle normal
				// Compute normal
				Vector3f normal1 = JME3Utilities.computeTriangleNormal(origin, p1, p0);
				normalslList.add(normal1);	
				normalslList.add(normal1);	
				normalslList.add(normal1);	
				
				angle += angleIncrement;
			}						
		}
		else
		{
			// Fills in the vertices				
			verticesList.add(new Vector3f(0f, 0f, 0f));
			verticesList.add(new Vector3f(0f, 0f, (float) maxRadius));

			// Fills in the index
			indexesList.add(new Integer(0));
			indexesList.add(new Integer(1));
			indexesList.add(new Integer(0));
			
			// Fills in the normals
			normalslList.add(new Vector3f(0f, 0f, 1f));	
		}
		
		mesh = new Mesh();
		mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticesList)));
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 3, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Normal, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(normalslList)));							
		mesh.updateBound();
		
		return mesh;
	}
	
	/**
	 * Updates the thrust and angle of the plume.
	 * @param thrust The new thrust (between 0 and 1.0).
	 * @param plumeAngle The plume angle, in radians.
	 */
	private void updateExhaustPlume(float thrust, float plumeAngle)
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				float velocityVariation = plumeAngle / FastMath.TWO_PI;
				
				if(fireEmitter != null)
				{					
					fireEmitter.setParticlesPerSec(fireEmitter.getMaxNumParticles() * thrust);					
					fireEmitter.getParticleInfluencer().setVelocityVariation(velocityVariation);
				}
				
				if(smokeEmitter != null)
				{
					smokeEmitter.setParticlesPerSec(smokeEmitter.getMaxNumParticles() * thrust);	
					smokeEmitter.getParticleInfluencer().setVelocityVariation(velocityVariation);
				}
				return null;
			}
		});
	}
	
	private Adapter getAdapter()
	{
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{					
					if(msg.getNotifier() instanceof Thruster)
					{												
						int featureId = msg.getFeatureID(Thruster.class);
					
						switch (featureId) 
						{
							case SymphonyToolsVehiclePackage.THRUSTER__PLUME_ANGLE:
								updateExhaustPlume((float) getTopologyNode().getThrustLevel(), (float) getTopologyNode().getPlumeAngle());
								updateGeometry();
							break;
							case SymphonyToolsVehiclePackage.THRUSTER__THRUST_LEVEL:
								updateExhaustPlume((float) getTopologyNode().getThrustLevel(), (float) getTopologyNode().getPlumeAngle());
							break;

							default:
							break;
						}
					}
				}
			};
		}
		return adapter;
	}
}
