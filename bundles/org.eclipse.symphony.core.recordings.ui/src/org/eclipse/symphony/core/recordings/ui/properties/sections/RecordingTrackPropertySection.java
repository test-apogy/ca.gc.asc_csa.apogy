package org.eclipse.symphony.core.recordings.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.recordings.RecordingTrack;
import org.eclipse.symphony.core.recordings.ui.composites.RecordingTrackComposite;

import ca.gc.asc_csa.eclipse.ui.properties.sections.AbstractExtendedPropertySection;

public class RecordingTrackPropertySection extends AbstractExtendedPropertySection {

	RecordingTrackComposite composite;
	
	@Override
	public boolean shouldUseExtraSpace() {	
		return true;
	}

	@Override
	protected void render(EObject eObject) {
		composite.setRecordingTrack( (RecordingTrack) eObject);		
	}

	@Override
	protected Composite createComposite(Composite parent) {
		composite = new RecordingTrackComposite(parent, SWT.NONE);
		return composite;
	}
}