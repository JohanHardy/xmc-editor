/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rsw E</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.RswE#getPhysicalMemoryAreas <em>Physical Memory Areas</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getRswE()
 * @model extendedMetaData="name='rsw_e' kind='elementOnly'"
 * @generated
 */
public interface RswE extends EObject {
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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getRswE_PhysicalMemoryAreas()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PhysicalMemoryAreas' namespace='##targetNamespace'"
	 * @generated
	 */
	MemoryAreaE getPhysicalMemoryAreas();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.RswE#getPhysicalMemoryAreas <em>Physical Memory Areas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Memory Areas</em>' containment reference.
	 * @see #getPhysicalMemoryAreas()
	 * @generated
	 */
	void setPhysicalMemoryAreas(MemoryAreaE value);

} // RswE
