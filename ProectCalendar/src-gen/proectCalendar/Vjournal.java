/**
 */
package proectCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vjournal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proectCalendar.Vjournal#getDtstamp <em>Dtstamp</em>}</li>
 *   <li>{@link proectCalendar.Vjournal#getUid <em>Uid</em>}</li>
 *   <li>{@link proectCalendar.Vjournal#getDtstart <em>Dtstart</em>}</li>
 *   <li>{@link proectCalendar.Vjournal#getDescription <em>Description</em>}</li>
 *   <li>{@link proectCalendar.Vjournal#getSummuary <em>Summuary</em>}</li>
 * </ul>
 *
 * @see proectCalendar.ProectCalendarPackage#getVjournal()
 * @model
 * @generated
 */
public interface Vjournal extends EObject {
	/**
	 * Returns the value of the '<em><b>Dtstamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtstamp</em>' attribute.
	 * @see #setDtstamp(String)
	 * @see proectCalendar.ProectCalendarPackage#getVjournal_Dtstamp()
	 * @model required="true"
	 * @generated
	 */
	String getDtstamp();

	/**
	 * Sets the value of the '{@link proectCalendar.Vjournal#getDtstamp <em>Dtstamp</em>}' attribute.
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
	 * @see proectCalendar.ProectCalendarPackage#getVjournal_Uid()
	 * @model required="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link proectCalendar.Vjournal#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Dtstart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtstart</em>' attribute.
	 * @see #setDtstart(String)
	 * @see proectCalendar.ProectCalendarPackage#getVjournal_Dtstart()
	 * @model
	 * @generated
	 */
	String getDtstart();

	/**
	 * Sets the value of the '{@link proectCalendar.Vjournal#getDtstart <em>Dtstart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtstart</em>' attribute.
	 * @see #getDtstart()
	 * @generated
	 */
	void setDtstart(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see proectCalendar.ProectCalendarPackage#getVjournal_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link proectCalendar.Vjournal#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Summuary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summuary</em>' attribute.
	 * @see #setSummuary(String)
	 * @see proectCalendar.ProectCalendarPackage#getVjournal_Summuary()
	 * @model
	 * @generated
	 */
	String getSummuary();

	/**
	 * Sets the value of the '{@link proectCalendar.Vjournal#getSummuary <em>Summuary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summuary</em>' attribute.
	 * @see #getSummuary()
	 * @generated
	 */
	void setSummuary(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void accept(VcalendarVisitor visitor);

} // Vjournal
