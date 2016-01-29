/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.asc.tests;

import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ApogyCommonGeometryData3DASCFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ASC3DIO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode) <em>Load Digital Elevation Map</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, double) <em>Load Digital Elevation Map</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D) <em>Load Digital Elevation Map</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, double) <em>Load Digital Elevation Map</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode) <em>Load Triangular Mesh</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, double) <em>Load Triangular Mesh</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D) <em>Load Triangular Mesh</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, double) <em>Load Triangular Mesh</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ASC3DIOTest extends TestCase {

	/**
	 * The fixture for this ASC3DIO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASC3DIO fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ASC3DIOTest.class);
	}

	/**
	 * Constructs a new ASC3DIO test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASC3DIOTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this ASC3DIO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ASC3DIO fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this ASC3DIO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASC3DIO getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApogyCommonGeometryData3DASCFactory.eINSTANCE.createASC3DIO());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode) <em>Load Digital Elevation Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode)
	 * @generated
	 */
	public void testLoadDigitalElevationMap__String_AltitudeMode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, double) <em>Load Digital Elevation Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, double)
	 * @generated
	 */
	public void testLoadDigitalElevationMap__String_AltitudeMode_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D) <em>Load Digital Elevation Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D)
	 * @generated
	 */
	public void testLoadDigitalElevationMap__String_AltitudeMode_Coordinates2D_Coordinates2D() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, double) <em>Load Digital Elevation Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, double)
	 * @generated
	 */
	public void testLoadDigitalElevationMap__String_AltitudeMode_Coordinates2D_Coordinates2D_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode) <em>Load Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode)
	 * @generated
	 */
	public void testLoadTriangularMesh__String_AltitudeMode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, double) <em>Load Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, double)
	 * @generated
	 */
	public void testLoadTriangularMesh__String_AltitudeMode_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D) <em>Load Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D)
	 * @generated
	 */
	public void testLoadTriangularMesh__String_AltitudeMode_Coordinates2D_Coordinates2D() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, double) <em>Load Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, double)
	 * @generated
	 */
	public void testLoadTriangularMesh__String_AltitudeMode_Coordinates2D_Coordinates2D_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ASC3DIOTest
