/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.las.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.symphony.common.geometry.data3d.las.LASHeader;
import org.eclipse.symphony.common.geometry.data3d.las.LasPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LASHeaderItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LASHeaderItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFileSignaturePropertyDescriptor(object);
			addFileSourceIDPropertyDescriptor(object);
			addGlobalEncodingPropertyDescriptor(object);
			addProjectID_GUID_data_1PropertyDescriptor(object);
			addProjectID_GUID_data_2PropertyDescriptor(object);
			addProjectID_GUID_data_3PropertyDescriptor(object);
			addProjectID_GUID_data_4PropertyDescriptor(object);
			addVersionMajorPropertyDescriptor(object);
			addVersionMinorPropertyDescriptor(object);
			addSystemIdentifierPropertyDescriptor(object);
			addGeneratingSoftwarePropertyDescriptor(object);
			addFileCreationDayOfYearPropertyDescriptor(object);
			addFileCreationYearPropertyDescriptor(object);
			addHeaderSizePropertyDescriptor(object);
			addOffsetToPointDataPropertyDescriptor(object);
			addNVariableLengthRecordsPropertyDescriptor(object);
			addPointDataFormatIDPropertyDescriptor(object);
			addPointDataRecordLengthPropertyDescriptor(object);
			addNumberOfPointRecordsPropertyDescriptor(object);
			addNumberOfPointsByReturnPropertyDescriptor(object);
			addXScaleFactorPropertyDescriptor(object);
			addYScaleFactorPropertyDescriptor(object);
			addZScaleFactorPropertyDescriptor(object);
			addXOffsetPropertyDescriptor(object);
			addYOffsetPropertyDescriptor(object);
			addZOffsetPropertyDescriptor(object);
			addMaxXPropertyDescriptor(object);
			addMinXPropertyDescriptor(object);
			addMaxYPropertyDescriptor(object);
			addMinYPropertyDescriptor(object);
			addMaxZPropertyDescriptor(object);
			addMinZPropertyDescriptor(object);
			addStartOfWaveformDataPacketRecordPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the File Signature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileSignaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_fileSignature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_fileSignature_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__FILE_SIGNATURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Source ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileSourceIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_fileSourceID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_fileSourceID_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__FILE_SOURCE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Global Encoding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlobalEncodingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_globalEncoding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_globalEncoding_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__GLOBAL_ENCODING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project ID GUID data 1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectID_GUID_data_1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_projectID_GUID_data_1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_projectID_GUID_data_1_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__PROJECT_ID_GUID_DATA_1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project ID GUID data 2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectID_GUID_data_2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_projectID_GUID_data_2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_projectID_GUID_data_2_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__PROJECT_ID_GUID_DATA_2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project ID GUID data 3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectID_GUID_data_3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_projectID_GUID_data_3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_projectID_GUID_data_3_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__PROJECT_ID_GUID_DATA_3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project ID GUID data 4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectID_GUID_data_4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_projectID_GUID_data_4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_projectID_GUID_data_4_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__PROJECT_ID_GUID_DATA_4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version Major feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionMajorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_versionMajor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_versionMajor_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__VERSION_MAJOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version Minor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionMinorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_versionMinor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_versionMinor_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__VERSION_MINOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the System Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSystemIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_systemIdentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_systemIdentifier_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__SYSTEM_IDENTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generating Software feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneratingSoftwarePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_generatingSoftware_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_generatingSoftware_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__GENERATING_SOFTWARE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Creation Day Of Year feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileCreationDayOfYearPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_fileCreationDayOfYear_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_fileCreationDayOfYear_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__FILE_CREATION_DAY_OF_YEAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Creation Year feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileCreationYearPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_fileCreationYear_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_fileCreationYear_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__FILE_CREATION_YEAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Header Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeaderSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_headerSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_headerSize_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__HEADER_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Offset To Point Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffsetToPointDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_offsetToPointData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_offsetToPointData_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__OFFSET_TO_POINT_DATA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NVariable Length Records feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNVariableLengthRecordsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_nVariableLengthRecords_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_nVariableLengthRecords_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__NVARIABLE_LENGTH_RECORDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Point Data Format ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointDataFormatIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_pointDataFormatID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_pointDataFormatID_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__POINT_DATA_FORMAT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Point Data Record Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointDataRecordLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_pointDataRecordLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_pointDataRecordLength_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__POINT_DATA_RECORD_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Point Records feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfPointRecordsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_numberOfPointRecords_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_numberOfPointRecords_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__NUMBER_OF_POINT_RECORDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Points By Return feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfPointsByReturnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_numberOfPointsByReturn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_numberOfPointsByReturn_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__NUMBER_OF_POINTS_BY_RETURN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the XScale Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXScaleFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_xScaleFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_xScaleFactor_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__XSCALE_FACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YScale Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYScaleFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_yScaleFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_yScaleFactor_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__YSCALE_FACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ZScale Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZScaleFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_zScaleFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_zScaleFactor_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__ZSCALE_FACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the XOffset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_xOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_xOffset_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__XOFFSET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YOffset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_yOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_yOffset_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__YOFFSET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ZOffset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_zOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_zOffset_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__ZOFFSET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_maxX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_maxX_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__MAX_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_minX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_minX_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__MIN_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_maxY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_maxY_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__MAX_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_minY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_minY_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__MIN_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_maxZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_maxZ_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__MAX_Z,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_minZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_minZ_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__MIN_Z,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Of Waveform Data Packet Record feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartOfWaveformDataPacketRecordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASHeader_startOfWaveformDataPacketRecord_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASHeader_startOfWaveformDataPacketRecord_feature", "_UI_LASHeader_type"),
				 LasPackage.Literals.LAS_HEADER__START_OF_WAVEFORM_DATA_PACKET_RECORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns LASHeader.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LASHeader"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LASHeader)object).getFileSignature();
		return label == null || label.length() == 0 ?
			getString("_UI_LASHeader_type") :
			getString("_UI_LASHeader_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(LASHeader.class)) {
			case LasPackage.LAS_HEADER__FILE_SIGNATURE:
			case LasPackage.LAS_HEADER__FILE_SOURCE_ID:
			case LasPackage.LAS_HEADER__GLOBAL_ENCODING:
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_1:
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_2:
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_3:
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_4:
			case LasPackage.LAS_HEADER__VERSION_MAJOR:
			case LasPackage.LAS_HEADER__VERSION_MINOR:
			case LasPackage.LAS_HEADER__SYSTEM_IDENTIFIER:
			case LasPackage.LAS_HEADER__GENERATING_SOFTWARE:
			case LasPackage.LAS_HEADER__FILE_CREATION_DAY_OF_YEAR:
			case LasPackage.LAS_HEADER__FILE_CREATION_YEAR:
			case LasPackage.LAS_HEADER__HEADER_SIZE:
			case LasPackage.LAS_HEADER__OFFSET_TO_POINT_DATA:
			case LasPackage.LAS_HEADER__NVARIABLE_LENGTH_RECORDS:
			case LasPackage.LAS_HEADER__POINT_DATA_FORMAT_ID:
			case LasPackage.LAS_HEADER__POINT_DATA_RECORD_LENGTH:
			case LasPackage.LAS_HEADER__NUMBER_OF_POINT_RECORDS:
			case LasPackage.LAS_HEADER__NUMBER_OF_POINTS_BY_RETURN:
			case LasPackage.LAS_HEADER__XSCALE_FACTOR:
			case LasPackage.LAS_HEADER__YSCALE_FACTOR:
			case LasPackage.LAS_HEADER__ZSCALE_FACTOR:
			case LasPackage.LAS_HEADER__XOFFSET:
			case LasPackage.LAS_HEADER__YOFFSET:
			case LasPackage.LAS_HEADER__ZOFFSET:
			case LasPackage.LAS_HEADER__MAX_X:
			case LasPackage.LAS_HEADER__MIN_X:
			case LasPackage.LAS_HEADER__MAX_Y:
			case LasPackage.LAS_HEADER__MIN_Y:
			case LasPackage.LAS_HEADER__MAX_Z:
			case LasPackage.LAS_HEADER__MIN_Z:
			case LasPackage.LAS_HEADER__START_OF_WAVEFORM_DATA_PACKET_RECORD:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
