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
import java.io.FileInputStream;
import java.io.InputStream;

import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO;

public class TopoFileToCartesianTriangularMeshConverter implements IConverter {

	public Class<?> getOutputType() 
	{		
		return CartesianTriangularMesh.class;
	}

	public Class<?> getInputType() 
	{		
		return File.class;
	}

	public boolean canConvert(Object input) 
	{	
		if(input instanceof File)
		{
			File file = (File) input;	
			return (getFileExtension(file.getName()).endsWith(".topo") || getFileExtension(file.getName()).endsWith(".xml"));			
		}
		else
		{
			return false;
		}
	}

	public Object convert(Object input) throws Exception 
	{
		File file = (File) input;		
		InputStream inputStream = new FileInputStream(file);
		return Data3DIO.INSTANCE.loadTriangularMesh(inputStream);
	}

	/**
	 * Returns the file extebsion of a file name.
	 * @param url The url as a string.
	 * @return The file extension
	 */
	protected String getFileExtension(String url) 
	{
		String fileExtension = new String();
		String fileName = url;
		int index = fileName.lastIndexOf(".");
		if (index >= 0) {
			fileExtension = fileName.substring(index);
			fileExtension = fileExtension.toLowerCase();
		}

		
		return fileExtension;
	}
}
