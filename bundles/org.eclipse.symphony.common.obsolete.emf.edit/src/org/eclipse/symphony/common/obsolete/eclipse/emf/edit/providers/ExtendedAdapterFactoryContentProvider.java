package org.eclipse.symphony.common.obsolete.eclipse.emf.edit.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

/**
 * {@link AdapterFactoryContentProvider} with additional features.
 * <PRE>
 *    -Child notifications are forwarded to their respective parents.  This
 *     allows the proper updating of parent attributes and decorators that may 
 *     depend on the children properties.
 * 
 * </PRE>
 * 
 * <PRE>
 * 
 * Phoenix Meteorological Station (MET) Ground Data System (GDS)
 * Canadian Space Agency / Agence spatiale canadienne
 * 6767 route de l'Aeroport
 * St-Hubert, Quebec, Canada
 * J3Y 8Y9
 * www.space.gc.ca
 * Copyrights (c)
 * </PRE> 
 * @deprecated
 */
public class ExtendedAdapterFactoryContentProvider extends
		AdapterFactoryContentProvider {

	/**
	 * Creates the content provider factory.
	 * @param adapterFactory Reference to the adapter factory.
	 */
	public ExtendedAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		
		Object parent = notification.getNotifier(); 
		while (parent != null){
			if (notification instanceof ViewerNotification){				
				super.notifyChanged(new ViewerNotification(notification, parent, true, true));
			}
			parent = getParent(parent);
		}
	}
}