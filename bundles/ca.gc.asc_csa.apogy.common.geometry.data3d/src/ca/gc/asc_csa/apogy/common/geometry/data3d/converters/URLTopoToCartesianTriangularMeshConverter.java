package ca.gc.asc_csa.apogy.common.geometry.data3d.converters;
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

import java.io.File;
import java.net.URL;

import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Activator;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

public class URLTopoToCartesianTriangularMeshConverter extends URLToCartesianTriangularMeshConverter 
{
	private static String[] fileExtensions = new String[]{".topo", "xml"};
	
	public Class<?> getOutputType() 
	{		
		return CartesianTriangularMesh.class;
	}

	public Class<?> getInputType() 
	{
		return URL.class;
	}

	@Override
	public String[] getSupportedFileExtension() 
	{	
		return fileExtensions;
	}

	public Object convert(Object input) throws Exception 
	{				
		CartesianTriangularMesh mesh = null;
		
		try
		{		
			URL url = (URL) input;		
			
			File tempFile = copyURLContent(url);
			
			if(tempFile != null)
			{
				 mesh = (CartesianTriangularMesh) ApogyCommonConvertersFacade.INSTANCE.convert(tempFile, CartesianTriangularMesh.class);				 				 
			}
			
			if(mesh != null)
			{
				Logger.INSTANCE.log(Activator.ID, this, "Sucessfully loaded CartesianTriangularMesh from URL<" + url + ">", EventSeverity.OK);
			}
			else
			{
				Logger.INSTANCE.log(Activator.ID, this, "Could not load CartesianTriangularMesh from URL<" + url + ">!", EventSeverity.ERROR);
			}							
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
		return mesh;
	}
}
