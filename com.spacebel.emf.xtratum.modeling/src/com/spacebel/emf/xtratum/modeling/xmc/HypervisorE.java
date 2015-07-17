/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypervisor E</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getPhysicalMemoryArea <em>Physical Memory Area</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getHealthMonitor <em>Health Monitor</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getTrace <em>Trace</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getConsole <em>Console</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getHealthMonitorAppDevice <em>Health Monitor App Device</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getHealthMonitorDevice <em>Health Monitor Device</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHypervisorE()
 * @model extendedMetaData="name='hypervisor_e' kind='elementOnly'"
 * @generated
 */
public interface HypervisorE extends EObject {
	/**
	 * Returns the value of the '<em><b>Physical Memory Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Memory Area</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Memory Area</em>' containment reference.
	 * @see #setPhysicalMemoryArea(HypMemoryAreaE)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHypervisorE_PhysicalMemoryArea()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PhysicalMemoryArea' namespace='##targetNamespace'"
	 * @generated
	 */
	HypMemoryAreaE getPhysicalMemoryArea();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getPhysicalMemoryArea <em>Physical Memory Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Memory Area</em>' containment reference.
	 * @see #getPhysicalMemoryArea()
	 * @generated
	 */
	void setPhysicalMemoryArea(HypMemoryAreaE value);

	/**
	 * Returns the value of the '<em><b>Health Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Health Monitor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Monitor</em>' containment reference.
	 * @see #setHealthMonitor(HealthMonitorE)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHypervisorE_HealthMonitor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HealthMonitor' namespace='##targetNamespace'"
	 * @generated
	 */
	HealthMonitorE getHealthMonitor();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getHealthMonitor <em>Health Monitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Monitor</em>' containment reference.
	 * @see #getHealthMonitor()
	 * @generated
	 */
	void setHealthMonitor(HealthMonitorE value);

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' containment reference.
	 * @see #setTrace(TraceE)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHypervisorE_Trace()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Trace' namespace='##targetNamespace'"
	 * @generated
	 */
	TraceE getTrace();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getTrace <em>Trace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' containment reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(TraceE value);

	/**
	 * Returns the value of the '<em><b>Console</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Console</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Console</em>' attribute.
	 * @see #setConsole(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHypervisorE_Console()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdStringT"
	 *        extendedMetaData="kind='attribute' name='console'"
	 * @generated
	 */
	String getConsole();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getConsole <em>Console</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Console</em>' attribute.
	 * @see #getConsole()
	 * @generated
	 */
	void setConsole(String value);

	/**
	 * Returns the value of the '<em><b>Health Monitor App Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Health Monitor App Device</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Monitor App Device</em>' attribute.
	 * @see #setHealthMonitorAppDevice(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHypervisorE_HealthMonitorAppDevice()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdStringT"
	 *        extendedMetaData="kind='attribute' name='healthMonitorAppDevice'"
	 * @generated
	 */
	String getHealthMonitorAppDevice();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getHealthMonitorAppDevice <em>Health Monitor App Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Monitor App Device</em>' attribute.
	 * @see #getHealthMonitorAppDevice()
	 * @generated
	 */
	void setHealthMonitorAppDevice(String value);

	/**
	 * Returns the value of the '<em><b>Health Monitor Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Health Monitor Device</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Monitor Device</em>' attribute.
	 * @see #setHealthMonitorDevice(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHypervisorE_HealthMonitorDevice()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdStringT"
	 *        extendedMetaData="kind='attribute' name='healthMonitorDevice'"
	 * @generated
	 */
	String getHealthMonitorDevice();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.HypervisorE#getHealthMonitorDevice <em>Health Monitor Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Monitor Device</em>' attribute.
	 * @see #getHealthMonitorDevice()
	 * @generated
	 */
	void setHealthMonitorDevice(String value);

} // HypervisorE
