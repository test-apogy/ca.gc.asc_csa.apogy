/**
 * Canadian Space Agency 2007.
 */
package org.eclipse.symphony.common.geometry.data25d.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.geometry.data25d.Coordinates25D;
import org.eclipse.symphony.common.geometry.data25d.Data25DIO;
import org.eclipse.symphony.common.geometry.data25d.Data25dFactory;
import org.eclipse.symphony.common.geometry.data25d.Data25dPackage;
import org.eclipse.symphony.common.geometry.data25d.DataFacade;
import org.eclipse.symphony.common.geometry.data25d.VolumetricCoordinatesSet25D;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data25 DIO</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class Data25DIOImpl extends MinimalEObjectImpl.Container implements Data25DIO {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Data25DIOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data25dPackage.Literals.DATA25_DIO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void saveXYZ(VolumetricCoordinatesSet25D points, String fileName)
			throws IOException {

		if (points == null) {
			throw new IllegalArgumentException();
		}

		if (points.getPoints() == null) {
			throw new IllegalArgumentException();
		}

		if (fileName == null) {
			throw new IllegalArgumentException();
		}

		PrintWriter writer = new PrintWriter(fileName);

		int nPts = points.getPoints().size();
		int i = 0;
		for (Coordinates25D point : points.getPoints()) {
			String str = point.getU() + " " + point.getV() + " " + point.getW();
			if (i != nPts - 1) {
				writer.println(str);
			} else {
				writer.print(str);
			}
			i++;
		}

		writer.close();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public VolumetricCoordinatesSet25D loadXYZ(String fileName)
			throws IOException {
		VolumetricCoordinatesSet25D data = Data25dFactory.eINSTANCE
				.createVolumetricCoordinatesSet25D();
		// Disable point uniqueness for performance reasons.
		data.setEnforceUniqueness(false);

		// We load the file.
		FileInputStream fis = new FileInputStream(new File(fileName));

		Reader streamReader = new InputStreamReader(fis);

		BufferedReader fileReader = new BufferedReader(streamReader);

		boolean eof = false;

		// We keep track of the line number for information.
		int lineNumber = 1;

		try {
			while (!eof) {
				String line = fileReader.readLine();

				eof = line == null;

				if (!eof) {
					// We parse this line, it should have 3 columns, i.e., x,y,z.
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

						Coordinates25D point = DataFacade.INSTANCE
								.createCoordinates25D(x, y, z);

						data.getPoints().add(point);

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

		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Data25dPackage.DATA25_DIO___SAVE_XYZ__VOLUMETRICCOORDINATESSET25D_STRING:
				try {
					saveXYZ((VolumetricCoordinatesSet25D)arguments.get(0), (String)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Data25dPackage.DATA25_DIO___LOAD_XYZ__STRING:
				try {
					return loadXYZ((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}
} // Data25DIOImpl
