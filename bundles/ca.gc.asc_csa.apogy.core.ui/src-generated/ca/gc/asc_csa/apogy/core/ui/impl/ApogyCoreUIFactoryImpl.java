package ca.gc.asc_csa.apogy.core.ui.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFactory;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreUIFactoryImpl extends EFactoryImpl implements ApogyCoreUIFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyCoreUIFactory init()
  {
		try {
			ApogyCoreUIFactory theApogyCoreUIFactory = (ApogyCoreUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCoreUIPackage.eNS_URI);
			if (theApogyCoreUIFactory != null) {
				return theApogyCoreUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreUIFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyCoreUIFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE: return createApogyCoreUIFacade();
			case ApogyCoreUIPackage.RESULT_NODE_PRESENTATION: return createResultNodePresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyCoreUIPackage.IPROJECT:
				return createIProjectFromString(eDataType, initialValue);
			case ApogyCoreUIPackage.ICONTAINER:
				return createIContainerFromString(eDataType, initialValue);
			case ApogyCoreUIPackage.IFILE:
				return createIFileFromString(eDataType, initialValue);
			case ApogyCoreUIPackage.IFOLDER:
				return createIFolderFromString(eDataType, initialValue);
			case ApogyCoreUIPackage.IMAGE_DESCRIPTOR:
				return createImageDescriptorFromString(eDataType, initialValue);
			case ApogyCoreUIPackage.ISELECTION:
				return createISelectionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyCoreUIPackage.IPROJECT:
				return convertIProjectToString(eDataType, instanceValue);
			case ApogyCoreUIPackage.ICONTAINER:
				return convertIContainerToString(eDataType, instanceValue);
			case ApogyCoreUIPackage.IFILE:
				return convertIFileToString(eDataType, instanceValue);
			case ApogyCoreUIPackage.IFOLDER:
				return convertIFolderToString(eDataType, instanceValue);
			case ApogyCoreUIPackage.IMAGE_DESCRIPTOR:
				return convertImageDescriptorToString(eDataType, instanceValue);
			case ApogyCoreUIPackage.ISELECTION:
				return convertISelectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreUIFacade createApogyCoreUIFacade() {
		ApogyCoreUIFacadeImpl apogyCoreUIFacade = new ApogyCoreUIFacadeImpl();
		return apogyCoreUIFacade;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ResultNodePresentation createResultNodePresentation()
  {
		ResultNodePresentationImpl resultNodePresentation = new ResultNodePresentationImpl();
		return resultNodePresentation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProject createIProjectFromString(EDataType eDataType, String initialValue) {
		return (IProject)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContainer createIContainerFromString(EDataType eDataType, String initialValue) {
		return (IContainer)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIContainerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile createIFileFromString(EDataType eDataType, String initialValue) {
		return (IFile)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIFileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFolder createIFolderFromString(EDataType eDataType, String initialValue) {
		return (IFolder)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIFolderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageDescriptor createImageDescriptorFromString(EDataType eDataType, String initialValue) {
		return (ImageDescriptor)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageDescriptorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISelection createISelectionFromString(EDataType eDataType, String initialValue) {
		return (ISelection)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertISelectionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreUIPackage getApogyCoreUIPackage() {
		return (ApogyCoreUIPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyCoreUIPackage getPackage()
  {
		return ApogyCoreUIPackage.eINSTANCE;
	}

} //ApogyCoreUIFactoryImpl
