/**
 */
package proectCalendar.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import proectCalendar.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see proectCalendar.ProectCalendarPackage
 * @generated
 */
public class ProectCalendarSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProectCalendarPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProectCalendarSwitch() {
		if (modelPackage == null) {
			modelPackage = ProectCalendarPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ProectCalendarPackage.VCALENDAR: {
			Vcalendar vcalendar = (Vcalendar) theEObject;
			T result = caseVcalendar(vcalendar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProectCalendarPackage.VTODO: {
			Vtodo vtodo = (Vtodo) theEObject;
			T result = caseVtodo(vtodo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProectCalendarPackage.VALARM: {
			Valarm valarm = (Valarm) theEObject;
			T result = caseValarm(valarm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProectCalendarPackage.VJOURNAL: {
			Vjournal vjournal = (Vjournal) theEObject;
			T result = caseVjournal(vjournal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProectCalendarPackage.VEVENT: {
			Vevent vevent = (Vevent) theEObject;
			T result = caseVevent(vevent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProectCalendarPackage.VTIMEZONE: {
			Vtimezone vtimezone = (Vtimezone) theEObject;
			T result = caseVtimezone(vtimezone);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProectCalendarPackage.FREEBUSY: {
			Freebusy freebusy = (Freebusy) theEObject;
			T result = caseFreebusy(freebusy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProectCalendarPackage.STANDARD: {
			Standard standard = (Standard) theEObject;
			T result = caseStandard(standard);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProectCalendarPackage.DAYLIGHT: {
			Daylight daylight = (Daylight) theEObject;
			T result = caseDaylight(daylight);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vcalendar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vcalendar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVcalendar(Vcalendar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vtodo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vtodo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVtodo(Vtodo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valarm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valarm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValarm(Valarm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vjournal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vjournal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVjournal(Vjournal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vevent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vevent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVevent(Vevent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vtimezone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vtimezone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVtimezone(Vtimezone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Freebusy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Freebusy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreebusy(Freebusy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandard(Standard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daylight</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daylight</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaylight(Daylight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProectCalendarSwitch
