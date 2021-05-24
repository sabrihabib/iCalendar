/**
 */
package proectCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see proectCalendar.ProectCalendarFactory
 * @model kind="package"
 * @generated
 */
public interface ProectCalendarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "proectCalendar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/proectCalendar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "proectCalendar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProectCalendarPackage eINSTANCE = proectCalendar.impl.ProectCalendarPackageImpl.init();

	/**
	 * The meta object id for the '{@link proectCalendar.impl.VcalendarImpl <em>Vcalendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proectCalendar.impl.VcalendarImpl
	 * @see proectCalendar.impl.ProectCalendarPackageImpl#getVcalendar()
	 * @generated
	 */
	int VCALENDAR = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCALENDAR__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Prodid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCALENDAR__PRODID = 1;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCALENDAR__INSTRUCTION = 2;

	/**
	 * The number of structural features of the '<em>Vcalendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCALENDAR_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCALENDAR___ACCEPT__VCALENDARVISITOR = 0;

	/**
	 * The number of operations of the '<em>Vcalendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCALENDAR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link proectCalendar.impl.VtodoImpl <em>Vtodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proectCalendar.impl.VtodoImpl
	 * @see proectCalendar.impl.ProectCalendarPackageImpl#getVtodo()
	 * @generated
	 */
	int VTODO = 1;

	/**
	 * The feature id for the '<em><b>Alarm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTODO__ALARM = 0;

	/**
	 * The feature id for the '<em><b>Dtstamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTODO__DTSTAMP = 1;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTODO__UID = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTODO__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTODO__COMPLETED = 4;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTODO__CREATED = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTODO__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTODO__STATUS = 7;

	/**
	 * The number of structural features of the '<em>Vtodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTODO_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTODO___ACCEPT__VCALENDARVISITOR = 0;

	/**
	 * The number of operations of the '<em>Vtodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTODO_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link proectCalendar.impl.ValarmImpl <em>Valarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proectCalendar.impl.ValarmImpl
	 * @see proectCalendar.impl.ProectCalendarPackageImpl#getValarm()
	 * @generated
	 */
	int VALARM = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALARM__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALARM__TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALARM__DURATION = 2;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALARM__REPEAT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALARM__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Valarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALARM_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALARM___ACCEPT__VCALENDARVISITOR = 0;

	/**
	 * The number of operations of the '<em>Valarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALARM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link proectCalendar.impl.VjournalImpl <em>Vjournal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proectCalendar.impl.VjournalImpl
	 * @see proectCalendar.impl.ProectCalendarPackageImpl#getVjournal()
	 * @generated
	 */
	int VJOURNAL = 3;

	/**
	 * The feature id for the '<em><b>Dtstamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VJOURNAL__DTSTAMP = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VJOURNAL__UID = 1;

	/**
	 * The feature id for the '<em><b>Dtstart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VJOURNAL__DTSTART = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VJOURNAL__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Summuary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VJOURNAL__SUMMUARY = 4;

	/**
	 * The number of structural features of the '<em>Vjournal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VJOURNAL_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VJOURNAL___ACCEPT__VCALENDARVISITOR = 0;

	/**
	 * The number of operations of the '<em>Vjournal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VJOURNAL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link proectCalendar.impl.VeventImpl <em>Vevent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proectCalendar.impl.VeventImpl
	 * @see proectCalendar.impl.ProectCalendarPackageImpl#getVevent()
	 * @generated
	 */
	int VEVENT = 4;

	/**
	 * The feature id for the '<em><b>Alarm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEVENT__ALARM = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEVENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEVENT__UID = 2;

	/**
	 * The feature id for the '<em><b>Dtstamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEVENT__DTSTAMP = 3;

	/**
	 * The feature id for the '<em><b>Dtstart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEVENT__DTSTART = 4;

	/**
	 * The feature id for the '<em><b>Dtend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEVENT__DTEND = 5;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEVENT__DURATION = 6;

	/**
	 * The number of structural features of the '<em>Vevent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEVENT_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEVENT___ACCEPT__VCALENDARVISITOR = 0;

	/**
	 * The number of operations of the '<em>Vevent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEVENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link proectCalendar.impl.VtimezoneImpl <em>Vtimezone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proectCalendar.impl.VtimezoneImpl
	 * @see proectCalendar.impl.ProectCalendarPackageImpl#getVtimezone()
	 * @generated
	 */
	int VTIMEZONE = 5;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTIMEZONE__STANDARD = 0;

	/**
	 * The feature id for the '<em><b>Tzid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTIMEZONE__TZID = 1;

	/**
	 * The feature id for the '<em><b>Last mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTIMEZONE__LAST_MOD = 2;

	/**
	 * The feature id for the '<em><b>Tzurl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTIMEZONE__TZURL = 3;

	/**
	 * The feature id for the '<em><b>Daylight</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTIMEZONE__DAYLIGHT = 4;

	/**
	 * The number of structural features of the '<em>Vtimezone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTIMEZONE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTIMEZONE___ACCEPT__VCALENDARVISITOR = 0;

	/**
	 * The number of operations of the '<em>Vtimezone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTIMEZONE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link proectCalendar.impl.FreebusyImpl <em>Freebusy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proectCalendar.impl.FreebusyImpl
	 * @see proectCalendar.impl.ProectCalendarPackageImpl#getFreebusy()
	 * @generated
	 */
	int FREEBUSY = 6;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEBUSY__UID = 0;

	/**
	 * The feature id for the '<em><b>Dtstamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEBUSY__DTSTAMP = 1;

	/**
	 * The feature id for the '<em><b>Dtstart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEBUSY__DTSTART = 2;

	/**
	 * The feature id for the '<em><b>Dtend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEBUSY__DTEND = 3;

	/**
	 * The feature id for the '<em><b>Attendee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEBUSY__ATTENDEE = 4;

	/**
	 * The feature id for the '<em><b>Organizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEBUSY__ORGANIZER = 5;

	/**
	 * The number of structural features of the '<em>Freebusy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEBUSY_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEBUSY___ACCEPT__VCALENDARVISITOR = 0;

	/**
	 * The number of operations of the '<em>Freebusy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEBUSY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link proectCalendar.impl.StandardImpl <em>Standard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proectCalendar.impl.StandardImpl
	 * @see proectCalendar.impl.ProectCalendarPackageImpl#getStandard()
	 * @generated
	 */
	int STANDARD = 7;

	/**
	 * The number of structural features of the '<em>Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD___ACCEPT__VCALENDARVISITOR = 0;

	/**
	 * The number of operations of the '<em>Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link proectCalendar.impl.DaylightImpl <em>Daylight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proectCalendar.impl.DaylightImpl
	 * @see proectCalendar.impl.ProectCalendarPackageImpl#getDaylight()
	 * @generated
	 */
	int DAYLIGHT = 8;

	/**
	 * The number of structural features of the '<em>Daylight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAYLIGHT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAYLIGHT___ACCEPT__VCALENDARVISITOR = 0;

	/**
	 * The number of operations of the '<em>Daylight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAYLIGHT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link proectCalendar.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proectCalendar.impl.InstructionImpl
	 * @see proectCalendar.impl.ProectCalendarPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 9;

	/**
	 * The feature id for the '<em><b>Todo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__TODO = 0;

	/**
	 * The feature id for the '<em><b>Journal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__JOURNAL = 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__EVENT = 2;

	/**
	 * The feature id for the '<em><b>Timezone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__TIMEZONE = 3;

	/**
	 * The feature id for the '<em><b>Freebusy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__FREEBUSY = 4;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION___ACCEPT__VCALENDARVISITOR = 0;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link proectCalendar.impl.VcalendarVisitorImpl <em>Vcalendar Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proectCalendar.impl.VcalendarVisitorImpl
	 * @see proectCalendar.impl.ProectCalendarPackageImpl#getVcalendarVisitor()
	 * @generated
	 */
	int VCALENDAR_VISITOR = 10;

	/**
	 * The number of structural features of the '<em>Vcalendar Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCALENDAR_VISITOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCALENDAR_VISITOR___VISIT__VCALENDAR = 0;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCALENDAR_VISITOR___VISIT__VTODO = 1;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCALENDAR_VISITOR___VISIT__VJOURNAL = 2;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCALENDAR_VISITOR___VISIT__VEVENT = 3;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCALENDAR_VISITOR___VISIT__VTIMEZONE = 4;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCALENDAR_VISITOR___VISIT__FREEBUSY = 5;

	/**
	 * The number of operations of the '<em>Vcalendar Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCALENDAR_VISITOR_OPERATION_COUNT = 6;

	/**
	 * Returns the meta object for class '{@link proectCalendar.Vcalendar <em>Vcalendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vcalendar</em>'.
	 * @see proectCalendar.Vcalendar
	 * @generated
	 */
	EClass getVcalendar();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vcalendar#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see proectCalendar.Vcalendar#getVersion()
	 * @see #getVcalendar()
	 * @generated
	 */
	EAttribute getVcalendar_Version();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vcalendar#getProdid <em>Prodid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prodid</em>'.
	 * @see proectCalendar.Vcalendar#getProdid()
	 * @see #getVcalendar()
	 * @generated
	 */
	EAttribute getVcalendar_Prodid();

	/**
	 * Returns the meta object for the containment reference list '{@link proectCalendar.Vcalendar#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instruction</em>'.
	 * @see proectCalendar.Vcalendar#getInstruction()
	 * @see #getVcalendar()
	 * @generated
	 */
	EReference getVcalendar_Instruction();

	/**
	 * Returns the meta object for the '{@link proectCalendar.Vcalendar#accept(proectCalendar.VcalendarVisitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see proectCalendar.Vcalendar#accept(proectCalendar.VcalendarVisitor)
	 * @generated
	 */
	EOperation getVcalendar__Accept__VcalendarVisitor();

	/**
	 * Returns the meta object for class '{@link proectCalendar.Vtodo <em>Vtodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vtodo</em>'.
	 * @see proectCalendar.Vtodo
	 * @generated
	 */
	EClass getVtodo();

	/**
	 * Returns the meta object for the containment reference list '{@link proectCalendar.Vtodo#getAlarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alarm</em>'.
	 * @see proectCalendar.Vtodo#getAlarm()
	 * @see #getVtodo()
	 * @generated
	 */
	EReference getVtodo_Alarm();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vtodo#getDtstamp <em>Dtstamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtstamp</em>'.
	 * @see proectCalendar.Vtodo#getDtstamp()
	 * @see #getVtodo()
	 * @generated
	 */
	EAttribute getVtodo_Dtstamp();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vtodo#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see proectCalendar.Vtodo#getUid()
	 * @see #getVtodo()
	 * @generated
	 */
	EAttribute getVtodo_Uid();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vtodo#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see proectCalendar.Vtodo#getClass_()
	 * @see #getVtodo()
	 * @generated
	 */
	EAttribute getVtodo_Class();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vtodo#getCompleted <em>Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed</em>'.
	 * @see proectCalendar.Vtodo#getCompleted()
	 * @see #getVtodo()
	 * @generated
	 */
	EAttribute getVtodo_Completed();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vtodo#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see proectCalendar.Vtodo#getCreated()
	 * @see #getVtodo()
	 * @generated
	 */
	EAttribute getVtodo_Created();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vtodo#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see proectCalendar.Vtodo#getDescription()
	 * @see #getVtodo()
	 * @generated
	 */
	EAttribute getVtodo_Description();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vtodo#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see proectCalendar.Vtodo#getStatus()
	 * @see #getVtodo()
	 * @generated
	 */
	EAttribute getVtodo_Status();

	/**
	 * Returns the meta object for the '{@link proectCalendar.Vtodo#accept(proectCalendar.VcalendarVisitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see proectCalendar.Vtodo#accept(proectCalendar.VcalendarVisitor)
	 * @generated
	 */
	EOperation getVtodo__Accept__VcalendarVisitor();

	/**
	 * Returns the meta object for class '{@link proectCalendar.Valarm <em>Valarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valarm</em>'.
	 * @see proectCalendar.Valarm
	 * @generated
	 */
	EClass getValarm();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Valarm#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see proectCalendar.Valarm#getAction()
	 * @see #getValarm()
	 * @generated
	 */
	EAttribute getValarm_Action();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Valarm#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see proectCalendar.Valarm#getTrigger()
	 * @see #getValarm()
	 * @generated
	 */
	EAttribute getValarm_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Valarm#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see proectCalendar.Valarm#getDuration()
	 * @see #getValarm()
	 * @generated
	 */
	EAttribute getValarm_Duration();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Valarm#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat</em>'.
	 * @see proectCalendar.Valarm#getRepeat()
	 * @see #getValarm()
	 * @generated
	 */
	EAttribute getValarm_Repeat();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Valarm#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see proectCalendar.Valarm#getDescription()
	 * @see #getValarm()
	 * @generated
	 */
	EAttribute getValarm_Description();

	/**
	 * Returns the meta object for the '{@link proectCalendar.Valarm#accept(proectCalendar.VcalendarVisitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see proectCalendar.Valarm#accept(proectCalendar.VcalendarVisitor)
	 * @generated
	 */
	EOperation getValarm__Accept__VcalendarVisitor();

	/**
	 * Returns the meta object for class '{@link proectCalendar.Vjournal <em>Vjournal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vjournal</em>'.
	 * @see proectCalendar.Vjournal
	 * @generated
	 */
	EClass getVjournal();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vjournal#getDtstamp <em>Dtstamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtstamp</em>'.
	 * @see proectCalendar.Vjournal#getDtstamp()
	 * @see #getVjournal()
	 * @generated
	 */
	EAttribute getVjournal_Dtstamp();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vjournal#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see proectCalendar.Vjournal#getUid()
	 * @see #getVjournal()
	 * @generated
	 */
	EAttribute getVjournal_Uid();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vjournal#getDtstart <em>Dtstart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtstart</em>'.
	 * @see proectCalendar.Vjournal#getDtstart()
	 * @see #getVjournal()
	 * @generated
	 */
	EAttribute getVjournal_Dtstart();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vjournal#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see proectCalendar.Vjournal#getDescription()
	 * @see #getVjournal()
	 * @generated
	 */
	EAttribute getVjournal_Description();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vjournal#getSummuary <em>Summuary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summuary</em>'.
	 * @see proectCalendar.Vjournal#getSummuary()
	 * @see #getVjournal()
	 * @generated
	 */
	EAttribute getVjournal_Summuary();

	/**
	 * Returns the meta object for the '{@link proectCalendar.Vjournal#accept(proectCalendar.VcalendarVisitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see proectCalendar.Vjournal#accept(proectCalendar.VcalendarVisitor)
	 * @generated
	 */
	EOperation getVjournal__Accept__VcalendarVisitor();

	/**
	 * Returns the meta object for class '{@link proectCalendar.Vevent <em>Vevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vevent</em>'.
	 * @see proectCalendar.Vevent
	 * @generated
	 */
	EClass getVevent();

	/**
	 * Returns the meta object for the containment reference list '{@link proectCalendar.Vevent#getAlarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alarm</em>'.
	 * @see proectCalendar.Vevent#getAlarm()
	 * @see #getVevent()
	 * @generated
	 */
	EReference getVevent_Alarm();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vevent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see proectCalendar.Vevent#getDescription()
	 * @see #getVevent()
	 * @generated
	 */
	EAttribute getVevent_Description();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vevent#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see proectCalendar.Vevent#getUid()
	 * @see #getVevent()
	 * @generated
	 */
	EAttribute getVevent_Uid();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vevent#getDtstamp <em>Dtstamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtstamp</em>'.
	 * @see proectCalendar.Vevent#getDtstamp()
	 * @see #getVevent()
	 * @generated
	 */
	EAttribute getVevent_Dtstamp();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vevent#getDtstart <em>Dtstart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtstart</em>'.
	 * @see proectCalendar.Vevent#getDtstart()
	 * @see #getVevent()
	 * @generated
	 */
	EAttribute getVevent_Dtstart();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vevent#getDtend <em>Dtend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtend</em>'.
	 * @see proectCalendar.Vevent#getDtend()
	 * @see #getVevent()
	 * @generated
	 */
	EAttribute getVevent_Dtend();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vevent#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see proectCalendar.Vevent#getDuration()
	 * @see #getVevent()
	 * @generated
	 */
	EAttribute getVevent_Duration();

	/**
	 * Returns the meta object for the '{@link proectCalendar.Vevent#accept(proectCalendar.VcalendarVisitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see proectCalendar.Vevent#accept(proectCalendar.VcalendarVisitor)
	 * @generated
	 */
	EOperation getVevent__Accept__VcalendarVisitor();

	/**
	 * Returns the meta object for class '{@link proectCalendar.Vtimezone <em>Vtimezone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vtimezone</em>'.
	 * @see proectCalendar.Vtimezone
	 * @generated
	 */
	EClass getVtimezone();

	/**
	 * Returns the meta object for the containment reference list '{@link proectCalendar.Vtimezone#getStandard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Standard</em>'.
	 * @see proectCalendar.Vtimezone#getStandard()
	 * @see #getVtimezone()
	 * @generated
	 */
	EReference getVtimezone_Standard();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vtimezone#getTzid <em>Tzid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tzid</em>'.
	 * @see proectCalendar.Vtimezone#getTzid()
	 * @see #getVtimezone()
	 * @generated
	 */
	EAttribute getVtimezone_Tzid();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vtimezone#getLast_mod <em>Last mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last mod</em>'.
	 * @see proectCalendar.Vtimezone#getLast_mod()
	 * @see #getVtimezone()
	 * @generated
	 */
	EAttribute getVtimezone_Last_mod();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Vtimezone#getTzurl <em>Tzurl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tzurl</em>'.
	 * @see proectCalendar.Vtimezone#getTzurl()
	 * @see #getVtimezone()
	 * @generated
	 */
	EAttribute getVtimezone_Tzurl();

	/**
	 * Returns the meta object for the containment reference list '{@link proectCalendar.Vtimezone#getDaylight <em>Daylight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Daylight</em>'.
	 * @see proectCalendar.Vtimezone#getDaylight()
	 * @see #getVtimezone()
	 * @generated
	 */
	EReference getVtimezone_Daylight();

	/**
	 * Returns the meta object for the '{@link proectCalendar.Vtimezone#accept(proectCalendar.VcalendarVisitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see proectCalendar.Vtimezone#accept(proectCalendar.VcalendarVisitor)
	 * @generated
	 */
	EOperation getVtimezone__Accept__VcalendarVisitor();

	/**
	 * Returns the meta object for class '{@link proectCalendar.Freebusy <em>Freebusy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Freebusy</em>'.
	 * @see proectCalendar.Freebusy
	 * @generated
	 */
	EClass getFreebusy();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Freebusy#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see proectCalendar.Freebusy#getUid()
	 * @see #getFreebusy()
	 * @generated
	 */
	EAttribute getFreebusy_Uid();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Freebusy#getDtstamp <em>Dtstamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtstamp</em>'.
	 * @see proectCalendar.Freebusy#getDtstamp()
	 * @see #getFreebusy()
	 * @generated
	 */
	EAttribute getFreebusy_Dtstamp();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Freebusy#getDtstart <em>Dtstart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtstart</em>'.
	 * @see proectCalendar.Freebusy#getDtstart()
	 * @see #getFreebusy()
	 * @generated
	 */
	EAttribute getFreebusy_Dtstart();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Freebusy#getDtend <em>Dtend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtend</em>'.
	 * @see proectCalendar.Freebusy#getDtend()
	 * @see #getFreebusy()
	 * @generated
	 */
	EAttribute getFreebusy_Dtend();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Freebusy#getAttendee <em>Attendee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attendee</em>'.
	 * @see proectCalendar.Freebusy#getAttendee()
	 * @see #getFreebusy()
	 * @generated
	 */
	EAttribute getFreebusy_Attendee();

	/**
	 * Returns the meta object for the attribute '{@link proectCalendar.Freebusy#getOrganizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organizer</em>'.
	 * @see proectCalendar.Freebusy#getOrganizer()
	 * @see #getFreebusy()
	 * @generated
	 */
	EAttribute getFreebusy_Organizer();

	/**
	 * Returns the meta object for the '{@link proectCalendar.Freebusy#accept(proectCalendar.VcalendarVisitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see proectCalendar.Freebusy#accept(proectCalendar.VcalendarVisitor)
	 * @generated
	 */
	EOperation getFreebusy__Accept__VcalendarVisitor();

	/**
	 * Returns the meta object for class '{@link proectCalendar.Standard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard</em>'.
	 * @see proectCalendar.Standard
	 * @generated
	 */
	EClass getStandard();

	/**
	 * Returns the meta object for the '{@link proectCalendar.Standard#accept(proectCalendar.VcalendarVisitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see proectCalendar.Standard#accept(proectCalendar.VcalendarVisitor)
	 * @generated
	 */
	EOperation getStandard__Accept__VcalendarVisitor();

	/**
	 * Returns the meta object for class '{@link proectCalendar.Daylight <em>Daylight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daylight</em>'.
	 * @see proectCalendar.Daylight
	 * @generated
	 */
	EClass getDaylight();

	/**
	 * Returns the meta object for the '{@link proectCalendar.Daylight#accept(proectCalendar.VcalendarVisitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see proectCalendar.Daylight#accept(proectCalendar.VcalendarVisitor)
	 * @generated
	 */
	EOperation getDaylight__Accept__VcalendarVisitor();

	/**
	 * Returns the meta object for class '{@link proectCalendar.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see proectCalendar.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the containment reference list '{@link proectCalendar.Instruction#getTodo <em>Todo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Todo</em>'.
	 * @see proectCalendar.Instruction#getTodo()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Todo();

	/**
	 * Returns the meta object for the containment reference list '{@link proectCalendar.Instruction#getJournal <em>Journal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Journal</em>'.
	 * @see proectCalendar.Instruction#getJournal()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Journal();

	/**
	 * Returns the meta object for the containment reference list '{@link proectCalendar.Instruction#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see proectCalendar.Instruction#getEvent()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link proectCalendar.Instruction#getTimezone <em>Timezone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timezone</em>'.
	 * @see proectCalendar.Instruction#getTimezone()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Timezone();

	/**
	 * Returns the meta object for the containment reference list '{@link proectCalendar.Instruction#getFreebusy <em>Freebusy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Freebusy</em>'.
	 * @see proectCalendar.Instruction#getFreebusy()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Freebusy();

	/**
	 * Returns the meta object for the '{@link proectCalendar.Instruction#accept(proectCalendar.VcalendarVisitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see proectCalendar.Instruction#accept(proectCalendar.VcalendarVisitor)
	 * @generated
	 */
	EOperation getInstruction__Accept__VcalendarVisitor();

	/**
	 * Returns the meta object for class '{@link proectCalendar.VcalendarVisitor <em>Vcalendar Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vcalendar Visitor</em>'.
	 * @see proectCalendar.VcalendarVisitor
	 * @generated
	 */
	EClass getVcalendarVisitor();

	/**
	 * Returns the meta object for the '{@link proectCalendar.VcalendarVisitor#visit(proectCalendar.Vcalendar) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see proectCalendar.VcalendarVisitor#visit(proectCalendar.Vcalendar)
	 * @generated
	 */
	EOperation getVcalendarVisitor__Visit__Vcalendar();

	/**
	 * Returns the meta object for the '{@link proectCalendar.VcalendarVisitor#visit(proectCalendar.Vtodo) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see proectCalendar.VcalendarVisitor#visit(proectCalendar.Vtodo)
	 * @generated
	 */
	EOperation getVcalendarVisitor__Visit__Vtodo();

	/**
	 * Returns the meta object for the '{@link proectCalendar.VcalendarVisitor#visit(proectCalendar.Vjournal) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see proectCalendar.VcalendarVisitor#visit(proectCalendar.Vjournal)
	 * @generated
	 */
	EOperation getVcalendarVisitor__Visit__Vjournal();

	/**
	 * Returns the meta object for the '{@link proectCalendar.VcalendarVisitor#visit(proectCalendar.Vevent) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see proectCalendar.VcalendarVisitor#visit(proectCalendar.Vevent)
	 * @generated
	 */
	EOperation getVcalendarVisitor__Visit__Vevent();

	/**
	 * Returns the meta object for the '{@link proectCalendar.VcalendarVisitor#visit(proectCalendar.Vtimezone) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see proectCalendar.VcalendarVisitor#visit(proectCalendar.Vtimezone)
	 * @generated
	 */
	EOperation getVcalendarVisitor__Visit__Vtimezone();

	/**
	 * Returns the meta object for the '{@link proectCalendar.VcalendarVisitor#visit(proectCalendar.Freebusy) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see proectCalendar.VcalendarVisitor#visit(proectCalendar.Freebusy)
	 * @generated
	 */
	EOperation getVcalendarVisitor__Visit__Freebusy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProectCalendarFactory getProectCalendarFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link proectCalendar.impl.VcalendarImpl <em>Vcalendar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proectCalendar.impl.VcalendarImpl
		 * @see proectCalendar.impl.ProectCalendarPackageImpl#getVcalendar()
		 * @generated
		 */
		EClass VCALENDAR = eINSTANCE.getVcalendar();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCALENDAR__VERSION = eINSTANCE.getVcalendar_Version();

		/**
		 * The meta object literal for the '<em><b>Prodid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCALENDAR__PRODID = eINSTANCE.getVcalendar_Prodid();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCALENDAR__INSTRUCTION = eINSTANCE.getVcalendar_Instruction();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VCALENDAR___ACCEPT__VCALENDARVISITOR = eINSTANCE.getVcalendar__Accept__VcalendarVisitor();

		/**
		 * The meta object literal for the '{@link proectCalendar.impl.VtodoImpl <em>Vtodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proectCalendar.impl.VtodoImpl
		 * @see proectCalendar.impl.ProectCalendarPackageImpl#getVtodo()
		 * @generated
		 */
		EClass VTODO = eINSTANCE.getVtodo();

		/**
		 * The meta object literal for the '<em><b>Alarm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTODO__ALARM = eINSTANCE.getVtodo_Alarm();

		/**
		 * The meta object literal for the '<em><b>Dtstamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTODO__DTSTAMP = eINSTANCE.getVtodo_Dtstamp();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTODO__UID = eINSTANCE.getVtodo_Uid();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTODO__CLASS = eINSTANCE.getVtodo_Class();

		/**
		 * The meta object literal for the '<em><b>Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTODO__COMPLETED = eINSTANCE.getVtodo_Completed();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTODO__CREATED = eINSTANCE.getVtodo_Created();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTODO__DESCRIPTION = eINSTANCE.getVtodo_Description();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTODO__STATUS = eINSTANCE.getVtodo_Status();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VTODO___ACCEPT__VCALENDARVISITOR = eINSTANCE.getVtodo__Accept__VcalendarVisitor();

		/**
		 * The meta object literal for the '{@link proectCalendar.impl.ValarmImpl <em>Valarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proectCalendar.impl.ValarmImpl
		 * @see proectCalendar.impl.ProectCalendarPackageImpl#getValarm()
		 * @generated
		 */
		EClass VALARM = eINSTANCE.getValarm();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALARM__ACTION = eINSTANCE.getValarm_Action();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALARM__TRIGGER = eINSTANCE.getValarm_Trigger();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALARM__DURATION = eINSTANCE.getValarm_Duration();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALARM__REPEAT = eINSTANCE.getValarm_Repeat();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALARM__DESCRIPTION = eINSTANCE.getValarm_Description();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALARM___ACCEPT__VCALENDARVISITOR = eINSTANCE.getValarm__Accept__VcalendarVisitor();

		/**
		 * The meta object literal for the '{@link proectCalendar.impl.VjournalImpl <em>Vjournal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proectCalendar.impl.VjournalImpl
		 * @see proectCalendar.impl.ProectCalendarPackageImpl#getVjournal()
		 * @generated
		 */
		EClass VJOURNAL = eINSTANCE.getVjournal();

		/**
		 * The meta object literal for the '<em><b>Dtstamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VJOURNAL__DTSTAMP = eINSTANCE.getVjournal_Dtstamp();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VJOURNAL__UID = eINSTANCE.getVjournal_Uid();

		/**
		 * The meta object literal for the '<em><b>Dtstart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VJOURNAL__DTSTART = eINSTANCE.getVjournal_Dtstart();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VJOURNAL__DESCRIPTION = eINSTANCE.getVjournal_Description();

		/**
		 * The meta object literal for the '<em><b>Summuary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VJOURNAL__SUMMUARY = eINSTANCE.getVjournal_Summuary();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VJOURNAL___ACCEPT__VCALENDARVISITOR = eINSTANCE.getVjournal__Accept__VcalendarVisitor();

		/**
		 * The meta object literal for the '{@link proectCalendar.impl.VeventImpl <em>Vevent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proectCalendar.impl.VeventImpl
		 * @see proectCalendar.impl.ProectCalendarPackageImpl#getVevent()
		 * @generated
		 */
		EClass VEVENT = eINSTANCE.getVevent();

		/**
		 * The meta object literal for the '<em><b>Alarm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEVENT__ALARM = eINSTANCE.getVevent_Alarm();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEVENT__DESCRIPTION = eINSTANCE.getVevent_Description();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEVENT__UID = eINSTANCE.getVevent_Uid();

		/**
		 * The meta object literal for the '<em><b>Dtstamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEVENT__DTSTAMP = eINSTANCE.getVevent_Dtstamp();

		/**
		 * The meta object literal for the '<em><b>Dtstart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEVENT__DTSTART = eINSTANCE.getVevent_Dtstart();

		/**
		 * The meta object literal for the '<em><b>Dtend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEVENT__DTEND = eINSTANCE.getVevent_Dtend();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEVENT__DURATION = eINSTANCE.getVevent_Duration();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VEVENT___ACCEPT__VCALENDARVISITOR = eINSTANCE.getVevent__Accept__VcalendarVisitor();

		/**
		 * The meta object literal for the '{@link proectCalendar.impl.VtimezoneImpl <em>Vtimezone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proectCalendar.impl.VtimezoneImpl
		 * @see proectCalendar.impl.ProectCalendarPackageImpl#getVtimezone()
		 * @generated
		 */
		EClass VTIMEZONE = eINSTANCE.getVtimezone();

		/**
		 * The meta object literal for the '<em><b>Standard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTIMEZONE__STANDARD = eINSTANCE.getVtimezone_Standard();

		/**
		 * The meta object literal for the '<em><b>Tzid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTIMEZONE__TZID = eINSTANCE.getVtimezone_Tzid();

		/**
		 * The meta object literal for the '<em><b>Last mod</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTIMEZONE__LAST_MOD = eINSTANCE.getVtimezone_Last_mod();

		/**
		 * The meta object literal for the '<em><b>Tzurl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTIMEZONE__TZURL = eINSTANCE.getVtimezone_Tzurl();

		/**
		 * The meta object literal for the '<em><b>Daylight</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTIMEZONE__DAYLIGHT = eINSTANCE.getVtimezone_Daylight();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VTIMEZONE___ACCEPT__VCALENDARVISITOR = eINSTANCE.getVtimezone__Accept__VcalendarVisitor();

		/**
		 * The meta object literal for the '{@link proectCalendar.impl.FreebusyImpl <em>Freebusy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proectCalendar.impl.FreebusyImpl
		 * @see proectCalendar.impl.ProectCalendarPackageImpl#getFreebusy()
		 * @generated
		 */
		EClass FREEBUSY = eINSTANCE.getFreebusy();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREEBUSY__UID = eINSTANCE.getFreebusy_Uid();

		/**
		 * The meta object literal for the '<em><b>Dtstamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREEBUSY__DTSTAMP = eINSTANCE.getFreebusy_Dtstamp();

		/**
		 * The meta object literal for the '<em><b>Dtstart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREEBUSY__DTSTART = eINSTANCE.getFreebusy_Dtstart();

		/**
		 * The meta object literal for the '<em><b>Dtend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREEBUSY__DTEND = eINSTANCE.getFreebusy_Dtend();

		/**
		 * The meta object literal for the '<em><b>Attendee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREEBUSY__ATTENDEE = eINSTANCE.getFreebusy_Attendee();

		/**
		 * The meta object literal for the '<em><b>Organizer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREEBUSY__ORGANIZER = eINSTANCE.getFreebusy_Organizer();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FREEBUSY___ACCEPT__VCALENDARVISITOR = eINSTANCE.getFreebusy__Accept__VcalendarVisitor();

		/**
		 * The meta object literal for the '{@link proectCalendar.impl.StandardImpl <em>Standard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proectCalendar.impl.StandardImpl
		 * @see proectCalendar.impl.ProectCalendarPackageImpl#getStandard()
		 * @generated
		 */
		EClass STANDARD = eINSTANCE.getStandard();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STANDARD___ACCEPT__VCALENDARVISITOR = eINSTANCE.getStandard__Accept__VcalendarVisitor();

		/**
		 * The meta object literal for the '{@link proectCalendar.impl.DaylightImpl <em>Daylight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proectCalendar.impl.DaylightImpl
		 * @see proectCalendar.impl.ProectCalendarPackageImpl#getDaylight()
		 * @generated
		 */
		EClass DAYLIGHT = eINSTANCE.getDaylight();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DAYLIGHT___ACCEPT__VCALENDARVISITOR = eINSTANCE.getDaylight__Accept__VcalendarVisitor();

		/**
		 * The meta object literal for the '{@link proectCalendar.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proectCalendar.impl.InstructionImpl
		 * @see proectCalendar.impl.ProectCalendarPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Todo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__TODO = eINSTANCE.getInstruction_Todo();

		/**
		 * The meta object literal for the '<em><b>Journal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__JOURNAL = eINSTANCE.getInstruction_Journal();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__EVENT = eINSTANCE.getInstruction_Event();

		/**
		 * The meta object literal for the '<em><b>Timezone</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__TIMEZONE = eINSTANCE.getInstruction_Timezone();

		/**
		 * The meta object literal for the '<em><b>Freebusy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__FREEBUSY = eINSTANCE.getInstruction_Freebusy();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INSTRUCTION___ACCEPT__VCALENDARVISITOR = eINSTANCE.getInstruction__Accept__VcalendarVisitor();

		/**
		 * The meta object literal for the '{@link proectCalendar.impl.VcalendarVisitorImpl <em>Vcalendar Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proectCalendar.impl.VcalendarVisitorImpl
		 * @see proectCalendar.impl.ProectCalendarPackageImpl#getVcalendarVisitor()
		 * @generated
		 */
		EClass VCALENDAR_VISITOR = eINSTANCE.getVcalendarVisitor();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VCALENDAR_VISITOR___VISIT__VCALENDAR = eINSTANCE.getVcalendarVisitor__Visit__Vcalendar();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VCALENDAR_VISITOR___VISIT__VTODO = eINSTANCE.getVcalendarVisitor__Visit__Vtodo();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VCALENDAR_VISITOR___VISIT__VJOURNAL = eINSTANCE.getVcalendarVisitor__Visit__Vjournal();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VCALENDAR_VISITOR___VISIT__VEVENT = eINSTANCE.getVcalendarVisitor__Visit__Vevent();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VCALENDAR_VISITOR___VISIT__VTIMEZONE = eINSTANCE.getVcalendarVisitor__Visit__Vtimezone();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VCALENDAR_VISITOR___VISIT__FREEBUSY = eINSTANCE.getVcalendarVisitor__Visit__Freebusy();

	}

} //ProectCalendarPackage
