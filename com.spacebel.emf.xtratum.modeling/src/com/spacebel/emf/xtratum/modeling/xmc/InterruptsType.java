/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interrupts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.InterruptsType#getLines <em>Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getInterruptsType()
 * @model extendedMetaData="name='Interrupts_._type' kind='empty'"
 * @generated
 */
public interface InterruptsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' attribute.
	 * @see #setLines(List)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getInterruptsType_Lines()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.HwIrqIdListT" required="true" many="false"
	 *        extendedMetaData="kind='attribute' name='lines'"
	 * @generated
	 */
	List<BigInteger> getLines();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.InterruptsType#getLines <em>Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lines</em>' attribute.
	 * @see #getLines()
	 * @generated
	 */
	void setLines(List<BigInteger> value);

} // InterruptsType
