package ca.gc.space.java3d;

import javax.media.j3d.TriangleArray;
import javax.vecmath.Point3d;

public class RegularGrid {

	double[][] grid;

	public RegularGrid(TriangleArray array, int maxX, int maxY) {
		grid = new double[maxY][maxX];

		Point3d p = new Point3d();
		for (int i = 0; i < array.getVertexCount(); i++) {
			array.getCoordinate(i, p);

			updateElevation(p);

		}
	}

	private void updateElevation(Point3d p) {
		int x = (int) Math.round(p.x);
		int y = (int) Math.round(p.y);

		double elevation = p.z;

		if (grid[y][x] < elevation) {
			grid[y][x] = p.z;
		}
	}

	public double getElevation(double x, double y) {
		int i = (int) Math.round(x);
		int j = (int) Math.round(y);

		return grid[j][i];
	}

}
