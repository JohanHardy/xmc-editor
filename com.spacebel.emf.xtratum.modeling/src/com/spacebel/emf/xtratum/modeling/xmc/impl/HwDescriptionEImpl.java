/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.impl;

import com.spacebel.emf.xtratum.modeling.xmc.DevicesE;
import com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE;
import com.spacebel.emf.xtratum.modeling.xmc.MemoryLayoutE;
import com.spacebel.emf.xtratum.modeling.xmc.ProcessorTableType;
import com.spacebel.emf.xtratum.modeling.xmc.XmcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Description E</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HwDescriptionEImpl#getMemoryLayout <em>Memory Layout</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HwDescriptionEImpl#getProcessorTable <em>Processor Table</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HwDescriptionEImpl#getDevices <em>Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HwDescriptionEImpl extends MinimalEObjectImpl.Container implements HwDescriptionE {
	/**
	 * The cached value of the '{@link #getMemoryLayout() <em>Memory Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryLayout()
	 * @generated
	 * @ordered
	 */
	protected MemoryLayoutE memoryLayout;

	/**
	 * The cached value of the '{@link #getProcessorTable() <em>Processor Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorTable()
	 * @generated
	 * @ordered
	 */
	protected ProcessorTableType processorTable;

	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected DevicesE devices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwDescriptionEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmcPackage.Literals.HW_DESCRIPTION_E;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryLayoutE getMemoryLayout() {
		return memoryLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemoryLayout(MemoryLayoutE newMemoryLayout, NotificationChain msgs) {
		MemoryLayoutE oldMemoryLayout = memoryLayout;
		memoryLayout = newMemoryLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.HW_DESCRIPTION_E__MEMORY_LAYOUT, oldMemoryLayout, newMemoryLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryLayout(MemoryLayoutE newMemoryLayout) {
		if (newMemoryLayout != memoryLayout) {
			NotificationChain msgs = null;
			if (memoryLayout != null)
				msgs = ((InternalEObject)memoryLayout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.HW_DESCRIPTION_E__MEMORY_LAYOUT, null, msgs);
			if (newMemoryLayout != null)
				msgs = ((InternalEObject)newMemoryLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.HW_DESCRIPTION_E__MEMORY_LAYOUT, null, msgs);
			msgs = basicSetMemoryLayout(newMemoryLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.HW_DESCRIPTION_E__MEMORY_LAYOUT, newMemoryLayout, newMemoryLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorTableType getProcessorTable() {
		return processorTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessorTable(ProcessorTableType newProcessorTable, NotificationChain msgs) {
		ProcessorTableType oldProcessorTable = processorTable;
		processorTable = newProcessorTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.HW_DESCRIPTION_E__PROCESSOR_TABLE, oldProcessorTable, newProcessorTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorTable(ProcessorTableType newProcessorTable) {
		if (newProcessorTable != processorTable) {
			NotificationChain msgs = null;
			if (processorTable != null)
				msgs = ((InternalEObject)processorTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.HW_DESCRIPTION_E__PROCESSOR_TABLE, null, msgs);
			if (newProcessorTable != null)
				msgs = ((InternalEObject)newProcessorTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.HW_DESCRIPTION_E__PROCESSOR_TABLE, null, msgs);
			msgs = basicSetProcessorTable(newProcessorTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.HW_DESCRIPTION_E__PROCESSOR_TABLE, newProcessorTable, newProcessorTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicesE getDevices() {
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevices(DevicesE newDevices, NotificationChain msgs) {
		DevicesE oldDevices = devices;
		devices = newDevices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.HW_DESCRIPTION_E__DEVICES, oldDevices, newDevices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevices(DevicesE newDevices) {
		if (newDevices != devices) {
			NotificationChain msgs = null;
			if (devices != null)
				msgs = ((InternalEObject)devices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.HW_DESCRIPTION_E__DEVICES, null, msgs);
			if (newDevices != null)
				msgs = ((InternalEObject)newDevices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.HW_DESCRIPTION_E__DEVICES, null, msgs);
			msgs = basicSetDevices(newDevices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.HW_DESCRIPTION_E__DEVICES, newDevices, newDevices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmcPackage.HW_DESCRIPTION_E__MEMORY_LAYOUT:
				return basicSetMemoryLayout(null, msgs);
			case XmcPackage.HW_DESCRIPTION_E__PROCESSOR_TABLE:
				return basicSetProcessorTable(null, msgs);
			case XmcPackage.HW_DESCRIPTION_E__DEVICES:
				return basicSetDevices(null, msgs);
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
			case XmcPackage.HW_DESCRIPTION_E__MEMORY_LAYOUT:
				return getMemoryLayout();
			case XmcPackage.HW_DESCRIPTION_E__PROCESSOR_TABLE:
				return getProcessorTable();
			case XmcPackage.HW_DESCRIPTION_E__DEVICES:
				return getDevices();
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
			case XmcPackage.HW_DESCRIPTION_E__MEMORY_LAYOUT:
				setMemoryLayout((MemoryLayoutE)newValue);
				return;
			case XmcPackage.HW_DESCRIPTION_E__PROCESSOR_TABLE:
				setProcessorTable((ProcessorTableType)newValue);
				return;
			case XmcPackage.HW_DESCRIPTION_E__DEVICES:
				setDevices((DevicesE)newValue);
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
			case XmcPackage.HW_DESCRIPTION_E__MEMORY_LAYOUT:
				setMemoryLayout((MemoryLayoutE)null);
				return;
			case XmcPackage.HW_DESCRIPTION_E__PROCESSOR_TABLE:
				setProcessorTable((ProcessorTableType)null);
				return;
			case XmcPackage.HW_DESCRIPTION_E__DEVICES:
				setDevices((DevicesE)null);
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
			case XmcPackage.HW_DESCRIPTION_E__MEMORY_LAYOUT:
				return memoryLayout != null;
			case XmcPackage.HW_DESCRIPTION_E__PROCESSOR_TABLE:
				return processorTable != null;
			case XmcPackage.HW_DESCRIPTION_E__DEVICES:
				return devices != null;
		}
		return super.eIsSet(featureID);
	}

} //HwDescriptionEImpl
