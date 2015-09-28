/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.ui;

import java.util.List;

import org.jfree.chart.annotations.AbstractXYAnnotation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Presentation properties for an ImageMapLayer displayed on the MapView.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage#getMapAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface MapAnnotation extends MapViewItemPresentation
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * TheXYPlot being used by MapView.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.symphony.environment.ui.List<ca.gc.asc_csa.symphony.environment.ui.AbstractXYAnnotation>" unique="false" many="false"
	 * @generated
	 */
  List<AbstractXYAnnotation> getXYShapeAnnotation();

} // MapAnnotation
