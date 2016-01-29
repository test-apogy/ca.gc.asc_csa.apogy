package ca.gc.asc_csa.apogy.core.invocator.ui.views;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.ContextsDefinitionComposite;

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
		InvocatorSession activeSession = ApogyCoreInvocatorFacade.INSTANCE
				.getActiveInvocatorSession();
		contextsDefinitionComposite.setEnvironment(activeSession == null ? null
				: activeSession.getEnvironment());
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().add(
				getApogyCoreInvocatorFacadeAdapter());
	}

	private Adapter getApogyCoreInvocatorFacadeAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeatureID(ApogyCoreInvocatorFacade.class) == ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION) {
						InvocatorSession activeSession = ApogyCoreInvocatorFacade.INSTANCE
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
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().remove(
				getApogyCoreInvocatorFacadeAdapter());
	}

	@Override
	public void updateSelection(ISelection selection) {
	}

	@Override
	public EditingDomain getEditingDomain() {
		return AdapterFactoryEditingDomain.getEditingDomainFor(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
	}
}