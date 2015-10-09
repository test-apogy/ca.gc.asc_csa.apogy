/**
 */
package org.eclipse.symphony.common.emf.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.emf.AbstractFeatureNode;
import org.eclipse.symphony.common.emf.AbstractFeatureSpecifier;
import org.eclipse.symphony.common.emf.EMFEcoreFacade;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.FeatureNodeAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Node Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.FeatureNodeAdapterImpl#getSourceObject <em>Source Object</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.FeatureNodeAdapterImpl#getFeatureNode <em>Feature Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.FeatureNodeAdapterImpl#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.FeatureNodeAdapterImpl#isResolved <em>Resolved</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureNodeAdapterImpl extends MinimalEObjectImpl.Container implements FeatureNodeAdapter
{
	private Adapter adapter = null;
	
	private List<EObject> eObjects = new ArrayList<EObject>();
	private List<EStructuralFeature> featuresOfInterest = null;
	
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
  protected AbstractFeatureNode featureNode;

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
  protected FeatureNodeAdapterImpl()
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
		return EMFEcorePackage.Literals.FEATURE_NODE_ADAPTER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcorePackage.FEATURE_NODE_ADAPTER__SOURCE_OBJECT, oldSourceObject, sourceObject));
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
	  // Clears the currentValue
	  setCurrentValue(null);
	  
	  // Set resolved to false.
	  setResolved(false);
	  
	  // Resets the FeaturesOfInterest.
	  getFeaturesOfInterest().clear();	
	  
	  // Unregister adapter
	  unregisterAdapter(getSourceObject(), getFeatureNode());
	  
	  // Updates the source object.
	  setSourceObjectGen(newSourceObject);
	  
	  // Attempts to resolve the value.	 
	  if(newSourceObject != null && getFeatureNode() != null)
	  {
		  // Updates the resolved status.
		  boolean newResolved = EMFEcoreFacade.INSTANCE.isResolved(newSourceObject, getFeatureNode());
		  setResolved(newResolved);
		 
		  if(newResolved) setCurrentValue(EMFEcoreFacade.INSTANCE.resolve(newSourceObject, getFeatureNode()));
	  }	  
	  
	  // Register adapter.
	  registerAdapter(getSourceObject(), getFeatureNode());
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcorePackage.FEATURE_NODE_ADAPTER__SOURCE_OBJECT, oldSourceObject, sourceObject));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractFeatureNode getFeatureNode()
  {
		if (featureNode != null && featureNode.eIsProxy()) {
			InternalEObject oldFeatureNode = (InternalEObject)featureNode;
			featureNode = (AbstractFeatureNode)eResolveProxy(oldFeatureNode);
			if (featureNode != oldFeatureNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcorePackage.FEATURE_NODE_ADAPTER__FEATURE_NODE, oldFeatureNode, featureNode));
			}
		}
		return featureNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractFeatureNode basicGetFeatureNode()
  {
		return featureNode;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setFeatureNode(AbstractFeatureNode newFeatureNode)
  {
	  // Clears the currentValue
	  setCurrentValue(null);
	  
	  // Set resolved to false.
	  setResolved(false);
	  
	  // Resets the FeaturesOfInterest.
	  getFeaturesOfInterest().clear();	
	  
	  // Unregister adapter
	  unregisterAdapter(getSourceObject(), newFeatureNode);
	  
	  // Updates the AbstractFeatureNode.
	  setFeatureNodeGen(newFeatureNode);
	  
	  // Updates FeaturesOfInsterest.
	  if(newFeatureNode != null)
	  {
		  initializeFeatureOfInterest(newFeatureNode);
	  }
	  
	  // Attempts to resolve the value.	  
	  if(getSourceObject() != null && newFeatureNode != null)
	  {
		  // Updates the resolved status.
		  boolean newResolved = EMFEcoreFacade.INSTANCE.isResolved(getSourceObject(), newFeatureNode);
		  setResolved(newResolved);
		 
		  if(newResolved) setCurrentValue(EMFEcoreFacade.INSTANCE.resolve(getSourceObject(), newFeatureNode));
	  }
	  	  
	  // Register adapter.
	  registerAdapter(getSourceObject(), getFeatureNode());
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFeatureNodeGen(AbstractFeatureNode newFeatureNode)
  {
		AbstractFeatureNode oldFeatureNode = featureNode;
		featureNode = newFeatureNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcorePackage.FEATURE_NODE_ADAPTER__FEATURE_NODE, oldFeatureNode, featureNode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcorePackage.FEATURE_NODE_ADAPTER__CURRENT_VALUE, oldCurrentValue, currentValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcorePackage.FEATURE_NODE_ADAPTER__RESOLVED, oldResolved, resolved));
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
			case EMFEcorePackage.FEATURE_NODE_ADAPTER__SOURCE_OBJECT:
				if (resolve) return getSourceObject();
				return basicGetSourceObject();
			case EMFEcorePackage.FEATURE_NODE_ADAPTER__FEATURE_NODE:
				if (resolve) return getFeatureNode();
				return basicGetFeatureNode();
			case EMFEcorePackage.FEATURE_NODE_ADAPTER__CURRENT_VALUE:
				return getCurrentValue();
			case EMFEcorePackage.FEATURE_NODE_ADAPTER__RESOLVED:
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
			case EMFEcorePackage.FEATURE_NODE_ADAPTER__SOURCE_OBJECT:
				setSourceObject((EObject)newValue);
				return;
			case EMFEcorePackage.FEATURE_NODE_ADAPTER__FEATURE_NODE:
				setFeatureNode((AbstractFeatureNode)newValue);
				return;
			case EMFEcorePackage.FEATURE_NODE_ADAPTER__CURRENT_VALUE:
				setCurrentValue(newValue);
				return;
			case EMFEcorePackage.FEATURE_NODE_ADAPTER__RESOLVED:
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
			case EMFEcorePackage.FEATURE_NODE_ADAPTER__SOURCE_OBJECT:
				setSourceObject((EObject)null);
				return;
			case EMFEcorePackage.FEATURE_NODE_ADAPTER__FEATURE_NODE:
				setFeatureNode((AbstractFeatureNode)null);
				return;
			case EMFEcorePackage.FEATURE_NODE_ADAPTER__CURRENT_VALUE:
				setCurrentValue(CURRENT_VALUE_EDEFAULT);
				return;
			case EMFEcorePackage.FEATURE_NODE_ADAPTER__RESOLVED:
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
			case EMFEcorePackage.FEATURE_NODE_ADAPTER__SOURCE_OBJECT:
				return sourceObject != null;
			case EMFEcorePackage.FEATURE_NODE_ADAPTER__FEATURE_NODE:
				return featureNode != null;
			case EMFEcorePackage.FEATURE_NODE_ADAPTER__CURRENT_VALUE:
				return CURRENT_VALUE_EDEFAULT == null ? currentValue != null : !CURRENT_VALUE_EDEFAULT.equals(currentValue);
			case EMFEcorePackage.FEATURE_NODE_ADAPTER__RESOLVED:
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

  protected void unregisterAdapter(EObject source, AbstractFeatureNode node)
  {
	  for(EObject eObject : eObjects)
	  {
		  eObject.eAdapters().remove(getAdapter());
	  }
	  
	  eObjects.clear();	  
  }
  
  protected void registerAdapter(EObject source, AbstractFeatureNode node)
  {
	  if(source != null && node != null)
	  {
		  // Register on the source object.
		  source.eAdapters().add(getAdapter());
		  eObjects.add(source);
		  
		  List<AbstractFeatureNode> nodes = EMFEcoreFacade.INSTANCE.getAncestries(node);		  		  		  
		  Iterator<AbstractFeatureNode> it = nodes.iterator();
		  
		  EObject eObject = source;
		  while(it.hasNext())
		  {
			  AbstractFeatureNode abstractFeatureNode = (AbstractFeatureNode) it.next();
			  
			  if(abstractFeatureNode instanceof AbstractFeatureSpecifier)
			  {
				  AbstractFeatureSpecifier featureSpecifier = (AbstractFeatureSpecifier) abstractFeatureNode;
				  
				  Object object = null;
				  if(featureSpecifier.isMultiValued())
				  {
					  BasicEList<?> list = (BasicEList<?>) eObject.eGet(featureSpecifier.getStructuralFeature());
					  
					  // Check the index of the FeatureNode is valid
					  if(list != null && featureSpecifier.getIndex() >= 0 && featureSpecifier.getIndex() < list.size())
					  {
						  object = list.get(featureSpecifier.getIndex());
					  }
					  else
					  {
						  object = null;
					  }					  
				  }
				  else
				  {
					  object = eObject.eGet(featureSpecifier.getStructuralFeature());
				  }		
				  
				  if(object instanceof EObject)
				  {
					  eObject = (EObject) object;
					  eObject.eAdapters().add(getAdapter());
					  
					  eObjects.add(eObject);
				  }
			  }			  
		  }
	  }	
  }
  
  protected void initializeFeatureOfInterest(AbstractFeatureNode featureNode)
  {
	  List<AbstractFeatureNode> nodes = EMFEcoreFacade.INSTANCE.getAncestries(featureNode);		  		  		  
	  Iterator<AbstractFeatureNode> it = nodes.iterator();
	  
	  while(it.hasNext())
	  {
		  AbstractFeatureNode node = it.next();
		  if(node instanceof AbstractFeatureSpecifier)
		  {
			  AbstractFeatureSpecifier featureSpecifier = (AbstractFeatureSpecifier) node;
			  if(featureSpecifier.getStructuralFeature() != null)
			  {
				  getFeaturesOfInterest().add(featureSpecifier.getStructuralFeature());
			  }
		  }
	  }
  }
  
  protected List<EStructuralFeature> getFeaturesOfInterest()
  {
	  if(featuresOfInterest == null)
	  {
		  featuresOfInterest = new ArrayList<EStructuralFeature>();
	  }
	  
	  return featuresOfInterest;
  }
  
  protected boolean isFeatureInAncestries(EStructuralFeature eStructuralFeature)
  {
	  return getFeaturesOfInterest().contains(eStructuralFeature);
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
						if(notification.getNotifier() instanceof EObject)
						{							
							EStructuralFeature structuralFeature = null;
							if(getFeatureNode() instanceof AbstractFeatureSpecifier)
							{
								structuralFeature = ((AbstractFeatureSpecifier) getFeatureNode()).getStructuralFeature();
							}
							
							if(notification.getFeature() == structuralFeature)
							{
								// Value has changed.								
								setCurrentValue(notification.getNewValue());
							}
							else
							{
								// A object in the chain has signaled a change.
								if(notification.getFeature() instanceof EStructuralFeature)
								{
									EStructuralFeature eStructuralFeature = (EStructuralFeature) notification.getFeature() ;
																		
									// Checks if the feature affected is relevant
									if(isFeatureInAncestries(eStructuralFeature))
									{																				
										unregisterAdapter(getSourceObject(), getFeatureNode());
										registerAdapter(getSourceObject(), getFeatureNode());
										
										// Attempts to resolve the value.	  
										if(getSourceObject() != null && getFeatureNode() != null)
										{
											// Updates the resolved status.
											setResolved(EMFEcoreFacade.INSTANCE.isResolved(getSourceObject(), getFeatureNode()));
											
											// Attemps to resolve the new value.
											setCurrentValue(EMFEcoreFacade.INSTANCE.resolve(getSourceObject(), getFeatureNode()));  
										}
									}
								}
							}												
						}
					}
				}
			};
		}
		return adapter;
	}  
} //FeatureNodeAdapterImpl
