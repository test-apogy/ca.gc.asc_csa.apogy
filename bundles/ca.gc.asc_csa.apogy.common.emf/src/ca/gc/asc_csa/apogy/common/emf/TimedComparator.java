package ca.gc.asc_csa.apogy.common.emf;
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

import java.util.Comparator;

public class TimedComparator implements Comparator<Timed> 
{
	public TimedComparator() {	
	}
	
	@Override
	public int compare(Timed arg0, Timed arg1) 
	{
		long t1 = arg0.getTime().getTime();
		long t2 = arg1.getTime().getTime();
		
		if(t1 < t2)
		{
			return -1;
		}
		else if(t1 > t2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
