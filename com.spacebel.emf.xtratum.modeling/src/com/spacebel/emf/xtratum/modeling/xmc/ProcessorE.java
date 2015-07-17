/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor E</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorE#getCyclicPlanTable <em>Cyclic Plan Table</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorE#getFeatures <em>Features</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorE#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorE#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getProcessorE()
 * @model extendedMetaData="name='processor_e' kind='elementOnly'"
 * @generated
 */
public interface ProcessorE extends EObject {
	/**
	 * Returns the value of the '<em><b>Cyclic Plan Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cyclic Plan Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cyclic Plan Table</em>' containment reference.
	 * @see #setCyclicPlanTable(CyclicPlanE)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getProcessorE_CyclicPlanTable()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CyclicPlanTable' namespace='##targetNamespace'"
	 * @generated
	 */
	CyclicPlanE getCyclicPlanTable();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorE#getCyclicPlanTable <em>Cyclic Plan Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cyclic Plan Table</em>' containment reference.
	 * @see #getCyclicPlanTable()
	 * @generated
	 */
	void setCyclicPlanTable(CyclicPlanE value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' attribute.
	 * @see #isSetFeatures()
	 * @see #unsetFeatures()
	 * @see #setFeatures(List)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getProcessorE_Features()
	 * @model default="none" unsettable="true" dataType="com.spacebel.emf.xtratum.modeling.xmc.ProcessorFeaturesListT" many="false"
	 *        extendedMetaData="kind='attribute' name='features'"
	 * @generated
	 */
	List<ProcessorFeaturesT> getFeatures();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorE#getFeatures <em>Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Features</em>' attribute.
	 * @see #isSetFeatures()
	 * @see #unsetFeatures()
	 * @see #getFeatures()
	 * @generated
	 */
	void setFeatures(List<ProcessorFeaturesT> value);

	/**
	 * Unsets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorE#getFeatures <em>Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFeatures()
	 * @see #getFeatures()
	 * @see #setFeatures(List)
	 * @generated
	 */
	void unsetFeatures();

	/**
	 * Returns whether the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorE#getFeatures <em>Features</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Features</em>' attribute is set.
	 * @see #unsetFeatures()
	 * @see #getFeatures()
	 * @see #setFeatures(List)
	 * @generated
	 */
	boolean isSetFeatures();

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getProcessorE_Frequency()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.FreqUnitT"
	 *        extendedMetaData="kind='attribute' name='frequency'"
	 * @generated
	 */
	String getFrequency();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorE#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(BigInteger)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getProcessorE_Id()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.IdT" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	BigInteger getId();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.ProcessorE#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(BigInteger value);

} // ProcessorE
