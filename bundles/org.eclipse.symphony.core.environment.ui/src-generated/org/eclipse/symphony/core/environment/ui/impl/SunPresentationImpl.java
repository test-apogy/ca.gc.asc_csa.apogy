/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.topology.ui.impl.NodePresentationImpl;
import org.eclipse.symphony.core.environment.ui.SunPresentation;
import org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage;

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
