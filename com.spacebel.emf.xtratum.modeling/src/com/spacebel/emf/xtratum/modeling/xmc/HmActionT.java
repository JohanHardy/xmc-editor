/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hm Action T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHmActionT()
 * @model extendedMetaData="name='hmAction_t'"
 * @generated
 */
public enum HmActionT implements Enumerator {
	/**
	 * The '<em><b>XMHMACIGNORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMACIGNORE_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMACIGNORE(0, "XMHMACIGNORE", "XM_HM_AC_IGNORE"),

	/**
	 * The '<em><b>XMHMACSHUTDOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMACSHUTDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMACSHUTDOWN(1, "XMHMACSHUTDOWN", "XM_HM_AC_SHUTDOWN"),

	/**
	 * The '<em><b>XMHMACPARTITIONCOLDRESET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMACPARTITIONCOLDRESET_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMACPARTITIONCOLDRESET(2, "XMHMACPARTITIONCOLDRESET", "XM_HM_AC_PARTITION_COLD_RESET"),

	/**
	 * The '<em><b>XMHMACPARTITIONWARMRESET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMACPARTITIONWARMRESET_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMACPARTITIONWARMRESET(3, "XMHMACPARTITIONWARMRESET", "XM_HM_AC_PARTITION_WARM_RESET"),

	/**
	 * The '<em><b>XMHMACHYPERVISORCOLDRESET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMACHYPERVISORCOLDRESET_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMACHYPERVISORCOLDRESET(4, "XMHMACHYPERVISORCOLDRESET", "XM_HM_AC_HYPERVISOR_COLD_RESET"),

	/**
	 * The '<em><b>XMHMACHYPERVISORWARMRESET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMACHYPERVISORWARMRESET_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMACHYPERVISORWARMRESET(5, "XMHMACHYPERVISORWARMRESET", "XM_HM_AC_HYPERVISOR_WARM_RESET"),

	/**
	 * The '<em><b>XMHMACSUSPEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMACSUSPEND_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMACSUSPEND(6, "XMHMACSUSPEND", "XM_HM_AC_SUSPEND"),

	/**
	 * The '<em><b>XMHMACHALT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMACHALT_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMACHALT(7, "XMHMACHALT", "XM_HM_AC_HALT"),

	/**
	 * The '<em><b>XMHMACPROPAGATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMACPROPAGATE_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMACPROPAGATE(8, "XMHMACPROPAGATE", "XM_HM_AC_PROPAGATE"),

	/**
	 * The '<em><b>XMHMACSWITCHTOMAINTENANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMACSWITCHTOMAINTENANCE_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMACSWITCHTOMAINTENANCE(9, "XMHMACSWITCHTOMAINTENANCE", "XM_HM_AC_SWITCH_TO_MAINTENANCE");

	/**
	 * The '<em><b>XMHMACIGNORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMACIGNORE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMACIGNORE
	 * @model literal="XM_HM_AC_IGNORE"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMACIGNORE_VALUE = 0;

	/**
	 * The '<em><b>XMHMACSHUTDOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMACSHUTDOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMACSHUTDOWN
	 * @model literal="XM_HM_AC_SHUTDOWN"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMACSHUTDOWN_VALUE = 1;

	/**
	 * The '<em><b>XMHMACPARTITIONCOLDRESET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMACPARTITIONCOLDRESET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMACPARTITIONCOLDRESET
	 * @model literal="XM_HM_AC_PARTITION_COLD_RESET"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMACPARTITIONCOLDRESET_VALUE = 2;

	/**
	 * The '<em><b>XMHMACPARTITIONWARMRESET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMACPARTITIONWARMRESET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMACPARTITIONWARMRESET
	 * @model literal="XM_HM_AC_PARTITION_WARM_RESET"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMACPARTITIONWARMRESET_VALUE = 3;

	/**
	 * The '<em><b>XMHMACHYPERVISORCOLDRESET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMACHYPERVISORCOLDRESET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMACHYPERVISORCOLDRESET
	 * @model literal="XM_HM_AC_HYPERVISOR_COLD_RESET"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMACHYPERVISORCOLDRESET_VALUE = 4;

	/**
	 * The '<em><b>XMHMACHYPERVISORWARMRESET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMACHYPERVISORWARMRESET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMACHYPERVISORWARMRESET
	 * @model literal="XM_HM_AC_HYPERVISOR_WARM_RESET"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMACHYPERVISORWARMRESET_VALUE = 5;

	/**
	 * The '<em><b>XMHMACSUSPEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMACSUSPEND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMACSUSPEND
	 * @model literal="XM_HM_AC_SUSPEND"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMACSUSPEND_VALUE = 6;

	/**
	 * The '<em><b>XMHMACHALT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMACHALT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMACHALT
	 * @model literal="XM_HM_AC_HALT"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMACHALT_VALUE = 7;

	/**
	 * The '<em><b>XMHMACPROPAGATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMACPROPAGATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMACPROPAGATE
	 * @model literal="XM_HM_AC_PROPAGATE"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMACPROPAGATE_VALUE = 8;

	/**
	 * The '<em><b>XMHMACSWITCHTOMAINTENANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMACSWITCHTOMAINTENANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMACSWITCHTOMAINTENANCE
	 * @model literal="XM_HM_AC_SWITCH_TO_MAINTENANCE"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMACSWITCHTOMAINTENANCE_VALUE = 9;

	/**
	 * An array of all the '<em><b>Hm Action T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HmActionT[] VALUES_ARRAY =
		new HmActionT[] {
			XMHMACIGNORE,
			XMHMACSHUTDOWN,
			XMHMACPARTITIONCOLDRESET,
			XMHMACPARTITIONWARMRESET,
			XMHMACHYPERVISORCOLDRESET,
			XMHMACHYPERVISORWARMRESET,
			XMHMACSUSPEND,
			XMHMACHALT,
			XMHMACPROPAGATE,
			XMHMACSWITCHTOMAINTENANCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Hm Action T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HmActionT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hm Action T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HmActionT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HmActionT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hm Action T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HmActionT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HmActionT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hm Action T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HmActionT get(int value) {
		switch (value) {
			case XMHMACIGNORE_VALUE: return XMHMACIGNORE;
			case XMHMACSHUTDOWN_VALUE: return XMHMACSHUTDOWN;
			case XMHMACPARTITIONCOLDRESET_VALUE: return XMHMACPARTITIONCOLDRESET;
			case XMHMACPARTITIONWARMRESET_VALUE: return XMHMACPARTITIONWARMRESET;
			case XMHMACHYPERVISORCOLDRESET_VALUE: return XMHMACHYPERVISORCOLDRESET;
			case XMHMACHYPERVISORWARMRESET_VALUE: return XMHMACHYPERVISORWARMRESET;
			case XMHMACSUSPEND_VALUE: return XMHMACSUSPEND;
			case XMHMACHALT_VALUE: return XMHMACHALT;
			case XMHMACPROPAGATE_VALUE: return XMHMACPROPAGATE;
			case XMHMACSWITCHTOMAINTENANCE_VALUE: return XMHMACSWITCHTOMAINTENANCE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private HmActionT(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //HmActionT
