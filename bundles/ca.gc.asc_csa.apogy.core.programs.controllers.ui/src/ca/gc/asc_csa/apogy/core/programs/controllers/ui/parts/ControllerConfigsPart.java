package ca.gc.asc_csa.apogy.core.programs.controllers.ui.parts;
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
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectListComposite;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersGroup;

public class ControllerConfigsPart{
	
//@Inject ESelectionService selectionService;

	@PostConstruct
	public void createPartControl(Composite parent, ESelectionService selectionService) {
		EObjectListComposite eObjectListComposite = new EObjectListComposite(parent, SWT.None) {
			@Override
			protected void newSelection(TreeSelection selection) {
				selectionService.setSelection(selection);
			}
			
			@Override
			protected StyledCellLabelProvider getLabelProvider() {
				return new StyledCellLabelProvider() {
					@Override
					public void update(ViewerCell cell) {
						if (cell.getElement() instanceof ControllersConfiguration) {
							String text = ((Named) cell.getElement()).getName();
							if(((ControllersConfiguration) cell.getElement()).isActive()){
								text += " [Active]";
							}
							cell.setText(text);
						}
					}
					
					@Override
					public String getToolTipText(Object element) {
						if (element instanceof ControllersConfiguration) {
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

				};
			}
		};

		if (ControllersGroup.INSTANCE != null) {
			EList<EObject> controllersGroup = new BasicEList<>();
			
			controllersGroup.addAll(ControllersGroup.INSTANCE.getPrograms());
			eObjectListComposite.setEObjectsList(controllersGroup);
		}
	}

//	protected Composite createContentComposite(Composite parent) {
//		return new EObjectListComposite(parent, SWT.None) {
//			@Override
//			protected void newSelection(TreeSelection selection) {
//				selectionService.setSelection(selection);
//			}
//			
//			@Override
//			protected StyledCellLabelProvider getLabelProvider() {
//				return new StyledCellLabelProvider() {
//					@Override
//					public void update(ViewerCell cell) {
//						if (cell.getElement() instanceof ControllersConfiguration) {
//							String text = ((Named) cell.getElement()).getName();
//							if(((ControllersConfiguration) cell.getElement()).isActive()){
//								text += " [Active]";
//							}
//							cell.setText(text);
//						}
//					}
//					
//					@Override
//					public String getToolTipText(Object element) {
//						if (element instanceof ControllersConfiguration) {
//							return ((Described)element).getDescription();
//						}
//						return super.getToolTipText(element);
//					}
//
//					@Override
//					public Point getToolTipShift(Object object) {
//						return new Point(5, 5);
//					}
//
//					@Override
//					public int getToolTipDisplayDelayTime(Object object) {
//						return 500;
//					}
//
//					@Override
//					public int getToolTipTimeDisplayed(Object object) {
//						return 5000;
//					}
//
//				};
//			}
//		};
//	}
//	
//	protected void setSession(InvocatorSession invocatorSession){
//		EList<EObject> programsGroup = new BasicEList<>();
//		programsGroup.addAll(ControllersGroup.INSTANCE.getPrograms());
//		
//		// TODO
//		((EObjectListComposite) getContentComposite()).setEObjectsList(programsGroup);
//		// ((AdvancedEditorComposite)getContentComposite()).setEObject(invocatorSession);
//		
//	}
}