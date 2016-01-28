/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.vehicle.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage;
import ca.gc.asc_csa.apogy.addons.vehicle.VehiclePathPlannerTool;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePathPlannerTool} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VehiclePathPlannerToolItemProvider extends PathPlannerToolItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehiclePathPlannerToolItemProvider(AdapterFactory adapterFactory) {
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

			addVariablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VehiclePathPlannerTool_variable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VehiclePathPlannerTool_variable_feature", "_UI_VehiclePathPlannerTool_type"),
				 ApogyAddonsVehiclePackage.Literals.VEHICLE_PATH_PLANNER_TOOL__VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_TRAJECTORY_3D_TOOLPropertyCategory"),
				 null));
	}

	/**
	 * This returns VehiclePathPlannerTool.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VehiclePathPlannerTool"));
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
		VehiclePathPlannerTool vehiclePathPlannerTool = (VehiclePathPlannerTool) object;
		
		String label = null;
		
		if(vehiclePathPlannerTool.getName() != null && vehiclePathPlannerTool.getName().length() > 0)
		{
			label = vehiclePathPlannerTool.getName();
		}
		else
		{
			label = getString("_UI_VehiclePathPlannerTool_type");
		}
		
		// Adds Simple3DTool Text.
		label += " (";
		String simpleToolText = getSimple3DToolText(vehiclePathPlannerTool);
		if(simpleToolText.length() > 0)
		{
			label += simpleToolText + ", ";
		}	
		
		// Adds lock Status.
		String lockText = getAbstractTwoPoints3DToolText(vehiclePathPlannerTool); 
		if(lockText.length() > 0)
		{
			label += lockText + ", ";
		}
				
		// Adds busy indicator
		if(vehiclePathPlannerTool.isBusy())
		{
			label += "BUSY , ";
		}
		
		if(vehiclePathPlannerTool.getPlannedPath() != null)
		{
			String distanceText = decimalFormat.format(vehiclePathPlannerTool.getPlannedPath().getLength()) + " m";
			label += distanceText;
		}
		else
		{
			label += "0.0 m";
		}
		label += ")";
				
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
