/**
 */
package proectCalendar.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import proectCalendar.Freebusy;
import proectCalendar.ProectCalendarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Freebusy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proectCalendar.impl.FreebusyImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link proectCalendar.impl.FreebusyImpl#getDtstamp <em>Dtstamp</em>}</li>
 *   <li>{@link proectCalendar.impl.FreebusyImpl#getDtstart <em>Dtstart</em>}</li>
 *   <li>{@link proectCalendar.impl.FreebusyImpl#getDtend <em>Dtend</em>}</li>
 *   <li>{@link proectCalendar.impl.FreebusyImpl#getAttendee <em>Attendee</em>}</li>
 *   <li>{@link proectCalendar.impl.FreebusyImpl#getOrganizer <em>Organizer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FreebusyImpl extends MinimalEObjectImpl.Container implements Freebusy {
	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected String uid = UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDtstamp() <em>Dtstamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtstamp()
	 * @generated
	 * @ordered
	 */
	protected static final String DTSTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDtstamp() <em>Dtstamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtstamp()
	 * @generated
	 * @ordered
	 */
	protected String dtstamp = DTSTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDtstart() <em>Dtstart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtstart()
	 * @generated
	 * @ordered
	 */
	protected static final String DTSTART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDtstart() <em>Dtstart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtstart()
	 * @generated
	 * @ordered
	 */
	protected String dtstart = DTSTART_EDEFAULT;

	/**
	 * The default value of the '{@link #getDtend() <em>Dtend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtend()
	 * @generated
	 * @ordered
	 */
	protected static final String DTEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDtend() <em>Dtend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtend()
	 * @generated
	 * @ordered
	 */
	protected String dtend = DTEND_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttendee() <em>Attendee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttendee()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTENDEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttendee() <em>Attendee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttendee()
	 * @generated
	 * @ordered
	 */
	protected String attendee = ATTENDEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganizer() <em>Organizer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizer()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizer() <em>Organizer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizer()
	 * @generated
	 * @ordered
	 */
	protected String organizer = ORGANIZER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreebusyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProectCalendarPackage.Literals.FREEBUSY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.FREEBUSY__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDtstamp() {
		return dtstamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDtstamp(String newDtstamp) {
		String oldDtstamp = dtstamp;
		dtstamp = newDtstamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.FREEBUSY__DTSTAMP, oldDtstamp,
					dtstamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDtstart() {
		return dtstart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDtstart(String newDtstart) {
		String oldDtstart = dtstart;
		dtstart = newDtstart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.FREEBUSY__DTSTART, oldDtstart,
					dtstart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDtend() {
		return dtend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDtend(String newDtend) {
		String oldDtend = dtend;
		dtend = newDtend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.FREEBUSY__DTEND, oldDtend,
					dtend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttendee() {
		return attendee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttendee(String newAttendee) {
		String oldAttendee = attendee;
		attendee = newAttendee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.FREEBUSY__ATTENDEE, oldAttendee,
					attendee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizer() {
		return organizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizer(String newOrganizer) {
		String oldOrganizer = organizer;
		organizer = newOrganizer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.FREEBUSY__ORGANIZER,
					oldOrganizer, organizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProectCalendarPackage.FREEBUSY__UID:
			return getUid();
		case ProectCalendarPackage.FREEBUSY__DTSTAMP:
			return getDtstamp();
		case ProectCalendarPackage.FREEBUSY__DTSTART:
			return getDtstart();
		case ProectCalendarPackage.FREEBUSY__DTEND:
			return getDtend();
		case ProectCalendarPackage.FREEBUSY__ATTENDEE:
			return getAttendee();
		case ProectCalendarPackage.FREEBUSY__ORGANIZER:
			return getOrganizer();
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
		case ProectCalendarPackage.FREEBUSY__UID:
			setUid((String) newValue);
			return;
		case ProectCalendarPackage.FREEBUSY__DTSTAMP:
			setDtstamp((String) newValue);
			return;
		case ProectCalendarPackage.FREEBUSY__DTSTART:
			setDtstart((String) newValue);
			return;
		case ProectCalendarPackage.FREEBUSY__DTEND:
			setDtend((String) newValue);
			return;
		case ProectCalendarPackage.FREEBUSY__ATTENDEE:
			setAttendee((String) newValue);
			return;
		case ProectCalendarPackage.FREEBUSY__ORGANIZER:
			setOrganizer((String) newValue);
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
		case ProectCalendarPackage.FREEBUSY__UID:
			setUid(UID_EDEFAULT);
			return;
		case ProectCalendarPackage.FREEBUSY__DTSTAMP:
			setDtstamp(DTSTAMP_EDEFAULT);
			return;
		case ProectCalendarPackage.FREEBUSY__DTSTART:
			setDtstart(DTSTART_EDEFAULT);
			return;
		case ProectCalendarPackage.FREEBUSY__DTEND:
			setDtend(DTEND_EDEFAULT);
			return;
		case ProectCalendarPackage.FREEBUSY__ATTENDEE:
			setAttendee(ATTENDEE_EDEFAULT);
			return;
		case ProectCalendarPackage.FREEBUSY__ORGANIZER:
			setOrganizer(ORGANIZER_EDEFAULT);
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
		case ProectCalendarPackage.FREEBUSY__UID:
			return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
		case ProectCalendarPackage.FREEBUSY__DTSTAMP:
			return DTSTAMP_EDEFAULT == null ? dtstamp != null : !DTSTAMP_EDEFAULT.equals(dtstamp);
		case ProectCalendarPackage.FREEBUSY__DTSTART:
			return DTSTART_EDEFAULT == null ? dtstart != null : !DTSTART_EDEFAULT.equals(dtstart);
		case ProectCalendarPackage.FREEBUSY__DTEND:
			return DTEND_EDEFAULT == null ? dtend != null : !DTEND_EDEFAULT.equals(dtend);
		case ProectCalendarPackage.FREEBUSY__ATTENDEE:
			return ATTENDEE_EDEFAULT == null ? attendee != null : !ATTENDEE_EDEFAULT.equals(attendee);
		case ProectCalendarPackage.FREEBUSY__ORGANIZER:
			return ORGANIZER_EDEFAULT == null ? organizer != null : !ORGANIZER_EDEFAULT.equals(organizer);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uid: ");
		result.append(uid);
		result.append(", dtstamp: ");
		result.append(dtstamp);
		result.append(", dtstart: ");
		result.append(dtstart);
		result.append(", dtend: ");
		result.append(dtend);
		result.append(", attendee: ");
		result.append(attendee);
		result.append(", organizer: ");
		result.append(organizer);
		result.append(')');
		return result.toString();
	}

} //FreebusyImpl
