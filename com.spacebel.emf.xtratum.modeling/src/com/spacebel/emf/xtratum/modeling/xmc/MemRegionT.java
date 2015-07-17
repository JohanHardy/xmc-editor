/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mem Region T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getMemRegionT()
 * @model extendedMetaData="name='memRegion_t'"
 * @generated
 */
public enum MemRegionT implements Enumerator {
	/**
	 * The '<em><b>Sdram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SDRAM_VALUE
	 * @generated
	 * @ordered
	 */
	SDRAM(0, "sdram", "sdram"),

	/**
	 * The '<em><b>Stram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAM_VALUE
	 * @generated
	 * @ordered
	 */
	STRAM(1, "stram", "stram"),

	/**
	 * The '<em><b>Rom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROM_VALUE
	 * @generated
	 * @ordered
	 */
	ROM(2, "rom", "rom");

	/**
	 * The '<em><b>Sdram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sdram</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SDRAM
	 * @model name="sdram"
	 * @generated
	 * @ordered
	 */
	public static final int SDRAM_VALUE = 0;

	/**
	 * The '<em><b>Stram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stram</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRAM
	 * @model name="stram"
	 * @generated
	 * @ordered
	 */
	public static final int STRAM_VALUE = 1;

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
	public static final int ROM_VALUE = 2;

	/**
	 * An array of all the '<em><b>Mem Region T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MemRegionT[] VALUES_ARRAY =
		new MemRegionT[] {
			SDRAM,
			STRAM,
			ROM,
		};

	/**
	 * A public read-only list of all the '<em><b>Mem Region T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MemRegionT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mem Region T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MemRegionT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MemRegionT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mem Region T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MemRegionT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MemRegionT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mem Region T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MemRegionT get(int value) {
		switch (value) {
			case SDRAM_VALUE: return SDRAM;
			case STRAM_VALUE: return STRAM;
			case ROM_VALUE: return ROM;
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
	private MemRegionT(int value, String name, String literal) {
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
	
} //MemRegionT
