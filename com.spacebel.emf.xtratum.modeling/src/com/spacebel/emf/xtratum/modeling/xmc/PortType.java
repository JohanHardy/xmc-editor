/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PortType#getDirection <em>Direction</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PortType#getDiscipline <em>Discipline</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PortType#getName <em>Name</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.PortType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPortType()
 * @model extendedMetaData="name='Port_._type' kind='empty'"
 * @generated
 */
public interface PortType extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link com.spacebel.emf.xtratum.modeling.xmc.DirectionT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DirectionT
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(DirectionT)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPortType_Direction()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='direction'"
	 * @generated
	 */
	DirectionT getDirection();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PortType#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DirectionT
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionT value);

	/**
	 * Unsets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PortType#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(DirectionT)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PortType#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(DirectionT)
	 * @generated
	 */
	boolean isSetDirection();

	/**
	 * Returns the value of the '<em><b>Discipline</b></em>' attribute.
	 * The literals are from the enumeration {@link com.spacebel.emf.xtratum.modeling.xmc.DisciplineT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discipline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discipline</em>' attribute.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DisciplineT
	 * @see #isSetDiscipline()
	 * @see #unsetDiscipline()
	 * @see #setDiscipline(DisciplineT)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPortType_Discipline()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='discipline'"
	 * @generated
	 */
	DisciplineT getDiscipline();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PortType#getDiscipline <em>Discipline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discipline</em>' attribute.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.DisciplineT
	 * @see #isSetDiscipline()
	 * @see #unsetDiscipline()
	 * @see #getDiscipline()
	 * @generated
	 */
	void setDiscipline(DisciplineT value);

	/**
	 * Unsets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PortType#getDiscipline <em>Discipline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiscipline()
	 * @see #getDiscipline()
	 * @see #setDiscipline(DisciplineT)
	 * @generated
	 */
	void unsetDiscipline();

	/**
	 * Returns whether the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PortType#getDiscipline <em>Discipline</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Discipline</em>' attribute is set.
	 * @see #unsetDiscipline()
	 * @see #getDiscipline()
	 * @see #setDiscipline(DisciplineT)
	 * @generated
	 */
	boolean isSetDiscipline();

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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPortType_Name()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdStringT" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PortType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.spacebel.emf.xtratum.modeling.xmc.PortTypeT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PortTypeT
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(PortTypeT)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getPortType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	PortTypeT getType();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PortType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.PortTypeT
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(PortTypeT value);

	/**
	 * Unsets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PortType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(PortTypeT)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.PortType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(PortTypeT)
	 * @generated
	 */
	boolean isSetType();

} // PortType
