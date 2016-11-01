package ca.gc.asc_csa.apogy.common.emf.ui.composites;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.EMFEditPlugin;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;

public class NamedDescribedListComposite extends EObjectListComposite{
	/**
	 * Creates the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public NamedDescribedListComposite(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * Called to get the label provider for the {@link TreeViewer} This method
	 * can be overwritten to change the label provider
	 */
	protected StyledCellLabelProvider getLabelProvider() {
		return new EObjectEClassNameLabelProvider();
	}


	/**
	 * Called to get the text of the label above the {@link TreeViewer} This
	 * method can be overwritten to change the title above the
	 * {@link TreeViewer}
	 */
	protected String getTitle() {
		return "";
	}

	/**
	 * Label provider for the treeViewer
	 */
	private class EObjectEClassNameLabelProvider extends StyledCellLabelProvider {
		@Override
		public void update(ViewerCell cell) {
			if (cell.getElement() instanceof Named) {
				cell.setText(((Named) cell.getElement()).getName());
			}
			if(cell.getText() == ""){
				cell.setText("<unnamed>");
			}
			treeViewerEObjectsList.refresh();
		}
		
		@Override
		public String getToolTipText(Object element) {
			if (element instanceof Described) {
				return ((Described)element).getDescription();
			}
			return super.getToolTipText(element);
		}

		@Override
		public Point getToolTipShift(Object object) {
			return new Point(5, 5);
		}

		@Override
		public int getToolTipDisplayDelayTime(Object object) {
			return 500;
		}

		@Override
		public int getToolTipTimeDisplayed(Object object) {
			return 5000;
		}
	}	
	
	

}