package ca.gc.asc_csa.eclipse.images.ui.expressions;

import java.util.List;

import org.eclipse.core.expressions.PropertyTester;

import ca.gc.asc_csa.eclipse.converters.Activator;
import ca.gc.asc_csa.eclipse.images.core.AbstractEImage;

public class ImagePropertyTester extends PropertyTester {

	public static final String PROPERTY_NAMESPACE = "ca.gc.asc_csa.eclipse.images.ui.expressions.ImagePropertyTester";
	public static final String PROPERTY_CAN_CONVERT_TO_ABSTRACT_EIMAGE = "canConvertToAbstractEImage";
	
	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		
		boolean result = false;		
		if (PROPERTY_CAN_CONVERT_TO_ABSTRACT_EIMAGE.equals(property)){
			if (receiver instanceof List<?>){
				List<?> list = (List<?>) receiver;
				if (!list.isEmpty()){
					result = Activator.convert(list.get(0), AbstractEImage.class) != null;		
				}
			}
		}	
		return result;
	}
}