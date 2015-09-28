package ca.gc.space.eclipse.emf.ui.property;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;

/**
 * Provides instances of {@link CellEditor}.
 * 
 * <PRE>
 * 
 * CSA Eclipse EMF UI Utilities.
 * Canadian Space Agency / Agence spatiale canadienne
 * 6767 route de l'Aeroport
 * St-Hubert, Quebec, Canada
 * J3Y 8Y9
 * www.space.gc.ca
 * Copyrights (c)
 * </PRE> 
 */
public interface PropertyCellEditorProvider {

	/** 
	 * Creates and returns a new instance of cell editor.
	 * @param parent Reference to the parent composite.
	 * @return Cell Editor.
	 */ 
	CellEditor newInstance(Composite parent);
}