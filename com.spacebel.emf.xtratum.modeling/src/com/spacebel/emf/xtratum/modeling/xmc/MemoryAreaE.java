/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Area E</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.MemoryAreaE#getGroup <em>Group</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.MemoryAreaE#getArea <em>Area</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getMemoryAreaE()
 * @model extendedMetaData="name='memoryArea_e' kind='elementOnly'"
 * @generated
 */
public interface MemoryAreaE extends EObject {
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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getMemoryAreaE_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Area</b></em>' containment reference list.
	 * The list contents are of type {@link com.spacebel.emf.xtratum.modeling.xmc.AreaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' containment reference list.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getMemoryAreaE_Area()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Area' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AreaType> getArea();

} // MemoryAreaE
