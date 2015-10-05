/**
 */
package org.eclipse.symphony.common.math.impl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.symphony.common.math.MathFactory;
import org.eclipse.symphony.common.math.MathIO;
import org.eclipse.symphony.common.math.MathPackage;
import org.eclipse.symphony.common.math.Matrix4x4;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>IO</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MathIOImpl extends EObjectImpl implements MathIO {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MathIOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MathPackage.Literals.MATH_IO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Matrix4x4 readTrMatrix(String fileName) throws IOException {

		if (fileName == null) {
			throw new IllegalArgumentException("fileName is null");
		}

		FileInputStream fis = new FileInputStream(fileName);

		BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

		boolean eof = false;

		int lineNumber = 0;
		Matrix4d mat = new Matrix4d();

		while (!eof) {
			String line = reader.readLine();
			eof = line == null;
			int elt = 0;
			if (!eof) {
				String[] lineValues = line.split("\\s+");
				for (int i = 0; i < lineValues.length; i++) {
					if (!lineValues[i].isEmpty()) {
						double value = Double.parseDouble(lineValues[i]
								.replace(",", ""));
						mat.setElement(lineNumber, elt, value);
						elt++;
					}
				}
			}
			lineNumber++;
		}

		Matrix4x4 trMat = MathFactory.eINSTANCE.createMatrix4x4();

		trMat.setM00(mat.m00);
		trMat.setM01(mat.m01);
		trMat.setM02(mat.m02);
		trMat.setM03(mat.m03);

		trMat.setM10(mat.m10);
		trMat.setM11(mat.m11);
		trMat.setM12(mat.m12);
		trMat.setM13(mat.m13);

		trMat.setM20(mat.m20);
		trMat.setM21(mat.m21);
		trMat.setM22(mat.m22);
		trMat.setM23(mat.m23);

		trMat.setM30(mat.m30);
		trMat.setM31(mat.m31);
		trMat.setM32(mat.m32);
		trMat.setM33(mat.m33);

		reader.close();

		return trMat;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void writeTrMatrix(Matrix4x4 trMatrix, String fileName)
			throws IOException {

		writeTrMatrix(trMatrix.asMatrix4d(), fileName);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void writeTrMatrix(Matrix4d trMatrix, String fileName)
			throws IOException {
		if (trMatrix == null || fileName == null) {
			throw new IllegalArgumentException();
		}

		FileOutputStream fos = new FileOutputStream(fileName);
		PrintWriter writer = new PrintWriter(fos);

		double[] rowData = new double[4];

		for (int i = 0; i < 4; i++) {
			trMatrix.getRow(i, rowData);

			writer.print(rowData[0] + ", " + rowData[1] + ", " + rowData[2]
					+ ", " + rowData[3]);

			// If this is not the last row, we print a new line.
			if (i != 3) {
				writer.println();
			}
		}

		writer.close();
	}

} // MathIOImpl
