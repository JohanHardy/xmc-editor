/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.impl;

import com.spacebel.emf.xtratum.modeling.xmc.MemoryAreaE;
import com.spacebel.emf.xtratum.modeling.xmc.RswE;
import com.spacebel.emf.xtratum.modeling.xmc.XmcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rsw E</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.RswEImpl#getPhysicalMemoryAreas <em>Physical Memory Areas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RswEImpl extends MinimalEObjectImpl.Container implements RswE {
	/**
	 * The cached value of the '{@link #getPhysicalMemoryAreas() <em>Physical Memory Areas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalMemoryAreas()
	 * @generated
	 * @ordered
	 */
	protected MemoryAreaE physicalMemoryAreas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RswEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmcPackage.Literals.RSW_E;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryAreaE getPhysicalMemoryAreas() {
		return physicalMemoryAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalMemoryAreas(MemoryAreaE newPhysicalMemoryAreas, NotificationChain msgs) {
		MemoryAreaE oldPhysicalMemoryAreas = physicalMemoryAreas;
		physicalMemoryAreas = newPhysicalMemoryAreas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmcPackage.RSW_E__PHYSICAL_MEMORY_AREAS, oldPhysicalMemoryAreas, newPhysicalMemoryAreas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalMemoryAreas(MemoryAreaE newPhysicalMemoryAreas) {
		if (newPhysicalMemoryAreas != physicalMemoryAreas) {
			NotificationChain msgs = null;
			if (physicalMemoryAreas != null)
				msgs = ((InternalEObject)physicalMemoryAreas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmcPackage.RSW_E__PHYSICAL_MEMORY_AREAS, null, msgs);
			if (newPhysicalMemoryAreas != null)
				msgs = ((InternalEObject)newPhysicalMemoryAreas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmcPackage.RSW_E__PHYSICAL_MEMORY_AREAS, null, msgs);
			msgs = basicSetPhysicalMemoryAreas(newPhysicalMemoryAreas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.RSW_E__PHYSICAL_MEMORY_AREAS, newPhysicalMemoryAreas, newPhysicalMemoryAreas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmcPackage.RSW_E__PHYSICAL_MEMORY_AREAS:
				return basicSetPhysicalMemoryAreas(null, msgs);
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
			case XmcPackage.RSW_E__PHYSICAL_MEMORY_AREAS:
				return getPhysicalMemoryAreas();
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
			case XmcPackage.RSW_E__PHYSICAL_MEMORY_AREAS:
				setPhysicalMemoryAreas((MemoryAreaE)newValue);
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
			case XmcPackage.RSW_E__PHYSICAL_MEMORY_AREAS:
				setPhysicalMemoryAreas((MemoryAreaE)null);
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
			case XmcPackage.RSW_E__PHYSICAL_MEMORY_AREAS:
				return physicalMemoryAreas != null;
		}
		return super.eIsSet(featureID);
	}

} //RswEImpl
