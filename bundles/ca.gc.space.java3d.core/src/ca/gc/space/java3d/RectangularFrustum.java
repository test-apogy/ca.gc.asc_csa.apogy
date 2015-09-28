package ca.gc.space.java3d;

import java.util.ArrayList;
import java.util.List;

import javax.media.j3d.Appearance;
import javax.media.j3d.GeometryArray;
import javax.media.j3d.PolygonAttributes;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TriangleArray;
import javax.vecmath.Point3d;

import com.sun.j3d.utils.geometry.GeometryInfo;
import com.sun.j3d.utils.geometry.NormalGenerator;

/**
 * A circular sector on the XY plane, centered at the origin.
 * 
 * @author pallard
 * 
 */
public class RectangularFrustum {
	public static int DEFAULT_INCREMENT_NUMBER = 36;
	public static double DEFAULT_APEX_ANGLE = Math.toRadians(45.0);

	private boolean autoUpdate = true;
	private int numberHorizontalIncrement = DEFAULT_INCREMENT_NUMBER;
	private int numberVerticalIncrement = DEFAULT_INCREMENT_NUMBER;
	private double minRadius;
	private double maxRadius;
	private double minHorizontalAngle;
	private double maxHorizontalAngle;
	private double minVerticalAngle;
	private double maxVerticalAngle;
	private Shape3D shape;
	private GeometryArray geometryArray;

	/**
	 * Creates a rectangular frustrum with it horizontal axis along x, vertical
	 * axis along y and view axis along z.
	 * 
	 * @param minRadius
	 *            Minimum radius of the frustrum.
	 * @param maxRadius
	 *            Maximum radius of the frustrum.
	 * @param minHorizontalAngle
	 *            The minimum horizontal angle (about x).
	 * @param maxHorizontalAngle
	 *            The maximum horizontal angle (about x).
	 * @param minVerticalAngle
	 *            The minimum vertical angle (about y).
	 * @param maxVerticalAngle
	 *            The maximum vertical angle (about y).
	 * @param numberHorizontalIncrement
	 *            The number of increment about x.
	 * @param numberVerticalIncrement
	 *            The number of increment about y.
	 * @param autoUpdate
	 *            True makes the geometry updates automatically when any of the
	 *            frustrum parameters are changed, false does not.
	 */
	public RectangularFrustum(double minRadius, double maxRadius,
			double minHorizontalAngle, double maxHorizontalAngle,
			double minVerticalAngle, double maxVerticalAngle,
			int numberHorizontalIncrement, int numberVerticalIncrement,
			boolean autoUpdate) {
		this.minRadius = minRadius;
		this.maxRadius = maxRadius;
		this.minHorizontalAngle = minHorizontalAngle;
		this.maxHorizontalAngle = maxHorizontalAngle;
		this.minVerticalAngle = minVerticalAngle;
		this.maxVerticalAngle = maxVerticalAngle;

		if (numberHorizontalIncrement > 1) {
			this.numberHorizontalIncrement = numberHorizontalIncrement;
		} else {
			this.numberHorizontalIncrement = 2;
		}

		if (numberVerticalIncrement > 1) {
			this.numberVerticalIncrement = numberVerticalIncrement;
		} else {
			this.numberVerticalIncrement = 2;
		}

		this.numberVerticalIncrement = numberVerticalIncrement;
		this.autoUpdate = autoUpdate;

		try {
			updateGeometry();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Return the Shape3D that contains the frustrum geometry.
	 * 
	 * @return The Shape3D.
	 */
	public Shape3D getShape3D() {
		if (shape == null) {
			shape = new Shape3D();
			shape.setCapability(Shape3D.ALLOW_GEOMETRY_READ);
			shape.setCapability(Shape3D.ALLOW_GEOMETRY_WRITE);
			shape.setCapability(Shape3D.ALLOW_APPEARANCE_WRITE);

			Appearance appearance = new Appearance();
			PolygonAttributes pa = new PolygonAttributes();
			pa.setCapability(PolygonAttributes.ALLOW_MODE_WRITE);
			pa.setCapability(PolygonAttributes.ALLOW_MODE_READ);
			pa.setCullFace(PolygonAttributes.CULL_NONE);
			pa.setPolygonMode(PolygonAttributes.POLYGON_FILL);
			pa.setBackFaceNormalFlip(true);
			appearance.setPolygonAttributes(pa);
			shape.setAppearance(appearance);
		}
		return shape;
	}

	public double getMinHorizontalAngle() {
		return minHorizontalAngle;
	}

	public void setMinHorizontalAngle(double minHorizontalAngle) {
		this.minHorizontalAngle = minHorizontalAngle;
		if (autoUpdate)
			updateGeometry();
	}

	public double getMaxHorizontalAngle() {
		return maxHorizontalAngle;
	}

	public void setMaxHorizontalAngle(double maxHorizontalAngle) {
		this.maxHorizontalAngle = maxHorizontalAngle;
		if (autoUpdate)
			updateGeometry();
	}

	public double getMinVerticalAngle() {
		return minVerticalAngle;
	}

	public void setMinVerticalAngle(double minVerticalAngle) {
		if (minVerticalAngle >= -Math.PI / 2) {
			this.minVerticalAngle = minVerticalAngle;
		} else {
			this.minVerticalAngle = -Math.PI / 2;
		}
		if (autoUpdate)
			updateGeometry();
	}

	public double getMaxVerticalAngle() {
		return maxVerticalAngle;
	}

	public void setMaxVerticalAngle(double maxVerticalAngle) {
		if (maxVerticalAngle <= Math.PI / 2) {
			this.maxVerticalAngle = maxVerticalAngle;
		} else {
			this.maxVerticalAngle = Math.PI / 2;
		}
		if (autoUpdate)
			updateGeometry();
	}

	public double getMinRadius() {
		return minRadius;
	}

	public void setMinRadius(double minRadius) {
		if (minRadius >= 0) {
			this.minRadius = minRadius;
		} else {
			minRadius = 0;
		}
		if (autoUpdate)
			updateGeometry();
	}

	public double getMaxRadius() {
		return maxRadius;
	}

	public void setMaxRadius(double maxRadius) {
		if (maxRadius >= 0) {
			this.maxRadius = maxRadius;
		} else {
			maxRadius = 0;
		}
		if (autoUpdate)
			updateGeometry();
	}

	public boolean isAutoUpdate() {
		return autoUpdate;
	}

	public void setAutoUpdate(boolean autoUpdate) {
		this.autoUpdate = autoUpdate;
	}

	public int getNumberHorizontalIncrement() {
		return numberHorizontalIncrement;
	}

	public void setNumberHorizontalIncrement(int numberHorizontalIncrement) {
		if (numberHorizontalIncrement > 1) {
			this.numberHorizontalIncrement = numberHorizontalIncrement;
			if (autoUpdate)
				updateGeometry();
		}
	}

	public int getNumberVerticalIncrement() {
		return numberVerticalIncrement;
	}

	public void setNumberVerticalIncrement(int numberVerticalIncrement) {
		if (numberVerticalIncrement > 1) {
			this.numberVerticalIncrement = numberVerticalIncrement;
			if (autoUpdate)
				updateGeometry();
		}
	}

	/**
	 * Updates the geometry of the frustrum. Called automatically if
	 * isAutoUpdate is enabled.
	 */
	public void updateGeometry() {
		if ((this.numberHorizontalIncrement > 1)
				&& (this.numberVerticalIncrement > 1)) {
			List<Point3d> vertices = generateProfile();
			List<List<Point3d>> profiles = sweepProfile(vertices);
			GeometryArray temp = mesh(profiles);
			getShape3D().removeGeometry(geometryArray);
			getShape3D().addGeometry(temp);
			geometryArray = temp;
		}
	}

	private GeometryArray mesh(List<List<Point3d>> profiles) {
		GeometryArray geometry = null;

		if ((profiles.size() >= 2) && (profiles.get(0).size() > 1)) {
			List<Point3d> vertices = new ArrayList<Point3d>();

			// Meshes the back, top, front, and bottom.
			for (int i = 0; i < profiles.size() - 1; i++) 
			{				
				List<Point3d> profileA = profiles.get(i);
				List<Point3d> profileB = profiles.get(i + 1);

				for (int j = 0; j < profileA.size(); j++) {
					Point3d a0 = new Point3d(profileA.get(j));
					Point3d b0 = new Point3d(profileB.get(j));

					Point3d a1 = null;
					Point3d b1 = null;
					if ((j + 1) < profileA.size()) {
						a1 = new Point3d(profileA.get(j + 1));
						b1 = new Point3d(profileB.get(j + 1));
					} else {
						a1 = new Point3d(profileA.get(0));
						b1 = new Point3d(profileB.get(0));
					}

					// First triangle
					vertices.add(a0);
					vertices.add(b0);
					vertices.add(b1);

					// Second triangle
					vertices.add(a0);
					vertices.add(b1);
					vertices.add(a1);
				}

				// Meshes the sides if needed.
				if ((maxHorizontalAngle - minHorizontalAngle) < (Math.PI * 2)) {
					meshProfile(vertices, profiles, 0);
					meshProfile(vertices, profiles, profiles.size() - 1);
				}

				// Creates the triangles array.
				TriangleArray triangleArray = new TriangleArray(
						vertices.size(), TriangleArray.COORDINATES
								| TriangleArray.NORMALS);
				triangleArray.setCapability(TriangleArray.ALLOW_COLOR_WRITE);
				triangleArray.setCapability(TriangleArray.ALLOW_COLOR_READ);
				int id = 0;
				for (Point3d vertex : vertices) {
					triangleArray.setCoordinate(id, vertex);
					id++;
				}

				NormalGenerator normalGenerator = new NormalGenerator();
				GeometryInfo geometryInfo = new GeometryInfo(triangleArray);
				normalGenerator.generateNormals(geometryInfo);
				geometry = geometryInfo.getGeometryArray();
			}
		}
		return geometry;
	}

	private void meshProfile(List<Point3d> vertices,
			List<List<Point3d>> profiles, int profileIndex) {
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;

		for (int k = 0; k < profiles.get(profileIndex).size() - 1; k++) {
			if (k != (profiles.get(profileIndex).size() / 2) - 1) {
				p1 = k;
				p2 = k + 1;
				p3 = profiles.get(profileIndex).size() - 1 - k;

				// Adds the triangle.
				vertices.add(profiles.get(profileIndex).get(p1));
				vertices.add(profiles.get(profileIndex).get(p2));
				vertices.add(profiles.get(profileIndex).get(p3));
			}
		}
	}

	private List<List<Point3d>> sweepProfile(List<Point3d> profile) {
		List<List<Point3d>> profiles = new ArrayList<List<Point3d>>();
		double azimuthAngleIncrement = (maxHorizontalAngle - minHorizontalAngle)
				/ (numberHorizontalIncrement - 1);

		double azimuthAngle = minHorizontalAngle;
		for (int azimuth = 0; azimuth < numberHorizontalIncrement; azimuth++) {
			// Creates rotation matrix.
			Transform3D transform = new Transform3D();
			transform.rotX(azimuthAngle);

			List<Point3d> rotatedProfile = new ArrayList<Point3d>();
			for (int i = 0; i < profile.size(); i++) {
				Point3d rotatedPoint = new Point3d();
				transform.transform(profile.get(i), rotatedPoint);
				rotatedProfile.add(rotatedPoint);
			}

			profiles.add(rotatedProfile);
			azimuthAngle += azimuthAngleIncrement;
		}
		return profiles;
	}

	private List<Point3d> generateProfile() {
		List<Point3d> vertices = new ArrayList<Point3d>();

		// Generate the profile in the XZ plane
		double elevationIncrement = (maxVerticalAngle - minVerticalAngle)
				/ (numberVerticalIncrement - 1);
		double elevationAngle = minVerticalAngle;

		// Short radius part.
		for (int elevation = 0; elevation < numberVerticalIncrement; elevation++) {
			double z = minRadius * Math.cos(elevationAngle);
			double x = minRadius * Math.sin(elevationAngle);

			Point3d point = new Point3d(x, 0, z);
			vertices.add(point);

			elevationAngle += elevationIncrement;
		}

		// Long radius part
		elevationAngle = maxVerticalAngle;
		for (int elevation = 0; elevation < numberVerticalIncrement; elevation++) {
			double z = maxRadius * Math.cos(elevationAngle);
			double x = maxRadius * Math.sin(elevationAngle);

			Point3d point = new Point3d(x, 0, z);
			vertices.add(point);

			elevationAngle -= elevationIncrement;
		}

		return vertices;
	}
}
