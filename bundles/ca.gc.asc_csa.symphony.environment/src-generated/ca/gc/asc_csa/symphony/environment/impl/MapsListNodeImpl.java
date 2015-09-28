/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.symphony.environment.Map;
import ca.gc.asc_csa.symphony.environment.MapsList;
import ca.gc.asc_csa.symphony.environment.MapsListNode;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;
import ca.gc.space.topology.INodeVisitor;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.impl.AggregateGroupNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maps List Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.MapsListNodeImpl#getMapsList <em>Maps List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapsListNodeImpl extends AggregateGroupNodeImpl implements MapsListNode
{
	private Adapter adapter;
	
  /**
	 * The cached value of the '{@link #getMapsList() <em>Maps List</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMapsList()
	 * @generated
	 * @ordered
	 */
  protected MapsList mapsList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected MapsListNodeImpl()
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
		return SymphonyEnvironmentPackage.Literals.MAPS_LIST_NODE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MapsList getMapsList()
  {
		if (mapsList != null && mapsList.eIsProxy()) {
			InternalEObject oldMapsList = (InternalEObject)mapsList;
			mapsList = (MapsList)eResolveProxy(oldMapsList);
			if (mapsList != oldMapsList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEnvironmentPackage.MAPS_LIST_NODE__MAPS_LIST, oldMapsList, mapsList));
			}
		}
		return mapsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MapsList basicGetMapsList()
  {
		return mapsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMapsList(MapsList newMapsList)
  {
		MapsList oldMapsList = mapsList;
		mapsList = newMapsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.MAPS_LIST_NODE__MAPS_LIST, oldMapsList, mapsList));
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
			case SymphonyEnvironmentPackage.MAPS_LIST_NODE__MAPS_LIST:
				if (resolve) return getMapsList();
				return basicGetMapsList();
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
			case SymphonyEnvironmentPackage.MAPS_LIST_NODE__MAPS_LIST:
				setMapsList((MapsList)newValue);
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
			case SymphonyEnvironmentPackage.MAPS_LIST_NODE__MAPS_LIST:
				setMapsList((MapsList)null);
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
			case SymphonyEnvironmentPackage.MAPS_LIST_NODE__MAPS_LIST:
				return mapsList != null;
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
	  getChildren().clear();
  }
  
	protected void addMap(Map map)
  	{
  		//System.out.println("SurfaceWorksiteNodeImpl.addMap() " + map);
  		
  		getChildren().add(map.getMapNode());
  	}
  	
  	protected void removeMap(Map map)
  	{
  		//System.out.println("SurfaceWorksiteNodeImpl.removeMap() " + map);
  		
  		getChildren().remove(map.getMapNode());
  	}
  
  protected Adapter getAdapter() 
  {
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{				
				@SuppressWarnings("unchecked")
				@Override
				public void notifyChanged(Notification notification) 
				{					
					super.notifyChanged(notification);
					
					// System.out.println("=======> notification " + notification);
	
					if(notification.getNotifier() instanceof MapsListNode)
					{
						if(notification.getFeatureID(MapsListNode.class) == SymphonyEnvironmentPackage.MAPS_LIST_NODE__MAPS_LIST)
						{
							clearTopology();
							
							if(notification.getOldValue() instanceof MapsList)
							{
								((MapsList)notification.getOldValue()).eAdapters().remove(getAdapter());
							}
							
							if(notification.getNewValue() instanceof MapsList)
							{
								((MapsList)notification.getNewValue()).eAdapters().add(getAdapter());
							}
						}
					}
					else if(notification.getNotifier() instanceof MapsList)
					{
						switch(notification.getEventType())
						{
							case Notification.ADD:
							{
								Map mapAdded = (Map) notification.getNewValue();
								addMap(mapAdded);
								break;
							}
							case Notification.ADD_MANY:
							{
								Collection<? extends Map> mapsAdded = (Collection<? extends Map>) notification.getNewValue();
								for (Map map : mapsAdded) 
								{
									addMap(map);
								}
								break;
							}
							case Notification.REMOVE:
							{
								Map mapRemoved = (Map) notification.getOldValue();
								removeMap(mapRemoved);
								break;
							}
							case Notification.REMOVE_MANY:
							{
								Collection<? extends Map> mapsRemoved = (Collection<? extends Map>) notification.getOldValue();
								for (Map map : mapsRemoved) 
								{
									removeMap(map);
								}								
								break;
							}
							default:
							{								
							}
						}
					}
				}
			};
		}
		return adapter;
  }

  
} //MapsListNodeImpl
