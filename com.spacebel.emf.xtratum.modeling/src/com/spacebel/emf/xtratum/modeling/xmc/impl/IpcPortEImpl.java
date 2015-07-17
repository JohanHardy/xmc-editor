/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.impl;

import com.spacebel.emf.xtratum.modeling.xmc.IpcPortE;
import com.spacebel.emf.xtratum.modeling.xmc.XmcPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ipc Port E</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.IpcPortEImpl#getPartitionId <em>Partition Id</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.IpcPortEImpl#getPartitionName <em>Partition Name</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.IpcPortEImpl#getPortName <em>Port Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IpcPortEImpl extends MinimalEObjectImpl.Container implements IpcPortE {
	/**
	 * The default value of the '{@link #getPartitionId() <em>Partition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PARTITION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartitionId() <em>Partition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger partitionId = PARTITION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartitionName() <em>Partition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTITION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartitionName() <em>Partition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionName()
	 * @generated
	 * @ordered
	 */
	protected String partitionName = PARTITION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortName() <em>Port Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortName()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortName() <em>Port Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortName()
	 * @generated
	 * @ordered
	 */
	protected String portName = PORT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IpcPortEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmcPackage.Literals.IPC_PORT_E;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPartitionId() {
		return partitionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionId(BigInteger newPartitionId) {
		BigInteger oldPartitionId = partitionId;
		partitionId = newPartitionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.IPC_PORT_E__PARTITION_ID, oldPartitionId, partitionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartitionName() {
		return partitionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionName(String newPartitionName) {
		String oldPartitionName = partitionName;
		partitionName = newPartitionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.IPC_PORT_E__PARTITION_NAME, oldPartitionName, partitionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortName() {
		return portName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortName(String newPortName) {
		String oldPortName = portName;
		portName = newPortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.IPC_PORT_E__PORT_NAME, oldPortName, portName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmcPackage.IPC_PORT_E__PARTITION_ID:
				return getPartitionId();
			case XmcPackage.IPC_PORT_E__PARTITION_NAME:
				return getPartitionName();
			case XmcPackage.IPC_PORT_E__PORT_NAME:
				return getPortName();
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
			case XmcPackage.IPC_PORT_E__PARTITION_ID:
				setPartitionId((BigInteger)newValue);
				return;
			case XmcPackage.IPC_PORT_E__PARTITION_NAME:
				setPartitionName((String)newValue);
				return;
			case XmcPackage.IPC_PORT_E__PORT_NAME:
				setPortName((String)newValue);
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
			case XmcPackage.IPC_PORT_E__PARTITION_ID:
				setPartitionId(PARTITION_ID_EDEFAULT);
				return;
			case XmcPackage.IPC_PORT_E__PARTITION_NAME:
				setPartitionName(PARTITION_NAME_EDEFAULT);
				return;
			case XmcPackage.IPC_PORT_E__PORT_NAME:
				setPortName(PORT_NAME_EDEFAULT);
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
			case XmcPackage.IPC_PORT_E__PARTITION_ID:
				return PARTITION_ID_EDEFAULT == null ? partitionId != null : !PARTITION_ID_EDEFAULT.equals(partitionId);
			case XmcPackage.IPC_PORT_E__PARTITION_NAME:
				return PARTITION_NAME_EDEFAULT == null ? partitionName != null : !PARTITION_NAME_EDEFAULT.equals(partitionName);
			case XmcPackage.IPC_PORT_E__PORT_NAME:
				return PORT_NAME_EDEFAULT == null ? portName != null : !PORT_NAME_EDEFAULT.equals(portName);
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
		result.append(" (partitionId: ");
		result.append(partitionId);
		result.append(", partitionName: ");
		result.append(partitionName);
		result.append(", portName: ");
		result.append(portName);
		result.append(')');
		return result.toString();
	}

} //IpcPortEImpl
