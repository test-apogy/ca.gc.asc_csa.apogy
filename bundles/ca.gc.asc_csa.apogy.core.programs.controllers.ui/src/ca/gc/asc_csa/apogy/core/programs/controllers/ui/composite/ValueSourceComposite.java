package ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.SubClassesListComposite;
import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsFacade;
import ca.gc.asc_csa.apogy.common.io.jinput.ui.composites.ControllerSelectionComposite;
import ca.gc.asc_csa.apogy.common.ui.composites.NoContentComposite;
import ca.gc.asc_csa.apogy.core.programs.controllers.AbstractInputConditioning;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFacade;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerValueSource;
import ca.gc.asc_csa.apogy.core.programs.controllers.FixedValueSource;
import ca.gc.asc_csa.apogy.core.programs.controllers.ToggleValueSource;

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

public class ValueSourceComposite extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	private Section typesSection;
	private SubClassesListComposite valueSourcesTypesComposite;

	private Section valueSection;
	private Composite valueComposite;
	private BindedEDataTypeArgument bindedEDataTypeArgument;

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	/**
	 * Create the parentComposite.
	 * 
	 * @param parent
	 *            Reference to the parent parentComposite.
	 * @param style
	 *            Composite style.
	 */
	public ValueSourceComposite(Composite parent, int style) {
		super(parent, style);
		GridLayout gridLayout = new GridLayout();
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		gridLayout.marginBottom = 5;
		this.setLayout(gridLayout);

		/**
		 * Value source
		 */
		typesSection = toolkit.createSection(this, Section.EXPANDED | Section.TITLE_BAR);
		typesSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		typesSection.setLayout(new FillLayout());
		typesSection.setText("Source");

		valueSourcesTypesComposite = new SubClassesListComposite(typesSection, SWT.None) {
			@Override
			protected void newSelection(TreeSelection selection) {
				if (bindedEDataTypeArgument.getValueSource().eClass() != valueSourcesTypesComposite
						.getSelectedSubClass()) {
					if (valueSourcesTypesComposite
							.getSelectedSubClass() == ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE) {
						ApogyCoreProgramsControllersFacade.INSTANCE
								.initBindedEDataTypeArgument(bindedEDataTypeArgument);
					} else {
						// Set the new value source.
						ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(bindedEDataTypeArgument,
								ApogyCoreProgramsControllersPackage.Literals.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE,
								EcoreUtil.create((EClass) selection.getFirstElement()));

					}
					setValueComposite();
					ValueSourceComposite.this.newSelection(selection);
				}
			}

			/**
			 * This content provider removes the ToggleValueSource if the
			 * EParameter of the Argument is not a boolean.
			 */
			@Override
			protected AdapterFactoryContentProvider getContentProvider() {
				return new AdapterFactoryContentProvider(adapterFactory) {
					@Override
					public boolean hasChildren(Object object) {
						return false;
					}

					@Override
					public Object[] getElements(Object object) {
						List<EClass> eClasses = ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses((EClass) object);

						if (bindedEDataTypeArgument != null && bindedEDataTypeArgument.getEParameter()
								.getEType() != EcorePackage.Literals.EBOOLEAN) {
							eClasses.remove(ApogyCoreProgramsControllersPackage.Literals.TOGGLE_VALUE_SOURCE);
						}
						return eClasses.toArray();
					}
				};
			}

			@Override
			protected StyledCellLabelProvider getLabelProvider() {
				return new StyledCellLabelProvider() {
					@Override
					public void update(ViewerCell cell) {
						if (cell.getElement() instanceof EClass) {
							cell.setText(((EClass) cell.getElement()).getName());
						}
					}
				};
			}
		};
		valueSourcesTypesComposite.setSuperClass(ApogyCoreProgramsControllersPackage.Literals.VALUE_SOURCE);

		typesSection.setClient(valueSourcesTypesComposite);

		/**
		 * Value source value
		 */
		valueSection = toolkit.createSection(this, Section.EXPANDED | Section.TITLE_BAR);
		valueSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		valueSection.setLayout(new FillLayout());
		valueSection.setText("Value");

		valueComposite = new Composite(valueSection, SWT.None);
		GridLayout gridLayoutValue = new GridLayout(1, false);
		gridLayoutValue.marginWidth = 0;
		gridLayoutValue.marginHeight = 0;
		valueComposite.setLayout(gridLayoutValue);

		valueSection.setClient(valueComposite);
	}

	/**
	 * This method is called when a new selection is made.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}

	/**
	 * Sets the value composite depending on the ValueSource
	 */
	private void setValueComposite() {
		if (valueComposite != null) {
			for (Control control : valueComposite.getChildren()) {
				control.dispose();
			}
		}

		if (bindedEDataTypeArgument.getValueSource() instanceof ControllerValueSource) {
			ControllerSelectionComposite controllerSelectionComposite = new ControllerSelectionComposite(valueComposite,
					SWT.None);
			controllerSelectionComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			controllerSelectionComposite.setEComponentQualifier(
					((ControllerValueSource) bindedEDataTypeArgument.getValueSource()).getEComponentQualifier());
			controllerSelectionComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		} else if (bindedEDataTypeArgument.getValueSource() instanceof FixedValueSource) {
			ApogyCommonEMFUiEMFFormsFacade.INSTANCE.createEMFForms(valueComposite,
					bindedEDataTypeArgument.getValueSource());
		} else if (bindedEDataTypeArgument.getValueSource() instanceof ToggleValueSource) {
			NoContentComposite noContentComposite = new NoContentComposite(valueComposite, SWT.None) {
				@Override
				protected String getMessage() {
					return "No compatible selection";
				}
			};
			noContentComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			noContentComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		}
		this.layout();
	}

	/**
	 * Binds the {@link AbstractInputConditioning} with the UI components.
	 * 
	 * @param abstractInputConditioning
	 *            Reference to the {@link AbstractInputConditioning}.
	 */
	public void setBindedEDataTypeArgument(BindedEDataTypeArgument bindedEDataTypeArgument) {
		this.bindedEDataTypeArgument = bindedEDataTypeArgument;

		valueSourcesTypesComposite.refresh();
		setValueComposite();
	}

}