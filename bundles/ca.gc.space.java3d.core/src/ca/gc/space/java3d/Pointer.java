package ca.gc.space.java3d;

import javax.media.j3d.Appearance;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Vector3d;

import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.geometry.Cylinder;
import com.sun.j3d.utils.geometry.Primitive;

public class Pointer extends Primitive {

	private Box box1 = null;
	private Box box2 = null;
	private Cylinder cylinder = null;

	public Pointer() {
		super();

		Appearance app = new Appearance();

		box1 = new Box(0.1f, 1f, 0.3f, app);
		Transform3D transBox1 = new Transform3D();
		transBox1.rotZ(Math.PI / 4);
		TransformGroup groupBox1 = new TransformGroup(transBox1);
		groupBox1.addChild(box1);

		box2 = new Box(0.1f, 1f, 0.3f, app);
		Transform3D transBox2 = new Transform3D();
		transBox2.rotZ(-Math.PI / 4);
		TransformGroup groupBox2 = new TransformGroup(transBox2);
		groupBox2.addChild(box2);

		cylinder = new Cylinder(0.1f, 2, Primitive.GENERATE_NORMALS
				| Primitive.ENABLE_COLLISION_REPORTING, 360, 1, app);
		Transform3D transCyl1 = new Transform3D();
		transCyl1.rotX(Math.PI / 2);
		TransformGroup groupCyl1 = new TransformGroup(transCyl1);

		Transform3D transCyl2 = new Transform3D();
		transCyl2.setTranslation(new Vector3d(0, 0, 1));
		TransformGroup groupCyl2 = new TransformGroup(transCyl2);

		groupCyl2.addChild(groupCyl1);
		groupCyl1.addChild(cylinder);

		this.addChild(groupBox1);
		this.addChild(groupBox2);
		this.addChild(groupCyl2);
	}

	@Override
	public Appearance getAppearance(int arg0) {
		switch (arg0) {
		case 0:
			return box1.getAppearance();
		case 1:
			return box2.getAppearance();
		case 2:
			return cylinder.getAppearance();
		default:
			return null;
		}
	}

	@Override
	public Shape3D getShape(int arg0) {
		switch (arg0) {
		case 0:
			return box1.getShape(0);
		case 1:
			return box2.getShape(0);
		case 2:
			return cylinder.getShape(0);
		default:
			return null;
		}
	}

	@Override
	public void setAppearance(Appearance arg0) {
		box1.setAppearance(arg0);
		box2.setAppearance(arg0);
		cylinder.setAppearance(arg0);
	}
}