/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sampling Channel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getSource <em>Source</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getGroup <em>Group</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getDestination <em>Destination</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getMaxMessageLength <em>Max Message Length</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getRefreshPeriod <em>Refresh Period</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSamplingChannelType()
 * @model extendedMetaData="name='SamplingChannel_._type' kind='elementOnly'"
 * @generated
 */
public interface SamplingChannelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(IpcPortE)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSamplingChannelType_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Source' namespace='##targetNamespace'"
	 * @generated
	 */
	IpcPortE getSource();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(IpcPortE value);

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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSamplingChannelType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference list.
	 * The list contents are of type {@link com.spacebel.emf.xtratum.modeling.xmc.IpcPortE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference list.
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSamplingChannelType_Destination()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Destination' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<IpcPortE> getDestination();

	/**
	 * Returns the value of the '<em><b>Max Message Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Message Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Message Length</em>' attribute.
	 * @see #setMaxMessageLength(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSamplingChannelType_MaxMessageLength()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.SizeUnitT" required="true"
	 *        extendedMetaData="kind='attribute' name='maxMessageLength'"
	 * @generated
	 */
	String getMaxMessageLength();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getMaxMessageLength <em>Max Message Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Message Length</em>' attribute.
	 * @see #getMaxMessageLength()
	 * @generated
	 */
	void setMaxMessageLength(String value);

	/**
	 * Returns the value of the '<em><b>Refresh Period</b></em>' attribute.
	 * The default value is <code>"0s"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Period</em>' attribute.
	 * @see #isSetRefreshPeriod()
	 * @see #unsetRefreshPeriod()
	 * @see #setRefreshPeriod(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSamplingChannelType_RefreshPeriod()
	 * @model default="0s" unsettable="true" dataType="com.spacebel.emf.xtratum.modeling.xmc.TimeUnitT"
	 *        extendedMetaData="kind='attribute' name='refreshPeriod'"
	 * @generated
	 */
	String getRefreshPeriod();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getRefreshPeriod <em>Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Period</em>' attribute.
	 * @see #isSetRefreshPeriod()
	 * @see #unsetRefreshPeriod()
	 * @see #getRefreshPeriod()
	 * @generated
	 */
	void setRefreshPeriod(String value);

	/**
	 * Unsets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getRefreshPeriod <em>Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefreshPeriod()
	 * @see #getRefreshPeriod()
	 * @see #setRefreshPeriod(String)
	 * @generated
	 */
	void unsetRefreshPeriod();

	/**
	 * Returns whether the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType#getRefreshPeriod <em>Refresh Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refresh Period</em>' attribute is set.
	 * @see #unsetRefreshPeriod()
	 * @see #getRefreshPeriod()
	 * @see #setRefreshPeriod(String)
	 * @generated
	 */
	boolean isSetRefreshPeriod();

} // SamplingChannelType
