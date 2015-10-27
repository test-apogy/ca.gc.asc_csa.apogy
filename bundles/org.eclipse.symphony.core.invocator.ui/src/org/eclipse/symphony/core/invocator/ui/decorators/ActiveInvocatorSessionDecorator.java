package org.eclipse.symphony.core.invocator.ui.decorators;

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
import org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.ui.Activator;
import org.eclipse.ui.IDecoratorManager;

public class ActiveInvocatorSessionDecorator extends LabelProvider implements
		ILightweightLabelDecorator {

	public static String DECORATOR_ID = "org.eclipse.symphony.core.invocator.ui.decorators.ActiveInvocatorSessionDecorator";
	private static String SUFFIX = " (Active)";

//	private static ImageDescriptor ACTIVE_IMG_DESCRIPTOR = AbstractUIPlugin
//			.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
//					"icons/ovr/active_session_7x8.gif");
	
	private boolean found = false;

	private AdapterImpl emfEcoreInvocatorFacadeAdapter;

	private IFile activeSessionFile = null;

	public ActiveInvocatorSessionDecorator() {
		super();
		Symphony__CoreInvocatorFacade.INSTANCE.eAdapters().add(
				getEMFEcoreInvocatorFacadeAdapter());
	}

	private Adapter getEMFEcoreInvocatorFacadeAdapter() {
		if (emfEcoreInvocatorFacadeAdapter == null) {
			emfEcoreInvocatorFacadeAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeatureID(Symphony__CoreInvocatorFacade.class) == Symphony__CoreInvocatorPackage.SYMPHONY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION) {
						final ActiveInvocatorSessionDecorator decorator = getActiveInvocatorSessionDecorator();
						if (decorator != null) {
							Display.getDefault().asyncExec(new Runnable() {
								public void run() {
									activeSessionFile = Symphony__CoreInvocatorFacade.INSTANCE
											.getActiveInvocatorSession() != null ? Symphony__CommonEMFFacade.INSTANCE
											.getFile(Symphony__CoreInvocatorFacade.INSTANCE
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
		return emfEcoreInvocatorFacadeAdapter;
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
		Symphony__CoreInvocatorFacade.INSTANCE.eAdapters().remove(
				getEMFEcoreInvocatorFacadeAdapter());
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
		
		InvocatorSession activeSession = Symphony__CoreInvocatorFacade.INSTANCE
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