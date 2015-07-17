/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.impl;

import com.spacebel.emf.xtratum.modeling.xmc.IpcPortE;
import com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType;
import com.spacebel.emf.xtratum.modeling.xmc.XmcPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sampling Channel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.SamplingChannelTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.SamplingChannelTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.SamplingChannelTypeImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.SamplingChannelTypeImpl#getMaxMessageLength <em>Max Message Length</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.SamplingChannelTypeImpl#getRefreshPeriod <em>Refresh Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SamplingChannelTypeImpl extends MinimalEObjectImpl.Container implements SamplingChannelType {
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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * The default value of the '{@link #getRefreshPeriod() <em>Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String REFRESH_PERIOD_EDEFAULT = "0s";

	/**
	 * The cached value of the '{@link #getRefreshPeriod() <em>Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshPeriod()
	 * @generated
	 * @ordered
	 */
	protected String refreshPeriod = REFRESH_PERIOD_EDEFAULT;

	/**
	 * This is true if the Refresh Period attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refreshPeriodESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SamplingChannelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmcPackage.Literals.SAMPLING_CHANNEL_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.SAMPLING_CHANNEL_TYPE__SOURCE, oldSource, newSource);
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
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.SAMPLING_CHANNEL_TYPE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.SAMPLING_CHANNEL_TYPE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.SAMPLING_CHANNEL_TYPE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XmcPackage.SAMPLING_CHANNEL_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IpcPortE> getDestination() {
		return getGroup().list(XmcPackage.Literals.SAMPLING_CHANNEL_TYPE__DESTINATION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.SAMPLING_CHANNEL_TYPE__MAX_MESSAGE_LENGTH, oldMaxMessageLength, maxMessageLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefreshPeriod() {
		return refreshPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefreshPeriod(String newRefreshPeriod) {
		String oldRefreshPeriod = refreshPeriod;
		refreshPeriod = newRefreshPeriod;
		boolean oldRefreshPeriodESet = refreshPeriodESet;
		refreshPeriodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.SAMPLING_CHANNEL_TYPE__REFRESH_PERIOD, oldRefreshPeriod, refreshPeriod, !oldRefreshPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefreshPeriod() {
		String oldRefreshPeriod = refreshPeriod;
		boolean oldRefreshPeriodESet = refreshPeriodESet;
		refreshPeriod = REFRESH_PERIOD_EDEFAULT;
		refreshPeriodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmcPackage.SAMPLING_CHANNEL_TYPE__REFRESH_PERIOD, oldRefreshPeriod, REFRESH_PERIOD_EDEFAULT, oldRefreshPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefreshPeriod() {
		return refreshPeriodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmcPackage.SAMPLING_CHANNEL_TYPE__SOURCE:
				return basicSetSource(null, msgs);
			case XmcPackage.SAMPLING_CHANNEL_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XmcPackage.SAMPLING_CHANNEL_TYPE__DESTINATION:
				return ((InternalEList<?>)getDestination()).basicRemove(otherEnd, msgs);
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
			case XmcPackage.SAMPLING_CHANNEL_TYPE__SOURCE:
				return getSource();
			case XmcPackage.SAMPLING_CHANNEL_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XmcPackage.SAMPLING_CHANNEL_TYPE__DESTINATION:
				return getDestination();
			case XmcPackage.SAMPLING_CHANNEL_TYPE__MAX_MESSAGE_LENGTH:
				return getMaxMessageLength();
			case XmcPackage.SAMPLING_CHANNEL_TYPE__REFRESH_PERIOD:
				return getRefreshPeriod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmcPackage.SAMPLING_CHANNEL_TYPE__SOURCE:
				setSource((IpcPortE)newValue);
				return;
			case XmcPackage.SAMPLING_CHANNEL_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XmcPackage.SAMPLING_CHANNEL_TYPE__DESTINATION:
				getDestination().clear();
				getDestination().addAll((Collection<? extends IpcPortE>)newValue);
				return;
			case XmcPackage.SAMPLING_CHANNEL_TYPE__MAX_MESSAGE_LENGTH:
				setMaxMessageLength((String)newValue);
				return;
			case XmcPackage.SAMPLING_CHANNEL_TYPE__REFRESH_PERIOD:
				setRefreshPeriod((String)newValue);
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
			case XmcPackage.SAMPLING_CHANNEL_TYPE__SOURCE:
				setSource((IpcPortE)null);
				return;
			case XmcPackage.SAMPLING_CHANNEL_TYPE__GROUP:
				getGroup().clear();
				return;
			case XmcPackage.SAMPLING_CHANNEL_TYPE__DESTINATION:
				getDestination().clear();
				return;
			case XmcPackage.SAMPLING_CHANNEL_TYPE__MAX_MESSAGE_LENGTH:
				setMaxMessageLength(MAX_MESSAGE_LENGTH_EDEFAULT);
				return;
			case XmcPackage.SAMPLING_CHANNEL_TYPE__REFRESH_PERIOD:
				unsetRefreshPeriod();
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
			case XmcPackage.SAMPLING_CHANNEL_TYPE__SOURCE:
				return source != null;
			case XmcPackage.SAMPLING_CHANNEL_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XmcPackage.SAMPLING_CHANNEL_TYPE__DESTINATION:
				return !getDestination().isEmpty();
			case XmcPackage.SAMPLING_CHANNEL_TYPE__MAX_MESSAGE_LENGTH:
				return MAX_MESSAGE_LENGTH_EDEFAULT == null ? maxMessageLength != null : !MAX_MESSAGE_LENGTH_EDEFAULT.equals(maxMessageLength);
			case XmcPackage.SAMPLING_CHANNEL_TYPE__REFRESH_PERIOD:
				return isSetRefreshPeriod();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", maxMessageLength: ");
		result.append(maxMessageLength);
		result.append(", refreshPeriod: ");
		if (refreshPeriodESet) result.append(refreshPeriod); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SamplingChannelTypeImpl
