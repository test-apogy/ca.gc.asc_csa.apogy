package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.utils;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

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
