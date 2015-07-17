/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mem Area Flags T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getMemAreaFlagsT()
 * @model extendedMetaData="name='memAreaFlags_t'"
 * @generated
 */
public enum MemAreaFlagsT implements Enumerator {
	/**
	 * The '<em><b>Unmapped</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNMAPPED_VALUE
	 * @generated
	 * @ordered
	 */
	UNMAPPED(0, "unmapped", "unmapped"),

	/**
	 * The '<em><b>Shared</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARED_VALUE
	 * @generated
	 * @ordered
	 */
	SHARED(1, "shared", "shared"),

	/**
	 * The '<em><b>Read Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	READ_ONLY(2, "readOnly", "read-only"),

	/**
	 * The '<em><b>Uncacheable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCACHEABLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNCACHEABLE(3, "uncacheable", "uncacheable"),

	/**
	 * The '<em><b>Rom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROM_VALUE
	 * @generated
	 * @ordered
	 */
	ROM(4, "rom", "rom"),

	/**
	 * The '<em><b>Shlib</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHLIB_VALUE
	 * @generated
	 * @ordered
	 */
	SHLIB(5, "shlib", "shlib"),

	/**
	 * The '<em><b>Flag0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAG0_VALUE
	 * @generated
	 * @ordered
	 */
	FLAG0(6, "flag0", "flag0"),

	/**
	 * The '<em><b>Flag1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAG1_VALUE
	 * @generated
	 * @ordered
	 */
	FLAG1(7, "flag1", "flag1"),

	/**
	 * The '<em><b>Flag2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAG2_VALUE
	 * @generated
	 * @ordered
	 */
	FLAG2(8, "flag2", "flag2"),

	/**
	 * The '<em><b>Flag3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAG3_VALUE
	 * @generated
	 * @ordered
	 */
	FLAG3(9, "flag3", "flag3"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(10, "none", "none");

	/**
	 * The '<em><b>Unmapped</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unmapped</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNMAPPED
	 * @model name="unmapped"
	 * @generated
	 * @ordered
	 */
	public static final int UNMAPPED_VALUE = 0;

	/**
	 * The '<em><b>Shared</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shared</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHARED
	 * @model name="shared"
	 * @generated
	 * @ordered
	 */
	public static final int SHARED_VALUE = 1;

	/**
	 * The '<em><b>Read Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY
	 * @model name="readOnly" literal="read-only"
	 * @generated
	 * @ordered
	 */
	public static final int READ_ONLY_VALUE = 2;

	/**
	 * The '<em><b>Uncacheable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uncacheable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNCACHEABLE
	 * @model name="uncacheable"
	 * @generated
	 * @ordered
	 */
	public static final int UNCACHEABLE_VALUE = 3;

	/**
	 * The '<em><b>Rom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROM
	 * @model name="rom"
	 * @generated
	 * @ordered
	 */
	public static final int ROM_VALUE = 4;

	/**
	 * The '<em><b>Shlib</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shlib</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHLIB
	 * @model name="shlib"
	 * @generated
	 * @ordered
	 */
	public static final int SHLIB_VALUE = 5;

	/**
	 * The '<em><b>Flag0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flag0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLAG0
	 * @model name="flag0"
	 * @generated
	 * @ordered
	 */
	public static final int FLAG0_VALUE = 6;

	/**
	 * The '<em><b>Flag1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flag1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLAG1
	 * @model name="flag1"
	 * @generated
	 * @ordered
	 */
	public static final int FLAG1_VALUE = 7;

	/**
	 * The '<em><b>Flag2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flag2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLAG2
	 * @model name="flag2"
	 * @generated
	 * @ordered
	 */
	public static final int FLAG2_VALUE = 8;

	/**
	 * The '<em><b>Flag3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flag3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLAG3
	 * @model name="flag3"
	 * @generated
	 * @ordered
	 */
	public static final int FLAG3_VALUE = 9;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 10;

	/**
	 * An array of all the '<em><b>Mem Area Flags T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MemAreaFlagsT[] VALUES_ARRAY =
		new MemAreaFlagsT[] {
			UNMAPPED,
			SHARED,
			READ_ONLY,
			UNCACHEABLE,
			ROM,
			SHLIB,
			FLAG0,
			FLAG1,
			FLAG2,
			FLAG3,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Mem Area Flags T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MemAreaFlagsT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mem Area Flags T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MemAreaFlagsT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MemAreaFlagsT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mem Area Flags T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MemAreaFlagsT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MemAreaFlagsT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mem Area Flags T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MemAreaFlagsT get(int value) {
		switch (value) {
			case UNMAPPED_VALUE: return UNMAPPED;
			case SHARED_VALUE: return SHARED;
			case READ_ONLY_VALUE: return READ_ONLY;
			case UNCACHEABLE_VALUE: return UNCACHEABLE;
			case ROM_VALUE: return ROM;
			case SHLIB_VALUE: return SHLIB;
			case FLAG0_VALUE: return FLAG0;
			case FLAG1_VALUE: return FLAG1;
			case FLAG2_VALUE: return FLAG2;
			case FLAG3_VALUE: return FLAG3;
			case NONE_VALUE: return NONE;
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
	private MemAreaFlagsT(int value, String name, String literal) {
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
	
} //MemAreaFlagsT
