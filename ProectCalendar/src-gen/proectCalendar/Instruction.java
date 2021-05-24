/**
 */
package proectCalendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proectCalendar.Instruction#getTodo <em>Todo</em>}</li>
 *   <li>{@link proectCalendar.Instruction#getJournal <em>Journal</em>}</li>
 *   <li>{@link proectCalendar.Instruction#getEvent <em>Event</em>}</li>
 *   <li>{@link proectCalendar.Instruction#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link proectCalendar.Instruction#getFreebusy <em>Freebusy</em>}</li>
 * </ul>
 *
 * @see proectCalendar.ProectCalendarPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Todo</b></em>' containment reference list.
	 * The list contents are of type {@link proectCalendar.Vtodo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Todo</em>' containment reference list.
	 * @see proectCalendar.ProectCalendarPackage#getInstruction_Todo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vtodo> getTodo();

	/**
	 * Returns the value of the '<em><b>Journal</b></em>' containment reference list.
	 * The list contents are of type {@link proectCalendar.Vjournal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journal</em>' containment reference list.
	 * @see proectCalendar.ProectCalendarPackage#getInstruction_Journal()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vjournal> getJournal();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link proectCalendar.Vevent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see proectCalendar.ProectCalendarPackage#getInstruction_Event()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vevent> getEvent();

	/**
	 * Returns the value of the '<em><b>Timezone</b></em>' containment reference list.
	 * The list contents are of type {@link proectCalendar.Vtimezone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timezone</em>' containment reference list.
	 * @see proectCalendar.ProectCalendarPackage#getInstruction_Timezone()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vtimezone> getTimezone();

	/**
	 * Returns the value of the '<em><b>Freebusy</b></em>' containment reference list.
	 * The list contents are of type {@link proectCalendar.Freebusy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freebusy</em>' containment reference list.
	 * @see proectCalendar.ProectCalendarPackage#getInstruction_Freebusy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Freebusy> getFreebusy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void accept(VcalendarVisitor visitor);

} // Instruction
