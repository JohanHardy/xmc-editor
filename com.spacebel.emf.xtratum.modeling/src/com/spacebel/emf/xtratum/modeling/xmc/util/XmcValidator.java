/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.util;

import com.spacebel.emf.xtratum.modeling.xmc.*;

import java.math.BigInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage
 * @generated
 */
public class XmcValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final XmcValidator INSTANCE = new XmcValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.spacebel.emf.xtratum.modeling.xmc";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmcValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return XmcPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case XmcPackage.AREA_TYPE:
				return validateAreaType((AreaType)value, diagnostics, context);
			case XmcPackage.CHANNELS_E:
				return validateChannelsE((ChannelsE)value, diagnostics, context);
			case XmcPackage.CYCLIC_PLAN_E:
				return validateCyclicPlanE((CyclicPlanE)value, diagnostics, context);
			case XmcPackage.DEVICES_E:
				return validateDevicesE((DevicesE)value, diagnostics, context);
			case XmcPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case XmcPackage.EVENT_TYPE:
				return validateEventType((EventType)value, diagnostics, context);
			case XmcPackage.HEALTH_MONITOR_E:
				return validateHealthMonitorE((HealthMonitorE)value, diagnostics, context);
			case XmcPackage.HW_DESCRIPTION_E:
				return validateHwDescriptionE((HwDescriptionE)value, diagnostics, context);
			case XmcPackage.HW_RESOURCES_E:
				return validateHwResourcesE((HwResourcesE)value, diagnostics, context);
			case XmcPackage.HYPERVISOR_E:
				return validateHypervisorE((HypervisorE)value, diagnostics, context);
			case XmcPackage.HYP_MEMORY_AREA_E:
				return validateHypMemoryAreaE((HypMemoryAreaE)value, diagnostics, context);
			case XmcPackage.INTERRUPTS_TYPE:
				return validateInterruptsType((InterruptsType)value, diagnostics, context);
			case XmcPackage.IO_PORTS_E:
				return validateIoPortsE((IoPortsE)value, diagnostics, context);
			case XmcPackage.IPC_PORT_E:
				return validateIpcPortE((IpcPortE)value, diagnostics, context);
			case XmcPackage.MEMORY_AREA_E:
				return validateMemoryAreaE((MemoryAreaE)value, diagnostics, context);
			case XmcPackage.MEMORY_BLOCK_TYPE:
				return validateMemoryBlockType((MemoryBlockType)value, diagnostics, context);
			case XmcPackage.MEMORY_LAYOUT_E:
				return validateMemoryLayoutE((MemoryLayoutE)value, diagnostics, context);
			case XmcPackage.NULL_TYPE:
				return validateNullType((NullType)value, diagnostics, context);
			case XmcPackage.PARTITION_E:
				return validatePartitionE((PartitionE)value, diagnostics, context);
			case XmcPackage.PARTITION_PORTS_E:
				return validatePartitionPortsE((PartitionPortsE)value, diagnostics, context);
			case XmcPackage.PARTITION_TABLE_TYPE:
				return validatePartitionTableType((PartitionTableType)value, diagnostics, context);
			case XmcPackage.PLAN_E:
				return validatePlanE((PlanE)value, diagnostics, context);
			case XmcPackage.PORT_TYPE:
				return validatePortType((PortType)value, diagnostics, context);
			case XmcPackage.PROCESSOR_E:
				return validateProcessorE((ProcessorE)value, diagnostics, context);
			case XmcPackage.PROCESSOR_TABLE_TYPE:
				return validateProcessorTableType((ProcessorTableType)value, diagnostics, context);
			case XmcPackage.QUEUING_CHANNEL_TYPE:
				return validateQueuingChannelType((QueuingChannelType)value, diagnostics, context);
			case XmcPackage.RANGE_TYPE:
				return validateRangeType((RangeType)value, diagnostics, context);
			case XmcPackage.REGION_TYPE:
				return validateRegionType((RegionType)value, diagnostics, context);
			case XmcPackage.RESTRICTED_TYPE:
				return validateRestrictedType((RestrictedType)value, diagnostics, context);
			case XmcPackage.RSW_E:
				return validateRswE((RswE)value, diagnostics, context);
			case XmcPackage.SAMPLING_CHANNEL_TYPE:
				return validateSamplingChannelType((SamplingChannelType)value, diagnostics, context);
			case XmcPackage.SLOT_TYPE:
				return validateSlotType((SlotType)value, diagnostics, context);
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE:
				return validateSystemDescriptionType((SystemDescriptionType)value, diagnostics, context);
			case XmcPackage.TEMPORAL_REQUIREMENTS_TYPE:
				return validateTemporalRequirementsType((TemporalRequirementsType)value, diagnostics, context);
			case XmcPackage.TRACE_E:
				return validateTraceE((TraceE)value, diagnostics, context);
			case XmcPackage.UART_TYPE:
				return validateUartType((UartType)value, diagnostics, context);
			case XmcPackage.DIRECTION_T:
				return validateDirectionT((DirectionT)value, diagnostics, context);
			case XmcPackage.DISCIPLINE_T:
				return validateDisciplineT((DisciplineT)value, diagnostics, context);
			case XmcPackage.HM_ACTION_T:
				return validateHmActionT((HmActionT)value, diagnostics, context);
			case XmcPackage.HM_STRING_T:
				return validateHmStringT((HmStringT)value, diagnostics, context);
			case XmcPackage.MEM_AREA_FLAGS_T:
				return validateMemAreaFlagsT((MemAreaFlagsT)value, diagnostics, context);
			case XmcPackage.MEM_REGION_T:
				return validateMemRegionT((MemRegionT)value, diagnostics, context);
			case XmcPackage.PARTITION_FLAGS_T:
				return validatePartitionFlagsT((PartitionFlagsT)value, diagnostics, context);
			case XmcPackage.PORT_TYPE_T:
				return validatePortTypeT((PortTypeT)value, diagnostics, context);
			case XmcPackage.PROCESSOR_FEATURES_T:
				return validateProcessorFeaturesT((ProcessorFeaturesT)value, diagnostics, context);
			case XmcPackage.YNTF_T:
				return validateYntfT((YntfT)value, diagnostics, context);
			case XmcPackage.DIRECTION_TOBJECT:
				return validateDirectionTObject((DirectionT)value, diagnostics, context);
			case XmcPackage.DISCIPLINE_TOBJECT:
				return validateDisciplineTObject((DisciplineT)value, diagnostics, context);
			case XmcPackage.FREQ_UNIT_T:
				return validateFreqUnitT((String)value, diagnostics, context);
			case XmcPackage.HEX_T:
				return validateHexT((String)value, diagnostics, context);
			case XmcPackage.HM_ACTION_TOBJECT:
				return validateHmActionTObject((HmActionT)value, diagnostics, context);
			case XmcPackage.HM_STRING_TOBJECT:
				return validateHmStringTObject((HmStringT)value, diagnostics, context);
			case XmcPackage.HW_IRQ_ID_LIST_T:
				return validateHwIrqIdListT((List<?>)value, diagnostics, context);
			case XmcPackage.HW_IRQ_ID_T:
				return validateHwIrqIdT((BigInteger)value, diagnostics, context);
			case XmcPackage.ID_LIST_T:
				return validateIdListT((List<?>)value, diagnostics, context);
			case XmcPackage.ID_STRING_T:
				return validateIdStringT((String)value, diagnostics, context);
			case XmcPackage.ID_T:
				return validateIdT((BigInteger)value, diagnostics, context);
			case XmcPackage.MEM_AREA_FLAGS_LIST_T:
				return validateMemAreaFlagsListT((List<?>)value, diagnostics, context);
			case XmcPackage.MEM_AREA_FLAGS_TOBJECT:
				return validateMemAreaFlagsTObject((MemAreaFlagsT)value, diagnostics, context);
			case XmcPackage.MEM_REGION_TOBJECT:
				return validateMemRegionTObject((MemRegionT)value, diagnostics, context);
			case XmcPackage.PARTITION_FLAGS_LIST_T:
				return validatePartitionFlagsListT((List<?>)value, diagnostics, context);
			case XmcPackage.PARTITION_FLAGS_TOBJECT:
				return validatePartitionFlagsTObject((PartitionFlagsT)value, diagnostics, context);
			case XmcPackage.PORT_TYPE_TOBJECT:
				return validatePortTypeTObject((PortTypeT)value, diagnostics, context);
			case XmcPackage.PROCESSOR_FEATURES_LIST_T:
				return validateProcessorFeaturesListT((List<?>)value, diagnostics, context);
			case XmcPackage.PROCESSOR_FEATURES_TOBJECT:
				return validateProcessorFeaturesTObject((ProcessorFeaturesT)value, diagnostics, context);
			case XmcPackage.SIZE_UNIT_T:
				return validateSizeUnitT((String)value, diagnostics, context);
			case XmcPackage.TIME_UNIT_T:
				return validateTimeUnitT((String)value, diagnostics, context);
			case XmcPackage.VERSION_T:
				return validateVersionT((String)value, diagnostics, context);
			case XmcPackage.YNTF_TOBJECT:
				return validateYntfTObject((YntfT)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAreaType(AreaType areaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(areaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelsE(ChannelsE channelsE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(channelsE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCyclicPlanE(CyclicPlanE cyclicPlanE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cyclicPlanE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevicesE(DevicesE devicesE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(devicesE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventType(EventType eventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthMonitorE(HealthMonitorE healthMonitorE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(healthMonitorE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwDescriptionE(HwDescriptionE hwDescriptionE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwDescriptionE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwResourcesE(HwResourcesE hwResourcesE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwResourcesE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHypervisorE(HypervisorE hypervisorE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hypervisorE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHypMemoryAreaE(HypMemoryAreaE hypMemoryAreaE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hypMemoryAreaE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterruptsType(InterruptsType interruptsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interruptsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIoPortsE(IoPortsE ioPortsE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ioPortsE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpcPortE(IpcPortE ipcPortE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ipcPortE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryAreaE(MemoryAreaE memoryAreaE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memoryAreaE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryBlockType(MemoryBlockType memoryBlockType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memoryBlockType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryLayoutE(MemoryLayoutE memoryLayoutE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memoryLayoutE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullType(NullType nullType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nullType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartitionE(PartitionE partitionE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partitionE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartitionPortsE(PartitionPortsE partitionPortsE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partitionPortsE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartitionTableType(PartitionTableType partitionTableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partitionTableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanE(PlanE planE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortType(PortType portType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorE(ProcessorE processorE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processorE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorTableType(ProcessorTableType processorTableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processorTableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueuingChannelType(QueuingChannelType queuingChannelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queuingChannelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeType(RangeType rangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionType(RegionType regionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestrictedType(RestrictedType restrictedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restrictedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRswE(RswE rswE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rswE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSamplingChannelType(SamplingChannelType samplingChannelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(samplingChannelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlotType(SlotType slotType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slotType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemDescriptionType(SystemDescriptionType systemDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemDescriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporalRequirementsType(TemporalRequirementsType temporalRequirementsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(temporalRequirementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraceE(TraceE traceE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(traceE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUartType(UartType uartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uartType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionT(DirectionT directionT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisciplineT(DisciplineT disciplineT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHmActionT(HmActionT hmActionT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHmStringT(HmStringT hmStringT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemAreaFlagsT(MemAreaFlagsT memAreaFlagsT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemRegionT(MemRegionT memRegionT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartitionFlagsT(PartitionFlagsT partitionFlagsT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortTypeT(PortTypeT portTypeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorFeaturesT(ProcessorFeaturesT processorFeaturesT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYntfT(YntfT yntfT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionTObject(DirectionT directionTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisciplineTObject(DisciplineT disciplineTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreqUnitT(String freqUnitT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFreqUnitT_Pattern(freqUnitT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFreqUnitT_Pattern
	 */
	public static final  PatternMatcher [][] FREQ_UNIT_T__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]+(.[0-9]+)?([MK][Hh]z)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Freq Unit T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreqUnitT_Pattern(String freqUnitT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(XmcPackage.Literals.FREQ_UNIT_T, freqUnitT, FREQ_UNIT_T__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHexT(String hexT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHexT_Pattern(hexT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHexT_Pattern
	 */
	public static final  PatternMatcher [][] HEX_T__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0x[0-9a-fA-F]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Hex T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHexT_Pattern(String hexT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(XmcPackage.Literals.HEX_T, hexT, HEX_T__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHmActionTObject(HmActionT hmActionTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHmStringTObject(HmStringT hmStringTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwIrqIdListT(List<?> hwIrqIdListT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHwIrqIdListT_ItemType(hwIrqIdListT, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Hw Irq Id List T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwIrqIdListT_ItemType(List<?> hwIrqIdListT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = hwIrqIdListT.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XmcPackage.Literals.HW_IRQ_ID_T.isInstance(item)) {
				result &= validateHwIrqIdT((BigInteger)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XmcPackage.Literals.HW_IRQ_ID_T, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwIrqIdT(BigInteger hwIrqIdT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHwIrqIdT_Min(hwIrqIdT, diagnostics, context);
		if (result || diagnostics != null) result &= validateHwIrqIdT_Max(hwIrqIdT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHwIrqIdT_Min
	 */
	public static final BigInteger HW_IRQ_ID_T__MIN__VALUE = new BigInteger("0");

	/**
	 * Validates the Min constraint of '<em>Hw Irq Id T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwIrqIdT_Min(BigInteger hwIrqIdT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = hwIrqIdT.compareTo(HW_IRQ_ID_T__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(XmcPackage.Literals.HW_IRQ_ID_T, hwIrqIdT, HW_IRQ_ID_T__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHwIrqIdT_Max
	 */
	public static final BigInteger HW_IRQ_ID_T__MAX__VALUE = new BigInteger("32");

	/**
	 * Validates the Max constraint of '<em>Hw Irq Id T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwIrqIdT_Max(BigInteger hwIrqIdT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = hwIrqIdT.compareTo(HW_IRQ_ID_T__MAX__VALUE) < 0;
		if (!result && diagnostics != null)
			reportMaxViolation(XmcPackage.Literals.HW_IRQ_ID_T, hwIrqIdT, HW_IRQ_ID_T__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdListT(List<?> idListT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdListT_ItemType(idListT, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Id List T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdListT_ItemType(List<?> idListT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = idListT.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XmcPackage.Literals.ID_T.isInstance(item)) {
				result &= validateIdT((BigInteger)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XmcPackage.Literals.ID_T, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdStringT(String idStringT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdStringT_MinLength(idStringT, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Id String T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdStringT_MinLength(String idStringT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = idStringT.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(XmcPackage.Literals.ID_STRING_T, idStringT, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdT(BigInteger idT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdT_Min(idT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIdT_Min
	 */
	public static final BigInteger ID_T__MIN__VALUE = new BigInteger("0");

	/**
	 * Validates the Min constraint of '<em>Id T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdT_Min(BigInteger idT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = idT.compareTo(ID_T__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(XmcPackage.Literals.ID_T, idT, ID_T__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemAreaFlagsListT(List<?> memAreaFlagsListT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMemAreaFlagsListT_ItemType(memAreaFlagsListT, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Mem Area Flags List T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemAreaFlagsListT_ItemType(List<?> memAreaFlagsListT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = memAreaFlagsListT.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XmcPackage.Literals.MEM_AREA_FLAGS_T.isInstance(item)) {
				result &= validateMemAreaFlagsT((MemAreaFlagsT)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XmcPackage.Literals.MEM_AREA_FLAGS_T, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemAreaFlagsTObject(MemAreaFlagsT memAreaFlagsTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemRegionTObject(MemRegionT memRegionTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartitionFlagsListT(List<?> partitionFlagsListT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePartitionFlagsListT_ItemType(partitionFlagsListT, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Partition Flags List T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartitionFlagsListT_ItemType(List<?> partitionFlagsListT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = partitionFlagsListT.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XmcPackage.Literals.PARTITION_FLAGS_T.isInstance(item)) {
				result &= validatePartitionFlagsT((PartitionFlagsT)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XmcPackage.Literals.PARTITION_FLAGS_T, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartitionFlagsTObject(PartitionFlagsT partitionFlagsTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortTypeTObject(PortTypeT portTypeTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorFeaturesListT(List<?> processorFeaturesListT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateProcessorFeaturesListT_ItemType(processorFeaturesListT, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Processor Features List T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorFeaturesListT_ItemType(List<?> processorFeaturesListT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = processorFeaturesListT.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XmcPackage.Literals.PROCESSOR_FEATURES_T.isInstance(item)) {
				result &= validateProcessorFeaturesT((ProcessorFeaturesT)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XmcPackage.Literals.PROCESSOR_FEATURES_T, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorFeaturesTObject(ProcessorFeaturesT processorFeaturesTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizeUnitT(String sizeUnitT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSizeUnitT_Pattern(sizeUnitT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSizeUnitT_Pattern
	 */
	public static final  PatternMatcher [][] SIZE_UNIT_T__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]+(.[0-9]+)?([MK]?B)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Size Unit T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizeUnitT_Pattern(String sizeUnitT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(XmcPackage.Literals.SIZE_UNIT_T, sizeUnitT, SIZE_UNIT_T__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnitT(String timeUnitT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeUnitT_Pattern(timeUnitT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimeUnitT_Pattern
	 */
	public static final  PatternMatcher [][] TIME_UNIT_T__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]+(.[0-9]+)?([mu]?[sS])")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Time Unit T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnitT_Pattern(String timeUnitT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(XmcPackage.Literals.TIME_UNIT_T, timeUnitT, TIME_UNIT_T__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionT(String versionT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVersionT_Pattern(versionT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVersionT_Pattern
	 */
	public static final  PatternMatcher [][] VERSION_T__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]+.[0-9]+.[0-9]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Version T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionT_Pattern(String versionT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(XmcPackage.Literals.VERSION_T, versionT, VERSION_T__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYntfTObject(YntfT yntfTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //XmcValidator
