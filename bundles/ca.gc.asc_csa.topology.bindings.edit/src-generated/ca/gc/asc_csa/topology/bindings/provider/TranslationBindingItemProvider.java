/**
 * Copyrights Canadian Space Agency 2011
 */
package ca.gc.asc_csa.topology.bindings.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.topology.bindings.TopologyBindingsPackage;
import ca.gc.asc_csa.topology.bindings.TranslationBinding;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.topology.bindings.TranslationBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TranslationBindingItemProvider
	extends AbstractTopologyBindingItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationBindingItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPositionNodePropertyDescriptor(object);
			addTranslationAxisPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Translation Axis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTranslationAxisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TranslationBinding_translationAxis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TranslationBinding_translationAxis_feature", "_UI_TranslationBinding_type"),
				 TopologyBindingsPackage.Literals.TRANSLATION_BINDING__TRANSLATION_AXIS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DESTINATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Position Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TranslationBinding_positionNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TranslationBinding_positionNode_feature", "_UI_TranslationBinding_type"),
				 TopologyBindingsPackage.Literals.TRANSLATION_BINDING__POSITION_NODE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_DESTINATIONPropertyCategory"),
				 null));
	}

	/**
	 * This returns TranslationBinding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TranslationBinding"));
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
		
		TranslationBinding translationBinding = (TranslationBinding) object;
		
		String label = null;
		
		if(translationBinding.getName() != null && translationBinding.getName().length() > 0)
		{
			label = translationBinding.getName();
		}
		else
		{
			label = getString("_UI_TranslationBinding_type");
		}
		
		if(translationBinding.getTranslationAxis() != null)
		{
			label += " (" +  translationBinding.getTranslationAxis().getName() + ")";
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
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TranslationBinding.class)) {
			case TopologyBindingsPackage.TRANSLATION_BINDING__TRANSLATION_AXIS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
