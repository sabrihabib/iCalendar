/**
 */
package proectCalendar.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import proectCalendar.Instruction;
import proectCalendar.ProectCalendarPackage;
import proectCalendar.Vcalendar;
import proectCalendar.VcalendarVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vcalendar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proectCalendar.impl.VcalendarImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link proectCalendar.impl.VcalendarImpl#getProdid <em>Prodid</em>}</li>
 *   <li>{@link proectCalendar.impl.VcalendarImpl#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VcalendarImpl extends MinimalEObjectImpl.Container implements Vcalendar {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProdid() <em>Prodid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdid()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProdid() <em>Prodid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdid()
	 * @generated
	 * @ordered
	 */
	protected String prodid = PRODID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> instruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VcalendarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProectCalendarPackage.Literals.VCALENDAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VCALENDAR__VERSION, oldVersion,
					version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProdid() {
		return prodid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProdid(String newProdid) {
		String oldProdid = prodid;
		prodid = newProdid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProectCalendarPackage.VCALENDAR__PRODID, oldProdid,
					prodid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getInstruction() {
		if (instruction == null) {
			instruction = new EObjectContainmentEList<Instruction>(Instruction.class, this,
					ProectCalendarPackage.VCALENDAR__INSTRUCTION);
		}
		return instruction;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProectCalendarPackage.VCALENDAR__INSTRUCTION:
			return ((InternalEList<?>) getInstruction()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProectCalendarPackage.VCALENDAR__VERSION:
			return getVersion();
		case ProectCalendarPackage.VCALENDAR__PRODID:
			return getProdid();
		case ProectCalendarPackage.VCALENDAR__INSTRUCTION:
			return getInstruction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProectCalendarPackage.VCALENDAR__VERSION:
			setVersion((String) newValue);
			return;
		case ProectCalendarPackage.VCALENDAR__PRODID:
			setProdid((String) newValue);
			return;
		case ProectCalendarPackage.VCALENDAR__INSTRUCTION:
			getInstruction().clear();
			getInstruction().addAll((Collection<? extends Instruction>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ProectCalendarPackage.VCALENDAR__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case ProectCalendarPackage.VCALENDAR__PRODID:
			setProdid(PRODID_EDEFAULT);
			return;
		case ProectCalendarPackage.VCALENDAR__INSTRUCTION:
			getInstruction().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ProectCalendarPackage.VCALENDAR__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case ProectCalendarPackage.VCALENDAR__PRODID:
			return PRODID_EDEFAULT == null ? prodid != null : !PRODID_EDEFAULT.equals(prodid);
		case ProectCalendarPackage.VCALENDAR__INSTRUCTION:
			return instruction != null && !instruction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ProectCalendarPackage.VCALENDAR___ACCEPT__VCALENDARVISITOR:
			accept((VcalendarVisitor) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (version: ");
		result.append(version);
		result.append(", prodid: ");
		result.append(prodid);
		result.append(')');
		return result.toString();
	}

} //VcalendarImpl
