/**
 */
package com.spacebel.emf.xtratum.modeling.xmc.provider;


import com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType;
import com.spacebel.emf.xtratum.modeling.xmc.SamplingChannelType;
import com.spacebel.emf.xtratum.modeling.xmc.XmcFactory;
import com.spacebel.emf.xtratum.modeling.xmc.XmcPackage;

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

/**
 * This is the item provider adapter for a {@link com.spacebel.emf.xtratum.modeling.xmc.QueuingChannelType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QueuingChannelTypeItemProvider
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
	public QueuingChannelTypeItemProvider(AdapterFactory adapterFactory) {
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

			addMaxMessageLengthPropertyDescriptor(object);
			addMaxNoMessagesPropertyDescriptor(object);
			addMaxTimeExpirationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Max Message Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxMessageLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QueuingChannelType_maxMessageLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QueuingChannelType_maxMessageLength_feature", "_UI_QueuingChannelType_type"),
				 XmcPackage.Literals.QUEUING_CHANNEL_TYPE__MAX_MESSAGE_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max No Messages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxNoMessagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QueuingChannelType_maxNoMessages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QueuingChannelType_maxNoMessages_feature", "_UI_QueuingChannelType_type"),
				 XmcPackage.Literals.QUEUING_CHANNEL_TYPE__MAX_NO_MESSAGES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Time Expiration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxTimeExpirationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QueuingChannelType_maxTimeExpiration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QueuingChannelType_maxTimeExpiration_feature", "_UI_QueuingChannelType_type"),
				 XmcPackage.Literals.QUEUING_CHANNEL_TYPE__MAX_TIME_EXPIRATION,
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
			childrenFeatures.add(XmcPackage.Literals.QUEUING_CHANNEL_TYPE__SOURCE);
			childrenFeatures.add(XmcPackage.Literals.QUEUING_CHANNEL_TYPE__DESTINATION);
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
	 * This returns QueuingChannelType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/QueuingChannelType"));
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
		String source = "";
		String destination = "";
		
		/* Retrieve the source name*/
		if (((QueuingChannelType)object).getSource() != null)
		{
			source = ((QueuingChannelType)object).getSource().getPortName();
		}
		
		/* Retrieve the destination name*/
		if (((QueuingChannelType)object).getDestination() != null)
		{
			destination = ((QueuingChannelType)object).getDestination().getPortName();
		}
		
		/* Construct the label*/
		String label = source + " > " + destination + " (" + ((QueuingChannelType)object).getMaxNoMessages() 
				                                        + "x" 
				                                        + ((QueuingChannelType)object).getMaxMessageLength() 
				                                    + ")";
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

		switch (notification.getFeatureID(QueuingChannelType.class)) {
			case XmcPackage.QUEUING_CHANNEL_TYPE__MAX_MESSAGE_LENGTH:
			case XmcPackage.QUEUING_CHANNEL_TYPE__MAX_NO_MESSAGES:
			case XmcPackage.QUEUING_CHANNEL_TYPE__MAX_TIME_EXPIRATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XmcPackage.QUEUING_CHANNEL_TYPE__SOURCE:
			case XmcPackage.QUEUING_CHANNEL_TYPE__DESTINATION:
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
				(XmcPackage.Literals.QUEUING_CHANNEL_TYPE__SOURCE,
				 XmcFactory.eINSTANCE.createIpcPortE()));

		newChildDescriptors.add
			(createChildParameter
				(XmcPackage.Literals.QUEUING_CHANNEL_TYPE__DESTINATION,
				 XmcFactory.eINSTANCE.createIpcPortE()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == XmcPackage.Literals.QUEUING_CHANNEL_TYPE__SOURCE ||
			childFeature == XmcPackage.Literals.QUEUING_CHANNEL_TYPE__DESTINATION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
