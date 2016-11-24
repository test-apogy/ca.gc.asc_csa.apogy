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
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import ca.gc.asc_csa.apogy.common.ui.composites.NoContentComposite;

abstract public class AbstractApogyPart {

	private Composite parentComposite;

	@Inject
	protected ESelectionService selectionService;

	private Composite contentComposite;

	@PostConstruct
	public void createPartControl(Composite parent) {
		parentComposite = parent;
		parentComposite.setLayout(new FillLayout());
		setNoContentComposite();
		parentComposite.layout();
		setEObject(getInitializeObject());
	}
	
	/**
	 * Returns the content {@link Composite}.
	 * @return Reference to the {@link Composite}. 
	 */
	public Composite getContentComposite() {
		return contentComposite;
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
	abstract protected void createContentComposite(Composite parent, int style);

	/**
	 * Gets the content {@link Composite} in the part.
	 * 
	 * @return {@link Composite}
	 */
	public Composite getActualComposite() {
		if (parentComposite != null) {
			if (parentComposite.getChildren().length > 0) {
				return (Composite) parentComposite.getChildren()[0];
			}
		}
		return null;
	}

	/**
	 * This method is called when the {@link EObject} needs to be changed or
	 * initialized in the content parentComposite.
	 * 
	 * @param eObject
	 *            Reference to the EObject.
	 */
	abstract protected void setCompositeContent(EObject eObject);

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
	 * Null EObjects sets the content parentComposite to a nullSelection parentComposite according to the implemented part.
	 * @param eObject
	 */
	protected void setEObject(EObject eObject) {
		if (parentComposite != null) {
			if (eObject != null) {
				if (getActualComposite() instanceof NoContentComposite) {
					for (Control control : parentComposite.getChildren()) {
						control.dispose();
					}
					createContentComposite(parentComposite, SWT.None);
					parentComposite.layout();
				}
				setCompositeContent(eObject);

			} else {
				setNoContentComposite();
			}
		}
	}

	/**
	 * Sets the part's parentComposite to a {@link NoActiveSessionComposite}.
	 */
	protected void setNoContentComposite() {
		if (getActualComposite() != null) {
			for (Control control : parentComposite.getChildren()) {
				control.dispose();
			}
		}
		createNoContentComposite(parentComposite, SWT.None);
		parentComposite.layout();

		setNullSelection();
	}

	/**
	 * Specifies the {@link NoContentComposite} to set in the part when there is no content to display.
	 * @return {@link NoContentComposite}
	 */
	abstract protected void createNoContentComposite(Composite parent, int style);
}