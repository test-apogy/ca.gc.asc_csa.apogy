package ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.csv;

import java.util.ArrayList;
import java.util.List;

public class NumberCSVAdapter implements CSVAdapter 
{
	@Override
	public Class<?> getHandledClass() 
	{	
		return Number.class;
	}

	@Override
	public int getNumberOfColumns(Class<?> clazz) 
	{		
		return 1;
	}
	
	public List<String> getTitleColumns(Class<?> clazz)
	{
		List<String> list = new ArrayList<String>();
		list.add(EMPTY_VALUE);
		return list;
	}
	
	public List<String> getValueColumns(Object object)
	{
		List<String> list = new ArrayList<String>();
		if(object instanceof Number)
		{
			Number number = (Number) object;			
			list.add( new String(Double.toString(number.doubleValue())));
		}
		else
		{
			list.add(EMPTY_VALUE);
		}
		return list;
	}

}
