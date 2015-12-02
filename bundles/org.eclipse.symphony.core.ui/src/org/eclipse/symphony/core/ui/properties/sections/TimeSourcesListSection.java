package org.eclipse.symphony.core.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.converters.Symphony__CommonConvertersFacade;
import org.eclipse.symphony.common.ui.properties.sections.AbstractExtendedPropertySection;
import org.eclipse.symphony.core.TimeSourcesList;
import org.eclipse.symphony.core.ui.composites.TimeSourcesListComposite2;

public class TimeSourcesListSection extends AbstractExtendedPropertySection implements IFilter {

	@Override
	protected void render(EObject eObject) {
		TimeSourcesList timeSourcesList = (TimeSourcesList) Symphony__CommonConvertersFacade.INSTANCE.convert(eObject,
				TimeSourcesList.class);
		if (timeSourcesList != null) {
			((TimeSourcesListComposite2) getComposite()).setTimeSourcesList(timeSourcesList);
		}
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected Composite createComposite(Composite parent) {
		return new TimeSourcesListComposite2(parent, SWT.NONE);
	}

	@Override
	public boolean select(Object toTest) {
		return (Symphony__CommonConvertersFacade.INSTANCE.convert(toTest, TimeSourcesList.class) != null);
	}
}