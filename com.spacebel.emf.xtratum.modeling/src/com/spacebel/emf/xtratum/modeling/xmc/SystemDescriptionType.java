/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getHwDescription <em>Hw Description</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getXMHypervisor <em>XM Hypervisor</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getResidentSw <em>Resident Sw</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getPartitionTable <em>Partition Table</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getChannels <em>Channels</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getName <em>Name</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSystemDescriptionType()
 * @model extendedMetaData="name='SystemDescription_._type' kind='elementOnly'"
 * @generated
 */
public interface SystemDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Hw Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hw Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hw Description</em>' containment reference.
	 * @see #setHwDescription(HwDescriptionE)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSystemDescriptionType_HwDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='HwDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	HwDescriptionE getHwDescription();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getHwDescription <em>Hw Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hw Description</em>' containment reference.
	 * @see #getHwDescription()
	 * @generated
	 */
	void setHwDescription(HwDescriptionE value);

	/**
	 * Returns the value of the '<em><b>XM Hypervisor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XM Hypervisor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XM Hypervisor</em>' containment reference.
	 * @see #setXMHypervisor(HypervisorE)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSystemDescriptionType_XMHypervisor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XMHypervisor' namespace='##targetNamespace'"
	 * @generated
	 */
	HypervisorE getXMHypervisor();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getXMHypervisor <em>XM Hypervisor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XM Hypervisor</em>' containment reference.
	 * @see #getXMHypervisor()
	 * @generated
	 */
	void setXMHypervisor(HypervisorE value);

	/**
	 * Returns the value of the '<em><b>Resident Sw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resident Sw</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resident Sw</em>' containment reference.
	 * @see #setResidentSw(RswE)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSystemDescriptionType_ResidentSw()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ResidentSw' namespace='##targetNamespace'"
	 * @generated
	 */
	RswE getResidentSw();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getResidentSw <em>Resident Sw</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resident Sw</em>' containment reference.
	 * @see #getResidentSw()
	 * @generated
	 */
	void setResidentSw(RswE value);

	/**
	 * Returns the value of the '<em><b>Partition Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Table</em>' containment reference.
	 * @see #setPartitionTable(PartitionTableType)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSystemDescriptionType_PartitionTable()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PartitionTable' namespace='##targetNamespace'"
	 * @generated
	 */
	PartitionTableType getPartitionTable();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getPartitionTable <em>Partition Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Table</em>' containment reference.
	 * @see #getPartitionTable()
	 * @generated
	 */
	void setPartitionTable(PartitionTableType value);

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference.
	 * @see #setChannels(ChannelsE)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSystemDescriptionType_Channels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Channels' namespace='##targetNamespace'"
	 * @generated
	 */
	ChannelsE getChannels();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getChannels <em>Channels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channels</em>' containment reference.
	 * @see #getChannels()
	 * @generated
	 */
	void setChannels(ChannelsE value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSystemDescriptionType_Name()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdStringT" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getSystemDescriptionType_Version()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.VersionT" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.SystemDescriptionType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // SystemDescriptionType
