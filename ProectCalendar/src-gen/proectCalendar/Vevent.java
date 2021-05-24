/**
 */
package proectCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vevent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proectCalendar.Vevent#getAlarm <em>Alarm</em>}</li>
 *   <li>{@link proectCalendar.Vevent#getDescription <em>Description</em>}</li>
 *   <li>{@link proectCalendar.Vevent#getUid <em>Uid</em>}</li>
 *   <li>{@link proectCalendar.Vevent#getDtstamp <em>Dtstamp</em>}</li>
 *   <li>{@link proectCalendar.Vevent#getDtstart <em>Dtstart</em>}</li>
 *   <li>{@link proectCalendar.Vevent#getDtend <em>Dtend</em>}</li>
 *   <li>{@link proectCalendar.Vevent#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see proectCalendar.ProectCalendarPackage#getVevent()
 * @model
 * @generated
 */
public interface Vevent extends EObject {
	/**
	 * Returns the value of the '<em><b>Alarm</b></em>' containment reference list.
	 * The list contents are of type {@link proectCalendar.Valarm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm</em>' containment reference list.
	 * @see proectCalendar.ProectCalendarPackage#getVevent_Alarm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Valarm> getAlarm();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see proectCalendar.ProectCalendarPackage#getVevent_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link proectCalendar.Vevent#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see proectCalendar.ProectCalendarPackage#getVevent_Uid()
	 * @model required="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link proectCalendar.Vevent#getUid <em>Uid</em>}' attribute.
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
	 * @see proectCalendar.ProectCalendarPackage#getVevent_Dtstamp()
	 * @model required="true"
	 * @generated
	 */
	String getDtstamp();

	/**
	 * Sets the value of the '{@link proectCalendar.Vevent#getDtstamp <em>Dtstamp</em>}' attribute.
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
	 * @see proectCalendar.ProectCalendarPackage#getVevent_Dtstart()
	 * @model
	 * @generated
	 */
	String getDtstart();

	/**
	 * Sets the value of the '{@link proectCalendar.Vevent#getDtstart <em>Dtstart</em>}' attribute.
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
	 * @see proectCalendar.ProectCalendarPackage#getVevent_Dtend()
	 * @model
	 * @generated
	 */
	String getDtend();

	/**
	 * Sets the value of the '{@link proectCalendar.Vevent#getDtend <em>Dtend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtend</em>' attribute.
	 * @see #getDtend()
	 * @generated
	 */
	void setDtend(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see proectCalendar.ProectCalendarPackage#getVevent_Duration()
	 * @model
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link proectCalendar.Vevent#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void accept(VcalendarVisitor visitor);

} // Vevent
