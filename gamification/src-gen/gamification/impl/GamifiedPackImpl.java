/**
 */
package gamification.impl;

import gamification.Aesthetics;
import gamification.Dynamics;
import gamification.GamificationPackage;
import gamification.GamifiedPack;
import gamification.Mechanics;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gamified Pack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gamification.impl.GamifiedPackImpl#getName <em>Name</em>}</li>
 *   <li>{@link gamification.impl.GamifiedPackImpl#getMechanics <em>Mechanics</em>}</li>
 *   <li>{@link gamification.impl.GamifiedPackImpl#getAesthetics <em>Aesthetics</em>}</li>
 *   <li>{@link gamification.impl.GamifiedPackImpl#getDynamics <em>Dynamics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GamifiedPackImpl extends MinimalEObjectImpl.Container implements GamifiedPack {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMechanics() <em>Mechanics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanics()
	 * @generated
	 * @ordered
	 */
	protected EList<Mechanics> mechanics;

	/**
	 * The cached value of the '{@link #getAesthetics() <em>Aesthetics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAesthetics()
	 * @generated
	 * @ordered
	 */
	protected EList<Aesthetics> aesthetics;

	/**
	 * The cached value of the '{@link #getDynamics() <em>Dynamics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamics()
	 * @generated
	 * @ordered
	 */
	protected EList<Dynamics> dynamics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamifiedPackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamificationPackage.Literals.GAMIFIED_PACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamificationPackage.GAMIFIED_PACK__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mechanics> getMechanics() {
		if (mechanics == null) {
			mechanics = new EObjectContainmentEList<Mechanics>(Mechanics.class, this,
					GamificationPackage.GAMIFIED_PACK__MECHANICS);
		}
		return mechanics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Aesthetics> getAesthetics() {
		if (aesthetics == null) {
			aesthetics = new EObjectContainmentEList<Aesthetics>(Aesthetics.class, this,
					GamificationPackage.GAMIFIED_PACK__AESTHETICS);
		}
		return aesthetics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dynamics> getDynamics() {
		if (dynamics == null) {
			dynamics = new EObjectContainmentEList<Dynamics>(Dynamics.class, this,
					GamificationPackage.GAMIFIED_PACK__DYNAMICS);
		}
		return dynamics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GamificationPackage.GAMIFIED_PACK__MECHANICS:
			return ((InternalEList<?>) getMechanics()).basicRemove(otherEnd, msgs);
		case GamificationPackage.GAMIFIED_PACK__AESTHETICS:
			return ((InternalEList<?>) getAesthetics()).basicRemove(otherEnd, msgs);
		case GamificationPackage.GAMIFIED_PACK__DYNAMICS:
			return ((InternalEList<?>) getDynamics()).basicRemove(otherEnd, msgs);
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
		case GamificationPackage.GAMIFIED_PACK__NAME:
			return getName();
		case GamificationPackage.GAMIFIED_PACK__MECHANICS:
			return getMechanics();
		case GamificationPackage.GAMIFIED_PACK__AESTHETICS:
			return getAesthetics();
		case GamificationPackage.GAMIFIED_PACK__DYNAMICS:
			return getDynamics();
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
		case GamificationPackage.GAMIFIED_PACK__NAME:
			setName((String) newValue);
			return;
		case GamificationPackage.GAMIFIED_PACK__MECHANICS:
			getMechanics().clear();
			getMechanics().addAll((Collection<? extends Mechanics>) newValue);
			return;
		case GamificationPackage.GAMIFIED_PACK__AESTHETICS:
			getAesthetics().clear();
			getAesthetics().addAll((Collection<? extends Aesthetics>) newValue);
			return;
		case GamificationPackage.GAMIFIED_PACK__DYNAMICS:
			getDynamics().clear();
			getDynamics().addAll((Collection<? extends Dynamics>) newValue);
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
		case GamificationPackage.GAMIFIED_PACK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GamificationPackage.GAMIFIED_PACK__MECHANICS:
			getMechanics().clear();
			return;
		case GamificationPackage.GAMIFIED_PACK__AESTHETICS:
			getAesthetics().clear();
			return;
		case GamificationPackage.GAMIFIED_PACK__DYNAMICS:
			getDynamics().clear();
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
		case GamificationPackage.GAMIFIED_PACK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GamificationPackage.GAMIFIED_PACK__MECHANICS:
			return mechanics != null && !mechanics.isEmpty();
		case GamificationPackage.GAMIFIED_PACK__AESTHETICS:
			return aesthetics != null && !aesthetics.isEmpty();
		case GamificationPackage.GAMIFIED_PACK__DYNAMICS:
			return dynamics != null && !dynamics.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GamifiedPackImpl
