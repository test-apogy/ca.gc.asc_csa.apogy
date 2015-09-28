package ca.gc.space.java3d;

import javax.media.j3d.Appearance;

import com.sun.j3d.utils.geometry.Box;

public class ColoredPlane extends Box {

	
	public ColoredPlane(float width, float height,Appearance appearance) {
		super(width,height,0.001f,appearance);
	}	
}
