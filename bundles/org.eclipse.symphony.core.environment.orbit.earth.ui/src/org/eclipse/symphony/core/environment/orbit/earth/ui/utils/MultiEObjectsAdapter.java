package org.eclipse.symphony.core.environment.orbit.earth.ui.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;

public class MultiEObjectsAdapter extends AdapterImpl
{
	private List<EObject> eObjects = new ArrayList<EObject>();
		
	@Override
	public void setTarget(Notifier newTarget) 
	{
		super.setTarget(newTarget);
		
		if(newTarget instanceof EObject)
		{
			EObject eObject = (EObject) newTarget;
			if(!eObjects.contains(newTarget)) eObjects.add(eObject);
		}
	}
	
	@Override
	public void unsetTarget(Notifier oldTarget) 
	{		
		super.unsetTarget(oldTarget);
		
		if(oldTarget instanceof EObject)
		{
			EObject eObject = (EObject) oldTarget;
			eObjects.remove(eObject);
		}
		
	}
	
	public void unregisterFromAllObjects()
	{
		List<EObject> tmpList = new ArrayList<EObject>();
		tmpList.addAll(eObjects);
		for(EObject eObject : tmpList)
		{
			eObject.eAdapters().remove(this);
		}
	}
	
	public void registerToEObject(EObject eObject)
	{
		if(!eObjects.contains(eObject))
		{
			eObject.eAdapters().add(this);
			eObjects.add(eObject);
		}
	}
	
	public void unregisterFromEObject(EObject eObject)
	{
		eObject.eAdapters().remove(this);
		eObjects.remove(eObject);
	}
	
	public void dispose()
	{
		unregisterFromAllObjects();
	}
}
