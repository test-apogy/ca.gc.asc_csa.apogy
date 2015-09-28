package ca.gc.asc_csa.symphony.environment.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.ui.properties.sections.AbstractExtendedPropertySection;
import ca.gc.space.math.Tuple3d;
import ca.gc.space.math.ui.composites.Tuple3dComposite;

public class PositionCoordinatesSection extends AbstractExtendedPropertySection implements
		IFilter {

	@Override
	public boolean select(Object toTest) {
		return ca.gc.asc_csa.eclipse.converters.Activator.convert(toTest, Tuple3d.class) != null;
	}

	@Override
	protected void render(EObject eObject) 
	{
		Tuple3d tuple3d = (Tuple3d) ca.gc.asc_csa.eclipse.converters.Activator.convert(eObject, Tuple3d.class);
		if (tuple3d != null) 
		{			
			((Tuple3dComposite) getComposite()).setTuple3d(tuple3d);
		}
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected Composite createComposite(Composite parent) 
	{
//		Composite container = new Composite(parent, SWT.NONE);
//		container.setLayout(new GridLayout(3, true));
//		
//		Label latitudeLabel = new Label(container, SWT.NONE);
//		latitudeLabel.setText("X (m)");
//		latitudeLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
//
//		Label longitudeLabel = new Label(container, SWT.NONE);
//		longitudeLabel.setText("Y (m)");
//		longitudeLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
//				
//		Label elevationLabel = new Label(container, SWT.NONE);
//		elevationLabel.setText("Z (m)");
//		elevationLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		
		Tuple3dComposite composite = new Tuple3dComposite(parent, SWT.NONE);
		composite.setEnableEditing(true);
		
		return composite;
	}
}