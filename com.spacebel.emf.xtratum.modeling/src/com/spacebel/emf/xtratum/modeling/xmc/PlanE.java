/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan E</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PlanE#getGroup <em>Group</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PlanE#getSlot <em>Slot</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PlanE#getId <em>Id</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PlanE#getMajorFrame <em>Major Frame</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PlanE#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPlanE()
 * @model extendedMetaData="name='plan_e' kind='elementOnly'"
 * @generated
 */
public interface PlanE extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPlanE_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link com.spacebel.emf.xtratum.modeling.xmc.SlotType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPlanE_Slot()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Slot' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SlotType> getSlot();

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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPlanE_Id()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdT" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	BigInteger getId();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PlanE#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Major Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Major Frame</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Major Frame</em>' attribute.
	 * @see #setMajorFrame(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPlanE_MajorFrame()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.TimeUnitT" required="true"
	 *        extendedMetaData="kind='attribute' name='majorFrame'"
	 * @generated
	 */
	String getMajorFrame();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PlanE#getMajorFrame <em>Major Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major Frame</em>' attribute.
	 * @see #getMajorFrame()
	 * @generated
	 */
	void setMajorFrame(String value);

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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPlanE_Name()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdStringT"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PlanE#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PlanE
