/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.ui.impl;

import org.eclipse.emf.ecore.EClass;

import ca.gc.asc_csa.symphony.environment.ui.SunPresentation;
import ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage;
import ca.gc.space.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sun Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("unchecked")
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
		return SymphonyEnvironmentUIPackage.Literals.SUN_PRESENTATION;
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
