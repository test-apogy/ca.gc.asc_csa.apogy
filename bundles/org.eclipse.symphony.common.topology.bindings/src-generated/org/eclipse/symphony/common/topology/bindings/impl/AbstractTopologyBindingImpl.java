/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.bindings.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.emf.AbstractFeatureNode;
import org.eclipse.symphony.common.emf.EMFEcoreFactory;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.FeatureNodeAdapter;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding;
import org.eclipse.symphony.common.topology.bindings.Activator;
import org.eclipse.symphony.common.topology.bindings.TopologyBindingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Topology Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.impl.AbstractTopologyBindingImpl#isBinded <em>Binded</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.impl.AbstractTopologyBindingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.impl.AbstractTopologyBindingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.impl.AbstractTopologyBindingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.impl.AbstractTopologyBindingImpl#getFeatureNode <em>Feature Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.impl.AbstractTopologyBindingImpl#getFeatureNodeAdapter <em>Feature Node Adapter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractTopologyBindingImpl extends MinimalEObjectImpl.Container implements AbstractTopologyBinding
{
	protected Adapter adapter = null;
	
  /**
	 * The default value of the '{@link #isBinded() <em>Binded</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isBinded()
	 * @generated
	 * @ordered
	 */
  protected static final boolean BINDED_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isBinded() <em>Binded</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isBinded()
	 * @generated
	 * @ordered
	 */
  protected boolean binded = BINDED_EDEFAULT;

  /**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
  protected EObject source;

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
	 * The cached value of the '{@link #getFeatureNodeAdapter() <em>Feature Node Adapter</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFeatureNodeAdapter()
	 * @generated
	 * @ordered
	 */
  protected org.eclipse.symphony.common.emf.FeatureNodeAdapter featureNodeAdapter;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AbstractTopologyBindingImpl()
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
		return TopologyBindingsPackage.Literals.ABSTRACT_TOPOLOGY_BINDING;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isBinded()
  {
		return binded;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setBinded(boolean newBinded)
  {
		boolean oldBinded = binded;
		binded = newBinded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__BINDED, oldBinded, binded));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDescription()
  {
		return description;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDescription(String newDescription)
  {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EObject getSource()
  {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__SOURCE, oldSource, source));
			}
		}
		return source;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EObject basicGetSource()
  {
		return source;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setSource(EObject newSource)
  {
	  if(isBinded())
	  {
		// Unbind from the previous source.
		unbind();	
				
		// Updates the source of the FeatureNodeAdapter.
		getFeatureNodeAdapter().setSourceObject(newSource);
		
		// Updates the source.
		setSourceGen(newSource);
		
		// Binds to the new source.
		bind();
	  }
	  else
	  {
		  // Updates the source.
		  setSourceGen(newSource);
	  }
	  
	  setSourceGen(newSource);
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSourceGen(EObject newSource)
  {
		EObject oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__SOURCE, oldSource, source));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE, oldFeatureNode, featureNode));
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
	 * @generated
	 */
	public void setFeatureNode(AbstractFeatureNode newFeatureNode) {
		AbstractFeatureNode oldFeatureNode = featureNode;
		featureNode = newFeatureNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE, oldFeatureNode, featureNode));
	}

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public FeatureNodeAdapter getFeatureNodeAdapter()
  {
	  if(getFeatureNodeAdapterGen() == null)
	  {
		  featureNodeAdapter = EMFEcoreFactory.eINSTANCE.createFeatureNodeAdapter();
		  featureNodeAdapter.eAdapters().add(getAdapter());
	  }
	  
	  return getFeatureNodeAdapterGen();
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public org.eclipse.symphony.common.emf.FeatureNodeAdapter getFeatureNodeAdapterGen()
  {
		if (featureNodeAdapter != null && featureNodeAdapter.eIsProxy()) {
			InternalEObject oldFeatureNodeAdapter = (InternalEObject)featureNodeAdapter;
			featureNodeAdapter = (org.eclipse.symphony.common.emf.FeatureNodeAdapter)eResolveProxy(oldFeatureNodeAdapter);
			if (featureNodeAdapter != oldFeatureNodeAdapter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE_ADAPTER, oldFeatureNodeAdapter, featureNodeAdapter));
			}
		}
		return featureNodeAdapter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public org.eclipse.symphony.common.emf.FeatureNodeAdapter basicGetFeatureNodeAdapter()
  {
		return featureNodeAdapter;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void bind()
  {
		// Register listener to the current source.
		if(getSource() != null)
		{
			// Sets the FeatureNodeAdapter attributes.
			getFeatureNodeAdapter().setSourceObject(getSource());
			getFeatureNodeAdapter().setFeatureNode(getFeatureNode());
			
			// Updates value.
			valueChanged(getFeatureNodeAdapter().getCurrentValue());
			
			// Updates the binded attribute.
			setBinded(true);	
			
			// Adds the binding to the registry if required.
			if(!Activator.getBindedBindings().contains(this))
			{
				Activator.getBindedBindings().add(this);
			}
		}
		else
		{	
			Logger.INSTANCE.log(Activator.ID, this, "Could not bind : source is not set !", EventSeverity.WARNING);			
		}	  
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void unbind()
  {
		// Unregister from the current source.
		if(getSource() != null)
		{
			getFeatureNodeAdapter().setSourceObject(null);
			getFeatureNodeAdapter().setFeatureNode(null);
			
			// Updates the binded attribute.
			setBinded(false);
			
			// Removes the binding from the registry.
			Activator.getBindedBindings().remove(this);
		}
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractTopologyBinding clone(Map<Node, Node> originalToCopyNodeMap)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__BINDED:
				return isBinded();
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__DESCRIPTION:
				return getDescription();
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__NAME:
				return getName();
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE:
				if (resolve) return getFeatureNode();
				return basicGetFeatureNode();
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE_ADAPTER:
				if (resolve) return getFeatureNodeAdapter();
				return basicGetFeatureNodeAdapter();
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
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__BINDED:
				setBinded((Boolean)newValue);
				return;
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__NAME:
				setName((String)newValue);
				return;
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__SOURCE:
				setSource((EObject)newValue);
				return;
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE:
				setFeatureNode((AbstractFeatureNode)newValue);
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
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__BINDED:
				setBinded(BINDED_EDEFAULT);
				return;
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__SOURCE:
				setSource((EObject)null);
				return;
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE:
				setFeatureNode((AbstractFeatureNode)null);
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
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__BINDED:
				return binded != BINDED_EDEFAULT;
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__SOURCE:
				return source != null;
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE:
				return featureNode != null;
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE_ADAPTER:
				return featureNodeAdapter != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  @SuppressWarnings("unchecked")
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING___BIND:
				bind();
				return null;
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING___UNBIND:
				unbind();
				return null;
			case TopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING___CLONE__MAP:
				return clone((Map<Node, Node>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (binded: ");
		result.append(binded);
		result.append(", description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

  protected abstract void valueChanged(Object newValue);
  
  /**
   * Returns the Adapter that listens to changes in the FeatureNode.
   * @return
   */
  protected Adapter getAdapter()
  {
	  if(adapter == null)
	  {
		  adapter = new AdapterImpl()
		  {				
				@Override
				public void notifyChanged(Notification notification) 
				{
					if(notification.getFeatureID(FeatureNodeAdapter.class) == EMFEcorePackage.FEATURE_NODE_ADAPTER__CURRENT_VALUE)
					{						
						valueChanged(notification.getNewValue());
					}
				}
			};
	  }
	  
	  return adapter;
  }
  
} //AbstractTopologyBindingImpl
