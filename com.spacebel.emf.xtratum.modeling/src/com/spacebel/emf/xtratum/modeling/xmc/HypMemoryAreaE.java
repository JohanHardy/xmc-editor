/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hyp Memory Area E</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.HypMemoryAreaE#getFlags <em>Flags</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.HypMemoryAreaE#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHypMemoryAreaE()
 * @model extendedMetaData="name='hypMemoryArea_e' kind='empty'"
 * @generated
 */
public interface HypMemoryAreaE extends EObject {
	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #setFlags(List)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHypMemoryAreaE_Flags()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.MemAreaFlagsListT" many="false"
	 *        extendedMetaData="kind='attribute' name='flags'"
	 * @generated
	 */
	List<MemAreaFlagsT> getFlags();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.HypMemoryAreaE#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(List<MemAreaFlagsT> value);

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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHypMemoryAreaE_Size()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.SizeUnitT" required="true"
	 *        extendedMetaData="kind='attribute' name='size'"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.HypMemoryAreaE#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

} // HypMemoryAreaE
