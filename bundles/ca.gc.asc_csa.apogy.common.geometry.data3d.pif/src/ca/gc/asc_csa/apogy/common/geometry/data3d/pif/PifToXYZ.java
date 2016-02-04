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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.vecmath.Point3f;

public class PifToXYZ {
	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println(Messages.PifToXYZ_0);
			System.exit(1);
		}

		List<Point3f> points = null;

		try {
			PifReader reader = new PifReader(args[0]);

			// We save is as xyz file.
			points = reader.getPoints();

		} catch (IOException e) {
			System.out.println(Messages.PifToXYZ_1 + args[0] + ": " //$NON-NLS-2$
					+ e.getMessage());
			System.exit(1);
		}

		FileOutputStream os = null;

		try {
			os = new FileOutputStream(new File(args[1]));

			PrintWriter writer = new PrintWriter(os);

			for (Point3f p : points) {
				writer.println(p.x + " " + p.y + " " + p.z); //$NON-NLS-1$ //$NON-NLS-2$
			}

			writer.flush();

			os.close();

			System.out.println(Messages.PifToXYZ_5 + args[0]
					+ Messages.PifToXYZ_6 + args[1]);
			System.exit(0);

		} catch (FileNotFoundException e) {
			System.out.println(Messages.PifToXYZ_7 + args[1] + ": " //$NON-NLS-2$
					+ e.getMessage());
			System.exit(1);
		} catch (IOException e) {
			System.out.println(Messages.PifToXYZ_9 + e.getMessage());
			System.exit(1);
		}

	}
}
