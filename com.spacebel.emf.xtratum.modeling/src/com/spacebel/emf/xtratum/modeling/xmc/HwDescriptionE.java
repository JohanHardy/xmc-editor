/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Description E</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE#getMemoryLayout <em>Memory Layout</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE#getProcessorTable <em>Processor Table</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE#getDevices <em>Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHwDescriptionE()
 * @model extendedMetaData="name='hwDescription_e' kind='elementOnly'"
 * @generated
 */
public interface HwDescriptionE extends EObject {
	/**
	 * Returns the value of the '<em><b>Memory Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Layout</em>' containment reference.
	 * @see #setMemoryLayout(MemoryLayoutE)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHwDescriptionE_MemoryLayout()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MemoryLayout' namespace='##targetNamespace'"
	 * @generated
	 */
	MemoryLayoutE getMemoryLayout();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE#getMemoryLayout <em>Memory Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Layout</em>' containment reference.
	 * @see #getMemoryLayout()
	 * @generated
	 */
	void setMemoryLayout(MemoryLayoutE value);

	/**
	 * Returns the value of the '<em><b>Processor Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Table</em>' containment reference.
	 * @see #setProcessorTable(ProcessorTableType)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHwDescriptionE_ProcessorTable()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ProcessorTable' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcessorTableType getProcessorTable();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE#getProcessorTable <em>Processor Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Table</em>' containment reference.
	 * @see #getProcessorTable()
	 * @generated
	 */
	void setProcessorTable(ProcessorTableType value);

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference.
	 * @see #setDevices(DevicesE)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHwDescriptionE_Devices()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Devices' namespace='##targetNamespace'"
	 * @generated
	 */
	DevicesE getDevices();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.HwDescriptionE#getDevices <em>Devices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devices</em>' containment reference.
	 * @see #getDevices()
	 * @generated
	 */
	void setDevices(DevicesE value);

} // HwDescriptionE
