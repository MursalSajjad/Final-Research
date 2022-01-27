/**
 */
package gamification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamification.Time#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link gamification.Time#getTotalTime <em>Total Time</em>}</li>
 * </ul>
 *
 * @see gamification.GamificationPackage#getTime()
 * @model
 * @generated
 */
public interface Time extends Mechanics {
	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(String)
	 * @see gamification.GamificationPackage#getTime_MaxTime()
	 * @model
	 * @generated
	 */
	String getMaxTime();

	/**
	 * Sets the value of the '{@link gamification.Time#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(String value);

	/**
	 * Returns the value of the '<em><b>Total Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Time</em>' attribute.
	 * @see #setTotalTime(String)
	 * @see gamification.GamificationPackage#getTime_TotalTime()
	 * @model
	 * @generated
	 */
	String getTotalTime();

	/**
	 * Sets the value of the '{@link gamification.Time#getTotalTime <em>Total Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Time</em>' attribute.
	 * @see #getTotalTime()
	 * @generated
	 */
	void setTotalTime(String value);

} // Time
