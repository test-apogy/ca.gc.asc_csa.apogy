package ca.gc.space.java3d;

import java.util.List;

import javax.media.j3d.IndexedGeometryArray;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;

import ca.gc.space.java.utils.Timer;

public class Java3DSelfShadowCaster {

	private static final double exaggeration = 1.0;
	private IndexedGeometryArray mesh;
	private List<Vector3d> lights;
	private static final float ambient = 0.3f;
	private static final float diffuse = 0.7f;
	private static final float strength = 200.0f;
	public boolean isDirty;

	public Java3DSelfShadowCaster(List<Vector3d> lights,
			IndexedGeometryArray triangles) {
		this.mesh = triangles;
		this.lights = lights;
		isDirty = true;
		computeShadows();
	}

	public void computeShadows() {

		if (isDirty) {
			Timer t0 = new Timer();
			t0.start();
			// The shade associated with every vertex.
			double[] shade = new double[mesh.getVertexCount()];

			RegularGrid rg = null; 
//			new RegularGrid(mesh, 62, 62, 0);

			System.out
					.println("Java3DSelfShadowCaster.computeShadows() time to build regular grid: "
							+ t0.stop() + "ms");

			Point3d vertex = null;

			// For the moment we only support one light source.
			Vector3d light = lights.get(0);

			t0.start();

			System.out
					.println("Java3DSelfShadowCaster.computeShadows() computing ...");
			// compute vertex shadows
			double[] key = new double[2];
			ca.gc.space.java.utils.Timer timer = new ca.gc.space.java.utils.Timer();
			for (int i = 0; i < mesh.getVertexCount(); i++) {
				if (i % 100 == 0) {
					if (i != 0) {
						// System.out
						// .println("Java3DSelfShadowCaster.computeShadows() average search time: "
						// + timer.average() + "ms");
						timer.reset();
					}
					// System.out
					// .println("Java3DSelfShadowCaster.computeShadows() "
					// + i + "/" + mesh.getVertexCount());
				}
				shade[i] = 1.0;
				vertex = new Point3d();
				mesh.getCoordinate(i, vertex);
				Vector3d ray = new Vector3d(light);
				ray.sub(vertex);
				double distance = ray.length();
				// double distance = steps * Math.sqrt(ray.x * ray.x + ray.z *
				// ray.z);

				timer.start();
				/* step along ray in horizontal units of grid width */
				for (double place = 0.1; place < 60; place += 0.1) {
					Vector3d sample = new Vector3d(vertex);
					Vector3d rayScale = new Vector3d(ray);
					rayScale.scale(place / distance);

					sample.add(rayScale);

					// We find the closest point in terms of x,y.

					key[0] = sample.x;
					key[1] = sample.y;
					// Point3d closestPoint;
					// try {
					// closestPoint = (Point3d) kdTree.nearest(key);
					if (sample.x >= 0 && sample.x < 61 && sample.y >= 0
							&& sample.y < 61) {
						double ground = exaggeration
								* rg.getElevation(sample.x, sample.y);
						if (ground > sample.z) {
							shade[i] = 0.0;
							break;
						}
					}
					// } else {
					// break;
					// }
					// } catch (KeySizeException e) {
					// e.printStackTrace();
					// }
				}
				timer.stop();
			}
			System.out.println("Java3DSelfShadowCaster.computeShadows() done");
			System.out
					.println("Java3DSelfShadowCaster.computeShadows() time to compute shadows: "
							+ t0.stop() + "ms");

			// We then compute the vertex color.
			// compute triangle and vertex colors
			Color3f color = new Color3f();
			Vector3f normal = new Vector3f();
			Vector3d sun = new Vector3d(light);
			t0.start();
			Color3f[] colors = new Color3f[mesh.getVertexCount()];
			for (int j = 0; j < colors.length; j++) {
				colors[j] = new Color3f();
			}
			mesh.getColors(0, colors);
			try {
				for (int i = 0; i < mesh.getVertexCount(); ++i) {
					// Average color
					mesh.getCoordinate(i, vertex);
					color = colors[i];
					double shadow = shade[i];
					mesh.getNormal(i, normal);
					light = new Vector3d(vertex);
					light.sub(sun);
					double distance2 = light.lengthSquared();
					light.normalize();
					double dot = light.dot(new Vector3d(normal));
					color.set(1, 1, 1);
					double lighting = ambient;
					if (shadow == 1.0) {
						lighting = 1.0f;
					} else {
						lighting = 0.0f;
					}
					// if (dot < 0.0 && shadow == 1.0) { // add diffuse lighting
					// double factor = strength * diffuse * dot * shadow
					// / distance2;
					// lighting -= factor;
					// } else if (shadow == 0.0) {
					// lighting = 0.0;
					// }
					color.scale((float) lighting);
					// mesh.setColor(i, color);
					// color.scale((float) lighting);

				}
			} catch (Throwable t) {
				t.printStackTrace();
			}
			mesh.setColors(0, colors);

			System.out
					.println("Java3DSelfShadowCaster.computeShadows() time to set colors: "
							+ t0.stop() + "ms");

			isDirty = false;
		}

	}
}
