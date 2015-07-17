/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.util;

import com.spacebel.emf.xtratum.modeling.xmc.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage
 * @generated
 */
public class XmcSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XmcPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmcSwitch() {
		if (modelPackage == null) {
			modelPackage = XmcPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XmcPackage.AREA_TYPE: {
				AreaType areaType = (AreaType)theEObject;
				T result = caseAreaType(areaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.CHANNELS_E: {
				ChannelsE channelsE = (ChannelsE)theEObject;
				T result = caseChannelsE(channelsE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.CYCLIC_PLAN_E: {
				CyclicPlanE cyclicPlanE = (CyclicPlanE)theEObject;
				T result = caseCyclicPlanE(cyclicPlanE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.DEVICES_E: {
				DevicesE devicesE = (DevicesE)theEObject;
				T result = caseDevicesE(devicesE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.EVENT_TYPE: {
				EventType eventType = (EventType)theEObject;
				T result = caseEventType(eventType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.HEALTH_MONITOR_E: {
				HealthMonitorE healthMonitorE = (HealthMonitorE)theEObject;
				T result = caseHealthMonitorE(healthMonitorE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.HW_DESCRIPTION_E: {
				HwDescriptionE hwDescriptionE = (HwDescriptionE)theEObject;
				T result = caseHwDescriptionE(hwDescriptionE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.HW_RESOURCES_E: {
				HwResourcesE hwResourcesE = (HwResourcesE)theEObject;
				T result = caseHwResourcesE(hwResourcesE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.HYPERVISOR_E: {
				HypervisorE hypervisorE = (HypervisorE)theEObject;
				T result = caseHypervisorE(hypervisorE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.HYP_MEMORY_AREA_E: {
				HypMemoryAreaE hypMemoryAreaE = (HypMemoryAreaE)theEObject;
				T result = caseHypMemoryAreaE(hypMemoryAreaE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.INTERRUPTS_TYPE: {
				InterruptsType interruptsType = (InterruptsType)theEObject;
				T result = caseInterruptsType(interruptsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.IO_PORTS_E: {
				IoPortsE ioPortsE = (IoPortsE)theEObject;
				T result = caseIoPortsE(ioPortsE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.IPC_PORT_E: {
				IpcPortE ipcPortE = (IpcPortE)theEObject;
				T result = caseIpcPortE(ipcPortE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.MEMORY_AREA_E: {
				MemoryAreaE memoryAreaE = (MemoryAreaE)theEObject;
				T result = caseMemoryAreaE(memoryAreaE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.MEMORY_BLOCK_TYPE: {
				MemoryBlockType memoryBlockType = (MemoryBlockType)theEObject;
				T result = caseMemoryBlockType(memoryBlockType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.MEMORY_LAYOUT_E: {
				MemoryLayoutE memoryLayoutE = (MemoryLayoutE)theEObject;
				T result = caseMemoryLayoutE(memoryLayoutE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.NULL_TYPE: {
				NullType nullType = (NullType)theEObject;
				T result = caseNullType(nullType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.PARTITION_E: {
				PartitionE partitionE = (PartitionE)theEObject;
				T result = casePartitionE(partitionE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.PARTITION_PORTS_E: {
				PartitionPortsE partitionPortsE = (PartitionPortsE)theEObject;
				T result = casePartitionPortsE(partitionPortsE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.PARTITION_TABLE_TYPE: {
				PartitionTableType partitionTableType = (PartitionTableType)theEObject;
				T result = casePartitionTableType(partitionTableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.PLAN_E: {
				PlanE planE = (PlanE)theEObject;
				T result = casePlanE(planE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.PORT_TYPE: {
				PortType portType = (PortType)theEObject;
				T result = casePortType(portType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.PROCESSOR_E: {
				ProcessorE processorE = (ProcessorE)theEObject;
				T result = caseProcessorE(processorE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.PROCESSOR_TABLE_TYPE: {
				ProcessorTableType processorTableType = (ProcessorTableType)theEObject;
				T result = caseProcessorTableType(processorTableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.QUEUING_CHANNEL_TYPE: {
				QueuingChannelType queuingChannelType = (QueuingChannelType)theEObject;
				T result = caseQueuingChannelType(queuingChannelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.RANGE_TYPE: {
				RangeType rangeType = (RangeType)theEObject;
				T result = caseRangeType(rangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.REGION_TYPE: {
				RegionType regionType = (RegionType)theEObject;
				T result = caseRegionType(regionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.RESTRICTED_TYPE: {
				RestrictedType restrictedType = (RestrictedType)theEObject;
				T result = caseRestrictedType(restrictedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.RSW_E: {
				RswE rswE = (RswE)theEObject;
				T result = caseRswE(rswE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.SAMPLING_CHANNEL_TYPE: {
				SamplingChannelType samplingChannelType = (SamplingChannelType)theEObject;
				T result = caseSamplingChannelType(samplingChannelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.SLOT_TYPE: {
				SlotType slotType = (SlotType)theEObject;
				T result = caseSlotType(slotType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE: {
				SystemDescriptionType systemDescriptionType = (SystemDescriptionType)theEObject;
				T result = caseSystemDescriptionType(systemDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.TEMPORAL_REQUIREMENTS_TYPE: {
				TemporalRequirementsType temporalRequirementsType = (TemporalRequirementsType)theEObject;
				T result = caseTemporalRequirementsType(temporalRequirementsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.TRACE_E: {
				TraceE traceE = (TraceE)theEObject;
				T result = caseTraceE(traceE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmcPackage.UART_TYPE: {
				UartType uartType = (UartType)theEObject;
				T result = caseUartType(uartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaType(AreaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channels E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channels E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelsE(ChannelsE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cyclic Plan E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cyclic Plan E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCyclicPlanE(CyclicPlanE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Devices E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Devices E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevicesE(DevicesE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventType(EventType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Health Monitor E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Health Monitor E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthMonitorE(HealthMonitorE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Description E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Description E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHwDescriptionE(HwDescriptionE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Resources E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Resources E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHwResourcesE(HwResourcesE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hypervisor E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hypervisor E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHypervisorE(HypervisorE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hyp Memory Area E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hyp Memory Area E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHypMemoryAreaE(HypMemoryAreaE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interrupts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interrupts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterruptsType(InterruptsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io Ports E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io Ports E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoPortsE(IoPortsE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ipc Port E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ipc Port E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIpcPortE(IpcPortE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Area E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Area E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryAreaE(MemoryAreaE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Block Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Block Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryBlockType(MemoryBlockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Layout E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Layout E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryLayoutE(MemoryLayoutE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullType(NullType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartitionE(PartitionE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition Ports E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition Ports E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartitionPortsE(PartitionPortsE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartitionTableType(PartitionTableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanE(PlanE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortType(PortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessorE(ProcessorE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessorTableType(ProcessorTableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queuing Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queuing Channel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueuingChannelType(QueuingChannelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeType(RangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionType(RegionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restricted Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restricted Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictedType(RestrictedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rsw E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rsw E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRswE(RswE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampling Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampling Channel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSamplingChannelType(SamplingChannelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlotType(SlotType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemDescriptionType(SystemDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Requirements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Requirements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalRequirementsType(TemporalRequirementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceE(TraceE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uart Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uart Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUartType(UartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //XmcSwitch
