/**
 */
package gamification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaderboards</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamification.Leaderboards#getNotification <em>Notification</em>}</li>
 * </ul>
 *
 * @see gamification.GamificationPackage#getLeaderboards()
 * @model
 * @generated
 */
public interface Leaderboards extends Mechanics {

	/**
	 * Returns the value of the '<em><b>Notification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification</em>' reference.
	 * @see #setNotification(Notification)
	 * @see gamification.GamificationPackage#getLeaderboards_Notification()
	 * @model
	 * @generated
	 */
	Notification getNotification();

	/**
	 * Sets the value of the '{@link gamification.Leaderboards#getNotification <em>Notification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification</em>' reference.
	 * @see #getNotification()
	 * @generated
	 */
	void setNotification(Notification value);
} // Leaderboards
