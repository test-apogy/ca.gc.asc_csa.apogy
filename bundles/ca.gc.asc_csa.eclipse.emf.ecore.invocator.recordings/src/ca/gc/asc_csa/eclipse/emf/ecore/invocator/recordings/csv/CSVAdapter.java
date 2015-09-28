package ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.csv;

import java.util.List;

public interface CSVAdapter 
{
	public static final String EMPTY_VALUE = "";
	
	public Class<?> getHandledClass();
	
	public int getNumberOfColumns(Class<?> clazz);
	
	public List<String> getTitleColumns(Class<?> clazz);
	
	public List<String> getValueColumns(Object object);
}
