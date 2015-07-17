/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.impl;

import com.spacebel.emf.xtratum.modeling.xmc.IpcPortE;
import com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType;
import com.spacebel.emf.xtratum.modeling.xmc.XmcPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Queuing Channel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.QueuingChannelTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.QueuingChannelTypeImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.QueuingChannelTypeImpl#getMaxMessageLength <em>Max Message Length</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.QueuingChannelTypeImpl#getMaxNoMessages <em>Max No Messages</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.QueuingChannelTypeImpl#getMaxTimeExpiration <em>Max Time Expiration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueuingChannelTypeImpl extends MinimalEObjectImpl.Container implements QueuingChannelType {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected IpcPortE source;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected IpcPortE destination;

	/**
	 * The default value of the '{@link #getMaxMessageLength() <em>Max Message Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMessageLength()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_MESSAGE_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxMessageLength() <em>Max Message Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMessageLength()
	 * @generated
	 * @ordered
	 */
	protected String maxMessageLength = MAX_MESSAGE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNoMessages() <em>Max No Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNoMessages()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_NO_MESSAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNoMessages() <em>Max No Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNoMessages()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxNoMessages = MAX_NO_MESSAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTimeExpiration() <em>Max Time Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTimeExpiration()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_TIME_EXPIRATION_EDEFAULT = "0s";

	/**
	 * The cached value of the '{@link #getMaxTimeExpiration() <em>Max Time Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTimeExpiration()
	 * @generated
	 * @ordered
	 */
	protected String maxTimeExpiration = MAX_TIME_EXPIRATION_EDEFAULT;

	/**
	 * This is true if the Max Time Expiration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxTimeExpirationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueuingChannelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmcPackage.Literals.QUEUING_CHANNEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpcPortE getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(IpcPortE newSource, NotificationChain msgs) {
		IpcPortE oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.QUEUING_CHANNEL_TYPE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(IpcPortE newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.QUEUING_CHANNEL_TYPE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.QUEUING_CHANNEL_TYPE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.QUEUING_CHANNEL_TYPE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpcPortE getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(IpcPortE newDestination, NotificationChain msgs) {
		IpcPortE oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.QUEUING_CHANNEL_TYPE__DESTINATION, oldDestination, newDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(IpcPortE newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.QUEUING_CHANNEL_TYPE__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.QUEUING_CHANNEL_TYPE__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.QUEUING_CHANNEL_TYPE__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxMessageLength() {
		return maxMessageLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxMessageLength(String newMaxMessageLength) {
		String oldMaxMessageLength = maxMessageLength;
		maxMessageLength = newMaxMessageLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.QUEUING_CHANNEL_TYPE__MAX_MESSAGE_LENGTH, oldMaxMessageLength, maxMessageLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxNoMessages() {
		return maxNoMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNoMessages(BigInteger newMaxNoMessages) {
		BigInteger oldMaxNoMessages = maxNoMessages;
		maxNoMessages = newMaxNoMessages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.QUEUING_CHANNEL_TYPE__MAX_NO_MESSAGES, oldMaxNoMessages, maxNoMessages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxTimeExpiration() {
		return maxTimeExpiration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTimeExpiration(String newMaxTimeExpiration) {
		String oldMaxTimeExpiration = maxTimeExpiration;
		maxTimeExpiration = newMaxTimeExpiration;
		boolean oldMaxTimeExpirationESet = maxTimeExpirationESet;
		maxTimeExpirationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.QUEUING_CHANNEL_TYPE__MAX_TIME_EXPIRATION, oldMaxTimeExpiration, maxTimeExpiration, !oldMaxTimeExpirationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxTimeExpiration() {
		String oldMaxTimeExpiration = maxTimeExpiration;
		boolean oldMaxTimeExpirationESet = maxTimeExpirationESet;
		maxTimeExpiration = MAX_TIME_EXPIRATION_EDEFAULT;
		maxTimeExpirationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmcPackage.QUEUING_CHANNEL_TYPE__MAX_TIME_EXPIRATION, oldMaxTimeExpiration, MAX_TIME_EXPIRATION_EDEFAULT, oldMaxTimeExpirationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxTimeExpiration() {
		return maxTimeExpirationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmcPackage.QUEUING_CHANNEL_TYPE__SOURCE:
				return basicSetSource(null, msgs);
			case XmcPackage.QUEUING_CHANNEL_TYPE__DESTINATION:
				return basicSetDestination(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmcPackage.QUEUING_CHANNEL_TYPE__SOURCE:
				return getSource();
			case XmcPackage.QUEUING_CHANNEL_TYPE__DESTINATION:
				return getDestination();
			case XmcPackage.QUEUING_CHANNEL_TYPE__MAX_MESSAGE_LENGTH:
				return getMaxMessageLength();
			case XmcPackage.QUEUING_CHANNEL_TYPE__MAX_NO_MESSAGES:
				return getMaxNoMessages();
			case XmcPackage.QUEUING_CHANNEL_TYPE__MAX_TIME_EXPIRATION:
				return getMaxTimeExpiration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmcPackage.QUEUING_CHANNEL_TYPE__SOURCE:
				setSource((IpcPortE)newValue);
				return;
			case XmcPackage.QUEUING_CHANNEL_TYPE__DESTINATION:
				setDestination((IpcPortE)newValue);
				return;
			case XmcPackage.QUEUING_CHANNEL_TYPE__MAX_MESSAGE_LENGTH:
				setMaxMessageLength((String)newValue);
				return;
			case XmcPackage.QUEUING_CHANNEL_TYPE__MAX_NO_MESSAGES:
				setMaxNoMessages((BigInteger)newValue);
				return;
			case XmcPackage.QUEUING_CHANNEL_TYPE__MAX_TIME_EXPIRATION:
				setMaxTimeExpiration((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XmcPackage.QUEUING_CHANNEL_TYPE__SOURCE:
				setSource((IpcPortE)null);
				return;
			case XmcPackage.QUEUING_CHANNEL_TYPE__DESTINATION:
				setDestination((IpcPortE)null);
				return;
			case XmcPackage.QUEUING_CHANNEL_TYPE__MAX_MESSAGE_LENGTH:
				setMaxMessageLength(MAX_MESSAGE_LENGTH_EDEFAULT);
				return;
			case XmcPackage.QUEUING_CHANNEL_TYPE__MAX_NO_MESSAGES:
				setMaxNoMessages(MAX_NO_MESSAGES_EDEFAULT);
				return;
			case XmcPackage.QUEUING_CHANNEL_TYPE__MAX_TIME_EXPIRATION:
				unsetMaxTimeExpiration();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XmcPackage.QUEUING_CHANNEL_TYPE__SOURCE:
				return source != null;
			case XmcPackage.QUEUING_CHANNEL_TYPE__DESTINATION:
				return destination != null;
			case XmcPackage.QUEUING_CHANNEL_TYPE__MAX_MESSAGE_LENGTH:
				return MAX_MESSAGE_LENGTH_EDEFAULT == null ? maxMessageLength != null : !MAX_MESSAGE_LENGTH_EDEFAULT.equals(maxMessageLength);
			case XmcPackage.QUEUING_CHANNEL_TYPE__MAX_NO_MESSAGES:
				return MAX_NO_MESSAGES_EDEFAULT == null ? maxNoMessages != null : !MAX_NO_MESSAGES_EDEFAULT.equals(maxNoMessages);
			case XmcPackage.QUEUING_CHANNEL_TYPE__MAX_TIME_EXPIRATION:
				return isSetMaxTimeExpiration();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maxMessageLength: ");
		result.append(maxMessageLength);
		result.append(", maxNoMessages: ");
		result.append(maxNoMessages);
		result.append(", maxTimeExpiration: ");
		if (maxTimeExpirationESet) result.append(maxTimeExpiration); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //QueuingChannelTypeImpl
