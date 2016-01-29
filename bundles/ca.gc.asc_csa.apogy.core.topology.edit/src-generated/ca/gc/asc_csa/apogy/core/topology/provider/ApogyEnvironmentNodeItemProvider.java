/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.topology.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import ca.gc.asc_csa.apogy.common.topology.provider.ReferencedGroupNodeItemProvider;
import ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyEnvironmentNodeItemProvider
  extends ReferencedGroupNodeItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyEnvironmentNodeItemProvider(AdapterFactory adapterFactory)
  {
		super(adapterFactory);
	}

  /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addApogyEnvironmentPropertyDescriptor(object);
			addWorksiteNodePropertyDescriptor(object);
			addResultsListNodePropertyDescriptor(object);
			addApogySystemAPIsNodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Apogy Environment feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addApogyEnvironmentPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApogyEnvironmentNode_apogyEnvironment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApogyEnvironmentNode_apogyEnvironment_feature", "_UI_ApogyEnvironmentNode_type"),
				 ApogyCoreTopologyPackage.Literals.APOGY_ENVIRONMENT_NODE__APOGY_ENVIRONMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Worksite Node feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addWorksiteNodePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApogyEnvironmentNode_worksiteNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApogyEnvironmentNode_worksiteNode_feature", "_UI_ApogyEnvironmentNode_type"),
				 ApogyCoreTopologyPackage.Literals.APOGY_ENVIRONMENT_NODE__WORKSITE_NODE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Results List Node feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addResultsListNodePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApogyEnvironmentNode_resultsListNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApogyEnvironmentNode_resultsListNode_feature", "_UI_ApogyEnvironmentNode_type"),
				 ApogyCoreTopologyPackage.Literals.APOGY_ENVIRONMENT_NODE__RESULTS_LIST_NODE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Apogy System AP Is Node feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addApogySystemAPIsNodePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApogyEnvironmentNode_apogySystemAPIsNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApogyEnvironmentNode_apogySystemAPIsNode_feature", "_UI_ApogyEnvironmentNode_type"),
				 ApogyCoreTopologyPackage.Literals.APOGY_ENVIRONMENT_NODE__APOGY_SYSTEM_AP_IS_NODE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

  /**
	 * This returns ApogyEnvironmentNode.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ApogyEnvironmentNode"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  @Override
  public String getText(Object object)
  {
	  ApogyEnvironmentNode apogyEnvironmentNode = (ApogyEnvironmentNode) object;
	  
	  String label = getString("_UI_ApogyEnvironmentNode_type");
	  if(apogyEnvironmentNode.getNodeId() != null && apogyEnvironmentNode.getNodeId().length() > 0)
	  {
		  label += " " + apogyEnvironmentNode.getNodeId();
	  }	 
	 
	  return label;
  }

  /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void notifyChanged(Notification notification)
  {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

  /**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
