/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.impl;

import com.spacebel.emf.xtratum.modeling.xmc.CyclicPlanE;
import com.spacebel.emf.xtratum.modeling.xmc.ProcessorE;
import com.spacebel.emf.xtratum.modeling.xmc.ProcessorFeaturesT;
import com.spacebel.emf.xtratum.modeling.xmc.XmcFactory;
import com.spacebel.emf.xtratum.modeling.xmc.XmcPackage;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor E</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.ProcessorEImpl#getCyclicPlanTable <em>Cyclic Plan Table</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.ProcessorEImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.ProcessorEImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.ProcessorEImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorEImpl extends MinimalEObjectImpl.Container implements ProcessorE {
	/**
	 * The cached value of the '{@link #getCyclicPlanTable() <em>Cyclic Plan Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCyclicPlanTable()
	 * @generated
	 * @ordered
	 */
	protected CyclicPlanE cyclicPlanTable;

	/**
	 * The default value of the '{@link #getFeatures() <em>Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("unchecked")
	protected static final List<ProcessorFeaturesT> FEATURES_EDEFAULT = (List<ProcessorFeaturesT>)XmcFactory.eINSTANCE.createFromString(XmcPackage.eINSTANCE.getProcessorFeaturesListT(), "none");

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected List<ProcessorFeaturesT> features = FEATURES_EDEFAULT;

	/**
	 * This is true if the Features attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean featuresESet;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected String frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmcPackage.Literals.PROCESSOR_E;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyclicPlanE getCyclicPlanTable() {
		return cyclicPlanTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCyclicPlanTable(CyclicPlanE newCyclicPlanTable, NotificationChain msgs) {
		CyclicPlanE oldCyclicPlanTable = cyclicPlanTable;
		cyclicPlanTable = newCyclicPlanTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.PROCESSOR_E__CYCLIC_PLAN_TABLE, oldCyclicPlanTable, newCyclicPlanTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCyclicPlanTable(CyclicPlanE newCyclicPlanTable) {
		if (newCyclicPlanTable != cyclicPlanTable) {
			NotificationChain msgs = null;
			if (cyclicPlanTable != null)
				msgs = ((InternalEObject)cyclicPlanTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.PROCESSOR_E__CYCLIC_PLAN_TABLE, null, msgs);
			if (newCyclicPlanTable != null)
				msgs = ((InternalEObject)newCyclicPlanTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.PROCESSOR_E__CYCLIC_PLAN_TABLE, null, msgs);
			msgs = basicSetCyclicPlanTable(newCyclicPlanTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.PROCESSOR_E__CYCLIC_PLAN_TABLE, newCyclicPlanTable, newCyclicPlanTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ProcessorFeaturesT> getFeatures() {
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatures(List<ProcessorFeaturesT> newFeatures) {
		List<ProcessorFeaturesT> oldFeatures = features;
		features = newFeatures;
		boolean oldFeaturesESet = featuresESet;
		featuresESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.PROCESSOR_E__FEATURES, oldFeatures, features, !oldFeaturesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFeatures() {
		List<ProcessorFeaturesT> oldFeatures = features;
		boolean oldFeaturesESet = featuresESet;
		features = FEATURES_EDEFAULT;
		featuresESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmcPackage.PROCESSOR_E__FEATURES, oldFeatures, FEATURES_EDEFAULT, oldFeaturesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return featuresESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(String newFrequency) {
		String oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.PROCESSOR_E__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(BigInteger newId) {
		BigInteger oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.PROCESSOR_E__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmcPackage.PROCESSOR_E__CYCLIC_PLAN_TABLE:
				return basicSetCyclicPlanTable(null, msgs);
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
			case XmcPackage.PROCESSOR_E__CYCLIC_PLAN_TABLE:
				return getCyclicPlanTable();
			case XmcPackage.PROCESSOR_E__FEATURES:
				return getFeatures();
			case XmcPackage.PROCESSOR_E__FREQUENCY:
				return getFrequency();
			case XmcPackage.PROCESSOR_E__ID:
				return getId();
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
			case XmcPackage.PROCESSOR_E__CYCLIC_PLAN_TABLE:
				setCyclicPlanTable((CyclicPlanE)newValue);
				return;
			case XmcPackage.PROCESSOR_E__FEATURES:
				setFeatures((List<ProcessorFeaturesT>)newValue);
				return;
			case XmcPackage.PROCESSOR_E__FREQUENCY:
				setFrequency((String)newValue);
				return;
			case XmcPackage.PROCESSOR_E__ID:
				setId((BigInteger)newValue);
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
			case XmcPackage.PROCESSOR_E__CYCLIC_PLAN_TABLE:
				setCyclicPlanTable((CyclicPlanE)null);
				return;
			case XmcPackage.PROCESSOR_E__FEATURES:
				unsetFeatures();
				return;
			case XmcPackage.PROCESSOR_E__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case XmcPackage.PROCESSOR_E__ID:
				setId(ID_EDEFAULT);
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
			case XmcPackage.PROCESSOR_E__CYCLIC_PLAN_TABLE:
				return cyclicPlanTable != null;
			case XmcPackage.PROCESSOR_E__FEATURES:
				return isSetFeatures();
			case XmcPackage.PROCESSOR_E__FREQUENCY:
				return FREQUENCY_EDEFAULT == null ? frequency != null : !FREQUENCY_EDEFAULT.equals(frequency);
			case XmcPackage.PROCESSOR_E__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (features: ");
		if (featuresESet) result.append(features); else result.append("<unset>");
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ProcessorEImpl
