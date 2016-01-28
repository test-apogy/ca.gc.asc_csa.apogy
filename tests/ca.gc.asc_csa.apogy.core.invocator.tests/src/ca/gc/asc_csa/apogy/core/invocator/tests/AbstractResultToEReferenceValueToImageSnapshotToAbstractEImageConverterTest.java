package org.eclipse.symphony.core.invocator.tests;

import java.io.IOException;

import org.eclipse.symphony.addons.sensors.imaging.ImageSnapshot;
import org.eclipse.symphony.addons.sensors.imaging.Symphony__AddonsSensorsImagingFactory;
import org.eclipse.symphony.common.converters.Symphony__CommonConvertersFacade;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.EImage;
import org.eclipse.symphony.common.images.Symphony__CommonImagesFactory;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFactory;
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
		image = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
		
		// Create Image Snapshot.
		imageSnapshot = Symphony__AddonsSensorsImagingFactory.eINSTANCE.createImageSnapshot();
		imageSnapshot.setImage(image);

		// Create ReferenceResultValue.
		referenceResultValue = Symphony__CoreInvocatorFactory.eINSTANCE.createReferenceResultValue();
		referenceResultValue.setValue(imageSnapshot);

		// Create OperationCallResult.
		operationCallResult = Symphony__CoreInvocatorFactory.eINSTANCE.createOperationCallResult();
		operationCallResult.setResultValue(referenceResultValue);
	}
	
	@Test
	public void testAbstractResultToEReferenceValue()
	{		
		Assert.assertNotNull(Symphony__CommonConvertersFacade.INSTANCE.convert(operationCallResult, ReferenceResultValue.class));
	}
		
	@Test
	public void testReferenceValueToImageSnapshot()
	{		
		Assert.assertNotNull(Symphony__CommonConvertersFacade.INSTANCE.convert(referenceResultValue, ImageSnapshot.class));
	}
	
	@Test
	public void testImageSnapshotToAbstractEImage()
	{		
		Assert.assertNotNull(Symphony__CommonConvertersFacade.INSTANCE.convert(imageSnapshot, AbstractEImage.class));
	}

	@Test
	public void testAbstractResultToImageSnapshot()
	{		
		Assert.assertNotNull(Symphony__CommonConvertersFacade.INSTANCE.convert(operationCallResult, ImageSnapshot.class));
	}

	@Test
	public void testReferenceValueToAbstractEImage()
	{		
		Assert.assertNotNull(Symphony__CommonConvertersFacade.INSTANCE.convert(referenceResultValue, AbstractEImage.class));
	}
	
	@Test
	public void testAbstractResultToAbstractEImage()
	{		
		Assert.assertNotNull(Symphony__CommonConvertersFacade.INSTANCE.convert(operationCallResult, AbstractEImage.class));
	}	
}