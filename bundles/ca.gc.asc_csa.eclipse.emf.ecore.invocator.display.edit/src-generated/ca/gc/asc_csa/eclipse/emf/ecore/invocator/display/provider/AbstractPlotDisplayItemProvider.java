/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.AbstractPlotDisplay;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.EMFEcoreInvocatorDisplayPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.AbstractPlotDisplay} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractPlotDisplayItemProvider
  extends AbstractFeatureDisplayItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractPlotDisplayItemProvider(AdapterFactory adapterFactory)
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

			addRepeatLastValuePropertyDescriptor(object);
			addUseDataBufferingPropertyDescriptor(object);
			addHistoryLengthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Repeat Last Value feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addRepeatLastValuePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractPlotDisplay_repeatLastValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractPlotDisplay_repeatLastValue_feature", "_UI_AbstractPlotDisplay_type"),
				 EMFEcoreInvocatorDisplayPackage.Literals.ABSTRACT_PLOT_DISPLAY__REPEAT_LAST_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Use Data Buffering feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addUseDataBufferingPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractPlotDisplay_useDataBuffering_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractPlotDisplay_useDataBuffering_feature", "_UI_AbstractPlotDisplay_type"),
				 EMFEcoreInvocatorDisplayPackage.Literals.ABSTRACT_PLOT_DISPLAY__USE_DATA_BUFFERING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the History Length feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addHistoryLengthPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractPlotDisplay_historyLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractPlotDisplay_historyLength_feature", "_UI_AbstractPlotDisplay_type"),
				 EMFEcoreInvocatorDisplayPackage.Literals.ABSTRACT_PLOT_DISPLAY__HISTORY_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object)
  {
		String label = ((AbstractPlotDisplay)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractPlotDisplay_type") :
			getString("_UI_AbstractPlotDisplay_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractPlotDisplay.class)) {
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY__REPEAT_LAST_VALUE:
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY__USE_DATA_BUFFERING:
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY__HISTORY_LENGTH:
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
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
