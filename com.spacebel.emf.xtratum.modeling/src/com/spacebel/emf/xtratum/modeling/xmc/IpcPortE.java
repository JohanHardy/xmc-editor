/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ipc Port E</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.IpcPortE#getPartitionId <em>Partition Id</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.IpcPortE#getPartitionName <em>Partition Name</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.IpcPortE#getPortName <em>Port Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getIpcPortE()
 * @model extendedMetaData="name='ipcPort_e' kind='empty'"
 * @generated
 */
public interface IpcPortE extends EObject {
	/**
	 * Returns the value of the '<em><b>Partition Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Id</em>' attribute.
	 * @see #setPartitionId(BigInteger)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getIpcPortE_PartitionId()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdT" required="true"
	 *        extendedMetaData="kind='attribute' name='partitionId'"
	 * @generated
	 */
	BigInteger getPartitionId();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.IpcPortE#getPartitionId <em>Partition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Id</em>' attribute.
	 * @see #getPartitionId()
	 * @generated
	 */
	void setPartitionId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Partition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Name</em>' attribute.
	 * @see #setPartitionName(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getIpcPortE_PartitionName()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdStringT"
	 *        extendedMetaData="kind='attribute' name='partitionName'"
	 * @generated
	 */
	String getPartitionName();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.IpcPortE#getPartitionName <em>Partition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Name</em>' attribute.
	 * @see #getPartitionName()
	 * @generated
	 */
	void setPartitionName(String value);

	/**
	 * Returns the value of the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Name</em>' attribute.
	 * @see #setPortName(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getIpcPortE_PortName()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdStringT" required="true"
	 *        extendedMetaData="kind='attribute' name='portName'"
	 * @generated
	 */
	String getPortName();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.IpcPortE#getPortName <em>Port Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Name</em>' attribute.
	 * @see #getPortName()
	 * @generated
	 */
	void setPortName(String value);

} // IpcPortE
