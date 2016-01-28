/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui;

import java.util.List;

import org.jfree.chart.annotations.AbstractXYAnnotation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Presentation properties for an ImageMapLayer displayed on the MapView.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.core.environment.ui.Symphony__CoreEnvironmentUIPackage#getMapAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface MapAnnotation extends MapViewItemPresentation
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  TheXYPlot being used by MapView.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.symphony.core.environment.ui.List<org.eclipse.symphony.core.environment.ui.AbstractXYAnnotation>" unique="false" many="false"
	 * @generated
	 */
  List<AbstractXYAnnotation> getXYShapeAnnotation();

} // MapAnnotation
