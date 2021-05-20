/**
 */
package proectCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vtodo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proectCalendar.Vtodo#getAlarm <em>Alarm</em>}</li>
 *   <li>{@link proectCalendar.Vtodo#getDtstamp <em>Dtstamp</em>}</li>
 *   <li>{@link proectCalendar.Vtodo#getUid <em>Uid</em>}</li>
 *   <li>{@link proectCalendar.Vtodo#getClass_ <em>Class</em>}</li>
 *   <li>{@link proectCalendar.Vtodo#getCompleted <em>Completed</em>}</li>
 *   <li>{@link proectCalendar.Vtodo#getCreated <em>Created</em>}</li>
 *   <li>{@link proectCalendar.Vtodo#getDescription <em>Description</em>}</li>
 *   <li>{@link proectCalendar.Vtodo#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see proectCalendar.ProectCalendarPackage#getVtodo()
 * @model
 * @generated
 */
public interface Vtodo extends EObject {
	/**
	 * Returns the value of the '<em><b>Alarm</b></em>' containment reference list.
	 * The list contents are of type {@link proectCalendar.Valarm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm</em>' containment reference list.
	 * @see proectCalendar.ProectCalendarPackage#getVtodo_Alarm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Valarm> getAlarm();

	/**
	 * Returns the value of the '<em><b>Dtstamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtstamp</em>' attribute.
	 * @see #setDtstamp(String)
	 * @see proectCalendar.ProectCalendarPackage#getVtodo_Dtstamp()
	 * @model required="true"
	 * @generated
	 */
	String getDtstamp();

	/**
	 * Sets the value of the '{@link proectCalendar.Vtodo#getDtstamp <em>Dtstamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtstamp</em>' attribute.
	 * @see #getDtstamp()
	 * @generated
	 */
	void setDtstamp(String value);

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see proectCalendar.ProectCalendarPackage#getVtodo_Uid()
	 * @model required="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link proectCalendar.Vtodo#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see proectCalendar.ProectCalendarPackage#getVtodo_Class()
	 * @model
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link proectCalendar.Vtodo#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completed</em>' attribute.
	 * @see #setCompleted(String)
	 * @see proectCalendar.ProectCalendarPackage#getVtodo_Completed()
	 * @model
	 * @generated
	 */
	String getCompleted();

	/**
	 * Sets the value of the '{@link proectCalendar.Vtodo#getCompleted <em>Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completed</em>' attribute.
	 * @see #getCompleted()
	 * @generated
	 */
	void setCompleted(String value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(String)
	 * @see proectCalendar.ProectCalendarPackage#getVtodo_Created()
	 * @model
	 * @generated
	 */
	String getCreated();

	/**
	 * Sets the value of the '{@link proectCalendar.Vtodo#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see proectCalendar.ProectCalendarPackage#getVtodo_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link proectCalendar.Vtodo#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see proectCalendar.ProectCalendarPackage#getVtodo_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link proectCalendar.Vtodo#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

} // Vtodo
