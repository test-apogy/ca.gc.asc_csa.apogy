/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.math.Symphony__CommonMathFactory;
import org.eclipse.symphony.core.OperationCallPositionedResult;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.invocator.provider.OperationCallResultItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.OperationCallPositionedResult} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationCallPositionedResultItemProvider
	extends OperationCallResultItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallPositionedResultItemProvider(AdapterFactory adapterFactory) {
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

			addPosePropertyDescriptor(object);
			addRelativePosePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Pose feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Positioned_pose_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Positioned_pose_feature", "_UI_Positioned_type"),
				 Symphony__CorePackage.Literals.POSITIONED__POSE,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_POSITION_INFOPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Relative Pose feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelativePosePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OperationCallPositionedResult_relativePose_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OperationCallPositionedResult_relativePose_feature", "_UI_OperationCallPositionedResult_type"),
				 Symphony__CorePackage.Literals.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_POSITION_INFOPropertyCategory"),
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Symphony__CorePackage.Literals.POSITIONED__POSE);
			childrenFeatures.add(Symphony__CorePackage.Literals.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns OperationCallPositionedResult.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OperationCallPositionedResult"));
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
		OperationCallPositionedResult result = (OperationCallPositionedResult) object;
		
		String label = "";
	 
		try
		{
			if(result.getOperationCall() != null)
			{
				String name = result.getOperationCall().getName(); 
				if(name != null && name.length() > 0)
				{
					label += name;
				}
				else if(result.getOperationCall().getEOperation() != null)
				{				
					label += result.getOperationCall().getEOperation().getName();
				}
				
				if(result.getOperationCall().getArgumentsList() != null && 
				   result.getOperationCall().getArgumentsList().getArguments() != null &&
				   result.getOperationCall().getArgumentsList().getArguments().size() > 0)
				{
					label += "(...)";
				}
				else
				{
					label += "()";
				}
			}
			
			
			if(label.length() > 0)
			{
				
			}
			else
			{
				label = getString("_UI_OperationCallPositionedResult_type");
			}
			
			if(result.getTime() != null)
			{
				label += " [" + result.getTime().toString() + "]";
			}
		}
		catch(Throwable t)
		{
			label = getString("_UI_OperationCallPositionedResult_type");
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

		switch (notification.getFeatureID(OperationCallPositionedResult.class)) {
			case Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE:
			case Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CorePackage.Literals.POSITIONED__POSE,
				 Symphony__CommonMathFactory.eINSTANCE.createMatrix4x4()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CorePackage.Literals.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE,
				 Symphony__CommonMathFactory.eINSTANCE.createMatrix4x4()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == Symphony__CorePackage.Literals.POSITIONED__POSE ||
			childFeature == Symphony__CorePackage.Literals.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
