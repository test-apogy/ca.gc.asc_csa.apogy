package org.eclipse.symphony.common.geometry.data3d.pif;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.vecmath.Point3f;

/*
 * Created on Jul 12, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author SGemme
 * 
 *         TODO To change the template for this generated type comment go to
 *         Window - Preferences - Java - Code Style - Code Templates
 */
@SuppressWarnings("restriction")
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
