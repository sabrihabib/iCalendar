/**
 */
package proectCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Freebusy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proectCalendar.Freebusy#getUid <em>Uid</em>}</li>
 *   <li>{@link proectCalendar.Freebusy#getDtstamp <em>Dtstamp</em>}</li>
 *   <li>{@link proectCalendar.Freebusy#getDtstart <em>Dtstart</em>}</li>
 *   <li>{@link proectCalendar.Freebusy#getDtend <em>Dtend</em>}</li>
 *   <li>{@link proectCalendar.Freebusy#getAttendee <em>Attendee</em>}</li>
 *   <li>{@link proectCalendar.Freebusy#getOrganizer <em>Organizer</em>}</li>
 * </ul>
 *
 * @see proectCalendar.ProectCalendarPackage#getFreebusy()
 * @model
 * @generated
 */
public interface Freebusy extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see proectCalendar.ProectCalendarPackage#getFreebusy_Uid()
	 * @model required="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link proectCalendar.Freebusy#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Dtstamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtstamp</em>' attribute.
	 * @see #setDtstamp(String)
	 * @see proectCalendar.ProectCalendarPackage#getFreebusy_Dtstamp()
	 * @model required="true"
	 * @generated
	 */
	String getDtstamp();

	/**
	 * Sets the value of the '{@link proectCalendar.Freebusy#getDtstamp <em>Dtstamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtstamp</em>' attribute.
	 * @see #getDtstamp()
	 * @generated
	 */
	void setDtstamp(String value);

	/**
	 * Returns the value of the '<em><b>Dtstart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtstart</em>' attribute.
	 * @see #setDtstart(String)
	 * @see proectCalendar.ProectCalendarPackage#getFreebusy_Dtstart()
	 * @model
	 * @generated
	 */
	String getDtstart();

	/**
	 * Sets the value of the '{@link proectCalendar.Freebusy#getDtstart <em>Dtstart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtstart</em>' attribute.
	 * @see #getDtstart()
	 * @generated
	 */
	void setDtstart(String value);

	/**
	 * Returns the value of the '<em><b>Dtend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtend</em>' attribute.
	 * @see #setDtend(String)
	 * @see proectCalendar.ProectCalendarPackage#getFreebusy_Dtend()
	 * @model
	 * @generated
	 */
	String getDtend();

	/**
	 * Sets the value of the '{@link proectCalendar.Freebusy#getDtend <em>Dtend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtend</em>' attribute.
	 * @see #getDtend()
	 * @generated
	 */
	void setDtend(String value);

	/**
	 * Returns the value of the '<em><b>Attendee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attendee</em>' attribute.
	 * @see #setAttendee(String)
	 * @see proectCalendar.ProectCalendarPackage#getFreebusy_Attendee()
	 * @model
	 * @generated
	 */
	String getAttendee();

	/**
	 * Sets the value of the '{@link proectCalendar.Freebusy#getAttendee <em>Attendee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attendee</em>' attribute.
	 * @see #getAttendee()
	 * @generated
	 */
	void setAttendee(String value);

	/**
	 * Returns the value of the '<em><b>Organizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizer</em>' attribute.
	 * @see #setOrganizer(String)
	 * @see proectCalendar.ProectCalendarPackage#getFreebusy_Organizer()
	 * @model
	 * @generated
	 */
	String getOrganizer();

	/**
	 * Sets the value of the '{@link proectCalendar.Freebusy#getOrganizer <em>Organizer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organizer</em>' attribute.
	 * @see #getOrganizer()
	 * @generated
	 */
	void setOrganizer(String value);

} // Freebusy
