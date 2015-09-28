/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.ui.impl;

import org.eclipse.emf.ecore.EClass;

import ca.gc.asc_csa.symphony.environment.ui.EarthSkyPresentation;
import ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage;
import ca.gc.space.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Sky Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("unchecked")
public class EarthSkyPresentationImpl extends NodePresentationImpl implements EarthSkyPresentation
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EarthSkyPresentationImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return SymphonyEnvironmentUIPackage.Literals.EARTH_SKY_PRESENTATION;
	}

  @Override
	public boolean isUseInBoundingCalculation() 
  	{
	  return false;
	}
} //EarthSkyPresentationImpl
