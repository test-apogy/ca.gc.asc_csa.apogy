package ca.gc.space.java3d;

import javax.media.j3d.Appearance;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.PointAttributes;
import javax.media.j3d.Shape3D;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class ThrusterPlume 
{
	public static double DEFAULT_PLUME_ANGLE = Math.toRadians(20.0);
	public static double DEFAULT_MAXIMUM_PLUME_LENGHT = 10.0;
	
	private Appearance app = null;
	private Shape3D shape;		
	private Job plumeUpdateJob = null;
	private DynamicPointArray gasParticles = null;
	
	private double plumeAngle;
	private double maximumPlumelenght;
	private double throttleLevel = 1.0;

	public ThrusterPlume()
	{
		this(DEFAULT_PLUME_ANGLE, DEFAULT_MAXIMUM_PLUME_LENGHT);
	}
	
	public ThrusterPlume(double _plumeAngle, double _maximumPlumelenght)
	{
		plumeAngle = _plumeAngle;
		maximumPlumelenght = _maximumPlumelenght;
				
		initialize();
	}
	
	public double getThrottleLevel() {
		return throttleLevel;
	}

	public void setThrottleLevel(double _throttleLevel) 
	{
		if(_throttleLevel > 1.0)
		{
			this.throttleLevel = 1;
		}
		else if(_throttleLevel < 0.0)
		{
			this.throttleLevel = 0;
		}
		else
		{
			this.throttleLevel = _throttleLevel;
		}				
	}
			
	public Shape3D getShape3D()
	{
		if(shape == null)
		{
			shape = getGasParticles().getShape3D();
			shape.setCapability(Shape3D.ALLOW_GEOMETRY_READ);		
			shape.setCapability(Shape3D.ALLOW_GEOMETRY_WRITE);
			shape.setCapability(Shape3D.ALLOW_APPEARANCE_WRITE);
			
			Appearance appearance = new Appearance();			
			shape.setAppearance(appearance);
		}
		return shape;
	}	
	
	private void initialize()
	{
		// Initialise gas particles.
		initializeGasParticles();
				
		getPlumeUpdateJob().schedule();
	}
		
	private DynamicPointArray getGasParticles()
	{
		if(gasParticles == null)
		{
			gasParticles = new DynamicPointArray();		
		}
		
		return gasParticles;
	}
	
	private void initializeGasParticles()
	{				
		app = new Appearance();
		app.setCapability(Appearance.ALLOW_POINT_ATTRIBUTES_WRITE);
		app.setCapability(Appearance.ALLOW_COLORING_ATTRIBUTES_WRITE);
		app.setColoringAttributes(new ColoringAttributes());
		app.getColoringAttributes().setCapability(ColoringAttributes.ALLOW_COLOR_READ);
		app.getColoringAttributes().setCapability(ColoringAttributes.ALLOW_COLOR_WRITE);
		app.getColoringAttributes().setColor(1.0f, 0.0f, 0.0f);				
		app.setPointAttributes(new PointAttributes());
		app.getPointAttributes().setPointSize(1.0f);
				
		getGasParticles().getShape3D().setAppearance(app);
		
		double r = 0.0;
		double azimuth = 0.0;
		double elevation = 0.0;
		double x = 0;
		double y = 0;
		double z = 0;
									
		for(int i = 0; i < 500; i++)
		{
			r = 0.01 * Math.random();
			azimuth = Math.PI * 2 * (0.5 - Math.random());
			elevation = (Math.PI / 2.0) - ((plumeAngle / 2.0) * Math.random());
			x = r * Math.cos(elevation) * Math.cos(azimuth);
			y = r * Math.cos(elevation) * Math.sin(azimuth);
			z = r * Math.sin(elevation);												
			getGasParticles().add(new Point3d(x,y,z));
		}			
	}
	
	private void updateGasParticles()
	{
		int numberOfParticules = getGasParticles().size();		
		for(int i = 0; i < numberOfParticules; i++)
		{
			double extinctionDistance = maximumPlumelenght * (throttleLevel + (0.5 - Math.random()));
			Point3d p = getGasParticles().get(i);
			Vector3d v = new Vector3d(p);
			
			double r = v.length() + maximumPlumelenght * Math.random();
			v.normalize();
			v.scale(r);
			
			if(v.length() > extinctionDistance)
			{				
				r = 0.01 * Math.random();
				double azimuth = Math.PI * 2 * (0.5 - Math.random());
				double elevation = (Math.PI / 2.0) - ((plumeAngle / 2.0) * Math.random());
				double x = r * Math.cos(elevation) * Math.cos(azimuth);
				double y = r * Math.cos(elevation) * Math.sin(azimuth);
				double z = r * Math.sin(elevation);				
				p.set(x, y, z);
			}
			else
			{
				p.set(v);
			}
		}
		getGasParticles().update();
	}
	
	private Job getPlumeUpdateJob()
	{
		if(plumeUpdateJob == null)
		{
			plumeUpdateJob = new Job("Plume Update")
			{
				@Override
				protected IStatus run(IProgressMonitor monitor) 
				{				
					updateGasParticles();
					schedule(100);							
					return Status.OK_STATUS;
				}
			};
		}
		
		return plumeUpdateJob;
	}
}
