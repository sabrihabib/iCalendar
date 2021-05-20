/**
 */
package proectCalendar;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see proectCalendar.ProectCalendarPackage
 * @generated
 */
public interface ProectCalendarFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProectCalendarFactory eINSTANCE = proectCalendar.impl.ProectCalendarFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Vcalendar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vcalendar</em>'.
	 * @generated
	 */
	Vcalendar createVcalendar();

	/**
	 * Returns a new object of class '<em>Vtodo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vtodo</em>'.
	 * @generated
	 */
	Vtodo createVtodo();

	/**
	 * Returns a new object of class '<em>Valarm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valarm</em>'.
	 * @generated
	 */
	Valarm createValarm();

	/**
	 * Returns a new object of class '<em>Vjournal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vjournal</em>'.
	 * @generated
	 */
	Vjournal createVjournal();

	/**
	 * Returns a new object of class '<em>Vevent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vevent</em>'.
	 * @generated
	 */
	Vevent createVevent();

	/**
	 * Returns a new object of class '<em>Vtimezone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vtimezone</em>'.
	 * @generated
	 */
	Vtimezone createVtimezone();

	/**
	 * Returns a new object of class '<em>Freebusy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Freebusy</em>'.
	 * @generated
	 */
	Freebusy createFreebusy();

	/**
	 * Returns a new object of class '<em>Standard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard</em>'.
	 * @generated
	 */
	Standard createStandard();

	/**
	 * Returns a new object of class '<em>Daylight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Daylight</em>'.
	 * @generated
	 */
	Daylight createDaylight();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProectCalendarPackage getProectCalendarPackage();

} //ProectCalendarFactory
