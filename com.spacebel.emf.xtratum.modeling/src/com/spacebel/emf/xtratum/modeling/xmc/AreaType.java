/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType#getFlags <em>Flags</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType#getMappedAt <em>Mapped At</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType#getName <em>Name</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType#getSize <em>Size</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getAreaType()
 * @model extendedMetaData="name='Area_._type' kind='empty'"
 * @generated
 */
public interface AreaType extends EObject {
	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #isSetFlags()
	 * @see #unsetFlags()
	 * @see #setFlags(List)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getAreaType_Flags()
	 * @model default="none" unsettable="true" dataType="com.spacebel.emf.xtratum.modeling.xmc.MemAreaFlagsListT" many="false"
	 *        extendedMetaData="kind='attribute' name='flags'"
	 * @generated
	 */
	List<MemAreaFlagsT> getFlags();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #isSetFlags()
	 * @see #unsetFlags()
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(List<MemAreaFlagsT> value);

	/**
	 * Unsets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlags()
	 * @see #getFlags()
	 * @see #setFlags(List)
	 * @generated
	 */
	void unsetFlags();

	/**
	 * Returns whether the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType#getFlags <em>Flags</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flags</em>' attribute is set.
	 * @see #unsetFlags()
	 * @see #getFlags()
	 * @see #setFlags(List)
	 * @generated
	 */
	boolean isSetFlags();

	/**
	 * Returns the value of the '<em><b>Mapped At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped At</em>' attribute.
	 * @see #setMappedAt(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getAreaType_MappedAt()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.HexT"
	 *        extendedMetaData="kind='attribute' name='mappedAt'"
	 * @generated
	 */
	String getMappedAt();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType#getMappedAt <em>Mapped At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped At</em>' attribute.
	 * @see #getMappedAt()
	 * @generated
	 */
	void setMappedAt(String value);

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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getAreaType_Name()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdStringT"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getAreaType_Size()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.SizeUnitT" required="true"
	 *        extendedMetaData="kind='attribute' name='size'"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType#getSize <em>Size</em>}' attribute.
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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getAreaType_Start()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.HexT" required="true"
	 *        extendedMetaData="kind='attribute' name='start'"
	 * @generated
	 */
	String getStart();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.AreaType#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(String value);

} // AreaType
