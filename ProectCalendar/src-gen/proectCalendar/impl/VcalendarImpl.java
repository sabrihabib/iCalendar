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

import proectCalendar.Freebusy;
import proectCalendar.ProectCalendarPackage;
import proectCalendar.Vcalendar;
import proectCalendar.Vevent;
import proectCalendar.Vjournal;
import proectCalendar.Vtimezone;
import proectCalendar.Vtodo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vcalendar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proectCalendar.impl.VcalendarImpl#getTodo <em>Todo</em>}</li>
 *   <li>{@link proectCalendar.impl.VcalendarImpl#getJournal <em>Journal</em>}</li>
 *   <li>{@link proectCalendar.impl.VcalendarImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link proectCalendar.impl.VcalendarImpl#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link proectCalendar.impl.VcalendarImpl#getFreebusy <em>Freebusy</em>}</li>
 *   <li>{@link proectCalendar.impl.VcalendarImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link proectCalendar.impl.VcalendarImpl#getProdid <em>Prodid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VcalendarImpl extends MinimalEObjectImpl.Container implements Vcalendar {
	/**
	 * The cached value of the '{@link #getTodo() <em>Todo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTodo()
	 * @generated
	 * @ordered
	 */
	protected EList<Vtodo> todo;

	/**
	 * The cached value of the '{@link #getJournal() <em>Journal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournal()
	 * @generated
	 * @ordered
	 */
	protected EList<Vjournal> journal;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Vevent> event;

	/**
	 * The cached value of the '{@link #getTimezone() <em>Timezone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezone()
	 * @generated
	 * @ordered
	 */
	protected EList<Vtimezone> timezone;

	/**
	 * The cached value of the '{@link #getFreebusy() <em>Freebusy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreebusy()
	 * @generated
	 * @ordered
	 */
	protected EList<Freebusy> freebusy;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProdid() <em>Prodid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdid()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProdid() <em>Prodid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdid()
	 * @generated
	 * @ordered
	 */
	protected String prodid = PRODID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VcalendarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProectCalendarPackage.Literals.VCALENDAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vtodo> getTodo() {
		if (todo == null) {
			todo = new EObjectContainmentEList<Vtodo>(Vtodo.class, this, ProectCalendarPackage.VCALENDAR__TODO);
		}
		return todo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vjournal> getJournal() {
		if (journal == null) {
			journal = new EObjectContainmentEList<Vjournal>(Vjournal.class, this,
					ProectCalendarPackage.VCALENDAR__JOURNAL);
		}
		return journal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vevent> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<Vevent>(Vevent.class, this, ProectCalendarPackage.VCALENDAR__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vtimezone> getTimezone() {
		if (timezone == null) {
			timezone = new EObjectContainmentEList<Vtimezone>(Vtimezone.class, this,
					ProectCalendarPackage.VCALENDAR__TIMEZONE);
		}
		return timezone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Freebusy> getFreebusy() {
		if (freebusy == null) {
			freebusy = new EObjectContainmentEList<Freebusy>(Freebusy.class, this,
					ProectCalendarPackage.VCALENDAR__FREEBUSY);
		}
		return freebusy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VCALENDAR__VERSION, oldVersion,
					version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProdid() {
		return prodid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProdid(String newProdid) {
		String oldProdid = prodid;
		prodid = newProdid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VCALENDAR__PRODID, oldProdid,
					prodid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProectCalendarPackage.VCALENDAR__TODO:
			return ((InternalEList<?>) getTodo()).basicRemove(otherEnd, msgs);
		case ProectCalendarPackage.VCALENDAR__JOURNAL:
			return ((InternalEList<?>) getJournal()).basicRemove(otherEnd, msgs);
		case ProectCalendarPackage.VCALENDAR__EVENT:
			return ((InternalEList<?>) getEvent()).basicRemove(otherEnd, msgs);
		case ProectCalendarPackage.VCALENDAR__TIMEZONE:
			return ((InternalEList<?>) getTimezone()).basicRemove(otherEnd, msgs);
		case ProectCalendarPackage.VCALENDAR__FREEBUSY:
			return ((InternalEList<?>) getFreebusy()).basicRemove(otherEnd, msgs);
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
		case ProectCalendarPackage.VCALENDAR__TODO:
			return getTodo();
		case ProectCalendarPackage.VCALENDAR__JOURNAL:
			return getJournal();
		case ProectCalendarPackage.VCALENDAR__EVENT:
			return getEvent();
		case ProectCalendarPackage.VCALENDAR__TIMEZONE:
			return getTimezone();
		case ProectCalendarPackage.VCALENDAR__FREEBUSY:
			return getFreebusy();
		case ProectCalendarPackage.VCALENDAR__VERSION:
			return getVersion();
		case ProectCalendarPackage.VCALENDAR__PRODID:
			return getProdid();
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
		case ProectCalendarPackage.VCALENDAR__TODO:
			getTodo().clear();
			getTodo().addAll((Collection<? extends Vtodo>) newValue);
			return;
		case ProectCalendarPackage.VCALENDAR__JOURNAL:
			getJournal().clear();
			getJournal().addAll((Collection<? extends Vjournal>) newValue);
			return;
		case ProectCalendarPackage.VCALENDAR__EVENT:
			getEvent().clear();
			getEvent().addAll((Collection<? extends Vevent>) newValue);
			return;
		case ProectCalendarPackage.VCALENDAR__TIMEZONE:
			getTimezone().clear();
			getTimezone().addAll((Collection<? extends Vtimezone>) newValue);
			return;
		case ProectCalendarPackage.VCALENDAR__FREEBUSY:
			getFreebusy().clear();
			getFreebusy().addAll((Collection<? extends Freebusy>) newValue);
			return;
		case ProectCalendarPackage.VCALENDAR__VERSION:
			setVersion((String) newValue);
			return;
		case ProectCalendarPackage.VCALENDAR__PRODID:
			setProdid((String) newValue);
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
		case ProectCalendarPackage.VCALENDAR__TODO:
			getTodo().clear();
			return;
		case ProectCalendarPackage.VCALENDAR__JOURNAL:
			getJournal().clear();
			return;
		case ProectCalendarPackage.VCALENDAR__EVENT:
			getEvent().clear();
			return;
		case ProectCalendarPackage.VCALENDAR__TIMEZONE:
			getTimezone().clear();
			return;
		case ProectCalendarPackage.VCALENDAR__FREEBUSY:
			getFreebusy().clear();
			return;
		case ProectCalendarPackage.VCALENDAR__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case ProectCalendarPackage.VCALENDAR__PRODID:
			setProdid(PRODID_EDEFAULT);
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
		case ProectCalendarPackage.VCALENDAR__TODO:
			return todo != null && !todo.isEmpty();
		case ProectCalendarPackage.VCALENDAR__JOURNAL:
			return journal != null && !journal.isEmpty();
		case ProectCalendarPackage.VCALENDAR__EVENT:
			return event != null && !event.isEmpty();
		case ProectCalendarPackage.VCALENDAR__TIMEZONE:
			return timezone != null && !timezone.isEmpty();
		case ProectCalendarPackage.VCALENDAR__FREEBUSY:
			return freebusy != null && !freebusy.isEmpty();
		case ProectCalendarPackage.VCALENDAR__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case ProectCalendarPackage.VCALENDAR__PRODID:
			return PRODID_EDEFAULT == null ? prodid != null : !PRODID_EDEFAULT.equals(prodid);
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
		result.append(" (version: ");
		result.append(version);
		result.append(", prodid: ");
		result.append(prodid);
		result.append(')');
		return result.toString();
	}

} //VcalendarImpl
