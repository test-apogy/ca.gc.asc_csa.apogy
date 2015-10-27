/**
 * Canadian Space Agency 2007.
 *
 * $Id: Data3DIOImpl.java,v 1.5.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.geometry.data3d.Data3DIO;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFacade;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;
import org.eclipse.symphony.common.geometry.data3d.NormalPointCloud;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data3 DIO</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class Data3DIOImpl extends MinimalEObjectImpl.Container implements Data3DIO {
	
	private static Data3DIO instance = null;
	
	public static Data3DIO getInstance()
	{
		if (instance == null)
		{
			instance = new Data3DIOImpl();
		}
		
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Data3DIOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonGeometryData3DPackage.Literals.DATA3_DIO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void saveTriangularMesh(CartesianTriangularMesh mesh, String file)
			throws IOException {

		saveTriangularMesh(mesh, new FileOutputStream(file));

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianTriangularMesh loadTriangularMesh(String file)
			throws IOException {
		return loadTriangularMesh(new FileInputStream(file));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void saveTriangularMesh(CartesianTriangularMesh mesh,
			OutputStream output) throws IOException {
		Resource resource = new XMIResourceImpl();

		resource.getContents().add(mesh);

		resource.save(output, Collections.EMPTY_MAP);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianTriangularMesh loadTriangularMesh(InputStream input)
			throws IOException {
		Resource resource = new XMIResourceImpl();

		resource.load(input, Collections.EMPTY_MAP);

		if (!(resource.getContents().get(0) instanceof CartesianTriangularMesh)) {
			throw new IOException("Object loaded, but content is invalid");
		}

		return (CartesianTriangularMesh) resource.getContents().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public NormalPointCloud loadTriangularMeshFromASCIIAsNormalPointCloud(
			String filePrefix) throws IOException {
		NormalPointCloud normalPointCloud = Symphony__CommonGeometryData3DFactory.eINSTANCE
				.createNormalPointCloud();

		List<Point3d> points = new ArrayList<Point3d>();
		List<Vector3d> normals = new ArrayList<Vector3d>();

		loadTriangularMeshFromASCII(filePrefix, points, normals, null, true);

		normalPointCloud.setPoints(points);
		normalPointCloud.setNormals(normals);

		return normalPointCloud;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianTriangularMesh loadTriangularMeshFromASCII(String filePrefix) throws IOException 
	{
		CartesianTriangularMesh mesh = Symphony__CommonGeometryData3DFactory.eINSTANCE
				.createCartesianTriangularMesh();

		List<Point3d> points = new ArrayList<Point3d>();
		List<IndexedTriangle> triangles = new ArrayList<IndexedTriangle>();

		List<Vector3d> normals = new ArrayList<Vector3d>();

		loadTriangularMeshFromASCII(filePrefix, points, normals, triangles,
				true);

		List<CartesianPositionCoordinates> coordinates = new ArrayList<CartesianPositionCoordinates>();
		List<CartesianTriangle> cartTriangles = new ArrayList<CartesianTriangle>();

		for (Point3d point : points) 
		{
			CartesianPositionCoordinates coord = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(point.x, point.y,point.z);
			coordinates.add(coord);
		}

		mesh.getPoints().addAll(coordinates);

		for (IndexedTriangle tri : triangles) 
		{
			CartesianPositionCoordinates v0 = mesh.getPoints().get(tri.getV0());
			CartesianPositionCoordinates v1 = mesh.getPoints().get(tri.getV1());
			CartesianPositionCoordinates v2 = mesh.getPoints().get(tri.getV2());

			CartesianTriangle triangle = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianTriangle(v0, v1, v2);

			cartTriangles.add(triangle);
		}

		mesh.getPolygons().addAll(cartTriangles);

		if (normals.size() > 0) {
			mesh.setNormals(normals);
		}

		return mesh;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void saveTriangularMeshAsASCII(CartesianTriangularMesh mesh,	String filePrefix) throws IOException 
	{
		// Opens the points file for output.
		File pointsFile = new File(filePrefix + ".xyz");
		StringBuffer pointDataBuffer = new StringBuffer();

		Vector3d normal = null;

		// Writes in the data.
		for (int i = 0; i < mesh.getPoints().size(); i++) {
			CartesianPositionCoordinates point = mesh.getPoints().get(i);

			if (mesh.getNormals() != null
					&& mesh.getNormals().size() == mesh.getPoints().size()) {
				normal = mesh.getNormals().get(i);
			} else {
				normal = null;
			}

			pointDataBuffer.append(point.getX() + " " + point.getY() + " "
					+ point.getZ());

			if (normal != null) {
				pointDataBuffer.append(" " + normal.getX() + " "
						+ normal.getY() + " " + normal.getZ());
			}

			pointDataBuffer.append("\n");
		}

		FileWriter pointsFileWriter = new FileWriter(pointsFile);
		pointsFileWriter.write(pointDataBuffer.toString());
		pointsFileWriter.flush();
		pointsFileWriter.close();

		// Creates the triangle file.
		File trianglesFile = new File(filePrefix + ".tri");
		StringBuffer triangleDataBuffer = new StringBuffer();

		// Creates a map of Points -> index. This is done to speed up the look
		// up of vertice index.
		int numberOfPoints = mesh.getPoints().size();
		Map<CartesianPositionCoordinates, Integer> pointToIndexMap = new HashMap<CartesianPositionCoordinates, Integer>(
				numberOfPoints);
		for (int index = 0; index < numberOfPoints; index++) {
			CartesianPositionCoordinates point = mesh.getPoints().get(index);
			pointToIndexMap.put(point, index + 1);
		}

		int numberOfTriangles = mesh.getPolygons().size();
		for (int i = 0; i < numberOfTriangles; i++) {
			CartesianTriangle triangle = mesh.getPolygons().get(i);

			// Extracts the index of the point for each of the vertices.
			int v1 = pointToIndexMap.get(triangle.getVertices().get(0));
			int v2 = pointToIndexMap.get(triangle.getVertices().get(1));
			int v3 = pointToIndexMap.get(triangle.getVertices().get(2));

			triangleDataBuffer.append(v1 + " " + v2 + " " + v3 + "\n");
		}

		FileWriter triangleFileWriter = new FileWriter(trianglesFile);
		triangleFileWriter.write(triangleDataBuffer.toString());
		triangleFileWriter.flush();
		triangleFileWriter.close();
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <pre>
	 * Loads a text, xyz file.
	 * </pre>
	 * 
	 * <!-- end-user-doc -->
	 * 
	 * @throws IOException
	 *             if an error occurred while accessing the file.
	 * @throws IllegalArgumentException
	 *             if the file format is incorrect.
	 * @generated_NOT
	 */
	public CartesianCoordinatesSet loadXYZ(String fileName) throws IOException {

		CartesianCoordinatesSet points = Symphony__CommonGeometryData3DFactory.eINSTANCE
				.createCartesianCoordinatesSet();

		// We load the file.
		FileInputStream fis = new FileInputStream(new File(fileName));

		Reader streamReader = new InputStreamReader(fis);

		BufferedReader fileReader = new BufferedReader(streamReader);

		boolean eof = false;

		// We keep track of the line number for information.
		int lineNumber = 1;

		try
		{
			while (!eof) {
				String line = fileReader.readLine();

				eof = line == null;

				if (!eof) {
					// We parse this line, it should have 3 columns or more, i.e.,
					// x,y,z.
					String[] cols = line.split("\\s+");

					if (cols.length < 3) {
						throw new IllegalArgumentException("File " + fileName + "("
								+ lineNumber + "): expected 3 columns, found "
								+ cols.length);
					}

					try {
						// We parse the colums into number.
						double x = Double.parseDouble(cols[0]);
						double y = Double.parseDouble(cols[1]);
						double z = Double.parseDouble(cols[2]);

						CartesianPositionCoordinates point = Symphony__CommonGeometryData3DFacade.INSTANCE
								.createCartesianPositionCoordinates(x, y, z);

						points.getPoints().add(point);

					} catch (NumberFormatException e) {
						throw new IllegalArgumentException("File " + fileName + "("
								+ lineNumber
								+ "): error while parsing numerical values: "
								+ e.getMessage());
					}
				}
				lineNumber++;
			}
		}
		finally
		{
			fileReader.close();
		}

		System.out.println("Data3DIOImpl.loadXYZ() loaded "
				+ points.getPoints().size() + " points");

		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianTriangularMesh loadTriangularMeshFromTriXYZ(String triFileName, String xyzFileName) throws IOException
	{
		CartesianTriangularMesh mesh = Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianTriangularMesh();

		List<Point3d> points = new ArrayList<Point3d>();
		List<IndexedTriangle> triangles = new ArrayList<IndexedTriangle>();

		List<Vector3d> normals = new ArrayList<Vector3d>();

		loadTriangularMeshFromASCII(triFileName, xyzFileName, points, normals, triangles, true);
		
		List<CartesianPositionCoordinates> coordinates = new ArrayList<CartesianPositionCoordinates>();
		List<CartesianTriangle> cartTriangles = new ArrayList<CartesianTriangle>();

		for (Point3d point : points) 
		{
			CartesianPositionCoordinates coord = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(point.x, point.y,point.z);
			coordinates.add(coord);
		}

		mesh.getPoints().addAll(coordinates);

		for (IndexedTriangle tri : triangles) 
		{
			CartesianPositionCoordinates v0 = mesh.getPoints().get(tri.getV0());
			CartesianPositionCoordinates v1 = mesh.getPoints().get(tri.getV1());
			CartesianPositionCoordinates v2 = mesh.getPoints().get(tri.getV2());

			CartesianTriangle triangle = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianTriangle(v0, v1, v2);

			cartTriangles.add(triangle);
		}

		mesh.getPolygons().addAll(cartTriangles);

		if (normals.size() > 0) {
			mesh.setNormals(normals);
		}

		return mesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void saveCoordinatesSetToCSV(CartesianCoordinatesSet coordinatesSet, OutputStream file) throws IOException 
	{
		// Opens file for output.
		final PrintStream printStream = new PrintStream(file);
		StringBuffer pointDataBuffer = new StringBuffer();

		Vector3d normal = null;
		
		// Writes in the data.
		for (int i = 0; i < coordinatesSet.getPoints().size(); i++) 
		{
			CartesianPositionCoordinates point = coordinatesSet.getPoints().get(i);

			if (coordinatesSet.getNormals() != null
					&& coordinatesSet.getNormals().size() == coordinatesSet.getPoints().size()) {
				normal = coordinatesSet.getNormals().get(i);
			} else {
				normal = null;
			}

			pointDataBuffer.append(point.getX() + "," + point.getY() + ","
					+ point.getZ());

			if (normal != null) {
				pointDataBuffer.append("," + normal.getX() + ","
						+ normal.getY() + "," + normal.getZ());
			}

			pointDataBuffer.append("\n");
		}
				
		printStream.print(pointDataBuffer.toString());			
		printStream.flush();
		printStream.close();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void saveCoordinatesSetToCSV(CartesianCoordinatesSet coordinatesSet, String file) throws IOException 
	{
		saveCoordinatesSetToCSV(coordinatesSet, new FileOutputStream(file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void saveCoordinatesSetToXYZ(CartesianCoordinatesSet coordinatesSet, String file) throws IOException 
	{
		saveCoordinatesSetToXYZ(coordinatesSet, new FileOutputStream(file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void saveCoordinatesSetToXYZ(CartesianCoordinatesSet coordinatesSet, OutputStream file) throws IOException 
	{		
		// Opens file for output.
		final PrintStream printStream = new PrintStream(file);
		StringBuffer pointDataBuffer = new StringBuffer();

		Vector3d normal = null;
		
		// Writes in the data.
		for (int i = 0; i < coordinatesSet.getPoints().size(); i++) 
		{
			CartesianPositionCoordinates point = coordinatesSet.getPoints().get(i);

			if (coordinatesSet.getNormals() != null
					&& coordinatesSet.getNormals().size() == coordinatesSet.getPoints().size()) {
				normal = coordinatesSet.getNormals().get(i);
			} else {
				normal = null;
			}

			pointDataBuffer.append(point.getX() + " " + point.getY() + " "
					+ point.getZ());

			if (normal != null) {
				pointDataBuffer.append(" " + normal.getX() + " "
						+ normal.getY() + " " + normal.getZ());
			}

			pointDataBuffer.append("\n");
		}
				
		printStream.print(pointDataBuffer.toString());			
		printStream.flush();
		printStream.close();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		try {
			switch (operationID) {

			case Symphony__CommonGeometryData3DPackage.DATA3_DIO___SAVE_TRIANGULAR_MESH__CARTESIANTRIANGULARMESH_STRING:
				saveTriangularMesh((CartesianTriangularMesh) arguments.get(0),
						(String) arguments.get(1));
				return null;
			case Symphony__CommonGeometryData3DPackage.DATA3_DIO___LOAD_TRIANGULAR_MESH__STRING:
				return loadTriangularMesh((String) arguments.get(0));
			case Symphony__CommonGeometryData3DPackage.DATA3_DIO___SAVE_TRIANGULAR_MESH__CARTESIANTRIANGULARMESH_OUTPUTSTREAM:
				saveTriangularMesh((CartesianTriangularMesh) arguments.get(0),
						(OutputStream) arguments.get(1));
				return null;
			case Symphony__CommonGeometryData3DPackage.DATA3_DIO___LOAD_TRIANGULAR_MESH__INPUTSTREAM:
				return loadTriangularMesh((InputStream) arguments.get(0));
			case Symphony__CommonGeometryData3DPackage.DATA3_DIO___LOAD_TRIANGULAR_MESH_FROM_ASCII_AS_NORMAL_POINT_CLOUD__STRING:
				return loadTriangularMeshFromASCIIAsNormalPointCloud((String) arguments
						.get(0));
			case Symphony__CommonGeometryData3DPackage.DATA3_DIO___LOAD_TRIANGULAR_MESH_FROM_ASCII__STRING:
				return loadTriangularMeshFromASCII((String) arguments.get(0));
			case Symphony__CommonGeometryData3DPackage.DATA3_DIO___SAVE_TRIANGULAR_MESH_AS_ASCII__CARTESIANTRIANGULARMESH_STRING:
				saveTriangularMeshAsASCII(
						(CartesianTriangularMesh) arguments.get(0),
						(String) arguments.get(1));
				return null;
			case Symphony__CommonGeometryData3DPackage.DATA3_DIO___LOAD_XYZ__STRING:
				return loadXYZ((String) arguments.get(0));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return super.eInvoke(operationID, arguments);
	}

	private class IndexedTriangle {

		private int v0;
		private int v1;
		private int v2;

		public IndexedTriangle(int v0, int v1, int v2) {
			this.v0 = v0;
			this.v1 = v1;
			this.v2 = v2;
		}

		public int getV0() {
			return v0;
		}

		public int getV1() {
			return v1;
		}

		public int getV2() {
			return v2;
		}
	}
	
	private void loadTriangularMeshFromASCII(String triFileName, String xyzFileName, List<Point3d> points, List<Vector3d> normals, List<IndexedTriangle> triangles, boolean loadNormals) throws IOException 
	{
		File pointsFile = new File(xyzFileName);
		File trianglesFile = new File(triFileName);
		
		// The points streams.
		FileInputStream pointsIS = new FileInputStream(pointsFile);
		BufferedReader pointsReader = new BufferedReader(new InputStreamReader(
				pointsIS));

		boolean loadTriangles = trianglesFile.exists();

		// We read the points and the normals.
		// first three numbers are coordinates and 4 to 6 are normal components.
		int lineNumber = 1;
		double[] xyz = new double[3];
		double[] normal = new double[3];
		boolean eof = false;
		
		try {
			while (!eof) {
				String line = pointsReader.readLine();

				eof = line == null;

				if (!eof) {

					String[] coords = line.split("\\s+");

					if (!(coords.length == 3 || coords.length == 6)) {
						throw new IllegalArgumentException(
								"Illegal file format at " + pointsFile.getName()
										+ "(" + lineNumber + ")");
					}

					// Loads the points.
					for (int i = 0; i < 3; i++) {
						try {
							xyz[i] = Double.parseDouble(coords[i]);
						} catch (NumberFormatException e) {
							throw new IllegalArgumentException(
									"Illegal file format at "
											+ pointsFile.getName() + "("
											+ lineNumber + ")");
						}
					}

					// Loads the normals.
					if (loadNormals && coords.length == 6) {
						for (int i = 0; i < 3; i++) {
							try {
								normal[i] = Double.parseDouble(coords[i + 3]);
							} catch (NumberFormatException e) {
								throw new IllegalArgumentException(
										"Illegal file format at "
												+ pointsFile.getName() + "("
												+ lineNumber + ")");
							}
						}
					}

					if (points != null) {
						points.add(new Point3d(xyz));
					}

					if (normals != null && coords.length == 6) {
						Vector3d n = new Vector3d(normal);
						// We make sure the normal is unit length.
						n.normalize();
						normals.add(n);
					}

					lineNumber++;
				}
			}
		}
		finally
		{
			pointsReader.close();
		}

		if (triangles != null && loadTriangles) {
			// We process the triangles.
			lineNumber = 1;
			int[] triangle = new int[3];
			eof = false;

			// The triangles streams.
			FileInputStream trianglesIS = new FileInputStream(trianglesFile);
			BufferedReader trianglesReader = new BufferedReader(
					new InputStreamReader(trianglesIS));

			try {
				while (!eof) {
					String line = trianglesReader.readLine();

					eof = line == null;

					if (!eof) {

						String[] coords = line.split("\\s+");

						// There must be 3 coordinates in the line.
						if (coords.length != 3) {
							throw new IllegalArgumentException(
									"Illegal file format at "
											+ trianglesFile.getName() + "("
											+ lineNumber + ")");
						}

						for (int i = 0; i < coords.length; i++) {
							try {
								triangle[i] = Integer.parseInt(coords[i]);
								// This format comes from matlab, index starts at 1
								// in
								// matlab whereas
								// index starts at 0 in java, therefore, we
								// substract 1
								// to
								// the index.
								triangle[i]--;

								// If the index is less than 0 or index is greater
								// or
								// equal
								// to the number of point, that is not valid.
								if (triangle[i] < 0 || triangle[i] >= points.size()) {
									throw new IllegalArgumentException("Index " + i
											+ " is invalid at "
											+ pointsFile.getName() + "("
											+ lineNumber + "): " + triangle[i]
											+ "/" + points.size());
								}
							} catch (NumberFormatException e) {
								throw new IllegalArgumentException(
										"Illegal file format at "
												+ pointsFile.getName() + "("
												+ lineNumber + "): coordinate ["
												+ coords[i]
												+ "] is not an integer.");
							}
						}
						IndexedTriangle indexedTriangle = new IndexedTriangle(
								triangle[0], triangle[1], triangle[2]);

						triangles.add(indexedTriangle);
					}

				}
			}
			finally
			{
				trianglesReader.close();
			}
		}
	}

	private void loadTriangularMeshFromASCII(String filePrefix,
			List<Point3d> points, List<Vector3d> normals,
			List<IndexedTriangle> triangles, boolean loadNormals)
			throws IOException {

		File pointsFile = new File(filePrefix + ".xyz");
		File trianglesFile = new File(filePrefix + ".tri");

		// The points streams.
		FileInputStream pointsIS = new FileInputStream(pointsFile);
		BufferedReader pointsReader = new BufferedReader(new InputStreamReader(
				pointsIS));

		boolean loadTriangles = trianglesFile.exists();

		// We read the points and the normals.
		// first three numbers are coordinates and 4 to 6 are normal components.
		int lineNumber = 1;
		double[] xyz = new double[3];
		double[] normal = new double[3];
		boolean eof = false;
		
		try {
			while (!eof) {
				String line = pointsReader.readLine();

				eof = line == null;

				if (!eof) {

					String[] coords = line.split("\\s+");

					if (!(coords.length == 3 || coords.length == 6)) {
						throw new IllegalArgumentException(
								"Illegal file format at " + pointsFile.getName()
										+ "(" + lineNumber + ")");
					}

					// Loads the points.
					for (int i = 0; i < 3; i++) {
						try {
							xyz[i] = Double.parseDouble(coords[i]);
						} catch (NumberFormatException e) {
							throw new IllegalArgumentException(
									"Illegal file format at "
											+ pointsFile.getName() + "("
											+ lineNumber + ")");
						}
					}

					// Loads the normals.
					if (loadNormals && coords.length == 6) {
						for (int i = 0; i < 3; i++) {
							try {
								normal[i] = Double.parseDouble(coords[i + 3]);
							} catch (NumberFormatException e) {
								throw new IllegalArgumentException(
										"Illegal file format at "
												+ pointsFile.getName() + "("
												+ lineNumber + ")");
							}
						}
					}

					if (points != null) {
						points.add(new Point3d(xyz));
					}

					if (normals != null && coords.length == 6) {
						Vector3d n = new Vector3d(normal);
						// We make sure the normal is unit length.
						n.normalize();
						normals.add(n);
					}

					lineNumber++;
				}
			}
		}
		finally
		{
			pointsReader.close();
		}

		if (triangles != null && loadTriangles) {
			// We process the triangles.
			lineNumber = 1;
			int[] triangle = new int[3];
			eof = false;

			// The triangles streams.
			FileInputStream trianglesIS = new FileInputStream(trianglesFile);
			BufferedReader trianglesReader = new BufferedReader(
					new InputStreamReader(trianglesIS));

			try {
				while (!eof) {
					String line = trianglesReader.readLine();

					eof = line == null;

					if (!eof) {

						String[] coords = line.split("\\s+");

						// There must be 3 coordinates in the line.
						if (coords.length != 3) {
							throw new IllegalArgumentException(
									"Illegal file format at "
											+ trianglesFile.getName() + "("
											+ lineNumber + ")");
						}

						for (int i = 0; i < coords.length; i++) {
							try {
								triangle[i] = Integer.parseInt(coords[i]);
								// This format comes from matlab, index starts at 1
								// in
								// matlab whereas
								// index starts at 0 in java, therefore, we
								// substract 1
								// to
								// the index.
								triangle[i]--;

								// If the index is less than 0 or index is greater
								// or
								// equal
								// to the number of point, that is not valid.
								if (triangle[i] < 0 || triangle[i] >= points.size()) {
									throw new IllegalArgumentException("Index " + i
											+ " is invalid at "
											+ pointsFile.getName() + "("
											+ lineNumber + "): " + triangle[i]
											+ "/" + points.size());
								}
							} catch (NumberFormatException e) {
								throw new IllegalArgumentException(
										"Illegal file format at "
												+ pointsFile.getName() + "("
												+ lineNumber + "): coordinate ["
												+ coords[i]
												+ "] is not an integer.");
							}
						}
						IndexedTriangle indexedTriangle = new IndexedTriangle(
								triangle[0], triangle[1], triangle[2]);

						triangles.add(indexedTriangle);
					}

				}
			}
			finally
			{
				trianglesReader.close();
			}
		}
	}
} // Data3DIOImpl
