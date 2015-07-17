/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.RegionType#getSize <em>Size</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.RegionType#getStart <em>Start</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.RegionType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getRegionType()
 * @model extendedMetaData="name='Region_._type' kind='empty'"
 * @generated
 */
public interface RegionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getRegionType_Size()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.SizeUnitT" required="true"
	 *        extendedMetaData="kind='attribute' name='size'"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.RegionType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getRegionType_Start()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.HexT" required="true"
	 *        extendedMetaData="kind='attribute' name='start'"
	 * @generated
	 */
	String getStart();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.RegionType#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.spacebel.emf.xtratum.modeling.xmc.MemRegionT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemRegionT
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(MemRegionT)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getRegionType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	MemRegionT getType();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.RegionType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.MemRegionT
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(MemRegionT value);

	/**
	 * Unsets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.RegionType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(MemRegionT)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.RegionType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(MemRegionT)
	 * @generated
	 */
	boolean isSetType();

} // RegionType
