/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.impl;

import com.spacebel.emf.xtratum.modeling.xmc.HealthMonitorE;
import com.spacebel.emf.xtratum.modeling.xmc.HwResourcesE;
import com.spacebel.emf.xtratum.modeling.xmc.MemoryAreaE;
import com.spacebel.emf.xtratum.modeling.xmc.PartitionE;
import com.spacebel.emf.xtratum.modeling.xmc.PartitionFlagsT;
import com.spacebel.emf.xtratum.modeling.xmc.PartitionPortsE;
import com.spacebel.emf.xtratum.modeling.xmc.TemporalRequirementsType;
import com.spacebel.emf.xtratum.modeling.xmc.TraceE;
import com.spacebel.emf.xtratum.modeling.xmc.XmcFactory;
import com.spacebel.emf.xtratum.modeling.xmc.XmcPackage;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition E</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionEImpl#getPhysicalMemoryAreas <em>Physical Memory Areas</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionEImpl#getTemporalRequirements <em>Temporal Requirements</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionEImpl#getHealthMonitor <em>Health Monitor</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionEImpl#getHwResources <em>Hw Resources</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionEImpl#getPortTable <em>Port Table</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionEImpl#getTrace <em>Trace</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionEImpl#getBoot <em>Boot</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionEImpl#getConsole <em>Console</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionEImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionEImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.PartitionEImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartitionEImpl extends MinimalEObjectImpl.Container implements PartitionE {
	/**
	 * The cached value of the '{@link #getPhysicalMemoryAreas() <em>Physical Memory Areas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalMemoryAreas()
	 * @generated
	 * @ordered
	 */
	protected MemoryAreaE physicalMemoryAreas;

	/**
	 * The cached value of the '{@link #getTemporalRequirements() <em>Temporal Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalRequirements()
	 * @generated
	 * @ordered
	 */
	protected TemporalRequirementsType temporalRequirements;

	/**
	 * The cached value of the '{@link #getHealthMonitor() <em>Health Monitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthMonitor()
	 * @generated
	 * @ordered
	 */
	protected HealthMonitorE healthMonitor;

	/**
	 * The cached value of the '{@link #getHwResources() <em>Hw Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwResources()
	 * @generated
	 * @ordered
	 */
	protected HwResourcesE hwResources;

	/**
	 * The cached value of the '{@link #getPortTable() <em>Port Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortTable()
	 * @generated
	 * @ordered
	 */
	protected PartitionPortsE portTable;

	/**
	 * The cached value of the '{@link #getTrace() <em>Trace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace()
	 * @generated
	 * @ordered
	 */
	protected TraceE trace;

	/**
	 * The default value of the '{@link #getBoot() <em>Boot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoot()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOT_EDEFAULT = "yes";

	/**
	 * The cached value of the '{@link #getBoot() <em>Boot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoot()
	 * @generated
	 * @ordered
	 */
	protected String boot = BOOT_EDEFAULT;

	/**
	 * This is true if the Boot attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bootESet;

	/**
	 * The default value of the '{@link #getConsole() <em>Console</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsole()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSOLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsole() <em>Console</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsole()
	 * @generated
	 * @ordered
	 */
	protected String console = CONSOLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("unchecked")
	protected static final List<PartitionFlagsT> FLAGS_EDEFAULT = (List<PartitionFlagsT>)XmcFactory.eINSTANCE.createFromString(XmcPackage.eINSTANCE.getPartitionFlagsListT(), "none");

	/**
	 * The cached value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected List<PartitionFlagsT> flags = FLAGS_EDEFAULT;

	/**
	 * This is true if the Flags attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flagsESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmcPackage.Literals.PARTITION_E;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryAreaE getPhysicalMemoryAreas() {
		return physicalMemoryAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalMemoryAreas(MemoryAreaE newPhysicalMemoryAreas, NotificationChain msgs) {
		MemoryAreaE oldPhysicalMemoryAreas = physicalMemoryAreas;
		physicalMemoryAreas = newPhysicalMemoryAreas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.PARTITION_E__PHYSICAL_MEMORY_AREAS, oldPhysicalMemoryAreas, newPhysicalMemoryAreas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalMemoryAreas(MemoryAreaE newPhysicalMemoryAreas) {
		if (newPhysicalMemoryAreas != physicalMemoryAreas) {
			NotificationChain msgs = null;
			if (physicalMemoryAreas != null)
				msgs = ((InternalEObject)physicalMemoryAreas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.PARTITION_E__PHYSICAL_MEMORY_AREAS, null, msgs);
			if (newPhysicalMemoryAreas != null)
				msgs = ((InternalEObject)newPhysicalMemoryAreas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.PARTITION_E__PHYSICAL_MEMORY_AREAS, null, msgs);
			msgs = basicSetPhysicalMemoryAreas(newPhysicalMemoryAreas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.PARTITION_E__PHYSICAL_MEMORY_AREAS, newPhysicalMemoryAreas, newPhysicalMemoryAreas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalRequirementsType getTemporalRequirements() {
		return temporalRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalRequirements(TemporalRequirementsType newTemporalRequirements, NotificationChain msgs) {
		TemporalRequirementsType oldTemporalRequirements = temporalRequirements;
		temporalRequirements = newTemporalRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.PARTITION_E__TEMPORAL_REQUIREMENTS, oldTemporalRequirements, newTemporalRequirements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporalRequirements(TemporalRequirementsType newTemporalRequirements) {
		if (newTemporalRequirements != temporalRequirements) {
			NotificationChain msgs = null;
			if (temporalRequirements != null)
				msgs = ((InternalEObject)temporalRequirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.PARTITION_E__TEMPORAL_REQUIREMENTS, null, msgs);
			if (newTemporalRequirements != null)
				msgs = ((InternalEObject)newTemporalRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.PARTITION_E__TEMPORAL_REQUIREMENTS, null, msgs);
			msgs = basicSetTemporalRequirements(newTemporalRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.PARTITION_E__TEMPORAL_REQUIREMENTS, newTemporalRequirements, newTemporalRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthMonitorE getHealthMonitor() {
		return healthMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHealthMonitor(HealthMonitorE newHealthMonitor, NotificationChain msgs) {
		HealthMonitorE oldHealthMonitor = healthMonitor;
		healthMonitor = newHealthMonitor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.PARTITION_E__HEALTH_MONITOR, oldHealthMonitor, newHealthMonitor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthMonitor(HealthMonitorE newHealthMonitor) {
		if (newHealthMonitor != healthMonitor) {
			NotificationChain msgs = null;
			if (healthMonitor != null)
				msgs = ((InternalEObject)healthMonitor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.PARTITION_E__HEALTH_MONITOR, null, msgs);
			if (newHealthMonitor != null)
				msgs = ((InternalEObject)newHealthMonitor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.PARTITION_E__HEALTH_MONITOR, null, msgs);
			msgs = basicSetHealthMonitor(newHealthMonitor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.PARTITION_E__HEALTH_MONITOR, newHealthMonitor, newHealthMonitor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwResourcesE getHwResources() {
		return hwResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHwResources(HwResourcesE newHwResources, NotificationChain msgs) {
		HwResourcesE oldHwResources = hwResources;
		hwResources = newHwResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.PARTITION_E__HW_RESOURCES, oldHwResources, newHwResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwResources(HwResourcesE newHwResources) {
		if (newHwResources != hwResources) {
			NotificationChain msgs = null;
			if (hwResources != null)
				msgs = ((InternalEObject)hwResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.PARTITION_E__HW_RESOURCES, null, msgs);
			if (newHwResources != null)
				msgs = ((InternalEObject)newHwResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.PARTITION_E__HW_RESOURCES, null, msgs);
			msgs = basicSetHwResources(newHwResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.PARTITION_E__HW_RESOURCES, newHwResources, newHwResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionPortsE getPortTable() {
		return portTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortTable(PartitionPortsE newPortTable, NotificationChain msgs) {
		PartitionPortsE oldPortTable = portTable;
		portTable = newPortTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.PARTITION_E__PORT_TABLE, oldPortTable, newPortTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortTable(PartitionPortsE newPortTable) {
		if (newPortTable != portTable) {
			NotificationChain msgs = null;
			if (portTable != null)
				msgs = ((InternalEObject)portTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.PARTITION_E__PORT_TABLE, null, msgs);
			if (newPortTable != null)
				msgs = ((InternalEObject)newPortTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.PARTITION_E__PORT_TABLE, null, msgs);
			msgs = basicSetPortTable(newPortTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.PARTITION_E__PORT_TABLE, newPortTable, newPortTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceE getTrace() {
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrace(TraceE newTrace, NotificationChain msgs) {
		TraceE oldTrace = trace;
		trace = newTrace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.PARTITION_E__TRACE, oldTrace, newTrace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrace(TraceE newTrace) {
		if (newTrace != trace) {
			NotificationChain msgs = null;
			if (trace != null)
				msgs = ((InternalEObject)trace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.PARTITION_E__TRACE, null, msgs);
			if (newTrace != null)
				msgs = ((InternalEObject)newTrace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.PARTITION_E__TRACE, null, msgs);
			msgs = basicSetTrace(newTrace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.PARTITION_E__TRACE, newTrace, newTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoot() {
		return boot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoot(String newBoot) {
		String oldBoot = boot;
		boot = newBoot;
		boolean oldBootESet = bootESet;
		bootESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.PARTITION_E__BOOT, oldBoot, boot, !oldBootESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoot() {
		String oldBoot = boot;
		boolean oldBootESet = bootESet;
		boot = BOOT_EDEFAULT;
		bootESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmcPackage.PARTITION_E__BOOT, oldBoot, BOOT_EDEFAULT, oldBootESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoot() {
		return bootESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsole() {
		return console;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsole(String newConsole) {
		String oldConsole = console;
		console = newConsole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.PARTITION_E__CONSOLE, oldConsole, console));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<PartitionFlagsT> getFlags() {
		return flags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlags(List<PartitionFlagsT> newFlags) {
		List<PartitionFlagsT> oldFlags = flags;
		flags = newFlags;
		boolean oldFlagsESet = flagsESet;
		flagsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.PARTITION_E__FLAGS, oldFlags, flags, !oldFlagsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlags() {
		List<PartitionFlagsT> oldFlags = flags;
		boolean oldFlagsESet = flagsESet;
		flags = FLAGS_EDEFAULT;
		flagsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmcPackage.PARTITION_E__FLAGS, oldFlags, FLAGS_EDEFAULT, oldFlagsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlags() {
		return flagsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(BigInteger newId) {
		BigInteger oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.PARTITION_E__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.PARTITION_E__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmcPackage.PARTITION_E__PHYSICAL_MEMORY_AREAS:
				return basicSetPhysicalMemoryAreas(null, msgs);
			case XmcPackage.PARTITION_E__TEMPORAL_REQUIREMENTS:
				return basicSetTemporalRequirements(null, msgs);
			case XmcPackage.PARTITION_E__HEALTH_MONITOR:
				return basicSetHealthMonitor(null, msgs);
			case XmcPackage.PARTITION_E__HW_RESOURCES:
				return basicSetHwResources(null, msgs);
			case XmcPackage.PARTITION_E__PORT_TABLE:
				return basicSetPortTable(null, msgs);
			case XmcPackage.PARTITION_E__TRACE:
				return basicSetTrace(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmcPackage.PARTITION_E__PHYSICAL_MEMORY_AREAS:
				return getPhysicalMemoryAreas();
			case XmcPackage.PARTITION_E__TEMPORAL_REQUIREMENTS:
				return getTemporalRequirements();
			case XmcPackage.PARTITION_E__HEALTH_MONITOR:
				return getHealthMonitor();
			case XmcPackage.PARTITION_E__HW_RESOURCES:
				return getHwResources();
			case XmcPackage.PARTITION_E__PORT_TABLE:
				return getPortTable();
			case XmcPackage.PARTITION_E__TRACE:
				return getTrace();
			case XmcPackage.PARTITION_E__BOOT:
				return getBoot();
			case XmcPackage.PARTITION_E__CONSOLE:
				return getConsole();
			case XmcPackage.PARTITION_E__FLAGS:
				return getFlags();
			case XmcPackage.PARTITION_E__ID:
				return getId();
			case XmcPackage.PARTITION_E__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmcPackage.PARTITION_E__PHYSICAL_MEMORY_AREAS:
				setPhysicalMemoryAreas((MemoryAreaE)newValue);
				return;
			case XmcPackage.PARTITION_E__TEMPORAL_REQUIREMENTS:
				setTemporalRequirements((TemporalRequirementsType)newValue);
				return;
			case XmcPackage.PARTITION_E__HEALTH_MONITOR:
				setHealthMonitor((HealthMonitorE)newValue);
				return;
			case XmcPackage.PARTITION_E__HW_RESOURCES:
				setHwResources((HwResourcesE)newValue);
				return;
			case XmcPackage.PARTITION_E__PORT_TABLE:
				setPortTable((PartitionPortsE)newValue);
				return;
			case XmcPackage.PARTITION_E__TRACE:
				setTrace((TraceE)newValue);
				return;
			case XmcPackage.PARTITION_E__BOOT:
				setBoot((String)newValue);
				return;
			case XmcPackage.PARTITION_E__CONSOLE:
				setConsole((String)newValue);
				return;
			case XmcPackage.PARTITION_E__FLAGS:
				setFlags((List<PartitionFlagsT>)newValue);
				return;
			case XmcPackage.PARTITION_E__ID:
				setId((BigInteger)newValue);
				return;
			case XmcPackage.PARTITION_E__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XmcPackage.PARTITION_E__PHYSICAL_MEMORY_AREAS:
				setPhysicalMemoryAreas((MemoryAreaE)null);
				return;
			case XmcPackage.PARTITION_E__TEMPORAL_REQUIREMENTS:
				setTemporalRequirements((TemporalRequirementsType)null);
				return;
			case XmcPackage.PARTITION_E__HEALTH_MONITOR:
				setHealthMonitor((HealthMonitorE)null);
				return;
			case XmcPackage.PARTITION_E__HW_RESOURCES:
				setHwResources((HwResourcesE)null);
				return;
			case XmcPackage.PARTITION_E__PORT_TABLE:
				setPortTable((PartitionPortsE)null);
				return;
			case XmcPackage.PARTITION_E__TRACE:
				setTrace((TraceE)null);
				return;
			case XmcPackage.PARTITION_E__BOOT:
				unsetBoot();
				return;
			case XmcPackage.PARTITION_E__CONSOLE:
				setConsole(CONSOLE_EDEFAULT);
				return;
			case XmcPackage.PARTITION_E__FLAGS:
				unsetFlags();
				return;
			case XmcPackage.PARTITION_E__ID:
				setId(ID_EDEFAULT);
				return;
			case XmcPackage.PARTITION_E__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XmcPackage.PARTITION_E__PHYSICAL_MEMORY_AREAS:
				return physicalMemoryAreas != null;
			case XmcPackage.PARTITION_E__TEMPORAL_REQUIREMENTS:
				return temporalRequirements != null;
			case XmcPackage.PARTITION_E__HEALTH_MONITOR:
				return healthMonitor != null;
			case XmcPackage.PARTITION_E__HW_RESOURCES:
				return hwResources != null;
			case XmcPackage.PARTITION_E__PORT_TABLE:
				return portTable != null;
			case XmcPackage.PARTITION_E__TRACE:
				return trace != null;
			case XmcPackage.PARTITION_E__BOOT:
				return isSetBoot();
			case XmcPackage.PARTITION_E__CONSOLE:
				return CONSOLE_EDEFAULT == null ? console != null : !CONSOLE_EDEFAULT.equals(console);
			case XmcPackage.PARTITION_E__FLAGS:
				return isSetFlags();
			case XmcPackage.PARTITION_E__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case XmcPackage.PARTITION_E__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (boot: ");
		if (bootESet) result.append(boot); else result.append("<unset>");
		result.append(", console: ");
		result.append(console);
		result.append(", flags: ");
		if (flagsESet) result.append(flags); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PartitionEImpl
