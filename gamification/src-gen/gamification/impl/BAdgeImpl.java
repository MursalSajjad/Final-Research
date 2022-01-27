/**
 */
package gamification.impl;

import gamification.BAdge;
import gamification.GamificationPackage;
import gamification.Leaderboards;
import gamification.Shapes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BAdge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gamification.impl.BAdgeImpl#getReward <em>Reward</em>}</li>
 *   <li>{@link gamification.impl.BAdgeImpl#getShapes <em>Shapes</em>}</li>
 *   <li>{@link gamification.impl.BAdgeImpl#getLeaderboards <em>Leaderboards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BAdgeImpl extends MechanicsImpl implements BAdge {
	/**
	 * The default value of the '{@link #getReward() <em>Reward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReward()
	 * @generated
	 * @ordered
	 */
	protected static final String REWARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReward() <em>Reward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReward()
	 * @generated
	 * @ordered
	 */
	protected String reward = REWARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getShapes() <em>Shapes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapes()
	 * @generated
	 * @ordered
	 */
	protected static final Shapes SHAPES_EDEFAULT = Shapes.SQUARE;

	/**
	 * The cached value of the '{@link #getShapes() <em>Shapes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapes()
	 * @generated
	 * @ordered
	 */
	protected Shapes shapes = SHAPES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeaderboards() <em>Leaderboards</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderboards()
	 * @generated
	 * @ordered
	 */
	protected Leaderboards leaderboards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BAdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamificationPackage.Literals.BADGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReward() {
		return reward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReward(String newReward) {
		String oldReward = reward;
		reward = newReward;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamificationPackage.BADGE__REWARD, oldReward,
					reward));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shapes getShapes() {
		return shapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapes(Shapes newShapes) {
		Shapes oldShapes = shapes;
		shapes = newShapes == null ? SHAPES_EDEFAULT : newShapes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamificationPackage.BADGE__SHAPES, oldShapes,
					shapes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leaderboards getLeaderboards() {
		if (leaderboards != null && leaderboards.eIsProxy()) {
			InternalEObject oldLeaderboards = (InternalEObject) leaderboards;
			leaderboards = (Leaderboards) eResolveProxy(oldLeaderboards);
			if (leaderboards != oldLeaderboards) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamificationPackage.BADGE__LEADERBOARDS,
							oldLeaderboards, leaderboards));
			}
		}
		return leaderboards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leaderboards basicGetLeaderboards() {
		return leaderboards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaderboards(Leaderboards newLeaderboards) {
		Leaderboards oldLeaderboards = leaderboards;
		leaderboards = newLeaderboards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamificationPackage.BADGE__LEADERBOARDS,
					oldLeaderboards, leaderboards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GamificationPackage.BADGE__REWARD:
			return getReward();
		case GamificationPackage.BADGE__SHAPES:
			return getShapes();
		case GamificationPackage.BADGE__LEADERBOARDS:
			if (resolve)
				return getLeaderboards();
			return basicGetLeaderboards();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GamificationPackage.BADGE__REWARD:
			setReward((String) newValue);
			return;
		case GamificationPackage.BADGE__SHAPES:
			setShapes((Shapes) newValue);
			return;
		case GamificationPackage.BADGE__LEADERBOARDS:
			setLeaderboards((Leaderboards) newValue);
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
		case GamificationPackage.BADGE__REWARD:
			setReward(REWARD_EDEFAULT);
			return;
		case GamificationPackage.BADGE__SHAPES:
			setShapes(SHAPES_EDEFAULT);
			return;
		case GamificationPackage.BADGE__LEADERBOARDS:
			setLeaderboards((Leaderboards) null);
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
		case GamificationPackage.BADGE__REWARD:
			return REWARD_EDEFAULT == null ? reward != null : !REWARD_EDEFAULT.equals(reward);
		case GamificationPackage.BADGE__SHAPES:
			return shapes != SHAPES_EDEFAULT;
		case GamificationPackage.BADGE__LEADERBOARDS:
			return leaderboards != null;
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
		result.append(" (reward: ");
		result.append(reward);
		result.append(", shapes: ");
		result.append(shapes);
		result.append(')');
		return result.toString();
	}

} //BAdgeImpl
