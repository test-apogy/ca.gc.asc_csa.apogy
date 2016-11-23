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
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class EObjectDocumentationComposite extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Text txtDocumentation;
	EObject object;
	
	/**
	 * Create the parentComposite.
	 * @param parent
	 * @param style
	 */
	public EObjectDocumentationComposite(Composite parent, int style) {
		super(parent, style);

		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		setLayout(gridLayout);
		
		txtDocumentation = new Text(this, SWT.WRAP | SWT.V_SCROLL | SWT.MULTI);
		txtDocumentation.setEditable(false);
		GridData gd_txtDocumentation = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_txtDocumentation.minimumHeight = 100;
		gd_txtDocumentation.heightHint = 150;
		txtDocumentation.setLayoutData(gd_txtDocumentation);
		toolkit.adapt(txtDocumentation, true, true);
	}
	
	public void setEObject(EObject element)
	{
		this.object = element;
		updateText();
	}
	
	public EObject getEObject()
	{
		return object;
	}
	
	private void updateText()
	{
		String doc = "";
		if(object != null) {
			ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			IItemLabelProvider provider = (IItemLabelProvider)adapterFactory.adapt(object, IItemLabelProvider.class);
			doc = provider.getText(object);
		}
		
		if(object instanceof EModelElement) {
			String elementDoc = EcoreUtil.getDocumentation((EModelElement)object);
			if(elementDoc != null) {
				doc = String.format("%s%n%n%s", doc, elementDoc);
			}
		}
		txtDocumentation.setText(doc);
	}
	
	@Override
	public void dispose() {
		super.dispose();
		toolkit.dispose();
	}
}