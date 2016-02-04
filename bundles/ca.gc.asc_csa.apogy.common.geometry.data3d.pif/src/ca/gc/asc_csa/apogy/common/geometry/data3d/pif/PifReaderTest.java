package ca.gc.asc_csa.apogy.common.geometry.data3d.pif;
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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.vecmath.Point3f;


/**
 * @author SGemme
 * 
 *         TODO To change the template for this generated type comment go to
 *         Window - Preferences - Java - Code Style - Code Templates
 */
public class PifReaderTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws IOException {

		String fileName = "/home/seb/src/3dreg/scans/0-45-45-0-0--1500/MovingObject_1.pf"; // "H:\\data\\lcs\\quicksat\\db\\quicksat-alone_scan1-256x256.pf";

		PifReader reader = new PifReader(fileName);

		// We save is as xyz file.
		List points = reader.getPoints();

		Iterator it = points.iterator();

		String outFile = "/home/seb/tmp/out.xyz";

		FileOutputStream os = new FileOutputStream(new File(outFile));

		PrintWriter writer = new PrintWriter(os);

		while (it.hasNext()) {
			Point3f p = (Point3f) it.next();
			writer.println(p.x + " " + p.y + " " + p.z);
		}

		writer.flush();

		os.close();

		System.out.println("Done");

	}

}
