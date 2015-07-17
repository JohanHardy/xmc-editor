/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io Ports E</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.IoPortsE#getGroup <em>Group</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.IoPortsE#getRange <em>Range</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.IoPortsE#getRestricted <em>Restricted</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getIoPortsE()
 * @model extendedMetaData="name='ioPorts_e' kind='elementOnly'"
 * @generated
 */
public interface IoPortsE extends EObject {
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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getIoPortsE_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference list.
	 * The list contents are of type {@link com.spacebel.emf.xtratum.modeling.xmc.RangeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference list.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getIoPortsE_Range()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Range' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RangeType> getRange();

	/**
	 * Returns the value of the '<em><b>Restricted</b></em>' containment reference list.
	 * The list contents are of type {@link com.spacebel.emf.xtratum.modeling.xmc.RestrictedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restricted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricted</em>' containment reference list.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getIoPortsE_Restricted()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Restricted' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RestrictedType> getRestricted();

} // IoPortsE
