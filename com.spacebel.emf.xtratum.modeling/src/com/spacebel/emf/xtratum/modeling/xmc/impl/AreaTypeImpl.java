/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.impl;

import com.spacebel.emf.xtratum.modeling.xmc.AreaType;
import com.spacebel.emf.xtratum.modeling.xmc.MemAreaFlagsT;
import com.spacebel.emf.xtratum.modeling.xmc.XmcFactory;
import com.spacebel.emf.xtratum.modeling.xmc.XmcPackage;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Area Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.AreaTypeImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.AreaTypeImpl#getMappedAt <em>Mapped At</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.AreaTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.AreaTypeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link com.spacebel.emf.xtratum.modeling.xmc.impl.AreaTypeImpl#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AreaTypeImpl extends MinimalEObjectImpl.Container implements AreaType {
	/**
	 * The default value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("unchecked")
	protected static final List<MemAreaFlagsT> FLAGS_EDEFAULT = (List<MemAreaFlagsT>)XmcFactory.eINSTANCE.createFromString(XmcPackage.eINSTANCE.getMemAreaFlagsListT(), "none");

	/**
	 * The cached value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected List<MemAreaFlagsT> flags = FLAGS_EDEFAULT;

	/**
	 * This is true if the Flags attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flagsESet;

	/**
	 * The default value of the '{@link #getMappedAt() <em>Mapped At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedAt()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMappedAt() <em>Mapped At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedAt()
	 * @generated
	 * @ordered
	 */
	protected String mappedAt = MAPPED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final String START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected String start = START_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AreaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmcPackage.Literals.AREA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<MemAreaFlagsT> getFlags() {
		return flags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlags(List<MemAreaFlagsT> newFlags) {
		List<MemAreaFlagsT> oldFlags = flags;
		flags = newFlags;
		boolean oldFlagsESet = flagsESet;
		flagsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.AREA_TYPE__FLAGS, oldFlags, flags, !oldFlagsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlags() {
		List<MemAreaFlagsT> oldFlags = flags;
		boolean oldFlagsESet = flagsESet;
		flags = FLAGS_EDEFAULT;
		flagsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmcPackage.AREA_TYPE__FLAGS, oldFlags, FLAGS_EDEFAULT, oldFlagsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlags() {
		return flagsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMappedAt() {
		return mappedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedAt(String newMappedAt) {
		String oldMappedAt = mappedAt;
		mappedAt = newMappedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.AREA_TYPE__MAPPED_AT, oldMappedAt, mappedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.AREA_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.AREA_TYPE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(String newStart) {
		String oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmcPackage.AREA_TYPE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmcPackage.AREA_TYPE__FLAGS:
				return getFlags();
			case XmcPackage.AREA_TYPE__MAPPED_AT:
				return getMappedAt();
			case XmcPackage.AREA_TYPE__NAME:
				return getName();
			case XmcPackage.AREA_TYPE__SIZE:
				return getSize();
			case XmcPackage.AREA_TYPE__START:
				return getStart();
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
			case XmcPackage.AREA_TYPE__FLAGS:
				setFlags((List<MemAreaFlagsT>)newValue);
				return;
			case XmcPackage.AREA_TYPE__MAPPED_AT:
				setMappedAt((String)newValue);
				return;
			case XmcPackage.AREA_TYPE__NAME:
				setName((String)newValue);
				return;
			case XmcPackage.AREA_TYPE__SIZE:
				setSize((String)newValue);
				return;
			case XmcPackage.AREA_TYPE__START:
				setStart((String)newValue);
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
			case XmcPackage.AREA_TYPE__FLAGS:
				unsetFlags();
				return;
			case XmcPackage.AREA_TYPE__MAPPED_AT:
				setMappedAt(MAPPED_AT_EDEFAULT);
				return;
			case XmcPackage.AREA_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmcPackage.AREA_TYPE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case XmcPackage.AREA_TYPE__START:
				setStart(START_EDEFAULT);
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
			case XmcPackage.AREA_TYPE__FLAGS:
				return isSetFlags();
			case XmcPackage.AREA_TYPE__MAPPED_AT:
				return MAPPED_AT_EDEFAULT == null ? mappedAt != null : !MAPPED_AT_EDEFAULT.equals(mappedAt);
			case XmcPackage.AREA_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmcPackage.AREA_TYPE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case XmcPackage.AREA_TYPE__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
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
		result.append(" (flags: ");
		if (flagsESet) result.append(flags); else result.append("<unset>");
		result.append(", mappedAt: ");
		result.append(mappedAt);
		result.append(", name: ");
		result.append(name);
		result.append(", size: ");
		result.append(size);
		result.append(", start: ");
		result.append(start);
		result.append(')');
		return result.toString();
	}

} //AreaTypeImpl
