package ca.gc.asc_csa.apogy.core.environment.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.math.ui.composites.Tuple3dComposite;
import ca.gc.asc_csa.apogy.common.ui.properties.sections.AbstractExtendedPropertySection;

public class PositionCoordinatesSection extends AbstractExtendedPropertySection implements IFilter
{
	@Override
	public boolean select(Object toTest)
	{
		return (ApogyCommonConvertersFacade.INSTANCE.convert(toTest, Tuple3d.class) != null);
	}

	@Override
	protected void render(EObject eObject) 
	{
		Tuple3d tuple3d = (Tuple3d) ApogyCommonConvertersFacade.INSTANCE.convert(eObject, Tuple3d.class);
		
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