package ca.gc.asc_csa.topology.ui.jme3.scene_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import ca.gc.asc_csa.eclipse.utils.log.EventSeverity;
import ca.gc.asc_csa.eclipse.utils.log.Logger;
import ca.gc.asc_csa.topology.ui.jme3.Activator;
import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.jme3.JME3Utilities;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.PositionNode;
import ca.gc.space.topology.RotationNode;
import ca.gc.space.topology.TopologyPackage;
import ca.gc.space.topology.TransformNode;
import ca.gc.space.topology.ui.adapters.TransformNodeSceneObject;

import com.jme3.asset.AssetManager;
import com.jme3.math.Transform;
import com.jme3.scene.Geometry;

public abstract class AbstractTransformationJME3SceneObject<T extends Node> extends
						DefaultJME3SceneObject<T> implements TransformNodeSceneObject, Adapter 
{
	private float previousAxisLenght = 1.0f;
	private boolean axisVisible = true;
	
	private Geometry axisGeometry = null;	
	
	private AssetManager assetManager;
	
	public AbstractTransformationJME3SceneObject(T topologyNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(topologyNode, jme3RenderEngineDelegate);

		this.assetManager = jme3Application.getAssetManager();

		// Register to the node.
		registerListener(topologyNode);
	
		// Creates the 3DAxis.
		axisGeometry = JME3Utilities.createAxis3D(1.0f, assetManager);
		
		// Attaches the 3DAxis if required.
		if(axisVisible) getAttachmentNode().attachChild(axisGeometry);		
								
		// Updates the transform.
		updateTransform();
	}
	
	@Override
	public void dispose() 
	{
		// Removes listener from topology node.
		if(getTopologyNode() != null)
		{
			unRegisterListener(getTopologyNode());			
		}
		super.dispose();
	}
	
	@Override
	public List<Geometry> getGeometries() 
	{		
		List<Geometry> geometries = new ArrayList<Geometry>();
		if(axisGeometry != null) geometries.add(axisGeometry);
		return geometries;
	}
	
	@Override
	public void setAxisVisible(final boolean visible) 
	{		
		Logger.INSTANCE.log(Activator.ID, this, "Setting axis visible to <" + visible + ">.", EventSeverity.INFO);
		this.axisVisible = visible;
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				if(axisVisible)
				{
					getAttachmentNode().attachChild(axisGeometry);
				}
				else
				{
					getAttachmentNode().detachChild(axisGeometry);
				}
				return null;
			}
		});				
	}

	@Override
	public void setAxisLength(double length) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Setting axis length to <" + length + ">.", EventSeverity.INFO);
		
		jme3Application.enqueue(new Callable<Object>() 
		{
				@Override
				public Object call() throws Exception 
				{
					try
					{
						float scale = (float) Math.abs(length) / previousAxisLenght;
						
						// Scales existing axis.
						if(axisGeometry != null ) axisGeometry.scale(scale);
						
						previousAxisLenght = (float) length;
					}
					catch(Throwable t)
					{
						Logger.INSTANCE.log(Activator.ID, this, "Failed to setAxisLength(" + length + ")!", EventSeverity.ERROR, t);
					}
					
					return null;
				}
		});			
	}
	
	@Override
	public void notifyChanged(Notification notification) 
	{
		if(notification.getNotifier() instanceof TransformNode)
		{
			int featureId = notification.getFeatureID(TransformNode.class);									
			if (featureId == TopologyPackage.TRANSFORM_NODE__POSITION) 
			{
				// Unregister from previous position
				if(notification.getOldValue() instanceof ca.gc.space.math.Tuple3d)
				{
					ca.gc.space.math.Tuple3d oldValue = (ca.gc.space.math.Tuple3d) notification.getOldValue();
					oldValue.eAdapters().remove(this);
				}
				
				updateTransform();
				
				// Register to new position.
				if(notification.getNewValue() instanceof ca.gc.space.math.Tuple3d)
				{
					ca.gc.space.math.Tuple3d newValue = (ca.gc.space.math.Tuple3d) notification.getNewValue();
					newValue.eAdapters().add(this);
				}
			}
			else if(featureId == TopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX)
			{
				// Unregister from previous matrix
				if(notification.getOldValue() instanceof ca.gc.space.math.Matrix3x3)
				{
					ca.gc.space.math.Matrix3x3 oldValue = (ca.gc.space.math.Matrix3x3) notification.getOldValue();
					oldValue.eAdapters().remove(this);
				}
				
				updateTransform();
				
				// Register to new matrix.
				if(notification.getNewValue() instanceof ca.gc.space.math.Matrix3x3)
				{
					ca.gc.space.math.Matrix3x3 newValue = (ca.gc.space.math.Matrix3x3) notification.getNewValue();
					newValue.eAdapters().add(this);
				}							
			}
		}
		else if(notification.getNotifier() instanceof RotationNode)
		{
			int featureId = notification.getFeatureID(RotationNode.class);									
			if (featureId == TopologyPackage.ROTATION_NODE__ROTATION_MATRIX) 
			{
				// Unregister from previous matrix
				if(notification.getOldValue() instanceof ca.gc.space.math.Matrix3x3)
				{
					ca.gc.space.math.Matrix3x3 oldValue = (ca.gc.space.math.Matrix3x3) notification.getOldValue();
					oldValue.eAdapters().remove(this);
				}
				
				updateTransform();
				
				// Register to new matrix.
				if(notification.getNewValue() instanceof ca.gc.space.math.Matrix3x3)
				{
					ca.gc.space.math.Matrix3x3 newValue = (ca.gc.space.math.Matrix3x3) notification.getNewValue();
					newValue.eAdapters().add(this);
				}
			}
		}
		else if(notification.getNotifier() instanceof PositionNode)
		{
			int featureId = notification.getFeatureID(PositionNode.class);									
			if (featureId == TopologyPackage.POSITION_NODE__POSITION) 
			{
				// Unregister from previous position
				if(notification.getOldValue() instanceof ca.gc.space.math.Tuple3d)
				{
					ca.gc.space.math.Tuple3d oldValue = (ca.gc.space.math.Tuple3d) notification.getOldValue();
					oldValue.eAdapters().remove(this);
				}
				
				updateTransform();
				
				// Register to new position.
				if(notification.getNewValue() instanceof ca.gc.space.math.Tuple3d)
				{
					ca.gc.space.math.Tuple3d newValue = (ca.gc.space.math.Tuple3d) notification.getNewValue();
					newValue.eAdapters().add(this);
				}								
			}
		}		
		else if(notification.getNotifier() instanceof ca.gc.space.math.Tuple3d)
		{
			updateTransform();
		}
		else if(notification.getNotifier() instanceof ca.gc.space.math.Matrix3x3)
		{
			updateTransform();
		}
	}

	@Override
	public Notifier getTarget() {		
		return null;
	}


	@Override
	public void setTarget(Notifier newTarget) {		
	}


	@Override
	public boolean isAdapterForType(Object type) {
		return false;
	}
	
	protected void registerListener(T topologyNode)
	{
		topologyNode.eAdapters().add(this);
		if(topologyNode instanceof TransformNode)
		{
			TransformNode transformNode = (TransformNode) topologyNode;
			if(transformNode.getRotationMatrix() != null) transformNode.getRotationMatrix().eAdapters().add(this);
			if(transformNode.getPosition() != null) transformNode.getPosition().eAdapters().add(this);			
		}
		else if(topologyNode instanceof RotationNode)
		{
			RotationNode rotationNode = (RotationNode) topologyNode;
			if(rotationNode.getRotationMatrix() != null) rotationNode.getRotationMatrix().eAdapters().add(this);
		}
		else if(topologyNode instanceof PositionNode)
		{
			PositionNode positionNode = (PositionNode) topologyNode;
			if(positionNode.getPosition() != null) positionNode.getPosition().eAdapters().add(this);	
		}
	}
	
	protected void unRegisterListener(T topologyNode)
	{
		topologyNode.eAdapters().add(this);
		if(topologyNode instanceof TransformNode)
		{
			TransformNode transformNode = (TransformNode) topologyNode;
			if(transformNode.getRotationMatrix() != null) transformNode.getRotationMatrix().eAdapters().remove(this);
			if(transformNode.getPosition() != null) transformNode.getPosition().eAdapters().remove(this);			
		}
		else if(topologyNode instanceof RotationNode)
		{
			RotationNode rotationNode = (RotationNode) topologyNode;
			if(rotationNode.getRotationMatrix() != null) rotationNode.getRotationMatrix().eAdapters().remove(this);
		}
		else if(topologyNode instanceof PositionNode)
		{
			PositionNode positionNode = (PositionNode) topologyNode;
			if(positionNode.getPosition() != null) positionNode.getPosition().eAdapters().remove(this);	
		}
	}
	
	protected void updateTransform()
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				Matrix4d transformMatrix = new Matrix4d();
				transformMatrix.setIdentity();
				
				if(getTopologyNode() instanceof TransformNode)
				{
					TransformNode transformNode = (TransformNode) getTopologyNode();
					if(transformNode.asMatrix4d() != null) transformMatrix = transformNode.asMatrix4d();
				}
				else if(getTopologyNode() instanceof PositionNode)
				{
					PositionNode positionNode = (PositionNode) getTopologyNode();
					if(positionNode.getPosition() != null)
					{
						transformMatrix.set(new Vector3d(positionNode.getPosition().asTuple3d()));
					}
				}
				else if(getTopologyNode() instanceof RotationNode)
				{
					RotationNode rotationNode = (RotationNode) getTopologyNode();
					if(rotationNode.getRotationMatrix() != null)
					{
						transformMatrix.set(rotationNode.getRotationMatrix().asMatrix3d());
					}
				}
				
				Transform transform = JME3Utilities.createTransform(transformMatrix);		
				getAttachmentNode().setLocalTransform(transform);
				return null;
			}
		});			
	}	
}
