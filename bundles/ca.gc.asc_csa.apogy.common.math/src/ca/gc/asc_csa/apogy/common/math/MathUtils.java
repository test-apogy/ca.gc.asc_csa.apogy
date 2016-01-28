package org.eclipse.symphony.common.math;

import javax.vecmath.Matrix4d;


public class MathUtils {
	/**
	 * This class contains only static members.
	 */
	private MathUtils() {
	}		
	
	/**
	 * Sets the translation components of the matrix.
	 * @param matrix Reference to the matrix to be modified.
	 * @param translation Translation.
	 * @return Reference to the modified matrix.
	 */
	public static void updateTranslation(Matrix4x4 matrix, Tuple3d translation){
		matrix.setM03(translation.getX());
		matrix.setM13(translation.getY());
		matrix.setM23(translation.getZ());
	}
	
	/**
	 * Sets the orientation of the matrix.
	 * @param matrix Matrix to be updated
	 * @param orientation Orientation matrix.
	 */	
	public static void updateOrientation(Matrix4x4 matrix, Matrix3x3 orientation){
		matrix.setM00(orientation.getM00());
		matrix.setM01(orientation.getM01());
		matrix.setM02(orientation.getM02());
		
		matrix.setM10(orientation.getM10());
		matrix.setM11(orientation.getM11());
		matrix.setM12(orientation.getM12());

		matrix.setM20(orientation.getM20());
		matrix.setM21(orientation.getM21());
		matrix.setM22(orientation.getM22());		
	}
	
	/**
	 * Sets the orientation of a rotation matrix.
	 * @param matrix Matrix to be updated
	 * @param orientation Orientation matrix.
	 */	
	public static void updateOrientation(Matrix3x3 matrix, Matrix3x3 orientation)
	{
		matrix.setM00(orientation.getM00());
		matrix.setM01(orientation.getM01());
		matrix.setM02(orientation.getM02());
		
		matrix.setM10(orientation.getM10());
		matrix.setM11(orientation.getM11());
		matrix.setM12(orientation.getM12());

		matrix.setM20(orientation.getM20());
		matrix.setM21(orientation.getM21());
		matrix.setM22(orientation.getM22());		
	}
	
	public static void updateMatrix(final Matrix4x4 result, Matrix4d matrix)
	{
		// Row 0
		result.setM00(matrix.m00);
		result.setM01(matrix.m01);
		result.setM02(matrix.m02);
		result.setM03(matrix.m03);

		// Row 1
		result.setM10(matrix.m10);
		result.setM11(matrix.m11);
		result.setM12(matrix.m12);
		result.setM13(matrix.m13);

		// Row 2
		result.setM20(matrix.m20);
		result.setM21(matrix.m21);
		result.setM22(matrix.m22);
		result.setM23(matrix.m23);

		// Row 3
		result.setM30(matrix.m30);
		result.setM31(matrix.m31);
		result.setM32(matrix.m32);
		result.setM33(matrix.m33);
	}
}
