package ca.gc.asc_csa.apogy.common.databinding.converters;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.databinding.conversion.Converter;

public class DateToStringConverter extends Converter  {
	private SimpleDateFormat sdf;
	
	public DateToStringConverter() {
		super(Date.class,String.class);
		sdf = null;
	}
	
	public DateToStringConverter(SimpleDateFormat sdf) {
		super(Date.class,String.class);
		this.sdf = sdf;
	}

	public Object convert(Object fromObject) {
		Date date = (Date) fromObject;
		if(sdf == null)
			return date.toString();
		else
			return sdf.format(date);
	}
	

}
