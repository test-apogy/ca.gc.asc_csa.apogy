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

import ca.gc.asc_csa.apogy.common.ui.composites.NoContentComposite;

abstract public class AbstractApogyPart {

	private Composite parentComposite;


	@Inject
	protected ESelectionService selectionService;
	
	@Inject
	protected EPartService partService;

	@PostConstruct
	public void createPartControl(Composite parent) {
		parentComposite = parent;
		parentComposite.setLayout(new FillLayout());
		setNoContentComposite();
		parentComposite.layout();
		setEObject(getInitializeObject());
	}

	/**
	 * Returns the parent {@link Composite}.
	 * @return Reference to the {@link Composite}.
	 */
	public Composite getParentComposite() {
		return parentComposite;
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
	 * Null EObjects sets the content parentComposite to a nullSelection parentComposite according to the implemented part.
	 * @param eObject
	 */
	protected void setEObject(EObject eObject) {
		if (parentComposite != null) {
			if (eObject != null) {
				if (getContentComposite() instanceof NoContentComposite) {
					getContentComposite().dispose();
					createContentComposite(parentComposite);
					parentComposite.layout();
				}
				setContentCompositeSelection(eObject);

			} else {
				setNoContentComposite();
			}
		}
	}

	/**
	 * Sets the part's parentComposite to a {@link NoActiveSessionComposite}.
	 */
	private void setNoContentComposite() {
		if (getContentComposite() != null) {
			getContentComposite().dispose();
		}
		getNoContentComposite();
		parentComposite.layout();

		setNullSelection();
	}

	/**
	 * Specifies the {@link NoContentComposite} to set in the part when there is no content to display.
	 * @return {@link NoContentComposite}
	 */
	abstract protected NoContentComposite getNoContentComposite();
	
	/**
	 * Disposes the {@link NoContentComposite} if any.
	 */
	public void dispose(){
	}
}