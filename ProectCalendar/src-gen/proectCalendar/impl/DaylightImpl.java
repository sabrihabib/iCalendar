/**
 */
package proectCalendar.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import proectCalendar.Daylight;
import proectCalendar.ProectCalendarPackage;
import proectCalendar.VcalendarVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Daylight</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DaylightImpl extends MinimalEObjectImpl.Container implements Daylight {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaylightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProectCalendarPackage.Literals.DAYLIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(VcalendarVisitor visitor) {
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
		case ProectCalendarPackage.DAYLIGHT___ACCEPT__VCALENDARVISITOR:
			accept((VcalendarVisitor) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DaylightImpl
