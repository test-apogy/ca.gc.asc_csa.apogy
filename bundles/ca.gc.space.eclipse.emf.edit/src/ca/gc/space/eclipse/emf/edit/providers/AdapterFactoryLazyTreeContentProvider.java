package ca.gc.space.eclipse.emf.edit.providers;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ILazyTreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

/**
 * Adapter Factory that implements Lazy Content Provider. 
 * 
 * <PRE>
 * 
 * CSA Eclipse EMF Framework.
 * Canadian Space Agency / Agence spatiale canadienne
 * 6767 route de l'Aeroport
 * St-Hubert, Quebec, Canada
 * J3Y 8Y9
 * www.space.gc.ca
 * Copyrights (c)
 * </PRE> 
 */
public class AdapterFactoryLazyTreeContentProvider extends
		AdapterFactoryContentProvider implements ILazyTreeContentProvider {

	private TreeViewer treeViewer;

	/**
	 * Creates the factory.
	 * @param adapterFactory Reference to the EMF adapter factory.
	 * @param viewer Reference to the viewer.
	 */
	public AdapterFactoryLazyTreeContentProvider(AdapterFactory adapterFactory, TreeViewer viewer) {
		super(adapterFactory);
		treeViewer = viewer;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		super.inputChanged(viewer, oldInput, newInput);
		treeViewer.getTree().setItemCount(getChildrenCount(newInput));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ILazyTreeContentProvider#updateChildCount(java.lang.Object, int)
	 */
	public void updateChildCount(Object element, int currentChildCount) {		
		int count = getChildrenCount(element);
//		System.out.println("updateChildCount: " + element + " currentCount: " + currentChildCount + " count : " + count);
		if (currentChildCount != count){
			treeViewer.setChildCount(element, count);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ILazyTreeContentProvider#updateElement(java.lang.Object, int)
	 */
	public void updateElement(Object parent, int index) {		
//		System.out.println("updateElement" + parent.getClass().getName() + " " + index);		
		Object element = null;
		if (parent instanceof EList<?>){
			element = ((EList<?>)parent).get(index);
		}else if (parent instanceof EObject){
			ITreeItemContentProvider provider = (ITreeItemContentProvider) getAdapterFactory().adapt(parent, ITreeItemContentProvider.class);
			Collection <?> children = provider.getChildren(parent);
			if (children != null){
				Object [] elements = children.toArray();
				element = elements[index];
			}
		}else{
			System.out.println(getClass().getName() + ": TYPE NOT KNOWN!!!");
		}
		if (element != null){
			treeViewer.replace(parent, index, element);
			treeViewer.setChildCount(element, getChildrenCount(element));			
		}
	}
	
	protected int getChildrenCount(Object obj){
		int count = 0;
//		System.out.println("getChildrenCount:" + obj);
		
		if (obj != null){
			if (obj instanceof EList<?>){
//				System.out.println("getChildrenCount. EList");
				count = ((EList<?>)obj).size();
			}else if (obj instanceof EObject){
//				System.out.println("getChildrenCount. EObject");
				ITreeItemContentProvider provider = (ITreeItemContentProvider) getAdapterFactory().adapt(obj, ITreeItemContentProvider.class);
				Collection <?>elements = provider.getChildren(obj);
				if (elements != null){
					count = elements.toArray().length;
				}
			}else{
				count = -1;
			}		
		}
//		System.out.println("getChildrenCount -> " + count);
		return count;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
//		System.out.println("notifyChanged(): " + notification);
		super.notifyChanged(notification);
		final Object notifier = notification.getNotifier();
		if (notifier != null){
			try{
				treeViewer.getControl().getDisplay().asyncExec(new Runnable(){
					public void run() {
						treeViewer.setChildCount(notifier, getChildrenCount(notifier));						
					}					
				});				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}