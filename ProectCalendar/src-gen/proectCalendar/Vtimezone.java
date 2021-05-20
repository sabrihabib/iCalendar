/**
 */
package proectCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vtimezone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proectCalendar.Vtimezone#getStandard <em>Standard</em>}</li>
 *   <li>{@link proectCalendar.Vtimezone#getTzid <em>Tzid</em>}</li>
 *   <li>{@link proectCalendar.Vtimezone#getLast_mod <em>Last mod</em>}</li>
 *   <li>{@link proectCalendar.Vtimezone#getTzurl <em>Tzurl</em>}</li>
 *   <li>{@link proectCalendar.Vtimezone#getDaylight <em>Daylight</em>}</li>
 * </ul>
 *
 * @see proectCalendar.ProectCalendarPackage#getVtimezone()
 * @model
 * @generated
 */
public interface Vtimezone extends EObject {
	/**
	 * Returns the value of the '<em><b>Standard</b></em>' containment reference list.
	 * The list contents are of type {@link proectCalendar.Standard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard</em>' containment reference list.
	 * @see proectCalendar.ProectCalendarPackage#getVtimezone_Standard()
	 * @model containment="true"
	 * @generated
	 */
	EList<Standard> getStandard();

	/**
	 * Returns the value of the '<em><b>Tzid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tzid</em>' attribute.
	 * @see #setTzid(String)
	 * @see proectCalendar.ProectCalendarPackage#getVtimezone_Tzid()
	 * @model required="true"
	 * @generated
	 */
	String getTzid();

	/**
	 * Sets the value of the '{@link proectCalendar.Vtimezone#getTzid <em>Tzid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tzid</em>' attribute.
	 * @see #getTzid()
	 * @generated
	 */
	void setTzid(String value);

	/**
	 * Returns the value of the '<em><b>Last mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last mod</em>' attribute.
	 * @see #setLast_mod(String)
	 * @see proectCalendar.ProectCalendarPackage#getVtimezone_Last_mod()
	 * @model
	 * @generated
	 */
	String getLast_mod();

	/**
	 * Sets the value of the '{@link proectCalendar.Vtimezone#getLast_mod <em>Last mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last mod</em>' attribute.
	 * @see #getLast_mod()
	 * @generated
	 */
	void setLast_mod(String value);

	/**
	 * Returns the value of the '<em><b>Tzurl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tzurl</em>' attribute.
	 * @see #setTzurl(String)
	 * @see proectCalendar.ProectCalendarPackage#getVtimezone_Tzurl()
	 * @model
	 * @generated
	 */
	String getTzurl();

	/**
	 * Sets the value of the '{@link proectCalendar.Vtimezone#getTzurl <em>Tzurl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tzurl</em>' attribute.
	 * @see #getTzurl()
	 * @generated
	 */
	void setTzurl(String value);

	/**
	 * Returns the value of the '<em><b>Daylight</b></em>' containment reference list.
	 * The list contents are of type {@link proectCalendar.Daylight}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daylight</em>' containment reference list.
	 * @see proectCalendar.ProectCalendarPackage#getVtimezone_Daylight()
	 * @model containment="true"
	 * @generated
	 */
	EList<Daylight> getDaylight();

} // Vtimezone
