/**
 */
package proectCalendar.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import proectCalendar.Daylight;
import proectCalendar.Freebusy;
import proectCalendar.ProectCalendarFactory;
import proectCalendar.ProectCalendarPackage;
import proectCalendar.Standard;
import proectCalendar.Valarm;
import proectCalendar.Vcalendar;
import proectCalendar.Vevent;
import proectCalendar.Vjournal;
import proectCalendar.Vtimezone;
import proectCalendar.Vtodo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProectCalendarPackageImpl extends EPackageImpl implements ProectCalendarPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcalendarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtodoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vjournalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass veventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtimezoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freebusyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daylightEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see proectCalendar.ProectCalendarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProectCalendarPackageImpl() {
		super(eNS_URI, ProectCalendarFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ProectCalendarPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProectCalendarPackage init() {
		if (isInited)
			return (ProectCalendarPackage) EPackage.Registry.INSTANCE.getEPackage(ProectCalendarPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProectCalendarPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProectCalendarPackageImpl theProectCalendarPackage = registeredProectCalendarPackage instanceof ProectCalendarPackageImpl
				? (ProectCalendarPackageImpl) registeredProectCalendarPackage
				: new ProectCalendarPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theProectCalendarPackage.createPackageContents();

		// Initialize created meta-data
		theProectCalendarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProectCalendarPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProectCalendarPackage.eNS_URI, theProectCalendarPackage);
		return theProectCalendarPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVcalendar() {
		return vcalendarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVcalendar_Todo() {
		return (EReference) vcalendarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVcalendar_Journal() {
		return (EReference) vcalendarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVcalendar_Event() {
		return (EReference) vcalendarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVcalendar_Timezone() {
		return (EReference) vcalendarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVcalendar_Freebusy() {
		return (EReference) vcalendarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVcalendar_Version() {
		return (EAttribute) vcalendarEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVcalendar_Prodid() {
		return (EAttribute) vcalendarEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVtodo() {
		return vtodoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVtodo_Alarm() {
		return (EReference) vtodoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVtodo_Dtstamp() {
		return (EAttribute) vtodoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVtodo_Uid() {
		return (EAttribute) vtodoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVtodo_Class() {
		return (EAttribute) vtodoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVtodo_Completed() {
		return (EAttribute) vtodoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVtodo_Created() {
		return (EAttribute) vtodoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVtodo_Description() {
		return (EAttribute) vtodoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVtodo_Status() {
		return (EAttribute) vtodoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValarm() {
		return valarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValarm_Action() {
		return (EAttribute) valarmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValarm_Trigger() {
		return (EAttribute) valarmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValarm_Duration() {
		return (EAttribute) valarmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValarm_Repeat() {
		return (EAttribute) valarmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValarm_Description() {
		return (EAttribute) valarmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVjournal() {
		return vjournalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVjournal_Dtstamp() {
		return (EAttribute) vjournalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVjournal_Uid() {
		return (EAttribute) vjournalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVjournal_Dtstart() {
		return (EAttribute) vjournalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVjournal_Description() {
		return (EAttribute) vjournalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVjournal_Summuary() {
		return (EAttribute) vjournalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVevent() {
		return veventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVevent_Alarm() {
		return (EReference) veventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVevent_Description() {
		return (EAttribute) veventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVevent_Uid() {
		return (EAttribute) veventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVevent_Dtstamp() {
		return (EAttribute) veventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVevent_Dtstart() {
		return (EAttribute) veventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVevent_Dtend() {
		return (EAttribute) veventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVevent_Duration() {
		return (EAttribute) veventEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVtimezone() {
		return vtimezoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVtimezone_Standard() {
		return (EReference) vtimezoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVtimezone_Tzid() {
		return (EAttribute) vtimezoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVtimezone_Last_mod() {
		return (EAttribute) vtimezoneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVtimezone_Tzurl() {
		return (EAttribute) vtimezoneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVtimezone_Daylight() {
		return (EReference) vtimezoneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreebusy() {
		return freebusyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreebusy_Uid() {
		return (EAttribute) freebusyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreebusy_Dtstamp() {
		return (EAttribute) freebusyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreebusy_Dtstart() {
		return (EAttribute) freebusyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreebusy_Dtend() {
		return (EAttribute) freebusyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreebusy_Attendee() {
		return (EAttribute) freebusyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreebusy_Organizer() {
		return (EAttribute) freebusyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandard() {
		return standardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaylight() {
		return daylightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProectCalendarFactory getProectCalendarFactory() {
		return (ProectCalendarFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		vcalendarEClass = createEClass(VCALENDAR);
		createEReference(vcalendarEClass, VCALENDAR__TODO);
		createEReference(vcalendarEClass, VCALENDAR__JOURNAL);
		createEReference(vcalendarEClass, VCALENDAR__EVENT);
		createEReference(vcalendarEClass, VCALENDAR__TIMEZONE);
		createEReference(vcalendarEClass, VCALENDAR__FREEBUSY);
		createEAttribute(vcalendarEClass, VCALENDAR__VERSION);
		createEAttribute(vcalendarEClass, VCALENDAR__PRODID);

		vtodoEClass = createEClass(VTODO);
		createEReference(vtodoEClass, VTODO__ALARM);
		createEAttribute(vtodoEClass, VTODO__DTSTAMP);
		createEAttribute(vtodoEClass, VTODO__UID);
		createEAttribute(vtodoEClass, VTODO__CLASS);
		createEAttribute(vtodoEClass, VTODO__COMPLETED);
		createEAttribute(vtodoEClass, VTODO__CREATED);
		createEAttribute(vtodoEClass, VTODO__DESCRIPTION);
		createEAttribute(vtodoEClass, VTODO__STATUS);

		valarmEClass = createEClass(VALARM);
		createEAttribute(valarmEClass, VALARM__ACTION);
		createEAttribute(valarmEClass, VALARM__TRIGGER);
		createEAttribute(valarmEClass, VALARM__DURATION);
		createEAttribute(valarmEClass, VALARM__REPEAT);
		createEAttribute(valarmEClass, VALARM__DESCRIPTION);

		vjournalEClass = createEClass(VJOURNAL);
		createEAttribute(vjournalEClass, VJOURNAL__DTSTAMP);
		createEAttribute(vjournalEClass, VJOURNAL__UID);
		createEAttribute(vjournalEClass, VJOURNAL__DTSTART);
		createEAttribute(vjournalEClass, VJOURNAL__DESCRIPTION);
		createEAttribute(vjournalEClass, VJOURNAL__SUMMUARY);

		veventEClass = createEClass(VEVENT);
		createEReference(veventEClass, VEVENT__ALARM);
		createEAttribute(veventEClass, VEVENT__DESCRIPTION);
		createEAttribute(veventEClass, VEVENT__UID);
		createEAttribute(veventEClass, VEVENT__DTSTAMP);
		createEAttribute(veventEClass, VEVENT__DTSTART);
		createEAttribute(veventEClass, VEVENT__DTEND);
		createEAttribute(veventEClass, VEVENT__DURATION);

		vtimezoneEClass = createEClass(VTIMEZONE);
		createEReference(vtimezoneEClass, VTIMEZONE__STANDARD);
		createEAttribute(vtimezoneEClass, VTIMEZONE__TZID);
		createEAttribute(vtimezoneEClass, VTIMEZONE__LAST_MOD);
		createEAttribute(vtimezoneEClass, VTIMEZONE__TZURL);
		createEReference(vtimezoneEClass, VTIMEZONE__DAYLIGHT);

		freebusyEClass = createEClass(FREEBUSY);
		createEAttribute(freebusyEClass, FREEBUSY__UID);
		createEAttribute(freebusyEClass, FREEBUSY__DTSTAMP);
		createEAttribute(freebusyEClass, FREEBUSY__DTSTART);
		createEAttribute(freebusyEClass, FREEBUSY__DTEND);
		createEAttribute(freebusyEClass, FREEBUSY__ATTENDEE);
		createEAttribute(freebusyEClass, FREEBUSY__ORGANIZER);

		standardEClass = createEClass(STANDARD);

		daylightEClass = createEClass(DAYLIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(vcalendarEClass, Vcalendar.class, "Vcalendar", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVcalendar_Todo(), this.getVtodo(), null, "todo", null, 0, -1, Vcalendar.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getVcalendar_Journal(), this.getVjournal(), null, "journal", null, 0, -1, Vcalendar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVcalendar_Event(), this.getVevent(), null, "event", null, 0, -1, Vcalendar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVcalendar_Timezone(), this.getVtimezone(), null, "timezone", null, 0, -1, Vcalendar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVcalendar_Freebusy(), this.getFreebusy(), null, "freebusy", null, 0, -1, Vcalendar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVcalendar_Version(), ecorePackage.getEString(), "version", null, 1, 1, Vcalendar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVcalendar_Prodid(), ecorePackage.getEString(), "prodid", null, 0, 1, Vcalendar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vtodoEClass, Vtodo.class, "Vtodo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVtodo_Alarm(), this.getValarm(), null, "alarm", null, 0, -1, Vtodo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getVtodo_Dtstamp(), ecorePackage.getEString(), "dtstamp", null, 1, 1, Vtodo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVtodo_Uid(), ecorePackage.getEString(), "uid", null, 1, 1, Vtodo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVtodo_Class(), ecorePackage.getEString(), "class", null, 0, 1, Vtodo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVtodo_Completed(), ecorePackage.getEString(), "completed", null, 0, 1, Vtodo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVtodo_Created(), ecorePackage.getEString(), "created", null, 0, 1, Vtodo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVtodo_Description(), ecorePackage.getEString(), "description", null, 0, 1, Vtodo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVtodo_Status(), ecorePackage.getEString(), "status", null, 0, 1, Vtodo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valarmEClass, Valarm.class, "Valarm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValarm_Action(), ecorePackage.getEString(), "action", null, 1, 1, Valarm.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValarm_Trigger(), ecorePackage.getEString(), "trigger", null, 1, 1, Valarm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValarm_Duration(), ecorePackage.getEString(), "duration", null, 0, 1, Valarm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValarm_Repeat(), ecorePackage.getEShort(), "repeat", null, 0, 1, Valarm.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValarm_Description(), ecorePackage.getEString(), "description", null, 0, 1, Valarm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vjournalEClass, Vjournal.class, "Vjournal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVjournal_Dtstamp(), ecorePackage.getEString(), "dtstamp", null, 1, 1, Vjournal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVjournal_Uid(), ecorePackage.getEString(), "uid", null, 1, 1, Vjournal.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVjournal_Dtstart(), ecorePackage.getEString(), "dtstart", null, 0, 1, Vjournal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVjournal_Description(), ecorePackage.getEString(), "description", null, 0, 1, Vjournal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVjournal_Summuary(), ecorePackage.getEString(), "summuary", null, 0, 1, Vjournal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(veventEClass, Vevent.class, "Vevent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVevent_Alarm(), this.getValarm(), null, "alarm", null, 0, -1, Vevent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getVevent_Description(), ecorePackage.getEString(), "description", null, 0, 1, Vevent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVevent_Uid(), ecorePackage.getEString(), "uid", null, 1, 1, Vevent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVevent_Dtstamp(), ecorePackage.getEString(), "dtstamp", null, 1, 1, Vevent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVevent_Dtstart(), ecorePackage.getEString(), "dtstart", null, 0, 1, Vevent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVevent_Dtend(), ecorePackage.getEString(), "dtend", null, 0, 1, Vevent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVevent_Duration(), ecorePackage.getEString(), "duration", null, 0, 1, Vevent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vtimezoneEClass, Vtimezone.class, "Vtimezone", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVtimezone_Standard(), this.getStandard(), null, "standard", null, 0, -1, Vtimezone.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVtimezone_Tzid(), ecorePackage.getEString(), "tzid", null, 1, 1, Vtimezone.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVtimezone_Last_mod(), ecorePackage.getEString(), "last_mod", null, 0, 1, Vtimezone.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVtimezone_Tzurl(), ecorePackage.getEString(), "tzurl", null, 0, 1, Vtimezone.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVtimezone_Daylight(), this.getDaylight(), null, "daylight", null, 0, -1, Vtimezone.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(freebusyEClass, Freebusy.class, "Freebusy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFreebusy_Uid(), ecorePackage.getEString(), "uid", null, 1, 1, Freebusy.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreebusy_Dtstamp(), ecorePackage.getEString(), "dtstamp", null, 1, 1, Freebusy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreebusy_Dtstart(), ecorePackage.getEString(), "dtstart", null, 0, 1, Freebusy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreebusy_Dtend(), ecorePackage.getEString(), "dtend", null, 0, 1, Freebusy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreebusy_Attendee(), ecorePackage.getEString(), "attendee", null, 0, 1, Freebusy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreebusy_Organizer(), ecorePackage.getEString(), "organizer", null, 0, 1, Freebusy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardEClass, Standard.class, "Standard", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(daylightEClass, Daylight.class, "Daylight", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ProectCalendarPackageImpl
