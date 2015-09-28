package ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.csv;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateCSVAdapter implements CSVAdapter 
{
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss:SSS");
	private DecimalFormat secondsFormat = new DecimalFormat("0.000");
	
	@Override
	public Class<?> getHandledClass() 
	{	
		return Date.class;
	}

	@Override
	public int getNumberOfColumns(Class<?> clazz) 
	{		
		return 2;
	}

	@Override
	public List<String> getTitleColumns(Class<?> clazz) 
	{
		List<String> list = new ArrayList<String>();
		list.add("Time (Date)");
		list.add("Time (seconds)");
		return list;
	}

	@Override
	public List<String> getValueColumns(Object object) 
	{		
		List<String> list = new ArrayList<String>();
		
		if(object instanceof Date)
		{
			Date date = (Date) object;
			String dateStr = dateFormat.format(date);
			list.add(dateStr);
			
			double t = date.getTime() * 0.001;
			String secondsStr = secondsFormat.format(t);
			list.add(secondsStr);				
		}
		else
		{
			list.add(EMPTY_VALUE);
			list.add(EMPTY_VALUE);
		}
		
		return list;
	}

}
