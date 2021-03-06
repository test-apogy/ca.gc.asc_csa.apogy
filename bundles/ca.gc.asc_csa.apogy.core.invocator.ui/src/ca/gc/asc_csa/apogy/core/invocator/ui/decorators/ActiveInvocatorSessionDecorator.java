package ca.gc.asc_csa.apogy.core.invocator.ui.decorators;
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

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Display;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ui.Activator;
import org.eclipse.ui.IDecoratorManager;

public class ActiveInvocatorSessionDecorator extends LabelProvider implements
		ILightweightLabelDecorator {

	public static String DECORATOR_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.decorators.ActiveInvocatorSessionDecorator";
	private static String SUFFIX = " (Active)";

//	private static ImageDescriptor ACTIVE_IMG_DESCRIPTOR = AbstractUIPlugin
//			.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
//					"icons/ovr/active_session_7x8.gif");
	
	private boolean found = false;

	private AdapterImpl ApogyCoreInvocatorFacadeAdapter;

	private IFile activeSessionFile = null;

	public ActiveInvocatorSessionDecorator() {
		super();
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().add(
				getApogyCoreInvocatorFacadeAdapter());
	}

	private Adapter getApogyCoreInvocatorFacadeAdapter() {
		if (ApogyCoreInvocatorFacadeAdapter == null) {
			ApogyCoreInvocatorFacadeAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeatureID(ApogyCoreInvocatorFacade.class) == ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION) {
						final ActiveInvocatorSessionDecorator decorator = getActiveInvocatorSessionDecorator();
						if (decorator != null) {
							Display.getDefault().asyncExec(new Runnable() {
								public void run() {
									activeSessionFile = ApogyCoreInvocatorFacade.INSTANCE
											.getActiveInvocatorSession() != null ? ApogyCommonEMFFacade.INSTANCE
											.getFile(ApogyCoreInvocatorFacade.INSTANCE
													.getActiveInvocatorSession()
													.eResource())
											: null;

									Activator.getDefault().getWorkbench()
											.getDecoratorManager()
											.update(DECORATOR_ID);
								}
							});
						}
					}
				}
			};
		}
		return ApogyCoreInvocatorFacadeAdapter;
	}

	private static ActiveInvocatorSessionDecorator getActiveInvocatorSessionDecorator() {
		IDecoratorManager decoratorManager = Activator.getDefault()
				.getWorkbench().getDecoratorManager();
		return (ActiveInvocatorSessionDecorator) decoratorManager
				.getBaseLabelProvider(DECORATOR_ID);
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	@Override
	public void dispose() {
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().remove(
				getApogyCoreInvocatorFacadeAdapter());
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
	}

	@Override
	public void decorate(Object element, IDecoration decoration) {
		
		InvocatorSession activeSession = ApogyCoreInvocatorFacade.INSTANCE
				.getActiveInvocatorSession();
		
		if (activeSession != null){
			if (element instanceof InvocatorSession){				
				if (activeSession == element){			
//					decoration.addOverlay(ACTIVE_IMG_DESCRIPTOR);
					decoration.addSuffix(SUFFIX);
				}
			}
			if (element instanceof IContainer){
				IContainer currentContainer = (IContainer) element;
				found = false;
				
				try {
					currentContainer.accept(new IResourceVisitor() {				
						@Override
						public boolean visit(IResource resource) throws CoreException {
							if (resource.equals(activeSessionFile)){
								found = true;
							}
							return true;
						}
					});
				} catch (CoreException e) {
				}				
				
				if (found){
//					decoration.addOverlay(ACTIVE_IMG_DESCRIPTOR);
					decoration.addSuffix(SUFFIX);
				}
			}
			if (element instanceof IFile) {			
				if (element.equals(activeSessionFile)){
//					decoration.addOverlay(ACTIVE_IMG_DESCRIPTOR);
					decoration.addSuffix(SUFFIX);
				}
			}	
			if (element instanceof Resource){
				if (element.equals(activeSession.eResource())){
//					decoration.addOverlay(ACTIVE_IMG_DESCRIPTOR);
					decoration.addSuffix(SUFFIX);
				}
			}
		}
	}
}