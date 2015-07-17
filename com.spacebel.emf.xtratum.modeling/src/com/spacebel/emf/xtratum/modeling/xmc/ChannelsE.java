/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channels E</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.ChannelsE#getGroup <em>Group</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.ChannelsE#getSamplingChannel <em>Sampling Channel</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.ChannelsE#getQueuingChannel <em>Queuing Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getChannelsE()
 * @model extendedMetaData="name='channels_e' kind='elementOnly'"
 * @generated
 */
public interface ChannelsE extends EObject {
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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getChannelsE_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Sampling Channel</b></em>' containment reference list.
	 * The list contents are of type {@link com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampling Channel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Channel</em>' containment reference list.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getChannelsE_SamplingChannel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SamplingChannel' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SamplingChannelType> getSamplingChannel();

	/**
	 * Returns the value of the '<em><b>Queuing Channel</b></em>' containment reference list.
	 * The list contents are of type {@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queuing Channel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queuing Channel</em>' containment reference list.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getChannelsE_QueuingChannel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='QueuingChannel' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<QueuingChannelType> getQueuingChannel();

} // ChannelsE
