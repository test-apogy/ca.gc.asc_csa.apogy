package ca.gc.asc_csa.eclipse.emf.ecore.invocator.tests;

import java.io.IOException;

import org.eclipse.symphony.addons.sensors.imaging.ImageSnapshot;
import org.eclipse.symphony.addons.sensors.imaging.MRTSensorsImagingFactory;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.EImage;
import org.eclipse.symphony.common.images.ImagesCoreFactory;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFactory;
import org.eclipse.symphony.core.invocator.OperationCallResult;
import org.eclipse.symphony.core.invocator.ReferenceResultValue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AbstractResultToEReferenceValueToImageSnapshotToAbstractEImageConverterTest {
	
	private EImage image;
	private ReferenceResultValue referenceResultValue;
	private OperationCallResult operationCallResult;
	private ImageSnapshot imageSnapshot;
	
	@Before
	public void setup() throws IOException{
	    
		// Create an EImage and use the extracted BufferedImage (if the read was successful)
		image = ImagesCoreFactory.eINSTANCE.createEImage();
		
		// Create Image Snapshot.
		imageSnapshot = MRTSensorsImagingFactory.eINSTANCE.createImageSnapshot();
		imageSnapshot.setImage(image);

		// Create ReferenceResultValue.
		referenceResultValue = EMFEcoreInvocatorFactory.eINSTANCE.createReferenceResultValue();
		referenceResultValue.setValue(imageSnapshot);

		// Create OperationCallResult.
		operationCallResult = EMFEcoreInvocatorFactory.eINSTANCE.createOperationCallResult();
		operationCallResult.setResultValue(referenceResultValue);
	}
	
	@Test
	public void testAbstractResultToEReferenceValue() {		
		Assert.assertNotNull(org.eclipse.symphony.common.converters.Activator.convert(operationCallResult, ReferenceResultValue.class));
	}
		
	@Test
	public void testReferenceValueToImageSnapshot() {		
		Assert.assertNotNull(org.eclipse.symphony.common.converters.Activator.convert(referenceResultValue, ImageSnapshot.class));
	}
	
	@Test
	public void testImageSnapshotToAbstractEImage() {		
		Assert.assertNotNull(org.eclipse.symphony.common.converters.Activator.convert(imageSnapshot, AbstractEImage.class));
	}

	@Test
	public void testAbstractResultToImageSnapshot() {		
		Assert.assertNotNull(org.eclipse.symphony.common.converters.Activator.convert(operationCallResult, ImageSnapshot.class));
	}

	@Test
	public void testReferenceValueToAbstractEImage() {		
		Assert.assertNotNull(org.eclipse.symphony.common.converters.Activator.convert(referenceResultValue, AbstractEImage.class));
	}
	
	@Test
	public void testAbstractResultToAbstractEImage() {		
		Assert.assertNotNull(org.eclipse.symphony.common.converters.Activator.convert(operationCallResult, AbstractEImage.class));
	}	
}