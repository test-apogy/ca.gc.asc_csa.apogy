/**
 * Canadian Space Agency 2008.
 *
 * $Id: CostBasedMeshWayPointPathPlannerItemProvider.java,v 1.2.4.2 2015/05/21 15:51:33 pallard Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners.graph.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.space.mrt.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner;
import ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphFactory;
import ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage;
import ca.gc.space.mrt.mobility.pathplanners.provider.MeshWayPointPathPlannerItemProvider;

/**
 * This is the item provider adapter for a {@link ca.gc.space.mrt.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CostBasedMeshWayPointPathPlannerItemProvider
	extends MeshWayPointPathPlannerItemProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostBasedMeshWayPointPathPlannerItemProvider(AdapterFactory adapterFactory) {
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

			addCostFunctionsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cost Functions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCostFunctionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CostBasedMeshWayPointPathPlanner_costFunctions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CostBasedMeshWayPointPathPlanner_costFunctions_feature", "_UI_CostBasedMeshWayPointPathPlanner_type"),
				 PathplannersGraphPackage.Literals.COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
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
			childrenFeatures.add(PathplannersGraphPackage.Literals.COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS);
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
	 * This returns CostBasedMeshWayPointPathPlanner.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CostBasedMeshWayPointPathPlanner"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IProgressMonitor labelValue = ((CostBasedMeshWayPointPathPlanner<?>)object).getProgressMonitor();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_CostBasedMeshWayPointPathPlanner_type") :
			getString("_UI_CostBasedMeshWayPointPathPlanner_type") + " " + label;
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

		switch (notification.getFeatureID(CostBasedMeshWayPointPathPlanner.class)) {
			case PathplannersGraphPackage.COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS:
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
				(PathplannersGraphPackage.Literals.COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS,
				 PathplannersGraphFactory.eINSTANCE.createMeshDisplacementCostFunction()));

		newChildDescriptors.add
			(createChildParameter
				(PathplannersGraphPackage.Literals.COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS,
				 PathplannersGraphFactory.eINSTANCE.createDistanceOnlyCostFunction()));

		newChildDescriptors.add
			(createChildParameter
				(PathplannersGraphPackage.Literals.COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS,
				 PathplannersGraphFactory.eINSTANCE.createDistanceAndSlopesCostFunction()));

		newChildDescriptors.add
			(createChildParameter
				(PathplannersGraphPackage.Literals.COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS,
				 PathplannersGraphFactory.eINSTANCE.createExclusionZonesCostFunction()));

		newChildDescriptors.add
			(createChildParameter
				(PathplannersGraphPackage.Literals.COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS,
				 PathplannersGraphFactory.eINSTANCE.createDistanceAndRoverFootprintCostFunction()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PathplannersgraphEditPlugin.INSTANCE;
	}

}
