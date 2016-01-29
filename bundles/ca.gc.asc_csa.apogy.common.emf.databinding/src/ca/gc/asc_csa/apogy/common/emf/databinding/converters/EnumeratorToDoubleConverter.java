package ca.gc.asc_csa.apogy.common.emf.databinding.converters;

import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.emf.common.util.Enumerator;

public class EnumeratorToDoubleConverter extends Converter 
{	
	public EnumeratorToDoubleConverter() 
	{
		super(Enumerator.class, Double.class);
	}
	
	@Override
	public Object convert(Object fromObject) 
	{
		try
		{
			Enumerator enumerator = (Enumerator) fromObject;			
			return new Double(enumerator.getValue());
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			return 0.0;
		}
	}
}
