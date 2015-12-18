/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import org.eclipse.symphony.core.environment.Worksite;
import org.eclipse.symphony.core.environment.WorksiteNode;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Worksite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.Worksite#getWorksiteNode() <em>Worksite Node</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class WorksiteTest extends TestCase {

	/**
	 * The fixture for this Worksite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Worksite fixture = null;

	/**
	 * Constructs a new Worksite test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorksiteTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Worksite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Worksite fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Worksite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Worksite getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Worksite#getWorksiteNode() <em>Worksite Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Worksite#getWorksiteNode()
	 * @generated_NOT
	 */
	public void testGetWorksiteNode() 
	{
		   assertNotNull(getFixture().getWorksiteNode());
		   assertTrue(getFixture().getWorksiteNode() instanceof WorksiteNode);
	}

} //WorksiteTest
