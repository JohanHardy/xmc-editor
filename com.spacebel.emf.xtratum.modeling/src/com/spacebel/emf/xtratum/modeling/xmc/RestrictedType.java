/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restricted Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.RestrictedType#getAddress <em>Address</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.RestrictedType#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getRestrictedType()
 * @model extendedMetaData="name='Restricted_._type' kind='empty'"
 * @generated
 */
public interface RestrictedType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getRestrictedType_Address()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.HexT" required="true"
	 *        extendedMetaData="kind='attribute' name='address'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.RestrictedType#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Mask</b></em>' attribute.
	 * The default value is <code>"0x0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask</em>' attribute.
	 * @see #isSetMask()
	 * @see #unsetMask()
	 * @see #setMask(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getRestrictedType_Mask()
	 * @model default="0x0" unsettable="true" dataType="com.spacebel.emf.xtratum.modeling.xmc.HexT"
	 *        extendedMetaData="kind='attribute' name='mask'"
	 * @generated
	 */
	String getMask();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.RestrictedType#getMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' attribute.
	 * @see #isSetMask()
	 * @see #unsetMask()
	 * @see #getMask()
	 * @generated
	 */
	void setMask(String value);

	/**
	 * Unsets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.RestrictedType#getMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMask()
	 * @see #getMask()
	 * @see #setMask(String)
	 * @generated
	 */
	void unsetMask();

	/**
	 * Returns whether the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.RestrictedType#getMask <em>Mask</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mask</em>' attribute is set.
	 * @see #unsetMask()
	 * @see #getMask()
	 * @see #setMask(String)
	 * @generated
	 */
	boolean isSetMask();

} // RestrictedType
