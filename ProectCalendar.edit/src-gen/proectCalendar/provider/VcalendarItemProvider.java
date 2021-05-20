/**
 */
package proectCalendar.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import proectCalendar.ProectCalendarFactory;
import proectCalendar.ProectCalendarPackage;
import proectCalendar.Vcalendar;

/**
 * This is the item provider adapter for a {@link proectCalendar.Vcalendar} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VcalendarItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VcalendarItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addVersionPropertyDescriptor(object);
			addProdidPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Vcalendar_version_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Vcalendar_version_feature",
								"_UI_Vcalendar_type"),
						ProectCalendarPackage.Literals.VCALENDAR__VERSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Prodid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProdidPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Vcalendar_prodid_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Vcalendar_prodid_feature",
								"_UI_Vcalendar_type"),
						ProectCalendarPackage.Literals.VCALENDAR__PRODID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ProectCalendarPackage.Literals.VCALENDAR__TODO);
			childrenFeatures.add(ProectCalendarPackage.Literals.VCALENDAR__JOURNAL);
			childrenFeatures.add(ProectCalendarPackage.Literals.VCALENDAR__EVENT);
			childrenFeatures.add(ProectCalendarPackage.Literals.VCALENDAR__TIMEZONE);
			childrenFeatures.add(ProectCalendarPackage.Literals.VCALENDAR__FREEBUSY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Vcalendar.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Vcalendar"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Vcalendar) object).getVersion();
		return label == null || label.length() == 0 ? getString("_UI_Vcalendar_type")
				: getString("_UI_Vcalendar_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Vcalendar.class)) {
		case ProectCalendarPackage.VCALENDAR__VERSION:
		case ProectCalendarPackage.VCALENDAR__PRODID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ProectCalendarPackage.VCALENDAR__TODO:
		case ProectCalendarPackage.VCALENDAR__JOURNAL:
		case ProectCalendarPackage.VCALENDAR__EVENT:
		case ProectCalendarPackage.VCALENDAR__TIMEZONE:
		case ProectCalendarPackage.VCALENDAR__FREEBUSY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(ProectCalendarPackage.Literals.VCALENDAR__TODO,
				ProectCalendarFactory.eINSTANCE.createVtodo()));

		newChildDescriptors.add(createChildParameter(ProectCalendarPackage.Literals.VCALENDAR__JOURNAL,
				ProectCalendarFactory.eINSTANCE.createVjournal()));

		newChildDescriptors.add(createChildParameter(ProectCalendarPackage.Literals.VCALENDAR__EVENT,
				ProectCalendarFactory.eINSTANCE.createVevent()));

		newChildDescriptors.add(createChildParameter(ProectCalendarPackage.Literals.VCALENDAR__TIMEZONE,
				ProectCalendarFactory.eINSTANCE.createVtimezone()));

		newChildDescriptors.add(createChildParameter(ProectCalendarPackage.Literals.VCALENDAR__FREEBUSY,
				ProectCalendarFactory.eINSTANCE.createFreebusy()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ProectCalendarEditPlugin.INSTANCE;
	}

}
