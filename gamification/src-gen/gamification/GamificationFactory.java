/**
 */
package gamification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gamification.GamificationPackage
 * @generated
 */
public interface GamificationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GamificationFactory eINSTANCE = gamification.impl.GamificationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gamified Pack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gamified Pack</em>'.
	 * @generated
	 */
	GamifiedPack createGamifiedPack();

	/**
	 * Returns a new object of class '<em>Dynamics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamics</em>'.
	 * @generated
	 */
	Dynamics createDynamics();

	/**
	 * Returns a new object of class '<em>Mechanics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mechanics</em>'.
	 * @generated
	 */
	Mechanics createMechanics();

	/**
	 * Returns a new object of class '<em>Aesthetics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aesthetics</em>'.
	 * @generated
	 */
	Aesthetics createAesthetics();

	/**
	 * Returns a new object of class '<em>BAdge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BAdge</em>'.
	 * @generated
	 */
	BAdge createBAdge();

	/**
	 * Returns a new object of class '<em>Progress</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Progress</em>'.
	 * @generated
	 */
	Progress createProgress();

	/**
	 * Returns a new object of class '<em>Leaderboards</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaderboards</em>'.
	 * @generated
	 */
	Leaderboards createLeaderboards();

	/**
	 * Returns a new object of class '<em>Points</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Points</em>'.
	 * @generated
	 */
	Points createPoints();

	/**
	 * Returns a new object of class '<em>Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Level</em>'.
	 * @generated
	 */
	Level createLevel();

	/**
	 * Returns a new object of class '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time</em>'.
	 * @generated
	 */
	Time createTime();

	/**
	 * Returns a new object of class '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification</em>'.
	 * @generated
	 */
	Notification createNotification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GamificationPackage getGamificationPackage();

} //GamificationFactory
