/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Requirements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.TemporalRequirementsType#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.TemporalRequirementsType#getPeriod <em>Period</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getTemporalRequirementsType()
 * @model extendedMetaData="name='TemporalRequirements_._type' kind='empty'"
 * @generated
 */
public interface TemporalRequirementsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getTemporalRequirementsType_Duration()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.TimeUnitT" required="true"
	 *        extendedMetaData="kind='attribute' name='duration'"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.TemporalRequirementsType#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(String)
	 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getTemporalRequirementsType_Period()
	 * @model dataType="com.spacebel.emf.xtratum.modeling.xmc.TimeUnitT" required="true"
	 *        extendedMetaData="kind='attribute' name='period'"
	 * @generated
	 */
	String getPeriod();

	/**
	 * Sets the value of the '{@link com.spacebel.emf.xtratum.modeling.xmc.TemporalRequirementsType#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(String value);

} // TemporalRequirementsType
