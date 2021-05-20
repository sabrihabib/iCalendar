/**
 */
package proectCalendar.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import proectCalendar.ProectCalendarPackage;
import proectCalendar.Valarm;
import proectCalendar.Vevent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vevent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proectCalendar.impl.VeventImpl#getAlarm <em>Alarm</em>}</li>
 *   <li>{@link proectCalendar.impl.VeventImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link proectCalendar.impl.VeventImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link proectCalendar.impl.VeventImpl#getDtstamp <em>Dtstamp</em>}</li>
 *   <li>{@link proectCalendar.impl.VeventImpl#getDtstart <em>Dtstart</em>}</li>
 *   <li>{@link proectCalendar.impl.VeventImpl#getDtend <em>Dtend</em>}</li>
 *   <li>{@link proectCalendar.impl.VeventImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VeventImpl extends MinimalEObjectImpl.Container implements Vevent {
	/**
	 * The cached value of the '{@link #getAlarm() <em>Alarm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarm()
	 * @generated
	 * @ordered
	 */
	protected EList<Valarm> alarm;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VeventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProectCalendarPackage.Literals.VEVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Valarm> getAlarm() {
		if (alarm == null) {
			alarm = new EObjectContainmentEList<Valarm>(Valarm.class, this, ProectCalendarPackage.VEVENT__ALARM);
		}
		return alarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VEVENT__DESCRIPTION,
					oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VEVENT__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VEVENT__DTSTAMP, oldDtstamp,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VEVENT__DTSTART, oldDtstart,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VEVENT__DTEND, oldDtend,
					dtend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VEVENT__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProectCalendarPackage.VEVENT__ALARM:
			return ((InternalEList<?>) getAlarm()).basicRemove(otherEnd, msgs);
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
		case ProectCalendarPackage.VEVENT__ALARM:
			return getAlarm();
		case ProectCalendarPackage.VEVENT__DESCRIPTION:
			return getDescription();
		case ProectCalendarPackage.VEVENT__UID:
			return getUid();
		case ProectCalendarPackage.VEVENT__DTSTAMP:
			return getDtstamp();
		case ProectCalendarPackage.VEVENT__DTSTART:
			return getDtstart();
		case ProectCalendarPackage.VEVENT__DTEND:
			return getDtend();
		case ProectCalendarPackage.VEVENT__DURATION:
			return getDuration();
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
		case ProectCalendarPackage.VEVENT__ALARM:
			getAlarm().clear();
			getAlarm().addAll((Collection<? extends Valarm>) newValue);
			return;
		case ProectCalendarPackage.VEVENT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ProectCalendarPackage.VEVENT__UID:
			setUid((String) newValue);
			return;
		case ProectCalendarPackage.VEVENT__DTSTAMP:
			setDtstamp((String) newValue);
			return;
		case ProectCalendarPackage.VEVENT__DTSTART:
			setDtstart((String) newValue);
			return;
		case ProectCalendarPackage.VEVENT__DTEND:
			setDtend((String) newValue);
			return;
		case ProectCalendarPackage.VEVENT__DURATION:
			setDuration((String) newValue);
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
		case ProectCalendarPackage.VEVENT__ALARM:
			getAlarm().clear();
			return;
		case ProectCalendarPackage.VEVENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ProectCalendarPackage.VEVENT__UID:
			setUid(UID_EDEFAULT);
			return;
		case ProectCalendarPackage.VEVENT__DTSTAMP:
			setDtstamp(DTSTAMP_EDEFAULT);
			return;
		case ProectCalendarPackage.VEVENT__DTSTART:
			setDtstart(DTSTART_EDEFAULT);
			return;
		case ProectCalendarPackage.VEVENT__DTEND:
			setDtend(DTEND_EDEFAULT);
			return;
		case ProectCalendarPackage.VEVENT__DURATION:
			setDuration(DURATION_EDEFAULT);
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
		case ProectCalendarPackage.VEVENT__ALARM:
			return alarm != null && !alarm.isEmpty();
		case ProectCalendarPackage.VEVENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ProectCalendarPackage.VEVENT__UID:
			return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
		case ProectCalendarPackage.VEVENT__DTSTAMP:
			return DTSTAMP_EDEFAULT == null ? dtstamp != null : !DTSTAMP_EDEFAULT.equals(dtstamp);
		case ProectCalendarPackage.VEVENT__DTSTART:
			return DTSTART_EDEFAULT == null ? dtstart != null : !DTSTART_EDEFAULT.equals(dtstart);
		case ProectCalendarPackage.VEVENT__DTEND:
			return DTEND_EDEFAULT == null ? dtend != null : !DTEND_EDEFAULT.equals(dtend);
		case ProectCalendarPackage.VEVENT__DURATION:
			return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", uid: ");
		result.append(uid);
		result.append(", dtstamp: ");
		result.append(dtstamp);
		result.append(", dtstart: ");
		result.append(dtstart);
		result.append(", dtend: ");
		result.append(dtend);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //VeventImpl
