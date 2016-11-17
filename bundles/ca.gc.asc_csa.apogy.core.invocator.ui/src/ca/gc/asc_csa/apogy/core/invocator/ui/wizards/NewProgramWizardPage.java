package ca.gc.asc_csa.apogy.core.invocator.ui.wizards;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.DescribedComposite;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.NamedComposite;
import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ProgramSettings;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.NewProgramComposite;

public class NewProgramWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.NewProgramWizardPage";
	private NewProgramComposite newProgramComposite;
	private NamedComposite namedComposite;
	private DescribedComposite describedComposite;
	private Adapter adapter; 
	private ProgramsGroup programsGroup;
	private EClass programSuperClass;
	private EClass programsType;
	private ProgramSettings programSettings;
	
	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public NewProgramWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("New Program");
		setDescription("Select the programs's group and type.");
	}

	public NewProgramWizardPage(
			ProgramsGroup programsGroup, EClass programSuperClass, ProgramSettings programSettings) {
		this();
		if (this.programsGroup != null){
			this.programsGroup.eAdapters().remove(getAdapter());
		}
		if (this.programSuperClass != null){
			this.programSuperClass.eAdapters().remove(getAdapter());
		}
		if (this.programSettings != null){
			this.programSettings.eAdapters().remove(getAdapter());
		}
		
		this.programSuperClass = programSuperClass;
		programSuperClass.eAdapters().add(getAdapter());
		
		this.programSettings = programSettings;
		programSettings.eAdapters().add(getAdapter());
		
		if(programsGroup != null){
			this.programsGroup = programsGroup;
			programsGroup.eAdapters().add(getAdapter());
		}
	}

	private Adapter getAdapter() {
		if (adapter == null){
			adapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification msg) {
					validate();
				}
			};
		}				
		return adapter;
	}
	
	public EClass getProgramType(){
		return this.programsType;
	}
	
	public ProgramsGroup getProgramsGroup(){
		return this.programsGroup;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */	
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.None);
		container.setLayout(new GridLayout(2, false));

		newProgramComposite = new NewProgramComposite(container, SWT.None);
		if(programsGroup != null){
			newProgramComposite.setProgramsList(programsGroup.getProgramsList(), programsGroup);
		}else{
			newProgramComposite.setProgramsList(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getProgramsList(), null);
		}
		newProgramComposite.setProgramSuperClass(programSuperClass);
		newProgramComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 2));
		newProgramComposite.getTreeViewerGroups().addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (NewProgramWizardPage.this.programsGroup != null){
					NewProgramWizardPage.this.programsGroup.eAdapters().remove(getAdapter());
				}
				NewProgramWizardPage.this.programsGroup = (ProgramsGroup) ((StructuredSelection) event.getSelection()).getFirstElement();
				NewProgramWizardPage.this.programsGroup.eAdapters().add(getAdapter());
				if(newProgramComposite.getTreeViewerTypes().getSelection() != null){
					NewProgramWizardPage.this.programSettings
					.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(NewProgramWizardPage.this.programsGroup,
							EcoreUtil.create(NewProgramWizardPage.this.programsType), ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS));
				}
				validate();
			}
		});
		newProgramComposite.getTreeViewerTypes().addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (NewProgramWizardPage.this.programsType != null){
					NewProgramWizardPage.this.programsType.eAdapters().remove(getAdapter());
				}
				NewProgramWizardPage.this.programsType = (EClass) ((StructuredSelection) event.getSelection())
						.getFirstElement();
				NewProgramWizardPage.this.programsType.eAdapters().add(getAdapter());
				NewProgramWizardPage.this.programSettings
						.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(NewProgramWizardPage.this.programsGroup,
								EcoreUtil.create(NewProgramWizardPage.this.programsType), ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS));
				validate();
			}
		});
		
		namedComposite = new NamedComposite(container, SWT.NONE);
		namedComposite.setNamed(programSettings);
		namedComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1,1));
		
		describedComposite = new DescribedComposite(container, SWT.NONE);
		describedComposite.setDescribed(programSettings);
		describedComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,1));

		setControl(container);
		
		ApogyCommonUiFacade.INSTANCE.adjustWizardPage(this, 0.8);
		
		validate();
	}
	
	@Override
	public void dispose() {
		super.dispose();
		if (this.programsGroup != null){
			this.programsGroup.eAdapters().remove(getAdapter());
		}		
		if (this.programSuperClass != null){
			this.programSuperClass.eAdapters().remove(getAdapter());
		}
	}
	
	/** 
	 * This method is invoked to validate the content. 
	 */
	protected void validate() {	
		String errorGroup = "";
		String errorType = "";
		String errorName = "";
		String infoDescription = "";
		
		if(programsGroup == null){
			errorGroup = " <group>";
		}
		if(programsType == null){
			errorType = " <type>";
		}
		if(programSettings == null || programSettings.getName() == null){
			errorName = " <name>";
		}
		if(programSettings == null || programSettings.getDescription() == null){
			infoDescription = "It is recommended to enter a description";
		}
		
		setMessage(infoDescription);
		if(errorGroup != "" || errorType != "" || errorName != ""){
			setErrorMessage(errorGroup + errorType + errorName + " must be provided");
			setPageComplete(false);
		}else{
			setErrorMessage(null);
			setPageComplete(true);
		}
	}
	
	@Override
	public void setPageComplete(boolean complete) {
		super.setPageComplete(complete);
	}
}