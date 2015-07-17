/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor Table Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorTableType#getGroup <em>Group</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorTableType#getProcessor <em>Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getProcessorTableType()
 * @model extendedMetaData="name='ProcessorTable_._type' kind='elementOnly'"
 * @generated
 */
public interface ProcessorTableType extends EObject {
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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getProcessorTableType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' containment reference list.
	 * The list contents are of type {@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' containment reference list.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getProcessorTableType_Processor()
	 * @model containment="true" required="true" upper="256" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Processor' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ProcessorE> getProcessor();

} // ProcessorTableType
