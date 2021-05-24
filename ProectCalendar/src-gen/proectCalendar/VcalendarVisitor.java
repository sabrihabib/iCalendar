/**
 */
package proectCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vcalendar Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see proectCalendar.ProectCalendarPackage#getVcalendarVisitor()
 * @model abstract="true"
 * @generated
 */
public interface VcalendarVisitor{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void visit(Vcalendar vcalendar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void visit(Vtodo vtodo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void visit(Vjournal vjournal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void visit(Vevent vevent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void visit(Vtimezone vtimezone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void visit(Freebusy freebusy);

} // VcalendarVisitor
