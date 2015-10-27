/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.topology.ui.impl.NodePresentationImpl;
import org.eclipse.symphony.core.environment.ui.MoonPresentation;
import org.eclipse.symphony.core.environment.ui.Symphony__CoreEnvironmentUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Moon Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MoonPresentationImpl extends NodePresentationImpl implements MoonPresentation
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MoonPresentationImpl()
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
		return Symphony__CoreEnvironmentUIPackage.Literals.MOON_PRESENTATION;
	}

  @Override
	public boolean isUseInBoundingCalculation() {
	  return false;
	}
} //MoonPresentationImpl
