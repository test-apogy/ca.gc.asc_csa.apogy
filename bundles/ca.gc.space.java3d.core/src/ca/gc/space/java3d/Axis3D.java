package ca.gc.space.java3d;

import javax.media.j3d.Appearance;
import javax.media.j3d.LineArray;
import javax.media.j3d.LineAttributes;
import javax.media.j3d.Shape3D;
import javax.vecmath.Color3f;

import com.sun.j3d.utils.geometry.Primitive;

public class Axis3D extends Primitive {

	private Shape3D shape = null;

	public Axis3D(double axisLength) {
		super();

		// We add the axis.
		LineArray lines = new LineArray(6, LineArray.COORDINATES
				| LineArray.COLOR_3);

		Color3f red = new Color3f(1.0f, 0.0f, 0.0f);
		Color3f green = new Color3f(0.0f, 1.0f, 0.0f);
		Color3f blue = new Color3f(0.0f, 0.0f, 1.0f);

		// The 'x' axis.
		lines.setCoordinate(0, new double[] { 0.0, 0.0, 0.0 });
		lines.setCoordinate(1, new double[] { axisLength, 0.0, 0.0 });
		lines.setColor(0, red);
		lines.setColor(1, red);

		// The 'y' axis.
		lines.setCoordinate(2, new double[] { 0.0, 0.0, 0.0 });
		lines.setCoordinate(3, new double[] { 0.0, axisLength, 0.0 });
		lines.setColor(2, green);
		lines.setColor(3, green);

		// The 'z' axis.
		lines.setCoordinate(4, new double[] { 0.0, 0.0, 0.0 });
		lines.setCoordinate(5, new double[] { 0.0, 0.0, axisLength });
		lines.setColor(4, blue);
		lines.setColor(5, blue);

		shape = new Shape3D(lines);

		Appearance app = new Appearance();
		LineAttributes lattr = new LineAttributes();
		lattr.setLineWidth(0.2f);

		app.setLineAttributes(lattr);

		shape.setAppearance(app);

		this.addChild(shape);
	}

	@Override
	public Appearance getAppearance(int arg0) {
		return shape.getAppearance();
	}

	@Override
	public Shape3D getShape(int arg0) {
		return shape;
	}

	@Override
	public void setAppearance(Appearance arg0) {
		shape.setAppearance(arg0);
	}
}
