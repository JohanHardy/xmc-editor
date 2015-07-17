/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition E</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getPhysicalMemoryAreas <em>Physical Memory Areas</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getTemporalRequirements <em>Temporal Requirements</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getHealthMonitor <em>Health Monitor</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getHwResources <em>Hw Resources</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getPortTable <em>Port Table</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getTrace <em>Trace</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getBoot <em>Boot</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getConsole <em>Console</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getFlags <em>Flags</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getId <em>Id</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPartitionE()
 * @model extendedMetaData="name='partition_e' kind='elementOnly'"
 * @generated
 */
public interface PartitionE extends EObject {
	/**
	 * Returns the value of the '<em><b>Physical Memory Areas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Memory Areas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Memory Areas</em>' containment reference.
	 * @see #setPhysicalMemoryAreas(MemoryAreaE)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPartitionE_PhysicalMemoryAreas()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PhysicalMemoryAreas' namespace='##targetNamespace'"
	 * @generated
	 */
	MemoryAreaE getPhysicalMemoryAreas();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getPhysicalMemoryAreas <em>Physical Memory Areas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Memory Areas</em>' containment reference.
	 * @see #getPhysicalMemoryAreas()
	 * @generated
	 */
	void setPhysicalMemoryAreas(MemoryAreaE value);

	/**
	 * Returns the value of the '<em><b>Temporal Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporal Requirements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Requirements</em>' containment reference.
	 * @see #setTemporalRequirements(TemporalRequirementsType)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPartitionE_TemporalRequirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TemporalRequirements' namespace='##targetNamespace'"
	 * @generated
	 */
	TemporalRequirementsType getTemporalRequirements();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getTemporalRequirements <em>Temporal Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Requirements</em>' containment reference.
	 * @see #getTemporalRequirements()
	 * @generated
	 */
	void setTemporalRequirements(TemporalRequirementsType value);

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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPartitionE_HealthMonitor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HealthMonitor' namespace='##targetNamespace'"
	 * @generated
	 */
	HealthMonitorE getHealthMonitor();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getHealthMonitor <em>Health Monitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Monitor</em>' containment reference.
	 * @see #getHealthMonitor()
	 * @generated
	 */
	void setHealthMonitor(HealthMonitorE value);

	/**
	 * Returns the value of the '<em><b>Hw Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hw Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hw Resources</em>' containment reference.
	 * @see #setHwResources(HwResourcesE)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPartitionE_HwResources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HwResources' namespace='##targetNamespace'"
	 * @generated
	 */
	HwResourcesE getHwResources();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getHwResources <em>Hw Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hw Resources</em>' containment reference.
	 * @see #getHwResources()
	 * @generated
	 */
	void setHwResources(HwResourcesE value);

	/**
	 * Returns the value of the '<em><b>Port Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Table</em>' containment reference.
	 * @see #setPortTable(PartitionPortsE)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPartitionE_PortTable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PortTable' namespace='##targetNamespace'"
	 * @generated
	 */
	PartitionPortsE getPortTable();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getPortTable <em>Port Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Table</em>' containment reference.
	 * @see #getPortTable()
	 * @generated
	 */
	void setPortTable(PartitionPortsE value);

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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPartitionE_Trace()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Trace' namespace='##targetNamespace'"
	 * @generated
	 */
	TraceE getTrace();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getTrace <em>Trace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' containment reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(TraceE value);

	/**
	 * Returns the value of the '<em><b>Boot</b></em>' attribute.
	 * The default value is <code>"yes"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boot</em>' attribute.
	 * @see #isSetBoot()
	 * @see #unsetBoot()
	 * @see #setBoot(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPartitionE_Boot()
	 * @model default="yes" unsettable="true" dataType="com.spacebel.emf.xtratum.modeling.xmc.IdStringT"
	 *        extendedMetaData="kind='attribute' name='boot'"
	 * @generated
	 */
	String getBoot();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getBoot <em>Boot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boot</em>' attribute.
	 * @see #isSetBoot()
	 * @see #unsetBoot()
	 * @see #getBoot()
	 * @generated
	 */
	void setBoot(String value);

	/**
	 * Unsets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getBoot <em>Boot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoot()
	 * @see #getBoot()
	 * @see #setBoot(String)
	 * @generated
	 */
	void unsetBoot();

	/**
	 * Returns whether the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getBoot <em>Boot</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Boot</em>' attribute is set.
	 * @see #unsetBoot()
	 * @see #getBoot()
	 * @see #setBoot(String)
	 * @generated
	 */
	boolean isSetBoot();

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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPartitionE_Console()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdStringT"
	 *        extendedMetaData="kind='attribute' name='console'"
	 * @generated
	 */
	String getConsole();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getConsole <em>Console</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Console</em>' attribute.
	 * @see #getConsole()
	 * @generated
	 */
	void setConsole(String value);

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #isSetFlags()
	 * @see #unsetFlags()
	 * @see #setFlags(List)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPartitionE_Flags()
	 * @model default="none" unsettable="true" dataType="com.spacebel.emf.xtratum.modeling.xmc.PartitionFlagsListT" many="false"
	 *        extendedMetaData="kind='attribute' name='flags'"
	 * @generated
	 */
	List<PartitionFlagsT> getFlags();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #isSetFlags()
	 * @see #unsetFlags()
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(List<PartitionFlagsT> value);

	/**
	 * Unsets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlags()
	 * @see #getFlags()
	 * @see #setFlags(List)
	 * @generated
	 */
	void unsetFlags();

	/**
	 * Returns whether the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getFlags <em>Flags</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flags</em>' attribute is set.
	 * @see #unsetFlags()
	 * @see #getFlags()
	 * @see #setFlags(List)
	 * @generated
	 */
	boolean isSetFlags();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(BigInteger)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPartitionE_Id()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdT" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	BigInteger getId();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPartitionE_Name()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdStringT"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PartitionE
