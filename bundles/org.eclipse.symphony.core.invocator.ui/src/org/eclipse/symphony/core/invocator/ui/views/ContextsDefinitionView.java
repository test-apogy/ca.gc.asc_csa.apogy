package org.eclipse.symphony.core.invocator.ui.views;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.ui.composites.ContextsDefinitionComposite;

import ca.gc.asc_csa.eclipse.ui.views.AbstractView;

public class ContextsDefinitionView extends AbstractView implements	IEditingDomainProvider {
	private ContextsDefinitionComposite contextsDefinitionComposite;
	private Adapter adapter;

	@Override
	public void updatePartName() {
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		contextsDefinitionComposite = new ContextsDefinitionComposite(parent,
				SWT.None) {
			@Override
			protected void newSelection(ISelection selection) {
				getSelectionProvider().setSelection(selection);
			}
		};
		InvocatorSession activeSession = EMFEcoreInvocatorFacade.INSTANCE
				.getActiveInvocatorSession();
		contextsDefinitionComposite.setEnvironment(activeSession == null ? null
				: activeSession.getEnvironment());
		EMFEcoreInvocatorFacade.INSTANCE.eAdapters().add(
				getEMFEcoreInvocatorFacadeAdapter());
	}

	private Adapter getEMFEcoreInvocatorFacadeAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeatureID(EMFEcoreInvocatorFacade.class) == EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION) {
						InvocatorSession activeSession = EMFEcoreInvocatorFacade.INSTANCE
								.getActiveInvocatorSession();
						contextsDefinitionComposite
								.setEnvironment(activeSession == null ? null
										: activeSession.getEnvironment());
					}
				}
			};
		}
		return adapter;
	}

	@Override
	public void dispose() {
		super.dispose();
		EMFEcoreInvocatorFacade.INSTANCE.eAdapters().remove(
				getEMFEcoreInvocatorFacadeAdapter());
	}

	@Override
	public void updateSelection(ISelection selection) {
	}

	@Override
	public EditingDomain getEditingDomain() {
		return AdapterFactoryEditingDomain.getEditingDomainFor(EMFEcoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
	}
}