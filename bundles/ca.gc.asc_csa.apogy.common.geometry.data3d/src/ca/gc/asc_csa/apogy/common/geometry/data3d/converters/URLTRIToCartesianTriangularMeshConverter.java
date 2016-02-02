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

import ca.gc.asc_csa.apogy.common.geometry.data3d.Activator;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

public class URLTRIToCartesianTriangularMeshConverter extends URLToCartesianTriangularMeshConverter 
{
	private static String[] fileExtensions = new String[]{".tri"};
	
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
			URL urlTri = (URL) input;		
			URL urlxyz = createXYZURL(urlTri);
						
			File tempFileTri = copyURLContent(urlTri);
			File tempFileXYZ = copyURLContent(urlxyz);
			
			// Loads mesh
			mesh = Data3DIO.INSTANCE.loadTriangularMeshFromTriXYZ(tempFileTri.getAbsolutePath(), tempFileXYZ.getAbsolutePath());
			
			if(mesh != null)
			{
				Logger.INSTANCE.log(Activator.ID, this, "Sucessfully loaded CartesianTriangularMesh from URL<" + urlTri + ">", EventSeverity.OK);
			}
			else
			{
				Logger.INSTANCE.log(Activator.ID, this, "Could not load CartesianTriangularMesh from URL<" + urlTri + ">!", EventSeverity.ERROR);
			}							
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
		return mesh;
	}
	
	private URL createXYZURL(URL urlTri) throws Exception
	{
		int index = urlTri.toString().lastIndexOf(".");
		
		String newURLString = urlTri.toString().substring(0, index + 1) + "xyz";

		return new URL(newURLString);
	}
}
