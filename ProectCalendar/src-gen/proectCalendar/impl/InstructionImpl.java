/**
 */
package proectCalendar.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import proectCalendar.Freebusy;
import proectCalendar.Instruction;
import proectCalendar.ProectCalendarPackage;
import proectCalendar.VcalendarVisitor;
import proectCalendar.Vevent;
import proectCalendar.Vjournal;
import proectCalendar.Vtimezone;
import proectCalendar.Vtodo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proectCalendar.impl.InstructionImpl#getTodo <em>Todo</em>}</li>
 *   <li>{@link proectCalendar.impl.InstructionImpl#getJournal <em>Journal</em>}</li>
 *   <li>{@link proectCalendar.impl.InstructionImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link proectCalendar.impl.InstructionImpl#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link proectCalendar.impl.InstructionImpl#getFreebusy <em>Freebusy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstructionImpl extends MinimalEObjectImpl.Container implements Instruction {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProectCalendarPackage.Literals.INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vtodo> getTodo() {
		if (todo == null) {
			todo = new EObjectContainmentEList<Vtodo>(Vtodo.class, this, ProectCalendarPackage.INSTRUCTION__TODO);
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
					ProectCalendarPackage.INSTRUCTION__JOURNAL);
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
			event = new EObjectContainmentEList<Vevent>(Vevent.class, this, ProectCalendarPackage.INSTRUCTION__EVENT);
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
					ProectCalendarPackage.INSTRUCTION__TIMEZONE);
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
					ProectCalendarPackage.INSTRUCTION__FREEBUSY);
		}
		return freebusy;
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
		case ProectCalendarPackage.INSTRUCTION__TODO:
			return ((InternalEList<?>) getTodo()).basicRemove(otherEnd, msgs);
		case ProectCalendarPackage.INSTRUCTION__JOURNAL:
			return ((InternalEList<?>) getJournal()).basicRemove(otherEnd, msgs);
		case ProectCalendarPackage.INSTRUCTION__EVENT:
			return ((InternalEList<?>) getEvent()).basicRemove(otherEnd, msgs);
		case ProectCalendarPackage.INSTRUCTION__TIMEZONE:
			return ((InternalEList<?>) getTimezone()).basicRemove(otherEnd, msgs);
		case ProectCalendarPackage.INSTRUCTION__FREEBUSY:
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
		case ProectCalendarPackage.INSTRUCTION__TODO:
			return getTodo();
		case ProectCalendarPackage.INSTRUCTION__JOURNAL:
			return getJournal();
		case ProectCalendarPackage.INSTRUCTION__EVENT:
			return getEvent();
		case ProectCalendarPackage.INSTRUCTION__TIMEZONE:
			return getTimezone();
		case ProectCalendarPackage.INSTRUCTION__FREEBUSY:
			return getFreebusy();
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
		case ProectCalendarPackage.INSTRUCTION__TODO:
			getTodo().clear();
			getTodo().addAll((Collection<? extends Vtodo>) newValue);
			return;
		case ProectCalendarPackage.INSTRUCTION__JOURNAL:
			getJournal().clear();
			getJournal().addAll((Collection<? extends Vjournal>) newValue);
			return;
		case ProectCalendarPackage.INSTRUCTION__EVENT:
			getEvent().clear();
			getEvent().addAll((Collection<? extends Vevent>) newValue);
			return;
		case ProectCalendarPackage.INSTRUCTION__TIMEZONE:
			getTimezone().clear();
			getTimezone().addAll((Collection<? extends Vtimezone>) newValue);
			return;
		case ProectCalendarPackage.INSTRUCTION__FREEBUSY:
			getFreebusy().clear();
			getFreebusy().addAll((Collection<? extends Freebusy>) newValue);
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
		case ProectCalendarPackage.INSTRUCTION__TODO:
			getTodo().clear();
			return;
		case ProectCalendarPackage.INSTRUCTION__JOURNAL:
			getJournal().clear();
			return;
		case ProectCalendarPackage.INSTRUCTION__EVENT:
			getEvent().clear();
			return;
		case ProectCalendarPackage.INSTRUCTION__TIMEZONE:
			getTimezone().clear();
			return;
		case ProectCalendarPackage.INSTRUCTION__FREEBUSY:
			getFreebusy().clear();
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
		case ProectCalendarPackage.INSTRUCTION__TODO:
			return todo != null && !todo.isEmpty();
		case ProectCalendarPackage.INSTRUCTION__JOURNAL:
			return journal != null && !journal.isEmpty();
		case ProectCalendarPackage.INSTRUCTION__EVENT:
			return event != null && !event.isEmpty();
		case ProectCalendarPackage.INSTRUCTION__TIMEZONE:
			return timezone != null && !timezone.isEmpty();
		case ProectCalendarPackage.INSTRUCTION__FREEBUSY:
			return freebusy != null && !freebusy.isEmpty();
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
		case ProectCalendarPackage.INSTRUCTION___ACCEPT__VCALENDARVISITOR:
			accept((VcalendarVisitor) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //InstructionImpl
