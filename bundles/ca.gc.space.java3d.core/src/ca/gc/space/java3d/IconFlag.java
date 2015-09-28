package ca.gc.space.java3d;

import java.net.URL;

import javax.media.j3d.Appearance;
import javax.media.j3d.Billboard;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.Material;
import javax.media.j3d.Node;
import javax.media.j3d.PolygonAttributes;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3f;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.sun.j3d.utils.geometry.Cone;
import com.sun.j3d.utils.geometry.Cylinder;
import com.sun.j3d.utils.geometry.Primitive;

public class IconFlag extends Primitive {

	public static int DEFAULT_POINT_BUFFER_SIZE = 10000;

	private TransformGroup scale;
	private Cone pointShape;
	private float coneRadius = 0.2f;
	private float coneHeight = coneRadius * 2.0f;
	private Cylinder shaftShape;

	private float planeBoxHeight = 1f;
	private float planeBoxWidth = 1f;

	private TexturedPlane textureBox;
	private ColoredPlane colorBox;

	private TransformGroup planeBoxTransformTransformGroup;
	private Transform3D planeBoxTransform;

	// private Material mat;

	private Appearance pointAppearance;

	private Appearance shaftAppearance;

	private Appearance cbAppearance;

	private Appearance billBoardAppearance;

	private Appearance createAppearance() {
		Appearance app = new Appearance();

		PolygonAttributes pa = new PolygonAttributes();
		pa.setCapability(PolygonAttributes.ALLOW_MODE_WRITE);
		pa.setCapability(PolygonAttributes.ALLOW_MODE_READ);
		pa.setCullFace(PolygonAttributes.CULL_NONE);
		pa.setPolygonMode(PolygonAttributes.POLYGON_FILL);
		pa.setBackFaceNormalFlip(true);
		app.setPolygonAttributes(pa);

		Material mat = new Material();
		mat.setLightingEnable(true);
		// mat.setAmbientColor(new Color3f(0.0f, 0.0f, 0.0f));
		mat.setSpecularColor(new Color3f(0.0f, 0.0f, 0.0f));
		mat.setDiffuseColor(new Color3f(1.0f, 1.0f, 1.0f));
		mat.setShininess(1.0f);
		mat.setCapability(Material.ALLOW_COMPONENT_READ);
		mat.setCapability(Material.ALLOW_COMPONENT_WRITE);
		app.setMaterial(mat);

		return app;
	}

	public IconFlag(float cylinderHeight, URL url, float cylinderRadius) {
		super();

		scale = new TransformGroup();
		scale.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
		scale.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		Transform3D scaleTransform = new Transform3D();
		scaleTransform.rotX(Math.toRadians(90.0));
		scale.setTransform(scaleTransform);

		// Creates the shapes.

		pointAppearance = createAppearance();

		pointShape = new Cone(coneRadius, coneHeight, pointAppearance);
		Transform3D pointShapeTransform = new Transform3D();
		pointShapeTransform.rotX(Math.toRadians(180.0));
		TransformGroup pointShapeTransformGroup = new TransformGroup(
				pointShapeTransform);
		pointShapeTransformGroup
				.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		scale.addChild(pointShapeTransformGroup);
		pointShapeTransformGroup.addChild(pointShape);

		Transform3D chaftShapeTransform = new Transform3D();
		chaftShapeTransform.setTranslation(new Vector3f(0.0f,
				(cylinderHeight / 2.0f) + (coneHeight / 2.0f), 0.0f));
		TransformGroup chaftShapeTransformGroup = new TransformGroup(
				chaftShapeTransform);
		chaftShapeTransformGroup
				.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		scale.addChild(chaftShapeTransformGroup);

		shaftAppearance = createAppearance();

		shaftShape = new Cylinder(cylinderRadius, cylinderHeight,
				Primitive.GENERATE_NORMALS
						| Primitive.ENABLE_COLLISION_REPORTING, 360, 1,
				shaftAppearance);
		chaftShapeTransformGroup.addChild(shaftShape);

		// Flag
		planeBoxTransform = new Transform3D();

		Matrix3d rotationMatrix = packZYX(0, Math.PI, -Math.PI / 2);
		planeBoxTransform.setRotation(rotationMatrix);
		planeBoxTransform.setTranslation(new Vector3f(cylinderRadius,
				cylinderHeight + (coneHeight / 2.0f) - planeBoxHeight, 0.0f));

		planeBoxTransformTransformGroup = new TransformGroup(planeBoxTransform);
		planeBoxTransformTransformGroup
				.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);

		textureBox = new TexturedPlane(new Point3f(0, 0, 0), new Point3f(0,
				planeBoxHeight, 0), new Point3f(planeBoxWidth, planeBoxHeight,
				0), new Point3f(planeBoxWidth, 0, 0), url);

		planeBoxTransformTransformGroup.addChild(textureBox);

		BoundingSphere bounds = new BoundingSphere(new Point3d(0.0,
				cylinderHeight + (coneHeight / 2.0f), 0.0), 800.0);

		cbAppearance = createAppearance();

		colorBox = new ColoredPlane(planeBoxWidth / 2, planeBoxHeight / 2,
				cbAppearance);
		Transform3D colorBoxTransform = new Transform3D();
		colorBoxTransform.setTranslation(new Vector3f(planeBoxWidth / 2,
				planeBoxWidth / 2, 0.01f));
		TransformGroup colorBoxTransformTransformGroup = new TransformGroup(
				colorBoxTransform);
		colorBoxTransformTransformGroup
				.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		colorBoxTransformTransformGroup.addChild(colorBox);

		planeBoxTransformTransformGroup
				.addChild(colorBoxTransformTransformGroup);

		billBoardAppearance = createAppearance();

		scale.addChild(createBillboard(planeBoxTransformTransformGroup,
				new Point3f(0.0f, cylinderHeight + (coneHeight / 2.0f), 0.0f),
				Billboard.ROTATE_ABOUT_AXIS, new Point3f(0.0f, cylinderHeight
						+ (coneHeight / 2.0f), 0.0f), bounds,
				billBoardAppearance));

		addChild(scale);

	}

	public static Matrix3d packZYX(double rx, double ry, double rz) {
		// We build the transformation matrix.
		Matrix3d rMatx = new Matrix3d();

		rMatx.rotX(rx);

		Matrix3d rMaty = new Matrix3d();

		rMaty.rotY(ry);

		Matrix3d rMatz = new Matrix3d();

		rMatz.rotZ(rz);

		rMaty.mul(rMatx);
		rMatz.mul(rMaty);

		return rMatz;
	}

	/**
	 * Source :
	 * http://www.tecgraf.puc-rio.br/~ismael/Cursos/Cidade_CG/labs/Java3D
	 * /Java3D_onlinebook_selman/Htmls/3DJava_Ch11.htm#11-8
	 * 
	 * @param szText
	 * @param locationPoint
	 * @param nMode
	 * @param billboardPoint
	 * @param bounds
	 * @return
	 */
	private TransformGroup createBillboard(TransformGroup sh,
			Point3f locationPoint, int nMode, Point3f billboardPoint,
			BoundingSphere bounds, Appearance appearance) {
		TransformGroup subTg = new TransformGroup();
		subTg.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);

		Appearance textAppear = new Appearance();
		ColoringAttributes textColor = new ColoringAttributes();
		textAppear.setColoringAttributes(textColor);
		textAppear.setMaterial(appearance.getMaterial());

		subTg.addChild(sh);

		Billboard billboard = new Billboard(subTg, nMode, billboardPoint);
		billboard.setSchedulingBounds(bounds);
		subTg.addChild(billboard);

		return subTg;
	}

	@Override
	public Appearance getAppearance(int arg0) {
		switch (arg0) {
		case 0:
			return pointShape.getAppearance();
		case 1:
			return shaftShape.getAppearance();
		case 2:
			return textureBox.getAppearance();
		default:
			return null;
		}
	}

	@Override
	public Shape3D getShape(int arg0) {
		switch (arg0) {
		case 0:
			return pointShape.getShape(0);
		case 1:
			return shaftShape.getShape(0);
		case 2:
			return textureBox;
		default:
			return shaftShape.getShape(0);
		}
	}

	public Node[] getAllShapes() {
		return new Node[] { pointShape, shaftShape, this, colorBox, textureBox };
	}

	public Cylinder getShaft() {
		return shaftShape;
	}

	public ColoredPlane getPlane() {
		return colorBox;
	}

	@Override
	public void setAppearance(Appearance arg0) {
		pointShape.setAppearance(arg0);
		shaftShape.setAppearance(arg0);
		colorBox.setAppearance(arg0);
	}

	public synchronized void setColor(float r, float g, float b) {
		try {
			pointAppearance.getMaterial().setDiffuseColor(r, g, b);
			shaftAppearance.getMaterial().setDiffuseColor(r, g, b);
			cbAppearance.getMaterial().setDiffuseColor(r, g, b);
			billBoardAppearance.getMaterial().setDiffuseColor(r, g, b);
		} catch (Exception e) {
			e.printStackTrace();
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					IStatus.ERROR, "Failed to set the object's color !", e);
			Activator.getDefault().getLog().log(status);
		}
	}

	public synchronized void setScale(double s) {
		Matrix4d m = new Matrix4d();
		planeBoxTransform.get(m);
		planeBoxTransform = new Transform3D(m);
		planeBoxTransform.setScale(s);
		planeBoxTransformTransformGroup.setTransform(planeBoxTransform);
	}
}