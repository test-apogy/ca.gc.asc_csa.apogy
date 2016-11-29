package ca.gc.asc_csa.apogy.common.io.jinput.ui.parts;

import javax.annotation.PreDestroy;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import ca.gc.asc_csa.apogy.common.io.jinput.EControllerEnvironment;
import ca.gc.asc_csa.apogy.common.io.jinput.ui.composites.JInputStatusComposite;
import ca.gc.asc_csa.apogy.common.ui.composites.NoContentComposite;
import ca.gc.asc_csa.apogy.common.ui.parts.AbstractApogyPart;

public class JInputStatusPart extends AbstractApogyPart {

	EControllerEnvironment eControllerEnvironment;
	Adapter adapter;

	@Override
	protected EObject getInitializeObject() {
		this.eControllerEnvironment = ca.gc.asc_csa.apogy.common.io.jinput.Activator.getEControllerEnvironment();
		this.eControllerEnvironment.eAdapters().add(getAdapter());
		ca.gc.asc_csa.apogy.common.io.jinput.Activator.getEControllerEnvironment().eAdapters().add(getAdapter());

		return this.eControllerEnvironment;
	}

	@Override
	protected void createContentComposite(Composite parent, int style) {
		new JInputStatusComposite(parent, SWT.None);
	}

	@Override
	protected void setCompositeContent(EObject eObject) {
		((JInputStatusComposite) getActualComposite()).setEControllerEnvironment();
	}

	@Override
	protected void createNoContentComposite(Composite parent, int style) {
		new NoContentComposite(parent, SWT.None) {
			@Override
			protected String getMessage() {
				return "No controller";
			}
		};
	}

	private Adapter getAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification notification) {
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							if (((JInputStatusComposite) getActualComposite()).getTreeViewer() != null
									&& !((JInputStatusComposite) getActualComposite()).getTree().isDisposed())
								((JInputStatusComposite) getActualComposite()).getTreeViewer().refresh(true);
						}
					});
				}

				@Override
				public Notifier getTarget() {
					return null;
				}
			};
		}
		return adapter;
	}

	@PreDestroy
	public void dispose() {
		if (eControllerEnvironment != null) {
			eControllerEnvironment.eAdapters().remove(getAdapter());
		}
	}

}
