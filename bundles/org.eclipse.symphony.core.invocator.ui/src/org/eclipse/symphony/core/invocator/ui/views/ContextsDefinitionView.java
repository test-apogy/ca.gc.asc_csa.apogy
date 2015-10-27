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
import org.eclipse.symphony.common.ui.views.AbstractView;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.ui.composites.ContextsDefinitionComposite;

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
		InvocatorSession activeSession = Symphony__CoreInvocatorFacade.INSTANCE
				.getActiveInvocatorSession();
		contextsDefinitionComposite.setEnvironment(activeSession == null ? null
				: activeSession.getEnvironment());
		Symphony__CoreInvocatorFacade.INSTANCE.eAdapters().add(
				getEMFEcoreInvocatorFacadeAdapter());
	}

	private Adapter getEMFEcoreInvocatorFacadeAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeatureID(Symphony__CoreInvocatorFacade.class) == Symphony__CoreInvocatorPackage.SYMPHONY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION) {
						InvocatorSession activeSession = Symphony__CoreInvocatorFacade.INSTANCE
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
		Symphony__CoreInvocatorFacade.INSTANCE.eAdapters().remove(
				getEMFEcoreInvocatorFacadeAdapter());
	}

	@Override
	public void updateSelection(ISelection selection) {
	}

	@Override
	public EditingDomain getEditingDomain() {
		return AdapterFactoryEditingDomain.getEditingDomainFor(Symphony__CoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
	}
}