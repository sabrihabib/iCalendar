/**
 */
package proectCalendar.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import proectCalendar.Freebusy;
import proectCalendar.ProectCalendarPackage;
import proectCalendar.Vcalendar;
import proectCalendar.VcalendarVisitor;
import proectCalendar.Vevent;
import proectCalendar.Vjournal;
import proectCalendar.Vtimezone;
import proectCalendar.Vtodo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vcalendar Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class VcalendarVisitorImpl extends MinimalEObjectImpl.Container implements VcalendarVisitor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VcalendarVisitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProectCalendarPackage.Literals.VCALENDAR_VISITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(Vcalendar vcalendar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(Vtodo vtodo) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(Vjournal vjournal) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(Vevent vevent) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(Vtimezone vtimezone) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(Freebusy freebusy) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ProectCalendarPackage.VCALENDAR_VISITOR___VISIT__VCALENDAR:
			visit((Vcalendar) arguments.get(0));
			return null;
		case ProectCalendarPackage.VCALENDAR_VISITOR___VISIT__VTODO:
			visit((Vtodo) arguments.get(0));
			return null;
		case ProectCalendarPackage.VCALENDAR_VISITOR___VISIT__VJOURNAL:
			visit((Vjournal) arguments.get(0));
			return null;
		case ProectCalendarPackage.VCALENDAR_VISITOR___VISIT__VEVENT:
			visit((Vevent) arguments.get(0));
			return null;
		case ProectCalendarPackage.VCALENDAR_VISITOR___VISIT__VTIMEZONE:
			visit((Vtimezone) arguments.get(0));
			return null;
		case ProectCalendarPackage.VCALENDAR_VISITOR___VISIT__FREEBUSY:
			visit((Freebusy) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //VcalendarVisitorImpl
