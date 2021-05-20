/**
 */
package proectCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vcalendar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proectCalendar.Vcalendar#getTodo <em>Todo</em>}</li>
 *   <li>{@link proectCalendar.Vcalendar#getJournal <em>Journal</em>}</li>
 *   <li>{@link proectCalendar.Vcalendar#getEvent <em>Event</em>}</li>
 *   <li>{@link proectCalendar.Vcalendar#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link proectCalendar.Vcalendar#getFreebusy <em>Freebusy</em>}</li>
 *   <li>{@link proectCalendar.Vcalendar#getVersion <em>Version</em>}</li>
 *   <li>{@link proectCalendar.Vcalendar#getProdid <em>Prodid</em>}</li>
 * </ul>
 *
 * @see proectCalendar.ProectCalendarPackage#getVcalendar()
 * @model
 * @generated
 */
public interface Vcalendar extends EObject {
	/**
	 * Returns the value of the '<em><b>Todo</b></em>' containment reference list.
	 * The list contents are of type {@link proectCalendar.Vtodo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Todo</em>' containment reference list.
	 * @see proectCalendar.ProectCalendarPackage#getVcalendar_Todo()
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
	 * @see proectCalendar.ProectCalendarPackage#getVcalendar_Journal()
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
	 * @see proectCalendar.ProectCalendarPackage#getVcalendar_Event()
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
	 * @see proectCalendar.ProectCalendarPackage#getVcalendar_Timezone()
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
	 * @see proectCalendar.ProectCalendarPackage#getVcalendar_Freebusy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Freebusy> getFreebusy();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see proectCalendar.ProectCalendarPackage#getVcalendar_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link proectCalendar.Vcalendar#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Prodid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prodid</em>' attribute.
	 * @see #setProdid(String)
	 * @see proectCalendar.ProectCalendarPackage#getVcalendar_Prodid()
	 * @model
	 * @generated
	 */
	String getProdid();

	/**
	 * Sets the value of the '{@link proectCalendar.Vcalendar#getProdid <em>Prodid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prodid</em>' attribute.
	 * @see #getProdid()
	 * @generated
	 */
	void setProdid(String value);

} // Vcalendar
