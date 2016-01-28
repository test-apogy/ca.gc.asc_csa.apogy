package ca.gc.asc_csa.apogy.core.invocator.tests;

import java.io.IOException;

import ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ApogyAddonsSensorsImagingFactory;
import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImage;
import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResult;
import ca.gc.asc_csa.apogy.core.invocator.ReferenceResultValue;
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
		image = ApogyCommonImagesFactory.eINSTANCE.createEImage();
		
		// Create Image Snapshot.
		imageSnapshot = ApogyAddonsSensorsImagingFactory.eINSTANCE.createImageSnapshot();
		imageSnapshot.setImage(image);

		// Create ReferenceResultValue.
		referenceResultValue = ApogyCoreInvocatorFactory.eINSTANCE.createReferenceResultValue();
		referenceResultValue.setValue(imageSnapshot);

		// Create OperationCallResult.
		operationCallResult = ApogyCoreInvocatorFactory.eINSTANCE.createOperationCallResult();
		operationCallResult.setResultValue(referenceResultValue);
	}
	
	@Test
	public void testAbstractResultToEReferenceValue()
	{		
		Assert.assertNotNull(ApogyCommonConvertersFacade.INSTANCE.convert(operationCallResult, ReferenceResultValue.class));
	}
		
	@Test
	public void testReferenceValueToImageSnapshot()
	{		
		Assert.assertNotNull(ApogyCommonConvertersFacade.INSTANCE.convert(referenceResultValue, ImageSnapshot.class));
	}
	
	@Test
	public void testImageSnapshotToAbstractEImage()
	{		
		Assert.assertNotNull(ApogyCommonConvertersFacade.INSTANCE.convert(imageSnapshot, AbstractEImage.class));
	}

	@Test
	public void testAbstractResultToImageSnapshot()
	{		
		Assert.assertNotNull(ApogyCommonConvertersFacade.INSTANCE.convert(operationCallResult, ImageSnapshot.class));
	}

	@Test
	public void testReferenceValueToAbstractEImage()
	{		
		Assert.assertNotNull(ApogyCommonConvertersFacade.INSTANCE.convert(referenceResultValue, AbstractEImage.class));
	}
	
	@Test
	public void testAbstractResultToAbstractEImage()
	{		
		Assert.assertNotNull(ApogyCommonConvertersFacade.INSTANCE.convert(operationCallResult, AbstractEImage.class));
	}	
}