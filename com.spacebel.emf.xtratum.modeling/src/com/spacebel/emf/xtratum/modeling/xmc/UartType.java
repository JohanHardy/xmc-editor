/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uart Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.UartType#getBaudRate <em>Baud Rate</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.UartType#getId <em>Id</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.UartType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getUartType()
 * @model extendedMetaData="name='Uart_._type' kind='empty'"
 * @generated
 */
public interface UartType extends EObject {
	/**
	 * Returns the value of the '<em><b>Baud Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Baud Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baud Rate</em>' attribute.
	 * @see #setBaudRate(BigInteger)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getUartType_BaudRate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='baudRate'"
	 * @generated
	 */
	BigInteger getBaudRate();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.UartType#getBaudRate <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baud Rate</em>' attribute.
	 * @see #getBaudRate()
	 * @generated
	 */
	void setBaudRate(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getUartType_Id()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdStringT" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.UartType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getUartType_Name()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdStringT" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.UartType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // UartType
