/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.ui.provider;


import ca.gc.asc_csa.symphony.environment.ui.AbstractVariableAnnotation;
import ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.symphony.environment.ui.AbstractVariableAnnotation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractVariableAnnotationItemProvider
  extends MapAnnotationItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractVariableAnnotationItemProvider(AdapterFactory adapterFactory)
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

			addVariablePropertyDescriptor(object);
			addVariableInstancePropertyDescriptor(object);
			addSymphonySystemApiAdapterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Variable feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addVariablePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractVariableAnnotation_variable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractVariableAnnotation_variable_feature", "_UI_AbstractVariableAnnotation_type"),
				 SymphonyEnvironmentUIPackage.Literals.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Variable Instance feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addVariableInstancePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractVariableAnnotation_variableInstance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractVariableAnnotation_variableInstance_feature", "_UI_AbstractVariableAnnotation_type"),
				 SymphonyEnvironmentUIPackage.Literals.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Symphony System Api Adapter feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addSymphonySystemApiAdapterPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractVariableAnnotation_symphonySystemApiAdapter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractVariableAnnotation_symphonySystemApiAdapter_feature", "_UI_AbstractVariableAnnotation_type"),
				 SymphonyEnvironmentUIPackage.Literals.ABSTRACT_VARIABLE_ANNOTATION__SYMPHONY_SYSTEM_API_ADAPTER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
	  AbstractVariableAnnotation abstractVariableAnnotation = (AbstractVariableAnnotation)object;
    
	  String label = getString("_UI_AbstractVariableAnnotation_type");
	  label += getMapViewItemPresentationText(abstractVariableAnnotation);
	  
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
