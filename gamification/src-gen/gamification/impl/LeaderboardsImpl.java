/**
 */
package gamification.impl;

import gamification.GamificationPackage;
import gamification.Leaderboards;

import gamification.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leaderboards</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gamification.impl.LeaderboardsImpl#getNotification <em>Notification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeaderboardsImpl extends MechanicsImpl implements Leaderboards {
	/**
	 * The cached value of the '{@link #getNotification() <em>Notification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotification()
	 * @generated
	 * @ordered
	 */
	protected Notification notification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeaderboardsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamificationPackage.Literals.LEADERBOARDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notification getNotification() {
		if (notification != null && notification.eIsProxy()) {
			InternalEObject oldNotification = (InternalEObject) notification;
			notification = (Notification) eResolveProxy(oldNotification);
			if (notification != oldNotification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.RESOLVE,
							GamificationPackage.LEADERBOARDS__NOTIFICATION, oldNotification, notification));
			}
		}
		return notification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notification basicGetNotification() {
		return notification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotification(Notification newNotification) {
		Notification oldNotification = notification;
		notification = newNotification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					GamificationPackage.LEADERBOARDS__NOTIFICATION, oldNotification, notification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GamificationPackage.LEADERBOARDS__NOTIFICATION:
			if (resolve)
				return getNotification();
			return basicGetNotification();
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
		case GamificationPackage.LEADERBOARDS__NOTIFICATION:
			setNotification((Notification) newValue);
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
		case GamificationPackage.LEADERBOARDS__NOTIFICATION:
			setNotification((Notification) null);
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
		case GamificationPackage.LEADERBOARDS__NOTIFICATION:
			return notification != null;
		}
		return super.eIsSet(featureID);
	}

} //LeaderboardsImpl
