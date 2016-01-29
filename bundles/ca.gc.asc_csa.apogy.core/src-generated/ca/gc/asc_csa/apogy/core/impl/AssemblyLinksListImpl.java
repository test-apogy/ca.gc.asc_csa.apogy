/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.core.AssemblyLink;
import ca.gc.asc_csa.apogy.core.AssemblyLinksList;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Assembly Links List</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.AssemblyLinksListImpl#getAssemblyLinks <em>Assembly Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyLinksListImpl extends MinimalEObjectImpl.Container
		implements AssemblyLinksList {
	/**
	 * The cached value of the '{@link #getAssemblyLinks() <em>Assembly Links</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getAssemblyLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyLink> assemblyLinks;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyLinksListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCorePackage.Literals.ASSEMBLY_LINKS_LIST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyLink> getAssemblyLinks() {
		if (assemblyLinks == null) {
			assemblyLinks = new EObjectContainmentEList<AssemblyLink>(AssemblyLink.class, this, ApogyCorePackage.ASSEMBLY_LINKS_LIST__ASSEMBLY_LINKS);
		}
		return assemblyLinks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCorePackage.ASSEMBLY_LINKS_LIST__ASSEMBLY_LINKS:
				return ((InternalEList<?>)getAssemblyLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCorePackage.ASSEMBLY_LINKS_LIST__ASSEMBLY_LINKS:
				return getAssemblyLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCorePackage.ASSEMBLY_LINKS_LIST__ASSEMBLY_LINKS:
				getAssemblyLinks().clear();
				getAssemblyLinks().addAll((Collection<? extends AssemblyLink>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCorePackage.ASSEMBLY_LINKS_LIST__ASSEMBLY_LINKS:
				getAssemblyLinks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCorePackage.ASSEMBLY_LINKS_LIST__ASSEMBLY_LINKS:
				return assemblyLinks != null && !assemblyLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // AssemblyLinksListImpl