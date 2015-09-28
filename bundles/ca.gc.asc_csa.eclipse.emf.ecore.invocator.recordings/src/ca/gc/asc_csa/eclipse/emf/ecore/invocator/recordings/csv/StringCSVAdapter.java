package ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.csv;

import java.util.ArrayList;
import java.util.List;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsFacade;

public class StringCSVAdapter implements CSVAdapter 
{	
	@Override
	public Class<?> getHandledClass() 
	{	
		return String.class;
	}

	@Override
	public int getNumberOfColumns(Class<?> clazz) 
	{		
		return 1;
	}

	@Override
	public List<String> getTitleColumns(Class<?> clazz) 
	{
		List<String> list = new ArrayList<String>();
		list.add(EMPTY_VALUE);
		return list;
	}

	@Override
	public List<String> getValueColumns(Object object) 
	{		
		List<String> list = new ArrayList<String>();
		
		if(object instanceof String)
		{
			String originalString = (String) object;
			String cleanString = originalString.replaceAll(EMFEcoreInvocatorRecordingsFacade.SEPARATOR, ";");
			cleanString = cleanString.replaceAll(EMFEcoreInvocatorRecordingsFacade.NEW_LINE, " ");
			list.add(cleanString);
		}
		else
		{
			list.add(EMPTY_VALUE);			
		}
		
		return list;
	}

}
