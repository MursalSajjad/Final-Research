/**
 */
package gamification.impl;

import gamification.BAdge;
import gamification.GamificationPackage;
import gamification.Level;

import gamification.Points;
import gamification.Progress;
import gamification.Time;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gamification.impl.LevelImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link gamification.impl.LevelImpl#getActualValue <em>Actual Value</em>}</li>
 *   <li>{@link gamification.impl.LevelImpl#getMinVAlue <em>Min VAlue</em>}</li>
 *   <li>{@link gamification.impl.LevelImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link gamification.impl.LevelImpl#getBadge <em>Badge</em>}</li>
 *   <li>{@link gamification.impl.LevelImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link gamification.impl.LevelImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LevelImpl extends MechanicsImpl implements Level {
	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected int maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualValue() <em>Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualValue()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTUAL_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActualValue() <em>Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualValue()
	 * @generated
	 * @ordered
	 */
	protected int actualValue = ACTUAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinVAlue() <em>Min VAlue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVAlue()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinVAlue() <em>Min VAlue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVAlue()
	 * @generated
	 * @ordered
	 */
	protected int minVAlue = MIN_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected Points points;

	/**
	 * The cached value of the '{@link #getBadge() <em>Badge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadge()
	 * @generated
	 * @ordered
	 */
	protected BAdge badge;

	/**
	 * The cached value of the '{@link #getProgress() <em>Progress</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected Progress progress;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Time time;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamificationPackage.Literals.LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(int newMaxValue) {
		int oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamificationPackage.LEVEL__MAX_VALUE, oldMaxValue,
					maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActualValue() {
		return actualValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualValue(int newActualValue) {
		int oldActualValue = actualValue;
		actualValue = newActualValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamificationPackage.LEVEL__ACTUAL_VALUE,
					oldActualValue, actualValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinVAlue() {
		return minVAlue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVAlue(int newMinVAlue) {
		int oldMinVAlue = minVAlue;
		minVAlue = newMinVAlue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamificationPackage.LEVEL__MIN_VALUE, oldMinVAlue,
					minVAlue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Points getPoints() {
		if (points != null && points.eIsProxy()) {
			InternalEObject oldPoints = (InternalEObject) points;
			points = (Points) eResolveProxy(oldPoints);
			if (points != oldPoints) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamificationPackage.LEVEL__POINTS,
							oldPoints, points));
			}
		}
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Points basicGetPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(Points newPoints) {
		Points oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamificationPackage.LEVEL__POINTS, oldPoints,
					points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAdge getBadge() {
		if (badge != null && badge.eIsProxy()) {
			InternalEObject oldBadge = (InternalEObject) badge;
			badge = (BAdge) eResolveProxy(oldBadge);
			if (badge != oldBadge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamificationPackage.LEVEL__BADGE,
							oldBadge, badge));
			}
		}
		return badge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAdge basicGetBadge() {
		return badge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBadge(BAdge newBadge) {
		BAdge oldBadge = badge;
		badge = newBadge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamificationPackage.LEVEL__BADGE, oldBadge, badge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Progress getProgress() {
		if (progress != null && progress.eIsProxy()) {
			InternalEObject oldProgress = (InternalEObject) progress;
			progress = (Progress) eResolveProxy(oldProgress);
			if (progress != oldProgress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamificationPackage.LEVEL__PROGRESS,
							oldProgress, progress));
			}
		}
		return progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Progress basicGetProgress() {
		return progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgress(Progress newProgress) {
		Progress oldProgress = progress;
		progress = newProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamificationPackage.LEVEL__PROGRESS, oldProgress,
					progress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getTime() {
		if (time != null && time.eIsProxy()) {
			InternalEObject oldTime = (InternalEObject) time;
			time = (Time) eResolveProxy(oldTime);
			if (time != oldTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamificationPackage.LEVEL__TIME, oldTime,
							time));
			}
		}
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time basicGetTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Time newTime) {
		Time oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamificationPackage.LEVEL__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GamificationPackage.LEVEL__MAX_VALUE:
			return getMaxValue();
		case GamificationPackage.LEVEL__ACTUAL_VALUE:
			return getActualValue();
		case GamificationPackage.LEVEL__MIN_VALUE:
			return getMinVAlue();
		case GamificationPackage.LEVEL__POINTS:
			if (resolve)
				return getPoints();
			return basicGetPoints();
		case GamificationPackage.LEVEL__BADGE:
			if (resolve)
				return getBadge();
			return basicGetBadge();
		case GamificationPackage.LEVEL__PROGRESS:
			if (resolve)
				return getProgress();
			return basicGetProgress();
		case GamificationPackage.LEVEL__TIME:
			if (resolve)
				return getTime();
			return basicGetTime();
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
		case GamificationPackage.LEVEL__MAX_VALUE:
			setMaxValue((Integer) newValue);
			return;
		case GamificationPackage.LEVEL__ACTUAL_VALUE:
			setActualValue((Integer) newValue);
			return;
		case GamificationPackage.LEVEL__MIN_VALUE:
			setMinVAlue((Integer) newValue);
			return;
		case GamificationPackage.LEVEL__POINTS:
			setPoints((Points) newValue);
			return;
		case GamificationPackage.LEVEL__BADGE:
			setBadge((BAdge) newValue);
			return;
		case GamificationPackage.LEVEL__PROGRESS:
			setProgress((Progress) newValue);
			return;
		case GamificationPackage.LEVEL__TIME:
			setTime((Time) newValue);
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
		case GamificationPackage.LEVEL__MAX_VALUE:
			setMaxValue(MAX_VALUE_EDEFAULT);
			return;
		case GamificationPackage.LEVEL__ACTUAL_VALUE:
			setActualValue(ACTUAL_VALUE_EDEFAULT);
			return;
		case GamificationPackage.LEVEL__MIN_VALUE:
			setMinVAlue(MIN_VALUE_EDEFAULT);
			return;
		case GamificationPackage.LEVEL__POINTS:
			setPoints((Points) null);
			return;
		case GamificationPackage.LEVEL__BADGE:
			setBadge((BAdge) null);
			return;
		case GamificationPackage.LEVEL__PROGRESS:
			setProgress((Progress) null);
			return;
		case GamificationPackage.LEVEL__TIME:
			setTime((Time) null);
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
		case GamificationPackage.LEVEL__MAX_VALUE:
			return maxValue != MAX_VALUE_EDEFAULT;
		case GamificationPackage.LEVEL__ACTUAL_VALUE:
			return actualValue != ACTUAL_VALUE_EDEFAULT;
		case GamificationPackage.LEVEL__MIN_VALUE:
			return minVAlue != MIN_VALUE_EDEFAULT;
		case GamificationPackage.LEVEL__POINTS:
			return points != null;
		case GamificationPackage.LEVEL__BADGE:
			return badge != null;
		case GamificationPackage.LEVEL__PROGRESS:
			return progress != null;
		case GamificationPackage.LEVEL__TIME:
			return time != null;
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
		result.append(" (maxValue: ");
		result.append(maxValue);
		result.append(", actualValue: ");
		result.append(actualValue);
		result.append(", minVAlue: ");
		result.append(minVAlue);
		result.append(')');
		return result.toString();
	}

} //LevelImpl
