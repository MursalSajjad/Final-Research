/**
 */
package gamification.impl;

import gamification.GamificationPackage;
import gamification.Notification;
import gamification.Progress;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Progress</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gamification.impl.ProgressImpl#getNotification <em>Notification</em>}</li>
 *   <li>{@link gamification.impl.ProgressImpl#getNotificationn <em>Notificationn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgressImpl extends MechanicsImpl implements Progress {
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
	 * The cached value of the '{@link #getNotificationn() <em>Notificationn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationn()
	 * @generated
	 * @ordered
	 */
	protected Notification notificationn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamificationPackage.Literals.PROGRESS;
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
							GamificationPackage.PROGRESS__NOTIFICATION, oldNotification, notification));
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
					GamificationPackage.PROGRESS__NOTIFICATION, oldNotification, notification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notification getNotificationn() {
		if (notificationn != null && notificationn.eIsProxy()) {
			InternalEObject oldNotificationn = (InternalEObject) notificationn;
			notificationn = (Notification) eResolveProxy(oldNotificationn);
			if (notificationn != oldNotificationn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.RESOLVE,
							GamificationPackage.PROGRESS__NOTIFICATIONN, oldNotificationn, notificationn));
			}
		}
		return notificationn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notification basicGetNotificationn() {
		return notificationn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationn(Notification newNotificationn) {
		Notification oldNotificationn = notificationn;
		notificationn = newNotificationn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					GamificationPackage.PROGRESS__NOTIFICATIONN, oldNotificationn, notificationn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GamificationPackage.PROGRESS__NOTIFICATION:
			if (resolve)
				return getNotification();
			return basicGetNotification();
		case GamificationPackage.PROGRESS__NOTIFICATIONN:
			if (resolve)
				return getNotificationn();
			return basicGetNotificationn();
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
		case GamificationPackage.PROGRESS__NOTIFICATION:
			setNotification((Notification) newValue);
			return;
		case GamificationPackage.PROGRESS__NOTIFICATIONN:
			setNotificationn((Notification) newValue);
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
		case GamificationPackage.PROGRESS__NOTIFICATION:
			setNotification((Notification) null);
			return;
		case GamificationPackage.PROGRESS__NOTIFICATIONN:
			setNotificationn((Notification) null);
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
		case GamificationPackage.PROGRESS__NOTIFICATION:
			return notification != null;
		case GamificationPackage.PROGRESS__NOTIFICATIONN:
			return notificationn != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgressImpl
