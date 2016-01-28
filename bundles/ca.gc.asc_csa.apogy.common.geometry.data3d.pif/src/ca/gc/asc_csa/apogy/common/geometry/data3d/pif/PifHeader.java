package ca.gc.asc_csa.apogy.common.geometry.data3d.pif;

import javax.vecmath.Matrix4d;

/*
 * Created on Jul 13, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * Header of the pif file as described by innovmetric.
 */
public class PifHeader {

	// The header size in bytes.
	public static final int HEADER_SIZE = 512;

	public static final int FORMAT_VERSION_SIZE = 64;

	public static final int FORMAT_USER_COMMENTS_SIZE = 128;

	public static final int DUMMY1_SIZE = 8;

	public static final int DUMMY2_SIZE = 30;

	// Size 64.
	private String formatVersion;

	// Size 128.
	private String userComments;

	// Size 8.
	private String dummy1;

	// Size 4.
	private int imageParamFlag;

	// Size 4.
	private int imageDataType;

	// Size 4.
	private float invalidPoint;

	// Size 4.
	private int arrayWidth;

	// Size 4.
	private int arrayHeight;

	// Size 4.
	private int dataBlockLength;

	// Size 4.
	private int scaleFlag;

	// Size 4.
	private float iScale;

	// Size 4.
	private float jScale;

	// Size 4.
	private int transfoMatrixFlag;

	// Size 8 x 16 = 128.
	private Matrix4d transfoMatrix;

	// Size 4.
	private int imageColorFlag;

	// Size 4.
	private int colorBlockLength;

	// Size 4.
	private int cameraPositionFlag;

	// Size 4.
	private float cameraX;

	// Size 4.
	private float cameraY;

	// Size 4.
	private float cameraZ;

	// Size 4 x 30 = 120.
	private int[] dummy2 = new int[30];

	/**
	 * @return Returns the arrayHeight.
	 */
	public int getArrayHeight() {
		return arrayHeight;
	}

	/**
	 * @param arrayHeight
	 *            The arrayHeight to set.
	 */
	public void setArrayHeight(int arrayHeight) {
		this.arrayHeight = arrayHeight;
	}

	/**
	 * @return Returns the arrayWidt.
	 */
	public int getArrayWidth() {
		return arrayWidth;
	}

	/**
	 * @param arrayWidt
	 *            The arrayWidt to set.
	 */
	public void setArrayWidth(int arrayWidt) {
		this.arrayWidth = arrayWidt;
	}

	/**
	 * @return Returns the cameraPositionFlag.
	 */
	public int getCameraPositionFlag() {
		return cameraPositionFlag;
	}

	/**
	 * @param cameraPositionFlag
	 *            The cameraPositionFlag to set.
	 */
	public void setCameraPositionFlag(int cameraPositionFlag) {
		this.cameraPositionFlag = cameraPositionFlag;
	}

	/**
	 * @return Returns the cameraX.
	 */
	public float getCameraX() {
		return cameraX;
	}

	/**
	 * @param cameraX
	 *            The cameraX to set.
	 */
	public void setCameraX(float cameraX) {
		this.cameraX = cameraX;
	}

	/**
	 * @return Returns the cameraY.
	 */
	public float getCameraY() {
		return cameraY;
	}

	/**
	 * @param cameraY
	 *            The cameraY to set.
	 */
	public void setCameraY(float cameraY) {
		this.cameraY = cameraY;
	}

	/**
	 * @return Returns the cameraZ.
	 */
	public float getCameraZ() {
		return cameraZ;
	}

	/**
	 * @param cameraZ
	 *            The cameraZ to set.
	 */
	public void setCameraZ(float cameraZ) {
		this.cameraZ = cameraZ;
	}

	/**
	 * @return Returns the colorBlockLength.
	 */
	public int getColorBlockLength() {
		return colorBlockLength;
	}

	/**
	 * @param colorBlockLength
	 *            The colorBlockLength to set.
	 */
	public void setColorBlockLength(int colorBlockLength) {
		this.colorBlockLength = colorBlockLength;
	}

	/**
	 * @return Returns the dataBlockLength.
	 */
	public int getDataBlockLength() {
		return dataBlockLength;
	}

	/**
	 * @param dataBlockLength
	 *            The dataBlockLength to set.
	 */
	public void setDataBlockLength(int dataBlockLength) {
		this.dataBlockLength = dataBlockLength;
	}

	/**
	 * @return Returns the dummy1.
	 */
	public String getDummy1() {
		return dummy1;
	}

	/**
	 * @param dummy1
	 *            The dummy1 to set.
	 */
	public void setDummy1(String dummy1) {
		this.dummy1 = dummy1;
	}

	/**
	 * @return Returns the dummy2.
	 */
	public int[] getDummy2() {
		return dummy2;
	}

	/**
	 * @param dummy2
	 *            The dummy2 to set.
	 */
	public void setDummy2(int[] dummy2) {
		this.dummy2 = dummy2;
	}

	/**
	 * @return Returns the formatVersion.
	 */
	public String getFormatVersion() {
		return formatVersion;
	}

	/**
	 * @param formatVersion
	 *            The formatVersion to set.
	 */
	public void setFormatVersion(String formatVersion) {
		this.formatVersion = formatVersion;
	}

	/**
	 * @return Returns the imageColorFlag.
	 */
	public int getImageColorFlag() {
		return imageColorFlag;
	}

	/**
	 * @param imageColorFlag
	 *            The imageColorFlag to set.
	 */
	public void setImageColorFlag(int imageColorFlag) {
		this.imageColorFlag = imageColorFlag;
	}

	/**
	 * @return Returns the imageDataType.
	 */
	public int getImageDataType() {
		return imageDataType;
	}

	/**
	 * @param imageDataType
	 *            The imageDataType to set.
	 */
	public void setImageDataType(int imageDataType) {
		this.imageDataType = imageDataType;
	}

	/**
	 * @return Returns the imageParamFlag.
	 */
	public int getImageParamFlag() {
		return imageParamFlag;
	}

	/**
	 * @param imageParamFlag
	 *            The imageParamFlag to set.
	 */
	public void setImageParamFlag(int imageParamFlag) {
		this.imageParamFlag = imageParamFlag;
	}

	/**
	 * @return Returns the invalidPoint.
	 */
	public float getInvalidPoint() {
		return invalidPoint;
	}

	/**
	 * @param invalidPoint
	 *            The invalidPoint to set.
	 */
	public void setInvalidPoint(float invalidPoint) {
		this.invalidPoint = invalidPoint;
	}

	/**
	 * @return Returns the iScale.
	 */
	public float getIScale() {
		return iScale;
	}

	/**
	 * @param scale
	 *            The iScale to set.
	 */
	public void setIScale(float scale) {
		iScale = scale;
	}

	/**
	 * @return Returns the jScale.
	 */
	public float getJScale() {
		return jScale;
	}

	/**
	 * @param scale
	 *            The jScale to set.
	 */
	public void setJScale(float scale) {
		jScale = scale;
	}

	/**
	 * @return Returns the scaleFlag.
	 */
	public int getScaleFlag() {
		return scaleFlag;
	}

	/**
	 * @param scaleFlag
	 *            The scaleFlag to set.
	 */
	public void setScaleFlag(int scaleFlag) {
		this.scaleFlag = scaleFlag;
	}

	/**
	 * @return Returns the transfoMatrix.
	 */
	public Matrix4d getTransfoMatrix() {
		return transfoMatrix;
	}

	/**
	 * @param transfoMatrix
	 *            The transfoMatrix to set.
	 */
	public void setTransfoMatrix(Matrix4d transfoMatrix) {
		this.transfoMatrix = transfoMatrix;
	}

	/**
	 * @return Returns the transfoMatrixFlag.
	 */
	public int getTransfoMatrixFlag() {
		return transfoMatrixFlag;
	}

	/**
	 * @param transfoMatrixFlag
	 *            The transfoMatrixFlag to set.
	 */
	public void setTransfoMatrixFlag(int transfoMatrixFlag) {
		this.transfoMatrixFlag = transfoMatrixFlag;
	}

	/**
	 * @return Returns the userComments.
	 */
	public String getUserComments() {
		return userComments;
	}

	/**
	 * @param userComments
	 *            The userComments to set.
	 */
	public void setUserComments(String userComments) {
		this.userComments = userComments;
	}
}
