/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.util;

import com.spacebel.emf.xtratum.modeling.xmc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage
 * @generated
 */
public class XmcAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XmcPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmcAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XmcPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmcSwitch<Adapter> modelSwitch =
		new XmcSwitch<Adapter>() {
			@Override
			public Adapter caseAreaType(AreaType object) {
				return createAreaTypeAdapter();
			}
			@Override
			public Adapter caseChannelsE(ChannelsE object) {
				return createChannelsEAdapter();
			}
			@Override
			public Adapter caseCyclicPlanE(CyclicPlanE object) {
				return createCyclicPlanEAdapter();
			}
			@Override
			public Adapter caseDevicesE(DevicesE object) {
				return createDevicesEAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEventType(EventType object) {
				return createEventTypeAdapter();
			}
			@Override
			public Adapter caseHealthMonitorE(HealthMonitorE object) {
				return createHealthMonitorEAdapter();
			}
			@Override
			public Adapter caseHwDescriptionE(HwDescriptionE object) {
				return createHwDescriptionEAdapter();
			}
			@Override
			public Adapter caseHwResourcesE(HwResourcesE object) {
				return createHwResourcesEAdapter();
			}
			@Override
			public Adapter caseHypervisorE(HypervisorE object) {
				return createHypervisorEAdapter();
			}
			@Override
			public Adapter caseHypMemoryAreaE(HypMemoryAreaE object) {
				return createHypMemoryAreaEAdapter();
			}
			@Override
			public Adapter caseInterruptsType(InterruptsType object) {
				return createInterruptsTypeAdapter();
			}
			@Override
			public Adapter caseIoPortsE(IoPortsE object) {
				return createIoPortsEAdapter();
			}
			@Override
			public Adapter caseIpcPortE(IpcPortE object) {
				return createIpcPortEAdapter();
			}
			@Override
			public Adapter caseMemoryAreaE(MemoryAreaE object) {
				return createMemoryAreaEAdapter();
			}
			@Override
			public Adapter caseMemoryBlockType(MemoryBlockType object) {
				return createMemoryBlockTypeAdapter();
			}
			@Override
			public Adapter caseMemoryLayoutE(MemoryLayoutE object) {
				return createMemoryLayoutEAdapter();
			}
			@Override
			public Adapter caseNullType(NullType object) {
				return createNullTypeAdapter();
			}
			@Override
			public Adapter casePartitionE(PartitionE object) {
				return createPartitionEAdapter();
			}
			@Override
			public Adapter casePartitionPortsE(PartitionPortsE object) {
				return createPartitionPortsEAdapter();
			}
			@Override
			public Adapter casePartitionTableType(PartitionTableType object) {
				return createPartitionTableTypeAdapter();
			}
			@Override
			public Adapter casePlanE(PlanE object) {
				return createPlanEAdapter();
			}
			@Override
			public Adapter casePortType(PortType object) {
				return createPortTypeAdapter();
			}
			@Override
			public Adapter caseProcessorE(ProcessorE object) {
				return createProcessorEAdapter();
			}
			@Override
			public Adapter caseProcessorTableType(ProcessorTableType object) {
				return createProcessorTableTypeAdapter();
			}
			@Override
			public Adapter caseQueuingChannelType(QueuingChannelType object) {
				return createQueuingChannelTypeAdapter();
			}
			@Override
			public Adapter caseRangeType(RangeType object) {
				return createRangeTypeAdapter();
			}
			@Override
			public Adapter caseRegionType(RegionType object) {
				return createRegionTypeAdapter();
			}
			@Override
			public Adapter caseRestrictedType(RestrictedType object) {
				return createRestrictedTypeAdapter();
			}
			@Override
			public Adapter caseRswE(RswE object) {
				return createRswEAdapter();
			}
			@Override
			public Adapter caseSamplingChannelType(SamplingChannelType object) {
				return createSamplingChannelTypeAdapter();
			}
			@Override
			public Adapter caseSlotType(SlotType object) {
				return createSlotTypeAdapter();
			}
			@Override
			public Adapter caseSystemDescriptionType(SystemDescriptionType object) {
				return createSystemDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseTemporalRequirementsType(TemporalRequirementsType object) {
				return createTemporalRequirementsTypeAdapter();
			}
			@Override
			public Adapter caseTraceE(TraceE object) {
				return createTraceEAdapter();
			}
			@Override
			public Adapter caseUartType(UartType object) {
				return createUartTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType <em>Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.AreaType
	 * @generated
	 */
	public Adapter createAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.ChannelsE <em>Channels E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ChannelsE
	 * @generated
	 */
	public Adapter createChannelsEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.CyclicPlanE <em>Cyclic Plan E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.CyclicPlanE
	 * @generated
	 */
	public Adapter createCyclicPlanEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.DevicesE <em>Devices E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DevicesE
	 * @generated
	 */
	public Adapter createDevicesEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.EventType
	 * @generated
	 */
	public Adapter createEventTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.HealthMonitorE <em>Health Monitor E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HealthMonitorE
	 * @generated
	 */
	public Adapter createHealthMonitorEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE <em>Hw Description E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE
	 * @generated
	 */
	public Adapter createHwDescriptionEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.HwResourcesE <em>Hw Resources E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HwResourcesE
	 * @generated
	 */
	public Adapter createHwResourcesEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE <em>Hypervisor E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HypervisorE
	 * @generated
	 */
	public Adapter createHypervisorEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.HypMemoryAreaE <em>Hyp Memory Area E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HypMemoryAreaE
	 * @generated
	 */
	public Adapter createHypMemoryAreaEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.InterruptsType <em>Interrupts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.InterruptsType
	 * @generated
	 */
	public Adapter createInterruptsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.IoPortsE <em>Io Ports E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.IoPortsE
	 * @generated
	 */
	public Adapter createIoPortsEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.IpcPortE <em>Ipc Port E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.IpcPortE
	 * @generated
	 */
	public Adapter createIpcPortEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.MemoryAreaE <em>Memory Area E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemoryAreaE
	 * @generated
	 */
	public Adapter createMemoryAreaEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.MemoryBlockType <em>Memory Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemoryBlockType
	 * @generated
	 */
	public Adapter createMemoryBlockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.MemoryLayoutE <em>Memory Layout E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemoryLayoutE
	 * @generated
	 */
	public Adapter createMemoryLayoutEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.NullType <em>Null Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.NullType
	 * @generated
	 */
	public Adapter createNullTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE <em>Partition E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionE
	 * @generated
	 */
	public Adapter createPartitionEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionPortsE <em>Partition Ports E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionPortsE
	 * @generated
	 */
	public Adapter createPartitionPortsEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionTableType <em>Partition Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PartitionTableType
	 * @generated
	 */
	public Adapter createPartitionTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.PlanE <em>Plan E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PlanE
	 * @generated
	 */
	public Adapter createPlanEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PortType
	 * @generated
	 */
	public Adapter createPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorE <em>Processor E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ProcessorE
	 * @generated
	 */
	public Adapter createProcessorEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorTableType <em>Processor Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.ProcessorTableType
	 * @generated
	 */
	public Adapter createProcessorTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType <em>Queuing Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType
	 * @generated
	 */
	public Adapter createQueuingChannelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.RangeType
	 * @generated
	 */
	public Adapter createRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.RegionType <em>Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.RegionType
	 * @generated
	 */
	public Adapter createRegionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.RestrictedType <em>Restricted Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.RestrictedType
	 * @generated
	 */
	public Adapter createRestrictedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.RswE <em>Rsw E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.RswE
	 * @generated
	 */
	public Adapter createRswEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType <em>Sampling Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType
	 * @generated
	 */
	public Adapter createSamplingChannelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.SlotType <em>Slot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SlotType
	 * @generated
	 */
	public Adapter createSlotTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType <em>System Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType
	 * @generated
	 */
	public Adapter createSystemDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.TemporalRequirementsType <em>Temporal Requirements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.TemporalRequirementsType
	 * @generated
	 */
	public Adapter createTemporalRequirementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.TraceE <em>Trace E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.TraceE
	 * @generated
	 */
	public Adapter createTraceEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.spacebel.emf.xtratum.modeling.xmc.UartType <em>Uart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.UartType
	 * @generated
	 */
	public Adapter createUartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XmcAdapterFactory
