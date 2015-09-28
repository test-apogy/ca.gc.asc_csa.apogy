package ca.gc.asc_csa.io.pif;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.vecmath.Color3f;
import javax.vecmath.Color4b;
import javax.vecmath.Matrix4d;
import javax.vecmath.Point3f;

/*
 * Created on Jul 12, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author SGemme
 * 
 *         TODO To change the template for this generated type comment go to
 *         Window - Preferences - Java - Code Style - Code Templates
 */
@SuppressWarnings("restriction")
public class PifReader {

	// Point3f.
	private List<Point3f> points;

	private DataInputStream din = null;

	private PifHeader header = null;

	// Colors, 4 bytes. Class Color4b.
	private List<Color4b> colors = null;

	public PifReader(String fileName) throws IOException {

		FileInputStream fis = new FileInputStream(new File(fileName));
		BufferedInputStream is = new BufferedInputStream(fis);

		din = new DataInputStream(is);

		processData();

	}

	private void processData() throws IOException {
		readHeader();
		readPoints();
		readColors();
	}

	public PifReader(InputStream in) throws IOException {

		BufferedInputStream is = new BufferedInputStream(in);

		din = new DataInputStream(is);

		processData();
	}

	private void readColors() throws IOException {

		colors = new ArrayList<Color4b>(header.getArrayHeight()
				* header.getArrayWidth());

		System.out.println("Image flag: " + header.getImageColorFlag());

		// A color flag of 0 means there is no color information.
		if (header.getImageColorFlag() != 0) {

			// We read the colors.
			for (int i = 0; i < header.getArrayHeight()
					* header.getArrayWidth(); i++) {

				// We read the color.
				Color4b nextColor = null;

				byte r, g, b, a;

				r = g = b = a = 0;

				switch (header.getImageColorFlag()) {
				case 1:
					byte value = din.readByte();
					r = g = b = value;
					a = 1;
					break;
				case 3:
					r = din.readByte();
					g = din.readByte();
					b = din.readByte();
					a = 1;
					break;
				case 4:
					r = din.readByte();
					g = din.readByte();
					b = din.readByte();
					a = din.readByte();
					break;
				default:
					System.err.println("Invalid image color flag");
					break;

				}

				nextColor = new Color4b(r, g, b, a);

				colors.add(nextColor);

			}

		}

	}

	private void readHeader() throws IOException {

		header = new PifHeader();

		// We read all the fields.

		// Format version.
		byte[] buffer = new byte[PifHeader.FORMAT_VERSION_SIZE];
		din.readFully(buffer, 0, PifHeader.FORMAT_VERSION_SIZE);

		header.setFormatVersion(new String(buffer));

		// The user_comments.
		buffer = new byte[PifHeader.FORMAT_USER_COMMENTS_SIZE];
		din.readFully(buffer, 0, PifHeader.FORMAT_USER_COMMENTS_SIZE);

		header.setUserComments(new String(buffer));

		// The dummy1 field.
		buffer = new byte[PifHeader.DUMMY1_SIZE];

		din.readFully(buffer, 0, PifHeader.DUMMY1_SIZE);

		header.setDummy1(new String(buffer));

		// We get the image param flag.
		int imageParamFlag = din.readInt();

		header.setImageParamFlag(imageParamFlag);

		// We get the image data type.
		int imageDataType = din.readInt();

		header.setImageDataType(imageDataType);

		// We get the invalid point.
		float invalidPoint = din.readFloat();

		header.setInvalidPoint(invalidPoint);

		// Array width.
		int arrayWidth = din.readInt();

		header.setArrayWidth(arrayWidth);

		// Array height.
		int arrayHeight = din.readInt();

		header.setArrayHeight(arrayHeight);

		// Data block length.
		int dataBlockLength = din.readInt();

		header.setDataBlockLength(dataBlockLength);

		// Scale flag.
		int scaleFlag = din.readInt();

		header.setScaleFlag(scaleFlag);

		// scaling in i.
		float iScale = din.readFloat();

		header.setIScale(iScale);

		// scaling in i.
		float jScale = din.readFloat();

		header.setJScale(jScale);

		// transfoMatrixFlag
		int transfoMatrixFlag = din.readInt();

		header.setTransfoMatrixFlag(transfoMatrixFlag);

		// The transformation matrix.
		double[] transMatrixData = new double[16];

		for (int i = 0; i < transMatrixData.length; i++) {
			transMatrixData[i] = din.readDouble();
		}

		Matrix4d transMatrix = new Matrix4d(transMatrixData);

		header.setTransfoMatrix(transMatrix);

		// Image color flag.
		int imageColorFlag = din.readInt();

		header.setImageColorFlag(imageColorFlag);

		// Color block length.
		int colorBlockLength = din.readInt();

		header.setColorBlockLength(colorBlockLength);

		// Camera position flag.
		int cameraPositionFlag = din.readInt();

		header.setCameraPositionFlag(cameraPositionFlag);

		// Camera x,y and z.
		float cameraX = din.readFloat();

		header.setCameraX(cameraX);

		float cameraY = din.readFloat();

		header.setCameraY(cameraY);

		float cameraZ = din.readFloat();

		header.setCameraZ(cameraZ);

		// Dummy 2.
		int[] dummy2 = new int[PifHeader.DUMMY2_SIZE];

		for (int i = 0; i < PifHeader.DUMMY2_SIZE; i++) {
			dummy2[i] = din.readInt();
		}

		header.setDummy2(dummy2);

	}

	private void readPoints() throws IOException {
		points = new ArrayList<Point3f>(header.getArrayHeight()
				* header.getArrayWidth());

		// We read the points.
		if (header.getImageDataType() == 1) {

			float[] pointData = new float[3];

			for (int i = 0; i < header.getArrayHeight(); i++) {

				for (int j = 0; j < header.getArrayWidth(); j++) {

					for (int k = 0; k < 3; k++) {

						pointData[k] = din.readFloat();

					}

					points.add(new Point3f(pointData));

				}

			}

		} else {
			System.err.println("Only data type 1 is supported at this moment.");
		}

	}

	/**
	 * @return Returns the header.
	 */
	public PifHeader getHeader() {
		return header;
	}

	/**
	 * @return Returns the points.
	 */
	public List<Point3f> getPoints() {
		return points;
	}

	public List<Color4b> getColors() {
		return colors;
	}
}
