/**
 */
package com.spacebel.emf.xtratum.modeling.xmc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hm String T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.spacebel.emf.xtratum.modeling.xmc.XmcPackage#getHmStringT()
 * @model extendedMetaData="name='hmString_t'"
 * @generated
 */
public enum HmStringT implements Enumerator {
	/**
	 * The '<em><b>XMHMEVINTERNALERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVINTERNALERROR_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVINTERNALERROR(0, "XMHMEVINTERNALERROR", "XM_HM_EV_INTERNAL_ERROR"),

	/**
	 * The '<em><b>XMHMEVUNEXPECTEDTRAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVUNEXPECTEDTRAP_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVUNEXPECTEDTRAP(1, "XMHMEVUNEXPECTEDTRAP", "XM_HM_EV_UNEXPECTED_TRAP"),

	/**
	 * The '<em><b>XMHMEVPARTITIONERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVPARTITIONERROR_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVPARTITIONERROR(2, "XMHMEVPARTITIONERROR", "XM_HM_EV_PARTITION_ERROR"),

	/**
	 * The '<em><b>XMHMEVPARTITIONINTEGRITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVPARTITIONINTEGRITY_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVPARTITIONINTEGRITY(3, "XMHMEVPARTITIONINTEGRITY", "XM_HM_EV_PARTITION_INTEGRITY"),

	/**
	 * The '<em><b>XMHMEVMEMPROTECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVMEMPROTECTION_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVMEMPROTECTION(4, "XMHMEVMEMPROTECTION", "XM_HM_EV_MEM_PROTECTION"),

	/**
	 * The '<em><b>XMHMEVOVERRUN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVOVERRUN_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVOVERRUN(5, "XMHMEVOVERRUN", "XM_HM_EV_OVERRUN"),

	/**
	 * The '<em><b>XMHMEVSCHEDERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSCHEDERROR_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSCHEDERROR(6, "XMHMEVSCHEDERROR", "XM_HM_EV_SCHED_ERROR"),

	/**
	 * The '<em><b>XMHMEVWATCHDOGTIMER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVWATCHDOGTIMER_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVWATCHDOGTIMER(7, "XMHMEVWATCHDOGTIMER", "XM_HM_EV_WATCHDOG_TIMER"),

	/**
	 * The '<em><b>XMHMEVINCOMPATIBLEINTERFACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVINCOMPATIBLEINTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVINCOMPATIBLEINTERFACE(8, "XMHMEVINCOMPATIBLEINTERFACE", "XM_HM_EV_INCOMPATIBLE_INTERFACE"),

	/**
	 * The '<em><b>XMHMEVSPARCV8WRITEERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8WRITEERROR_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8WRITEERROR(9, "XMHMEVSPARCV8WRITEERROR", "XM_HM_EV_SPARCV8_WRITE_ERROR"),

	/**
	 * The '<em><b>XMHMEVSPARCV8INSTRACCESSMMUMISS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8INSTRACCESSMMUMISS_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8INSTRACCESSMMUMISS(10, "XMHMEVSPARCV8INSTRACCESSMMUMISS", "XM_HM_EV_SPARCV8_INSTR_ACCESS_MMU_MISS"),

	/**
	 * The '<em><b>XMHMEVSPARCV8INSTRACCESSERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8INSTRACCESSERROR_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8INSTRACCESSERROR(11, "XMHMEVSPARCV8INSTRACCESSERROR", "XM_HM_EV_SPARCV8_INSTR_ACCESS_ERROR"),

	/**
	 * The '<em><b>XMHMEVSPARCV8UNIMPLEMENTEDFLUSH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8UNIMPLEMENTEDFLUSH_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8UNIMPLEMENTEDFLUSH(12, "XMHMEVSPARCV8UNIMPLEMENTEDFLUSH", "XM_HM_EV_SPARCV8_UNIMPLEMENTED_FLUSH"),

	/**
	 * The '<em><b>XMHMEVSPARCV8WATCHPOINTDETECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8WATCHPOINTDETECTED_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8WATCHPOINTDETECTED(13, "XMHMEVSPARCV8WATCHPOINTDETECTED", "XM_HM_EV_SPARCV8_WATCHPOINT_DETECTED"),

	/**
	 * The '<em><b>XMHMEVSPARCV8DATAACCESSERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8DATAACCESSERROR_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8DATAACCESSERROR(14, "XMHMEVSPARCV8DATAACCESSERROR", "XM_HM_EV_SPARCV8_DATA_ACCESS_ERROR"),

	/**
	 * The '<em><b>XMHMEVSPARCV8DATAACCESSMMUMISS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8DATAACCESSMMUMISS_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8DATAACCESSMMUMISS(15, "XMHMEVSPARCV8DATAACCESSMMUMISS", "XM_HM_EV_SPARCV8_DATA_ACCESS_MMU_MISS"),

	/**
	 * The '<em><b>XMHMEVSPARCV8INSTRACCESSEXCEPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8INSTRACCESSEXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8INSTRACCESSEXCEPTION(16, "XMHMEVSPARCV8INSTRACCESSEXCEPTION", "XM_HM_EV_SPARCV8_INSTR_ACCESS_EXCEPTION"),

	/**
	 * The '<em><b>XMHMEVSPARCV8ILLEGALINSTR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8ILLEGALINSTR_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8ILLEGALINSTR(17, "XMHMEVSPARCV8ILLEGALINSTR", "XM_HM_EV_SPARCV8_ILLEGAL_INSTR"),

	/**
	 * The '<em><b>XMHMEVSPARCV8PRIVILEGEDINSTR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8PRIVILEGEDINSTR_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8PRIVILEGEDINSTR(18, "XMHMEVSPARCV8PRIVILEGEDINSTR", "XM_HM_EV_SPARCV8_PRIVILEGED_INSTR"),

	/**
	 * The '<em><b>XMHMEVSPARCV8FPDISABLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8FPDISABLED_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8FPDISABLED(19, "XMHMEVSPARCV8FPDISABLED", "XM_HM_EV_SPARCV8_FP_DISABLED"),

	/**
	 * The '<em><b>XMHMEVSPARCV8CPDISABLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8CPDISABLED_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8CPDISABLED(20, "XMHMEVSPARCV8CPDISABLED", "XM_HM_EV_SPARCV8_CP_DISABLED"),

	/**
	 * The '<em><b>XMHMEVSPARCV8REGISTERHARDWAREERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8REGISTERHARDWAREERROR_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8REGISTERHARDWAREERROR(21, "XMHMEVSPARCV8REGISTERHARDWAREERROR", "XM_HM_EV_SPARCV8_REGISTER_HARDWARE_ERROR"),

	/**
	 * The '<em><b>XMHMEVSPARCV8MEMADDRNOTALIGNED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8MEMADDRNOTALIGNED_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8MEMADDRNOTALIGNED(22, "XMHMEVSPARCV8MEMADDRNOTALIGNED", "XM_HM_EV_SPARCV8_MEM_ADDR_NOT_ALIGNED"),

	/**
	 * The '<em><b>XMHMEVSPARCV8FPEXCEPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8FPEXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8FPEXCEPTION(23, "XMHMEVSPARCV8FPEXCEPTION", "XM_HM_EV_SPARCV8_FP_EXCEPTION"),

	/**
	 * The '<em><b>XMHMEVSPARCV8CPEXCEPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8CPEXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8CPEXCEPTION(24, "XMHMEVSPARCV8CPEXCEPTION", "XM_HM_EV_SPARCV8_CP_EXCEPTION"),

	/**
	 * The '<em><b>XMHMEVSPARCV8DATAACCESSEXCEPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8DATAACCESSEXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8DATAACCESSEXCEPTION(25, "XMHMEVSPARCV8DATAACCESSEXCEPTION", "XM_HM_EV_SPARCV8_DATA_ACCESS_EXCEPTION"),

	/**
	 * The '<em><b>XMHMEVSPARCV8TAGOVERFLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8TAGOVERFLOW_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8TAGOVERFLOW(26, "XMHMEVSPARCV8TAGOVERFLOW", "XM_HM_EV_SPARCV8_TAG_OVERFLOW"),

	/**
	 * The '<em><b>XMHMEVSPARCV8DIVIDEEXCEPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8DIVIDEEXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVSPARCV8DIVIDEEXCEPTION(27, "XMHMEVSPARCV8DIVIDEEXCEPTION", "XM_HM_EV_SPARCV8_DIVIDE_EXCEPTION"),

	/**
	 * The '<em><b>XMHMEVAPPDEADLINEMISSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVAPPDEADLINEMISSED_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVAPPDEADLINEMISSED(28, "XMHMEVAPPDEADLINEMISSED", "XM_HM_EV_APP_DEADLINE_MISSED"),

	/**
	 * The '<em><b>XMHMEVAPPAPPLICATIONERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVAPPAPPLICATIONERROR_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVAPPAPPLICATIONERROR(29, "XMHMEVAPPAPPLICATIONERROR", "XM_HM_EV_APP_APPLICATION_ERROR"),

	/**
	 * The '<em><b>XMHMEVAPPNUMERICERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVAPPNUMERICERROR_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVAPPNUMERICERROR(30, "XMHMEVAPPNUMERICERROR", "XM_HM_EV_APP_NUMERIC_ERROR"),

	/**
	 * The '<em><b>XMHMEVAPPILLEGALREQUEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVAPPILLEGALREQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVAPPILLEGALREQUEST(31, "XMHMEVAPPILLEGALREQUEST", "XM_HM_EV_APP_ILLEGAL_REQUEST"),

	/**
	 * The '<em><b>XMHMEVAPPSTACKOVERFLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVAPPSTACKOVERFLOW_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVAPPSTACKOVERFLOW(32, "XMHMEVAPPSTACKOVERFLOW", "XM_HM_EV_APP_STACK_OVERFLOW"),

	/**
	 * The '<em><b>XMHMEVAPPMEMORYVIOLATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVAPPMEMORYVIOLATION_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVAPPMEMORYVIOLATION(33, "XMHMEVAPPMEMORYVIOLATION", "XM_HM_EV_APP_MEMORY_VIOLATION"),

	/**
	 * The '<em><b>XMHMEVAPPHARDWAREFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVAPPHARDWAREFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVAPPHARDWAREFAULT(34, "XMHMEVAPPHARDWAREFAULT", "XM_HM_EV_APP_HARDWARE_FAULT"),

	/**
	 * The '<em><b>XMHMEVAPPPOWERFAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMHMEVAPPPOWERFAIL_VALUE
	 * @generated
	 * @ordered
	 */
	XMHMEVAPPPOWERFAIL(35, "XMHMEVAPPPOWERFAIL", "XM_HM_EV_APP_POWER_FAIL");

	/**
	 * The '<em><b>XMHMEVINTERNALERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVINTERNALERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVINTERNALERROR
	 * @model literal="XM_HM_EV_INTERNAL_ERROR"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVINTERNALERROR_VALUE = 0;

	/**
	 * The '<em><b>XMHMEVUNEXPECTEDTRAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVUNEXPECTEDTRAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVUNEXPECTEDTRAP
	 * @model literal="XM_HM_EV_UNEXPECTED_TRAP"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVUNEXPECTEDTRAP_VALUE = 1;

	/**
	 * The '<em><b>XMHMEVPARTITIONERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVPARTITIONERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVPARTITIONERROR
	 * @model literal="XM_HM_EV_PARTITION_ERROR"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVPARTITIONERROR_VALUE = 2;

	/**
	 * The '<em><b>XMHMEVPARTITIONINTEGRITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVPARTITIONINTEGRITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVPARTITIONINTEGRITY
	 * @model literal="XM_HM_EV_PARTITION_INTEGRITY"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVPARTITIONINTEGRITY_VALUE = 3;

	/**
	 * The '<em><b>XMHMEVMEMPROTECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVMEMPROTECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVMEMPROTECTION
	 * @model literal="XM_HM_EV_MEM_PROTECTION"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVMEMPROTECTION_VALUE = 4;

	/**
	 * The '<em><b>XMHMEVOVERRUN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVOVERRUN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVOVERRUN
	 * @model literal="XM_HM_EV_OVERRUN"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVOVERRUN_VALUE = 5;

	/**
	 * The '<em><b>XMHMEVSCHEDERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSCHEDERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSCHEDERROR
	 * @model literal="XM_HM_EV_SCHED_ERROR"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSCHEDERROR_VALUE = 6;

	/**
	 * The '<em><b>XMHMEVWATCHDOGTIMER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVWATCHDOGTIMER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVWATCHDOGTIMER
	 * @model literal="XM_HM_EV_WATCHDOG_TIMER"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVWATCHDOGTIMER_VALUE = 7;

	/**
	 * The '<em><b>XMHMEVINCOMPATIBLEINTERFACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVINCOMPATIBLEINTERFACE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVINCOMPATIBLEINTERFACE
	 * @model literal="XM_HM_EV_INCOMPATIBLE_INTERFACE"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVINCOMPATIBLEINTERFACE_VALUE = 8;

	/**
	 * The '<em><b>XMHMEVSPARCV8WRITEERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8WRITEERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8WRITEERROR
	 * @model literal="XM_HM_EV_SPARCV8_WRITE_ERROR"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8WRITEERROR_VALUE = 9;

	/**
	 * The '<em><b>XMHMEVSPARCV8INSTRACCESSMMUMISS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8INSTRACCESSMMUMISS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8INSTRACCESSMMUMISS
	 * @model literal="XM_HM_EV_SPARCV8_INSTR_ACCESS_MMU_MISS"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8INSTRACCESSMMUMISS_VALUE = 10;

	/**
	 * The '<em><b>XMHMEVSPARCV8INSTRACCESSERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8INSTRACCESSERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8INSTRACCESSERROR
	 * @model literal="XM_HM_EV_SPARCV8_INSTR_ACCESS_ERROR"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8INSTRACCESSERROR_VALUE = 11;

	/**
	 * The '<em><b>XMHMEVSPARCV8UNIMPLEMENTEDFLUSH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8UNIMPLEMENTEDFLUSH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8UNIMPLEMENTEDFLUSH
	 * @model literal="XM_HM_EV_SPARCV8_UNIMPLEMENTED_FLUSH"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8UNIMPLEMENTEDFLUSH_VALUE = 12;

	/**
	 * The '<em><b>XMHMEVSPARCV8WATCHPOINTDETECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8WATCHPOINTDETECTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8WATCHPOINTDETECTED
	 * @model literal="XM_HM_EV_SPARCV8_WATCHPOINT_DETECTED"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8WATCHPOINTDETECTED_VALUE = 13;

	/**
	 * The '<em><b>XMHMEVSPARCV8DATAACCESSERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8DATAACCESSERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8DATAACCESSERROR
	 * @model literal="XM_HM_EV_SPARCV8_DATA_ACCESS_ERROR"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8DATAACCESSERROR_VALUE = 14;

	/**
	 * The '<em><b>XMHMEVSPARCV8DATAACCESSMMUMISS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8DATAACCESSMMUMISS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8DATAACCESSMMUMISS
	 * @model literal="XM_HM_EV_SPARCV8_DATA_ACCESS_MMU_MISS"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8DATAACCESSMMUMISS_VALUE = 15;

	/**
	 * The '<em><b>XMHMEVSPARCV8INSTRACCESSEXCEPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8INSTRACCESSEXCEPTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8INSTRACCESSEXCEPTION
	 * @model literal="XM_HM_EV_SPARCV8_INSTR_ACCESS_EXCEPTION"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8INSTRACCESSEXCEPTION_VALUE = 16;

	/**
	 * The '<em><b>XMHMEVSPARCV8ILLEGALINSTR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8ILLEGALINSTR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8ILLEGALINSTR
	 * @model literal="XM_HM_EV_SPARCV8_ILLEGAL_INSTR"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8ILLEGALINSTR_VALUE = 17;

	/**
	 * The '<em><b>XMHMEVSPARCV8PRIVILEGEDINSTR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8PRIVILEGEDINSTR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8PRIVILEGEDINSTR
	 * @model literal="XM_HM_EV_SPARCV8_PRIVILEGED_INSTR"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8PRIVILEGEDINSTR_VALUE = 18;

	/**
	 * The '<em><b>XMHMEVSPARCV8FPDISABLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8FPDISABLED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8FPDISABLED
	 * @model literal="XM_HM_EV_SPARCV8_FP_DISABLED"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8FPDISABLED_VALUE = 19;

	/**
	 * The '<em><b>XMHMEVSPARCV8CPDISABLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8CPDISABLED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8CPDISABLED
	 * @model literal="XM_HM_EV_SPARCV8_CP_DISABLED"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8CPDISABLED_VALUE = 20;

	/**
	 * The '<em><b>XMHMEVSPARCV8REGISTERHARDWAREERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8REGISTERHARDWAREERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8REGISTERHARDWAREERROR
	 * @model literal="XM_HM_EV_SPARCV8_REGISTER_HARDWARE_ERROR"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8REGISTERHARDWAREERROR_VALUE = 21;

	/**
	 * The '<em><b>XMHMEVSPARCV8MEMADDRNOTALIGNED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8MEMADDRNOTALIGNED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8MEMADDRNOTALIGNED
	 * @model literal="XM_HM_EV_SPARCV8_MEM_ADDR_NOT_ALIGNED"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8MEMADDRNOTALIGNED_VALUE = 22;

	/**
	 * The '<em><b>XMHMEVSPARCV8FPEXCEPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8FPEXCEPTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8FPEXCEPTION
	 * @model literal="XM_HM_EV_SPARCV8_FP_EXCEPTION"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8FPEXCEPTION_VALUE = 23;

	/**
	 * The '<em><b>XMHMEVSPARCV8CPEXCEPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8CPEXCEPTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8CPEXCEPTION
	 * @model literal="XM_HM_EV_SPARCV8_CP_EXCEPTION"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8CPEXCEPTION_VALUE = 24;

	/**
	 * The '<em><b>XMHMEVSPARCV8DATAACCESSEXCEPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8DATAACCESSEXCEPTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8DATAACCESSEXCEPTION
	 * @model literal="XM_HM_EV_SPARCV8_DATA_ACCESS_EXCEPTION"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8DATAACCESSEXCEPTION_VALUE = 25;

	/**
	 * The '<em><b>XMHMEVSPARCV8TAGOVERFLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8TAGOVERFLOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8TAGOVERFLOW
	 * @model literal="XM_HM_EV_SPARCV8_TAG_OVERFLOW"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8TAGOVERFLOW_VALUE = 26;

	/**
	 * The '<em><b>XMHMEVSPARCV8DIVIDEEXCEPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVSPARCV8DIVIDEEXCEPTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVSPARCV8DIVIDEEXCEPTION
	 * @model literal="XM_HM_EV_SPARCV8_DIVIDE_EXCEPTION"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVSPARCV8DIVIDEEXCEPTION_VALUE = 27;

	/**
	 * The '<em><b>XMHMEVAPPDEADLINEMISSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVAPPDEADLINEMISSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVAPPDEADLINEMISSED
	 * @model literal="XM_HM_EV_APP_DEADLINE_MISSED"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVAPPDEADLINEMISSED_VALUE = 28;

	/**
	 * The '<em><b>XMHMEVAPPAPPLICATIONERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVAPPAPPLICATIONERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVAPPAPPLICATIONERROR
	 * @model literal="XM_HM_EV_APP_APPLICATION_ERROR"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVAPPAPPLICATIONERROR_VALUE = 29;

	/**
	 * The '<em><b>XMHMEVAPPNUMERICERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVAPPNUMERICERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVAPPNUMERICERROR
	 * @model literal="XM_HM_EV_APP_NUMERIC_ERROR"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVAPPNUMERICERROR_VALUE = 30;

	/**
	 * The '<em><b>XMHMEVAPPILLEGALREQUEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVAPPILLEGALREQUEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVAPPILLEGALREQUEST
	 * @model literal="XM_HM_EV_APP_ILLEGAL_REQUEST"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVAPPILLEGALREQUEST_VALUE = 31;

	/**
	 * The '<em><b>XMHMEVAPPSTACKOVERFLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVAPPSTACKOVERFLOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVAPPSTACKOVERFLOW
	 * @model literal="XM_HM_EV_APP_STACK_OVERFLOW"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVAPPSTACKOVERFLOW_VALUE = 32;

	/**
	 * The '<em><b>XMHMEVAPPMEMORYVIOLATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVAPPMEMORYVIOLATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVAPPMEMORYVIOLATION
	 * @model literal="XM_HM_EV_APP_MEMORY_VIOLATION"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVAPPMEMORYVIOLATION_VALUE = 33;

	/**
	 * The '<em><b>XMHMEVAPPHARDWAREFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVAPPHARDWAREFAULT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVAPPHARDWAREFAULT
	 * @model literal="XM_HM_EV_APP_HARDWARE_FAULT"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVAPPHARDWAREFAULT_VALUE = 34;

	/**
	 * The '<em><b>XMHMEVAPPPOWERFAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMHMEVAPPPOWERFAIL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMHMEVAPPPOWERFAIL
	 * @model literal="XM_HM_EV_APP_POWER_FAIL"
	 * @generated
	 * @ordered
	 */
	public static final int XMHMEVAPPPOWERFAIL_VALUE = 35;

	/**
	 * An array of all the '<em><b>Hm String T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HmStringT[] VALUES_ARRAY =
		new HmStringT[] {
			XMHMEVINTERNALERROR,
			XMHMEVUNEXPECTEDTRAP,
			XMHMEVPARTITIONERROR,
			XMHMEVPARTITIONINTEGRITY,
			XMHMEVMEMPROTECTION,
			XMHMEVOVERRUN,
			XMHMEVSCHEDERROR,
			XMHMEVWATCHDOGTIMER,
			XMHMEVINCOMPATIBLEINTERFACE,
			XMHMEVSPARCV8WRITEERROR,
			XMHMEVSPARCV8INSTRACCESSMMUMISS,
			XMHMEVSPARCV8INSTRACCESSERROR,
			XMHMEVSPARCV8UNIMPLEMENTEDFLUSH,
			XMHMEVSPARCV8WATCHPOINTDETECTED,
			XMHMEVSPARCV8DATAACCESSERROR,
			XMHMEVSPARCV8DATAACCESSMMUMISS,
			XMHMEVSPARCV8INSTRACCESSEXCEPTION,
			XMHMEVSPARCV8ILLEGALINSTR,
			XMHMEVSPARCV8PRIVILEGEDINSTR,
			XMHMEVSPARCV8FPDISABLED,
			XMHMEVSPARCV8CPDISABLED,
			XMHMEVSPARCV8REGISTERHARDWAREERROR,
			XMHMEVSPARCV8MEMADDRNOTALIGNED,
			XMHMEVSPARCV8FPEXCEPTION,
			XMHMEVSPARCV8CPEXCEPTION,
			XMHMEVSPARCV8DATAACCESSEXCEPTION,
			XMHMEVSPARCV8TAGOVERFLOW,
			XMHMEVSPARCV8DIVIDEEXCEPTION,
			XMHMEVAPPDEADLINEMISSED,
			XMHMEVAPPAPPLICATIONERROR,
			XMHMEVAPPNUMERICERROR,
			XMHMEVAPPILLEGALREQUEST,
			XMHMEVAPPSTACKOVERFLOW,
			XMHMEVAPPMEMORYVIOLATION,
			XMHMEVAPPHARDWAREFAULT,
			XMHMEVAPPPOWERFAIL,
		};

	/**
	 * A public read-only list of all the '<em><b>Hm String T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HmStringT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hm String T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HmStringT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HmStringT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hm String T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HmStringT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HmStringT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hm String T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HmStringT get(int value) {
		switch (value) {
			case XMHMEVINTERNALERROR_VALUE: return XMHMEVINTERNALERROR;
			case XMHMEVUNEXPECTEDTRAP_VALUE: return XMHMEVUNEXPECTEDTRAP;
			case XMHMEVPARTITIONERROR_VALUE: return XMHMEVPARTITIONERROR;
			case XMHMEVPARTITIONINTEGRITY_VALUE: return XMHMEVPARTITIONINTEGRITY;
			case XMHMEVMEMPROTECTION_VALUE: return XMHMEVMEMPROTECTION;
			case XMHMEVOVERRUN_VALUE: return XMHMEVOVERRUN;
			case XMHMEVSCHEDERROR_VALUE: return XMHMEVSCHEDERROR;
			case XMHMEVWATCHDOGTIMER_VALUE: return XMHMEVWATCHDOGTIMER;
			case XMHMEVINCOMPATIBLEINTERFACE_VALUE: return XMHMEVINCOMPATIBLEINTERFACE;
			case XMHMEVSPARCV8WRITEERROR_VALUE: return XMHMEVSPARCV8WRITEERROR;
			case XMHMEVSPARCV8INSTRACCESSMMUMISS_VALUE: return XMHMEVSPARCV8INSTRACCESSMMUMISS;
			case XMHMEVSPARCV8INSTRACCESSERROR_VALUE: return XMHMEVSPARCV8INSTRACCESSERROR;
			case XMHMEVSPARCV8UNIMPLEMENTEDFLUSH_VALUE: return XMHMEVSPARCV8UNIMPLEMENTEDFLUSH;
			case XMHMEVSPARCV8WATCHPOINTDETECTED_VALUE: return XMHMEVSPARCV8WATCHPOINTDETECTED;
			case XMHMEVSPARCV8DATAACCESSERROR_VALUE: return XMHMEVSPARCV8DATAACCESSERROR;
			case XMHMEVSPARCV8DATAACCESSMMUMISS_VALUE: return XMHMEVSPARCV8DATAACCESSMMUMISS;
			case XMHMEVSPARCV8INSTRACCESSEXCEPTION_VALUE: return XMHMEVSPARCV8INSTRACCESSEXCEPTION;
			case XMHMEVSPARCV8ILLEGALINSTR_VALUE: return XMHMEVSPARCV8ILLEGALINSTR;
			case XMHMEVSPARCV8PRIVILEGEDINSTR_VALUE: return XMHMEVSPARCV8PRIVILEGEDINSTR;
			case XMHMEVSPARCV8FPDISABLED_VALUE: return XMHMEVSPARCV8FPDISABLED;
			case XMHMEVSPARCV8CPDISABLED_VALUE: return XMHMEVSPARCV8CPDISABLED;
			case XMHMEVSPARCV8REGISTERHARDWAREERROR_VALUE: return XMHMEVSPARCV8REGISTERHARDWAREERROR;
			case XMHMEVSPARCV8MEMADDRNOTALIGNED_VALUE: return XMHMEVSPARCV8MEMADDRNOTALIGNED;
			case XMHMEVSPARCV8FPEXCEPTION_VALUE: return XMHMEVSPARCV8FPEXCEPTION;
			case XMHMEVSPARCV8CPEXCEPTION_VALUE: return XMHMEVSPARCV8CPEXCEPTION;
			case XMHMEVSPARCV8DATAACCESSEXCEPTION_VALUE: return XMHMEVSPARCV8DATAACCESSEXCEPTION;
			case XMHMEVSPARCV8TAGOVERFLOW_VALUE: return XMHMEVSPARCV8TAGOVERFLOW;
			case XMHMEVSPARCV8DIVIDEEXCEPTION_VALUE: return XMHMEVSPARCV8DIVIDEEXCEPTION;
			case XMHMEVAPPDEADLINEMISSED_VALUE: return XMHMEVAPPDEADLINEMISSED;
			case XMHMEVAPPAPPLICATIONERROR_VALUE: return XMHMEVAPPAPPLICATIONERROR;
			case XMHMEVAPPNUMERICERROR_VALUE: return XMHMEVAPPNUMERICERROR;
			case XMHMEVAPPILLEGALREQUEST_VALUE: return XMHMEVAPPILLEGALREQUEST;
			case XMHMEVAPPSTACKOVERFLOW_VALUE: return XMHMEVAPPSTACKOVERFLOW;
			case XMHMEVAPPMEMORYVIOLATION_VALUE: return XMHMEVAPPMEMORYVIOLATION;
			case XMHMEVAPPHARDWAREFAULT_VALUE: return XMHMEVAPPHARDWAREFAULT;
			case XMHMEVAPPPOWERFAIL_VALUE: return XMHMEVAPPPOWERFAIL;
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
	private HmStringT(int value, String name, String literal) {
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
	
} //HmStringT
