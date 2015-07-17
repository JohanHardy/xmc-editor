/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.RangeType#getBase <em>Base</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.RangeType#getNoPorts <em>No Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getRangeType()
 * @model extendedMetaData="name='Range_._type' kind='empty'"
 * @generated
 */
public interface RangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getRangeType_Base()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.HexT" required="true"
	 *        extendedMetaData="kind='attribute' name='base'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.RangeType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>No Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Ports</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Ports</em>' attribute.
	 * @see #setNoPorts(BigInteger)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getRangeType_NoPorts()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='noPorts'"
	 * @generated
	 */
	BigInteger getNoPorts();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.RangeType#getNoPorts <em>No Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Ports</em>' attribute.
	 * @see #getNoPorts()
	 * @generated
	 */
	void setNoPorts(BigInteger value);

} // RangeType
