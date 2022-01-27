/**
 */
package gamification.impl;

import gamification.GamificationPackage;
import gamification.Points;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Points</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gamification.impl.PointsImpl#getTotalPoints <em>Total Points</em>}</li>
 *   <li>{@link gamification.impl.PointsImpl#getObtainedPoints <em>Obtained Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointsImpl extends MechanicsImpl implements Points {
	/**
	 * The default value of the '{@link #getTotalPoints() <em>Total Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalPoints() <em>Total Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPoints()
	 * @generated
	 * @ordered
	 */
	protected int totalPoints = TOTAL_POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getObtainedPoints() <em>Obtained Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObtainedPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int OBTAINED_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getObtainedPoints() <em>Obtained Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObtainedPoints()
	 * @generated
	 * @ordered
	 */
	protected int obtainedPoints = OBTAINED_POINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamificationPackage.Literals.POINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalPoints() {
		return totalPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalPoints(int newTotalPoints) {
		int oldTotalPoints = totalPoints;
		totalPoints = newTotalPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamificationPackage.POINTS__TOTAL_POINTS,
					oldTotalPoints, totalPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getObtainedPoints() {
		return obtainedPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObtainedPoints(int newObtainedPoints) {
		int oldObtainedPoints = obtainedPoints;
		obtainedPoints = newObtainedPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamificationPackage.POINTS__OBTAINED_POINTS,
					oldObtainedPoints, obtainedPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GamificationPackage.POINTS__TOTAL_POINTS:
			return getTotalPoints();
		case GamificationPackage.POINTS__OBTAINED_POINTS:
			return getObtainedPoints();
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
		case GamificationPackage.POINTS__TOTAL_POINTS:
			setTotalPoints((Integer) newValue);
			return;
		case GamificationPackage.POINTS__OBTAINED_POINTS:
			setObtainedPoints((Integer) newValue);
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
		case GamificationPackage.POINTS__TOTAL_POINTS:
			setTotalPoints(TOTAL_POINTS_EDEFAULT);
			return;
		case GamificationPackage.POINTS__OBTAINED_POINTS:
			setObtainedPoints(OBTAINED_POINTS_EDEFAULT);
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
		case GamificationPackage.POINTS__TOTAL_POINTS:
			return totalPoints != TOTAL_POINTS_EDEFAULT;
		case GamificationPackage.POINTS__OBTAINED_POINTS:
			return obtainedPoints != OBTAINED_POINTS_EDEFAULT;
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
		result.append(" (totalPoints: ");
		result.append(totalPoints);
		result.append(", ObtainedPoints: ");
		result.append(obtainedPoints);
		result.append(')');
		return result.toString();
	}

} //PointsImpl
