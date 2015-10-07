/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.core.environment.EarthSurfaceWorksite;
import org.eclipse.symphony.core.environment.EarthSurfaceWorksiteNode;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;
import org.eclipse.symphony.core.environment.Worksite;

import ca.gc.space.topology.INodeVisitor;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.TopologyFacade;
import ca.gc.space.topology.TransformNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Surface Worksite Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.EarthSurfaceWorksiteNodeImpl#getSkyTransformNode <em>Sky Transform Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EarthSurfaceWorksiteNodeImpl extends SurfaceWorksiteNodeImpl implements EarthSurfaceWorksiteNode
{
  private Adapter earthSurfaceWorksiteAdapter;
	
  /**
	 * The cached value of the '{@link #getSkyTransformNode() <em>Sky Transform Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSkyTransformNode()
	 * @generated
	 * @ordered
	 */
  protected TransformNode skyTransformNode;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EarthSurfaceWorksiteNodeImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return SymphonyEnvironmentPackage.Literals.EARTH_SURFACE_WORKSITE_NODE;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public TransformNode getSkyTransformNode()
  {
	  TransformNode t = getSkyTransformNodeGen();
	  if(t == null)
	  {
		  if(getWorksite() instanceof EarthSurfaceWorksite)
		  {
			  EarthSurfaceWorksite earthSurfaceWorksite = (EarthSurfaceWorksite) getWorksite();
			  t = TopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0, 0, earthSurfaceWorksite.getXAxisAzimuth());			  
		  }
		  else
		  {
			  t = TopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0, 0, 0);  
		  }		  		  		  
		  t.setNodeId("SKY_TRANSFORM");
		  t.setDescription("Transform used to orient the sky to factor in the EarthSurfaceWorksite X Axis Azimuth.");
		  getChildren().add(t);
		  t.setParent(this); // Should not have to this this explicitly.
		  
		  setSkyTransformNode(t);
	  }
	  
	  return t;
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TransformNode getSkyTransformNodeGen()
  {
		if (skyTransformNode != null && skyTransformNode.eIsProxy()) {
			InternalEObject oldSkyTransformNode = (InternalEObject)skyTransformNode;
			skyTransformNode = (TransformNode)eResolveProxy(oldSkyTransformNode);
			if (skyTransformNode != oldSkyTransformNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEnvironmentPackage.EARTH_SURFACE_WORKSITE_NODE__SKY_TRANSFORM_NODE, oldSkyTransformNode, skyTransformNode));
			}
		}
		return skyTransformNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TransformNode basicGetSkyTransformNode()
  {
		return skyTransformNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSkyTransformNode(TransformNode newSkyTransformNode)
  {
		TransformNode oldSkyTransformNode = skyTransformNode;
		skyTransformNode = newSkyTransformNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.EARTH_SURFACE_WORKSITE_NODE__SKY_TRANSFORM_NODE, oldSkyTransformNode, skyTransformNode));
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
			case SymphonyEnvironmentPackage.EARTH_SURFACE_WORKSITE_NODE__SKY_TRANSFORM_NODE:
				if (resolve) return getSkyTransformNode();
				return basicGetSkyTransformNode();
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
			case SymphonyEnvironmentPackage.EARTH_SURFACE_WORKSITE_NODE__SKY_TRANSFORM_NODE:
				setSkyTransformNode((TransformNode)newValue);
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
			case SymphonyEnvironmentPackage.EARTH_SURFACE_WORKSITE_NODE__SKY_TRANSFORM_NODE:
				setSkyTransformNode((TransformNode)null);
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
			case SymphonyEnvironmentPackage.EARTH_SURFACE_WORKSITE_NODE__SKY_TRANSFORM_NODE:
				return skyTransformNode != null;
		}
		return super.eIsSet(featureID);
	}
  
  @Override
  public void setWorksite(Worksite newWorksite) 
  {	
	  	// Unregister from previous EarthSurfaceWorksite if applicable
	  	if(getWorksite() instanceof EarthSurfaceWorksite)
	  	{
	  		getWorksite().eAdapters().remove(getEarthSurfaceWorksiteAdapter());
	  	}
	  
		super.setWorksite(newWorksite);
		
		// Register to new EarthSurfaceWorksite if applicable
		if(newWorksite instanceof EarthSurfaceWorksite)
		{
			EarthSurfaceWorksite earthSurfaceWorksite = (EarthSurfaceWorksite) newWorksite;									
			earthSurfaceWorksite.eAdapters().add(getEarthSurfaceWorksiteAdapter());
			
			updateSkyTransform(earthSurfaceWorksite.getXAxisAzimuth());
		}		
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
  
  private void updateSkyTransform(double xAxisAzimuth)
  {
	  Matrix4d matrix = new Matrix4d();
	  matrix.setIdentity();
	  
	  // Sky is rotated opposite of worksite relative to north.
	  matrix.rotZ(-xAxisAzimuth);
	  
	  getSkyTransformNode().setTransformation(matrix);
  }
  
  private Adapter getEarthSurfaceWorksiteAdapter()
  {
	  if(earthSurfaceWorksiteAdapter == null)
	  {
		  earthSurfaceWorksiteAdapter = new AdapterImpl()
		  {
			  @Override
			  public void notifyChanged(Notification msg) 
			  {				
				  if(msg.getFeatureID(EarthSurfaceWorksite.class) == SymphonyEnvironmentPackage.EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH)
				  {
					  updateSkyTransform(msg.getNewDoubleValue()); 
				  }
			  }  
		  };
	  }
	  
	  return earthSurfaceWorksiteAdapter;
  }
} //EarthSurfaceWorksiteNodeImpl
