/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.impl;

import com.spacebel.emf.xtratum.modeling.xmc.AreaType;
import com.spacebel.emf.xtratum.modeling.xmc.ChannelsE;
import com.spacebel.emf.xtratum.modeling.xmc.CyclicPlanE;
import com.spacebel.emf.xtratum.modeling.xmc.DevicesE;
import com.spacebel.emf.xtratum.modeling.xmc.DirectionT;
import com.spacebel.emf.xtratum.modeling.xmc.DisciplineT;
import com.spacebel.emf.xtratum.modeling.xmc.DocumentRoot;
import com.spacebel.emf.xtratum.modeling.xmc.EventType;
import com.spacebel.emf.xtratum.modeling.xmc.HealthMonitorE;
import com.spacebel.emf.xtratum.modeling.xmc.HmActionT;
import com.spacebel.emf.xtratum.modeling.xmc.HmStringT;
import com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE;
import com.spacebel.emf.xtratum.modeling.xmc.HwResourcesE;
import com.spacebel.emf.xtratum.modeling.xmc.HypMemoryAreaE;
import com.spacebel.emf.xtratum.modeling.xmc.HypervisorE;
import com.spacebel.emf.xtratum.modeling.xmc.InterruptsType;
import com.spacebel.emf.xtratum.modeling.xmc.IoPortsE;
import com.spacebel.emf.xtratum.modeling.xmc.IpcPortE;
import com.spacebel.emf.xtratum.modeling.xmc.MemAreaFlagsT;
import com.spacebel.emf.xtratum.modeling.xmc.MemRegionT;
import com.spacebel.emf.xtratum.modeling.xmc.MemoryAreaE;
import com.spacebel.emf.xtratum.modeling.xmc.MemoryBlockType;
import com.spacebel.emf.xtratum.modeling.xmc.MemoryLayoutE;
import com.spacebel.emf.xtratum.modeling.xmc.NullType;
import com.spacebel.emf.xtratum.modeling.xmc.PartitionE;
import com.spacebel.emf.xtratum.modeling.xmc.PartitionFlagsT;
import com.spacebel.emf.xtratum.modeling.xmc.PartitionPortsE;
import com.spacebel.emf.xtratum.modeling.xmc.PartitionTableType;
import com.spacebel.emf.xtratum.modeling.xmc.PlanE;
import com.spacebel.emf.xtratum.modeling.xmc.PortType;
import com.spacebel.emf.xtratum.modeling.xmc.PortTypeT;
import com.spacebel.emf.xtratum.modeling.xmc.ProcessorE;
import com.spacebel.emf.xtratum.modeling.xmc.ProcessorFeaturesT;
import com.spacebel.emf.xtratum.modeling.xmc.ProcessorTableType;
import com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType;
import com.spacebel.emf.xtratum.modeling.xmc.RangeType;
import com.spacebel.emf.xtratum.modeling.xmc.RegionType;
import com.spacebel.emf.xtratum.modeling.xmc.RestrictedType;
import com.spacebel.emf.xtratum.modeling.xmc.RswE;
import com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType;
import com.spacebel.emf.xtratum.modeling.xmc.SlotType;
import com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType;
import com.spacebel.emf.xtratum.modeling.xmc.TemporalRequirementsType;
import com.spacebel.emf.xtratum.modeling.xmc.TraceE;
import com.spacebel.emf.xtratum.modeling.xmc.UartType;
import com.spacebel.emf.xtratum.modeling.xmc.XmcFactory;
import com.spacebel.emf.xtratum.modeling.xmc.XmcPackage;
import com.spacebel.emf.xtratum.modeling.xmc.YntfT;

import com.spacebel.emf.xtratum.modeling.xmc.util.XmcValidator;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmcPackageImpl extends EPackageImpl implements XmcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelsEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cyclicPlanEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devicesEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthMonitorEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwDescriptionEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwResourcesEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hypervisorEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hypMemoryAreaEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioPortsEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipcPortEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryAreaEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryBlockTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryLayoutEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionPortsEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionTableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorTableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queuingChannelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rswEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass samplingChannelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalRequirementsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uartTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum disciplineTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hmActionTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hmStringTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum memAreaFlagsTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum memRegionTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum partitionFlagsTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portTypeTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processorFeaturesTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yntfTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType directionTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType disciplineTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType freqUnitTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hexTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hmActionTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hmStringTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hwIrqIdListTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hwIrqIdTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idListTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idStringTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType memAreaFlagsListTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType memAreaFlagsTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType memRegionTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType partitionFlagsListTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType partitionFlagsTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType portTypeTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType processorFeaturesListTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType processorFeaturesTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sizeUnitTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeUnitTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType yntfTObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XmcPackageImpl() {
		super(eNS_URI, XmcFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XmcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XmcPackage init() {
		if (isInited) return (XmcPackage)EPackage.Registry.INSTANCE.getEPackage(XmcPackage.eNS_URI);

		// Obtain or create and register package
		XmcPackageImpl theXmcPackage = (XmcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XmcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XmcPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theXmcPackage.createPackageContents();

		// Initialize created meta-data
		theXmcPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theXmcPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return XmcValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theXmcPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XmcPackage.eNS_URI, theXmcPackage);
		return theXmcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAreaType() {
		return areaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaType_Flags() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaType_MappedAt() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaType_Name() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaType_Size() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaType_Start() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelsE() {
		return channelsEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelsE_Group() {
		return (EAttribute)channelsEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelsE_SamplingChannel() {
		return (EReference)channelsEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelsE_QueuingChannel() {
		return (EReference)channelsEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCyclicPlanE() {
		return cyclicPlanEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCyclicPlanE_Group() {
		return (EAttribute)cyclicPlanEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCyclicPlanE_Plan() {
		return (EReference)cyclicPlanEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevicesE() {
		return devicesEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevicesE_Group() {
		return (EAttribute)devicesEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevicesE_MemoryBlock() {
		return (EReference)devicesEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevicesE_Uart() {
		return (EReference)devicesEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevicesE_Null() {
		return (EReference)devicesEEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SystemDescription() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventType() {
		return eventTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventType_Action() {
		return (EAttribute)eventTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventType_Log() {
		return (EAttribute)eventTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventType_Name() {
		return (EAttribute)eventTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthMonitorE() {
		return healthMonitorEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthMonitorE_Group() {
		return (EAttribute)healthMonitorEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthMonitorE_Event() {
		return (EReference)healthMonitorEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwDescriptionE() {
		return hwDescriptionEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwDescriptionE_MemoryLayout() {
		return (EReference)hwDescriptionEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwDescriptionE_ProcessorTable() {
		return (EReference)hwDescriptionEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwDescriptionE_Devices() {
		return (EReference)hwDescriptionEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwResourcesE() {
		return hwResourcesEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwResourcesE_IoPorts() {
		return (EReference)hwResourcesEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwResourcesE_Interrupts() {
		return (EReference)hwResourcesEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHypervisorE() {
		return hypervisorEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHypervisorE_PhysicalMemoryArea() {
		return (EReference)hypervisorEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHypervisorE_HealthMonitor() {
		return (EReference)hypervisorEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHypervisorE_Trace() {
		return (EReference)hypervisorEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisorE_Console() {
		return (EAttribute)hypervisorEEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisorE_HealthMonitorAppDevice() {
		return (EAttribute)hypervisorEEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisorE_HealthMonitorDevice() {
		return (EAttribute)hypervisorEEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHypMemoryAreaE() {
		return hypMemoryAreaEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypMemoryAreaE_Flags() {
		return (EAttribute)hypMemoryAreaEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypMemoryAreaE_Size() {
		return (EAttribute)hypMemoryAreaEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterruptsType() {
		return interruptsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterruptsType_Lines() {
		return (EAttribute)interruptsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoPortsE() {
		return ioPortsEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIoPortsE_Group() {
		return (EAttribute)ioPortsEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoPortsE_Range() {
		return (EReference)ioPortsEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoPortsE_Restricted() {
		return (EReference)ioPortsEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIpcPortE() {
		return ipcPortEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIpcPortE_PartitionId() {
		return (EAttribute)ipcPortEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIpcPortE_PartitionName() {
		return (EAttribute)ipcPortEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIpcPortE_PortName() {
		return (EAttribute)ipcPortEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryAreaE() {
		return memoryAreaEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryAreaE_Group() {
		return (EAttribute)memoryAreaEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryAreaE_Area() {
		return (EReference)memoryAreaEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryBlockType() {
		return memoryBlockTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryBlockType_Name() {
		return (EAttribute)memoryBlockTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryBlockType_Size() {
		return (EAttribute)memoryBlockTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryBlockType_Start() {
		return (EAttribute)memoryBlockTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryLayoutE() {
		return memoryLayoutEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryLayoutE_Group() {
		return (EAttribute)memoryLayoutEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryLayoutE_Region() {
		return (EReference)memoryLayoutEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullType() {
		return nullTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNullType_Name() {
		return (EAttribute)nullTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionE() {
		return partitionEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionE_PhysicalMemoryAreas() {
		return (EReference)partitionEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionE_TemporalRequirements() {
		return (EReference)partitionEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionE_HealthMonitor() {
		return (EReference)partitionEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionE_HwResources() {
		return (EReference)partitionEEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionE_PortTable() {
		return (EReference)partitionEEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionE_Trace() {
		return (EReference)partitionEEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartitionE_Boot() {
		return (EAttribute)partitionEEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartitionE_Console() {
		return (EAttribute)partitionEEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartitionE_Flags() {
		return (EAttribute)partitionEEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartitionE_Id() {
		return (EAttribute)partitionEEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartitionE_Name() {
		return (EAttribute)partitionEEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionPortsE() {
		return partitionPortsEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartitionPortsE_Group() {
		return (EAttribute)partitionPortsEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionPortsE_Port() {
		return (EReference)partitionPortsEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionTableType() {
		return partitionTableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartitionTableType_Group() {
		return (EAttribute)partitionTableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionTableType_Partition() {
		return (EReference)partitionTableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanE() {
		return planEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanE_Group() {
		return (EAttribute)planEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanE_Slot() {
		return (EReference)planEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanE_Id() {
		return (EAttribute)planEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanE_MajorFrame() {
		return (EAttribute)planEEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanE_Name() {
		return (EAttribute)planEEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortType() {
		return portTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortType_Direction() {
		return (EAttribute)portTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortType_Discipline() {
		return (EAttribute)portTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortType_Name() {
		return (EAttribute)portTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortType_Type() {
		return (EAttribute)portTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessorE() {
		return processorEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessorE_CyclicPlanTable() {
		return (EReference)processorEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorE_Features() {
		return (EAttribute)processorEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorE_Frequency() {
		return (EAttribute)processorEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorE_Id() {
		return (EAttribute)processorEEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessorTableType() {
		return processorTableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorTableType_Group() {
		return (EAttribute)processorTableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessorTableType_Processor() {
		return (EReference)processorTableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueuingChannelType() {
		return queuingChannelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueuingChannelType_Source() {
		return (EReference)queuingChannelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueuingChannelType_Destination() {
		return (EReference)queuingChannelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueuingChannelType_MaxMessageLength() {
		return (EAttribute)queuingChannelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueuingChannelType_MaxNoMessages() {
		return (EAttribute)queuingChannelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueuingChannelType_MaxTimeExpiration() {
		return (EAttribute)queuingChannelTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeType() {
		return rangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeType_Base() {
		return (EAttribute)rangeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeType_NoPorts() {
		return (EAttribute)rangeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegionType() {
		return regionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionType_Size() {
		return (EAttribute)regionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionType_Start() {
		return (EAttribute)regionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionType_Type() {
		return (EAttribute)regionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestrictedType() {
		return restrictedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestrictedType_Address() {
		return (EAttribute)restrictedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestrictedType_Mask() {
		return (EAttribute)restrictedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRswE() {
		return rswEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRswE_PhysicalMemoryAreas() {
		return (EReference)rswEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSamplingChannelType() {
		return samplingChannelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSamplingChannelType_Source() {
		return (EReference)samplingChannelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSamplingChannelType_Group() {
		return (EAttribute)samplingChannelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSamplingChannelType_Destination() {
		return (EReference)samplingChannelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSamplingChannelType_MaxMessageLength() {
		return (EAttribute)samplingChannelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSamplingChannelType_RefreshPeriod() {
		return (EAttribute)samplingChannelTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlotType() {
		return slotTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlotType_Duration() {
		return (EAttribute)slotTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlotType_Id() {
		return (EAttribute)slotTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlotType_PartitionId() {
		return (EAttribute)slotTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlotType_Start() {
		return (EAttribute)slotTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemDescriptionType() {
		return systemDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemDescriptionType_HwDescription() {
		return (EReference)systemDescriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemDescriptionType_XMHypervisor() {
		return (EReference)systemDescriptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemDescriptionType_ResidentSw() {
		return (EReference)systemDescriptionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemDescriptionType_PartitionTable() {
		return (EReference)systemDescriptionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemDescriptionType_Channels() {
		return (EReference)systemDescriptionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemDescriptionType_Name() {
		return (EAttribute)systemDescriptionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemDescriptionType_Version() {
		return (EAttribute)systemDescriptionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalRequirementsType() {
		return temporalRequirementsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalRequirementsType_Duration() {
		return (EAttribute)temporalRequirementsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalRequirementsType_Period() {
		return (EAttribute)temporalRequirementsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceE() {
		return traceEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceE_Bitmask() {
		return (EAttribute)traceEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceE_Device() {
		return (EAttribute)traceEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUartType() {
		return uartTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUartType_BaudRate() {
		return (EAttribute)uartTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUartType_Id() {
		return (EAttribute)uartTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUartType_Name() {
		return (EAttribute)uartTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionT() {
		return directionTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisciplineT() {
		return disciplineTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHmActionT() {
		return hmActionTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHmStringT() {
		return hmStringTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMemAreaFlagsT() {
		return memAreaFlagsTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMemRegionT() {
		return memRegionTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPartitionFlagsT() {
		return partitionFlagsTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortTypeT() {
		return portTypeTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessorFeaturesT() {
		return processorFeaturesTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYntfT() {
		return yntfTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDirectionTObject() {
		return directionTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDisciplineTObject() {
		return disciplineTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFreqUnitT() {
		return freqUnitTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHexT() {
		return hexTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHmActionTObject() {
		return hmActionTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHmStringTObject() {
		return hmStringTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHwIrqIdListT() {
		return hwIrqIdListTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHwIrqIdT() {
		return hwIrqIdTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdListT() {
		return idListTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdStringT() {
		return idStringTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdT() {
		return idTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMemAreaFlagsListT() {
		return memAreaFlagsListTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMemAreaFlagsTObject() {
		return memAreaFlagsTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMemRegionTObject() {
		return memRegionTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPartitionFlagsListT() {
		return partitionFlagsListTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPartitionFlagsTObject() {
		return partitionFlagsTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPortTypeTObject() {
		return portTypeTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProcessorFeaturesListT() {
		return processorFeaturesListTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProcessorFeaturesTObject() {
		return processorFeaturesTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSizeUnitT() {
		return sizeUnitTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeUnitT() {
		return timeUnitTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersionT() {
		return versionTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getYntfTObject() {
		return yntfTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmcFactory getXmcFactory() {
		return (XmcFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		areaTypeEClass = createEClass(AREA_TYPE);
		createEAttribute(areaTypeEClass, AREA_TYPE__FLAGS);
		createEAttribute(areaTypeEClass, AREA_TYPE__MAPPED_AT);
		createEAttribute(areaTypeEClass, AREA_TYPE__NAME);
		createEAttribute(areaTypeEClass, AREA_TYPE__SIZE);
		createEAttribute(areaTypeEClass, AREA_TYPE__START);

		channelsEEClass = createEClass(CHANNELS_E);
		createEAttribute(channelsEEClass, CHANNELS_E__GROUP);
		createEReference(channelsEEClass, CHANNELS_E__SAMPLING_CHANNEL);
		createEReference(channelsEEClass, CHANNELS_E__QUEUING_CHANNEL);

		cyclicPlanEEClass = createEClass(CYCLIC_PLAN_E);
		createEAttribute(cyclicPlanEEClass, CYCLIC_PLAN_E__GROUP);
		createEReference(cyclicPlanEEClass, CYCLIC_PLAN_E__PLAN);

		devicesEEClass = createEClass(DEVICES_E);
		createEAttribute(devicesEEClass, DEVICES_E__GROUP);
		createEReference(devicesEEClass, DEVICES_E__MEMORY_BLOCK);
		createEReference(devicesEEClass, DEVICES_E__UART);
		createEReference(devicesEEClass, DEVICES_E__NULL);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SYSTEM_DESCRIPTION);

		eventTypeEClass = createEClass(EVENT_TYPE);
		createEAttribute(eventTypeEClass, EVENT_TYPE__ACTION);
		createEAttribute(eventTypeEClass, EVENT_TYPE__LOG);
		createEAttribute(eventTypeEClass, EVENT_TYPE__NAME);

		healthMonitorEEClass = createEClass(HEALTH_MONITOR_E);
		createEAttribute(healthMonitorEEClass, HEALTH_MONITOR_E__GROUP);
		createEReference(healthMonitorEEClass, HEALTH_MONITOR_E__EVENT);

		hwDescriptionEEClass = createEClass(HW_DESCRIPTION_E);
		createEReference(hwDescriptionEEClass, HW_DESCRIPTION_E__MEMORY_LAYOUT);
		createEReference(hwDescriptionEEClass, HW_DESCRIPTION_E__PROCESSOR_TABLE);
		createEReference(hwDescriptionEEClass, HW_DESCRIPTION_E__DEVICES);

		hwResourcesEEClass = createEClass(HW_RESOURCES_E);
		createEReference(hwResourcesEEClass, HW_RESOURCES_E__IO_PORTS);
		createEReference(hwResourcesEEClass, HW_RESOURCES_E__INTERRUPTS);

		hypervisorEEClass = createEClass(HYPERVISOR_E);
		createEReference(hypervisorEEClass, HYPERVISOR_E__PHYSICAL_MEMORY_AREA);
		createEReference(hypervisorEEClass, HYPERVISOR_E__HEALTH_MONITOR);
		createEReference(hypervisorEEClass, HYPERVISOR_E__TRACE);
		createEAttribute(hypervisorEEClass, HYPERVISOR_E__CONSOLE);
		createEAttribute(hypervisorEEClass, HYPERVISOR_E__HEALTH_MONITOR_APP_DEVICE);
		createEAttribute(hypervisorEEClass, HYPERVISOR_E__HEALTH_MONITOR_DEVICE);

		hypMemoryAreaEEClass = createEClass(HYP_MEMORY_AREA_E);
		createEAttribute(hypMemoryAreaEEClass, HYP_MEMORY_AREA_E__FLAGS);
		createEAttribute(hypMemoryAreaEEClass, HYP_MEMORY_AREA_E__SIZE);

		interruptsTypeEClass = createEClass(INTERRUPTS_TYPE);
		createEAttribute(interruptsTypeEClass, INTERRUPTS_TYPE__LINES);

		ioPortsEEClass = createEClass(IO_PORTS_E);
		createEAttribute(ioPortsEEClass, IO_PORTS_E__GROUP);
		createEReference(ioPortsEEClass, IO_PORTS_E__RANGE);
		createEReference(ioPortsEEClass, IO_PORTS_E__RESTRICTED);

		ipcPortEEClass = createEClass(IPC_PORT_E);
		createEAttribute(ipcPortEEClass, IPC_PORT_E__PARTITION_ID);
		createEAttribute(ipcPortEEClass, IPC_PORT_E__PARTITION_NAME);
		createEAttribute(ipcPortEEClass, IPC_PORT_E__PORT_NAME);

		memoryAreaEEClass = createEClass(MEMORY_AREA_E);
		createEAttribute(memoryAreaEEClass, MEMORY_AREA_E__GROUP);
		createEReference(memoryAreaEEClass, MEMORY_AREA_E__AREA);

		memoryBlockTypeEClass = createEClass(MEMORY_BLOCK_TYPE);
		createEAttribute(memoryBlockTypeEClass, MEMORY_BLOCK_TYPE__NAME);
		createEAttribute(memoryBlockTypeEClass, MEMORY_BLOCK_TYPE__SIZE);
		createEAttribute(memoryBlockTypeEClass, MEMORY_BLOCK_TYPE__START);

		memoryLayoutEEClass = createEClass(MEMORY_LAYOUT_E);
		createEAttribute(memoryLayoutEEClass, MEMORY_LAYOUT_E__GROUP);
		createEReference(memoryLayoutEEClass, MEMORY_LAYOUT_E__REGION);

		nullTypeEClass = createEClass(NULL_TYPE);
		createEAttribute(nullTypeEClass, NULL_TYPE__NAME);

		partitionEEClass = createEClass(PARTITION_E);
		createEReference(partitionEEClass, PARTITION_E__PHYSICAL_MEMORY_AREAS);
		createEReference(partitionEEClass, PARTITION_E__TEMPORAL_REQUIREMENTS);
		createEReference(partitionEEClass, PARTITION_E__HEALTH_MONITOR);
		createEReference(partitionEEClass, PARTITION_E__HW_RESOURCES);
		createEReference(partitionEEClass, PARTITION_E__PORT_TABLE);
		createEReference(partitionEEClass, PARTITION_E__TRACE);
		createEAttribute(partitionEEClass, PARTITION_E__BOOT);
		createEAttribute(partitionEEClass, PARTITION_E__CONSOLE);
		createEAttribute(partitionEEClass, PARTITION_E__FLAGS);
		createEAttribute(partitionEEClass, PARTITION_E__ID);
		createEAttribute(partitionEEClass, PARTITION_E__NAME);

		partitionPortsEEClass = createEClass(PARTITION_PORTS_E);
		createEAttribute(partitionPortsEEClass, PARTITION_PORTS_E__GROUP);
		createEReference(partitionPortsEEClass, PARTITION_PORTS_E__PORT);

		partitionTableTypeEClass = createEClass(PARTITION_TABLE_TYPE);
		createEAttribute(partitionTableTypeEClass, PARTITION_TABLE_TYPE__GROUP);
		createEReference(partitionTableTypeEClass, PARTITION_TABLE_TYPE__PARTITION);

		planEEClass = createEClass(PLAN_E);
		createEAttribute(planEEClass, PLAN_E__GROUP);
		createEReference(planEEClass, PLAN_E__SLOT);
		createEAttribute(planEEClass, PLAN_E__ID);
		createEAttribute(planEEClass, PLAN_E__MAJOR_FRAME);
		createEAttribute(planEEClass, PLAN_E__NAME);

		portTypeEClass = createEClass(PORT_TYPE);
		createEAttribute(portTypeEClass, PORT_TYPE__DIRECTION);
		createEAttribute(portTypeEClass, PORT_TYPE__DISCIPLINE);
		createEAttribute(portTypeEClass, PORT_TYPE__NAME);
		createEAttribute(portTypeEClass, PORT_TYPE__TYPE);

		processorEEClass = createEClass(PROCESSOR_E);
		createEReference(processorEEClass, PROCESSOR_E__CYCLIC_PLAN_TABLE);
		createEAttribute(processorEEClass, PROCESSOR_E__FEATURES);
		createEAttribute(processorEEClass, PROCESSOR_E__FREQUENCY);
		createEAttribute(processorEEClass, PROCESSOR_E__ID);

		processorTableTypeEClass = createEClass(PROCESSOR_TABLE_TYPE);
		createEAttribute(processorTableTypeEClass, PROCESSOR_TABLE_TYPE__GROUP);
		createEReference(processorTableTypeEClass, PROCESSOR_TABLE_TYPE__PROCESSOR);

		queuingChannelTypeEClass = createEClass(QUEUING_CHANNEL_TYPE);
		createEReference(queuingChannelTypeEClass, QUEUING_CHANNEL_TYPE__SOURCE);
		createEReference(queuingChannelTypeEClass, QUEUING_CHANNEL_TYPE__DESTINATION);
		createEAttribute(queuingChannelTypeEClass, QUEUING_CHANNEL_TYPE__MAX_MESSAGE_LENGTH);
		createEAttribute(queuingChannelTypeEClass, QUEUING_CHANNEL_TYPE__MAX_NO_MESSAGES);
		createEAttribute(queuingChannelTypeEClass, QUEUING_CHANNEL_TYPE__MAX_TIME_EXPIRATION);

		rangeTypeEClass = createEClass(RANGE_TYPE);
		createEAttribute(rangeTypeEClass, RANGE_TYPE__BASE);
		createEAttribute(rangeTypeEClass, RANGE_TYPE__NO_PORTS);

		regionTypeEClass = createEClass(REGION_TYPE);
		createEAttribute(regionTypeEClass, REGION_TYPE__SIZE);
		createEAttribute(regionTypeEClass, REGION_TYPE__START);
		createEAttribute(regionTypeEClass, REGION_TYPE__TYPE);

		restrictedTypeEClass = createEClass(RESTRICTED_TYPE);
		createEAttribute(restrictedTypeEClass, RESTRICTED_TYPE__ADDRESS);
		createEAttribute(restrictedTypeEClass, RESTRICTED_TYPE__MASK);

		rswEEClass = createEClass(RSW_E);
		createEReference(rswEEClass, RSW_E__PHYSICAL_MEMORY_AREAS);

		samplingChannelTypeEClass = createEClass(SAMPLING_CHANNEL_TYPE);
		createEReference(samplingChannelTypeEClass, SAMPLING_CHANNEL_TYPE__SOURCE);
		createEAttribute(samplingChannelTypeEClass, SAMPLING_CHANNEL_TYPE__GROUP);
		createEReference(samplingChannelTypeEClass, SAMPLING_CHANNEL_TYPE__DESTINATION);
		createEAttribute(samplingChannelTypeEClass, SAMPLING_CHANNEL_TYPE__MAX_MESSAGE_LENGTH);
		createEAttribute(samplingChannelTypeEClass, SAMPLING_CHANNEL_TYPE__REFRESH_PERIOD);

		slotTypeEClass = createEClass(SLOT_TYPE);
		createEAttribute(slotTypeEClass, SLOT_TYPE__DURATION);
		createEAttribute(slotTypeEClass, SLOT_TYPE__ID);
		createEAttribute(slotTypeEClass, SLOT_TYPE__PARTITION_ID);
		createEAttribute(slotTypeEClass, SLOT_TYPE__START);

		systemDescriptionTypeEClass = createEClass(SYSTEM_DESCRIPTION_TYPE);
		createEReference(systemDescriptionTypeEClass, SYSTEM_DESCRIPTION_TYPE__HW_DESCRIPTION);
		createEReference(systemDescriptionTypeEClass, SYSTEM_DESCRIPTION_TYPE__XM_HYPERVISOR);
		createEReference(systemDescriptionTypeEClass, SYSTEM_DESCRIPTION_TYPE__RESIDENT_SW);
		createEReference(systemDescriptionTypeEClass, SYSTEM_DESCRIPTION_TYPE__PARTITION_TABLE);
		createEReference(systemDescriptionTypeEClass, SYSTEM_DESCRIPTION_TYPE__CHANNELS);
		createEAttribute(systemDescriptionTypeEClass, SYSTEM_DESCRIPTION_TYPE__NAME);
		createEAttribute(systemDescriptionTypeEClass, SYSTEM_DESCRIPTION_TYPE__VERSION);

		temporalRequirementsTypeEClass = createEClass(TEMPORAL_REQUIREMENTS_TYPE);
		createEAttribute(temporalRequirementsTypeEClass, TEMPORAL_REQUIREMENTS_TYPE__DURATION);
		createEAttribute(temporalRequirementsTypeEClass, TEMPORAL_REQUIREMENTS_TYPE__PERIOD);

		traceEEClass = createEClass(TRACE_E);
		createEAttribute(traceEEClass, TRACE_E__BITMASK);
		createEAttribute(traceEEClass, TRACE_E__DEVICE);

		uartTypeEClass = createEClass(UART_TYPE);
		createEAttribute(uartTypeEClass, UART_TYPE__BAUD_RATE);
		createEAttribute(uartTypeEClass, UART_TYPE__ID);
		createEAttribute(uartTypeEClass, UART_TYPE__NAME);

		// Create enums
		directionTEEnum = createEEnum(DIRECTION_T);
		disciplineTEEnum = createEEnum(DISCIPLINE_T);
		hmActionTEEnum = createEEnum(HM_ACTION_T);
		hmStringTEEnum = createEEnum(HM_STRING_T);
		memAreaFlagsTEEnum = createEEnum(MEM_AREA_FLAGS_T);
		memRegionTEEnum = createEEnum(MEM_REGION_T);
		partitionFlagsTEEnum = createEEnum(PARTITION_FLAGS_T);
		portTypeTEEnum = createEEnum(PORT_TYPE_T);
		processorFeaturesTEEnum = createEEnum(PROCESSOR_FEATURES_T);
		yntfTEEnum = createEEnum(YNTF_T);

		// Create data types
		directionTObjectEDataType = createEDataType(DIRECTION_TOBJECT);
		disciplineTObjectEDataType = createEDataType(DISCIPLINE_TOBJECT);
		freqUnitTEDataType = createEDataType(FREQ_UNIT_T);
		hexTEDataType = createEDataType(HEX_T);
		hmActionTObjectEDataType = createEDataType(HM_ACTION_TOBJECT);
		hmStringTObjectEDataType = createEDataType(HM_STRING_TOBJECT);
		hwIrqIdListTEDataType = createEDataType(HW_IRQ_ID_LIST_T);
		hwIrqIdTEDataType = createEDataType(HW_IRQ_ID_T);
		idListTEDataType = createEDataType(ID_LIST_T);
		idStringTEDataType = createEDataType(ID_STRING_T);
		idTEDataType = createEDataType(ID_T);
		memAreaFlagsListTEDataType = createEDataType(MEM_AREA_FLAGS_LIST_T);
		memAreaFlagsTObjectEDataType = createEDataType(MEM_AREA_FLAGS_TOBJECT);
		memRegionTObjectEDataType = createEDataType(MEM_REGION_TOBJECT);
		partitionFlagsListTEDataType = createEDataType(PARTITION_FLAGS_LIST_T);
		partitionFlagsTObjectEDataType = createEDataType(PARTITION_FLAGS_TOBJECT);
		portTypeTObjectEDataType = createEDataType(PORT_TYPE_TOBJECT);
		processorFeaturesListTEDataType = createEDataType(PROCESSOR_FEATURES_LIST_T);
		processorFeaturesTObjectEDataType = createEDataType(PROCESSOR_FEATURES_TOBJECT);
		sizeUnitTEDataType = createEDataType(SIZE_UNIT_T);
		timeUnitTEDataType = createEDataType(TIME_UNIT_T);
		versionTEDataType = createEDataType(VERSION_T);
		yntfTObjectEDataType = createEDataType(YNTF_TOBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(areaTypeEClass, AreaType.class, "AreaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAreaType_Flags(), this.getMemAreaFlagsListT(), "flags", "none", 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaType_MappedAt(), this.getHexT(), "mappedAt", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaType_Name(), this.getIdStringT(), "name", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaType_Size(), this.getSizeUnitT(), "size", null, 1, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaType_Start(), this.getHexT(), "start", null, 1, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelsEEClass, ChannelsE.class, "ChannelsE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannelsE_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ChannelsE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelsE_SamplingChannel(), this.getSamplingChannelType(), null, "samplingChannel", null, 0, -1, ChannelsE.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChannelsE_QueuingChannel(), this.getQueuingChannelType(), null, "queuingChannel", null, 0, -1, ChannelsE.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(cyclicPlanEEClass, CyclicPlanE.class, "CyclicPlanE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCyclicPlanE_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, CyclicPlanE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCyclicPlanE_Plan(), this.getPlanE(), null, "plan", null, 1, -1, CyclicPlanE.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(devicesEEClass, DevicesE.class, "DevicesE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevicesE_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, DevicesE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevicesE_MemoryBlock(), this.getMemoryBlockType(), null, "memoryBlock", null, 0, -1, DevicesE.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDevicesE_Uart(), this.getUartType(), null, "uart", null, 0, -1, DevicesE.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDevicesE_Null(), this.getNullType(), null, "null", null, 0, -1, DevicesE.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SystemDescription(), this.getSystemDescriptionType(), null, "systemDescription", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eventTypeEClass, EventType.class, "EventType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventType_Action(), this.getHmActionT(), "action", null, 1, 1, EventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventType_Log(), this.getYntfT(), "log", null, 1, 1, EventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventType_Name(), this.getHmStringT(), "name", null, 1, 1, EventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(healthMonitorEEClass, HealthMonitorE.class, "HealthMonitorE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHealthMonitorE_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, HealthMonitorE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHealthMonitorE_Event(), this.getEventType(), null, "event", null, 1, -1, HealthMonitorE.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(hwDescriptionEEClass, HwDescriptionE.class, "HwDescriptionE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwDescriptionE_MemoryLayout(), this.getMemoryLayoutE(), null, "memoryLayout", null, 1, 1, HwDescriptionE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwDescriptionE_ProcessorTable(), this.getProcessorTableType(), null, "processorTable", null, 1, 1, HwDescriptionE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwDescriptionE_Devices(), this.getDevicesE(), null, "devices", null, 1, 1, HwDescriptionE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwResourcesEEClass, HwResourcesE.class, "HwResourcesE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwResourcesE_IoPorts(), this.getIoPortsE(), null, "ioPorts", null, 0, 1, HwResourcesE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwResourcesE_Interrupts(), this.getInterruptsType(), null, "interrupts", null, 0, 1, HwResourcesE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hypervisorEEClass, HypervisorE.class, "HypervisorE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHypervisorE_PhysicalMemoryArea(), this.getHypMemoryAreaE(), null, "physicalMemoryArea", null, 1, 1, HypervisorE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypervisorE_HealthMonitor(), this.getHealthMonitorE(), null, "healthMonitor", null, 0, 1, HypervisorE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypervisorE_Trace(), this.getTraceE(), null, "trace", null, 0, 1, HypervisorE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisorE_Console(), this.getIdStringT(), "console", null, 0, 1, HypervisorE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisorE_HealthMonitorAppDevice(), this.getIdStringT(), "healthMonitorAppDevice", null, 0, 1, HypervisorE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisorE_HealthMonitorDevice(), this.getIdStringT(), "healthMonitorDevice", null, 0, 1, HypervisorE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hypMemoryAreaEEClass, HypMemoryAreaE.class, "HypMemoryAreaE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHypMemoryAreaE_Flags(), this.getMemAreaFlagsListT(), "flags", null, 0, 1, HypMemoryAreaE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypMemoryAreaE_Size(), this.getSizeUnitT(), "size", null, 1, 1, HypMemoryAreaE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interruptsTypeEClass, InterruptsType.class, "InterruptsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterruptsType_Lines(), this.getHwIrqIdListT(), "lines", null, 1, 1, InterruptsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioPortsEEClass, IoPortsE.class, "IoPortsE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIoPortsE_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, IoPortsE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIoPortsE_Range(), this.getRangeType(), null, "range", null, 0, -1, IoPortsE.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getIoPortsE_Restricted(), this.getRestrictedType(), null, "restricted", null, 0, -1, IoPortsE.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ipcPortEEClass, IpcPortE.class, "IpcPortE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIpcPortE_PartitionId(), this.getIdT(), "partitionId", null, 1, 1, IpcPortE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIpcPortE_PartitionName(), this.getIdStringT(), "partitionName", null, 0, 1, IpcPortE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIpcPortE_PortName(), this.getIdStringT(), "portName", null, 1, 1, IpcPortE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryAreaEEClass, MemoryAreaE.class, "MemoryAreaE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoryAreaE_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, MemoryAreaE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryAreaE_Area(), this.getAreaType(), null, "area", null, 1, -1, MemoryAreaE.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(memoryBlockTypeEClass, MemoryBlockType.class, "MemoryBlockType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoryBlockType_Name(), this.getIdStringT(), "name", null, 1, 1, MemoryBlockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryBlockType_Size(), this.getSizeUnitT(), "size", null, 1, 1, MemoryBlockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryBlockType_Start(), this.getHexT(), "start", null, 1, 1, MemoryBlockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryLayoutEEClass, MemoryLayoutE.class, "MemoryLayoutE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoryLayoutE_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, MemoryLayoutE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryLayoutE_Region(), this.getRegionType(), null, "region", null, 1, -1, MemoryLayoutE.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(nullTypeEClass, NullType.class, "NullType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNullType_Name(), this.getIdStringT(), "name", null, 0, 1, NullType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partitionEEClass, PartitionE.class, "PartitionE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartitionE_PhysicalMemoryAreas(), this.getMemoryAreaE(), null, "physicalMemoryAreas", null, 1, 1, PartitionE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartitionE_TemporalRequirements(), this.getTemporalRequirementsType(), null, "temporalRequirements", null, 0, 1, PartitionE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartitionE_HealthMonitor(), this.getHealthMonitorE(), null, "healthMonitor", null, 0, 1, PartitionE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartitionE_HwResources(), this.getHwResourcesE(), null, "hwResources", null, 0, 1, PartitionE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartitionE_PortTable(), this.getPartitionPortsE(), null, "portTable", null, 0, 1, PartitionE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartitionE_Trace(), this.getTraceE(), null, "trace", null, 0, 1, PartitionE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartitionE_Boot(), this.getIdStringT(), "boot", "yes", 0, 1, PartitionE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartitionE_Console(), this.getIdStringT(), "console", null, 0, 1, PartitionE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartitionE_Flags(), this.getPartitionFlagsListT(), "flags", "none", 0, 1, PartitionE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartitionE_Id(), this.getIdT(), "id", null, 1, 1, PartitionE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartitionE_Name(), this.getIdStringT(), "name", null, 0, 1, PartitionE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partitionPortsEEClass, PartitionPortsE.class, "PartitionPortsE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartitionPortsE_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PartitionPortsE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartitionPortsE_Port(), this.getPortType(), null, "port", null, 0, -1, PartitionPortsE.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(partitionTableTypeEClass, PartitionTableType.class, "PartitionTableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartitionTableType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PartitionTableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartitionTableType_Partition(), this.getPartitionE(), null, "partition", null, 1, -1, PartitionTableType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(planEEClass, PlanE.class, "PlanE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlanE_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PlanE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanE_Slot(), this.getSlotType(), null, "slot", null, 1, -1, PlanE.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanE_Id(), this.getIdT(), "id", null, 1, 1, PlanE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanE_MajorFrame(), this.getTimeUnitT(), "majorFrame", null, 1, 1, PlanE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanE_Name(), this.getIdStringT(), "name", null, 0, 1, PlanE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portTypeEClass, PortType.class, "PortType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortType_Direction(), this.getDirectionT(), "direction", null, 1, 1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortType_Discipline(), this.getDisciplineT(), "discipline", null, 0, 1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortType_Name(), this.getIdStringT(), "name", null, 1, 1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortType_Type(), this.getPortTypeT(), "type", null, 1, 1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorEEClass, ProcessorE.class, "ProcessorE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessorE_CyclicPlanTable(), this.getCyclicPlanE(), null, "cyclicPlanTable", null, 1, 1, ProcessorE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessorE_Features(), this.getProcessorFeaturesListT(), "features", "none", 0, 1, ProcessorE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessorE_Frequency(), this.getFreqUnitT(), "frequency", null, 0, 1, ProcessorE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessorE_Id(), this.getIdT(), "id", null, 1, 1, ProcessorE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorTableTypeEClass, ProcessorTableType.class, "ProcessorTableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessorTableType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ProcessorTableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessorTableType_Processor(), this.getProcessorE(), null, "processor", null, 1, 256, ProcessorTableType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(queuingChannelTypeEClass, QueuingChannelType.class, "QueuingChannelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueuingChannelType_Source(), this.getIpcPortE(), null, "source", null, 1, 1, QueuingChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueuingChannelType_Destination(), this.getIpcPortE(), null, "destination", null, 1, 1, QueuingChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueuingChannelType_MaxMessageLength(), this.getSizeUnitT(), "maxMessageLength", null, 1, 1, QueuingChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueuingChannelType_MaxNoMessages(), theXMLTypePackage.getPositiveInteger(), "maxNoMessages", null, 1, 1, QueuingChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueuingChannelType_MaxTimeExpiration(), this.getTimeUnitT(), "maxTimeExpiration", "0s", 0, 1, QueuingChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeTypeEClass, RangeType.class, "RangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangeType_Base(), this.getHexT(), "base", null, 1, 1, RangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeType_NoPorts(), theXMLTypePackage.getPositiveInteger(), "noPorts", null, 1, 1, RangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionTypeEClass, RegionType.class, "RegionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegionType_Size(), this.getSizeUnitT(), "size", null, 1, 1, RegionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionType_Start(), this.getHexT(), "start", null, 1, 1, RegionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionType_Type(), this.getMemRegionT(), "type", null, 1, 1, RegionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restrictedTypeEClass, RestrictedType.class, "RestrictedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestrictedType_Address(), this.getHexT(), "address", null, 1, 1, RestrictedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestrictedType_Mask(), this.getHexT(), "mask", "0x0", 0, 1, RestrictedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rswEEClass, RswE.class, "RswE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRswE_PhysicalMemoryAreas(), this.getMemoryAreaE(), null, "physicalMemoryAreas", null, 1, 1, RswE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(samplingChannelTypeEClass, SamplingChannelType.class, "SamplingChannelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSamplingChannelType_Source(), this.getIpcPortE(), null, "source", null, 1, 1, SamplingChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSamplingChannelType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SamplingChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSamplingChannelType_Destination(), this.getIpcPortE(), null, "destination", null, 1, -1, SamplingChannelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSamplingChannelType_MaxMessageLength(), this.getSizeUnitT(), "maxMessageLength", null, 1, 1, SamplingChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSamplingChannelType_RefreshPeriod(), this.getTimeUnitT(), "refreshPeriod", "0s", 0, 1, SamplingChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slotTypeEClass, SlotType.class, "SlotType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlotType_Duration(), this.getTimeUnitT(), "duration", null, 1, 1, SlotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlotType_Id(), this.getIdT(), "id", null, 1, 1, SlotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlotType_PartitionId(), this.getIdT(), "partitionId", null, 1, 1, SlotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlotType_Start(), this.getTimeUnitT(), "start", null, 1, 1, SlotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemDescriptionTypeEClass, SystemDescriptionType.class, "SystemDescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemDescriptionType_HwDescription(), this.getHwDescriptionE(), null, "hwDescription", null, 1, 1, SystemDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDescriptionType_XMHypervisor(), this.getHypervisorE(), null, "xMHypervisor", null, 1, 1, SystemDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDescriptionType_ResidentSw(), this.getRswE(), null, "residentSw", null, 0, 1, SystemDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDescriptionType_PartitionTable(), this.getPartitionTableType(), null, "partitionTable", null, 1, 1, SystemDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDescriptionType_Channels(), this.getChannelsE(), null, "channels", null, 0, 1, SystemDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemDescriptionType_Name(), this.getIdStringT(), "name", null, 1, 1, SystemDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemDescriptionType_Version(), this.getVersionT(), "version", null, 1, 1, SystemDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalRequirementsTypeEClass, TemporalRequirementsType.class, "TemporalRequirementsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemporalRequirementsType_Duration(), this.getTimeUnitT(), "duration", null, 1, 1, TemporalRequirementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalRequirementsType_Period(), this.getTimeUnitT(), "period", null, 1, 1, TemporalRequirementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceEEClass, TraceE.class, "TraceE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraceE_Bitmask(), this.getHexT(), "bitmask", null, 1, 1, TraceE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceE_Device(), this.getIdStringT(), "device", null, 1, 1, TraceE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uartTypeEClass, UartType.class, "UartType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUartType_BaudRate(), theXMLTypePackage.getPositiveInteger(), "baudRate", null, 1, 1, UartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUartType_Id(), this.getIdStringT(), "id", null, 1, 1, UartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUartType_Name(), this.getIdStringT(), "name", null, 1, 1, UartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directionTEEnum, DirectionT.class, "DirectionT");
		addEEnumLiteral(directionTEEnum, DirectionT.SOURCE);
		addEEnumLiteral(directionTEEnum, DirectionT.DESTINATION);

		initEEnum(disciplineTEEnum, DisciplineT.class, "DisciplineT");
		addEEnumLiteral(disciplineTEEnum, DisciplineT.FIFO);
		addEEnumLiteral(disciplineTEEnum, DisciplineT.PRIORITY);

		initEEnum(hmActionTEEnum, HmActionT.class, "HmActionT");
		addEEnumLiteral(hmActionTEEnum, HmActionT.XMHMACIGNORE);
		addEEnumLiteral(hmActionTEEnum, HmActionT.XMHMACSHUTDOWN);
		addEEnumLiteral(hmActionTEEnum, HmActionT.XMHMACPARTITIONCOLDRESET);
		addEEnumLiteral(hmActionTEEnum, HmActionT.XMHMACPARTITIONWARMRESET);
		addEEnumLiteral(hmActionTEEnum, HmActionT.XMHMACHYPERVISORCOLDRESET);
		addEEnumLiteral(hmActionTEEnum, HmActionT.XMHMACHYPERVISORWARMRESET);
		addEEnumLiteral(hmActionTEEnum, HmActionT.XMHMACSUSPEND);
		addEEnumLiteral(hmActionTEEnum, HmActionT.XMHMACHALT);
		addEEnumLiteral(hmActionTEEnum, HmActionT.XMHMACPROPAGATE);
		addEEnumLiteral(hmActionTEEnum, HmActionT.XMHMACSWITCHTOMAINTENANCE);

		initEEnum(hmStringTEEnum, HmStringT.class, "HmStringT");
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVINTERNALERROR);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVUNEXPECTEDTRAP);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVPARTITIONERROR);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVPARTITIONINTEGRITY);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVMEMPROTECTION);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVOVERRUN);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSCHEDERROR);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVWATCHDOGTIMER);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVINCOMPATIBLEINTERFACE);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8WRITEERROR);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8INSTRACCESSMMUMISS);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8INSTRACCESSERROR);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8UNIMPLEMENTEDFLUSH);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8WATCHPOINTDETECTED);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8DATAACCESSERROR);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8DATAACCESSMMUMISS);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8INSTRACCESSEXCEPTION);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8ILLEGALINSTR);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8PRIVILEGEDINSTR);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8FPDISABLED);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8CPDISABLED);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8REGISTERHARDWAREERROR);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8MEMADDRNOTALIGNED);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8FPEXCEPTION);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8CPEXCEPTION);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8DATAACCESSEXCEPTION);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8TAGOVERFLOW);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVSPARCV8DIVIDEEXCEPTION);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVAPPDEADLINEMISSED);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVAPPAPPLICATIONERROR);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVAPPNUMERICERROR);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVAPPILLEGALREQUEST);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVAPPSTACKOVERFLOW);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVAPPMEMORYVIOLATION);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVAPPHARDWAREFAULT);
		addEEnumLiteral(hmStringTEEnum, HmStringT.XMHMEVAPPPOWERFAIL);

		initEEnum(memAreaFlagsTEEnum, MemAreaFlagsT.class, "MemAreaFlagsT");
		addEEnumLiteral(memAreaFlagsTEEnum, MemAreaFlagsT.UNMAPPED);
		addEEnumLiteral(memAreaFlagsTEEnum, MemAreaFlagsT.SHARED);
		addEEnumLiteral(memAreaFlagsTEEnum, MemAreaFlagsT.READ_ONLY);
		addEEnumLiteral(memAreaFlagsTEEnum, MemAreaFlagsT.UNCACHEABLE);
		addEEnumLiteral(memAreaFlagsTEEnum, MemAreaFlagsT.ROM);
		addEEnumLiteral(memAreaFlagsTEEnum, MemAreaFlagsT.SHLIB);
		addEEnumLiteral(memAreaFlagsTEEnum, MemAreaFlagsT.FLAG0);
		addEEnumLiteral(memAreaFlagsTEEnum, MemAreaFlagsT.FLAG1);
		addEEnumLiteral(memAreaFlagsTEEnum, MemAreaFlagsT.FLAG2);
		addEEnumLiteral(memAreaFlagsTEEnum, MemAreaFlagsT.FLAG3);
		addEEnumLiteral(memAreaFlagsTEEnum, MemAreaFlagsT.NONE);

		initEEnum(memRegionTEEnum, MemRegionT.class, "MemRegionT");
		addEEnumLiteral(memRegionTEEnum, MemRegionT.SDRAM);
		addEEnumLiteral(memRegionTEEnum, MemRegionT.STRAM);
		addEEnumLiteral(memRegionTEEnum, MemRegionT.ROM);

		initEEnum(partitionFlagsTEEnum, PartitionFlagsT.class, "PartitionFlagsT");
		addEEnumLiteral(partitionFlagsTEEnum, PartitionFlagsT.SYSTEM);
		addEEnumLiteral(partitionFlagsTEEnum, PartitionFlagsT.FP);
		addEEnumLiteral(partitionFlagsTEEnum, PartitionFlagsT.BOOT);
		addEEnumLiteral(partitionFlagsTEEnum, PartitionFlagsT.NONE);

		initEEnum(portTypeTEEnum, PortTypeT.class, "PortTypeT");
		addEEnumLiteral(portTypeTEEnum, PortTypeT.QUEUING);
		addEEnumLiteral(portTypeTEEnum, PortTypeT.SAMPLING);

		initEEnum(processorFeaturesTEEnum, ProcessorFeaturesT.class, "ProcessorFeaturesT");
		addEEnumLiteral(processorFeaturesTEEnum, ProcessorFeaturesT.XMCPULEON2WA1);
		addEEnumLiteral(processorFeaturesTEEnum, ProcessorFeaturesT.NONE);

		initEEnum(yntfTEEnum, YntfT.class, "YntfT");
		addEEnumLiteral(yntfTEEnum, YntfT.YES);
		addEEnumLiteral(yntfTEEnum, YntfT.NO);
		addEEnumLiteral(yntfTEEnum, YntfT.TRUE);
		addEEnumLiteral(yntfTEEnum, YntfT.FALSE);

		// Initialize data types
		initEDataType(directionTObjectEDataType, DirectionT.class, "DirectionTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(disciplineTObjectEDataType, DisciplineT.class, "DisciplineTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(freqUnitTEDataType, String.class, "FreqUnitT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hexTEDataType, String.class, "HexT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hmActionTObjectEDataType, HmActionT.class, "HmActionTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hmStringTObjectEDataType, HmStringT.class, "HmStringTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hwIrqIdListTEDataType, List.class, "HwIrqIdListT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hwIrqIdTEDataType, BigInteger.class, "HwIrqIdT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(idListTEDataType, List.class, "IdListT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(idStringTEDataType, String.class, "IdStringT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(idTEDataType, BigInteger.class, "IdT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(memAreaFlagsListTEDataType, List.class, "MemAreaFlagsListT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(memAreaFlagsTObjectEDataType, MemAreaFlagsT.class, "MemAreaFlagsTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(memRegionTObjectEDataType, MemRegionT.class, "MemRegionTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(partitionFlagsListTEDataType, List.class, "PartitionFlagsListT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(partitionFlagsTObjectEDataType, PartitionFlagsT.class, "PartitionFlagsTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(portTypeTObjectEDataType, PortTypeT.class, "PortTypeTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(processorFeaturesListTEDataType, List.class, "ProcessorFeaturesListT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(processorFeaturesTObjectEDataType, ProcessorFeaturesT.class, "ProcessorFeaturesTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sizeUnitTEDataType, String.class, "SizeUnitT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeUnitTEDataType, String.class, "TimeUnitT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionTEDataType, String.class, "VersionT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(yntfTObjectEDataType, YntfT.class, "YntfTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (areaTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Area_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getAreaType_Flags(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "flags"
		   });	
		addAnnotation
		  (getAreaType_MappedAt(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mappedAt"
		   });	
		addAnnotation
		  (getAreaType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getAreaType_Size(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "size"
		   });	
		addAnnotation
		  (getAreaType_Start(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start"
		   });	
		addAnnotation
		  (channelsEEClass, 
		   source, 
		   new String[] {
			 "name", "channels_e",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getChannelsE_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getChannelsE_SamplingChannel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SamplingChannel",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getChannelsE_QueuingChannel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "QueuingChannel",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (cyclicPlanEEClass, 
		   source, 
		   new String[] {
			 "name", "cyclicPlan_e",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCyclicPlanE_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getCyclicPlanE_Plan(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Plan",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (devicesEEClass, 
		   source, 
		   new String[] {
			 "name", "devices_e",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDevicesE_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getDevicesE_MemoryBlock(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MemoryBlock",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getDevicesE_Uart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Uart",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getDevicesE_Null(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Null",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (directionTEEnum, 
		   source, 
		   new String[] {
			 "name", "direction_t"
		   });	
		addAnnotation
		  (directionTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "direction_t:Object",
			 "baseType", "direction_t"
		   });	
		addAnnotation
		  (disciplineTEEnum, 
		   source, 
		   new String[] {
			 "name", "discipline_t"
		   });	
		addAnnotation
		  (disciplineTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "discipline_t:Object",
			 "baseType", "discipline_t"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_SystemDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SystemDescription",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (eventTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Event_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getEventType_Action(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "action"
		   });	
		addAnnotation
		  (getEventType_Log(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "log"
		   });	
		addAnnotation
		  (getEventType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (freqUnitTEDataType, 
		   source, 
		   new String[] {
			 "name", "freqUnit_t",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[0-9]+(.[0-9]+)?([MK][Hh]z)"
		   });	
		addAnnotation
		  (healthMonitorEEClass, 
		   source, 
		   new String[] {
			 "name", "healthMonitor_e",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getHealthMonitorE_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getHealthMonitorE_Event(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Event",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (hexTEDataType, 
		   source, 
		   new String[] {
			 "name", "hex_t",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "0x[0-9a-fA-F]+"
		   });	
		addAnnotation
		  (hmActionTEEnum, 
		   source, 
		   new String[] {
			 "name", "hmAction_t"
		   });	
		addAnnotation
		  (hmActionTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "hmAction_t:Object",
			 "baseType", "hmAction_t"
		   });	
		addAnnotation
		  (hmStringTEEnum, 
		   source, 
		   new String[] {
			 "name", "hmString_t"
		   });	
		addAnnotation
		  (hmStringTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "hmString_t:Object",
			 "baseType", "hmString_t"
		   });	
		addAnnotation
		  (hwDescriptionEEClass, 
		   source, 
		   new String[] {
			 "name", "hwDescription_e",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getHwDescriptionE_MemoryLayout(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MemoryLayout",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHwDescriptionE_ProcessorTable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProcessorTable",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHwDescriptionE_Devices(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Devices",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (hwIrqIdListTEDataType, 
		   source, 
		   new String[] {
			 "name", "hwIrqIdList_t",
			 "itemType", "hwIrqId_t"
		   });	
		addAnnotation
		  (hwIrqIdTEDataType, 
		   source, 
		   new String[] {
			 "name", "hwIrqId_t",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			 "minInclusive", "0",
			 "maxExclusive", "32"
		   });	
		addAnnotation
		  (hwResourcesEEClass, 
		   source, 
		   new String[] {
			 "name", "hwResources_e",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getHwResourcesE_IoPorts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IoPorts",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHwResourcesE_Interrupts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Interrupts",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (hypervisorEEClass, 
		   source, 
		   new String[] {
			 "name", "hypervisor_e",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getHypervisorE_PhysicalMemoryArea(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PhysicalMemoryArea",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHypervisorE_HealthMonitor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HealthMonitor",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHypervisorE_Trace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Trace",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHypervisorE_Console(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "console"
		   });	
		addAnnotation
		  (getHypervisorE_HealthMonitorAppDevice(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "healthMonitorAppDevice"
		   });	
		addAnnotation
		  (getHypervisorE_HealthMonitorDevice(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "healthMonitorDevice"
		   });	
		addAnnotation
		  (hypMemoryAreaEEClass, 
		   source, 
		   new String[] {
			 "name", "hypMemoryArea_e",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getHypMemoryAreaE_Flags(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "flags"
		   });	
		addAnnotation
		  (getHypMemoryAreaE_Size(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "size"
		   });	
		addAnnotation
		  (idListTEDataType, 
		   source, 
		   new String[] {
			 "name", "idList_t",
			 "itemType", "id_t"
		   });	
		addAnnotation
		  (idStringTEDataType, 
		   source, 
		   new String[] {
			 "name", "idString_t",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1"
		   });	
		addAnnotation
		  (idTEDataType, 
		   source, 
		   new String[] {
			 "name", "id_t",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			 "minInclusive", "0"
		   });	
		addAnnotation
		  (interruptsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Interrupts_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getInterruptsType_Lines(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lines"
		   });	
		addAnnotation
		  (ioPortsEEClass, 
		   source, 
		   new String[] {
			 "name", "ioPorts_e",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getIoPortsE_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getIoPortsE_Range(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Range",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getIoPortsE_Restricted(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Restricted",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (ipcPortEEClass, 
		   source, 
		   new String[] {
			 "name", "ipcPort_e",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getIpcPortE_PartitionId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "partitionId"
		   });	
		addAnnotation
		  (getIpcPortE_PartitionName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "partitionName"
		   });	
		addAnnotation
		  (getIpcPortE_PortName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "portName"
		   });	
		addAnnotation
		  (memAreaFlagsListTEDataType, 
		   source, 
		   new String[] {
			 "name", "memAreaFlagsList_t",
			 "itemType", "memAreaFlags_t"
		   });	
		addAnnotation
		  (memAreaFlagsTEEnum, 
		   source, 
		   new String[] {
			 "name", "memAreaFlags_t"
		   });	
		addAnnotation
		  (memAreaFlagsTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "memAreaFlags_t:Object",
			 "baseType", "memAreaFlags_t"
		   });	
		addAnnotation
		  (memoryAreaEEClass, 
		   source, 
		   new String[] {
			 "name", "memoryArea_e",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMemoryAreaE_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getMemoryAreaE_Area(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Area",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (memoryBlockTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MemoryBlock_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getMemoryBlockType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getMemoryBlockType_Size(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "size"
		   });	
		addAnnotation
		  (getMemoryBlockType_Start(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start"
		   });	
		addAnnotation
		  (memoryLayoutEEClass, 
		   source, 
		   new String[] {
			 "name", "memoryLayout_e",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMemoryLayoutE_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getMemoryLayoutE_Region(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Region",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (memRegionTEEnum, 
		   source, 
		   new String[] {
			 "name", "memRegion_t"
		   });	
		addAnnotation
		  (memRegionTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "memRegion_t:Object",
			 "baseType", "memRegion_t"
		   });	
		addAnnotation
		  (nullTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Null_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getNullType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (partitionEEClass, 
		   source, 
		   new String[] {
			 "name", "partition_e",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPartitionE_PhysicalMemoryAreas(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PhysicalMemoryAreas",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPartitionE_TemporalRequirements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TemporalRequirements",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPartitionE_HealthMonitor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HealthMonitor",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPartitionE_HwResources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HwResources",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPartitionE_PortTable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PortTable",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPartitionE_Trace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Trace",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPartitionE_Boot(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "boot"
		   });	
		addAnnotation
		  (getPartitionE_Console(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "console"
		   });	
		addAnnotation
		  (getPartitionE_Flags(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "flags"
		   });	
		addAnnotation
		  (getPartitionE_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getPartitionE_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (partitionFlagsListTEDataType, 
		   source, 
		   new String[] {
			 "name", "partitionFlagsList_t",
			 "itemType", "partitionFlags_t"
		   });	
		addAnnotation
		  (partitionFlagsTEEnum, 
		   source, 
		   new String[] {
			 "name", "partitionFlags_t"
		   });	
		addAnnotation
		  (partitionFlagsTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "partitionFlags_t:Object",
			 "baseType", "partitionFlags_t"
		   });	
		addAnnotation
		  (partitionPortsEEClass, 
		   source, 
		   new String[] {
			 "name", "partitionPorts_e",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPartitionPortsE_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getPartitionPortsE_Port(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Port",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (partitionTableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PartitionTable_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPartitionTableType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getPartitionTableType_Partition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Partition",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (planEEClass, 
		   source, 
		   new String[] {
			 "name", "plan_e",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPlanE_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getPlanE_Slot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Slot",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getPlanE_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getPlanE_MajorFrame(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "majorFrame"
		   });	
		addAnnotation
		  (getPlanE_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (portTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Port_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPortType_Direction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "direction"
		   });	
		addAnnotation
		  (getPortType_Discipline(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "discipline"
		   });	
		addAnnotation
		  (getPortType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getPortType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (portTypeTEEnum, 
		   source, 
		   new String[] {
			 "name", "portType_t"
		   });	
		addAnnotation
		  (portTypeTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "portType_t:Object",
			 "baseType", "portType_t"
		   });	
		addAnnotation
		  (processorEEClass, 
		   source, 
		   new String[] {
			 "name", "processor_e",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getProcessorE_CyclicPlanTable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CyclicPlanTable",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProcessorE_Features(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "features"
		   });	
		addAnnotation
		  (getProcessorE_Frequency(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "frequency"
		   });	
		addAnnotation
		  (getProcessorE_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (processorFeaturesListTEDataType, 
		   source, 
		   new String[] {
			 "name", "processorFeaturesList_t",
			 "itemType", "processorFeatures_t"
		   });	
		addAnnotation
		  (processorFeaturesTEEnum, 
		   source, 
		   new String[] {
			 "name", "processorFeatures_t"
		   });	
		addAnnotation
		  (processorFeaturesTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "processorFeatures_t:Object",
			 "baseType", "processorFeatures_t"
		   });	
		addAnnotation
		  (processorTableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ProcessorTable_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getProcessorTableType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getProcessorTableType_Processor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Processor",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (queuingChannelTypeEClass, 
		   source, 
		   new String[] {
			 "name", "QueuingChannel_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getQueuingChannelType_Source(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getQueuingChannelType_Destination(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Destination",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getQueuingChannelType_MaxMessageLength(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxMessageLength"
		   });	
		addAnnotation
		  (getQueuingChannelType_MaxNoMessages(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxNoMessages"
		   });	
		addAnnotation
		  (getQueuingChannelType_MaxTimeExpiration(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxTimeExpiration"
		   });	
		addAnnotation
		  (rangeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Range_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRangeType_Base(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "base"
		   });	
		addAnnotation
		  (getRangeType_NoPorts(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "noPorts"
		   });	
		addAnnotation
		  (regionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Region_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRegionType_Size(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "size"
		   });	
		addAnnotation
		  (getRegionType_Start(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start"
		   });	
		addAnnotation
		  (getRegionType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (restrictedTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Restricted_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRestrictedType_Address(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "address"
		   });	
		addAnnotation
		  (getRestrictedType_Mask(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mask"
		   });	
		addAnnotation
		  (rswEEClass, 
		   source, 
		   new String[] {
			 "name", "rsw_e",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRswE_PhysicalMemoryAreas(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PhysicalMemoryAreas",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (samplingChannelTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SamplingChannel_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSamplingChannelType_Source(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSamplingChannelType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });	
		addAnnotation
		  (getSamplingChannelType_Destination(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Destination",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getSamplingChannelType_MaxMessageLength(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxMessageLength"
		   });	
		addAnnotation
		  (getSamplingChannelType_RefreshPeriod(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "refreshPeriod"
		   });	
		addAnnotation
		  (sizeUnitTEDataType, 
		   source, 
		   new String[] {
			 "name", "sizeUnit_t",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[0-9]+(.[0-9]+)?([MK]?B)"
		   });	
		addAnnotation
		  (slotTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Slot_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getSlotType_Duration(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "duration"
		   });	
		addAnnotation
		  (getSlotType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getSlotType_PartitionId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "partitionId"
		   });	
		addAnnotation
		  (getSlotType_Start(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start"
		   });	
		addAnnotation
		  (systemDescriptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SystemDescription_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSystemDescriptionType_HwDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HwDescription",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSystemDescriptionType_XMHypervisor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XMHypervisor",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSystemDescriptionType_ResidentSw(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ResidentSw",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSystemDescriptionType_PartitionTable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PartitionTable",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSystemDescriptionType_Channels(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Channels",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSystemDescriptionType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getSystemDescriptionType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });	
		addAnnotation
		  (temporalRequirementsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TemporalRequirements_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getTemporalRequirementsType_Duration(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "duration"
		   });	
		addAnnotation
		  (getTemporalRequirementsType_Period(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "period"
		   });	
		addAnnotation
		  (timeUnitTEDataType, 
		   source, 
		   new String[] {
			 "name", "timeUnit_t",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[0-9]+(.[0-9]+)?([mu]?[sS])"
		   });	
		addAnnotation
		  (traceEEClass, 
		   source, 
		   new String[] {
			 "name", "trace_e",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getTraceE_Bitmask(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "bitmask"
		   });	
		addAnnotation
		  (getTraceE_Device(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "device"
		   });	
		addAnnotation
		  (uartTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Uart_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getUartType_BaudRate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "baudRate"
		   });	
		addAnnotation
		  (getUartType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getUartType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (versionTEDataType, 
		   source, 
		   new String[] {
			 "name", "version_t",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[0-9]+.[0-9]+.[0-9]+"
		   });	
		addAnnotation
		  (yntfTEEnum, 
		   source, 
		   new String[] {
			 "name", "yntf_t"
		   });	
		addAnnotation
		  (yntfTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "yntf_t:Object",
			 "baseType", "yntf_t"
		   });
	}

} //XmcPackageImpl
