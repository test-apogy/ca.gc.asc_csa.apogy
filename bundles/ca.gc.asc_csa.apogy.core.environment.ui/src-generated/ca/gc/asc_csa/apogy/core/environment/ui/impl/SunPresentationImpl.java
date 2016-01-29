/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.ui.impl;

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl;
import ca.gc.asc_csa.apogy.core.environment.ui.SunPresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sun Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SunPresentationImpl extends NodePresentationImpl implements SunPresentation
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SunPresentationImpl()
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
		return ApogyCoreEnvironmentUIPackage.Literals.SUN_PRESENTATION;
	}

	@Override
	public boolean isUseInBoundingCalculation() {
		return false;
	}
	
	@Override
	public boolean isVisible() {
		return false;
	}
} //SunPresentationImpl
