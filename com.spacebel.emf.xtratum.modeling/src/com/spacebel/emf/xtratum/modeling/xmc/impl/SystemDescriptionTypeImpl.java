/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.impl;

import com.spacebel.emf.xtratum.modeling.xmc.ChannelsE;
import com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE;
import com.spacebel.emf.xtratum.modeling.xmc.HypervisorE;
import com.spacebel.emf.xtratum.modeling.xmc.PartitionTableType;
import com.spacebel.emf.xtratum.modeling.xmc.RswE;
import com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType;
import com.spacebel.emf.xtratum.modeling.xmc.XmcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.SystemDescriptionTypeImpl#getHwDescription <em>Hw Description</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.SystemDescriptionTypeImpl#getXMHypervisor <em>XM Hypervisor</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.SystemDescriptionTypeImpl#getResidentSw <em>Resident Sw</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.SystemDescriptionTypeImpl#getPartitionTable <em>Partition Table</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.SystemDescriptionTypeImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.SystemDescriptionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.SystemDescriptionTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemDescriptionTypeImpl extends MinimalEObjectImpl.Container implements SystemDescriptionType {
	/**
	 * The cached value of the '{@link #getHwDescription() <em>Hw Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwDescription()
	 * @generated
	 * @ordered
	 */
	protected HwDescriptionE hwDescription;

	/**
	 * The cached value of the '{@link #getXMHypervisor() <em>XM Hypervisor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMHypervisor()
	 * @generated
	 * @ordered
	 */
	protected HypervisorE xMHypervisor;

	/**
	 * The cached value of the '{@link #getResidentSw() <em>Resident Sw</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidentSw()
	 * @generated
	 * @ordered
	 */
	protected RswE residentSw;

	/**
	 * The cached value of the '{@link #getPartitionTable() <em>Partition Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionTable()
	 * @generated
	 * @ordered
	 */
	protected PartitionTableType partitionTable;

	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected ChannelsE channels;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmcPackage.Literals.SYSTEM_DESCRIPTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDescriptionE getHwDescription() {
		return hwDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHwDescription(HwDescriptionE newHwDescription, NotificationChain msgs) {
		HwDescriptionE oldHwDescription = hwDescription;
		hwDescription = newHwDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.SYSTEM_DESCRIPTION_TYPE__HW_DESCRIPTION, oldHwDescription, newHwDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwDescription(HwDescriptionE newHwDescription) {
		if (newHwDescription != hwDescription) {
			NotificationChain msgs = null;
			if (hwDescription != null)
				msgs = ((InternalEObject)hwDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.SYSTEM_DESCRIPTION_TYPE__HW_DESCRIPTION, null, msgs);
			if (newHwDescription != null)
				msgs = ((InternalEObject)newHwDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.SYSTEM_DESCRIPTION_TYPE__HW_DESCRIPTION, null, msgs);
			msgs = basicSetHwDescription(newHwDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.SYSTEM_DESCRIPTION_TYPE__HW_DESCRIPTION, newHwDescription, newHwDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypervisorE getXMHypervisor() {
		return xMHypervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXMHypervisor(HypervisorE newXMHypervisor, NotificationChain msgs) {
		HypervisorE oldXMHypervisor = xMHypervisor;
		xMHypervisor = newXMHypervisor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.SYSTEM_DESCRIPTION_TYPE__XM_HYPERVISOR, oldXMHypervisor, newXMHypervisor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMHypervisor(HypervisorE newXMHypervisor) {
		if (newXMHypervisor != xMHypervisor) {
			NotificationChain msgs = null;
			if (xMHypervisor != null)
				msgs = ((InternalEObject)xMHypervisor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.SYSTEM_DESCRIPTION_TYPE__XM_HYPERVISOR, null, msgs);
			if (newXMHypervisor != null)
				msgs = ((InternalEObject)newXMHypervisor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.SYSTEM_DESCRIPTION_TYPE__XM_HYPERVISOR, null, msgs);
			msgs = basicSetXMHypervisor(newXMHypervisor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.SYSTEM_DESCRIPTION_TYPE__XM_HYPERVISOR, newXMHypervisor, newXMHypervisor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RswE getResidentSw() {
		return residentSw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResidentSw(RswE newResidentSw, NotificationChain msgs) {
		RswE oldResidentSw = residentSw;
		residentSw = newResidentSw;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.SYSTEM_DESCRIPTION_TYPE__RESIDENT_SW, oldResidentSw, newResidentSw);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResidentSw(RswE newResidentSw) {
		if (newResidentSw != residentSw) {
			NotificationChain msgs = null;
			if (residentSw != null)
				msgs = ((InternalEObject)residentSw).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.SYSTEM_DESCRIPTION_TYPE__RESIDENT_SW, null, msgs);
			if (newResidentSw != null)
				msgs = ((InternalEObject)newResidentSw).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.SYSTEM_DESCRIPTION_TYPE__RESIDENT_SW, null, msgs);
			msgs = basicSetResidentSw(newResidentSw, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.SYSTEM_DESCRIPTION_TYPE__RESIDENT_SW, newResidentSw, newResidentSw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionTableType getPartitionTable() {
		return partitionTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartitionTable(PartitionTableType newPartitionTable, NotificationChain msgs) {
		PartitionTableType oldPartitionTable = partitionTable;
		partitionTable = newPartitionTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.SYSTEM_DESCRIPTION_TYPE__PARTITION_TABLE, oldPartitionTable, newPartitionTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionTable(PartitionTableType newPartitionTable) {
		if (newPartitionTable != partitionTable) {
			NotificationChain msgs = null;
			if (partitionTable != null)
				msgs = ((InternalEObject)partitionTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.SYSTEM_DESCRIPTION_TYPE__PARTITION_TABLE, null, msgs);
			if (newPartitionTable != null)
				msgs = ((InternalEObject)newPartitionTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.SYSTEM_DESCRIPTION_TYPE__PARTITION_TABLE, null, msgs);
			msgs = basicSetPartitionTable(newPartitionTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.SYSTEM_DESCRIPTION_TYPE__PARTITION_TABLE, newPartitionTable, newPartitionTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelsE getChannels() {
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannels(ChannelsE newChannels, NotificationChain msgs) {
		ChannelsE oldChannels = channels;
		channels = newChannels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.SYSTEM_DESCRIPTION_TYPE__CHANNELS, oldChannels, newChannels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannels(ChannelsE newChannels) {
		if (newChannels != channels) {
			NotificationChain msgs = null;
			if (channels != null)
				msgs = ((InternalEObject)channels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.SYSTEM_DESCRIPTION_TYPE__CHANNELS, null, msgs);
			if (newChannels != null)
				msgs = ((InternalEObject)newChannels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.SYSTEM_DESCRIPTION_TYPE__CHANNELS, null, msgs);
			msgs = basicSetChannels(newChannels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.SYSTEM_DESCRIPTION_TYPE__CHANNELS, newChannels, newChannels));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.SYSTEM_DESCRIPTION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.SYSTEM_DESCRIPTION_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__HW_DESCRIPTION:
				return basicSetHwDescription(null, msgs);
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__XM_HYPERVISOR:
				return basicSetXMHypervisor(null, msgs);
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__RESIDENT_SW:
				return basicSetResidentSw(null, msgs);
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__PARTITION_TABLE:
				return basicSetPartitionTable(null, msgs);
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__CHANNELS:
				return basicSetChannels(null, msgs);
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
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__HW_DESCRIPTION:
				return getHwDescription();
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__XM_HYPERVISOR:
				return getXMHypervisor();
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__RESIDENT_SW:
				return getResidentSw();
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__PARTITION_TABLE:
				return getPartitionTable();
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__CHANNELS:
				return getChannels();
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__NAME:
				return getName();
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__HW_DESCRIPTION:
				setHwDescription((HwDescriptionE)newValue);
				return;
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__XM_HYPERVISOR:
				setXMHypervisor((HypervisorE)newValue);
				return;
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__RESIDENT_SW:
				setResidentSw((RswE)newValue);
				return;
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__PARTITION_TABLE:
				setPartitionTable((PartitionTableType)newValue);
				return;
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__CHANNELS:
				setChannels((ChannelsE)newValue);
				return;
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__NAME:
				setName((String)newValue);
				return;
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__VERSION:
				setVersion((String)newValue);
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
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__HW_DESCRIPTION:
				setHwDescription((HwDescriptionE)null);
				return;
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__XM_HYPERVISOR:
				setXMHypervisor((HypervisorE)null);
				return;
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__RESIDENT_SW:
				setResidentSw((RswE)null);
				return;
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__PARTITION_TABLE:
				setPartitionTable((PartitionTableType)null);
				return;
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__CHANNELS:
				setChannels((ChannelsE)null);
				return;
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__HW_DESCRIPTION:
				return hwDescription != null;
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__XM_HYPERVISOR:
				return xMHypervisor != null;
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__RESIDENT_SW:
				return residentSw != null;
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__PARTITION_TABLE:
				return partitionTable != null;
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__CHANNELS:
				return channels != null;
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmcPackage.SYSTEM_DESCRIPTION_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //SystemDescriptionTypeImpl
