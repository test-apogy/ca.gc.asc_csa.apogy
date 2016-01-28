/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.ui.impl;

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl;
import ca.gc.asc_csa.apogy.core.environment.ui.EarthSkyPresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Sky Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
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
		return ApogyCoreEnvironmentUIPackage.Literals.EARTH_SKY_PRESENTATION;
	}

  @Override
	public boolean isUseInBoundingCalculation() 
  	{
	  return false;
	}
} //EarthSkyPresentationImpl
