/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.impl;

import com.spacebel.emf.xtratum.modeling.xmc.HwResourcesE;
import com.spacebel.emf.xtratum.modeling.xmc.InterruptsType;
import com.spacebel.emf.xtratum.modeling.xmc.IoPortsE;
import com.spacebel.emf.xtratum.modeling.xmc.XmcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Resources E</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HwResourcesEImpl#getIoPorts <em>Io Ports</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HwResourcesEImpl#getInterrupts <em>Interrupts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HwResourcesEImpl extends MinimalEObjectImpl.Container implements HwResourcesE {
	/**
	 * The cached value of the '{@link #getIoPorts() <em>Io Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoPorts()
	 * @generated
	 * @ordered
	 */
	protected IoPortsE ioPorts;

	/**
	 * The cached value of the '{@link #getInterrupts() <em>Interrupts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterrupts()
	 * @generated
	 * @ordered
	 */
	protected InterruptsType interrupts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwResourcesEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmcPackage.Literals.HW_RESOURCES_E;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoPortsE getIoPorts() {
		return ioPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIoPorts(IoPortsE newIoPorts, NotificationChain msgs) {
		IoPortsE oldIoPorts = ioPorts;
		ioPorts = newIoPorts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.HW_RESOURCES_E__IO_PORTS, oldIoPorts, newIoPorts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoPorts(IoPortsE newIoPorts) {
		if (newIoPorts != ioPorts) {
			NotificationChain msgs = null;
			if (ioPorts != null)
				msgs = ((InternalEObject)ioPorts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.HW_RESOURCES_E__IO_PORTS, null, msgs);
			if (newIoPorts != null)
				msgs = ((InternalEObject)newIoPorts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.HW_RESOURCES_E__IO_PORTS, null, msgs);
			msgs = basicSetIoPorts(newIoPorts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.HW_RESOURCES_E__IO_PORTS, newIoPorts, newIoPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptsType getInterrupts() {
		return interrupts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterrupts(InterruptsType newInterrupts, NotificationChain msgs) {
		InterruptsType oldInterrupts = interrupts;
		interrupts = newInterrupts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.HW_RESOURCES_E__INTERRUPTS, oldInterrupts, newInterrupts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterrupts(InterruptsType newInterrupts) {
		if (newInterrupts != interrupts) {
			NotificationChain msgs = null;
			if (interrupts != null)
				msgs = ((InternalEObject)interrupts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.HW_RESOURCES_E__INTERRUPTS, null, msgs);
			if (newInterrupts != null)
				msgs = ((InternalEObject)newInterrupts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.HW_RESOURCES_E__INTERRUPTS, null, msgs);
			msgs = basicSetInterrupts(newInterrupts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.HW_RESOURCES_E__INTERRUPTS, newInterrupts, newInterrupts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmcPackage.HW_RESOURCES_E__IO_PORTS:
				return basicSetIoPorts(null, msgs);
			case XmcPackage.HW_RESOURCES_E__INTERRUPTS:
				return basicSetInterrupts(null, msgs);
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
			case XmcPackage.HW_RESOURCES_E__IO_PORTS:
				return getIoPorts();
			case XmcPackage.HW_RESOURCES_E__INTERRUPTS:
				return getInterrupts();
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
			case XmcPackage.HW_RESOURCES_E__IO_PORTS:
				setIoPorts((IoPortsE)newValue);
				return;
			case XmcPackage.HW_RESOURCES_E__INTERRUPTS:
				setInterrupts((InterruptsType)newValue);
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
			case XmcPackage.HW_RESOURCES_E__IO_PORTS:
				setIoPorts((IoPortsE)null);
				return;
			case XmcPackage.HW_RESOURCES_E__INTERRUPTS:
				setInterrupts((InterruptsType)null);
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
			case XmcPackage.HW_RESOURCES_E__IO_PORTS:
				return ioPorts != null;
			case XmcPackage.HW_RESOURCES_E__INTERRUPTS:
				return interrupts != null;
		}
		return super.eIsSet(featureID);
	}

} //HwResourcesEImpl
