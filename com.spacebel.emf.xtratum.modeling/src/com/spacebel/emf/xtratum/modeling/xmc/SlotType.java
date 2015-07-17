/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.SlotType#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.SlotType#getId <em>Id</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.SlotType#getPartitionId <em>Partition Id</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.SlotType#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSlotType()
 * @model extendedMetaData="name='Slot_._type' kind='empty'"
 * @generated
 */
public interface SlotType extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSlotType_Duration()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.TimeUnitT" required="true"
	 *        extendedMetaData="kind='attribute' name='duration'"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.SlotType#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSlotType_Id()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdT" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	BigInteger getId();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.SlotType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Partition Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Id</em>' attribute.
	 * @see #setPartitionId(BigInteger)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSlotType_PartitionId()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdT" required="true"
	 *        extendedMetaData="kind='attribute' name='partitionId'"
	 * @generated
	 */
	BigInteger getPartitionId();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.SlotType#getPartitionId <em>Partition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Id</em>' attribute.
	 * @see #getPartitionId()
	 * @generated
	 */
	void setPartitionId(BigInteger value);

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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSlotType_Start()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.TimeUnitT" required="true"
	 *        extendedMetaData="kind='attribute' name='start'"
	 * @generated
	 */
	String getStart();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.SlotType#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(String value);

} // SlotType
