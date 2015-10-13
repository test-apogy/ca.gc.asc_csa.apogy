package org.eclipse.symphony.common.obsolete.eclipse.emf.edit.dnd;

import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.dnd.DragSourceEvent;

public class ExtendedViewerDragAdapter extends ViewerDragAdapter {

	public ExtendedViewerDragAdapter(Viewer viewer) {
		super(viewer);
	}
	
	@Override
	public void dragFinished(DragSourceEvent event) {
	    if (LocalTransfer.getInstance().isSupportedType(event.dataType)){
	      super.dragFinished(event);
	    }else if (GlobalTransfer.getInstance().isSupportedType(event.dataType)){
	        selection = null;
	        GlobalTransfer.getInstance().javaToNative(null, null);
	    }
	}
	
	@Override
	public void dragSetData(DragSourceEvent event) {
	    if (LocalTransfer.getInstance().isSupportedType(event.dataType)){
	    	super.dragSetData(event);
	    }else if (GlobalTransfer.getInstance().isSupportedType(event.dataType)){
	        event.data = selection;
	    }
	}
}