/**
 */
package gamification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamification.Level#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link gamification.Level#getActualValue <em>Actual Value</em>}</li>
 *   <li>{@link gamification.Level#getMinVAlue <em>Min VAlue</em>}</li>
 *   <li>{@link gamification.Level#getPoints <em>Points</em>}</li>
 *   <li>{@link gamification.Level#getBadge <em>Badge</em>}</li>
 *   <li>{@link gamification.Level#getProgress <em>Progress</em>}</li>
 *   <li>{@link gamification.Level#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see gamification.GamificationPackage#getLevel()
 * @model
 * @generated
 */
public interface Level extends Mechanics {
	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(int)
	 * @see gamification.GamificationPackage#getLevel_MaxValue()
	 * @model
	 * @generated
	 */
	int getMaxValue();

	/**
	 * Sets the value of the '{@link gamification.Level#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(int value);

	/**
	 * Returns the value of the '<em><b>Actual Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Value</em>' attribute.
	 * @see #setActualValue(int)
	 * @see gamification.GamificationPackage#getLevel_ActualValue()
	 * @model
	 * @generated
	 */
	int getActualValue();

	/**
	 * Sets the value of the '{@link gamification.Level#getActualValue <em>Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Value</em>' attribute.
	 * @see #getActualValue()
	 * @generated
	 */
	void setActualValue(int value);

	/**
	 * Returns the value of the '<em><b>Min VAlue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min VAlue</em>' attribute.
	 * @see #setMinVAlue(int)
	 * @see gamification.GamificationPackage#getLevel_MinVAlue()
	 * @model
	 * @generated
	 */
	int getMinVAlue();

	/**
	 * Sets the value of the '{@link gamification.Level#getMinVAlue <em>Min VAlue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min VAlue</em>' attribute.
	 * @see #getMinVAlue()
	 * @generated
	 */
	void setMinVAlue(int value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' reference.
	 * @see #setPoints(Points)
	 * @see gamification.GamificationPackage#getLevel_Points()
	 * @model
	 * @generated
	 */
	Points getPoints();

	/**
	 * Sets the value of the '{@link gamification.Level#getPoints <em>Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' reference.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(Points value);

	/**
	 * Returns the value of the '<em><b>Badge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Badge</em>' reference.
	 * @see #setBadge(BAdge)
	 * @see gamification.GamificationPackage#getLevel_Badge()
	 * @model required="true"
	 * @generated
	 */
	BAdge getBadge();

	/**
	 * Sets the value of the '{@link gamification.Level#getBadge <em>Badge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Badge</em>' reference.
	 * @see #getBadge()
	 * @generated
	 */
	void setBadge(BAdge value);

	/**
	 * Returns the value of the '<em><b>Progress</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress</em>' reference.
	 * @see #setProgress(Progress)
	 * @see gamification.GamificationPackage#getLevel_Progress()
	 * @model required="true"
	 * @generated
	 */
	Progress getProgress();

	/**
	 * Sets the value of the '{@link gamification.Level#getProgress <em>Progress</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress</em>' reference.
	 * @see #getProgress()
	 * @generated
	 */
	void setProgress(Progress value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' reference.
	 * @see #setTime(Time)
	 * @see gamification.GamificationPackage#getLevel_Time()
	 * @model required="true"
	 * @generated
	 */
	Time getTime();

	/**
	 * Sets the value of the '{@link gamification.Level#getTime <em>Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Time value);

} // Level
