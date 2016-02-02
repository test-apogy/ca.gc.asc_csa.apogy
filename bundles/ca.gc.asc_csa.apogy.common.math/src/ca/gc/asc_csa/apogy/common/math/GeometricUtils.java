package ca.gc.asc_csa.apogy.common.math;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import static java.lang.Math.asin;
import static java.lang.Math.atan2;

import java.util.List;

import javax.vecmath.GMatrix;
import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

public final class GeometricUtils {

	/**
	 * Computes the intersection of ray with triangle p0,p1,p2.
	 * 
	 * @param p0
	 *            the first point of the triangle
	 * @param p1
	 *            the second point of the triangle
	 * @param p2
	 *            the third point of the triangle
	 * @param rayOrigin
	 *            the origin of the ray intersected with the triangle.
	 * @param rayDirection
	 *            the direction of the ray intersected with the triangle.
	 * @return the intersection of the ray with triangle p0,p1,p2 or
	 *         <code>null</code> if no intersection is found.
	 */
	public static Point3d lineTriangleIntersect(Point3d p0, Point3d p1,
			Point3d p2, Point3d rayOrigin, Vector3d rayDirection) {
		Point3d intersection = null;

		// e1 = tri.v1 - tri.v0
		Vector3d e1 = new Vector3d(p1);
		e1.sub(p0);

		// e2 = tri.v2 - tri.v0
		Vector3d e2 = new Vector3d(p2);
		e2.sub(p0);

		// p = Cross(line.direction, e2)
		Vector3d p = new Vector3d();
		p.cross(rayDirection, e2);

		// tmp = Dot(p,e1)
		double tmp = p.dot(e1);

		double epsilon = 0.001;

		if (tmp > -epsilon && tmp < epsilon) {
			return null;
		}

		tmp = 1.0 / tmp;

		// s = line.origin - tri.v0
		Vector3d s = new Vector3d(rayOrigin);
		s.sub(p0);

		// u = tmp * Dot(s,p)
		double u = tmp * s.dot(p);

		if (u < 0.0 || u > 1.0) {
			return null;
		}

		// q = Cross(s,e1)
		Vector3d q = new Vector3d();
		q.cross(s, e1);

		// v = tmp * Dot(line.direction,q)
		double v = tmp * rayDirection.dot(q);

		if (v < 0.0 || v > 1.0) {
			return null;
		}

		if (u + v > 1.0) {
			return null;
		}

		// t = tmp * Dot(e2,q)
		double t = tmp * e2.dot(q);

		// if (t < 0) {
		// return null;
		// }

		// intersection = line.origin + t * line.direction
		intersection = new Point3d(rayOrigin);

		Vector3d part2 = new Vector3d(rayDirection);
		part2.scale(t);

		intersection.add(part2);

		return intersection;
	}

	/**
	 * 
	 * <PRE>
	 * 
	 * 'Name: extractRotationFromXYZRotMatrix
	 * 
	 * 'Description: extracts the XYZ euler angles from a XYZ rotation
	 * matrix. Solution taken from Geometric Tools for Computer Graphics p. 848.
	 * 
	 * 'Pre-condition: none.
	 * 
	 * 'Post-condition: none.
	 * 
	 * </PRE>
	 * 
	 * @param xyzRotationMatrix
	 *            the XYZ rotation matrix.
	 * @return a vector composed the the xyz angles (in degrees): [X,Y,Z].
	 */
	public static Vector3d extractRotationFromXYZRotMatrix(
			Matrix3d xyzRotationMatrix) {

		double r02 = xyzRotationMatrix.m02;
		double r12 = xyzRotationMatrix.m12;
		double r01 = xyzRotationMatrix.m01;
		double r00 = xyzRotationMatrix.m00;
		double r22 = xyzRotationMatrix.m22;
		double r10 = xyzRotationMatrix.m10;
		double r11 = xyzRotationMatrix.m11;

		double thetaY = asin(r02);
		double thetaX = 0.0;
		double thetaZ = 0.0;

		double pidiv2 = Math.PI / 2.0;

		if (thetaY < pidiv2) {
			if (thetaY > -pidiv2) {
				thetaX = atan2(-r12, r22);
				thetaZ = atan2(-r01, r00);
			} else {
				// Not a unique solution (thetaX - thetaZ constant).
				thetaX = -atan2(r10, r11);
				thetaZ = 0.0;
			}
		} else {
			// Not a unique solution (thetaX + thetaZ constant).
			thetaX = atan2(r10, r11);
			thetaZ = 0.0;
		}

		return new Vector3d(thetaX, thetaY, thetaZ);
	}

	/**
	 * 
	 * <PRE>
	 * 
	 * 'Name: extractRotationFromZYXRotMatrix
	 * 
	 * 'Description: extracts the ZYX euler angles from a ZYX rotation
	 * matrix. Solution taken from Geometric Tools for Computer Graphics p. 852.
	 * 
	 * 'Pre-condition: none.
	 * 
	 * 'Post-condition: none.
	 * 
	 * </PRE>
	 * 
	 * @param yprRotationMatrix
	 *            the ZYX rotation matrix.
	 * @return a vector composed the the xyz angles (in degrees): [X,Y,Z].
	 */
	public static Vector3d extractRotationFromZYXRotMatrix(
			Matrix3d yprRotationMatrix) {

		double thetaX;
		double thetaZ;

		double r20 = yprRotationMatrix.m20;
		double r10 = yprRotationMatrix.m10;
		double r00 = yprRotationMatrix.m00;
		double r21 = yprRotationMatrix.m21;
		double r22 = yprRotationMatrix.m22;
		double r01 = yprRotationMatrix.m01;
		double r02 = yprRotationMatrix.m02;

		double thetaY = Math.asin(-r20);

		double pidiv2 = Math.PI / 2.0;

		if (thetaY < pidiv2) {
			if (thetaY > -pidiv2) {
				thetaZ = Math.atan2(r10, r00);
				thetaX = Math.atan2(r21, r22);
			} else {
				// not a unique solution (thetaX + thetaZ constant).
				thetaZ = Math.atan2(-r01, -r02);
				thetaX = 0.0;
			}
		} else {
			// not a unique solution (thetaX - thetaZ constant).
			thetaZ = -Math.atan2(r01, r02);
			thetaX = 0.0;
		}

		return new Vector3d(thetaX, thetaY, thetaZ);
	}

	/**
	 * 
	 * <PRE>
	 * 
	 * 'Name: extractRotationFromYZXRotMatrix
	 * 
	 * 'Description: extracts the euler angles from a YZX rotation matrix.
	 * Solution taken from Geometric Tools for Computer Graphics p. 850.
	 * 
	 * 'Pre-condition: none.
	 * 
	 * 'Post-condition: none.
	 * 
	 * </PRE>
	 * 
	 * @param yzxRotationMatrix
	 *            the YZX rotation matrix.
	 * @return a vector composed the the xyz angles (in degrees): [X,Y,Z].
	 */
	public static Vector3d extractRotationFromYZXRotMatrix(
			Matrix3d yzxRotationMatrix) {
		double thetaX;
		double thetaY;

		double r12 = yzxRotationMatrix.m12;
		double r10 = yzxRotationMatrix.m10;
		double r20 = yzxRotationMatrix.m20;
		double r21 = yzxRotationMatrix.m21;
		double r00 = yzxRotationMatrix.m00;
		double r11 = yzxRotationMatrix.m11;
		double r22 = yzxRotationMatrix.m22;

		double thetaZ = Math.asin(r10);

		double pidiv2 = Math.PI / 2.0;

		if (thetaZ < pidiv2) {
			if (thetaZ > -pidiv2) {
				thetaY = Math.atan2(-r20, r00);
				thetaX = Math.atan2(-r12, r11);
			} else {
				// not a unique solution (thetaX - thetaY constant).
				thetaY = -Math.atan2(r21, r22);
				thetaX = 0.0;
			}
		} else {
			// not a unique solution (thetaX + thetaY constant).
			thetaY = Math.atan2(r21, r22);
			thetaX = 0.0;
		}

		return new Vector3d(thetaX, thetaY, thetaZ);
	}

	public static Matrix4d packZYX(double tx, double ty, double tz, double rx,
			double ry, double rz) {
		// We build the transformation matrix.
		Matrix3d rMatx = new Matrix3d();		
		
		rMatx.rotX(rx);

		Matrix3d rMaty = new Matrix3d();

		rMaty.rotY(ry);

		Matrix3d rMatz = new Matrix3d();

		rMatz.rotZ(rz);

		rMatz.mul(rMaty);
		rMatz.mul(rMatx);		
		
		Matrix4d trMatrix = new Matrix4d(rMatz, new Vector3d(tx, ty, tz), 1.0);
		return trMatrix;
	}

	public static Matrix3d packXYZ(double rx, double ry, double rz) {
		// We build the transformation matrix.
		Matrix3d rMatx = new Matrix3d();

		rMatx.rotX(rx);

		Matrix3d rMaty = new Matrix3d();

		rMaty.rotY(ry);

		Matrix3d rMatz = new Matrix3d();

		rMatz.rotZ(rz);

		rMatx.mul(rMaty);
		rMatx.mul(rMatz);

		return rMatx;
	}

	public static Matrix3d packYZX(double rx, double ry, double rz) {
		// We build the transformation matrix.
		Matrix3d rMatx = new Matrix3d();

		rMatx.rotX(rx);

		Matrix3d rMaty = new Matrix3d();

		rMaty.rotY(ry);

		Matrix3d rMatz = new Matrix3d();

		rMatz.rotZ(rz);

		rMaty.mul(rMatz);
		rMaty.mul(rMatx);

		return rMaty;
	}

	public static Matrix3d packYXZ(double rx, double ry, double rz) {
		// We build the transformation matrix.
		Matrix3d rMatz = new Matrix3d();

		rMatz.rotZ(rz);

		Matrix3d rMaty = new Matrix3d();

		rMaty.rotY(ry);

		Matrix3d rMatx = new Matrix3d();

		rMatx.rotX(rx);

		rMaty.mul(rMatx);
		rMaty.mul(rMatz);

		return rMaty;
	}

	public static Matrix4d packXYZ(double tx, double ty, double tz, double rx,
			double ry, double rz) {
		Matrix4d trMatrix = new Matrix4d(packXYZ(rx, ry, rz), new Vector3d(tx,
				ty, tz), 1.0f);

		return trMatrix;
	}

	public static Matrix4d packYZX(double tx, double ty, double tz, double rx,
			double ry, double rz) {

		Matrix4d trMatrix = new Matrix4d(packYZX(rx, ry, rz), new Vector3d(tx,
				ty, tz), 1.0f);
		return trMatrix;
	}

	public static Matrix4d invertTransformationMatrix(Matrix4d matrix) {

		Matrix3d rotation_matrix = new Matrix3d();
		Vector3d translation_vector = new Vector3d();

		// Retrieve the Rotation matrix AND Translation vector of the
		// homogeneous transformation
		matrix.get(rotation_matrix, translation_vector);

		// Calculate its rotation transpose ( R' = R^{T} )
		rotation_matrix.transpose();

		// Calculate the reversed translation ( tr' = -R^{T}tr )
		Vector3d row0 = new Vector3d();
		Vector3d row1 = new Vector3d();
		Vector3d row2 = new Vector3d();
		Matrix3d minus_rotation_matrix_transposed = new Matrix3d();
		minus_rotation_matrix_transposed.mul(-1, rotation_matrix);
		minus_rotation_matrix_transposed.getRow(0, row0);
		minus_rotation_matrix_transposed.getRow(1, row1);
		minus_rotation_matrix_transposed.getRow(2, row2);
		Vector3d reverse_translation_vector = new Vector3d(row0
				.dot(translation_vector), row1.dot(translation_vector), row2
				.dot(translation_vector));

		// Fill the reversed matrix
		Matrix4d reverse_matrix = new Matrix4d(rotation_matrix,
				reverse_translation_vector, 1);

		return reverse_matrix;
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

	public static void outerProduct(Vector3d v1, Vector3d v2, GMatrix res) {
		double[] a = new double[3];
		double[] b = new double[3];

		v1.get(a);
		v2.get(b);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				res.setElement(i, j, a[i] * b[j]);

			} // for j

		} // for i
	}
	
	/**
	 * Compute the matrix resulting from the multiplication of 'matrices'.
	 * 
	 * @param matrices
	 *            the matrices to multiply.
	 * @param reverse
	 *            if set to <code>true</code>: result =
	 *            matrices(size-1)*matrices(size-2)*...*matrices(0). if set to
	 *            <code>false</code>: result = matrices(0) * matrices(1) * ... *
	 *            matrices(size-1).
	 * @return the result of the multiplication.
	 */
	public static Matrix4d computeMatrix(List<Matrix4d> matrices,
			boolean reverse) {
		Matrix4d result = new Matrix4d();
		result.setIdentity();
		while (!matrices.isEmpty()) {
			Matrix4d matrix = null;
			if (reverse) {
				matrix = matrices.remove(matrices.size() - 1);
			} else {
				matrix = matrices.remove(0);
			}
			result.mul(matrix);
		}

		return result;
	}

	/**
	 * IMPORTANT: To be used for small angle difference This function takes two
	 * vectors that contain 3D orientation angles and returns a vector with
	 * their difference.
	 * 
	 * @param v0
	 *            First orientations vector.
	 * @param v1
	 *            Second orientations vector.
	 * @return the angle difference for the 3 orientations
	 */
	public static Vector3d computeOrientationDifference(Vector3d v0, Vector3d v1) {
		double ox, oy, oz;
		ox = computeAngularDifference(v0.x, v1.x);
		oy = computeAngularDifference(v0.y, v1.y);
		oz = computeAngularDifference(v0.z, v1.z);
		Vector3d result = new Vector3d(ox, oy, oz);
		return result;
	}

	/**
	 * 
	 * Returns the difference between two angles.
	 * 
	 * @param angle0
	 *            (in radians)
	 * @param angle1
	 *            (in radians)
	 * @return The difference (in radians), clamped to [-PI,PI].
	 */
	public static double computeAngularDifference(double angle0, double angle1) {
		double newAngle0 = normalizeAngle(angle0);
		double newAngle1 = normalizeAngle(angle1);
		return normalizeAngle(newAngle0 - newAngle1);
	}

	/**
	 * Takes an angle in radian and normalizes it in [-PI,PI]
	 * 
	 * @param angle
	 *            The angle to normalize, in radians.
	 * @return The normalize angle value, always between -PI and PI.
	 */
	public static double normalizeAngle(double angle) {
		double result = angle;

		// First clamps to -2*PI to 2*PI
		if ((angle > 2 * Math.PI) || (angle < -2 * Math.PI)) {
			result = Math.IEEEremainder(angle, 2 * Math.PI);
		}

		if (result > Math.PI) {
			result = result - (2 * Math.PI);
		} else if (result < -Math.PI) {
			result = result + (2 * Math.PI);
		}

		return result;
	}

	/**
	 * Takes an angle in radian and normalizes it in [0,2*PI]
	 * 
	 * @param angle
	 *            The angle to normalize, in radians.
	 * @return The normalized angle, always between 0 and 2*PI.
	 */
	public static double normalizeAngleToPositiveValue(double angle) {
		double result = 0.0;

		if ((angle >= 0) && (angle <= 2 * Math.PI)) {
			result = angle;
		} else if (angle > 2 * Math.PI) {
			result = Math.IEEEremainder(angle, 2 * Math.PI);
		} else if (angle < 0) {
			result = normalizeAngle(angle);
			if (result < 0) {
				result += 2 * Math.PI;
			}
		}

		return result;
	}

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>pointToTriangleDistance</dd>
	 * <dt>Description:</dt>
	 * <dd>Solution taken from Geometric Tools for Computer Graphics p. 380.</dd>
	 * <dt>Pre-condition:</dt>
	 * <dd>
	 * <ul>
	 * <li>Pre-condition 1</li>
	 * <li>Pre-condition 2</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-condition:</dt>
	 * <dd>
	 * <ul>
	 * <li>Post-condition 1</li>
	 * <li>Post-condition 2</li>
	 * </ul>
	 *</dd>
	 * </dl>
	 * 
	 * 
	 * 
	 * @param p
	 * @param v0
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static double pointToTriangleDistanceSquared(Point3d p, Point3d v0,
			Point3d v1, Point3d v2, Point3d q) {
		Vector3d kDiff = new Vector3d(v0);
		kDiff.sub(p);

		Vector3d kEdge0 = new Vector3d(v1);
		kEdge0.sub(v0);

		Vector3d kEdge1 = new Vector3d(v2);
		kEdge1.sub(v0);

		double fA00 = kEdge0.lengthSquared();
		double fA01 = kEdge0.dot(kEdge1);
		double fA11 = kEdge1.lengthSquared();
		double fB0 = kDiff.dot(kEdge0);
		double fB1 = kDiff.dot(kEdge1);
		double fC = kDiff.lengthSquared();
		double fDet = Math.abs(fA00 * fA11 - fA01 * fA01);
		double fS = fA01 * fB1 - fA11 * fB0;
		double fT = fA01 * fB0 - fA00 * fB1;
		double fSqrDistance;

		if (fS + fT <= fDet) {
			if (fS < 0.0) {
				if (fT < 0.0) // region 4
				{
					if (fB0 < 0.0) {
						fT = 0.0;
						if (-fB0 >= fA00) {
							fS = 1.0;
							fSqrDistance = fA00 + 2.0 * fB0 + fC;
						} else {
							fS = -fB0 / fA00;
							fSqrDistance = fB0 * fS + fC;
						}
					} else {
						fS = 0.0;
						if (fB1 >= 0.0) {
							fT = 0.0;
							fSqrDistance = fC;
						} else if (-fB1 >= fA11) {
							fT = 1.0;
							fSqrDistance = fA11 + 2.0 * fB1 + fC;
						} else {
							fT = -fB1 / fA11;
							fSqrDistance = fB1 * fT + fC;
						}
					}
				} else // region 3
				{
					fS = 0.0;
					if (fB1 >= 0.0) {
						fT = 0.0;
						fSqrDistance = fC;
					} else if (-fB1 >= fA11) {
						fT = 1.0;
						fSqrDistance = fA11 + 2.0 * fB1 + fC;
					} else {
						fT = -fB1 / fA11;
						fSqrDistance = fB1 * fT + fC;
					}
				}
			} else if (fT < 0.0) // region 5
			{
				fT = 0.0;
				if (fB0 >= 0.0) {
					fS = 0.0;
					fSqrDistance = fC;
				} else if (-fB0 >= fA00) {
					fS = 1.0;
					fSqrDistance = fA00 + 2.0 * fB0 + fC;
				} else {
					fS = -fB0 / fA00;
					fSqrDistance = fB0 * fS + fC;
				}
			} else // region 0
			{
				// minimum at interior point
				double fInvDet = 1.0 / fDet;
				fS *= fInvDet;
				fT *= fInvDet;
				fSqrDistance = fS * (fA00 * fS + fA01 * fT + 2.0 * fB0) + fT
						* (fA01 * fS + fA11 * fT + 2.0 * fB1) + fC;
			}
		} else {
			double fTmp0, fTmp1, fNumer, fDenom;

			if (fS < 0.0) // region 2
			{
				fTmp0 = fA01 + fB0;
				fTmp1 = fA11 + fB1;
				if (fTmp1 > fTmp0) {
					fNumer = fTmp1 - fTmp0;
					fDenom = fA00 - 2.0f * fA01 + fA11;
					if (fNumer >= fDenom) {
						fS = 1.0;
						fT = 0.0;
						fSqrDistance = fA00 + 2.0 * fB0 + fC;
					} else {
						fS = fNumer / fDenom;
						fT = 1.0 - fS;
						fSqrDistance = fS
								* (fA00 * fS + fA01 * fT + 2.0f * fB0) + fT
								* (fA01 * fS + fA11 * fT + 2.0 * fB1) + fC;
					}
				} else {
					fS = .0;
					if (fTmp1 <= 0.0) {
						fT = 1.0;
						fSqrDistance = fA11 + 2.0 * fB1 + fC;
					} else if (fB1 >= 0.0) {
						fT = 0.0;
						fSqrDistance = fC;
					} else {
						fT = -fB1 / fA11;
						fSqrDistance = fB1 * fT + fC;
					}
				}
			} else if (fT < 0.0) // region 6
			{
				fTmp0 = fA01 + fB1;
				fTmp1 = fA00 + fB0;
				if (fTmp1 > fTmp0) {
					fNumer = fTmp1 - fTmp0;
					fDenom = fA00 - 2.0 * fA01 + fA11;
					if (fNumer >= fDenom) {
						fT = 1.0;
						fS = 0.0;
						fSqrDistance = fA11 + 2.0 * fB1 + fC;
					} else {
						fT = fNumer / fDenom;
						fS = 1.0 - fT;
						fSqrDistance = fS
								* (fA00 * fS + fA01 * fT + (2.0) * fB0) + fT
								* (fA01 * fS + fA11 * fT + (2.0) * fB1) + fC;
					}
				} else {
					fT = 0.0;
					if (fTmp1 <= 0.0) {
						fS = 1.0;
						fSqrDistance = fA00 + (2.0) * fB0 + fC;
					} else if (fB0 >= 0.0) {
						fS = 0.0;
						fSqrDistance = fC;
					} else {
						fS = -fB0 / fA00;
						fSqrDistance = fB0 * fS + fC;
					}
				}
			} else // region 1
			{
				fNumer = fA11 + fB1 - fA01 - fB0;
				if (fNumer <= 0.0) {
					fS = 0.0;
					fT = 1.0;
					fSqrDistance = fA11 + (2.0) * fB1 + fC;
				} else {
					fDenom = fA00 - 2.0f * fA01 + fA11;
					if (fNumer >= fDenom) {
						fS = 1.0;
						fT = 0.0;
						fSqrDistance = fA00 + (2.0) * fB0 + fC;
					} else {
						fS = fNumer / fDenom;
						fT = 1.0 - fS;
						fSqrDistance = fS
								* (fA00 * fS + fA01 * fT + (2.0) * fB0) + fT
								* (fA01 * fS + fA11 * fT + (2.0) * fB1) + fC;
					}
				}
			}
		}

		// account for numerical round-off error
		if (fSqrDistance < 0.0) {
			fSqrDistance = 0.0;
		}

		Point3d B = new Point3d(v0);
		Vector3d ve0 = new Vector3d(kEdge0);
		Vector3d ve1 = new Vector3d(kEdge1);

		ve0.scale(fS);
		ve1.scale(fT);

		B.add(ve0);
		B.add(ve1);

		q.set(B);

		return fSqrDistance;

	}
}
