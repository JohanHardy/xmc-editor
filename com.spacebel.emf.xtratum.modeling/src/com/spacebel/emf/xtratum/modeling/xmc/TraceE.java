/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace E</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.TraceE#getBitmask <em>Bitmask</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.TraceE#getDevice <em>Device</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getTraceE()
 * @model extendedMetaData="name='trace_e' kind='empty'"
 * @generated
 */
public interface TraceE extends EObject {
	/**
	 * Returns the value of the '<em><b>Bitmask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bitmask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bitmask</em>' attribute.
	 * @see #setBitmask(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getTraceE_Bitmask()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.HexT" required="true"
	 *        extendedMetaData="kind='attribute' name='bitmask'"
	 * @generated
	 */
	String getBitmask();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.TraceE#getBitmask <em>Bitmask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bitmask</em>' attribute.
	 * @see #getBitmask()
	 * @generated
	 */
	void setBitmask(String value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' attribute.
	 * @see #setDevice(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getTraceE_Device()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdStringT" required="true"
	 *        extendedMetaData="kind='attribute' name='device'"
	 * @generated
	 */
	String getDevice();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.TraceE#getDevice <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' attribute.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(String value);

} // TraceE
