package org.eclipse.symphony.common.obsolete.eclipse.emf.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.EmfUiPropertyFactory;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellEditorContributor;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellEditorContributors;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellEditorProvider;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellViewerContentContributor;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellViewerContentContributors;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellViewerContentProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.symphony.common.obsolete.eclipse.emf.ui";

	// The shared instance
	private static Activator plugin;
	
	/** Property Cell Editor Extension Point. */
	private static String PROPERTY_CELL_EDITOR_EXTENSION_POINT_ID = "PropertyCellEditor";
	private static String PROPERTY_CELL_EDITOR_EXTENSION_POINT_TAG_TARGET = "target";
	private static String PROPERTY_CELL_EDITOR_EXTENSION_POINT_TAG_CLASS = "class";
	
	/** Property Cell Viewer Content Extension Point. */
	private static String PROPERTY_CELL_VIEWER_CONTENT_EXTENSION_POINT_ID = "PropertyCellViewerContentProvider";
	private static String PROPERTY_CELL_VIEWER_CONTENT_EXTENSION_POINT_TAG_TARGET = "target";
	private static String PROPERTY_CELL_VIEWER_CONTENT_EXTENSION_POINT_TAG_CLASS = "class";
	

	private PropertyCellEditorContributors propertyCellEditorContributors;

	private PropertyCellViewerContentContributors propertyCellViewerContentContributors;
	
	/**
	 * The constructor
	 */
	public Activator() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/** 
	 * Returns the list of Property Cell Editor Contributors contributed by other 
	 * plugins.
	 * @return List of contributors.
	 */
	public PropertyCellEditorContributors getPropertyCellEditorContributors(){
		if (propertyCellEditorContributors == null){
			propertyCellEditorContributors = EmfUiPropertyFactory.eINSTANCE.createPropertyCellEditorContributors();
			IExtensionRegistry er = Platform.getExtensionRegistry();
			IExtensionPoint ep = er.getExtensionPoint(getBundle().getSymbolicName(), PROPERTY_CELL_EDITOR_EXTENSION_POINT_ID);
			IExtension[] extensions = ep.getExtensions();
			for(int i = 0; i < extensions.length; i++){					
				IConfigurationElement [] ces = extensions[i].getConfigurationElements();			
				for(int j = 0; j < ces.length; j++){
					IConfigurationElement ce = ces[j];
					try {
						/** Get the class refered by the class name. */
						String contributor_name = ce.getContributor().getName();
						PropertyCellEditorContributor contributor = EmfUiPropertyFactory.eINSTANCE.createPropertyCellEditorContributor();
						String name = ce.getAttribute(PROPERTY_CELL_EDITOR_EXTENSION_POINT_TAG_TARGET);
						Bundle bundle = Platform.getBundle(contributor_name);
						Class <?>class_ref = bundle.loadClass(name);
						contributor.setTarget(class_ref);
						contributor.setCellEditorProvider((PropertyCellEditorProvider) ce.createExecutableExtension(PROPERTY_CELL_EDITOR_EXTENSION_POINT_TAG_CLASS));
						propertyCellEditorContributors.getList().add(contributor);
					} catch (CoreException e) {
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return propertyCellEditorContributors;
	}	
	
	/** 
	 * Returns the list of Property Cell Composite Contributors contributed by other 
	 * plugins.
	 * @return List of contributors.
	 */
	public PropertyCellViewerContentContributors getPropertyCellViewerContentContributors(){
		if (propertyCellViewerContentContributors == null){
			propertyCellViewerContentContributors = EmfUiPropertyFactory.eINSTANCE.createPropertyCellViewerContentContributors();
			IExtensionRegistry er = Platform.getExtensionRegistry();
			IExtensionPoint ep = er.getExtensionPoint(getBundle().getSymbolicName(), PROPERTY_CELL_VIEWER_CONTENT_EXTENSION_POINT_ID);
			IExtension[] extensions = ep.getExtensions();
			for(int i = 0; i < extensions.length; i++){					
				IConfigurationElement [] ces = extensions[i].getConfigurationElements();			
				for(int j = 0; j < ces.length; j++){
					IConfigurationElement ce = ces[j];
					try {
						/** Get the class refered by the class name. */
						String contributor_name = ce.getContributor().getName();
						PropertyCellViewerContentContributor contributor = EmfUiPropertyFactory.eINSTANCE.createPropertyCellViewerContentContributor();
						String name = ce.getAttribute(PROPERTY_CELL_VIEWER_CONTENT_EXTENSION_POINT_TAG_TARGET);
						Bundle bundle = Platform.getBundle(contributor_name);
						Class <?>class_ref = bundle.loadClass(name);
						contributor.setTarget(class_ref);
						contributor.setCellViewerContentProvider((PropertyCellViewerContentProvider) ce.createExecutableExtension(PROPERTY_CELL_VIEWER_CONTENT_EXTENSION_POINT_TAG_CLASS));
						propertyCellViewerContentContributors.getList().add(contributor);
					} catch (CoreException e) {
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return propertyCellViewerContentContributors;
	}
}