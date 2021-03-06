package ca.gc.asc_csa.apogy.core.environment.impl;
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

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.topology.INodeVisitor;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ReferencedGroupNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFactory;
import ca.gc.asc_csa.apogy.common.topology.impl.TransformNodeImpl;
import ca.gc.asc_csa.apogy.core.environment.AbstractMapLayer;
import ca.gc.asc_csa.apogy.core.environment.AbstractMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.Activator;
import ca.gc.asc_csa.apogy.core.environment.Map;
import ca.gc.asc_csa.apogy.core.environment.MapNode;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.MapNodeImpl#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapNodeImpl extends TransformNodeImpl implements MapNode
{	
	private ReferencedGroupNode referencedGroupNode = null;
	private Adapter adapter = null;
	
  /**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
  protected Map map;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected MapNodeImpl()
  {
    super();
    this.eAdapters().add(getAdapter());
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ApogyCoreEnvironmentPackage.Literals.MAP_NODE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Map getMap()
  {
		if (map != null && map.eIsProxy()) {
			InternalEObject oldMap = (InternalEObject)map;
			map = (Map)eResolveProxy(oldMap);
			if (map != oldMap) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentPackage.MAP_NODE__MAP, oldMap, map));
			}
		}
		return map;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Map basicGetMap()
  {
		return map;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMap(Map newMap)
  {
		Map oldMap = map;
		map = newMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.MAP_NODE__MAP, oldMap, map));
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
			case ApogyCoreEnvironmentPackage.MAP_NODE__MAP:
				if (resolve) return getMap();
				return basicGetMap();
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
			case ApogyCoreEnvironmentPackage.MAP_NODE__MAP:
				setMap((Map)newValue);
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
			case ApogyCoreEnvironmentPackage.MAP_NODE__MAP:
				setMap((Map)null);
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
			case ApogyCoreEnvironmentPackage.MAP_NODE__MAP:
				return map != null;
		}
		return super.eIsSet(featureID);
	}
  
  @Override
  public void accept(INodeVisitor visitor) 
  {
	  if (visitor.getType().isInstance(this)) 
	  {
			visitor.visit(this);
	  }

	  // We do the same for all the children.
	  for (Node child : getChildren()) 
	  {
			child.accept(visitor);
	  }
  }

  private void clearTopology()
  {
	  getReferencedGroupNode().getChildren().clear();
  }
  

  
	/**
	 * Attaches the specified layer topology to the Map topology.
	 * @param layer The Map Layer.
	 * @return The node representing the layer that was attached in the Map topology.
	 */
	protected void addLayer(final AbstractMapLayer layer)
	{		
		getReferencedGroupNode().getChildren().add(layer.getAbstractMapLayerNode());
		Logger.INSTANCE.log(Activator.ID, this, "Added layer <" + layer.getName() + ">.", EventSeverity.INFO);
	}

	/**
	 * Detaches the specified layer topology from the Map topology.
	 * @param layer The Map Layer.
	 * @return The topology node removed.
	 */
	protected void removeLayer(final AbstractMapLayer layer)
	{
		// Find the node that represents the layer in the map topology.
		AbstractMapLayerNode layerNode = layer.getAbstractMapLayerNode();
		
		System.out.println("Layer node to remove : " + layerNode);
		
		// Remove the node from the topology.
		if(layerNode != null)
		{
			// Removes the node from the topology.
			getReferencedGroupNode().getChildren().remove(layerNode);
		}	
		
		
		
		Logger.INSTANCE.log(Activator.ID, this, "Removed layer <" + layer.getName() + ">.", EventSeverity.INFO);
	}

	private ReferencedGroupNode getReferencedGroupNode()
	{
		if(referencedGroupNode == null)
		{
			referencedGroupNode = ApogyCommonTopologyFactory.eINSTANCE.createReferencedGroupNode();
			referencedGroupNode.setDescription("Map Group Node.");
			referencedGroupNode.setNodeId("Map Content (" + getMap().getName() + ")");
			getChildren().add(referencedGroupNode);
		}
		
		return referencedGroupNode;
	}

	protected Adapter getAdapter() 
	{
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{
				@SuppressWarnings("unchecked")
				@Override
				public void notifyChanged(Notification msg) 
				{					
					if(msg.getNotifier() instanceof MapNode)
					{
						if(msg.getFeatureID(MapNode.class) == ApogyCoreEnvironmentPackage.MAP_NODE__MAP)
						{
							// Clear topology.
							clearTopology();
							
							if(msg.getOldValue() instanceof Map)
							{
								((Map) msg.getOldValue()).eAdapters().remove(getAdapter());
							}
							
							if(msg.getNewValue() instanceof Map)
							{
								((Map) msg.getNewValue()).eAdapters().add(getAdapter());
							}
						}
					}
					else if(msg.getNotifier() instanceof Map)
					{						
						if(msg.getFeatureID(Map.class) == ApogyCoreEnvironmentPackage.MAP__LAYERS)
						{
							final Notification message = msg;
							Job job = new Job("MapNode Modify Layers")
							{
								@Override
								protected IStatus run(IProgressMonitor monitor) 
								{
									try
									{
										switch(message.getEventType())
										{
											case Notification.ADD:
											{
												AbstractMapLayer layerAdded = (AbstractMapLayer) message.getNewValue();
												addLayer(layerAdded);
												break;
											}
											case Notification.ADD_MANY:
											{
												Collection<? extends AbstractMapLayer> layersAdded = (Collection<? extends AbstractMapLayer>) message.getNewValue();
												for (AbstractMapLayer abstractMapLayer : layersAdded) 
												{
													addLayer(abstractMapLayer);
												}
												break;
											}
											case Notification.REMOVE:
											{
												AbstractMapLayer layerRemoved = (AbstractMapLayer) message.getOldValue();
												removeLayer(layerRemoved);
												break;
											}
											case Notification.REMOVE_MANY:
											{
												Collection<? extends AbstractMapLayer> layersRemoved = (Collection<? extends AbstractMapLayer>) message.getOldValue();
												for (AbstractMapLayer abstractMapLayer : layersRemoved) 
												{
													removeLayer(abstractMapLayer);
												}								
												break;
											}
											default:
											{								
											}
										}
									return org.eclipse.core.runtime.Status.OK_STATUS;
									}
									catch(Throwable t)
									{
										t.printStackTrace();
									}
									return org.eclipse.core.runtime.Status.OK_STATUS;
								}
							};
							job.setPriority(Job.LONG);
							job.schedule();
							
						}
						else if(msg.getFeatureID(Map.class)== ApogyCoreEnvironmentPackage.MAP__TRANSFORMATION)
						{
							Matrix4x4 matrix = (Matrix4x4) msg.getNewValue();
							if(matrix != null)
							{
								// Updates the transform node.
								setTransformation(matrix.asMatrix4d());
							}
						}
					}					
				}
			};
		}
		
		return adapter;
	}
} //MapNodeImpl
