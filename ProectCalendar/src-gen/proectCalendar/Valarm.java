/**
 */
package proectCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proectCalendar.Valarm#getAction <em>Action</em>}</li>
 *   <li>{@link proectCalendar.Valarm#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link proectCalendar.Valarm#getDuration <em>Duration</em>}</li>
 *   <li>{@link proectCalendar.Valarm#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link proectCalendar.Valarm#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see proectCalendar.ProectCalendarPackage#getValarm()
 * @model
 * @generated
 */
public interface Valarm extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see proectCalendar.ProectCalendarPackage#getValarm_Action()
	 * @model required="true"
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link proectCalendar.Valarm#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(String)
	 * @see proectCalendar.ProectCalendarPackage#getValarm_Trigger()
	 * @model required="true"
	 * @generated
	 */
	String getTrigger();

	/**
	 * Sets the value of the '{@link proectCalendar.Valarm#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see proectCalendar.ProectCalendarPackage#getValarm_Duration()
	 * @model
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link proectCalendar.Valarm#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat</em>' attribute.
	 * @see #setRepeat(short)
	 * @see proectCalendar.ProectCalendarPackage#getValarm_Repeat()
	 * @model
	 * @generated
	 */
	short getRepeat();

	/**
	 * Sets the value of the '{@link proectCalendar.Valarm#getRepeat <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat</em>' attribute.
	 * @see #getRepeat()
	 * @generated
	 */
	void setRepeat(short value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see proectCalendar.ProectCalendarPackage#getValarm_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link proectCalendar.Valarm#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Valarm
