/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility.pathplanners.graph.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.symphony.addons.mobility.pathplanners.graph.PathplannersGraphPackage;

import org.jgrapht.EdgeFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EdgeFactoryImpl<V, E> extends MinimalEObjectImpl.Container implements EdgeFactory<V, E> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PathplannersGraphPackage.Literals.EDGE_FACTORY;
	}

} //EdgeFactoryImpl
