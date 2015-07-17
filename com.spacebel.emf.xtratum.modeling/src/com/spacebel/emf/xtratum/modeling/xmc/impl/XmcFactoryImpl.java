/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.impl;

import com.spacebel.emf.xtratum.modeling.xmc.*;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmcFactoryImpl extends EFactoryImpl implements XmcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XmcFactory init() {
		try {
			XmcFactory theXmcFactory = (XmcFactory)EPackage.Registry.INSTANCE.getEFactory(XmcPackage.eNS_URI);
			if (theXmcFactory != null) {
				return theXmcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XmcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmcFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XmcPackage.AREA_TYPE: return createAreaType();
			case XmcPackage.CHANNELS_E: return createChannelsE();
			case XmcPackage.CYCLIC_PLAN_E: return createCyclicPlanE();
			case XmcPackage.DEVICES_E: return createDevicesE();
			case XmcPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case XmcPackage.EVENT_TYPE: return createEventType();
			case XmcPackage.HEALTH_MONITOR_E: return createHealthMonitorE();
			case XmcPackage.HW_DESCRIPTION_E: return createHwDescriptionE();
			case XmcPackage.HW_RESOURCES_E: return createHwResourcesE();
			case XmcPackage.HYPERVISOR_E: return createHypervisorE();
			case XmcPackage.HYP_MEMORY_AREA_E: return createHypMemoryAreaE();
			case XmcPackage.INTERRUPTS_TYPE: return createInterruptsType();
			case XmcPackage.IO_PORTS_E: return createIoPortsE();
			case XmcPackage.IPC_PORT_E: return createIpcPortE();
			case XmcPackage.MEMORY_AREA_E: return createMemoryAreaE();
			case XmcPackage.MEMORY_BLOCK_TYPE: return createMemoryBlockType();
			case XmcPackage.MEMORY_LAYOUT_E: return createMemoryLayoutE();
			case XmcPackage.NULL_TYPE: return createNullType();
			case XmcPackage.PARTITION_E: return createPartitionE();
			case XmcPackage.PARTITION_PORTS_E: return createPartitionPortsE();
			case XmcPackage.PARTITION_TABLE_TYPE: return createPartitionTableType();
			case XmcPackage.PLAN_E: return createPlanE();
			case XmcPackage.PORT_TYPE: return createPortType();
			case XmcPackage.PROCESSOR_E: return createProcessorE();
			case XmcPackage.PROCESSOR_TABLE_TYPE: return createProcessorTableType();
			case XmcPackage.QUEUING_CHANNEL_TYPE: return createQueuingChannelType();
			case XmcPackage.RANGE_TYPE: return createRangeType();
			case XmcPackage.REGION_TYPE: return createRegionType();
			case XmcPackage.RESTRICTED_TYPE: return createRestrictedType();
			case XmcPackage.RSW_E: return createRswE();
			case XmcPackage.SAMPLING_CHANNEL_TYPE: return createSamplingChannelType();
			case XmcPackage.SLOT_TYPE: return createSlotType();
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE: return createSystemDescriptionType();
			case XmcPackage.TEMPORAL_REQUIREMENTS_TYPE: return createTemporalRequirementsType();
			case XmcPackage.TRACE_E: return createTraceE();
			case XmcPackage.UART_TYPE: return createUartType();
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
			case XmcPackage.DIRECTION_T:
				return createDirectionTFromString(eDataType, initialValue);
			case XmcPackage.DISCIPLINE_T:
				return createDisciplineTFromString(eDataType, initialValue);
			case XmcPackage.HM_ACTION_T:
				return createHmActionTFromString(eDataType, initialValue);
			case XmcPackage.HM_STRING_T:
				return createHmStringTFromString(eDataType, initialValue);
			case XmcPackage.MEM_AREA_FLAGS_T:
				return createMemAreaFlagsTFromString(eDataType, initialValue);
			case XmcPackage.MEM_REGION_T:
				return createMemRegionTFromString(eDataType, initialValue);
			case XmcPackage.PARTITION_FLAGS_T:
				return createPartitionFlagsTFromString(eDataType, initialValue);
			case XmcPackage.PORT_TYPE_T:
				return createPortTypeTFromString(eDataType, initialValue);
			case XmcPackage.PROCESSOR_FEATURES_T:
				return createProcessorFeaturesTFromString(eDataType, initialValue);
			case XmcPackage.YNTF_T:
				return createYntfTFromString(eDataType, initialValue);
			case XmcPackage.DIRECTION_TOBJECT:
				return createDirectionTObjectFromString(eDataType, initialValue);
			case XmcPackage.DISCIPLINE_TOBJECT:
				return createDisciplineTObjectFromString(eDataType, initialValue);
			case XmcPackage.FREQ_UNIT_T:
				return createFreqUnitTFromString(eDataType, initialValue);
			case XmcPackage.HEX_T:
				return createHexTFromString(eDataType, initialValue);
			case XmcPackage.HM_ACTION_TOBJECT:
				return createHmActionTObjectFromString(eDataType, initialValue);
			case XmcPackage.HM_STRING_TOBJECT:
				return createHmStringTObjectFromString(eDataType, initialValue);
			case XmcPackage.HW_IRQ_ID_LIST_T:
				return createHwIrqIdListTFromString(eDataType, initialValue);
			case XmcPackage.HW_IRQ_ID_T:
				return createHwIrqIdTFromString(eDataType, initialValue);
			case XmcPackage.ID_LIST_T:
				return createIdListTFromString(eDataType, initialValue);
			case XmcPackage.ID_STRING_T:
				return createIdStringTFromString(eDataType, initialValue);
			case XmcPackage.ID_T:
				return createIdTFromString(eDataType, initialValue);
			case XmcPackage.MEM_AREA_FLAGS_LIST_T:
				return createMemAreaFlagsListTFromString(eDataType, initialValue);
			case XmcPackage.MEM_AREA_FLAGS_TOBJECT:
				return createMemAreaFlagsTObjectFromString(eDataType, initialValue);
			case XmcPackage.MEM_REGION_TOBJECT:
				return createMemRegionTObjectFromString(eDataType, initialValue);
			case XmcPackage.PARTITION_FLAGS_LIST_T:
				return createPartitionFlagsListTFromString(eDataType, initialValue);
			case XmcPackage.PARTITION_FLAGS_TOBJECT:
				return createPartitionFlagsTObjectFromString(eDataType, initialValue);
			case XmcPackage.PORT_TYPE_TOBJECT:
				return createPortTypeTObjectFromString(eDataType, initialValue);
			case XmcPackage.PROCESSOR_FEATURES_LIST_T:
				return createProcessorFeaturesListTFromString(eDataType, initialValue);
			case XmcPackage.PROCESSOR_FEATURES_TOBJECT:
				return createProcessorFeaturesTObjectFromString(eDataType, initialValue);
			case XmcPackage.SIZE_UNIT_T:
				return createSizeUnitTFromString(eDataType, initialValue);
			case XmcPackage.TIME_UNIT_T:
				return createTimeUnitTFromString(eDataType, initialValue);
			case XmcPackage.VERSION_T:
				return createVersionTFromString(eDataType, initialValue);
			case XmcPackage.YNTF_TOBJECT:
				return createYntfTObjectFromString(eDataType, initialValue);
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
			case XmcPackage.DIRECTION_T:
				return convertDirectionTToString(eDataType, instanceValue);
			case XmcPackage.DISCIPLINE_T:
				return convertDisciplineTToString(eDataType, instanceValue);
			case XmcPackage.HM_ACTION_T:
				return convertHmActionTToString(eDataType, instanceValue);
			case XmcPackage.HM_STRING_T:
				return convertHmStringTToString(eDataType, instanceValue);
			case XmcPackage.MEM_AREA_FLAGS_T:
				return convertMemAreaFlagsTToString(eDataType, instanceValue);
			case XmcPackage.MEM_REGION_T:
				return convertMemRegionTToString(eDataType, instanceValue);
			case XmcPackage.PARTITION_FLAGS_T:
				return convertPartitionFlagsTToString(eDataType, instanceValue);
			case XmcPackage.PORT_TYPE_T:
				return convertPortTypeTToString(eDataType, instanceValue);
			case XmcPackage.PROCESSOR_FEATURES_T:
				return convertProcessorFeaturesTToString(eDataType, instanceValue);
			case XmcPackage.YNTF_T:
				return convertYntfTToString(eDataType, instanceValue);
			case XmcPackage.DIRECTION_TOBJECT:
				return convertDirectionTObjectToString(eDataType, instanceValue);
			case XmcPackage.DISCIPLINE_TOBJECT:
				return convertDisciplineTObjectToString(eDataType, instanceValue);
			case XmcPackage.FREQ_UNIT_T:
				return convertFreqUnitTToString(eDataType, instanceValue);
			case XmcPackage.HEX_T:
				return convertHexTToString(eDataType, instanceValue);
			case XmcPackage.HM_ACTION_TOBJECT:
				return convertHmActionTObjectToString(eDataType, instanceValue);
			case XmcPackage.HM_STRING_TOBJECT:
				return convertHmStringTObjectToString(eDataType, instanceValue);
			case XmcPackage.HW_IRQ_ID_LIST_T:
				return convertHwIrqIdListTToString(eDataType, instanceValue);
			case XmcPackage.HW_IRQ_ID_T:
				return convertHwIrqIdTToString(eDataType, instanceValue);
			case XmcPackage.ID_LIST_T:
				return convertIdListTToString(eDataType, instanceValue);
			case XmcPackage.ID_STRING_T:
				return convertIdStringTToString(eDataType, instanceValue);
			case XmcPackage.ID_T:
				return convertIdTToString(eDataType, instanceValue);
			case XmcPackage.MEM_AREA_FLAGS_LIST_T:
				return convertMemAreaFlagsListTToString(eDataType, instanceValue);
			case XmcPackage.MEM_AREA_FLAGS_TOBJECT:
				return convertMemAreaFlagsTObjectToString(eDataType, instanceValue);
			case XmcPackage.MEM_REGION_TOBJECT:
				return convertMemRegionTObjectToString(eDataType, instanceValue);
			case XmcPackage.PARTITION_FLAGS_LIST_T:
				return convertPartitionFlagsListTToString(eDataType, instanceValue);
			case XmcPackage.PARTITION_FLAGS_TOBJECT:
				return convertPartitionFlagsTObjectToString(eDataType, instanceValue);
			case XmcPackage.PORT_TYPE_TOBJECT:
				return convertPortTypeTObjectToString(eDataType, instanceValue);
			case XmcPackage.PROCESSOR_FEATURES_LIST_T:
				return convertProcessorFeaturesListTToString(eDataType, instanceValue);
			case XmcPackage.PROCESSOR_FEATURES_TOBJECT:
				return convertProcessorFeaturesTObjectToString(eDataType, instanceValue);
			case XmcPackage.SIZE_UNIT_T:
				return convertSizeUnitTToString(eDataType, instanceValue);
			case XmcPackage.TIME_UNIT_T:
				return convertTimeUnitTToString(eDataType, instanceValue);
			case XmcPackage.VERSION_T:
				return convertVersionTToString(eDataType, instanceValue);
			case XmcPackage.YNTF_TOBJECT:
				return convertYntfTObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaType createAreaType() {
		AreaTypeImpl areaType = new AreaTypeImpl();
		return areaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelsE createChannelsE() {
		ChannelsEImpl channelsE = new ChannelsEImpl();
		return channelsE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyclicPlanE createCyclicPlanE() {
		CyclicPlanEImpl cyclicPlanE = new CyclicPlanEImpl();
		return cyclicPlanE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicesE createDevicesE() {
		DevicesEImpl devicesE = new DevicesEImpl();
		return devicesE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventType() {
		EventTypeImpl eventType = new EventTypeImpl();
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthMonitorE createHealthMonitorE() {
		HealthMonitorEImpl healthMonitorE = new HealthMonitorEImpl();
		return healthMonitorE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDescriptionE createHwDescriptionE() {
		HwDescriptionEImpl hwDescriptionE = new HwDescriptionEImpl();
		return hwDescriptionE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwResourcesE createHwResourcesE() {
		HwResourcesEImpl hwResourcesE = new HwResourcesEImpl();
		return hwResourcesE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypervisorE createHypervisorE() {
		HypervisorEImpl hypervisorE = new HypervisorEImpl();
		return hypervisorE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypMemoryAreaE createHypMemoryAreaE() {
		HypMemoryAreaEImpl hypMemoryAreaE = new HypMemoryAreaEImpl();
		return hypMemoryAreaE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptsType createInterruptsType() {
		InterruptsTypeImpl interruptsType = new InterruptsTypeImpl();
		return interruptsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoPortsE createIoPortsE() {
		IoPortsEImpl ioPortsE = new IoPortsEImpl();
		return ioPortsE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpcPortE createIpcPortE() {
		IpcPortEImpl ipcPortE = new IpcPortEImpl();
		return ipcPortE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryAreaE createMemoryAreaE() {
		MemoryAreaEImpl memoryAreaE = new MemoryAreaEImpl();
		return memoryAreaE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryBlockType createMemoryBlockType() {
		MemoryBlockTypeImpl memoryBlockType = new MemoryBlockTypeImpl();
		return memoryBlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryLayoutE createMemoryLayoutE() {
		MemoryLayoutEImpl memoryLayoutE = new MemoryLayoutEImpl();
		return memoryLayoutE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullType createNullType() {
		NullTypeImpl nullType = new NullTypeImpl();
		return nullType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionE createPartitionE() {
		PartitionEImpl partitionE = new PartitionEImpl();
		return partitionE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionPortsE createPartitionPortsE() {
		PartitionPortsEImpl partitionPortsE = new PartitionPortsEImpl();
		return partitionPortsE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionTableType createPartitionTableType() {
		PartitionTableTypeImpl partitionTableType = new PartitionTableTypeImpl();
		return partitionTableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanE createPlanE() {
		PlanEImpl planE = new PlanEImpl();
		return planE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortType() {
		PortTypeImpl portType = new PortTypeImpl();
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorE createProcessorE() {
		ProcessorEImpl processorE = new ProcessorEImpl();
		return processorE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorTableType createProcessorTableType() {
		ProcessorTableTypeImpl processorTableType = new ProcessorTableTypeImpl();
		return processorTableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueuingChannelType createQueuingChannelType() {
		QueuingChannelTypeImpl queuingChannelType = new QueuingChannelTypeImpl();
		return queuingChannelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType createRangeType() {
		RangeTypeImpl rangeType = new RangeTypeImpl();
		return rangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionType createRegionType() {
		RegionTypeImpl regionType = new RegionTypeImpl();
		return regionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictedType createRestrictedType() {
		RestrictedTypeImpl restrictedType = new RestrictedTypeImpl();
		return restrictedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RswE createRswE() {
		RswEImpl rswE = new RswEImpl();
		return rswE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplingChannelType createSamplingChannelType() {
		SamplingChannelTypeImpl samplingChannelType = new SamplingChannelTypeImpl();
		return samplingChannelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotType createSlotType() {
		SlotTypeImpl slotType = new SlotTypeImpl();
		return slotType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemDescriptionType createSystemDescriptionType() {
		SystemDescriptionTypeImpl systemDescriptionType = new SystemDescriptionTypeImpl();
		return systemDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalRequirementsType createTemporalRequirementsType() {
		TemporalRequirementsTypeImpl temporalRequirementsType = new TemporalRequirementsTypeImpl();
		return temporalRequirementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceE createTraceE() {
		TraceEImpl traceE = new TraceEImpl();
		return traceE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UartType createUartType() {
		UartTypeImpl uartType = new UartTypeImpl();
		return uartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionT createDirectionTFromString(EDataType eDataType, String initialValue) {
		DirectionT result = DirectionT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisciplineT createDisciplineTFromString(EDataType eDataType, String initialValue) {
		DisciplineT result = DisciplineT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisciplineTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HmActionT createHmActionTFromString(EDataType eDataType, String initialValue) {
		HmActionT result = HmActionT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHmActionTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HmStringT createHmStringTFromString(EDataType eDataType, String initialValue) {
		HmStringT result = HmStringT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHmStringTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemAreaFlagsT createMemAreaFlagsTFromString(EDataType eDataType, String initialValue) {
		MemAreaFlagsT result = MemAreaFlagsT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemAreaFlagsTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemRegionT createMemRegionTFromString(EDataType eDataType, String initialValue) {
		MemRegionT result = MemRegionT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemRegionTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionFlagsT createPartitionFlagsTFromString(EDataType eDataType, String initialValue) {
		PartitionFlagsT result = PartitionFlagsT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartitionFlagsTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTypeT createPortTypeTFromString(EDataType eDataType, String initialValue) {
		PortTypeT result = PortTypeT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortTypeTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorFeaturesT createProcessorFeaturesTFromString(EDataType eDataType, String initialValue) {
		ProcessorFeaturesT result = ProcessorFeaturesT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessorFeaturesTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YntfT createYntfTFromString(EDataType eDataType, String initialValue) {
		YntfT result = YntfT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYntfTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionT createDirectionTObjectFromString(EDataType eDataType, String initialValue) {
		return createDirectionTFromString(XmcPackage.Literals.DIRECTION_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirectionTToString(XmcPackage.Literals.DIRECTION_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisciplineT createDisciplineTObjectFromString(EDataType eDataType, String initialValue) {
		return createDisciplineTFromString(XmcPackage.Literals.DISCIPLINE_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisciplineTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDisciplineTToString(XmcPackage.Literals.DISCIPLINE_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFreqUnitTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFreqUnitTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHexTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHexTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HmActionT createHmActionTObjectFromString(EDataType eDataType, String initialValue) {
		return createHmActionTFromString(XmcPackage.Literals.HM_ACTION_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHmActionTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHmActionTToString(XmcPackage.Literals.HM_ACTION_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HmStringT createHmStringTObjectFromString(EDataType eDataType, String initialValue) {
		return createHmStringTFromString(XmcPackage.Literals.HM_STRING_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHmStringTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHmStringTToString(XmcPackage.Literals.HM_STRING_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> createHwIrqIdListTFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<BigInteger> result = new ArrayList<BigInteger>();
		for (String item : split(initialValue)) {
			result.add(createHwIrqIdTFromString(XmcPackage.Literals.HW_IRQ_ID_T, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHwIrqIdListTToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertHwIrqIdTToString(XmcPackage.Literals.HW_IRQ_ID_T, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createHwIrqIdTFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHwIrqIdTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> createIdListTFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<BigInteger> result = new ArrayList<BigInteger>();
		for (String item : split(initialValue)) {
			result.add(createIdTFromString(XmcPackage.Literals.ID_T, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdListTToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertIdTToString(XmcPackage.Literals.ID_T, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdStringTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdStringTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createIdTFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<MemAreaFlagsT> createMemAreaFlagsListTFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<MemAreaFlagsT> result = new ArrayList<MemAreaFlagsT>();
		for (String item : split(initialValue)) {
			result.add(createMemAreaFlagsTFromString(XmcPackage.Literals.MEM_AREA_FLAGS_T, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemAreaFlagsListTToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertMemAreaFlagsTToString(XmcPackage.Literals.MEM_AREA_FLAGS_T, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemAreaFlagsT createMemAreaFlagsTObjectFromString(EDataType eDataType, String initialValue) {
		return createMemAreaFlagsTFromString(XmcPackage.Literals.MEM_AREA_FLAGS_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemAreaFlagsTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMemAreaFlagsTToString(XmcPackage.Literals.MEM_AREA_FLAGS_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemRegionT createMemRegionTObjectFromString(EDataType eDataType, String initialValue) {
		return createMemRegionTFromString(XmcPackage.Literals.MEM_REGION_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemRegionTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMemRegionTToString(XmcPackage.Literals.MEM_REGION_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<PartitionFlagsT> createPartitionFlagsListTFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<PartitionFlagsT> result = new ArrayList<PartitionFlagsT>();
		for (String item : split(initialValue)) {
			result.add(createPartitionFlagsTFromString(XmcPackage.Literals.PARTITION_FLAGS_T, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartitionFlagsListTToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertPartitionFlagsTToString(XmcPackage.Literals.PARTITION_FLAGS_T, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionFlagsT createPartitionFlagsTObjectFromString(EDataType eDataType, String initialValue) {
		return createPartitionFlagsTFromString(XmcPackage.Literals.PARTITION_FLAGS_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartitionFlagsTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPartitionFlagsTToString(XmcPackage.Literals.PARTITION_FLAGS_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTypeT createPortTypeTObjectFromString(EDataType eDataType, String initialValue) {
		return createPortTypeTFromString(XmcPackage.Literals.PORT_TYPE_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortTypeTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPortTypeTToString(XmcPackage.Literals.PORT_TYPE_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ProcessorFeaturesT> createProcessorFeaturesListTFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<ProcessorFeaturesT> result = new ArrayList<ProcessorFeaturesT>();
		for (String item : split(initialValue)) {
			result.add(createProcessorFeaturesTFromString(XmcPackage.Literals.PROCESSOR_FEATURES_T, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessorFeaturesListTToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertProcessorFeaturesTToString(XmcPackage.Literals.PROCESSOR_FEATURES_T, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorFeaturesT createProcessorFeaturesTObjectFromString(EDataType eDataType, String initialValue) {
		return createProcessorFeaturesTFromString(XmcPackage.Literals.PROCESSOR_FEATURES_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessorFeaturesTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProcessorFeaturesTToString(XmcPackage.Literals.PROCESSOR_FEATURES_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSizeUnitTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeUnitTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTimeUnitTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersionTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YntfT createYntfTObjectFromString(EDataType eDataType, String initialValue) {
		return createYntfTFromString(XmcPackage.Literals.YNTF_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYntfTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertYntfTToString(XmcPackage.Literals.YNTF_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmcPackage getXmcPackage() {
		return (XmcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XmcPackage getPackage() {
		return XmcPackage.eINSTANCE;
	}

} //XmcFactoryImpl
