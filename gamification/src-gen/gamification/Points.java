/**
 */
package gamification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Points</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamification.Points#getTotalPoints <em>Total Points</em>}</li>
 *   <li>{@link gamification.Points#getObtainedPoints <em>Obtained Points</em>}</li>
 * </ul>
 *
 * @see gamification.GamificationPackage#getPoints()
 * @model
 * @generated
 */
public interface Points extends Mechanics {
	/**
	 * Returns the value of the '<em><b>Total Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Points</em>' attribute.
	 * @see #setTotalPoints(int)
	 * @see gamification.GamificationPackage#getPoints_TotalPoints()
	 * @model
	 * @generated
	 */
	int getTotalPoints();

	/**
	 * Sets the value of the '{@link gamification.Points#getTotalPoints <em>Total Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Points</em>' attribute.
	 * @see #getTotalPoints()
	 * @generated
	 */
	void setTotalPoints(int value);

	/**
	 * Returns the value of the '<em><b>Obtained Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obtained Points</em>' attribute.
	 * @see #setObtainedPoints(int)
	 * @see gamification.GamificationPackage#getPoints_ObtainedPoints()
	 * @model
	 * @generated
	 */
	int getObtainedPoints();

	/**
	 * Sets the value of the '{@link gamification.Points#getObtainedPoints <em>Obtained Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obtained Points</em>' attribute.
	 * @see #getObtainedPoints()
	 * @generated
	 */
	void setObtainedPoints(int value);

} // Points
