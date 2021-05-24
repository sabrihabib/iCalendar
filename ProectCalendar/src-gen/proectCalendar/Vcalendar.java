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
 *   <li>{@link proectCalendar.Vcalendar#getVersion <em>Version</em>}</li>
 *   <li>{@link proectCalendar.Vcalendar#getProdid <em>Prodid</em>}</li>
 *   <li>{@link proectCalendar.Vcalendar#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @see proectCalendar.ProectCalendarPackage#getVcalendar()
 * @model
 * @generated
 */
public interface Vcalendar extends EObject {
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

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link proectCalendar.Instruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference list.
	 * @see proectCalendar.ProectCalendarPackage#getVcalendar_Instruction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstruction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void accept(VcalendarVisitor visitor);

} // Vcalendar
