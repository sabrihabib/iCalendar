/**
 */
package proectCalendar.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import proectCalendar.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see proectCalendar.ProectCalendarPackage
 * @generated
 */
public class ProectCalendarAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProectCalendarPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProectCalendarAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProectCalendarPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProectCalendarSwitch<Adapter> modelSwitch = new ProectCalendarSwitch<Adapter>() {
		@Override
		public Adapter caseVcalendar(Vcalendar object) {
			return createVcalendarAdapter();
		}

		@Override
		public Adapter caseVtodo(Vtodo object) {
			return createVtodoAdapter();
		}

		@Override
		public Adapter caseValarm(Valarm object) {
			return createValarmAdapter();
		}

		@Override
		public Adapter caseVjournal(Vjournal object) {
			return createVjournalAdapter();
		}

		@Override
		public Adapter caseVevent(Vevent object) {
			return createVeventAdapter();
		}

		@Override
		public Adapter caseVtimezone(Vtimezone object) {
			return createVtimezoneAdapter();
		}

		@Override
		public Adapter caseFreebusy(Freebusy object) {
			return createFreebusyAdapter();
		}

		@Override
		public Adapter caseStandard(Standard object) {
			return createStandardAdapter();
		}

		@Override
		public Adapter caseDaylight(Daylight object) {
			return createDaylightAdapter();
		}

		@Override
		public Adapter caseInstruction(Instruction object) {
			return createInstructionAdapter();
		}

		@Override
		public Adapter caseVcalendarVisitor(VcalendarVisitor object) {
			return createVcalendarVisitorAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link proectCalendar.Vcalendar <em>Vcalendar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proectCalendar.Vcalendar
	 * @generated
	 */
	public Adapter createVcalendarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proectCalendar.Vtodo <em>Vtodo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proectCalendar.Vtodo
	 * @generated
	 */
	public Adapter createVtodoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proectCalendar.Valarm <em>Valarm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proectCalendar.Valarm
	 * @generated
	 */
	public Adapter createValarmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proectCalendar.Vjournal <em>Vjournal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proectCalendar.Vjournal
	 * @generated
	 */
	public Adapter createVjournalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proectCalendar.Vevent <em>Vevent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proectCalendar.Vevent
	 * @generated
	 */
	public Adapter createVeventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proectCalendar.Vtimezone <em>Vtimezone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proectCalendar.Vtimezone
	 * @generated
	 */
	public Adapter createVtimezoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proectCalendar.Freebusy <em>Freebusy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proectCalendar.Freebusy
	 * @generated
	 */
	public Adapter createFreebusyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proectCalendar.Standard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proectCalendar.Standard
	 * @generated
	 */
	public Adapter createStandardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proectCalendar.Daylight <em>Daylight</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proectCalendar.Daylight
	 * @generated
	 */
	public Adapter createDaylightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proectCalendar.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proectCalendar.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proectCalendar.VcalendarVisitor <em>Vcalendar Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proectCalendar.VcalendarVisitor
	 * @generated
	 */
	public Adapter createVcalendarVisitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProectCalendarAdapterFactory
