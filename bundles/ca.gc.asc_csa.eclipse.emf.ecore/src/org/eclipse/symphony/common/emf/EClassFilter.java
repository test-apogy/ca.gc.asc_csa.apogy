package org.eclipse.symphony.common.emf;

import org.eclipse.emf.ecore.EClass;

/**
 * Class used to apply filter on classes list.
 */
public interface EClassFilter
{
  /**
   * Returns whether the specified class should pass through the filter.
   * @param eClass The EClass.
   * @return True if the class passes the filter, false if it is rejected.
   */
  boolean filter(EClass eClass);

}
