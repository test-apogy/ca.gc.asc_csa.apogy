/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EEnumArgument;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage;

/**
 * This is the item provider adapter for a
 * {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.EEnumArgument} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EEnumArgumentItemProvider extends ArgumentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnumArgumentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addEEnumLiteralPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
   * This adds a property descriptor for the EEnum Literal feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected void addEEnumLiteralPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EEnumArgument_eEnumLiteral_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EEnumArgument_eEnumLiteral_feature", "_UI_EEnumArgument_type"),
         EMFEcoreInvocatorPackage.Literals.EENUM_ARGUMENT__EENUM_LITERAL,
         true,
         false,
         true,
         null,
         null,
         null) {
			@Override
			protected Collection<?> getComboBoxObjects(Object object) {
				EEnumArgument eEnumArgument = (EEnumArgument) object;
				return eEnumArgument.getEEnum().getELiterals();
			}
		});
  }

  /**
	 * This returns EEnumArgument.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EEnumArgument"));
	}

	/**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @generated_NOT
   */
	@Override
	public String getText(Object object) 
	{
		EEnumArgument argument = (EEnumArgument) object;
		String label = super.getText(object);

		if (argument.getEEnumLiteral() != null) 
		{
			label += "  (" + argument.getEEnumLiteral().getName() + ")";
		} 
		else 
		{
			label += " (null)";
		}

		return label;	    
 	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EEnumArgument.class)) {
			case EMFEcoreInvocatorPackage.EENUM_ARGUMENT__EENUM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}
}
