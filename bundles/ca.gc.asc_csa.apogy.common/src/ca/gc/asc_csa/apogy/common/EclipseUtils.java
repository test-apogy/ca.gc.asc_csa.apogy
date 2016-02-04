package ca.gc.asc_csa.apogy.common;
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

import org.eclipse.core.runtime.FileLocator;
import org.osgi.framework.Bundle;

public class EclipseUtils 
{
	/**
	 * Return a File pointing at the specified bundle relative path.
	 * @param bundle The Bundle
	 * @param relativePath The relative path.
	 * @return The file 
	 */
	public static File getFileHandle(Bundle bundle, String relativePath) throws Throwable
	{
		URL fileURL = bundle.getEntry(relativePath);
		File file = new File(FileLocator.resolve(fileURL).toURI());		
		return file;
	}
	
	/**
	 * Resolves and return a URL associated with a urlString.
	 * @param bundle The calling bundle.
	 * @param urlString The URl String.
	 * @return The URL.
	 * @throws Exception if resolution fails.
	 */
	public static URL resolveURL(Bundle bundle, String urlString) throws Exception
	{
		URL url = null;
		
		// If the file protocol is used.
		if((urlString.startsWith("file:")) || (urlString.startsWith("http:")))
		{
			url = new URL(urlString);
		}
		else if(urlString.startsWith("platform"))
		{
			url = org.eclipse.core.runtime.FileLocator.toFileURL(new URL(urlString));
		}
		
		return url;
	}
		
}
