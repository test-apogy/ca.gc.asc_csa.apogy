package ca.gc.space.java3d;

import java.awt.Container;
import java.net.URL;

import javax.media.j3d.Appearance;
import javax.media.j3d.GeometryArray;
import javax.media.j3d.Material;
import javax.media.j3d.QuadArray;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransparencyAttributes;
import javax.vecmath.Point3f;
import javax.vecmath.TexCoord2f;

import com.sun.j3d.utils.image.TextureLoader;

public class TexturedPlane extends Shape3D {
	private static final int NUM_VERTS = 4;

	private Appearance appearance;

	public TexturedPlane(Point3f p1, Point3f p2, Point3f p3, Point3f p4, URL fnm) {
		createGeometry(p1, p2, p3, p4);
		createAppearance(fnm);
	}

	private void createGeometry(Point3f p1, Point3f p2, Point3f p3, Point3f p4) {
		QuadArray plane = new QuadArray(NUM_VERTS, GeometryArray.COORDINATES
				| GeometryArray.TEXTURE_COORDINATE_2 | GeometryArray.COLOR_3);
		plane.setCoordinate(0, p1);
		plane.setCoordinate(1, p2);
		plane.setCoordinate(2, p3);
		plane.setCoordinate(3, p4);
		TexCoord2f q = new TexCoord2f();
		q.set(0.0f, 0.0f);
		plane.setTextureCoordinate(0, 0, q);
		q.set(1.0f, 0.0f);
		plane.setTextureCoordinate(0, 1, q);
		q.set(1.0f, 1.0f);
		plane.setTextureCoordinate(0, 2, q);
		q.set(0.0f, 1.0f);
		plane.setTextureCoordinate(0, 3, q);
		setGeometry(plane);
	}

	private void createAppearance(URL fnm) {
		TextureLoader loader = new TextureLoader(fnm, new Container());
		appearance = new Appearance();
		TransparencyAttributes tra = new TransparencyAttributes();
		tra.setTransparencyMode(TransparencyAttributes.BLENDED);
		Material material = new Material();
		material.setCapability(Material.ALLOW_COMPONENT_READ);
		material.setCapability(Material.ALLOW_COMPONENT_WRITE);
		appearance.setMaterial(material);
		appearance.setTransparencyAttributes(tra);
		appearance.setTexture(loader.getTexture());

		setAppearance(appearance);
	}

}
