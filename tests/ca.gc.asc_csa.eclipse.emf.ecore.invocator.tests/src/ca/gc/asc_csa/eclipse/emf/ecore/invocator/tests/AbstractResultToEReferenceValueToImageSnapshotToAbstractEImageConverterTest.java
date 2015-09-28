package ca.gc.asc_csa.eclipse.emf.ecore.invocator.tests;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResult;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ReferenceResultValue;
import ca.gc.asc_csa.eclipse.images.core.AbstractEImage;
import ca.gc.asc_csa.eclipse.images.core.EImage;
import ca.gc.asc_csa.eclipse.images.core.ImagesCoreFactory;
import ca.gc.space.mrt.sensors.imaging.ImageSnapshot;
import ca.gc.space.mrt.sensors.imaging.MRTSensorsImagingFactory;

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
		Assert.assertNotNull(ca.gc.asc_csa.eclipse.converters.Activator.convert(operationCallResult, ReferenceResultValue.class));
	}
		
	@Test
	public void testReferenceValueToImageSnapshot() {		
		Assert.assertNotNull(ca.gc.asc_csa.eclipse.converters.Activator.convert(referenceResultValue, ImageSnapshot.class));
	}
	
	@Test
	public void testImageSnapshotToAbstractEImage() {		
		Assert.assertNotNull(ca.gc.asc_csa.eclipse.converters.Activator.convert(imageSnapshot, AbstractEImage.class));
	}

	@Test
	public void testAbstractResultToImageSnapshot() {		
		Assert.assertNotNull(ca.gc.asc_csa.eclipse.converters.Activator.convert(operationCallResult, ImageSnapshot.class));
	}

	@Test
	public void testReferenceValueToAbstractEImage() {		
		Assert.assertNotNull(ca.gc.asc_csa.eclipse.converters.Activator.convert(referenceResultValue, AbstractEImage.class));
	}
	
	@Test
	public void testAbstractResultToAbstractEImage() {		
		Assert.assertNotNull(ca.gc.asc_csa.eclipse.converters.Activator.convert(operationCallResult, AbstractEImage.class));
	}	
}