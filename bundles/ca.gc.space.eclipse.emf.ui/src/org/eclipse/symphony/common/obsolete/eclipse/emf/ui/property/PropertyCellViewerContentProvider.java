package org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * Provides instances of {@link Composite}.
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
public interface PropertyCellViewerContentProvider {

	/** 
	 * Creates the content of the composite.
	 * @param parent Reference to the parent composite.
	 * @param data Data to display.
	 * @return Control reference the control.
	 */ 
	Control createContent(Composite parent, Object data);
}