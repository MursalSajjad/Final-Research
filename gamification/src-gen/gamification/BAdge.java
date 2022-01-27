/**
 */
package gamification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BAdge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamification.BAdge#getReward <em>Reward</em>}</li>
 *   <li>{@link gamification.BAdge#getShapes <em>Shapes</em>}</li>
 *   <li>{@link gamification.BAdge#getLeaderboards <em>Leaderboards</em>}</li>
 * </ul>
 *
 * @see gamification.GamificationPackage#getBAdge()
 * @model
 * @generated
 */
public interface BAdge extends Mechanics {
	/**
	 * Returns the value of the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reward</em>' attribute.
	 * @see #setReward(String)
	 * @see gamification.GamificationPackage#getBAdge_Reward()
	 * @model
	 * @generated
	 */
	String getReward();

	/**
	 * Sets the value of the '{@link gamification.BAdge#getReward <em>Reward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reward</em>' attribute.
	 * @see #getReward()
	 * @generated
	 */
	void setReward(String value);

	/**
	 * Returns the value of the '<em><b>Shapes</b></em>' attribute.
	 * The literals are from the enumeration {@link gamification.Shapes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shapes</em>' attribute.
	 * @see gamification.Shapes
	 * @see #setShapes(Shapes)
	 * @see gamification.GamificationPackage#getBAdge_Shapes()
	 * @model
	 * @generated
	 */
	Shapes getShapes();

	/**
	 * Sets the value of the '{@link gamification.BAdge#getShapes <em>Shapes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shapes</em>' attribute.
	 * @see gamification.Shapes
	 * @see #getShapes()
	 * @generated
	 */
	void setShapes(Shapes value);

	/**
	 * Returns the value of the '<em><b>Leaderboards</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaderboards</em>' reference.
	 * @see #setLeaderboards(Leaderboards)
	 * @see gamification.GamificationPackage#getBAdge_Leaderboards()
	 * @model
	 * @generated
	 */
	Leaderboards getLeaderboards();

	/**
	 * Sets the value of the '{@link gamification.BAdge#getLeaderboards <em>Leaderboards</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leaderboards</em>' reference.
	 * @see #getLeaderboards()
	 * @generated
	 */
	void setLeaderboards(Leaderboards value);

} // BAdge
