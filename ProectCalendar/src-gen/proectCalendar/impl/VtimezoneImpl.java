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

import proectCalendar.Daylight;
import proectCalendar.ProectCalendarPackage;
import proectCalendar.Standard;
import proectCalendar.Vtimezone;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vtimezone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proectCalendar.impl.VtimezoneImpl#getStandard <em>Standard</em>}</li>
 *   <li>{@link proectCalendar.impl.VtimezoneImpl#getTzid <em>Tzid</em>}</li>
 *   <li>{@link proectCalendar.impl.VtimezoneImpl#getLast_mod <em>Last mod</em>}</li>
 *   <li>{@link proectCalendar.impl.VtimezoneImpl#getTzurl <em>Tzurl</em>}</li>
 *   <li>{@link proectCalendar.impl.VtimezoneImpl#getDaylight <em>Daylight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VtimezoneImpl extends MinimalEObjectImpl.Container implements Vtimezone {
	/**
	 * The cached value of the '{@link #getStandard() <em>Standard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandard()
	 * @generated
	 * @ordered
	 */
	protected EList<Standard> standard;

	/**
	 * The default value of the '{@link #getTzid() <em>Tzid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTzid()
	 * @generated
	 * @ordered
	 */
	protected static final String TZID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTzid() <em>Tzid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTzid()
	 * @generated
	 * @ordered
	 */
	protected String tzid = TZID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLast_mod() <em>Last mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast_mod()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLast_mod() <em>Last mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast_mod()
	 * @generated
	 * @ordered
	 */
	protected String last_mod = LAST_MOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTzurl() <em>Tzurl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTzurl()
	 * @generated
	 * @ordered
	 */
	protected static final String TZURL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTzurl() <em>Tzurl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTzurl()
	 * @generated
	 * @ordered
	 */
	protected String tzurl = TZURL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDaylight() <em>Daylight</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylight()
	 * @generated
	 * @ordered
	 */
	protected EList<Daylight> daylight;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VtimezoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProectCalendarPackage.Literals.VTIMEZONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Standard> getStandard() {
		if (standard == null) {
			standard = new EObjectContainmentEList<Standard>(Standard.class, this,
					ProectCalendarPackage.VTIMEZONE__STANDARD);
		}
		return standard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTzid() {
		return tzid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTzid(String newTzid) {
		String oldTzid = tzid;
		tzid = newTzid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VTIMEZONE__TZID, oldTzid,
					tzid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLast_mod() {
		return last_mod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLast_mod(String newLast_mod) {
		String oldLast_mod = last_mod;
		last_mod = newLast_mod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VTIMEZONE__LAST_MOD,
					oldLast_mod, last_mod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTzurl() {
		return tzurl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTzurl(String newTzurl) {
		String oldTzurl = tzurl;
		tzurl = newTzurl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VTIMEZONE__TZURL, oldTzurl,
					tzurl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Daylight> getDaylight() {
		if (daylight == null) {
			daylight = new EObjectContainmentEList<Daylight>(Daylight.class, this,
					ProectCalendarPackage.VTIMEZONE__DAYLIGHT);
		}
		return daylight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProectCalendarPackage.VTIMEZONE__STANDARD:
			return ((InternalEList<?>) getStandard()).basicRemove(otherEnd, msgs);
		case ProectCalendarPackage.VTIMEZONE__DAYLIGHT:
			return ((InternalEList<?>) getDaylight()).basicRemove(otherEnd, msgs);
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
		case ProectCalendarPackage.VTIMEZONE__STANDARD:
			return getStandard();
		case ProectCalendarPackage.VTIMEZONE__TZID:
			return getTzid();
		case ProectCalendarPackage.VTIMEZONE__LAST_MOD:
			return getLast_mod();
		case ProectCalendarPackage.VTIMEZONE__TZURL:
			return getTzurl();
		case ProectCalendarPackage.VTIMEZONE__DAYLIGHT:
			return getDaylight();
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
		case ProectCalendarPackage.VTIMEZONE__STANDARD:
			getStandard().clear();
			getStandard().addAll((Collection<? extends Standard>) newValue);
			return;
		case ProectCalendarPackage.VTIMEZONE__TZID:
			setTzid((String) newValue);
			return;
		case ProectCalendarPackage.VTIMEZONE__LAST_MOD:
			setLast_mod((String) newValue);
			return;
		case ProectCalendarPackage.VTIMEZONE__TZURL:
			setTzurl((String) newValue);
			return;
		case ProectCalendarPackage.VTIMEZONE__DAYLIGHT:
			getDaylight().clear();
			getDaylight().addAll((Collection<? extends Daylight>) newValue);
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
		case ProectCalendarPackage.VTIMEZONE__STANDARD:
			getStandard().clear();
			return;
		case ProectCalendarPackage.VTIMEZONE__TZID:
			setTzid(TZID_EDEFAULT);
			return;
		case ProectCalendarPackage.VTIMEZONE__LAST_MOD:
			setLast_mod(LAST_MOD_EDEFAULT);
			return;
		case ProectCalendarPackage.VTIMEZONE__TZURL:
			setTzurl(TZURL_EDEFAULT);
			return;
		case ProectCalendarPackage.VTIMEZONE__DAYLIGHT:
			getDaylight().clear();
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
		case ProectCalendarPackage.VTIMEZONE__STANDARD:
			return standard != null && !standard.isEmpty();
		case ProectCalendarPackage.VTIMEZONE__TZID:
			return TZID_EDEFAULT == null ? tzid != null : !TZID_EDEFAULT.equals(tzid);
		case ProectCalendarPackage.VTIMEZONE__LAST_MOD:
			return LAST_MOD_EDEFAULT == null ? last_mod != null : !LAST_MOD_EDEFAULT.equals(last_mod);
		case ProectCalendarPackage.VTIMEZONE__TZURL:
			return TZURL_EDEFAULT == null ? tzurl != null : !TZURL_EDEFAULT.equals(tzurl);
		case ProectCalendarPackage.VTIMEZONE__DAYLIGHT:
			return daylight != null && !daylight.isEmpty();
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
		result.append(" (tzid: ");
		result.append(tzid);
		result.append(", last_mod: ");
		result.append(last_mod);
		result.append(", tzurl: ");
		result.append(tzurl);
		result.append(')');
		return result.toString();
	}

} //VtimezoneImpl
