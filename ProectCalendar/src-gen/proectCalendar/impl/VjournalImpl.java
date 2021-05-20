/**
 */
package proectCalendar.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import proectCalendar.ProectCalendarPackage;
import proectCalendar.Vjournal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vjournal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proectCalendar.impl.VjournalImpl#getDtstamp <em>Dtstamp</em>}</li>
 *   <li>{@link proectCalendar.impl.VjournalImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link proectCalendar.impl.VjournalImpl#getDtstart <em>Dtstart</em>}</li>
 *   <li>{@link proectCalendar.impl.VjournalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link proectCalendar.impl.VjournalImpl#getSummuary <em>Summuary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VjournalImpl extends MinimalEObjectImpl.Container implements Vjournal {
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
	 * The default value of the '{@link #getSummuary() <em>Summuary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummuary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMUARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummuary() <em>Summuary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummuary()
	 * @generated
	 * @ordered
	 */
	protected String summuary = SUMMUARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VjournalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProectCalendarPackage.Literals.VJOURNAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VJOURNAL__DTSTAMP, oldDtstamp,
					dtstamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VJOURNAL__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VJOURNAL__DTSTART, oldDtstart,
					dtstart));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VJOURNAL__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummuary() {
		return summuary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummuary(String newSummuary) {
		String oldSummuary = summuary;
		summuary = newSummuary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VJOURNAL__SUMMUARY, oldSummuary,
					summuary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProectCalendarPackage.VJOURNAL__DTSTAMP:
			return getDtstamp();
		case ProectCalendarPackage.VJOURNAL__UID:
			return getUid();
		case ProectCalendarPackage.VJOURNAL__DTSTART:
			return getDtstart();
		case ProectCalendarPackage.VJOURNAL__DESCRIPTION:
			return getDescription();
		case ProectCalendarPackage.VJOURNAL__SUMMUARY:
			return getSummuary();
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
		case ProectCalendarPackage.VJOURNAL__DTSTAMP:
			setDtstamp((String) newValue);
			return;
		case ProectCalendarPackage.VJOURNAL__UID:
			setUid((String) newValue);
			return;
		case ProectCalendarPackage.VJOURNAL__DTSTART:
			setDtstart((String) newValue);
			return;
		case ProectCalendarPackage.VJOURNAL__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ProectCalendarPackage.VJOURNAL__SUMMUARY:
			setSummuary((String) newValue);
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
		case ProectCalendarPackage.VJOURNAL__DTSTAMP:
			setDtstamp(DTSTAMP_EDEFAULT);
			return;
		case ProectCalendarPackage.VJOURNAL__UID:
			setUid(UID_EDEFAULT);
			return;
		case ProectCalendarPackage.VJOURNAL__DTSTART:
			setDtstart(DTSTART_EDEFAULT);
			return;
		case ProectCalendarPackage.VJOURNAL__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ProectCalendarPackage.VJOURNAL__SUMMUARY:
			setSummuary(SUMMUARY_EDEFAULT);
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
		case ProectCalendarPackage.VJOURNAL__DTSTAMP:
			return DTSTAMP_EDEFAULT == null ? dtstamp != null : !DTSTAMP_EDEFAULT.equals(dtstamp);
		case ProectCalendarPackage.VJOURNAL__UID:
			return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
		case ProectCalendarPackage.VJOURNAL__DTSTART:
			return DTSTART_EDEFAULT == null ? dtstart != null : !DTSTART_EDEFAULT.equals(dtstart);
		case ProectCalendarPackage.VJOURNAL__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ProectCalendarPackage.VJOURNAL__SUMMUARY:
			return SUMMUARY_EDEFAULT == null ? summuary != null : !SUMMUARY_EDEFAULT.equals(summuary);
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
		result.append(" (dtstamp: ");
		result.append(dtstamp);
		result.append(", uid: ");
		result.append(uid);
		result.append(", dtstart: ");
		result.append(dtstart);
		result.append(", description: ");
		result.append(description);
		result.append(", summuary: ");
		result.append(summuary);
		result.append(')');
		return result.toString();
	}

} //VjournalImpl
