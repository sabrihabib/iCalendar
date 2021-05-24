/**
 */
package proectCalendar.impl;

import java.lang.reflect.InvocationTargetException;
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
import proectCalendar.VcalendarVisitor;
import proectCalendar.Vtodo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vtodo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proectCalendar.impl.VtodoImpl#getAlarm <em>Alarm</em>}</li>
 *   <li>{@link proectCalendar.impl.VtodoImpl#getDtstamp <em>Dtstamp</em>}</li>
 *   <li>{@link proectCalendar.impl.VtodoImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link proectCalendar.impl.VtodoImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link proectCalendar.impl.VtodoImpl#getCompleted <em>Completed</em>}</li>
 *   <li>{@link proectCalendar.impl.VtodoImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link proectCalendar.impl.VtodoImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link proectCalendar.impl.VtodoImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VtodoImpl extends MinimalEObjectImpl.Container implements Vtodo {
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
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompleted() <em>Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleted()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompleted() <em>Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleted()
	 * @generated
	 * @ordered
	 */
	protected String completed = COMPLETED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected String created = CREATED_EDEFAULT;

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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VtodoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProectCalendarPackage.Literals.VTODO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Valarm> getAlarm() {
		if (alarm == null) {
			alarm = new EObjectContainmentEList<Valarm>(Valarm.class, this, ProectCalendarPackage.VTODO__ALARM);
		}
		return alarm;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VTODO__DTSTAMP, oldDtstamp,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VTODO__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VTODO__CLASS, oldClass,
					class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompleted() {
		return completed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleted(String newCompleted) {
		String oldCompleted = completed;
		completed = newCompleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VTODO__COMPLETED, oldCompleted,
					completed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(String newCreated) {
		String oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VTODO__CREATED, oldCreated,
					created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VTODO__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VTODO__STATUS, oldStatus,
					status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(VcalendarVisitor visitor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProectCalendarPackage.VTODO__ALARM:
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
		case ProectCalendarPackage.VTODO__ALARM:
			return getAlarm();
		case ProectCalendarPackage.VTODO__DTSTAMP:
			return getDtstamp();
		case ProectCalendarPackage.VTODO__UID:
			return getUid();
		case ProectCalendarPackage.VTODO__CLASS:
			return getClass_();
		case ProectCalendarPackage.VTODO__COMPLETED:
			return getCompleted();
		case ProectCalendarPackage.VTODO__CREATED:
			return getCreated();
		case ProectCalendarPackage.VTODO__DESCRIPTION:
			return getDescription();
		case ProectCalendarPackage.VTODO__STATUS:
			return getStatus();
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
		case ProectCalendarPackage.VTODO__ALARM:
			getAlarm().clear();
			getAlarm().addAll((Collection<? extends Valarm>) newValue);
			return;
		case ProectCalendarPackage.VTODO__DTSTAMP:
			setDtstamp((String) newValue);
			return;
		case ProectCalendarPackage.VTODO__UID:
			setUid((String) newValue);
			return;
		case ProectCalendarPackage.VTODO__CLASS:
			setClass((String) newValue);
			return;
		case ProectCalendarPackage.VTODO__COMPLETED:
			setCompleted((String) newValue);
			return;
		case ProectCalendarPackage.VTODO__CREATED:
			setCreated((String) newValue);
			return;
		case ProectCalendarPackage.VTODO__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ProectCalendarPackage.VTODO__STATUS:
			setStatus((String) newValue);
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
		case ProectCalendarPackage.VTODO__ALARM:
			getAlarm().clear();
			return;
		case ProectCalendarPackage.VTODO__DTSTAMP:
			setDtstamp(DTSTAMP_EDEFAULT);
			return;
		case ProectCalendarPackage.VTODO__UID:
			setUid(UID_EDEFAULT);
			return;
		case ProectCalendarPackage.VTODO__CLASS:
			setClass(CLASS_EDEFAULT);
			return;
		case ProectCalendarPackage.VTODO__COMPLETED:
			setCompleted(COMPLETED_EDEFAULT);
			return;
		case ProectCalendarPackage.VTODO__CREATED:
			setCreated(CREATED_EDEFAULT);
			return;
		case ProectCalendarPackage.VTODO__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ProectCalendarPackage.VTODO__STATUS:
			setStatus(STATUS_EDEFAULT);
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
		case ProectCalendarPackage.VTODO__ALARM:
			return alarm != null && !alarm.isEmpty();
		case ProectCalendarPackage.VTODO__DTSTAMP:
			return DTSTAMP_EDEFAULT == null ? dtstamp != null : !DTSTAMP_EDEFAULT.equals(dtstamp);
		case ProectCalendarPackage.VTODO__UID:
			return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
		case ProectCalendarPackage.VTODO__CLASS:
			return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
		case ProectCalendarPackage.VTODO__COMPLETED:
			return COMPLETED_EDEFAULT == null ? completed != null : !COMPLETED_EDEFAULT.equals(completed);
		case ProectCalendarPackage.VTODO__CREATED:
			return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
		case ProectCalendarPackage.VTODO__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ProectCalendarPackage.VTODO__STATUS:
			return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ProectCalendarPackage.VTODO___ACCEPT__VCALENDARVISITOR:
			accept((VcalendarVisitor) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", class: ");
		result.append(class_);
		result.append(", completed: ");
		result.append(completed);
		result.append(", created: ");
		result.append(created);
		result.append(", description: ");
		result.append(description);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //VtodoImpl
