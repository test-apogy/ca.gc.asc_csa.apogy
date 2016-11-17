package ca.gc.asc_csa.apogy.common.ui.parts;
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

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

abstract public class AbstractApogyPart {

	protected Composite composite;

	@Inject
	protected ESelectionService selectionService;
	
	@Inject
	protected EPartService partService;

	@PostConstruct
	public void createPartControl(Composite parent) {
		composite = parent;
		composite.setLayout(new FillLayout());
		setNoContentComposite();
		composite.layout();
		setEObject(getInitializeObject());
	}
	
	/**
	 * Specifies the {@link EObject} to initially set in the part.
	 * 
	 * @return EObject
	 */
	abstract protected EObject getInitializeObject();

	/**
	 * Specifies the {@link Composite} to create in the part.
	 */
	abstract protected Composite createContentComposite(Composite parent);

	/**
	 * Gets the content {@link Composite} in the part.
	 * 
	 * @return {@link Composite}
	 */
	public Composite getContentComposite() {
		if (composite != null) {
			if (composite.getChildren().length > 0) {
				return (Composite) composite.getChildren()[0];
			}
		}
		return null;
	}

	/**
	 * This method is called when the {@link EObject} needs to be changed or
	 * initialized in the content composite.
	 * 
	 * @param eObject
	 *            Reference to the EObject.
	 */
	abstract protected void setContentCompositeSelection(EObject eObject);

	/**
	 * This method is called when the selection needs to be set to null. This
	 * method should first set the part active using the {@link EPartService}
	 * and then create an empty selection according to the implemented part and
	 * set the selection in the {@link ESelectionService}.
	 */
	protected void setNullSelection() {
	}

	/**
	 * This method sets the {@link EObject} in the part.
	 * Null EObjects sets the content composite to a nullSelection composite according to the implemented part.
	 * @param eObject
	 */
	protected void setEObject(EObject eObject) {
		if (composite != null) {
			if (eObject != null) {
				if (getContentComposite().getClass() == getNoContentCompositeClass()) {
					// Disposes the NoActiveSessionComposite
					for (Control control : composite.getChildren()) {
						control.dispose();
					}
					createContentComposite(composite);
					composite.layout();
				}
				setContentCompositeSelection(eObject);

			} else {
				setNoContentComposite();
			}
		}
	}

	/**
	 * Sets the part's composite to a {@link NoActiveSessionComposite}.
	 */
	protected void setNoContentComposite() {
		if (getContentComposite() == null || !(getContentComposite().getClass() == getNoContentCompositeClass())) {
			// Disposes the content composite
			if (getContentComposite() != null) {
				getContentComposite().dispose();
			}
			getNoContentComposite();
			composite.layout();

			setNullSelection();
		}
	}

	/**
	 * Specifies the {@link Composite} to set in the part when there is no content to display.
	 * @return {@link Composite}
	 */
	abstract protected Composite getNoContentComposite();

	/**
	 * Specifies the class of the {@link Composite} set in the part if there is no content to display. This is used to verify the Composite in the part. 
	 * @return {@link Class<? extends Composite>}
	 */
	abstract protected Class<? extends Composite> getNoContentCompositeClass();

}