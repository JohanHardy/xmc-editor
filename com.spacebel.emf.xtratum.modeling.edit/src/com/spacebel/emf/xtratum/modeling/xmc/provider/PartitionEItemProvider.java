/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.provider;


import com.spacebel.emf.xtratum.modeling.xmc.PartitionE;
import com.spacebel.emf.xtratum.modeling.xmc.PartitionFlagsT;
import com.spacebel.emf.xtratum.modeling.xmc.XmcFactory;
import com.spacebel.emf.xtratum.modeling.xmc.XmcPackage;

import java.util.Collection;
import java.util.Iterator;
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

/**
 * This is the item provider adapter for a {@link com.spacebel.emf.xtratum.modeling.xmc.PartitionE} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PartitionEItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionEItemProvider(AdapterFactory adapterFactory) {
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

			addBootPropertyDescriptor(object);
			addConsolePropertyDescriptor(object);
			addFlagsPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Boot feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBootPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartitionE_boot_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartitionE_boot_feature", "_UI_PartitionE_type"),
				 XmcPackage.Literals.PARTITION_E__BOOT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Console feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConsolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartitionE_console_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartitionE_console_feature", "_UI_PartitionE_type"),
				 XmcPackage.Literals.PARTITION_E__CONSOLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flags feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlagsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartitionE_flags_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartitionE_flags_feature", "_UI_PartitionE_type"),
				 XmcPackage.Literals.PARTITION_E__FLAGS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartitionE_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartitionE_id_feature", "_UI_PartitionE_type"),
				 XmcPackage.Literals.PARTITION_E__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartitionE_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartitionE_name_feature", "_UI_PartitionE_type"),
				 XmcPackage.Literals.PARTITION_E__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(XmcPackage.Literals.PARTITION_E__PHYSICAL_MEMORY_AREAS);
			childrenFeatures.add(XmcPackage.Literals.PARTITION_E__TEMPORAL_REQUIREMENTS);
			childrenFeatures.add(XmcPackage.Literals.PARTITION_E__HEALTH_MONITOR);
			childrenFeatures.add(XmcPackage.Literals.PARTITION_E__HW_RESOURCES);
			childrenFeatures.add(XmcPackage.Literals.PARTITION_E__PORT_TABLE);
			childrenFeatures.add(XmcPackage.Literals.PARTITION_E__TRACE);
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
	 * This returns PartitionE.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PartitionE"));
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
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((PartitionE)object).getName();
		if (label == null || label.length() == 0) return "";
		else
		{
			/* Add partition id */
			if (((PartitionE)object).getId().toString().length() != 0)
			{
				label = "p" + ((PartitionE)object).getId().toString() + ":" + label;
			}
			
			/* Add flags in parentheses */
			if (!((PartitionE)object).getFlags().isEmpty())
			{
				label += " " + "(";
				for (Iterator<PartitionFlagsT> iterator = ((PartitionE)object).getFlags().iterator(); iterator
						.hasNext();) {
					PartitionFlagsT flag = (PartitionFlagsT) iterator.next();
					label += flag.getName();
					if (iterator.hasNext()) label += ", ";
				}
				label += ")";
			}
		}
		return label;
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

		switch (notification.getFeatureID(PartitionE.class)) {
			case XmcPackage.PARTITION_E__BOOT:
			case XmcPackage.PARTITION_E__CONSOLE:
			case XmcPackage.PARTITION_E__FLAGS:
			case XmcPackage.PARTITION_E__ID:
			case XmcPackage.PARTITION_E__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XmcPackage.PARTITION_E__PHYSICAL_MEMORY_AREAS:
			case XmcPackage.PARTITION_E__TEMPORAL_REQUIREMENTS:
			case XmcPackage.PARTITION_E__HEALTH_MONITOR:
			case XmcPackage.PARTITION_E__HW_RESOURCES:
			case XmcPackage.PARTITION_E__PORT_TABLE:
			case XmcPackage.PARTITION_E__TRACE:
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

		newChildDescriptors.add
			(createChildParameter
				(XmcPackage.Literals.PARTITION_E__PHYSICAL_MEMORY_AREAS,
				 XmcFactory.eINSTANCE.createMemoryAreaE()));

		newChildDescriptors.add
			(createChildParameter
				(XmcPackage.Literals.PARTITION_E__TEMPORAL_REQUIREMENTS,
				 XmcFactory.eINSTANCE.createTemporalRequirementsType()));

		newChildDescriptors.add
			(createChildParameter
				(XmcPackage.Literals.PARTITION_E__HEALTH_MONITOR,
				 XmcFactory.eINSTANCE.createHealthMonitorE()));

		newChildDescriptors.add
			(createChildParameter
				(XmcPackage.Literals.PARTITION_E__HW_RESOURCES,
				 XmcFactory.eINSTANCE.createHwResourcesE()));

		newChildDescriptors.add
			(createChildParameter
				(XmcPackage.Literals.PARTITION_E__PORT_TABLE,
				 XmcFactory.eINSTANCE.createPartitionPortsE()));

		newChildDescriptors.add
			(createChildParameter
				(XmcPackage.Literals.PARTITION_E__TRACE,
				 XmcFactory.eINSTANCE.createTraceE()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return XmcEditPlugin.INSTANCE;
	}

}
