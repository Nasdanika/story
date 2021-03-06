/**
 */
package org.nasdanika.story.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.story.Catalog;
import org.nasdanika.story.StoryFactory;
import org.nasdanika.story.StoryPackage;

/**
 * This is the item provider adapter for a {@link org.nasdanika.story.Catalog} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogItemProvider 
	extends CDOItemProviderAdapterShim
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
	public CatalogItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_CatalogElement_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CatalogElement_id_feature", "_UI_CatalogElement_type"),
				 StoryPackage.Literals.CATALOG_ELEMENT__ID,
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
				 getString("_UI_CatalogElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CatalogElement_name_feature", "_UI_CatalogElement_type"),
				 StoryPackage.Literals.CATALOG_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CatalogElement_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CatalogElement_description_feature", "_UI_CatalogElement_type"),
				 StoryPackage.Literals.CATALOG_ELEMENT__DESCRIPTION,
				 true,
				 true,
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
			childrenFeatures.add(StoryPackage.Literals.CATALOG__ELEMENTS);
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
	 * This returns Catalog.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, StoryEditPlugin.INSTANCE.getIcon("drawer.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Catalog)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Catalog_type") :
			getString("_UI_Catalog_type") + " " + label;
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

		switch (notification.getFeatureID(Catalog.class)) {
			case StoryPackage.CATALOG__ID:
			case StoryPackage.CATALOG__NAME:
			case StoryPackage.CATALOG__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case StoryPackage.CATALOG__ELEMENTS:
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
				(StoryPackage.Literals.CATALOG__ELEMENTS,
				 StoryFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(StoryPackage.Literals.CATALOG__ELEMENTS,
				 StoryFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(StoryPackage.Literals.CATALOG__ELEMENTS,
				 StoryFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(StoryPackage.Literals.CATALOG__ELEMENTS,
				 StoryFactory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(StoryPackage.Literals.CATALOG__ELEMENTS,
				 StoryFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(StoryPackage.Literals.CATALOG__ELEMENTS,
				 StoryFactory.eINSTANCE.createPersona()));

		newChildDescriptors.add
			(createChildParameter
				(StoryPackage.Literals.CATALOG__ELEMENTS,
				 StoryFactory.eINSTANCE.createEpic()));

		newChildDescriptors.add
			(createChildParameter
				(StoryPackage.Literals.CATALOG__ELEMENTS,
				 StoryFactory.eINSTANCE.createTheme()));

		newChildDescriptors.add
			(createChildParameter
				(StoryPackage.Literals.CATALOG__ELEMENTS,
				 StoryFactory.eINSTANCE.createStory()));

		newChildDescriptors.add
			(createChildParameter
				(StoryPackage.Literals.CATALOG__ELEMENTS,
				 StoryFactory.eINSTANCE.createScenario()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return StoryEditPlugin.INSTANCE;
	}
	
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

}
