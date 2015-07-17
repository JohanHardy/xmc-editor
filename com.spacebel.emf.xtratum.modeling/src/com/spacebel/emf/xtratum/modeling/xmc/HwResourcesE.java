/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Resources E</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.HwResourcesE#getIoPorts <em>Io Ports</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.HwResourcesE#getInterrupts <em>Interrupts</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHwResourcesE()
 * @model extendedMetaData="name='hwResources_e' kind='elementOnly'"
 * @generated
 */
public interface HwResourcesE extends EObject {
	/**
	 * Returns the value of the '<em><b>Io Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Ports</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Ports</em>' containment reference.
	 * @see #setIoPorts(IoPortsE)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHwResourcesE_IoPorts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IoPorts' namespace='##targetNamespace'"
	 * @generated
	 */
	IoPortsE getIoPorts();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.HwResourcesE#getIoPorts <em>Io Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Io Ports</em>' containment reference.
	 * @see #getIoPorts()
	 * @generated
	 */
	void setIoPorts(IoPortsE value);

	/**
	 * Returns the value of the '<em><b>Interrupts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupts</em>' containment reference.
	 * @see #setInterrupts(InterruptsType)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHwResourcesE_Interrupts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Interrupts' namespace='##targetNamespace'"
	 * @generated
	 */
	InterruptsType getInterrupts();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.HwResourcesE#getInterrupts <em>Interrupts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupts</em>' containment reference.
	 * @see #getInterrupts()
	 * @generated
	 */
	void setInterrupts(InterruptsType value);

} // HwResourcesE
