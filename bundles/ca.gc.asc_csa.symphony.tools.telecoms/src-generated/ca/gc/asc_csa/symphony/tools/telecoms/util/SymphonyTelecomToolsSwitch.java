/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.telecoms.util;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import ca.gc.asc_csa.symphony.tools.core.AbstractTool;
import ca.gc.asc_csa.symphony.tools.core.SimpleTool;
import ca.gc.asc_csa.symphony.tools.telecoms.*;
import ca.gc.space.topology.Node;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.core.environment.AbstractMapLayer;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshDerivedImageMapLayer;
import org.eclipse.symphony.core.environment.ImageMapLayer;
import org.eclipse.symphony.core.environment.LineOfSightImageMapLayer;
import org.eclipse.symphony.core.environment.RectangularRegionImage;
import org.eclipse.symphony.core.environment.RectangularRegionProvider;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.symphony.tools.telecoms.SymphonyTelecomToolsPackage
 * @generated
 */
public class SymphonyTelecomToolsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SymphonyTelecomToolsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyTelecomToolsSwitch() {
		if (modelPackage == null) {
			modelPackage = SymphonyTelecomToolsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SymphonyTelecomToolsPackage.TELECOM_NODE: {
				TelecomNode telecomNode = (TelecomNode)theEObject;
				T result = caseTelecomNode(telecomNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL: {
				TelecomStatusMonitorTool telecomStatusMonitorTool = (TelecomStatusMonitorTool)theEObject;
				T result = caseTelecomStatusMonitorTool(telecomStatusMonitorTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL_LIST: {
				TelecomStatusMonitorToolList telecomStatusMonitorToolList = (TelecomStatusMonitorToolList)theEObject;
				T result = caseTelecomStatusMonitorToolList(telecomStatusMonitorToolList);
				if (result == null) result = caseSimpleTool(telecomStatusMonitorToolList);
				if (result == null) result = caseAbstractTool(telecomStatusMonitorToolList);
				if (result == null) result = caseNamed(telecomStatusMonitorToolList);
				if (result == null) result = caseDescribed(telecomStatusMonitorToolList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyTelecomToolsPackage.ABSTRACT_ANTENNA_RADIATION_PATTERN: {
				AbstractAntennaRadiationPattern abstractAntennaRadiationPattern = (AbstractAntennaRadiationPattern)theEObject;
				T result = caseAbstractAntennaRadiationPattern(abstractAntennaRadiationPattern);
				if (result == null) result = caseNode(abstractAntennaRadiationPattern);
				if (result == null) result = caseNamed(abstractAntennaRadiationPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyTelecomToolsPackage.ISOTROPIC_ANTENNA: {
				IsotropicAntenna isotropicAntenna = (IsotropicAntenna)theEObject;
				T result = caseIsotropicAntenna(isotropicAntenna);
				if (result == null) result = caseAbstractAntennaRadiationPattern(isotropicAntenna);
				if (result == null) result = caseNode(isotropicAntenna);
				if (result == null) result = caseNamed(isotropicAntenna);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyTelecomToolsPackage.DIPOLE_ANTENNA_RADIATION_PATTERN: {
				DipoleAntennaRadiationPattern dipoleAntennaRadiationPattern = (DipoleAntennaRadiationPattern)theEObject;
				T result = caseDipoleAntennaRadiationPattern(dipoleAntennaRadiationPattern);
				if (result == null) result = caseAbstractAntennaRadiationPattern(dipoleAntennaRadiationPattern);
				if (result == null) result = caseNode(dipoleAntennaRadiationPattern);
				if (result == null) result = caseNamed(dipoleAntennaRadiationPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyTelecomToolsPackage.HALF_WAVE_DIPOLE_ANTENNA_RADIATION_PATTERN: {
				HalfWaveDipoleAntennaRadiationPattern halfWaveDipoleAntennaRadiationPattern = (HalfWaveDipoleAntennaRadiationPattern)theEObject;
				T result = caseHalfWaveDipoleAntennaRadiationPattern(halfWaveDipoleAntennaRadiationPattern);
				if (result == null) result = caseAbstractAntennaRadiationPattern(halfWaveDipoleAntennaRadiationPattern);
				if (result == null) result = caseNode(halfWaveDipoleAntennaRadiationPattern);
				if (result == null) result = caseNamed(halfWaveDipoleAntennaRadiationPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyTelecomToolsPackage.SIMPLE_CONICAL_RADIATION_PATTERN: {
				SimpleConicalRadiationPattern simpleConicalRadiationPattern = (SimpleConicalRadiationPattern)theEObject;
				T result = caseSimpleConicalRadiationPattern(simpleConicalRadiationPattern);
				if (result == null) result = caseAbstractAntennaRadiationPattern(simpleConicalRadiationPattern);
				if (result == null) result = caseNode(simpleConicalRadiationPattern);
				if (result == null) result = caseNamed(simpleConicalRadiationPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyTelecomToolsPackage.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN: {
				SimpleRectangularFrustumRadiationPattern simpleRectangularFrustumRadiationPattern = (SimpleRectangularFrustumRadiationPattern)theEObject;
				T result = caseSimpleRectangularFrustumRadiationPattern(simpleRectangularFrustumRadiationPattern);
				if (result == null) result = caseAbstractAntennaRadiationPattern(simpleRectangularFrustumRadiationPattern);
				if (result == null) result = caseNode(simpleRectangularFrustumRadiationPattern);
				if (result == null) result = caseNamed(simpleRectangularFrustumRadiationPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyTelecomToolsPackage.URL_BASED_ANTENNA_RADIATION_PATTERN: {
				URlBasedAntennaRadiationPattern uRlBasedAntennaRadiationPattern = (URlBasedAntennaRadiationPattern)theEObject;
				T result = caseURlBasedAntennaRadiationPattern(uRlBasedAntennaRadiationPattern);
				if (result == null) result = caseAbstractAntennaRadiationPattern(uRlBasedAntennaRadiationPattern);
				if (result == null) result = caseNode(uRlBasedAntennaRadiationPattern);
				if (result == null) result = caseNamed(uRlBasedAntennaRadiationPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyTelecomToolsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER: {
				AntennaRadiationPatternImageMapLayer antennaRadiationPatternImageMapLayer = (AntennaRadiationPatternImageMapLayer)theEObject;
				T result = caseAntennaRadiationPatternImageMapLayer(antennaRadiationPatternImageMapLayer);
				if (result == null) result = caseLineOfSightImageMapLayer(antennaRadiationPatternImageMapLayer);
				if (result == null) result = caseCartesianTriangularMeshDerivedImageMapLayer(antennaRadiationPatternImageMapLayer);
				if (result == null) result = caseImageMapLayer(antennaRadiationPatternImageMapLayer);
				if (result == null) result = caseAbstractMapLayer(antennaRadiationPatternImageMapLayer);
				if (result == null) result = caseRectangularRegionImage(antennaRadiationPatternImageMapLayer);
				if (result == null) result = caseNamed(antennaRadiationPatternImageMapLayer);
				if (result == null) result = caseDescribed(antennaRadiationPatternImageMapLayer);
				if (result == null) result = caseRectangularRegionProvider(antennaRadiationPatternImageMapLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telecom Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telecom Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelecomNode(TelecomNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telecom Status Monitor Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telecom Status Monitor Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelecomStatusMonitorTool(TelecomStatusMonitorTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telecom Status Monitor Tool List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telecom Status Monitor Tool List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelecomStatusMonitorToolList(TelecomStatusMonitorToolList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Antenna Radiation Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Antenna Radiation Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAntennaRadiationPattern(AbstractAntennaRadiationPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Isotropic Antenna</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Isotropic Antenna</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsotropicAntenna(IsotropicAntenna object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dipole Antenna Radiation Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dipole Antenna Radiation Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDipoleAntennaRadiationPattern(DipoleAntennaRadiationPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Half Wave Dipole Antenna Radiation Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Half Wave Dipole Antenna Radiation Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHalfWaveDipoleAntennaRadiationPattern(HalfWaveDipoleAntennaRadiationPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Conical Radiation Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Conical Radiation Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleConicalRadiationPattern(SimpleConicalRadiationPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Rectangular Frustum Radiation Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Rectangular Frustum Radiation Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleRectangularFrustumRadiationPattern(SimpleRectangularFrustumRadiationPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URl Based Antenna Radiation Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URl Based Antenna Radiation Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURlBasedAntennaRadiationPattern(URlBasedAntennaRadiationPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antenna Radiation Pattern Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antenna Radiation Pattern Image Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntennaRadiationPatternImageMapLayer(AntennaRadiationPatternImageMapLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamed(Named object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Described</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribed(Described object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTool(AbstractTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTool(SimpleTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMapLayer(AbstractMapLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangular Region Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangular Region Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangularRegionProvider(RectangularRegionProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangular Region Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangular Region Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangularRegionImage(RectangularRegionImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageMapLayer(ImageMapLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh Derived Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh Derived Image Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCartesianTriangularMeshDerivedImageMapLayer(CartesianTriangularMeshDerivedImageMapLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Of Sight Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Of Sight Image Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineOfSightImageMapLayer(LineOfSightImageMapLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SymphonyTelecomToolsSwitch
