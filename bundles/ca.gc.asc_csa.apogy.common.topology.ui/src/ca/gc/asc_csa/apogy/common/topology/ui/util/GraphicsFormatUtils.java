package ca.gc.asc_csa.apogy.common.topology.ui.util;
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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.ui.Activator;

public class GraphicsFormatUtils 
{
	/** Comment tag used in OBJ format.*/
	public final static String OBJ_COMMENT_TAG = "#";
	
	/** List of tags that are known to be supported by the OBJ loader.*/
	public final static String[] SUPPORTED_TAGS = new String[] { "v", "vn", "vt", "f", "g", "s", "usemtl", "mtllib", OBJ_COMMENT_TAG};
	
	/**
	 * Process the .obj file at the specified sourceURL and returns a URL to the processed file.
	 * @param sourceURL The URL of the original .obj file.	 
	 * @return A URL to a temporary file that is a copy of the original file stripped of unsupported tags.
	 * @exception If an error occurs during the process.
	 */
	@SuppressWarnings("deprecation")
	public static URL stripUnsupportedOBJTags(URL sourceURL) throws Exception
	{
		// Opens the original .obj file.
		BufferedReader inputFile = new BufferedReader(new InputStreamReader(sourceURL.openStream()));
		
	    StringBuffer stringBuffer = new StringBuffer();
	    
		String inputLine;
		int numberOfLineStripped = 0;
	    while ((inputLine = inputFile.readLine()) != null)
	    {		    					    	
	    	if(isTagSupported(inputLine))
	    	{
	    		stringBuffer.append(inputLine + "\n");
	    	}
	    	else
	    	{
	    		// Appends a comment tag to the unsupported line.
	    		stringBuffer.append("# " + inputLine + "\n");
	    		numberOfLineStripped++;
	    	}
	    }
	    inputFile.close();	    
	    	    
		// Creates a temporary file to write to.					    
	    File temp = File.createTempFile("tmp", ".obj"); 
	    temp.deleteOnExit();
	    
	    // Creates a writer to the file.
	    BufferedWriter out = new BufferedWriter(new FileWriter(temp));
	    out.write(stringBuffer.toString());
	    out.close();
	    
	    Logger.INSTANCE.log(Activator.ID, "Stripped <" + numberOfLineStripped + "> unsupported tags from <" + sourceURL.toString() + "> .", EventSeverity.INFO); 
	    
	    return temp.toURL();	   
	}
	
	/**
	 * Returns wheter or not the specified input line contains supported tags.
	 * @param fileLine One line from the .obj file.
	 * @return True if the tag in the line is supported, false otherwise.
	 */
	private static boolean isTagSupported(String fileLine)
	{
		// Allow empty line.
		if(fileLine.length() == 0)
		{
			return true;
		}
		else
		{		
			boolean supported = false;		
			int i = 0;
			while((i < SUPPORTED_TAGS.length) && (!supported))
			{
				supported = fileLine.startsWith(SUPPORTED_TAGS[i]);
				i++;
			}
			
			return supported;
		}				
	}
}
