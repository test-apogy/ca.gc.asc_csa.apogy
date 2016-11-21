package ca.gc.asc_csa.apogy.common.emf.ui.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectComposite;

public abstract class AbstractEObjectPart extends AbstractSelectionBasedPart {

	Composite contentComposite;
	private EObjectComposite eObjectComposite;

	@Override
	protected Composite createContentComposite(Composite parent) {
		contentComposite = new Composite(parent, SWT.NONE);
		contentComposite.setLayout(new GridLayout(1, true));
		contentComposite.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
//		contentComposite.setLayout(GridLayoutFactory.fillDefaults().margins(10, 10).create());
//		contentComposite.setLayoutData(GridDataFactory.fillDefaults().create());
		eObjectComposite = new EObjectComposite(contentComposite, SWT.None);
		return contentComposite;
	}

	@Override
	protected void setSelectionInContentComposite(EObject eObject) {
		eObjectComposite.setEObject(eObject);
	}

//	@Inject
//	@Optional
//	private void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) ISelection selection) {
//		System.out.println("AbstractEObjectPart.setSelection()");
//		List<Object> eObjects = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection, EObject.class);
//		if (!eObjects.isEmpty()) {
//			setEObject((EObject) eObjects.get(0));
//		}
//	}
}