/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Queuing Channel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getSource <em>Source</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getDestination <em>Destination</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getMaxMessageLength <em>Max Message Length</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getMaxNoMessages <em>Max No Messages</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getMaxTimeExpiration <em>Max Time Expiration</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getQueuingChannelType()
 * @model extendedMetaData="name='QueuingChannel_._type' kind='elementOnly'"
 * @generated
 */
public interface QueuingChannelType extends EObject {
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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getQueuingChannelType_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Source' namespace='##targetNamespace'"
	 * @generated
	 */
	IpcPortE getSource();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(IpcPortE value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(IpcPortE)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getQueuingChannelType_Destination()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Destination' namespace='##targetNamespace'"
	 * @generated
	 */
	IpcPortE getDestination();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(IpcPortE value);

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
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getQueuingChannelType_MaxMessageLength()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.SizeUnitT" required="true"
	 *        extendedMetaData="kind='attribute' name='maxMessageLength'"
	 * @generated
	 */
	String getMaxMessageLength();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getMaxMessageLength <em>Max Message Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Message Length</em>' attribute.
	 * @see #getMaxMessageLength()
	 * @generated
	 */
	void setMaxMessageLength(String value);

	/**
	 * Returns the value of the '<em><b>Max No Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max No Messages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max No Messages</em>' attribute.
	 * @see #setMaxNoMessages(BigInteger)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getQueuingChannelType_MaxNoMessages()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='maxNoMessages'"
	 * @generated
	 */
	BigInteger getMaxNoMessages();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getMaxNoMessages <em>Max No Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max No Messages</em>' attribute.
	 * @see #getMaxNoMessages()
	 * @generated
	 */
	void setMaxNoMessages(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Max Time Expiration</b></em>' attribute.
	 * The default value is <code>"0s"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Time Expiration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time Expiration</em>' attribute.
	 * @see #isSetMaxTimeExpiration()
	 * @see #unsetMaxTimeExpiration()
	 * @see #setMaxTimeExpiration(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getQueuingChannelType_MaxTimeExpiration()
	 * @model default="0s" unsettable="true" dataType="com.spacebel.emf.xtratum.modeling.xmc.TimeUnitT"
	 *        extendedMetaData="kind='attribute' name='maxTimeExpiration'"
	 * @generated
	 */
	String getMaxTimeExpiration();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getMaxTimeExpiration <em>Max Time Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time Expiration</em>' attribute.
	 * @see #isSetMaxTimeExpiration()
	 * @see #unsetMaxTimeExpiration()
	 * @see #getMaxTimeExpiration()
	 * @generated
	 */
	void setMaxTimeExpiration(String value);

	/**
	 * Unsets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getMaxTimeExpiration <em>Max Time Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxTimeExpiration()
	 * @see #getMaxTimeExpiration()
	 * @see #setMaxTimeExpiration(String)
	 * @generated
	 */
	void unsetMaxTimeExpiration();

	/**
	 * Returns whether the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType#getMaxTimeExpiration <em>Max Time Expiration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Time Expiration</em>' attribute is set.
	 * @see #unsetMaxTimeExpiration()
	 * @see #getMaxTimeExpiration()
	 * @see #setMaxTimeExpiration(String)
	 * @generated
	 */
	boolean isSetMaxTimeExpiration();

} // QueuingChannelType
