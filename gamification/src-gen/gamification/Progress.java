/**
 */
package gamification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Progress</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamification.Progress#getNotification <em>Notification</em>}</li>
 *   <li>{@link gamification.Progress#getNotificationn <em>Notificationn</em>}</li>
 * </ul>
 *
 * @see gamification.GamificationPackage#getProgress()
 * @model
 * @generated
 */
public interface Progress extends Mechanics {

	/**
	 * Returns the value of the '<em><b>Notification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification</em>' reference.
	 * @see #setNotification(Notification)
	 * @see gamification.GamificationPackage#getProgress_Notification()
	 * @model
	 * @generated
	 */
	Notification getNotification();

	/**
	 * Sets the value of the '{@link gamification.Progress#getNotification <em>Notification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification</em>' reference.
	 * @see #getNotification()
	 * @generated
	 */
	void setNotification(Notification value);

	/**
	 * Returns the value of the '<em><b>Notificationn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notificationn</em>' reference.
	 * @see #setNotificationn(Notification)
	 * @see gamification.GamificationPackage#getProgress_Notificationn()
	 * @model
	 * @generated
	 */
	Notification getNotificationn();

	/**
	 * Sets the value of the '{@link gamification.Progress#getNotificationn <em>Notificationn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notificationn</em>' reference.
	 * @see #getNotificationn()
	 * @generated
	 */
	void setNotificationn(Notification value);
} // Progress
