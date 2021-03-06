/**
 */
package at.ac.tuwien.big.momot.examples.modularization.ttc.architecture.impl;

import at.ac.tuwien.big.momot.examples.modularization.ttc.architecture.ArchitecturePackage;
import at.ac.tuwien.big.momot.examples.modularization.ttc.architecture.ClassModel;
import at.ac.tuwien.big.momot.examples.modularization.ttc.architecture.Feature;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.momot.examples.modularization.ttc.architecture.impl.ClassModelImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link at.ac.tuwien.big.momot.examples.modularization.ttc.architecture.impl.ClassModelImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassModelImpl extends NamedElementImpl implements ClassModel
{
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<at.ac.tuwien.big.momot.examples.modularization.ttc.architecture.Class> classes;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassModelImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ArchitecturePackage.Literals.CLASS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<at.ac.tuwien.big.momot.examples.modularization.ttc.architecture.Class> getClasses()
	{
		if (classes == null)
		{
			classes = new EObjectContainmentEList<at.ac.tuwien.big.momot.examples.modularization.ttc.architecture.Class>(at.ac.tuwien.big.momot.examples.modularization.ttc.architecture.Class.class, this, ArchitecturePackage.CLASS_MODEL__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures()
	{
		if (features == null)
		{
			features = new EObjectContainmentEList<Feature>(Feature.class, this, ArchitecturePackage.CLASS_MODEL__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ArchitecturePackage.CLASS_MODEL__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.CLASS_MODEL__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case ArchitecturePackage.CLASS_MODEL__CLASSES:
				return getClasses();
			case ArchitecturePackage.CLASS_MODEL__FEATURES:
				return getFeatures();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ArchitecturePackage.CLASS_MODEL__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends at.ac.tuwien.big.momot.examples.modularization.ttc.architecture.Class>)newValue);
				return;
			case ArchitecturePackage.CLASS_MODEL__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case ArchitecturePackage.CLASS_MODEL__CLASSES:
				getClasses().clear();
				return;
			case ArchitecturePackage.CLASS_MODEL__FEATURES:
				getFeatures().clear();
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case ArchitecturePackage.CLASS_MODEL__CLASSES:
				return classes != null && !classes.isEmpty();
			case ArchitecturePackage.CLASS_MODEL__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassModelImpl
