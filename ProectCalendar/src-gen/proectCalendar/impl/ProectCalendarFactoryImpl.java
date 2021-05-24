/**
 */
package proectCalendar.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import proectCalendar.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProectCalendarFactoryImpl extends EFactoryImpl implements ProectCalendarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProectCalendarFactory init() {
		try {
			ProectCalendarFactory theProectCalendarFactory = (ProectCalendarFactory) EPackage.Registry.INSTANCE
					.getEFactory(ProectCalendarPackage.eNS_URI);
			if (theProectCalendarFactory != null) {
				return theProectCalendarFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProectCalendarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProectCalendarFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ProectCalendarPackage.VCALENDAR:
			return createVcalendar();
		case ProectCalendarPackage.VTODO:
			return createVtodo();
		case ProectCalendarPackage.VALARM:
			return createValarm();
		case ProectCalendarPackage.VJOURNAL:
			return createVjournal();
		case ProectCalendarPackage.VEVENT:
			return createVevent();
		case ProectCalendarPackage.VTIMEZONE:
			return createVtimezone();
		case ProectCalendarPackage.FREEBUSY:
			return createFreebusy();
		case ProectCalendarPackage.STANDARD:
			return createStandard();
		case ProectCalendarPackage.DAYLIGHT:
			return createDaylight();
		case ProectCalendarPackage.INSTRUCTION:
			return createInstruction();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vcalendar createVcalendar() {
		VcalendarImpl vcalendar = new VcalendarImpl();
		return vcalendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vtodo createVtodo() {
		VtodoImpl vtodo = new VtodoImpl();
		return vtodo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Valarm createValarm() {
		ValarmImpl valarm = new ValarmImpl();
		return valarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vjournal createVjournal() {
		VjournalImpl vjournal = new VjournalImpl();
		return vjournal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vevent createVevent() {
		VeventImpl vevent = new VeventImpl();
		return vevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vtimezone createVtimezone() {
		VtimezoneImpl vtimezone = new VtimezoneImpl();
		return vtimezone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Freebusy createFreebusy() {
		FreebusyImpl freebusy = new FreebusyImpl();
		return freebusy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Standard createStandard() {
		StandardImpl standard = new StandardImpl();
		return standard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Daylight createDaylight() {
		DaylightImpl daylight = new DaylightImpl();
		return daylight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction createInstruction() {
		InstructionImpl instruction = new InstructionImpl();
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProectCalendarPackage getProectCalendarPackage() {
		return (ProectCalendarPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProectCalendarPackage getPackage() {
		return ProectCalendarPackage.eINSTANCE;
	}

} //ProectCalendarFactoryImpl
