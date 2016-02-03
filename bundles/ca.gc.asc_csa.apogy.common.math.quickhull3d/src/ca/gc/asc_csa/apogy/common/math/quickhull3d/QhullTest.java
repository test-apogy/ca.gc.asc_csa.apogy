package ca.gc.asc_csa.apogy.common.math.quickhull3d;
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

class QhullTest
{
	static double[] coords = new double[] 
	{
	};

	static int[][] faces = new int[][]
	{
	};

	public static void main (String[] args)
	 {
 	   QuickHull3D hull = new QuickHull3D ();
	   QuickHull3DTest tester = new QuickHull3DTest();

	   hull = new QuickHull3D();

	   for (int i=0; i<100; i++)
	    { 
	      double[] pnts = tester.randomCubedPoints (100, 1.0, 0.5);

	      hull.setFromQhull (pnts, pnts.length/3, /*triangulated=*/false);

	      pnts = tester.addDegeneracy (
		 QuickHull3DTest.VERTEX_DEGENERACY, pnts, hull);

//	      hull = new QuickHull3D ();
	      hull.setFromQhull (pnts, pnts.length/3, /*triangulated=*/true);

	      if (!hull.check(System.out))
	       { System.out.println ("failed for qhull triangulated");
	       }

//	      hull = new QuickHull3D ();
	      hull.setFromQhull (pnts, pnts.length/3, /*triangulated=*/false);

	      if (!hull.check(System.out))
	       { System.out.println ("failed for qhull regular");
	       }

// 	      hull = new QuickHull3D ();
	      hull.build (pnts, pnts.length/3);
	      hull.triangulate();

 	      if (!hull.check(System.out))
 	       { System.out.println ("failed for QuickHull3D triangulated");
 	       }

// 	      hull = new QuickHull3D ();
	      hull.build (pnts, pnts.length/3);

 	      if (!hull.check(System.out))
 	       { System.out.println ("failed for QuickHull3D regular");
 	       }
	    }
	 }
}
