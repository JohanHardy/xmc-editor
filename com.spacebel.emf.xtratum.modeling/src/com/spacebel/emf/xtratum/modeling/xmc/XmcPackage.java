/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcFactory
 * @model kind="package"
 * @generated
 */
public interface XmcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xmc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xtratum.org/xm-3.x";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmcPackage eINSTANCE = com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.AreaTypeImpl <em>Area Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.AreaTypeImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getAreaType()
	 * @generated
	 */
	int AREA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__FLAGS = 0;

	/**
	 * The feature id for the '<em><b>Mapped At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__MAPPED_AT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__SIZE = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__START = 4;

	/**
	 * The number of structural features of the '<em>Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.ChannelsEImpl <em>Channels E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.ChannelsEImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getChannelsE()
	 * @generated
	 */
	int CHANNELS_E = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_E__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Sampling Channel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_E__SAMPLING_CHANNEL = 1;

	/**
	 * The feature id for the '<em><b>Queuing Channel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_E__QUEUING_CHANNEL = 2;

	/**
	 * The number of structural features of the '<em>Channels E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_E_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Channels E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.CyclicPlanEImpl <em>Cyclic Plan E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.CyclicPlanEImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getCyclicPlanE()
	 * @generated
	 */
	int CYCLIC_PLAN_E = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_PLAN_E__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_PLAN_E__PLAN = 1;

	/**
	 * The number of structural features of the '<em>Cyclic Plan E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_PLAN_E_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cyclic Plan E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_PLAN_E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.DevicesEImpl <em>Devices E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.DevicesEImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getDevicesE()
	 * @generated
	 */
	int DEVICES_E = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES_E__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Memory Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES_E__MEMORY_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Uart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES_E__UART = 2;

	/**
	 * The feature id for the '<em><b>Null</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES_E__NULL = 3;

	/**
	 * The number of structural features of the '<em>Devices E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES_E_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Devices E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES_E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.DocumentRootImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>System Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYSTEM_DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.EventTypeImpl <em>Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.EventTypeImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__LOG = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HealthMonitorEImpl <em>Health Monitor E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.HealthMonitorEImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHealthMonitorE()
	 * @generated
	 */
	int HEALTH_MONITOR_E = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_E__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_E__EVENT = 1;

	/**
	 * The number of structural features of the '<em>Health Monitor E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_E_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Health Monitor E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MONITOR_E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HwDescriptionEImpl <em>Hw Description E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.HwDescriptionEImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHwDescriptionE()
	 * @generated
	 */
	int HW_DESCRIPTION_E = 7;

	/**
	 * The feature id for the '<em><b>Memory Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DESCRIPTION_E__MEMORY_LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Processor Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DESCRIPTION_E__PROCESSOR_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DESCRIPTION_E__DEVICES = 2;

	/**
	 * The number of structural features of the '<em>Hw Description E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DESCRIPTION_E_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Hw Description E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DESCRIPTION_E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HwResourcesEImpl <em>Hw Resources E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.HwResourcesEImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHwResourcesE()
	 * @generated
	 */
	int HW_RESOURCES_E = 8;

	/**
	 * The feature id for the '<em><b>Io Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCES_E__IO_PORTS = 0;

	/**
	 * The feature id for the '<em><b>Interrupts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCES_E__INTERRUPTS = 1;

	/**
	 * The number of structural features of the '<em>Hw Resources E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCES_E_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hw Resources E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCES_E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HypervisorEImpl <em>Hypervisor E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.HypervisorEImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHypervisorE()
	 * @generated
	 */
	int HYPERVISOR_E = 9;

	/**
	 * The feature id for the '<em><b>Physical Memory Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_E__PHYSICAL_MEMORY_AREA = 0;

	/**
	 * The feature id for the '<em><b>Health Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_E__HEALTH_MONITOR = 1;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_E__TRACE = 2;

	/**
	 * The feature id for the '<em><b>Console</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_E__CONSOLE = 3;

	/**
	 * The feature id for the '<em><b>Health Monitor App Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_E__HEALTH_MONITOR_APP_DEVICE = 4;

	/**
	 * The feature id for the '<em><b>Health Monitor Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_E__HEALTH_MONITOR_DEVICE = 5;

	/**
	 * The number of structural features of the '<em>Hypervisor E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_E_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Hypervisor E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HypMemoryAreaEImpl <em>Hyp Memory Area E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.HypMemoryAreaEImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHypMemoryAreaE()
	 * @generated
	 */
	int HYP_MEMORY_AREA_E = 10;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYP_MEMORY_AREA_E__FLAGS = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYP_MEMORY_AREA_E__SIZE = 1;

	/**
	 * The number of structural features of the '<em>Hyp Memory Area E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYP_MEMORY_AREA_E_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hyp Memory Area E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYP_MEMORY_AREA_E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.InterruptsTypeImpl <em>Interrupts Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.InterruptsTypeImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getInterruptsType()
	 * @generated
	 */
	int INTERRUPTS_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTS_TYPE__LINES = 0;

	/**
	 * The number of structural features of the '<em>Interrupts Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interrupts Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.IoPortsEImpl <em>Io Ports E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.IoPortsEImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getIoPortsE()
	 * @generated
	 */
	int IO_PORTS_E = 12;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_PORTS_E__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_PORTS_E__RANGE = 1;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_PORTS_E__RESTRICTED = 2;

	/**
	 * The number of structural features of the '<em>Io Ports E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_PORTS_E_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Io Ports E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_PORTS_E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.IpcPortEImpl <em>Ipc Port E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.IpcPortEImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getIpcPortE()
	 * @generated
	 */
	int IPC_PORT_E = 13;

	/**
	 * The feature id for the '<em><b>Partition Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPC_PORT_E__PARTITION_ID = 0;

	/**
	 * The feature id for the '<em><b>Partition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPC_PORT_E__PARTITION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPC_PORT_E__PORT_NAME = 2;

	/**
	 * The number of structural features of the '<em>Ipc Port E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPC_PORT_E_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ipc Port E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPC_PORT_E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.MemoryAreaEImpl <em>Memory Area E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.MemoryAreaEImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getMemoryAreaE()
	 * @generated
	 */
	int MEMORY_AREA_E = 14;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_AREA_E__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_AREA_E__AREA = 1;

	/**
	 * The number of structural features of the '<em>Memory Area E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_AREA_E_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Memory Area E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_AREA_E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.MemoryBlockTypeImpl <em>Memory Block Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.MemoryBlockTypeImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getMemoryBlockType()
	 * @generated
	 */
	int MEMORY_BLOCK_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BLOCK_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BLOCK_TYPE__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BLOCK_TYPE__START = 2;

	/**
	 * The number of structural features of the '<em>Memory Block Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BLOCK_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Memory Block Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BLOCK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.MemoryLayoutEImpl <em>Memory Layout E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.MemoryLayoutEImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getMemoryLayoutE()
	 * @generated
	 */
	int MEMORY_LAYOUT_E = 16;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_LAYOUT_E__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_LAYOUT_E__REGION = 1;

	/**
	 * The number of structural features of the '<em>Memory Layout E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_LAYOUT_E_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Memory Layout E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_LAYOUT_E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.NullTypeImpl <em>Null Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.NullTypeImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getNullType()
	 * @generated
	 */
	int NULL_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Null Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Null Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionEImpl <em>Partition E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionEImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPartitionE()
	 * @generated
	 */
	int PARTITION_E = 18;

	/**
	 * The feature id for the '<em><b>Physical Memory Areas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_E__PHYSICAL_MEMORY_AREAS = 0;

	/**
	 * The feature id for the '<em><b>Temporal Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_E__TEMPORAL_REQUIREMENTS = 1;

	/**
	 * The feature id for the '<em><b>Health Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_E__HEALTH_MONITOR = 2;

	/**
	 * The feature id for the '<em><b>Hw Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_E__HW_RESOURCES = 3;

	/**
	 * The feature id for the '<em><b>Port Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_E__PORT_TABLE = 4;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_E__TRACE = 5;

	/**
	 * The feature id for the '<em><b>Boot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_E__BOOT = 6;

	/**
	 * The feature id for the '<em><b>Console</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_E__CONSOLE = 7;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_E__FLAGS = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_E__ID = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_E__NAME = 10;

	/**
	 * The number of structural features of the '<em>Partition E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_E_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Partition E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionPortsEImpl <em>Partition Ports E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionPortsEImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPartitionPortsE()
	 * @generated
	 */
	int PARTITION_PORTS_E = 19;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PORTS_E__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PORTS_E__PORT = 1;

	/**
	 * The number of structural features of the '<em>Partition Ports E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PORTS_E_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Partition Ports E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PORTS_E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionTableTypeImpl <em>Partition Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionTableTypeImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPartitionTableType()
	 * @generated
	 */
	int PARTITION_TABLE_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_TABLE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_TABLE_TYPE__PARTITION = 1;

	/**
	 * The number of structural features of the '<em>Partition Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_TABLE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Partition Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_TABLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PlanEImpl <em>Plan E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.PlanEImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPlanE()
	 * @generated
	 */
	int PLAN_E = 21;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_E__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_E__SLOT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_E__ID = 2;

	/**
	 * The feature id for the '<em><b>Major Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_E__MAJOR_FRAME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_E__NAME = 4;

	/**
	 * The number of structural features of the '<em>Plan E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_E_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Plan E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PortTypeImpl <em>Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.PortTypeImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__DIRECTION = 0;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__DISCIPLINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.ProcessorEImpl <em>Processor E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.ProcessorEImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getProcessorE()
	 * @generated
	 */
	int PROCESSOR_E = 23;

	/**
	 * The feature id for the '<em><b>Cyclic Plan Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_E__CYCLIC_PLAN_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_E__FEATURES = 1;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_E__FREQUENCY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_E__ID = 3;

	/**
	 * The number of structural features of the '<em>Processor E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_E_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Processor E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.ProcessorTableTypeImpl <em>Processor Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.ProcessorTableTypeImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getProcessorTableType()
	 * @generated
	 */
	int PROCESSOR_TABLE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TABLE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TABLE_TYPE__PROCESSOR = 1;

	/**
	 * The number of structural features of the '<em>Processor Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TABLE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Processor Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TABLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.QueuingChannelTypeImpl <em>Queuing Channel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.QueuingChannelTypeImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getQueuingChannelType()
	 * @generated
	 */
	int QUEUING_CHANNEL_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_CHANNEL_TYPE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_CHANNEL_TYPE__DESTINATION = 1;

	/**
	 * The feature id for the '<em><b>Max Message Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_CHANNEL_TYPE__MAX_MESSAGE_LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Max No Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_CHANNEL_TYPE__MAX_NO_MESSAGES = 3;

	/**
	 * The feature id for the '<em><b>Max Time Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_CHANNEL_TYPE__MAX_TIME_EXPIRATION = 4;

	/**
	 * The number of structural features of the '<em>Queuing Channel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_CHANNEL_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Queuing Channel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_CHANNEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.RangeTypeImpl <em>Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.RangeTypeImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getRangeType()
	 * @generated
	 */
	int RANGE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__BASE = 0;

	/**
	 * The feature id for the '<em><b>No Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__NO_PORTS = 1;

	/**
	 * The number of structural features of the '<em>Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.RegionTypeImpl <em>Region Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.RegionTypeImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getRegionType()
	 * @generated
	 */
	int REGION_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE__START = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Region Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Region Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.RestrictedTypeImpl <em>Restricted Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.RestrictedTypeImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getRestrictedType()
	 * @generated
	 */
	int RESTRICTED_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_TYPE__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_TYPE__MASK = 1;

	/**
	 * The number of structural features of the '<em>Restricted Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Restricted Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.RswEImpl <em>Rsw E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.RswEImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getRswE()
	 * @generated
	 */
	int RSW_E = 29;

	/**
	 * The feature id for the '<em><b>Physical Memory Areas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSW_E__PHYSICAL_MEMORY_AREAS = 0;

	/**
	 * The number of structural features of the '<em>Rsw E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSW_E_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rsw E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSW_E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.SamplingChannelTypeImpl <em>Sampling Channel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.SamplingChannelTypeImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getSamplingChannelType()
	 * @generated
	 */
	int SAMPLING_CHANNEL_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_CHANNEL_TYPE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_CHANNEL_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_CHANNEL_TYPE__DESTINATION = 2;

	/**
	 * The feature id for the '<em><b>Max Message Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_CHANNEL_TYPE__MAX_MESSAGE_LENGTH = 3;

	/**
	 * The feature id for the '<em><b>Refresh Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_CHANNEL_TYPE__REFRESH_PERIOD = 4;

	/**
	 * The number of structural features of the '<em>Sampling Channel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_CHANNEL_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sampling Channel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_CHANNEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.SlotTypeImpl <em>Slot Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.SlotTypeImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getSlotType()
	 * @generated
	 */
	int SLOT_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Partition Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE__PARTITION_ID = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE__START = 3;

	/**
	 * The number of structural features of the '<em>Slot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Slot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.SystemDescriptionTypeImpl <em>System Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.SystemDescriptionTypeImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getSystemDescriptionType()
	 * @generated
	 */
	int SYSTEM_DESCRIPTION_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Hw Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_TYPE__HW_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>XM Hypervisor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_TYPE__XM_HYPERVISOR = 1;

	/**
	 * The feature id for the '<em><b>Resident Sw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_TYPE__RESIDENT_SW = 2;

	/**
	 * The feature id for the '<em><b>Partition Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_TYPE__PARTITION_TABLE = 3;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_TYPE__CHANNELS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_TYPE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_TYPE__VERSION = 6;

	/**
	 * The number of structural features of the '<em>System Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>System Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.TemporalRequirementsTypeImpl <em>Temporal Requirements Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.TemporalRequirementsTypeImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getTemporalRequirementsType()
	 * @generated
	 */
	int TEMPORAL_REQUIREMENTS_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_REQUIREMENTS_TYPE__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_REQUIREMENTS_TYPE__PERIOD = 1;

	/**
	 * The number of structural features of the '<em>Temporal Requirements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_REQUIREMENTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Temporal Requirements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_REQUIREMENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.TraceEImpl <em>Trace E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.TraceEImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getTraceE()
	 * @generated
	 */
	int TRACE_E = 34;

	/**
	 * The feature id for the '<em><b>Bitmask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_E__BITMASK = 0;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_E__DEVICE = 1;

	/**
	 * The number of structural features of the '<em>Trace E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_E_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trace E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.UartTypeImpl <em>Uart Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.UartTypeImpl
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getUartType()
	 * @generated
	 */
	int UART_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Baud Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UART_TYPE__BAUD_RATE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UART_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UART_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Uart Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UART_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Uart Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UART_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.DirectionT <em>Direction T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DirectionT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getDirectionT()
	 * @generated
	 */
	int DIRECTION_T = 36;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.DisciplineT <em>Discipline T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DisciplineT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getDisciplineT()
	 * @generated
	 */
	int DISCIPLINE_T = 37;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.HmActionT <em>Hm Action T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HmActionT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHmActionT()
	 * @generated
	 */
	int HM_ACTION_T = 38;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.HmStringT <em>Hm String T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HmStringT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHmStringT()
	 * @generated
	 */
	int HM_STRING_T = 39;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.MemAreaFlagsT <em>Mem Area Flags T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemAreaFlagsT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getMemAreaFlagsT()
	 * @generated
	 */
	int MEM_AREA_FLAGS_T = 40;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.MemRegionT <em>Mem Region T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemRegionT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getMemRegionT()
	 * @generated
	 */
	int MEM_REGION_T = 41;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionFlagsT <em>Partition Flags T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionFlagsT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPartitionFlagsT()
	 * @generated
	 */
	int PARTITION_FLAGS_T = 42;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.PortTypeT <em>Port Type T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PortTypeT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPortTypeT()
	 * @generated
	 */
	int PORT_TYPE_T = 43;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorFeaturesT <em>Processor Features T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ProcessorFeaturesT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getProcessorFeaturesT()
	 * @generated
	 */
	int PROCESSOR_FEATURES_T = 44;

	/**
	 * The meta object id for the '{@link com.spacebel.emf.xtratum.modeling.xmc.YntfT <em>Yntf T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.YntfT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getYntfT()
	 * @generated
	 */
	int YNTF_T = 45;

	/**
	 * The meta object id for the '<em>Direction TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DirectionT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getDirectionTObject()
	 * @generated
	 */
	int DIRECTION_TOBJECT = 46;

	/**
	 * The meta object id for the '<em>Discipline TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DisciplineT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getDisciplineTObject()
	 * @generated
	 */
	int DISCIPLINE_TOBJECT = 47;

	/**
	 * The meta object id for the '<em>Freq Unit T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getFreqUnitT()
	 * @generated
	 */
	int FREQ_UNIT_T = 48;

	/**
	 * The meta object id for the '<em>Hex T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHexT()
	 * @generated
	 */
	int HEX_T = 49;

	/**
	 * The meta object id for the '<em>Hm Action TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HmActionT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHmActionTObject()
	 * @generated
	 */
	int HM_ACTION_TOBJECT = 50;

	/**
	 * The meta object id for the '<em>Hm String TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HmStringT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHmStringTObject()
	 * @generated
	 */
	int HM_STRING_TOBJECT = 51;

	/**
	 * The meta object id for the '<em>Hw Irq Id List T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHwIrqIdListT()
	 * @generated
	 */
	int HW_IRQ_ID_LIST_T = 52;

	/**
	 * The meta object id for the '<em>Hw Irq Id T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHwIrqIdT()
	 * @generated
	 */
	int HW_IRQ_ID_T = 53;

	/**
	 * The meta object id for the '<em>Id List T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getIdListT()
	 * @generated
	 */
	int ID_LIST_T = 54;

	/**
	 * The meta object id for the '<em>Id String T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getIdStringT()
	 * @generated
	 */
	int ID_STRING_T = 55;

	/**
	 * The meta object id for the '<em>Id T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getIdT()
	 * @generated
	 */
	int ID_T = 56;

	/**
	 * The meta object id for the '<em>Mem Area Flags List T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getMemAreaFlagsListT()
	 * @generated
	 */
	int MEM_AREA_FLAGS_LIST_T = 57;

	/**
	 * The meta object id for the '<em>Mem Area Flags TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemAreaFlagsT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getMemAreaFlagsTObject()
	 * @generated
	 */
	int MEM_AREA_FLAGS_TOBJECT = 58;

	/**
	 * The meta object id for the '<em>Mem Region TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemRegionT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getMemRegionTObject()
	 * @generated
	 */
	int MEM_REGION_TOBJECT = 59;

	/**
	 * The meta object id for the '<em>Partition Flags List T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPartitionFlagsListT()
	 * @generated
	 */
	int PARTITION_FLAGS_LIST_T = 60;

	/**
	 * The meta object id for the '<em>Partition Flags TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionFlagsT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPartitionFlagsTObject()
	 * @generated
	 */
	int PARTITION_FLAGS_TOBJECT = 61;

	/**
	 * The meta object id for the '<em>Port Type TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PortTypeT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPortTypeTObject()
	 * @generated
	 */
	int PORT_TYPE_TOBJECT = 62;

	/**
	 * The meta object id for the '<em>Processor Features List T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getProcessorFeaturesListT()
	 * @generated
	 */
	int PROCESSOR_FEATURES_LIST_T = 63;

	/**
	 * The meta object id for the '<em>Processor Features TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ProcessorFeaturesT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getProcessorFeaturesTObject()
	 * @generated
	 */
	int PROCESSOR_FEATURES_TOBJECT = 64;

	/**
	 * The meta object id for the '<em>Size Unit T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getSizeUnitT()
	 * @generated
	 */
	int SIZE_UNIT_T = 65;

	/**
	 * The meta object id for the '<em>Time Unit T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getTimeUnitT()
	 * @generated
	 */
	int TIME_UNIT_T = 66;

	/**
	 * The meta object id for the '<em>Version T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getVersionT()
	 * @generated
	 */
	int VERSION_T = 67;

	/**
	 * The meta object id for the '<em>Yntf TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.spacebel.emf.xtratum.modeling.xmc.YntfT
	 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getYntfTObject()
	 * @generated
	 */
	int YNTF_TOBJECT = 68;


	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType <em>Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.AreaType
	 * @generated
	 */
	EClass getAreaType();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.AreaType#getFlags()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_Flags();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType#getMappedAt <em>Mapped At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped At</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.AreaType#getMappedAt()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_MappedAt();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.AreaType#getName()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.AreaType#getSize()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_Size();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.AreaType#getStart()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_Start();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.ChannelsE <em>Channels E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channels E</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ChannelsE
	 * @generated
	 */
	EClass getChannelsE();

	/**
	 * Returns the meta object for the attribute list '{@link com.spacebel.emf.xtratum.modeling.xmc.ChannelsE#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ChannelsE#getGroup()
	 * @see #getChannelsE()
	 * @generated
	 */
	EAttribute getChannelsE_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.spacebel.emf.xtratum.modeling.xmc.ChannelsE#getSamplingChannel <em>Sampling Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sampling Channel</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ChannelsE#getSamplingChannel()
	 * @see #getChannelsE()
	 * @generated
	 */
	EReference getChannelsE_SamplingChannel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.spacebel.emf.xtratum.modeling.xmc.ChannelsE#getQueuingChannel <em>Queuing Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queuing Channel</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ChannelsE#getQueuingChannel()
	 * @see #getChannelsE()
	 * @generated
	 */
	EReference getChannelsE_QueuingChannel();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.CyclicPlanE <em>Cyclic Plan E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cyclic Plan E</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.CyclicPlanE
	 * @generated
	 */
	EClass getCyclicPlanE();

	/**
	 * Returns the meta object for the attribute list '{@link com.spacebel.emf.xtratum.modeling.xmc.CyclicPlanE#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.CyclicPlanE#getGroup()
	 * @see #getCyclicPlanE()
	 * @generated
	 */
	EAttribute getCyclicPlanE_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.spacebel.emf.xtratum.modeling.xmc.CyclicPlanE#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plan</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.CyclicPlanE#getPlan()
	 * @see #getCyclicPlanE()
	 * @generated
	 */
	EReference getCyclicPlanE_Plan();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.DevicesE <em>Devices E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Devices E</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DevicesE
	 * @generated
	 */
	EClass getDevicesE();

	/**
	 * Returns the meta object for the attribute list '{@link com.spacebel.emf.xtratum.modeling.xmc.DevicesE#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DevicesE#getGroup()
	 * @see #getDevicesE()
	 * @generated
	 */
	EAttribute getDevicesE_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.spacebel.emf.xtratum.modeling.xmc.DevicesE#getMemoryBlock <em>Memory Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory Block</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DevicesE#getMemoryBlock()
	 * @see #getDevicesE()
	 * @generated
	 */
	EReference getDevicesE_MemoryBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link com.spacebel.emf.xtratum.modeling.xmc.DevicesE#getUart <em>Uart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uart</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DevicesE#getUart()
	 * @see #getDevicesE()
	 * @generated
	 */
	EReference getDevicesE_Uart();

	/**
	 * Returns the meta object for the containment reference list '{@link com.spacebel.emf.xtratum.modeling.xmc.DevicesE#getNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DevicesE#getNull()
	 * @see #getDevicesE()
	 * @generated
	 */
	EReference getDevicesE_Null();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.spacebel.emf.xtratum.modeling.xmc.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.spacebel.emf.xtratum.modeling.xmc.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.spacebel.emf.xtratum.modeling.xmc.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.DocumentRoot#getSystemDescription <em>System Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Description</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DocumentRoot#getSystemDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SystemDescription();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.EventType
	 * @generated
	 */
	EClass getEventType();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.EventType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.EventType#getAction()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_Action();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.EventType#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.EventType#getLog()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_Log();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.EventType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.EventType#getName()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_Name();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.HealthMonitorE <em>Health Monitor E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Monitor E</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HealthMonitorE
	 * @generated
	 */
	EClass getHealthMonitorE();

	/**
	 * Returns the meta object for the attribute list '{@link com.spacebel.emf.xtratum.modeling.xmc.HealthMonitorE#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HealthMonitorE#getGroup()
	 * @see #getHealthMonitorE()
	 * @generated
	 */
	EAttribute getHealthMonitorE_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.spacebel.emf.xtratum.modeling.xmc.HealthMonitorE#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HealthMonitorE#getEvent()
	 * @see #getHealthMonitorE()
	 * @generated
	 */
	EReference getHealthMonitorE_Event();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE <em>Hw Description E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Description E</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE
	 * @generated
	 */
	EClass getHwDescriptionE();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE#getMemoryLayout <em>Memory Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memory Layout</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE#getMemoryLayout()
	 * @see #getHwDescriptionE()
	 * @generated
	 */
	EReference getHwDescriptionE_MemoryLayout();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE#getProcessorTable <em>Processor Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processor Table</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE#getProcessorTable()
	 * @see #getHwDescriptionE()
	 * @generated
	 */
	EReference getHwDescriptionE_ProcessorTable();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Devices</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE#getDevices()
	 * @see #getHwDescriptionE()
	 * @generated
	 */
	EReference getHwDescriptionE_Devices();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.HwResourcesE <em>Hw Resources E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Resources E</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HwResourcesE
	 * @generated
	 */
	EClass getHwResourcesE();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.HwResourcesE#getIoPorts <em>Io Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Io Ports</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HwResourcesE#getIoPorts()
	 * @see #getHwResourcesE()
	 * @generated
	 */
	EReference getHwResourcesE_IoPorts();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.HwResourcesE#getInterrupts <em>Interrupts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interrupts</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HwResourcesE#getInterrupts()
	 * @see #getHwResourcesE()
	 * @generated
	 */
	EReference getHwResourcesE_Interrupts();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE <em>Hypervisor E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hypervisor E</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HypervisorE
	 * @generated
	 */
	EClass getHypervisorE();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getPhysicalMemoryArea <em>Physical Memory Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Physical Memory Area</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getPhysicalMemoryArea()
	 * @see #getHypervisorE()
	 * @generated
	 */
	EReference getHypervisorE_PhysicalMemoryArea();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getHealthMonitor <em>Health Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Health Monitor</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getHealthMonitor()
	 * @see #getHypervisorE()
	 * @generated
	 */
	EReference getHypervisorE_HealthMonitor();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trace</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getTrace()
	 * @see #getHypervisorE()
	 * @generated
	 */
	EReference getHypervisorE_Trace();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getConsole <em>Console</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Console</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getConsole()
	 * @see #getHypervisorE()
	 * @generated
	 */
	EAttribute getHypervisorE_Console();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getHealthMonitorAppDevice <em>Health Monitor App Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Health Monitor App Device</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getHealthMonitorAppDevice()
	 * @see #getHypervisorE()
	 * @generated
	 */
	EAttribute getHypervisorE_HealthMonitorAppDevice();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getHealthMonitorDevice <em>Health Monitor Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Health Monitor Device</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getHealthMonitorDevice()
	 * @see #getHypervisorE()
	 * @generated
	 */
	EAttribute getHypervisorE_HealthMonitorDevice();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.HypMemoryAreaE <em>Hyp Memory Area E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hyp Memory Area E</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HypMemoryAreaE
	 * @generated
	 */
	EClass getHypMemoryAreaE();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.HypMemoryAreaE#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HypMemoryAreaE#getFlags()
	 * @see #getHypMemoryAreaE()
	 * @generated
	 */
	EAttribute getHypMemoryAreaE_Flags();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.HypMemoryAreaE#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HypMemoryAreaE#getSize()
	 * @see #getHypMemoryAreaE()
	 * @generated
	 */
	EAttribute getHypMemoryAreaE_Size();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.InterruptsType <em>Interrupts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interrupts Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.InterruptsType
	 * @generated
	 */
	EClass getInterruptsType();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.InterruptsType#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lines</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.InterruptsType#getLines()
	 * @see #getInterruptsType()
	 * @generated
	 */
	EAttribute getInterruptsType_Lines();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.IoPortsE <em>Io Ports E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io Ports E</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.IoPortsE
	 * @generated
	 */
	EClass getIoPortsE();

	/**
	 * Returns the meta object for the attribute list '{@link com.spacebel.emf.xtratum.modeling.xmc.IoPortsE#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.IoPortsE#getGroup()
	 * @see #getIoPortsE()
	 * @generated
	 */
	EAttribute getIoPortsE_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.spacebel.emf.xtratum.modeling.xmc.IoPortsE#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Range</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.IoPortsE#getRange()
	 * @see #getIoPortsE()
	 * @generated
	 */
	EReference getIoPortsE_Range();

	/**
	 * Returns the meta object for the containment reference list '{@link com.spacebel.emf.xtratum.modeling.xmc.IoPortsE#getRestricted <em>Restricted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restricted</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.IoPortsE#getRestricted()
	 * @see #getIoPortsE()
	 * @generated
	 */
	EReference getIoPortsE_Restricted();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.IpcPortE <em>Ipc Port E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ipc Port E</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.IpcPortE
	 * @generated
	 */
	EClass getIpcPortE();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.IpcPortE#getPartitionId <em>Partition Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partition Id</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.IpcPortE#getPartitionId()
	 * @see #getIpcPortE()
	 * @generated
	 */
	EAttribute getIpcPortE_PartitionId();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.IpcPortE#getPartitionName <em>Partition Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partition Name</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.IpcPortE#getPartitionName()
	 * @see #getIpcPortE()
	 * @generated
	 */
	EAttribute getIpcPortE_PartitionName();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.IpcPortE#getPortName <em>Port Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Name</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.IpcPortE#getPortName()
	 * @see #getIpcPortE()
	 * @generated
	 */
	EAttribute getIpcPortE_PortName();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.MemoryAreaE <em>Memory Area E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Area E</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemoryAreaE
	 * @generated
	 */
	EClass getMemoryAreaE();

	/**
	 * Returns the meta object for the attribute list '{@link com.spacebel.emf.xtratum.modeling.xmc.MemoryAreaE#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemoryAreaE#getGroup()
	 * @see #getMemoryAreaE()
	 * @generated
	 */
	EAttribute getMemoryAreaE_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.spacebel.emf.xtratum.modeling.xmc.MemoryAreaE#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Area</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemoryAreaE#getArea()
	 * @see #getMemoryAreaE()
	 * @generated
	 */
	EReference getMemoryAreaE_Area();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.MemoryBlockType <em>Memory Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Block Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemoryBlockType
	 * @generated
	 */
	EClass getMemoryBlockType();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.MemoryBlockType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemoryBlockType#getName()
	 * @see #getMemoryBlockType()
	 * @generated
	 */
	EAttribute getMemoryBlockType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.MemoryBlockType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemoryBlockType#getSize()
	 * @see #getMemoryBlockType()
	 * @generated
	 */
	EAttribute getMemoryBlockType_Size();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.MemoryBlockType#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemoryBlockType#getStart()
	 * @see #getMemoryBlockType()
	 * @generated
	 */
	EAttribute getMemoryBlockType_Start();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.MemoryLayoutE <em>Memory Layout E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Layout E</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemoryLayoutE
	 * @generated
	 */
	EClass getMemoryLayoutE();

	/**
	 * Returns the meta object for the attribute list '{@link com.spacebel.emf.xtratum.modeling.xmc.MemoryLayoutE#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemoryLayoutE#getGroup()
	 * @see #getMemoryLayoutE()
	 * @generated
	 */
	EAttribute getMemoryLayoutE_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.spacebel.emf.xtratum.modeling.xmc.MemoryLayoutE#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Region</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemoryLayoutE#getRegion()
	 * @see #getMemoryLayoutE()
	 * @generated
	 */
	EReference getMemoryLayoutE_Region();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.NullType <em>Null Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.NullType
	 * @generated
	 */
	EClass getNullType();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.NullType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.NullType#getName()
	 * @see #getNullType()
	 * @generated
	 */
	EAttribute getNullType_Name();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE <em>Partition E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition E</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionE
	 * @generated
	 */
	EClass getPartitionE();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getPhysicalMemoryAreas <em>Physical Memory Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Physical Memory Areas</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getPhysicalMemoryAreas()
	 * @see #getPartitionE()
	 * @generated
	 */
	EReference getPartitionE_PhysicalMemoryAreas();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getTemporalRequirements <em>Temporal Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal Requirements</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getTemporalRequirements()
	 * @see #getPartitionE()
	 * @generated
	 */
	EReference getPartitionE_TemporalRequirements();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getHealthMonitor <em>Health Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Health Monitor</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getHealthMonitor()
	 * @see #getPartitionE()
	 * @generated
	 */
	EReference getPartitionE_HealthMonitor();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getHwResources <em>Hw Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hw Resources</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getHwResources()
	 * @see #getPartitionE()
	 * @generated
	 */
	EReference getPartitionE_HwResources();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getPortTable <em>Port Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port Table</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getPortTable()
	 * @see #getPartitionE()
	 * @generated
	 */
	EReference getPartitionE_PortTable();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trace</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getTrace()
	 * @see #getPartitionE()
	 * @generated
	 */
	EReference getPartitionE_Trace();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getBoot <em>Boot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boot</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getBoot()
	 * @see #getPartitionE()
	 * @generated
	 */
	EAttribute getPartitionE_Boot();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getConsole <em>Console</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Console</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getConsole()
	 * @see #getPartitionE()
	 * @generated
	 */
	EAttribute getPartitionE_Console();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getFlags()
	 * @see #getPartitionE()
	 * @generated
	 */
	EAttribute getPartitionE_Flags();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getId()
	 * @see #getPartitionE()
	 * @generated
	 */
	EAttribute getPartitionE_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getName()
	 * @see #getPartitionE()
	 * @generated
	 */
	EAttribute getPartitionE_Name();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionPortsE <em>Partition Ports E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition Ports E</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionPortsE
	 * @generated
	 */
	EClass getPartitionPortsE();

	/**
	 * Returns the meta object for the attribute list '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionPortsE#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionPortsE#getGroup()
	 * @see #getPartitionPortsE()
	 * @generated
	 */
	EAttribute getPartitionPortsE_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionPortsE#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionPortsE#getPort()
	 * @see #getPartitionPortsE()
	 * @generated
	 */
	EReference getPartitionPortsE_Port();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionTableType <em>Partition Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition Table Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionTableType
	 * @generated
	 */
	EClass getPartitionTableType();

	/**
	 * Returns the meta object for the attribute list '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionTableType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionTableType#getGroup()
	 * @see #getPartitionTableType()
	 * @generated
	 */
	EAttribute getPartitionTableType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionTableType#getPartition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partition</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionTableType#getPartition()
	 * @see #getPartitionTableType()
	 * @generated
	 */
	EReference getPartitionTableType_Partition();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.PlanE <em>Plan E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan E</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PlanE
	 * @generated
	 */
	EClass getPlanE();

	/**
	 * Returns the meta object for the attribute list '{@link com.spacebel.emf.xtratum.modeling.xmc.PlanE#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PlanE#getGroup()
	 * @see #getPlanE()
	 * @generated
	 */
	EAttribute getPlanE_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.spacebel.emf.xtratum.modeling.xmc.PlanE#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PlanE#getSlot()
	 * @see #getPlanE()
	 * @generated
	 */
	EReference getPlanE_Slot();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.PlanE#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PlanE#getId()
	 * @see #getPlanE()
	 * @generated
	 */
	EAttribute getPlanE_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.PlanE#getMajorFrame <em>Major Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major Frame</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PlanE#getMajorFrame()
	 * @see #getPlanE()
	 * @generated
	 */
	EAttribute getPlanE_MajorFrame();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.PlanE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PlanE#getName()
	 * @see #getPlanE()
	 * @generated
	 */
	EAttribute getPlanE_Name();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PortType
	 * @generated
	 */
	EClass getPortType();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.PortType#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PortType#getDirection()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Direction();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.PortType#getDiscipline <em>Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discipline</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PortType#getDiscipline()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Discipline();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.PortType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PortType#getName()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.PortType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PortType#getType()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Type();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorE <em>Processor E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor E</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ProcessorE
	 * @generated
	 */
	EClass getProcessorE();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorE#getCyclicPlanTable <em>Cyclic Plan Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cyclic Plan Table</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ProcessorE#getCyclicPlanTable()
	 * @see #getProcessorE()
	 * @generated
	 */
	EReference getProcessorE_CyclicPlanTable();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorE#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Features</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ProcessorE#getFeatures()
	 * @see #getProcessorE()
	 * @generated
	 */
	EAttribute getProcessorE_Features();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorE#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ProcessorE#getFrequency()
	 * @see #getProcessorE()
	 * @generated
	 */
	EAttribute getProcessorE_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorE#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ProcessorE#getId()
	 * @see #getProcessorE()
	 * @generated
	 */
	EAttribute getProcessorE_Id();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorTableType <em>Processor Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor Table Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ProcessorTableType
	 * @generated
	 */
	EClass getProcessorTableType();

	/**
	 * Returns the meta object for the attribute list '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorTableType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ProcessorTableType#getGroup()
	 * @see #getProcessorTableType()
	 * @generated
	 */
	EAttribute getProcessorTableType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorTableType#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processor</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ProcessorTableType#getProcessor()
	 * @see #getProcessorTableType()
	 * @generated
	 */
	EReference getProcessorTableType_Processor();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType <em>Queuing Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queuing Channel Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType
	 * @generated
	 */
	EClass getQueuingChannelType();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getSource()
	 * @see #getQueuingChannelType()
	 * @generated
	 */
	EReference getQueuingChannelType_Source();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getDestination()
	 * @see #getQueuingChannelType()
	 * @generated
	 */
	EReference getQueuingChannelType_Destination();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getMaxMessageLength <em>Max Message Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Message Length</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getMaxMessageLength()
	 * @see #getQueuingChannelType()
	 * @generated
	 */
	EAttribute getQueuingChannelType_MaxMessageLength();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getMaxNoMessages <em>Max No Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max No Messages</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getMaxNoMessages()
	 * @see #getQueuingChannelType()
	 * @generated
	 */
	EAttribute getQueuingChannelType_MaxNoMessages();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getMaxTimeExpiration <em>Max Time Expiration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time Expiration</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getMaxTimeExpiration()
	 * @see #getQueuingChannelType()
	 * @generated
	 */
	EAttribute getQueuingChannelType_MaxTimeExpiration();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.RangeType
	 * @generated
	 */
	EClass getRangeType();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.RangeType#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.RangeType#getBase()
	 * @see #getRangeType()
	 * @generated
	 */
	EAttribute getRangeType_Base();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.RangeType#getNoPorts <em>No Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Ports</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.RangeType#getNoPorts()
	 * @see #getRangeType()
	 * @generated
	 */
	EAttribute getRangeType_NoPorts();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.RegionType <em>Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.RegionType
	 * @generated
	 */
	EClass getRegionType();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.RegionType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.RegionType#getSize()
	 * @see #getRegionType()
	 * @generated
	 */
	EAttribute getRegionType_Size();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.RegionType#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.RegionType#getStart()
	 * @see #getRegionType()
	 * @generated
	 */
	EAttribute getRegionType_Start();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.RegionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.RegionType#getType()
	 * @see #getRegionType()
	 * @generated
	 */
	EAttribute getRegionType_Type();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.RestrictedType <em>Restricted Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restricted Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.RestrictedType
	 * @generated
	 */
	EClass getRestrictedType();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.RestrictedType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.RestrictedType#getAddress()
	 * @see #getRestrictedType()
	 * @generated
	 */
	EAttribute getRestrictedType_Address();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.RestrictedType#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.RestrictedType#getMask()
	 * @see #getRestrictedType()
	 * @generated
	 */
	EAttribute getRestrictedType_Mask();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.RswE <em>Rsw E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rsw E</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.RswE
	 * @generated
	 */
	EClass getRswE();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.RswE#getPhysicalMemoryAreas <em>Physical Memory Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Physical Memory Areas</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.RswE#getPhysicalMemoryAreas()
	 * @see #getRswE()
	 * @generated
	 */
	EReference getRswE_PhysicalMemoryAreas();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType <em>Sampling Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sampling Channel Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType
	 * @generated
	 */
	EClass getSamplingChannelType();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getSource()
	 * @see #getSamplingChannelType()
	 * @generated
	 */
	EReference getSamplingChannelType_Source();

	/**
	 * Returns the meta object for the attribute list '{@link com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getGroup()
	 * @see #getSamplingChannelType()
	 * @generated
	 */
	EAttribute getSamplingChannelType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Destination</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getDestination()
	 * @see #getSamplingChannelType()
	 * @generated
	 */
	EReference getSamplingChannelType_Destination();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getMaxMessageLength <em>Max Message Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Message Length</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getMaxMessageLength()
	 * @see #getSamplingChannelType()
	 * @generated
	 */
	EAttribute getSamplingChannelType_MaxMessageLength();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getRefreshPeriod <em>Refresh Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Period</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getRefreshPeriod()
	 * @see #getSamplingChannelType()
	 * @generated
	 */
	EAttribute getSamplingChannelType_RefreshPeriod();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.SlotType <em>Slot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SlotType
	 * @generated
	 */
	EClass getSlotType();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.SlotType#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SlotType#getDuration()
	 * @see #getSlotType()
	 * @generated
	 */
	EAttribute getSlotType_Duration();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.SlotType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SlotType#getId()
	 * @see #getSlotType()
	 * @generated
	 */
	EAttribute getSlotType_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.SlotType#getPartitionId <em>Partition Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partition Id</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SlotType#getPartitionId()
	 * @see #getSlotType()
	 * @generated
	 */
	EAttribute getSlotType_PartitionId();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.SlotType#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SlotType#getStart()
	 * @see #getSlotType()
	 * @generated
	 */
	EAttribute getSlotType_Start();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType <em>System Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Description Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType
	 * @generated
	 */
	EClass getSystemDescriptionType();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getHwDescription <em>Hw Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hw Description</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getHwDescription()
	 * @see #getSystemDescriptionType()
	 * @generated
	 */
	EReference getSystemDescriptionType_HwDescription();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getXMHypervisor <em>XM Hypervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XM Hypervisor</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getXMHypervisor()
	 * @see #getSystemDescriptionType()
	 * @generated
	 */
	EReference getSystemDescriptionType_XMHypervisor();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getResidentSw <em>Resident Sw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resident Sw</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getResidentSw()
	 * @see #getSystemDescriptionType()
	 * @generated
	 */
	EReference getSystemDescriptionType_ResidentSw();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getPartitionTable <em>Partition Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partition Table</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getPartitionTable()
	 * @see #getSystemDescriptionType()
	 * @generated
	 */
	EReference getSystemDescriptionType_PartitionTable();

	/**
	 * Returns the meta object for the containment reference '{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channels</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getChannels()
	 * @see #getSystemDescriptionType()
	 * @generated
	 */
	EReference getSystemDescriptionType_Channels();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getName()
	 * @see #getSystemDescriptionType()
	 * @generated
	 */
	EAttribute getSystemDescriptionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getVersion()
	 * @see #getSystemDescriptionType()
	 * @generated
	 */
	EAttribute getSystemDescriptionType_Version();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.TemporalRequirementsType <em>Temporal Requirements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Requirements Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.TemporalRequirementsType
	 * @generated
	 */
	EClass getTemporalRequirementsType();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.TemporalRequirementsType#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.TemporalRequirementsType#getDuration()
	 * @see #getTemporalRequirementsType()
	 * @generated
	 */
	EAttribute getTemporalRequirementsType_Duration();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.TemporalRequirementsType#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.TemporalRequirementsType#getPeriod()
	 * @see #getTemporalRequirementsType()
	 * @generated
	 */
	EAttribute getTemporalRequirementsType_Period();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.TraceE <em>Trace E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace E</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.TraceE
	 * @generated
	 */
	EClass getTraceE();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.TraceE#getBitmask <em>Bitmask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bitmask</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.TraceE#getBitmask()
	 * @see #getTraceE()
	 * @generated
	 */
	EAttribute getTraceE_Bitmask();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.TraceE#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.TraceE#getDevice()
	 * @see #getTraceE()
	 * @generated
	 */
	EAttribute getTraceE_Device();

	/**
	 * Returns the meta object for class '{@link com.spacebel.emf.xtratum.modeling.xmc.UartType <em>Uart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uart Type</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.UartType
	 * @generated
	 */
	EClass getUartType();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.UartType#getBaudRate <em>Baud Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baud Rate</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.UartType#getBaudRate()
	 * @see #getUartType()
	 * @generated
	 */
	EAttribute getUartType_BaudRate();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.UartType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.UartType#getId()
	 * @see #getUartType()
	 * @generated
	 */
	EAttribute getUartType_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.spacebel.emf.xtratum.modeling.xmc.UartType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.UartType#getName()
	 * @see #getUartType()
	 * @generated
	 */
	EAttribute getUartType_Name();

	/**
	 * Returns the meta object for enum '{@link com.spacebel.emf.xtratum.modeling.xmc.DirectionT <em>Direction T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction T</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DirectionT
	 * @generated
	 */
	EEnum getDirectionT();

	/**
	 * Returns the meta object for enum '{@link com.spacebel.emf.xtratum.modeling.xmc.DisciplineT <em>Discipline T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Discipline T</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DisciplineT
	 * @generated
	 */
	EEnum getDisciplineT();

	/**
	 * Returns the meta object for enum '{@link com.spacebel.emf.xtratum.modeling.xmc.HmActionT <em>Hm Action T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hm Action T</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HmActionT
	 * @generated
	 */
	EEnum getHmActionT();

	/**
	 * Returns the meta object for enum '{@link com.spacebel.emf.xtratum.modeling.xmc.HmStringT <em>Hm String T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hm String T</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HmStringT
	 * @generated
	 */
	EEnum getHmStringT();

	/**
	 * Returns the meta object for enum '{@link com.spacebel.emf.xtratum.modeling.xmc.MemAreaFlagsT <em>Mem Area Flags T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mem Area Flags T</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemAreaFlagsT
	 * @generated
	 */
	EEnum getMemAreaFlagsT();

	/**
	 * Returns the meta object for enum '{@link com.spacebel.emf.xtratum.modeling.xmc.MemRegionT <em>Mem Region T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mem Region T</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemRegionT
	 * @generated
	 */
	EEnum getMemRegionT();

	/**
	 * Returns the meta object for enum '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionFlagsT <em>Partition Flags T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Partition Flags T</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionFlagsT
	 * @generated
	 */
	EEnum getPartitionFlagsT();

	/**
	 * Returns the meta object for enum '{@link com.spacebel.emf.xtratum.modeling.xmc.PortTypeT <em>Port Type T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Type T</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PortTypeT
	 * @generated
	 */
	EEnum getPortTypeT();

	/**
	 * Returns the meta object for enum '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorFeaturesT <em>Processor Features T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processor Features T</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ProcessorFeaturesT
	 * @generated
	 */
	EEnum getProcessorFeaturesT();

	/**
	 * Returns the meta object for enum '{@link com.spacebel.emf.xtratum.modeling.xmc.YntfT <em>Yntf T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Yntf T</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.YntfT
	 * @generated
	 */
	EEnum getYntfT();

	/**
	 * Returns the meta object for data type '{@link com.spacebel.emf.xtratum.modeling.xmc.DirectionT <em>Direction TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Direction TObject</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DirectionT
	 * @model instanceClass="com.spacebel.emf.xtratum.modeling.xmc.DirectionT"
	 *        extendedMetaData="name='direction_t:Object' baseType='direction_t'"
	 * @generated
	 */
	EDataType getDirectionTObject();

	/**
	 * Returns the meta object for data type '{@link com.spacebel.emf.xtratum.modeling.xmc.DisciplineT <em>Discipline TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Discipline TObject</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DisciplineT
	 * @model instanceClass="com.spacebel.emf.xtratum.modeling.xmc.DisciplineT"
	 *        extendedMetaData="name='discipline_t:Object' baseType='discipline_t'"
	 * @generated
	 */
	EDataType getDisciplineTObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Freq Unit T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Freq Unit T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='freqUnit_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[0-9]+(.[0-9]+)?([MK][Hh]z)'"
	 * @generated
	 */
	EDataType getFreqUnitT();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hex T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hex T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='hex_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='0x[0-9a-fA-F]+'"
	 * @generated
	 */
	EDataType getHexT();

	/**
	 * Returns the meta object for data type '{@link com.spacebel.emf.xtratum.modeling.xmc.HmActionT <em>Hm Action TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hm Action TObject</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HmActionT
	 * @model instanceClass="com.spacebel.emf.xtratum.modeling.xmc.HmActionT"
	 *        extendedMetaData="name='hmAction_t:Object' baseType='hmAction_t'"
	 * @generated
	 */
	EDataType getHmActionTObject();

	/**
	 * Returns the meta object for data type '{@link com.spacebel.emf.xtratum.modeling.xmc.HmStringT <em>Hm String TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hm String TObject</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HmStringT
	 * @model instanceClass="com.spacebel.emf.xtratum.modeling.xmc.HmStringT"
	 *        extendedMetaData="name='hmString_t:Object' baseType='hmString_t'"
	 * @generated
	 */
	EDataType getHmStringTObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Hw Irq Id List T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hw Irq Id List T</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='hwIrqIdList_t' itemType='hwIrqId_t'"
	 * @generated
	 */
	EDataType getHwIrqIdListT();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Hw Irq Id T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hw Irq Id T</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='hwIrqId_t' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='0' maxExclusive='32'"
	 * @generated
	 */
	EDataType getHwIrqIdT();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Id List T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Id List T</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='idList_t' itemType='id_t'"
	 * @generated
	 */
	EDataType getIdListT();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Id String T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Id String T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='idString_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1'"
	 * @generated
	 */
	EDataType getIdStringT();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Id T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Id T</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='id_t' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='0'"
	 * @generated
	 */
	EDataType getIdT();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Mem Area Flags List T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mem Area Flags List T</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='memAreaFlagsList_t' itemType='memAreaFlags_t'"
	 * @generated
	 */
	EDataType getMemAreaFlagsListT();

	/**
	 * Returns the meta object for data type '{@link com.spacebel.emf.xtratum.modeling.xmc.MemAreaFlagsT <em>Mem Area Flags TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mem Area Flags TObject</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemAreaFlagsT
	 * @model instanceClass="com.spacebel.emf.xtratum.modeling.xmc.MemAreaFlagsT"
	 *        extendedMetaData="name='memAreaFlags_t:Object' baseType='memAreaFlags_t'"
	 * @generated
	 */
	EDataType getMemAreaFlagsTObject();

	/**
	 * Returns the meta object for data type '{@link com.spacebel.emf.xtratum.modeling.xmc.MemRegionT <em>Mem Region TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mem Region TObject</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemRegionT
	 * @model instanceClass="com.spacebel.emf.xtratum.modeling.xmc.MemRegionT"
	 *        extendedMetaData="name='memRegion_t:Object' baseType='memRegion_t'"
	 * @generated
	 */
	EDataType getMemRegionTObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Partition Flags List T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Partition Flags List T</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='partitionFlagsList_t' itemType='partitionFlags_t'"
	 * @generated
	 */
	EDataType getPartitionFlagsListT();

	/**
	 * Returns the meta object for data type '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionFlagsT <em>Partition Flags TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Partition Flags TObject</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionFlagsT
	 * @model instanceClass="com.spacebel.emf.xtratum.modeling.xmc.PartitionFlagsT"
	 *        extendedMetaData="name='partitionFlags_t:Object' baseType='partitionFlags_t'"
	 * @generated
	 */
	EDataType getPartitionFlagsTObject();

	/**
	 * Returns the meta object for data type '{@link com.spacebel.emf.xtratum.modeling.xmc.PortTypeT <em>Port Type TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port Type TObject</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PortTypeT
	 * @model instanceClass="com.spacebel.emf.xtratum.modeling.xmc.PortTypeT"
	 *        extendedMetaData="name='portType_t:Object' baseType='portType_t'"
	 * @generated
	 */
	EDataType getPortTypeTObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Processor Features List T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Processor Features List T</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='processorFeaturesList_t' itemType='processorFeatures_t'"
	 * @generated
	 */
	EDataType getProcessorFeaturesListT();

	/**
	 * Returns the meta object for data type '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorFeaturesT <em>Processor Features TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Processor Features TObject</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ProcessorFeaturesT
	 * @model instanceClass="com.spacebel.emf.xtratum.modeling.xmc.ProcessorFeaturesT"
	 *        extendedMetaData="name='processorFeatures_t:Object' baseType='processorFeatures_t'"
	 * @generated
	 */
	EDataType getProcessorFeaturesTObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Size Unit T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Size Unit T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='sizeUnit_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[0-9]+(.[0-9]+)?([MK]?B)'"
	 * @generated
	 */
	EDataType getSizeUnitT();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Time Unit T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Unit T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='timeUnit_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[0-9]+(.[0-9]+)?([mu]?[sS])'"
	 * @generated
	 */
	EDataType getTimeUnitT();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='version_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[0-9]+.[0-9]+.[0-9]+'"
	 * @generated
	 */
	EDataType getVersionT();

	/**
	 * Returns the meta object for data type '{@link com.spacebel.emf.xtratum.modeling.xmc.YntfT <em>Yntf TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Yntf TObject</em>'.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.YntfT
	 * @model instanceClass="com.spacebel.emf.xtratum.modeling.xmc.YntfT"
	 *        extendedMetaData="name='yntf_t:Object' baseType='yntf_t'"
	 * @generated
	 */
	EDataType getYntfTObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XmcFactory getXmcFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.AreaTypeImpl <em>Area Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.AreaTypeImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getAreaType()
		 * @generated
		 */
		EClass AREA_TYPE = eINSTANCE.getAreaType();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__FLAGS = eINSTANCE.getAreaType_Flags();

		/**
		 * The meta object literal for the '<em><b>Mapped At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__MAPPED_AT = eINSTANCE.getAreaType_MappedAt();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__NAME = eINSTANCE.getAreaType_Name();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__SIZE = eINSTANCE.getAreaType_Size();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__START = eINSTANCE.getAreaType_Start();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.ChannelsEImpl <em>Channels E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.ChannelsEImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getChannelsE()
		 * @generated
		 */
		EClass CHANNELS_E = eINSTANCE.getChannelsE();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNELS_E__GROUP = eINSTANCE.getChannelsE_Group();

		/**
		 * The meta object literal for the '<em><b>Sampling Channel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNELS_E__SAMPLING_CHANNEL = eINSTANCE.getChannelsE_SamplingChannel();

		/**
		 * The meta object literal for the '<em><b>Queuing Channel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNELS_E__QUEUING_CHANNEL = eINSTANCE.getChannelsE_QueuingChannel();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.CyclicPlanEImpl <em>Cyclic Plan E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.CyclicPlanEImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getCyclicPlanE()
		 * @generated
		 */
		EClass CYCLIC_PLAN_E = eINSTANCE.getCyclicPlanE();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYCLIC_PLAN_E__GROUP = eINSTANCE.getCyclicPlanE_Group();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYCLIC_PLAN_E__PLAN = eINSTANCE.getCyclicPlanE_Plan();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.DevicesEImpl <em>Devices E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.DevicesEImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getDevicesE()
		 * @generated
		 */
		EClass DEVICES_E = eINSTANCE.getDevicesE();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICES_E__GROUP = eINSTANCE.getDevicesE_Group();

		/**
		 * The meta object literal for the '<em><b>Memory Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICES_E__MEMORY_BLOCK = eINSTANCE.getDevicesE_MemoryBlock();

		/**
		 * The meta object literal for the '<em><b>Uart</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICES_E__UART = eINSTANCE.getDevicesE_Uart();

		/**
		 * The meta object literal for the '<em><b>Null</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICES_E__NULL = eINSTANCE.getDevicesE_Null();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.DocumentRootImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>System Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SYSTEM_DESCRIPTION = eINSTANCE.getDocumentRoot_SystemDescription();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.EventTypeImpl <em>Event Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.EventTypeImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getEventType()
		 * @generated
		 */
		EClass EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TYPE__ACTION = eINSTANCE.getEventType_Action();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TYPE__LOG = eINSTANCE.getEventType_Log();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TYPE__NAME = eINSTANCE.getEventType_Name();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HealthMonitorEImpl <em>Health Monitor E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.HealthMonitorEImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHealthMonitorE()
		 * @generated
		 */
		EClass HEALTH_MONITOR_E = eINSTANCE.getHealthMonitorE();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_MONITOR_E__GROUP = eINSTANCE.getHealthMonitorE_Group();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEALTH_MONITOR_E__EVENT = eINSTANCE.getHealthMonitorE_Event();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HwDescriptionEImpl <em>Hw Description E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.HwDescriptionEImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHwDescriptionE()
		 * @generated
		 */
		EClass HW_DESCRIPTION_E = eINSTANCE.getHwDescriptionE();

		/**
		 * The meta object literal for the '<em><b>Memory Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_DESCRIPTION_E__MEMORY_LAYOUT = eINSTANCE.getHwDescriptionE_MemoryLayout();

		/**
		 * The meta object literal for the '<em><b>Processor Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_DESCRIPTION_E__PROCESSOR_TABLE = eINSTANCE.getHwDescriptionE_ProcessorTable();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_DESCRIPTION_E__DEVICES = eINSTANCE.getHwDescriptionE_Devices();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HwResourcesEImpl <em>Hw Resources E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.HwResourcesEImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHwResourcesE()
		 * @generated
		 */
		EClass HW_RESOURCES_E = eINSTANCE.getHwResourcesE();

		/**
		 * The meta object literal for the '<em><b>Io Ports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_RESOURCES_E__IO_PORTS = eINSTANCE.getHwResourcesE_IoPorts();

		/**
		 * The meta object literal for the '<em><b>Interrupts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_RESOURCES_E__INTERRUPTS = eINSTANCE.getHwResourcesE_Interrupts();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HypervisorEImpl <em>Hypervisor E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.HypervisorEImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHypervisorE()
		 * @generated
		 */
		EClass HYPERVISOR_E = eINSTANCE.getHypervisorE();

		/**
		 * The meta object literal for the '<em><b>Physical Memory Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPERVISOR_E__PHYSICAL_MEMORY_AREA = eINSTANCE.getHypervisorE_PhysicalMemoryArea();

		/**
		 * The meta object literal for the '<em><b>Health Monitor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPERVISOR_E__HEALTH_MONITOR = eINSTANCE.getHypervisorE_HealthMonitor();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPERVISOR_E__TRACE = eINSTANCE.getHypervisorE_Trace();

		/**
		 * The meta object literal for the '<em><b>Console</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR_E__CONSOLE = eINSTANCE.getHypervisorE_Console();

		/**
		 * The meta object literal for the '<em><b>Health Monitor App Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR_E__HEALTH_MONITOR_APP_DEVICE = eINSTANCE.getHypervisorE_HealthMonitorAppDevice();

		/**
		 * The meta object literal for the '<em><b>Health Monitor Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR_E__HEALTH_MONITOR_DEVICE = eINSTANCE.getHypervisorE_HealthMonitorDevice();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HypMemoryAreaEImpl <em>Hyp Memory Area E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.HypMemoryAreaEImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHypMemoryAreaE()
		 * @generated
		 */
		EClass HYP_MEMORY_AREA_E = eINSTANCE.getHypMemoryAreaE();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYP_MEMORY_AREA_E__FLAGS = eINSTANCE.getHypMemoryAreaE_Flags();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYP_MEMORY_AREA_E__SIZE = eINSTANCE.getHypMemoryAreaE_Size();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.InterruptsTypeImpl <em>Interrupts Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.InterruptsTypeImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getInterruptsType()
		 * @generated
		 */
		EClass INTERRUPTS_TYPE = eINSTANCE.getInterruptsType();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERRUPTS_TYPE__LINES = eINSTANCE.getInterruptsType_Lines();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.IoPortsEImpl <em>Io Ports E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.IoPortsEImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getIoPortsE()
		 * @generated
		 */
		EClass IO_PORTS_E = eINSTANCE.getIoPortsE();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_PORTS_E__GROUP = eINSTANCE.getIoPortsE_Group();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_PORTS_E__RANGE = eINSTANCE.getIoPortsE_Range();

		/**
		 * The meta object literal for the '<em><b>Restricted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_PORTS_E__RESTRICTED = eINSTANCE.getIoPortsE_Restricted();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.IpcPortEImpl <em>Ipc Port E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.IpcPortEImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getIpcPortE()
		 * @generated
		 */
		EClass IPC_PORT_E = eINSTANCE.getIpcPortE();

		/**
		 * The meta object literal for the '<em><b>Partition Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPC_PORT_E__PARTITION_ID = eINSTANCE.getIpcPortE_PartitionId();

		/**
		 * The meta object literal for the '<em><b>Partition Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPC_PORT_E__PARTITION_NAME = eINSTANCE.getIpcPortE_PartitionName();

		/**
		 * The meta object literal for the '<em><b>Port Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPC_PORT_E__PORT_NAME = eINSTANCE.getIpcPortE_PortName();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.MemoryAreaEImpl <em>Memory Area E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.MemoryAreaEImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getMemoryAreaE()
		 * @generated
		 */
		EClass MEMORY_AREA_E = eINSTANCE.getMemoryAreaE();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_AREA_E__GROUP = eINSTANCE.getMemoryAreaE_Group();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_AREA_E__AREA = eINSTANCE.getMemoryAreaE_Area();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.MemoryBlockTypeImpl <em>Memory Block Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.MemoryBlockTypeImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getMemoryBlockType()
		 * @generated
		 */
		EClass MEMORY_BLOCK_TYPE = eINSTANCE.getMemoryBlockType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_BLOCK_TYPE__NAME = eINSTANCE.getMemoryBlockType_Name();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_BLOCK_TYPE__SIZE = eINSTANCE.getMemoryBlockType_Size();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_BLOCK_TYPE__START = eINSTANCE.getMemoryBlockType_Start();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.MemoryLayoutEImpl <em>Memory Layout E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.MemoryLayoutEImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getMemoryLayoutE()
		 * @generated
		 */
		EClass MEMORY_LAYOUT_E = eINSTANCE.getMemoryLayoutE();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_LAYOUT_E__GROUP = eINSTANCE.getMemoryLayoutE_Group();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_LAYOUT_E__REGION = eINSTANCE.getMemoryLayoutE_Region();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.NullTypeImpl <em>Null Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.NullTypeImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getNullType()
		 * @generated
		 */
		EClass NULL_TYPE = eINSTANCE.getNullType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NULL_TYPE__NAME = eINSTANCE.getNullType_Name();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionEImpl <em>Partition E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionEImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPartitionE()
		 * @generated
		 */
		EClass PARTITION_E = eINSTANCE.getPartitionE();

		/**
		 * The meta object literal for the '<em><b>Physical Memory Areas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_E__PHYSICAL_MEMORY_AREAS = eINSTANCE.getPartitionE_PhysicalMemoryAreas();

		/**
		 * The meta object literal for the '<em><b>Temporal Requirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_E__TEMPORAL_REQUIREMENTS = eINSTANCE.getPartitionE_TemporalRequirements();

		/**
		 * The meta object literal for the '<em><b>Health Monitor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_E__HEALTH_MONITOR = eINSTANCE.getPartitionE_HealthMonitor();

		/**
		 * The meta object literal for the '<em><b>Hw Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_E__HW_RESOURCES = eINSTANCE.getPartitionE_HwResources();

		/**
		 * The meta object literal for the '<em><b>Port Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_E__PORT_TABLE = eINSTANCE.getPartitionE_PortTable();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_E__TRACE = eINSTANCE.getPartitionE_Trace();

		/**
		 * The meta object literal for the '<em><b>Boot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION_E__BOOT = eINSTANCE.getPartitionE_Boot();

		/**
		 * The meta object literal for the '<em><b>Console</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION_E__CONSOLE = eINSTANCE.getPartitionE_Console();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION_E__FLAGS = eINSTANCE.getPartitionE_Flags();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION_E__ID = eINSTANCE.getPartitionE_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION_E__NAME = eINSTANCE.getPartitionE_Name();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionPortsEImpl <em>Partition Ports E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionPortsEImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPartitionPortsE()
		 * @generated
		 */
		EClass PARTITION_PORTS_E = eINSTANCE.getPartitionPortsE();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION_PORTS_E__GROUP = eINSTANCE.getPartitionPortsE_Group();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_PORTS_E__PORT = eINSTANCE.getPartitionPortsE_Port();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionTableTypeImpl <em>Partition Table Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionTableTypeImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPartitionTableType()
		 * @generated
		 */
		EClass PARTITION_TABLE_TYPE = eINSTANCE.getPartitionTableType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION_TABLE_TYPE__GROUP = eINSTANCE.getPartitionTableType_Group();

		/**
		 * The meta object literal for the '<em><b>Partition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_TABLE_TYPE__PARTITION = eINSTANCE.getPartitionTableType_Partition();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PlanEImpl <em>Plan E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.PlanEImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPlanE()
		 * @generated
		 */
		EClass PLAN_E = eINSTANCE.getPlanE();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_E__GROUP = eINSTANCE.getPlanE_Group();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_E__SLOT = eINSTANCE.getPlanE_Slot();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_E__ID = eINSTANCE.getPlanE_Id();

		/**
		 * The meta object literal for the '<em><b>Major Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_E__MAJOR_FRAME = eINSTANCE.getPlanE_MajorFrame();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_E__NAME = eINSTANCE.getPlanE_Name();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PortTypeImpl <em>Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.PortTypeImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPortType()
		 * @generated
		 */
		EClass PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__DIRECTION = eINSTANCE.getPortType_Direction();

		/**
		 * The meta object literal for the '<em><b>Discipline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__DISCIPLINE = eINSTANCE.getPortType_Discipline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__NAME = eINSTANCE.getPortType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__TYPE = eINSTANCE.getPortType_Type();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.ProcessorEImpl <em>Processor E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.ProcessorEImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getProcessorE()
		 * @generated
		 */
		EClass PROCESSOR_E = eINSTANCE.getProcessorE();

		/**
		 * The meta object literal for the '<em><b>Cyclic Plan Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR_E__CYCLIC_PLAN_TABLE = eINSTANCE.getProcessorE_CyclicPlanTable();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_E__FEATURES = eINSTANCE.getProcessorE_Features();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_E__FREQUENCY = eINSTANCE.getProcessorE_Frequency();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_E__ID = eINSTANCE.getProcessorE_Id();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.ProcessorTableTypeImpl <em>Processor Table Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.ProcessorTableTypeImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getProcessorTableType()
		 * @generated
		 */
		EClass PROCESSOR_TABLE_TYPE = eINSTANCE.getProcessorTableType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_TABLE_TYPE__GROUP = eINSTANCE.getProcessorTableType_Group();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR_TABLE_TYPE__PROCESSOR = eINSTANCE.getProcessorTableType_Processor();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.QueuingChannelTypeImpl <em>Queuing Channel Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.QueuingChannelTypeImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getQueuingChannelType()
		 * @generated
		 */
		EClass QUEUING_CHANNEL_TYPE = eINSTANCE.getQueuingChannelType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUEUING_CHANNEL_TYPE__SOURCE = eINSTANCE.getQueuingChannelType_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUEUING_CHANNEL_TYPE__DESTINATION = eINSTANCE.getQueuingChannelType_Destination();

		/**
		 * The meta object literal for the '<em><b>Max Message Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUING_CHANNEL_TYPE__MAX_MESSAGE_LENGTH = eINSTANCE.getQueuingChannelType_MaxMessageLength();

		/**
		 * The meta object literal for the '<em><b>Max No Messages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUING_CHANNEL_TYPE__MAX_NO_MESSAGES = eINSTANCE.getQueuingChannelType_MaxNoMessages();

		/**
		 * The meta object literal for the '<em><b>Max Time Expiration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUING_CHANNEL_TYPE__MAX_TIME_EXPIRATION = eINSTANCE.getQueuingChannelType_MaxTimeExpiration();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.RangeTypeImpl <em>Range Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.RangeTypeImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getRangeType()
		 * @generated
		 */
		EClass RANGE_TYPE = eINSTANCE.getRangeType();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_TYPE__BASE = eINSTANCE.getRangeType_Base();

		/**
		 * The meta object literal for the '<em><b>No Ports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_TYPE__NO_PORTS = eINSTANCE.getRangeType_NoPorts();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.RegionTypeImpl <em>Region Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.RegionTypeImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getRegionType()
		 * @generated
		 */
		EClass REGION_TYPE = eINSTANCE.getRegionType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_TYPE__SIZE = eINSTANCE.getRegionType_Size();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_TYPE__START = eINSTANCE.getRegionType_Start();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_TYPE__TYPE = eINSTANCE.getRegionType_Type();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.RestrictedTypeImpl <em>Restricted Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.RestrictedTypeImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getRestrictedType()
		 * @generated
		 */
		EClass RESTRICTED_TYPE = eINSTANCE.getRestrictedType();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTED_TYPE__ADDRESS = eINSTANCE.getRestrictedType_Address();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTED_TYPE__MASK = eINSTANCE.getRestrictedType_Mask();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.RswEImpl <em>Rsw E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.RswEImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getRswE()
		 * @generated
		 */
		EClass RSW_E = eINSTANCE.getRswE();

		/**
		 * The meta object literal for the '<em><b>Physical Memory Areas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSW_E__PHYSICAL_MEMORY_AREAS = eINSTANCE.getRswE_PhysicalMemoryAreas();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.SamplingChannelTypeImpl <em>Sampling Channel Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.SamplingChannelTypeImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getSamplingChannelType()
		 * @generated
		 */
		EClass SAMPLING_CHANNEL_TYPE = eINSTANCE.getSamplingChannelType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLING_CHANNEL_TYPE__SOURCE = eINSTANCE.getSamplingChannelType_Source();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLING_CHANNEL_TYPE__GROUP = eINSTANCE.getSamplingChannelType_Group();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLING_CHANNEL_TYPE__DESTINATION = eINSTANCE.getSamplingChannelType_Destination();

		/**
		 * The meta object literal for the '<em><b>Max Message Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLING_CHANNEL_TYPE__MAX_MESSAGE_LENGTH = eINSTANCE.getSamplingChannelType_MaxMessageLength();

		/**
		 * The meta object literal for the '<em><b>Refresh Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLING_CHANNEL_TYPE__REFRESH_PERIOD = eINSTANCE.getSamplingChannelType_RefreshPeriod();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.SlotTypeImpl <em>Slot Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.SlotTypeImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getSlotType()
		 * @generated
		 */
		EClass SLOT_TYPE = eINSTANCE.getSlotType();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT_TYPE__DURATION = eINSTANCE.getSlotType_Duration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT_TYPE__ID = eINSTANCE.getSlotType_Id();

		/**
		 * The meta object literal for the '<em><b>Partition Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT_TYPE__PARTITION_ID = eINSTANCE.getSlotType_PartitionId();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT_TYPE__START = eINSTANCE.getSlotType_Start();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.SystemDescriptionTypeImpl <em>System Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.SystemDescriptionTypeImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getSystemDescriptionType()
		 * @generated
		 */
		EClass SYSTEM_DESCRIPTION_TYPE = eINSTANCE.getSystemDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Hw Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION_TYPE__HW_DESCRIPTION = eINSTANCE.getSystemDescriptionType_HwDescription();

		/**
		 * The meta object literal for the '<em><b>XM Hypervisor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION_TYPE__XM_HYPERVISOR = eINSTANCE.getSystemDescriptionType_XMHypervisor();

		/**
		 * The meta object literal for the '<em><b>Resident Sw</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION_TYPE__RESIDENT_SW = eINSTANCE.getSystemDescriptionType_ResidentSw();

		/**
		 * The meta object literal for the '<em><b>Partition Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION_TYPE__PARTITION_TABLE = eINSTANCE.getSystemDescriptionType_PartitionTable();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION_TYPE__CHANNELS = eINSTANCE.getSystemDescriptionType_Channels();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_DESCRIPTION_TYPE__NAME = eINSTANCE.getSystemDescriptionType_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_DESCRIPTION_TYPE__VERSION = eINSTANCE.getSystemDescriptionType_Version();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.TemporalRequirementsTypeImpl <em>Temporal Requirements Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.TemporalRequirementsTypeImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getTemporalRequirementsType()
		 * @generated
		 */
		EClass TEMPORAL_REQUIREMENTS_TYPE = eINSTANCE.getTemporalRequirementsType();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_REQUIREMENTS_TYPE__DURATION = eINSTANCE.getTemporalRequirementsType_Duration();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_REQUIREMENTS_TYPE__PERIOD = eINSTANCE.getTemporalRequirementsType_Period();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.TraceEImpl <em>Trace E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.TraceEImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getTraceE()
		 * @generated
		 */
		EClass TRACE_E = eINSTANCE.getTraceE();

		/**
		 * The meta object literal for the '<em><b>Bitmask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_E__BITMASK = eINSTANCE.getTraceE_Bitmask();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_E__DEVICE = eINSTANCE.getTraceE_Device();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.impl.UartTypeImpl <em>Uart Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.UartTypeImpl
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getUartType()
		 * @generated
		 */
		EClass UART_TYPE = eINSTANCE.getUartType();

		/**
		 * The meta object literal for the '<em><b>Baud Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UART_TYPE__BAUD_RATE = eINSTANCE.getUartType_BaudRate();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UART_TYPE__ID = eINSTANCE.getUartType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UART_TYPE__NAME = eINSTANCE.getUartType_Name();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.DirectionT <em>Direction T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.DirectionT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getDirectionT()
		 * @generated
		 */
		EEnum DIRECTION_T = eINSTANCE.getDirectionT();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.DisciplineT <em>Discipline T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.DisciplineT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getDisciplineT()
		 * @generated
		 */
		EEnum DISCIPLINE_T = eINSTANCE.getDisciplineT();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.HmActionT <em>Hm Action T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.HmActionT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHmActionT()
		 * @generated
		 */
		EEnum HM_ACTION_T = eINSTANCE.getHmActionT();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.HmStringT <em>Hm String T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.HmStringT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHmStringT()
		 * @generated
		 */
		EEnum HM_STRING_T = eINSTANCE.getHmStringT();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.MemAreaFlagsT <em>Mem Area Flags T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.MemAreaFlagsT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getMemAreaFlagsT()
		 * @generated
		 */
		EEnum MEM_AREA_FLAGS_T = eINSTANCE.getMemAreaFlagsT();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.MemRegionT <em>Mem Region T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.MemRegionT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getMemRegionT()
		 * @generated
		 */
		EEnum MEM_REGION_T = eINSTANCE.getMemRegionT();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionFlagsT <em>Partition Flags T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionFlagsT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPartitionFlagsT()
		 * @generated
		 */
		EEnum PARTITION_FLAGS_T = eINSTANCE.getPartitionFlagsT();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.PortTypeT <em>Port Type T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.PortTypeT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPortTypeT()
		 * @generated
		 */
		EEnum PORT_TYPE_T = eINSTANCE.getPortTypeT();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorFeaturesT <em>Processor Features T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.ProcessorFeaturesT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getProcessorFeaturesT()
		 * @generated
		 */
		EEnum PROCESSOR_FEATURES_T = eINSTANCE.getProcessorFeaturesT();

		/**
		 * The meta object literal for the '{@link com.spacebel.emf.xtratum.modeling.xmc.YntfT <em>Yntf T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.YntfT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getYntfT()
		 * @generated
		 */
		EEnum YNTF_T = eINSTANCE.getYntfT();

		/**
		 * The meta object literal for the '<em>Direction TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.DirectionT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getDirectionTObject()
		 * @generated
		 */
		EDataType DIRECTION_TOBJECT = eINSTANCE.getDirectionTObject();

		/**
		 * The meta object literal for the '<em>Discipline TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.DisciplineT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getDisciplineTObject()
		 * @generated
		 */
		EDataType DISCIPLINE_TOBJECT = eINSTANCE.getDisciplineTObject();

		/**
		 * The meta object literal for the '<em>Freq Unit T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getFreqUnitT()
		 * @generated
		 */
		EDataType FREQ_UNIT_T = eINSTANCE.getFreqUnitT();

		/**
		 * The meta object literal for the '<em>Hex T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHexT()
		 * @generated
		 */
		EDataType HEX_T = eINSTANCE.getHexT();

		/**
		 * The meta object literal for the '<em>Hm Action TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.HmActionT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHmActionTObject()
		 * @generated
		 */
		EDataType HM_ACTION_TOBJECT = eINSTANCE.getHmActionTObject();

		/**
		 * The meta object literal for the '<em>Hm String TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.HmStringT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHmStringTObject()
		 * @generated
		 */
		EDataType HM_STRING_TOBJECT = eINSTANCE.getHmStringTObject();

		/**
		 * The meta object literal for the '<em>Hw Irq Id List T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHwIrqIdListT()
		 * @generated
		 */
		EDataType HW_IRQ_ID_LIST_T = eINSTANCE.getHwIrqIdListT();

		/**
		 * The meta object literal for the '<em>Hw Irq Id T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getHwIrqIdT()
		 * @generated
		 */
		EDataType HW_IRQ_ID_T = eINSTANCE.getHwIrqIdT();

		/**
		 * The meta object literal for the '<em>Id List T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getIdListT()
		 * @generated
		 */
		EDataType ID_LIST_T = eINSTANCE.getIdListT();

		/**
		 * The meta object literal for the '<em>Id String T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getIdStringT()
		 * @generated
		 */
		EDataType ID_STRING_T = eINSTANCE.getIdStringT();

		/**
		 * The meta object literal for the '<em>Id T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getIdT()
		 * @generated
		 */
		EDataType ID_T = eINSTANCE.getIdT();

		/**
		 * The meta object literal for the '<em>Mem Area Flags List T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getMemAreaFlagsListT()
		 * @generated
		 */
		EDataType MEM_AREA_FLAGS_LIST_T = eINSTANCE.getMemAreaFlagsListT();

		/**
		 * The meta object literal for the '<em>Mem Area Flags TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.MemAreaFlagsT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getMemAreaFlagsTObject()
		 * @generated
		 */
		EDataType MEM_AREA_FLAGS_TOBJECT = eINSTANCE.getMemAreaFlagsTObject();

		/**
		 * The meta object literal for the '<em>Mem Region TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.MemRegionT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getMemRegionTObject()
		 * @generated
		 */
		EDataType MEM_REGION_TOBJECT = eINSTANCE.getMemRegionTObject();

		/**
		 * The meta object literal for the '<em>Partition Flags List T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPartitionFlagsListT()
		 * @generated
		 */
		EDataType PARTITION_FLAGS_LIST_T = eINSTANCE.getPartitionFlagsListT();

		/**
		 * The meta object literal for the '<em>Partition Flags TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionFlagsT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPartitionFlagsTObject()
		 * @generated
		 */
		EDataType PARTITION_FLAGS_TOBJECT = eINSTANCE.getPartitionFlagsTObject();

		/**
		 * The meta object literal for the '<em>Port Type TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.PortTypeT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getPortTypeTObject()
		 * @generated
		 */
		EDataType PORT_TYPE_TOBJECT = eINSTANCE.getPortTypeTObject();

		/**
		 * The meta object literal for the '<em>Processor Features List T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getProcessorFeaturesListT()
		 * @generated
		 */
		EDataType PROCESSOR_FEATURES_LIST_T = eINSTANCE.getProcessorFeaturesListT();

		/**
		 * The meta object literal for the '<em>Processor Features TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.ProcessorFeaturesT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getProcessorFeaturesTObject()
		 * @generated
		 */
		EDataType PROCESSOR_FEATURES_TOBJECT = eINSTANCE.getProcessorFeaturesTObject();

		/**
		 * The meta object literal for the '<em>Size Unit T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getSizeUnitT()
		 * @generated
		 */
		EDataType SIZE_UNIT_T = eINSTANCE.getSizeUnitT();

		/**
		 * The meta object literal for the '<em>Time Unit T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getTimeUnitT()
		 * @generated
		 */
		EDataType TIME_UNIT_T = eINSTANCE.getTimeUnitT();

		/**
		 * The meta object literal for the '<em>Version T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getVersionT()
		 * @generated
		 */
		EDataType VERSION_T = eINSTANCE.getVersionT();

		/**
		 * The meta object literal for the '<em>Yntf TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.spacebel.emf.xtratum.modeling.xmc.YntfT
		 * @see com.spacebel.emf.xtratum.modeling.xmc.impl.XmcPackageImpl#getYntfTObject()
		 * @generated
		 */
		EDataType YNTF_TOBJECT = eINSTANCE.getYntfTObject();

	}

} //XmcPackage
