/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.telecoms.util;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.AbstractTool;
import org.eclipse.symphony.addons.SimpleTool;
import org.eclipse.symphony.addons.telecoms.*;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.core.environment.AbstractMapLayer;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshDerivedImageMapLayer;
import org.eclipse.symphony.core.environment.ImageMapLayer;
import org.eclipse.symphony.core.environment.LineOfSightImageMapLayer;
import org.eclipse.symphony.core.environment.RectangularRegionImage;
import org.eclipse.symphony.core.environment.RectangularRegionProvider;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.telecoms.SymphonyTelecomToolsPackage
 * @generated
 */
public class SymphonyTelecomToolsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SymphonyTelecomToolsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyTelecomToolsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SymphonyTelecomToolsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymphonyTelecomToolsSwitch<Adapter> modelSwitch =
		new SymphonyTelecomToolsSwitch<Adapter>() {
			@Override
			public Adapter caseTelecomNode(TelecomNode object) {
				return createTelecomNodeAdapter();
			}
			@Override
			public Adapter caseTelecomStatusMonitorTool(TelecomStatusMonitorTool object) {
				return createTelecomStatusMonitorToolAdapter();
			}
			@Override
			public Adapter caseTelecomStatusMonitorToolList(TelecomStatusMonitorToolList object) {
				return createTelecomStatusMonitorToolListAdapter();
			}
			@Override
			public Adapter caseAbstractAntennaRadiationPattern(AbstractAntennaRadiationPattern object) {
				return createAbstractAntennaRadiationPatternAdapter();
			}
			@Override
			public Adapter caseIsotropicAntenna(IsotropicAntenna object) {
				return createIsotropicAntennaAdapter();
			}
			@Override
			public Adapter caseDipoleAntennaRadiationPattern(DipoleAntennaRadiationPattern object) {
				return createDipoleAntennaRadiationPatternAdapter();
			}
			@Override
			public Adapter caseHalfWaveDipoleAntennaRadiationPattern(HalfWaveDipoleAntennaRadiationPattern object) {
				return createHalfWaveDipoleAntennaRadiationPatternAdapter();
			}
			@Override
			public Adapter caseSimpleConicalRadiationPattern(SimpleConicalRadiationPattern object) {
				return createSimpleConicalRadiationPatternAdapter();
			}
			@Override
			public Adapter caseSimpleRectangularFrustumRadiationPattern(SimpleRectangularFrustumRadiationPattern object) {
				return createSimpleRectangularFrustumRadiationPatternAdapter();
			}
			@Override
			public Adapter caseURlBasedAntennaRadiationPattern(URlBasedAntennaRadiationPattern object) {
				return createURlBasedAntennaRadiationPatternAdapter();
			}
			@Override
			public Adapter caseAntennaRadiationPatternImageMapLayer(AntennaRadiationPatternImageMapLayer object) {
				return createAntennaRadiationPatternImageMapLayerAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseDescribed(Described object) {
				return createDescribedAdapter();
			}
			@Override
			public Adapter caseAbstractTool(AbstractTool object) {
				return createAbstractToolAdapter();
			}
			@Override
			public Adapter caseSimpleTool(SimpleTool object) {
				return createSimpleToolAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseAbstractMapLayer(AbstractMapLayer object) {
				return createAbstractMapLayerAdapter();
			}
			@Override
			public Adapter caseRectangularRegionProvider(RectangularRegionProvider object) {
				return createRectangularRegionProviderAdapter();
			}
			@Override
			public Adapter caseRectangularRegionImage(RectangularRegionImage object) {
				return createRectangularRegionImageAdapter();
			}
			@Override
			public Adapter caseImageMapLayer(ImageMapLayer object) {
				return createImageMapLayerAdapter();
			}
			@Override
			public Adapter caseCartesianTriangularMeshDerivedImageMapLayer(CartesianTriangularMeshDerivedImageMapLayer object) {
				return createCartesianTriangularMeshDerivedImageMapLayerAdapter();
			}
			@Override
			public Adapter caseLineOfSightImageMapLayer(LineOfSightImageMapLayer object) {
				return createLineOfSightImageMapLayerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.telecoms.TelecomNode <em>Telecom Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomNode
	 * @generated
	 */
	public Adapter createTelecomNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool <em>Telecom Status Monitor Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool
	 * @generated
	 */
	public Adapter createTelecomStatusMonitorToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorToolList <em>Telecom Status Monitor Tool List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorToolList
	 * @generated
	 */
	public Adapter createTelecomStatusMonitorToolListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.telecoms.AbstractAntennaRadiationPattern <em>Abstract Antenna Radiation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.telecoms.AbstractAntennaRadiationPattern
	 * @generated
	 */
	public Adapter createAbstractAntennaRadiationPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.telecoms.IsotropicAntenna <em>Isotropic Antenna</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.telecoms.IsotropicAntenna
	 * @generated
	 */
	public Adapter createIsotropicAntennaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.telecoms.DipoleAntennaRadiationPattern <em>Dipole Antenna Radiation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.telecoms.DipoleAntennaRadiationPattern
	 * @generated
	 */
	public Adapter createDipoleAntennaRadiationPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.telecoms.HalfWaveDipoleAntennaRadiationPattern <em>Half Wave Dipole Antenna Radiation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.telecoms.HalfWaveDipoleAntennaRadiationPattern
	 * @generated
	 */
	public Adapter createHalfWaveDipoleAntennaRadiationPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.telecoms.SimpleConicalRadiationPattern <em>Simple Conical Radiation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.telecoms.SimpleConicalRadiationPattern
	 * @generated
	 */
	public Adapter createSimpleConicalRadiationPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.telecoms.SimpleRectangularFrustumRadiationPattern <em>Simple Rectangular Frustum Radiation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.telecoms.SimpleRectangularFrustumRadiationPattern
	 * @generated
	 */
	public Adapter createSimpleRectangularFrustumRadiationPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.telecoms.URlBasedAntennaRadiationPattern <em>URl Based Antenna Radiation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.telecoms.URlBasedAntennaRadiationPattern
	 * @generated
	 */
	public Adapter createURlBasedAntennaRadiationPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer <em>Antenna Radiation Pattern Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer
	 * @generated
	 */
	public Adapter createAntennaRadiationPatternImageMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.Named
	 * @generated
	 */
	public Adapter createNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.Described
	 * @generated
	 */
	public Adapter createDescribedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.AbstractTool <em>Abstract Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.AbstractTool
	 * @generated
	 */
	public Adapter createAbstractToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.SimpleTool <em>Simple Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.SimpleTool
	 * @generated
	 */
	public Adapter createSimpleToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.AbstractMapLayer <em>Abstract Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.AbstractMapLayer
	 * @generated
	 */
	public Adapter createAbstractMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.RectangularRegionProvider <em>Rectangular Region Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.RectangularRegionProvider
	 * @generated
	 */
	public Adapter createRectangularRegionProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.RectangularRegionImage <em>Rectangular Region Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.RectangularRegionImage
	 * @generated
	 */
	public Adapter createRectangularRegionImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ImageMapLayer <em>Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ImageMapLayer
	 * @generated
	 */
	public Adapter createImageMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.CartesianTriangularMeshDerivedImageMapLayer <em>Cartesian Triangular Mesh Derived Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.CartesianTriangularMeshDerivedImageMapLayer
	 * @generated
	 */
	public Adapter createCartesianTriangularMeshDerivedImageMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.LineOfSightImageMapLayer <em>Line Of Sight Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.LineOfSightImageMapLayer
	 * @generated
	 */
	public Adapter createLineOfSightImageMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SymphonyTelecomToolsAdapterFactory
