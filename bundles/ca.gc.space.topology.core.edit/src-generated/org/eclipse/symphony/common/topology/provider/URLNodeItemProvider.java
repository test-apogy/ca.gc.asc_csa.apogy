/**
 * <copyright>
 * </copyright>
 *
 * $Id: URLNodeItemProvider.java,v 1.12.2.3 2015/02/03 20:01:35 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.provider;


import java.io.File;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.topology.TopologyPackage;
import org.eclipse.symphony.common.topology.URLNode;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.topology.URLNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class URLNodeItemProvider
	extends LeafItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLNodeItemProvider(AdapterFactory adapterFactory) {
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

			addUrlPropertyDescriptor(object);
			addPolygonCountPropertyDescriptor(object);
			addVertexCountPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_URLNode_url_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_URLNode_url_feature", "_UI_URLNode_type"),
				 TopologyPackage.Literals.URL_NODE__URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Polygon Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPolygonCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_URLNode_polygonCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_URLNode_polygonCount_feature", "_UI_URLNode_type"),
				 TopologyPackage.Literals.URL_NODE__POLYGON_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vertex Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVertexCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_URLNode_vertexCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_URLNode_vertexCount_feature", "_UI_URLNode_type"),
				 TopologyPackage.Literals.URL_NODE__VERTEX_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns URLNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/URLNode"));
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
		URLNode urlNode = (URLNode)object;
		String label = null;
		if(urlNode.getNodeId() != null && urlNode.getNodeId().length() > 0)
		{
			label = urlNode.getNodeId();
		}
		else
		{
			label = getString("_UI_URLNode_type");
		}	
		
		// Adds the vertex and polygon count.
		label += " <" + urlNode.getVertexCount() + " vertices, " + urlNode.getPolygonCount() + " polygons>";
		
		// Adds the file name if applicable.
		if(urlNode.getUrl() != null && urlNode.getUrl().length() > 0)
		{
			int index = urlNode.getUrl().lastIndexOf(File.separator);
			if(index > -1)
			{
				index += 1;
				String fileName = urlNode.getUrl().substring(index);
				label += " (" + fileName + ")";
			}
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

		switch (notification.getFeatureID(URLNode.class)) {
			case TopologyPackage.URL_NODE__URL:
			case TopologyPackage.URL_NODE__POLYGON_COUNT:
			case TopologyPackage.URL_NODE__VERTEX_COUNT:
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
