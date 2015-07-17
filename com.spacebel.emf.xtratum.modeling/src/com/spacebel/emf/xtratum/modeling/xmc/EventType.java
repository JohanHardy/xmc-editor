/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.EventType#getAction <em>Action</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.EventType#getLog <em>Log</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.EventType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getEventType()
 * @model extendedMetaData="name='Event_._type' kind='empty'"
 * @generated
 */
public interface EventType extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link com.spacebel.emf.xtratum.modeling.xmc.HmActionT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HmActionT
	 * @see #isSetAction()
	 * @see #unsetAction()
	 * @see #setAction(HmActionT)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getEventType_Action()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='action'"
	 * @generated
	 */
	HmActionT getAction();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.EventType#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HmActionT
	 * @see #isSetAction()
	 * @see #unsetAction()
	 * @see #getAction()
	 * @generated
	 */
	void setAction(HmActionT value);

	/**
	 * Unsets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.EventType#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAction()
	 * @see #getAction()
	 * @see #setAction(HmActionT)
	 * @generated
	 */
	void unsetAction();

	/**
	 * Returns whether the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.EventType#getAction <em>Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action</em>' attribute is set.
	 * @see #unsetAction()
	 * @see #getAction()
	 * @see #setAction(HmActionT)
	 * @generated
	 */
	boolean isSetAction();

	/**
	 * Returns the value of the '<em><b>Log</b></em>' attribute.
	 * The literals are from the enumeration {@link com.spacebel.emf.xtratum.modeling.xmc.YntfT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' attribute.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.YntfT
	 * @see #isSetLog()
	 * @see #unsetLog()
	 * @see #setLog(YntfT)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getEventType_Log()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='log'"
	 * @generated
	 */
	YntfT getLog();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.EventType#getLog <em>Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log</em>' attribute.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.YntfT
	 * @see #isSetLog()
	 * @see #unsetLog()
	 * @see #getLog()
	 * @generated
	 */
	void setLog(YntfT value);

	/**
	 * Unsets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.EventType#getLog <em>Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLog()
	 * @see #getLog()
	 * @see #setLog(YntfT)
	 * @generated
	 */
	void unsetLog();

	/**
	 * Returns whether the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.EventType#getLog <em>Log</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Log</em>' attribute is set.
	 * @see #unsetLog()
	 * @see #getLog()
	 * @see #setLog(YntfT)
	 * @generated
	 */
	boolean isSetLog();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link com.spacebel.emf.xtratum.modeling.xmc.HmStringT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HmStringT
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(HmStringT)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getEventType_Name()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	HmStringT getName();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.EventType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.HmStringT
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(HmStringT value);

	/**
	 * Unsets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.EventType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(HmStringT)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.EventType#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(HmStringT)
	 * @generated
	 */
	boolean isSetName();

} // EventType
