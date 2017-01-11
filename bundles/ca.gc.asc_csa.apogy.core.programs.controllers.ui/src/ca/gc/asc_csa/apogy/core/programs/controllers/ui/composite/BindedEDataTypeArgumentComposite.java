package ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;

import ca.gc.asc_csa.apogy.common.ui.composites.NoContentComposite;
import ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerValueSource;

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

public class BindedEDataTypeArgumentComposite extends ScrolledComposite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	private Composite composite;

	private ValueSourceComposite compositeValueSource;

	private Section sectionConditioning;
	private Composite compositeConditioning;

	private BindedEDataTypeArgument bindedEDataTypeArgument;

	/**
	 * Create the parentComposite.
	 * 
	 * @param parent
	 *            Reference to the parent parentComposite.
	 * @param style
	 *            Composite style.
	 */
	public BindedEDataTypeArgumentComposite(Composite parent, int style) {
		super(parent, style);
		this.computeSize(1, 1);
		setExpandHorizontal(true);
		setExpandVertical(true);

		composite = new Composite(this, SWT.None);
		composite.setLayout(new GridLayout(2, true));

		/**
		 * Value source
		 */
		compositeValueSource = new ValueSourceComposite(composite, SWT.None) {
			@Override
			protected void newSelection(ISelection selection) {
				BindedEDataTypeArgumentComposite.this.newSelection(selection);
			}
		};
		compositeValueSource.setLayout(new FillLayout());
		compositeValueSource.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		compositeValueSource.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		compositeValueSource.setBackgroundMode(SWT.INHERIT_FORCE);

		/**
		 * Conditioning
		 */
		sectionConditioning = toolkit.createSection(composite, Section.EXPANDED | Section.TITLE_BAR);
		sectionConditioning.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		sectionConditioning.setLayout(new FillLayout());
		sectionConditioning.setText("Conditioning");
		compositeConditioning = getNoContentComposite(sectionConditioning);

		setContent(composite);
		setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}

	/**
	 * Binds the {@link BindedEDataTypeArgument} with the UI components.
	 * 
	 * @param bindedEDataTypeArgument
	 *            Reference to the {@link BindedEDataTypeArgument}.
	 */
	public void setBindedEDataTypeArgument(BindedEDataTypeArgument bindedEDataTypeArgument) {
		this.bindedEDataTypeArgument = bindedEDataTypeArgument;

		compositeValueSource.setBindedEDataTypeArgument(bindedEDataTypeArgument);
		updateCompositeConditioning();
	}

	/**
	 * Updates the conditioning composite depending on the selected argument.
	 */
	private void updateCompositeConditioning() {
		if (compositeConditioning != null) {
			compositeConditioning.dispose();
		}

		if (bindedEDataTypeArgument != null
				&& bindedEDataTypeArgument.getValueSource() instanceof ControllerValueSource) {
			compositeConditioning = new ConditioningComposite(sectionConditioning, SWT.NO_SCROLL) {
				@Override
				protected void newSelection(ISelection selection) {
					BindedEDataTypeArgumentComposite.this.newSelection(selection);
				}
			};
			((ConditioningComposite) compositeConditioning).setAbstractInputConditioning(
					((ControllerValueSource) bindedEDataTypeArgument.getValueSource()).getConditioning());

			if (((ControllerValueSource) bindedEDataTypeArgument.getValueSource()).getEComponentQualifier() != null) {
				((ConditioningComposite) compositeConditioning).setEComponentQualifier(
						((ControllerValueSource) bindedEDataTypeArgument.getValueSource()).getEComponentQualifier());
			}

			compositeConditioning.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		} else {
			compositeConditioning = getNoContentComposite(sectionConditioning);
		}

		sectionConditioning.setClient(compositeConditioning);
		sectionConditioning.layout();
		layout();
	}

	/**
	 * Returns a {@link NoContentComposite} if a detail section is not
	 * applicable.
	 * 
	 * @param section
	 *            The parent {@link Section}.
	 * @return Reference to the {@link NoContentComposite}.
	 */
	private Composite getNoContentComposite(Composite parent) {
		NoContentComposite composite = new NoContentComposite(parent, SWT.None) {
			@Override
			protected String getMessage() {
				return "No compatible selection";
			}
		};
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite.setBackgroundMode(SWT.INHERIT_FORCE);
		return composite;
	}

	/**
	 * This method is called when a new selection is made .
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}

	@Override
	public void dispose() {
		toolkit.dispose();
		super.dispose();
	}

}