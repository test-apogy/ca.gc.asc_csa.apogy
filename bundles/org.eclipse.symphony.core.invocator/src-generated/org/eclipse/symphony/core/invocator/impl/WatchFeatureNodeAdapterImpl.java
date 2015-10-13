/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.invocator.Context;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement;
import org.eclipse.symphony.core.invocator.VariableImplementationsList;
import org.eclipse.symphony.core.invocator.Watch;
import org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter;

import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode;
import ca.gc.asc_csa.eclipse.emf.ecore.AbstractRootNode;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcoreFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcoreFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.FeatureNodeAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Watch Feature Node Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.WatchFeatureNodeAdapterImpl#getSourceObject <em>Source Object</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.WatchFeatureNodeAdapterImpl#getFeatureNode <em>Feature Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.WatchFeatureNodeAdapterImpl#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.WatchFeatureNodeAdapterImpl#isResolved <em>Resolved</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WatchFeatureNodeAdapterImpl extends MinimalEObjectImpl.Container implements WatchFeatureNodeAdapter
{
	private FeatureNodeAdapter featureNodeAdapter = null;
	private Adapter featureNodeAdapterAdapter = null;
	
	private List<EObject> eObjects = new ArrayList<EObject>();
	private Adapter adapter = null;
	
	
  /**
	 * The cached value of the '{@link #getSourceObject() <em>Source Object</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSourceObject()
	 * @generated
	 * @ordered
	 */
  protected EObject sourceObject;

  /**
	 * The cached value of the '{@link #getFeatureNode() <em>Feature Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFeatureNode()
	 * @generated
	 * @ordered
	 */
  protected org.eclipse.symphony.common.emf.AbstractFeatureNode featureNode;

  /**
	 * The default value of the '{@link #getCurrentValue() <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCurrentValue()
	 * @generated
	 * @ordered
	 */
  protected static final Object CURRENT_VALUE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getCurrentValue() <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCurrentValue()
	 * @generated
	 * @ordered
	 */
  protected Object currentValue = CURRENT_VALUE_EDEFAULT;

  /**
	 * The default value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
  protected static final boolean RESOLVED_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
  protected boolean resolved = RESOLVED_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WatchFeatureNodeAdapterImpl()
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
		return EMFEcoreInvocatorPackage.Literals.WATCH_FEATURE_NODE_ADAPTER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EObject getSourceObject()
  {
		if (sourceObject != null && sourceObject.eIsProxy()) {
			InternalEObject oldSourceObject = (InternalEObject)sourceObject;
			sourceObject = eResolveProxy(oldSourceObject);
			if (sourceObject != oldSourceObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__SOURCE_OBJECT, oldSourceObject, sourceObject));
			}
		}
		return sourceObject;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EObject basicGetSourceObject()
  {
		return sourceObject;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setSourceObject(EObject newSourceObject)
  {	  
	  // Updates the source of the FeatureNodeAdapter;
	  getFeatureNodeAdapter().setSourceObject(newSourceObject);
	  	  	 
	  // Updates resolved status
	  setResolved(getFeatureNodeAdapter().isResolved());
	  
	  setSourceObjectGen(newSourceObject);
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSourceObjectGen(EObject newSourceObject)
  {
		EObject oldSourceObject = sourceObject;
		sourceObject = newSourceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__SOURCE_OBJECT, oldSourceObject, sourceObject));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public org.eclipse.symphony.common.emf.AbstractFeatureNode getFeatureNode()
  {
		if (featureNode != null && featureNode.eIsProxy()) {
			InternalEObject oldFeatureNode = (InternalEObject)featureNode;
			featureNode = (org.eclipse.symphony.common.emf.AbstractFeatureNode)eResolveProxy(oldFeatureNode);
			if (featureNode != oldFeatureNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__FEATURE_NODE, oldFeatureNode, featureNode));
			}
		}
		return featureNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public org.eclipse.symphony.common.emf.AbstractFeatureNode basicGetFeatureNode()
  {
		return featureNode;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureNode(org.eclipse.symphony.common.emf.AbstractFeatureNode newFeatureNode) {
		org.eclipse.symphony.common.emf.AbstractFeatureNode oldFeatureNode = featureNode;
		featureNode = newFeatureNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__FEATURE_NODE, oldFeatureNode, featureNode));
	}

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setFeatureNode(AbstractFeatureNode newFeatureNode)
  {
	  // Unregister Listeners.
	  unregisterAdapters();
	  
	  // Register listeners.
	  registerAdapters(newFeatureNode);
	  
	  // Updates the FeatureNode.
	  setFeatureNodeGen(newFeatureNode);
	  
	  // Updates the FeatureNodeAdapter FeatureNode.
	  getFeatureNodeAdapter().setFeatureNode(newFeatureNode);
	  
	  // Updates resolved status
	  setResolved(getFeatureNodeAdapter().isResolved());
	  
	  updateSourceObject();
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Object getCurrentValue()
  {
		return currentValue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCurrentValue(Object newCurrentValue)
  {
		Object oldCurrentValue = currentValue;
		currentValue = newCurrentValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__CURRENT_VALUE, oldCurrentValue, currentValue));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isResolved()
  {
		return resolved;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setResolved(boolean newResolved)
  {
		boolean oldResolved = resolved;
		resolved = newResolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__RESOLVED, oldResolved, resolved));
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
			case EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__SOURCE_OBJECT:
				if (resolve) return getSourceObject();
				return basicGetSourceObject();
			case EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__FEATURE_NODE:
				if (resolve) return getFeatureNode();
				return basicGetFeatureNode();
			case EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__CURRENT_VALUE:
				return getCurrentValue();
			case EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__RESOLVED:
				return isResolved();
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
			case EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__SOURCE_OBJECT:
				setSourceObject((EObject)newValue);
				return;
			case EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__FEATURE_NODE:
				setFeatureNode((org.eclipse.symphony.common.emf.AbstractFeatureNode)newValue);
				return;
			case EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__CURRENT_VALUE:
				setCurrentValue(newValue);
				return;
			case EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__RESOLVED:
				setResolved((Boolean)newValue);
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
			case EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__SOURCE_OBJECT:
				setSourceObject((EObject)null);
				return;
			case EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__FEATURE_NODE:
				setFeatureNode((org.eclipse.symphony.common.emf.AbstractFeatureNode)null);
				return;
			case EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__CURRENT_VALUE:
				setCurrentValue(CURRENT_VALUE_EDEFAULT);
				return;
			case EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__RESOLVED:
				setResolved(RESOLVED_EDEFAULT);
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
			case EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__SOURCE_OBJECT:
				return sourceObject != null;
			case EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__FEATURE_NODE:
				return featureNode != null;
			case EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__CURRENT_VALUE:
				return CURRENT_VALUE_EDEFAULT == null ? currentValue != null : !CURRENT_VALUE_EDEFAULT.equals(currentValue);
			case EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__RESOLVED:
				return resolved != RESOLVED_EDEFAULT;
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
		result.append(" (currentValue: ");
		result.append(currentValue);
		result.append(", resolved: ");
		result.append(resolved);
		result.append(')');
		return result.toString();
	}
  
  protected void unregisterAdapters()
  {
	  for(EObject eObject : eObjects)
	  {
		  eObject.eAdapters().remove(getAdapter());
	  }
	  
	  eObjects.clear();	  
  }
  
  protected void registerAdapters(AbstractFeatureNode newFeatureNode)
  {	  
	  Watch watch = EMFEcoreInvocatorFacade.INSTANCE.resolveWatch(newFeatureNode);
	  
	  if(watch != null)
	  {
		  // Register adapter on the Environment.
		  Environment environment = watch.getWatchesList().getWatchesListsContainer().getToolsList().getInvocatorSession().getEnvironment();
		  environment.eAdapters().add(getAdapter());
		  
		  Context activeContext = environment.getActiveContext();
		  if(activeContext != null)
		  {			  
			  // Register adapter on the active context
			  activeContext.eAdapters().add(getAdapter());
			  
			  if(activeContext.getVariableImplementationsList() != null)
			  {
				  // Register adapter on the VariableImplementationsList.
				  activeContext.getVariableImplementationsList().eAdapters().add(getAdapter());
			  }			  
		  }		  
	  }
  }
  
  private void updateSourceObject()
  {
	  if(getFeatureNode() != null)
	  {
		  AbstractRootNode root = EMFEcoreFacade.INSTANCE.getFeatureRoot(getFeatureNode());
		  
		  if(root.eContainer() instanceof Watch)
		  {
			  Watch watch = (Watch) root.eContainer();
			  setSourceObject(EMFEcoreInvocatorFacade.INSTANCE.getInstance(watch.getVariable()));
		  }
		  else if(root.eContainer() instanceof TypeMemberReferenceTreeElement)
		  {
			  TypeMemberReferenceTreeElement typeMemberReferenceTreeElement = (TypeMemberReferenceTreeElement) root.eContainer();
			  setSourceObject(EMFEcoreInvocatorFacade.INSTANCE.getInstance(typeMemberReferenceTreeElement));
		  }
	  }
  }
  
  protected Watch getWatch()
  {
	  Watch watch = null;
	  
	  if(getFeatureNode() != null)
	  {
		  watch = EMFEcoreInvocatorFacade.INSTANCE.resolveWatch(getFeatureNode());
	  }
	  
	  return watch;
  }
  
  protected FeatureNodeAdapter getFeatureNodeAdapter()
  {
	  if(featureNodeAdapter == null)
	  {
		  featureNodeAdapter = EMFEcoreFactory.eINSTANCE.createFeatureNodeAdapter();
		  featureNodeAdapter.eAdapters().add(getFeatureNodeAdapterAdapter());
	  }
	  return featureNodeAdapter;
  }
  
  protected Adapter getFeatureNodeAdapterAdapter()
  {
	  if(featureNodeAdapterAdapter == null)
	  {
		  featureNodeAdapterAdapter = new AdapterImpl()
		  {
				@Override
				public void notifyChanged(Notification notification) 
				{
					if(notification.getEventType() != Notification.REMOVING_ADAPTER)
					{
						if(notification.getFeatureID(FeatureNodeAdapter.class) == EMFEcorePackage.FEATURE_NODE_ADAPTER__CURRENT_VALUE)
						{
							setCurrentValue(notification.getNewValue());
						}
						else if(notification.getFeatureID(FeatureNodeAdapter.class) == EMFEcorePackage.FEATURE_NODE_ADAPTER__RESOLVED)
						{							
							setResolved(notification.getNewBooleanValue());
						}
					}
				}  
		  };
	  }
	  
	  return featureNodeAdapterAdapter;
  }
  
  
	protected Adapter getAdapter() 
	{
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{			
				@Override
				public void notifyChanged(Notification notification) 
				{
					if(notification.getEventType() != Notification.REMOVING_ADAPTER)
					{
						if(notification.getNotifier() instanceof Environment)
						{
							// If the active context changes.
							if(notification.getFeatureID(Environment.class) == EMFEcoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT)
							{																
								Context oldContext = (Context) notification.getOldValue();
								Context newContext = (Context) notification.getNewValue();
																
								// Unregister from oldContext
								if(oldContext != null) oldContext.eAdapters().remove(getAdapter());
								
								// Register to new Context
								if(newContext != null) newContext.eAdapters().add(getAdapter());
								
								// Update source Object
								updateSourceObject();
								
							}
						}
						else if(notification.getNotifier() instanceof Context)
						{
							if(notification.getFeatureID(Context.class) == EMFEcoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST)
							{
								VariableImplementationsList oldList = (VariableImplementationsList) notification.getOldValue();
								VariableImplementationsList newList = (VariableImplementationsList) notification.getNewValue();
								
								if(oldList != null) oldList.eAdapters().remove(getAdapter());
								if(newList != null) newList.eAdapters().add(getAdapter());
								
								// Update source Object
								// TODO
							}
						}
						else if(notification.getNotifier() instanceof VariableImplementationsList)							
						{
							if(notification.getFeatureID(Context.class) == EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST__VARIABLE_IMPLEMENTATIONS)
							{
								switch(notification.getEventType())
								{
									case Notification.ADD:
										// TODO
									break;
									
									case Notification.ADD_MANY:
										// TODO
									break;
									
									case Notification.REMOVE:
										// TODO
									break;
									
									case Notification.REMOVE_MANY:
										// TODO
									break;
									
									default:
										// TODO
									break;
								}
								
								// Update source Object
								// TODO
							}
						}						
					}
				}
			};
		}
		
		return adapter;
	}
  
} //WatchFeatureNodeAdapterImpl
