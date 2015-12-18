/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import org.eclipse.symphony.core.environment.SurfaceWorksite;
import org.eclipse.symphony.core.environment.SurfaceWorksiteNode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Surface Worksite</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class SurfaceWorksiteTest extends WorksiteTest {

	/**
	 * Constructs a new Surface Worksite test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceWorksiteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Surface Worksite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SurfaceWorksite getFixture() {
		return (SurfaceWorksite)fixture;
	}

	public void testGetWorksiteNode()
	{
		assertNotNull(getFixture().getWorksiteNode());
		assertTrue(getFixture().getWorksiteNode() instanceof SurfaceWorksiteNode);
	}
} //SurfaceWorksiteTest
