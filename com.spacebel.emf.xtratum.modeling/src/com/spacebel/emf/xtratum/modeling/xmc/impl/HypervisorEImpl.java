/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.impl;

import com.spacebel.emf.xtratum.modeling.xmc.HealthMonitorE;
import com.spacebel.emf.xtratum.modeling.xmc.HypMemoryAreaE;
import com.spacebel.emf.xtratum.modeling.xmc.HypervisorE;
import com.spacebel.emf.xtratum.modeling.xmc.TraceE;
import com.spacebel.emf.xtratum.modeling.xmc.XmcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hypervisor E</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HypervisorEImpl#getPhysicalMemoryArea <em>Physical Memory Area</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HypervisorEImpl#getHealthMonitor <em>Health Monitor</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HypervisorEImpl#getTrace <em>Trace</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HypervisorEImpl#getConsole <em>Console</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HypervisorEImpl#getHealthMonitorAppDevice <em>Health Monitor App Device</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.HypervisorEImpl#getHealthMonitorDevice <em>Health Monitor Device</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HypervisorEImpl extends MinimalEObjectImpl.Container implements HypervisorE {
	/**
	 * The cached value of the '{@link #getPhysicalMemoryArea() <em>Physical Memory Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalMemoryArea()
	 * @generated
	 * @ordered
	 */
	protected HypMemoryAreaE physicalMemoryArea;

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
	 * The cached value of the '{@link #getTrace() <em>Trace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace()
	 * @generated
	 * @ordered
	 */
	protected TraceE trace;

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
	 * The default value of the '{@link #getHealthMonitorAppDevice() <em>Health Monitor App Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthMonitorAppDevice()
	 * @generated
	 * @ordered
	 */
	protected static final String HEALTH_MONITOR_APP_DEVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHealthMonitorAppDevice() <em>Health Monitor App Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthMonitorAppDevice()
	 * @generated
	 * @ordered
	 */
	protected String healthMonitorAppDevice = HEALTH_MONITOR_APP_DEVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHealthMonitorDevice() <em>Health Monitor Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthMonitorDevice()
	 * @generated
	 * @ordered
	 */
	protected static final String HEALTH_MONITOR_DEVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHealthMonitorDevice() <em>Health Monitor Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthMonitorDevice()
	 * @generated
	 * @ordered
	 */
	protected String healthMonitorDevice = HEALTH_MONITOR_DEVICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HypervisorEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmcPackage.Literals.HYPERVISOR_E;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypMemoryAreaE getPhysicalMemoryArea() {
		return physicalMemoryArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalMemoryArea(HypMemoryAreaE newPhysicalMemoryArea, NotificationChain msgs) {
		HypMemoryAreaE oldPhysicalMemoryArea = physicalMemoryArea;
		physicalMemoryArea = newPhysicalMemoryArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.HYPERVISOR_E__PHYSICAL_MEMORY_AREA, oldPhysicalMemoryArea, newPhysicalMemoryArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalMemoryArea(HypMemoryAreaE newPhysicalMemoryArea) {
		if (newPhysicalMemoryArea != physicalMemoryArea) {
			NotificationChain msgs = null;
			if (physicalMemoryArea != null)
				msgs = ((InternalEObject)physicalMemoryArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.HYPERVISOR_E__PHYSICAL_MEMORY_AREA, null, msgs);
			if (newPhysicalMemoryArea != null)
				msgs = ((InternalEObject)newPhysicalMemoryArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.HYPERVISOR_E__PHYSICAL_MEMORY_AREA, null, msgs);
			msgs = basicSetPhysicalMemoryArea(newPhysicalMemoryArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.HYPERVISOR_E__PHYSICAL_MEMORY_AREA, newPhysicalMemoryArea, newPhysicalMemoryArea));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.HYPERVISOR_E__HEALTH_MONITOR, oldHealthMonitor, newHealthMonitor);
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
				msgs = ((InternalEObject)healthMonitor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.HYPERVISOR_E__HEALTH_MONITOR, null, msgs);
			if (newHealthMonitor != null)
				msgs = ((InternalEObject)newHealthMonitor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.HYPERVISOR_E__HEALTH_MONITOR, null, msgs);
			msgs = basicSetHealthMonitor(newHealthMonitor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.HYPERVISOR_E__HEALTH_MONITOR, newHealthMonitor, newHealthMonitor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.HYPERVISOR_E__TRACE, oldTrace, newTrace);
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
				msgs = ((InternalEObject)trace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.HYPERVISOR_E__TRACE, null, msgs);
			if (newTrace != null)
				msgs = ((InternalEObject)newTrace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.HYPERVISOR_E__TRACE, null, msgs);
			msgs = basicSetTrace(newTrace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.HYPERVISOR_E__TRACE, newTrace, newTrace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.HYPERVISOR_E__CONSOLE, oldConsole, console));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHealthMonitorAppDevice() {
		return healthMonitorAppDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthMonitorAppDevice(String newHealthMonitorAppDevice) {
		String oldHealthMonitorAppDevice = healthMonitorAppDevice;
		healthMonitorAppDevice = newHealthMonitorAppDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.HYPERVISOR_E__HEALTH_MONITOR_APP_DEVICE, oldHealthMonitorAppDevice, healthMonitorAppDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHealthMonitorDevice() {
		return healthMonitorDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthMonitorDevice(String newHealthMonitorDevice) {
		String oldHealthMonitorDevice = healthMonitorDevice;
		healthMonitorDevice = newHealthMonitorDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.HYPERVISOR_E__HEALTH_MONITOR_DEVICE, oldHealthMonitorDevice, healthMonitorDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmcPackage.HYPERVISOR_E__PHYSICAL_MEMORY_AREA:
				return basicSetPhysicalMemoryArea(null, msgs);
			case XmcPackage.HYPERVISOR_E__HEALTH_MONITOR:
				return basicSetHealthMonitor(null, msgs);
			case XmcPackage.HYPERVISOR_E__TRACE:
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
			case XmcPackage.HYPERVISOR_E__PHYSICAL_MEMORY_AREA:
				return getPhysicalMemoryArea();
			case XmcPackage.HYPERVISOR_E__HEALTH_MONITOR:
				return getHealthMonitor();
			case XmcPackage.HYPERVISOR_E__TRACE:
				return getTrace();
			case XmcPackage.HYPERVISOR_E__CONSOLE:
				return getConsole();
			case XmcPackage.HYPERVISOR_E__HEALTH_MONITOR_APP_DEVICE:
				return getHealthMonitorAppDevice();
			case XmcPackage.HYPERVISOR_E__HEALTH_MONITOR_DEVICE:
				return getHealthMonitorDevice();
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
			case XmcPackage.HYPERVISOR_E__PHYSICAL_MEMORY_AREA:
				setPhysicalMemoryArea((HypMemoryAreaE)newValue);
				return;
			case XmcPackage.HYPERVISOR_E__HEALTH_MONITOR:
				setHealthMonitor((HealthMonitorE)newValue);
				return;
			case XmcPackage.HYPERVISOR_E__TRACE:
				setTrace((TraceE)newValue);
				return;
			case XmcPackage.HYPERVISOR_E__CONSOLE:
				setConsole((String)newValue);
				return;
			case XmcPackage.HYPERVISOR_E__HEALTH_MONITOR_APP_DEVICE:
				setHealthMonitorAppDevice((String)newValue);
				return;
			case XmcPackage.HYPERVISOR_E__HEALTH_MONITOR_DEVICE:
				setHealthMonitorDevice((String)newValue);
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
			case XmcPackage.HYPERVISOR_E__PHYSICAL_MEMORY_AREA:
				setPhysicalMemoryArea((HypMemoryAreaE)null);
				return;
			case XmcPackage.HYPERVISOR_E__HEALTH_MONITOR:
				setHealthMonitor((HealthMonitorE)null);
				return;
			case XmcPackage.HYPERVISOR_E__TRACE:
				setTrace((TraceE)null);
				return;
			case XmcPackage.HYPERVISOR_E__CONSOLE:
				setConsole(CONSOLE_EDEFAULT);
				return;
			case XmcPackage.HYPERVISOR_E__HEALTH_MONITOR_APP_DEVICE:
				setHealthMonitorAppDevice(HEALTH_MONITOR_APP_DEVICE_EDEFAULT);
				return;
			case XmcPackage.HYPERVISOR_E__HEALTH_MONITOR_DEVICE:
				setHealthMonitorDevice(HEALTH_MONITOR_DEVICE_EDEFAULT);
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
			case XmcPackage.HYPERVISOR_E__PHYSICAL_MEMORY_AREA:
				return physicalMemoryArea != null;
			case XmcPackage.HYPERVISOR_E__HEALTH_MONITOR:
				return healthMonitor != null;
			case XmcPackage.HYPERVISOR_E__TRACE:
				return trace != null;
			case XmcPackage.HYPERVISOR_E__CONSOLE:
				return CONSOLE_EDEFAULT == null ? console != null : !CONSOLE_EDEFAULT.equals(console);
			case XmcPackage.HYPERVISOR_E__HEALTH_MONITOR_APP_DEVICE:
				return HEALTH_MONITOR_APP_DEVICE_EDEFAULT == null ? healthMonitorAppDevice != null : !HEALTH_MONITOR_APP_DEVICE_EDEFAULT.equals(healthMonitorAppDevice);
			case XmcPackage.HYPERVISOR_E__HEALTH_MONITOR_DEVICE:
				return HEALTH_MONITOR_DEVICE_EDEFAULT == null ? healthMonitorDevice != null : !HEALTH_MONITOR_DEVICE_EDEFAULT.equals(healthMonitorDevice);
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
		result.append(" (console: ");
		result.append(console);
		result.append(", healthMonitorAppDevice: ");
		result.append(healthMonitorAppDevice);
		result.append(", healthMonitorDevice: ");
		result.append(healthMonitorDevice);
		result.append(')');
		return result.toString();
	}

} //HypervisorEImpl
