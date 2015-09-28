package ca.gc.space.java3d;

import javax.media.j3d.Appearance;
import javax.media.j3d.Material;
import javax.media.j3d.PolygonAttributes;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Vector3f;

import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.geometry.Cone;
import com.sun.j3d.utils.geometry.Cylinder;
import com.sun.j3d.utils.geometry.Primitive;

public class Flag extends Primitive {

	private TransformGroup scale;
	private Cone pointShape;
	private float coneRadius = 0.2f;
	private float coneHeight = coneRadius * 2.0f;
	private Cylinder shaftShape;
	private float cylinderHeight = 4.0f;
	private float cylinderRadius = coneRadius / 2.0f;
	private Box finsShape1;
	private Box finsShape2;
	private float finsHeight = cylinderRadius;
	private float finsWidth = cylinderRadius * 3.0f;
	private float finsThickness = 0.01f;

	public Flag() {
		super();

		this.setPickable(true);

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
		mat.setAmbientColor(new Color3f(0.0f, 0.0f, 0.0f));
		mat.setSpecularColor(new Color3f(0.5f, 0.5f, 0.5f));
		mat.setDiffuseColor(new Color3f(0.7f, 0.7f, 0.7f));
		mat.setCapability(Material.ALLOW_COMPONENT_READ);
		mat.setCapability(Material.ALLOW_COMPONENT_WRITE);
		app.setMaterial(mat);

		scale = new TransformGroup();
		scale.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
		scale.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		Transform3D scaleTransform = new Transform3D();
		scaleTransform.rotX(Math.toRadians(90.0));
		scale.setTransform(scaleTransform);
		addChild(scale);

		// Creates the shapes.
		pointShape = new Cone(coneRadius, coneHeight, app);
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
		shaftShape = new Cylinder(cylinderRadius, cylinderHeight,
				Primitive.GENERATE_NORMALS
						| Primitive.ENABLE_COLLISION_REPORTING, 360, 1, app);
		chaftShapeTransformGroup.addChild(shaftShape);

		// First fin/
		Transform3D finsShape1Transform = new Transform3D();
		finsShape1Transform.setTranslation(new Vector3f(0.0f, cylinderHeight
				+ (coneHeight / 2.0f), 0.0f));
		TransformGroup finsShape1TransformGroup = new TransformGroup(
				finsShape1Transform);
		finsShape1TransformGroup
				.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		scale.addChild(finsShape1TransformGroup);
		finsShape1 = new Box(finsThickness, finsHeight, finsWidth, app);
		finsShape1TransformGroup.addChild(finsShape1);

		Transform3D finsShape2Transform = new Transform3D();
		finsShape2Transform.rotY(Math.toRadians(90.0));
		finsShape2Transform.setTranslation(new Vector3f(0.0f, cylinderHeight
				+ (coneHeight / 2.0f), 0.0f));
		TransformGroup finsShape2TransformGroup = new TransformGroup(
				finsShape2Transform);
		finsShape2TransformGroup
				.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		scale.addChild(finsShape2TransformGroup);
		finsShape2 = new Box(finsThickness, finsHeight, finsWidth, app);
		finsShape2TransformGroup.addChild(finsShape2);
	}

	@Override
	public Appearance getAppearance(int arg0) {
		switch (arg0) {
		case 0:
			return pointShape.getAppearance();
		case 1:
			return shaftShape.getAppearance();
		case 2:
			return finsShape1.getAppearance();
		case 3:
			return finsShape2.getAppearance();
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
			return finsShape1.getShape(0);
		case 3:
			return finsShape2.getShape(0);
		default:
			return shaftShape.getShape(0);
		}
	}

	public Cylinder getShaft() {
		return shaftShape;
	}

	@Override
	public void setAppearance(Appearance arg0) {
		pointShape.setAppearance(arg0);
		shaftShape.setAppearance(arg0);
		finsShape1.setAppearance(arg0);
		finsShape2.setAppearance(arg0);
	}
}