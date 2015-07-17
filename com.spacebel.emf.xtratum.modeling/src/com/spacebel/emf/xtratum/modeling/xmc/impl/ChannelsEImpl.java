/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.impl;

import com.spacebel.emf.xtratum.modeling.xmc.ChannelsE;
import com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType;
import com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType;
import com.spacebel.emf.xtratum.modeling.xmc.XmcPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channels E</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.ChannelsEImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.ChannelsEImpl#getSamplingChannel <em>Sampling Channel</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.ChannelsEImpl#getQueuingChannel <em>Queuing Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChannelsEImpl extends MinimalEObjectImpl.Container implements ChannelsE {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelsEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmcPackage.Literals.CHANNELS_E;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XmcPackage.CHANNELS_E__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SamplingChannelType> getSamplingChannel() {
		return getGroup().list(XmcPackage.Literals.CHANNELS_E__SAMPLING_CHANNEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueuingChannelType> getQueuingChannel() {
		return getGroup().list(XmcPackage.Literals.CHANNELS_E__QUEUING_CHANNEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmcPackage.CHANNELS_E__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XmcPackage.CHANNELS_E__SAMPLING_CHANNEL:
				return ((InternalEList<?>)getSamplingChannel()).basicRemove(otherEnd, msgs);
			case XmcPackage.CHANNELS_E__QUEUING_CHANNEL:
				return ((InternalEList<?>)getQueuingChannel()).basicRemove(otherEnd, msgs);
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
			case XmcPackage.CHANNELS_E__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XmcPackage.CHANNELS_E__SAMPLING_CHANNEL:
				return getSamplingChannel();
			case XmcPackage.CHANNELS_E__QUEUING_CHANNEL:
				return getQueuingChannel();
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
			case XmcPackage.CHANNELS_E__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XmcPackage.CHANNELS_E__SAMPLING_CHANNEL:
				getSamplingChannel().clear();
				getSamplingChannel().addAll((Collection<? extends SamplingChannelType>)newValue);
				return;
			case XmcPackage.CHANNELS_E__QUEUING_CHANNEL:
				getQueuingChannel().clear();
				getQueuingChannel().addAll((Collection<? extends QueuingChannelType>)newValue);
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
			case XmcPackage.CHANNELS_E__GROUP:
				getGroup().clear();
				return;
			case XmcPackage.CHANNELS_E__SAMPLING_CHANNEL:
				getSamplingChannel().clear();
				return;
			case XmcPackage.CHANNELS_E__QUEUING_CHANNEL:
				getQueuingChannel().clear();
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
			case XmcPackage.CHANNELS_E__GROUP:
				return group != null && !group.isEmpty();
			case XmcPackage.CHANNELS_E__SAMPLING_CHANNEL:
				return !getSamplingChannel().isEmpty();
			case XmcPackage.CHANNELS_E__QUEUING_CHANNEL:
				return !getQueuingChannel().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ChannelsEImpl
