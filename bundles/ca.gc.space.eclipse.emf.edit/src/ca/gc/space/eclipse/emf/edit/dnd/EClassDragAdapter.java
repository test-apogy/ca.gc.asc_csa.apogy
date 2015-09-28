package ca.gc.space.eclipse.emf.edit.dnd;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.dnd.DragSourceAdapter;
import org.eclipse.swt.dnd.DragSourceEvent;


/**
 * {@link EClass} Drag Adapter.
 * 
 * <PRE>
 * 
 * Phoenix Meteorological Station (MET) Ground Data System (GDS)
 * Canadian Space Agency / Agence spatiale canadienne
 * 6767 route de l'Aeroport
 * St-Hubert, Québec, Canada
 * J3Y 8Y9
 * www.space.gc.ca
 * Copyrights (c)
 * </PRE> 
 */
public class EClassDragAdapter extends DragSourceAdapter {

	private Viewer viewer;
	private EPackage ePackage;

	/**
	 * Creates an adapter
	 * @param viewer Reference to the viewer.
	 * @param epackage Reference to the package that owns the classes.
	 */
	public EClassDragAdapter(Viewer viewer, EPackage epackage) {
		this.viewer = viewer;
		this.ePackage = epackage;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.swt.dnd.DragSourceAdapter#dragStart(org.eclipse.swt.dnd.DragSourceEvent)
	 */
	@Override
	public void dragStart(DragSourceEvent event) {
		event.doit = !viewer.getSelection().isEmpty();
	}
	
/* (non-Javadoc)
	 * @see org.eclipse.swt.dnd.DragSourceAdapter#dragSetData(org.eclipse.swt.dnd.DragSourceEvent)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void dragSetData(DragSourceEvent event) {
		if (EClassesTransfer.getInstance(ePackage).isSupportedType(event.dataType)){
	      IStructuredSelection selection = (IStructuredSelection)viewer.getSelection();      
	      event.data = selection.toList().toArray(new EClass[selection.size()]); 
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.swt.dnd.DragSourceAdapter#dragFinished(org.eclipse.swt.dnd.DragSourceEvent)
	 */
	@Override
	public void dragFinished(DragSourceEvent event) {
		return;
	}
}