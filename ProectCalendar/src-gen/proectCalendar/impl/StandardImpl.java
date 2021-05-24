/**
 */
package proectCalendar.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import proectCalendar.ProectCalendarPackage;
import proectCalendar.Standard;
import proectCalendar.VcalendarVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StandardImpl extends MinimalEObjectImpl.Container implements Standard {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProectCalendarPackage.Literals.STANDARD;
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
		case ProectCalendarPackage.STANDARD___ACCEPT__VCALENDARVISITOR:
			accept((VcalendarVisitor) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //StandardImpl
