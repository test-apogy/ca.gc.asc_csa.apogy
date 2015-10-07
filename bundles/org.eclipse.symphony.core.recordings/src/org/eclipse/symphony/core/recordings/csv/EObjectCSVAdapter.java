package org.eclipse.symphony.core.recordings.csv;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcoreFacade;

public class EObjectCSVAdapter implements CSVAdapter 
{
	
	@Override
	public Class<?> getHandledClass() 
	{	
		return EObject.class;
	}

	@Override
	public int getNumberOfColumns(Class<?> clazz) 
	{		
		EClass eClass = EMFEcoreFacade.INSTANCE.getEClass(clazz.getName());
		if(eClass != null)
		{
			int count = 0;
			EList<EAttribute> attributes = eClass.getEAllAttributes();
			for(EAttribute eAttribute : attributes)
			{				
				if(eAttribute.getEType() instanceof EDataType)
				{
					count++;
				}
			}
			
			return count;
		}
		else
		{
			return 0;
		}
	}

	@Override
	public List<String> getTitleColumns(Class<?> clazz) 
	{
		List<String> list = new ArrayList<String>();	
		
		EClass eClass = EMFEcoreFacade.INSTANCE.getEClass(clazz.getName());
		
		if(eClass != null)
		{
			EList<EAttribute> attributes = eClass.getEAllAttributes();
			for(EAttribute eAttribute : attributes)
			{				
				if(eAttribute.getEType() instanceof EDataType)
				{
					EDataType eDataType = (EDataType) eAttribute.getEType();
					List<String> titles = CSVAdaptersRegistry.getInstance().getTitleColumns(eDataType.getInstanceClass());
					
					// Set the title to the eDataType name if not title was provided.
					if(titles.size() == 0)
					{
						String title = eAttribute.getName();
						String units = EMFEcoreFacade.INSTANCE.getEngineeringUnitsAsString(eAttribute);
						if(units != null) title+= "(" + units + ")";
						
						titles.add(title);
					}
											
					list.addAll(titles);
				}
			}
		}
		
		return list;
	}

	@Override
	public List<String> getValueColumns(Object object) 
	{		
		List<String> list = new ArrayList<String>();
				
		if(object instanceof EObject)
		{
			EObject eObject = (EObject) object;
			EClass eClass = eObject.eClass();
			
			if(eClass != null)
			{
				EList<EAttribute> attributes = eClass.getEAllAttributes();
				for(EAttribute eAttribute : attributes)
				{				
					Object value = eObject.eGet(eAttribute);
					List<String> values = CSVAdaptersRegistry.getInstance().getValueColumns(value);
					
					list.addAll(values);
				}
			}
		}
		
		return list;
	}

}
