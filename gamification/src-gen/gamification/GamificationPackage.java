/**
 */
package gamification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gamification.GamificationFactory
 * @model kind="package"
 * @generated
 */
public interface GamificationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gamification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/gamification";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gamification";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GamificationPackage eINSTANCE = gamification.impl.GamificationPackageImpl.init();

	/**
	 * The meta object id for the '{@link gamification.impl.GamifiedPackImpl <em>Gamified Pack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamification.impl.GamifiedPackImpl
	 * @see gamification.impl.GamificationPackageImpl#getGamifiedPack()
	 * @generated
	 */
	int GAMIFIED_PACK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMIFIED_PACK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mechanics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMIFIED_PACK__MECHANICS = 1;

	/**
	 * The feature id for the '<em><b>Aesthetics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMIFIED_PACK__AESTHETICS = 2;

	/**
	 * The feature id for the '<em><b>Dynamics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMIFIED_PACK__DYNAMICS = 3;

	/**
	 * The number of structural features of the '<em>Gamified Pack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMIFIED_PACK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Gamified Pack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMIFIED_PACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gamification.impl.DynamicsImpl <em>Dynamics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamification.impl.DynamicsImpl
	 * @see gamification.impl.GamificationPackageImpl#getDynamics()
	 * @generated
	 */
	int DYNAMICS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Dynamics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dynamics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gamification.impl.MechanicsImpl <em>Mechanics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamification.impl.MechanicsImpl
	 * @see gamification.impl.GamificationPackageImpl#getMechanics()
	 * @generated
	 */
	int MECHANICS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICS__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Mechanics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mechanics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gamification.impl.AestheticsImpl <em>Aesthetics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamification.impl.AestheticsImpl
	 * @see gamification.impl.GamificationPackageImpl#getAesthetics()
	 * @generated
	 */
	int AESTHETICS = 3;

	/**
	 * The number of structural features of the '<em>Aesthetics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AESTHETICS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Aesthetics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AESTHETICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gamification.impl.BAdgeImpl <em>BAdge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamification.impl.BAdgeImpl
	 * @see gamification.impl.GamificationPackageImpl#getBAdge()
	 * @generated
	 */
	int BADGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__NAME = MECHANICS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__TYPE = MECHANICS__TYPE;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__REWARD = MECHANICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shapes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__SHAPES = MECHANICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Leaderboards</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__LEADERBOARDS = MECHANICS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BAdge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_FEATURE_COUNT = MECHANICS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BAdge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_OPERATION_COUNT = MECHANICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gamification.impl.ProgressImpl <em>Progress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamification.impl.ProgressImpl
	 * @see gamification.impl.GamificationPackageImpl#getProgress()
	 * @generated
	 */
	int PROGRESS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS__NAME = MECHANICS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS__TYPE = MECHANICS__TYPE;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS__NOTIFICATION = MECHANICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Notificationn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS__NOTIFICATIONN = MECHANICS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Progress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_FEATURE_COUNT = MECHANICS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Progress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_OPERATION_COUNT = MECHANICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gamification.impl.LeaderboardsImpl <em>Leaderboards</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamification.impl.LeaderboardsImpl
	 * @see gamification.impl.GamificationPackageImpl#getLeaderboards()
	 * @generated
	 */
	int LEADERBOARDS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARDS__NAME = MECHANICS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARDS__TYPE = MECHANICS__TYPE;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARDS__NOTIFICATION = MECHANICS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Leaderboards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARDS_FEATURE_COUNT = MECHANICS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Leaderboards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARDS_OPERATION_COUNT = MECHANICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gamification.impl.PointsImpl <em>Points</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamification.impl.PointsImpl
	 * @see gamification.impl.GamificationPackageImpl#getPoints()
	 * @generated
	 */
	int POINTS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTS__NAME = MECHANICS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTS__TYPE = MECHANICS__TYPE;

	/**
	 * The feature id for the '<em><b>Total Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTS__TOTAL_POINTS = MECHANICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Obtained Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTS__OBTAINED_POINTS = MECHANICS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Points</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTS_FEATURE_COUNT = MECHANICS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Points</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTS_OPERATION_COUNT = MECHANICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gamification.impl.LevelImpl <em>Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamification.impl.LevelImpl
	 * @see gamification.impl.GamificationPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__NAME = MECHANICS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__TYPE = MECHANICS__TYPE;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__MAX_VALUE = MECHANICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__ACTUAL_VALUE = MECHANICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min VAlue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__MIN_VALUE = MECHANICS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__POINTS = MECHANICS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Badge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__BADGE = MECHANICS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__PROGRESS = MECHANICS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__TIME = MECHANICS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_FEATURE_COUNT = MECHANICS_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OPERATION_COUNT = MECHANICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gamification.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamification.impl.TimeImpl
	 * @see gamification.impl.GamificationPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__NAME = MECHANICS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__TYPE = MECHANICS__TYPE;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__MAX_TIME = MECHANICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Total Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__TOTAL_TIME = MECHANICS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = MECHANICS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = MECHANICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gamification.impl.NotificationImpl <em>Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamification.impl.NotificationImpl
	 * @see gamification.impl.GamificationPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__NAME = MECHANICS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__TYPE = MECHANICS__TYPE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__MESSAGE = MECHANICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__ICON = MECHANICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__SOUND = MECHANICS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FEATURE_COUNT = MECHANICS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_OPERATION_COUNT = MECHANICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gamification.Shapes <em>Shapes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamification.Shapes
	 * @see gamification.impl.GamificationPackageImpl#getShapes()
	 * @generated
	 */
	int SHAPES = 11;

	/**
	 * The meta object id for the '{@link gamification.MechanicType <em>Mechanic Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamification.MechanicType
	 * @see gamification.impl.GamificationPackageImpl#getMechanicType()
	 * @generated
	 */
	int MECHANIC_TYPE = 12;

	/**
	 * Returns the meta object for class '{@link gamification.GamifiedPack <em>Gamified Pack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gamified Pack</em>'.
	 * @see gamification.GamifiedPack
	 * @generated
	 */
	EClass getGamifiedPack();

	/**
	 * Returns the meta object for the attribute '{@link gamification.GamifiedPack#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gamification.GamifiedPack#getName()
	 * @see #getGamifiedPack()
	 * @generated
	 */
	EAttribute getGamifiedPack_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link gamification.GamifiedPack#getMechanics <em>Mechanics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mechanics</em>'.
	 * @see gamification.GamifiedPack#getMechanics()
	 * @see #getGamifiedPack()
	 * @generated
	 */
	EReference getGamifiedPack_Mechanics();

	/**
	 * Returns the meta object for the containment reference list '{@link gamification.GamifiedPack#getAesthetics <em>Aesthetics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aesthetics</em>'.
	 * @see gamification.GamifiedPack#getAesthetics()
	 * @see #getGamifiedPack()
	 * @generated
	 */
	EReference getGamifiedPack_Aesthetics();

	/**
	 * Returns the meta object for the containment reference list '{@link gamification.GamifiedPack#getDynamics <em>Dynamics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamics</em>'.
	 * @see gamification.GamifiedPack#getDynamics()
	 * @see #getGamifiedPack()
	 * @generated
	 */
	EReference getGamifiedPack_Dynamics();

	/**
	 * Returns the meta object for class '{@link gamification.Dynamics <em>Dynamics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamics</em>'.
	 * @see gamification.Dynamics
	 * @generated
	 */
	EClass getDynamics();

	/**
	 * Returns the meta object for the attribute '{@link gamification.Dynamics#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gamification.Dynamics#getName()
	 * @see #getDynamics()
	 * @generated
	 */
	EAttribute getDynamics_Name();

	/**
	 * Returns the meta object for class '{@link gamification.Mechanics <em>Mechanics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mechanics</em>'.
	 * @see gamification.Mechanics
	 * @generated
	 */
	EClass getMechanics();

	/**
	 * Returns the meta object for the attribute '{@link gamification.Mechanics#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gamification.Mechanics#getName()
	 * @see #getMechanics()
	 * @generated
	 */
	EAttribute getMechanics_Name();

	/**
	 * Returns the meta object for the attribute '{@link gamification.Mechanics#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gamification.Mechanics#getType()
	 * @see #getMechanics()
	 * @generated
	 */
	EAttribute getMechanics_Type();

	/**
	 * Returns the meta object for class '{@link gamification.Aesthetics <em>Aesthetics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aesthetics</em>'.
	 * @see gamification.Aesthetics
	 * @generated
	 */
	EClass getAesthetics();

	/**
	 * Returns the meta object for class '{@link gamification.BAdge <em>BAdge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BAdge</em>'.
	 * @see gamification.BAdge
	 * @generated
	 */
	EClass getBAdge();

	/**
	 * Returns the meta object for the attribute '{@link gamification.BAdge#getReward <em>Reward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reward</em>'.
	 * @see gamification.BAdge#getReward()
	 * @see #getBAdge()
	 * @generated
	 */
	EAttribute getBAdge_Reward();

	/**
	 * Returns the meta object for the attribute '{@link gamification.BAdge#getShapes <em>Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shapes</em>'.
	 * @see gamification.BAdge#getShapes()
	 * @see #getBAdge()
	 * @generated
	 */
	EAttribute getBAdge_Shapes();

	/**
	 * Returns the meta object for the reference '{@link gamification.BAdge#getLeaderboards <em>Leaderboards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leaderboards</em>'.
	 * @see gamification.BAdge#getLeaderboards()
	 * @see #getBAdge()
	 * @generated
	 */
	EReference getBAdge_Leaderboards();

	/**
	 * Returns the meta object for class '{@link gamification.Progress <em>Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progress</em>'.
	 * @see gamification.Progress
	 * @generated
	 */
	EClass getProgress();

	/**
	 * Returns the meta object for the reference '{@link gamification.Progress#getNotification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notification</em>'.
	 * @see gamification.Progress#getNotification()
	 * @see #getProgress()
	 * @generated
	 */
	EReference getProgress_Notification();

	/**
	 * Returns the meta object for the reference '{@link gamification.Progress#getNotificationn <em>Notificationn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notificationn</em>'.
	 * @see gamification.Progress#getNotificationn()
	 * @see #getProgress()
	 * @generated
	 */
	EReference getProgress_Notificationn();

	/**
	 * Returns the meta object for class '{@link gamification.Leaderboards <em>Leaderboards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaderboards</em>'.
	 * @see gamification.Leaderboards
	 * @generated
	 */
	EClass getLeaderboards();

	/**
	 * Returns the meta object for the reference '{@link gamification.Leaderboards#getNotification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notification</em>'.
	 * @see gamification.Leaderboards#getNotification()
	 * @see #getLeaderboards()
	 * @generated
	 */
	EReference getLeaderboards_Notification();

	/**
	 * Returns the meta object for class '{@link gamification.Points <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Points</em>'.
	 * @see gamification.Points
	 * @generated
	 */
	EClass getPoints();

	/**
	 * Returns the meta object for the attribute '{@link gamification.Points#getTotalPoints <em>Total Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Points</em>'.
	 * @see gamification.Points#getTotalPoints()
	 * @see #getPoints()
	 * @generated
	 */
	EAttribute getPoints_TotalPoints();

	/**
	 * Returns the meta object for the attribute '{@link gamification.Points#getObtainedPoints <em>Obtained Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obtained Points</em>'.
	 * @see gamification.Points#getObtainedPoints()
	 * @see #getPoints()
	 * @generated
	 */
	EAttribute getPoints_ObtainedPoints();

	/**
	 * Returns the meta object for class '{@link gamification.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level</em>'.
	 * @see gamification.Level
	 * @generated
	 */
	EClass getLevel();

	/**
	 * Returns the meta object for the attribute '{@link gamification.Level#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see gamification.Level#getMaxValue()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link gamification.Level#getActualValue <em>Actual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Value</em>'.
	 * @see gamification.Level#getActualValue()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_ActualValue();

	/**
	 * Returns the meta object for the attribute '{@link gamification.Level#getMinVAlue <em>Min VAlue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min VAlue</em>'.
	 * @see gamification.Level#getMinVAlue()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_MinVAlue();

	/**
	 * Returns the meta object for the reference '{@link gamification.Level#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Points</em>'.
	 * @see gamification.Level#getPoints()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Points();

	/**
	 * Returns the meta object for the reference '{@link gamification.Level#getBadge <em>Badge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Badge</em>'.
	 * @see gamification.Level#getBadge()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Badge();

	/**
	 * Returns the meta object for the reference '{@link gamification.Level#getProgress <em>Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Progress</em>'.
	 * @see gamification.Level#getProgress()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Progress();

	/**
	 * Returns the meta object for the reference '{@link gamification.Level#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time</em>'.
	 * @see gamification.Level#getTime()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Time();

	/**
	 * Returns the meta object for class '{@link gamification.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see gamification.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link gamification.Time#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time</em>'.
	 * @see gamification.Time#getMaxTime()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_MaxTime();

	/**
	 * Returns the meta object for the attribute '{@link gamification.Time#getTotalTime <em>Total Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Time</em>'.
	 * @see gamification.Time#getTotalTime()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_TotalTime();

	/**
	 * Returns the meta object for class '{@link gamification.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification</em>'.
	 * @see gamification.Notification
	 * @generated
	 */
	EClass getNotification();

	/**
	 * Returns the meta object for the attribute '{@link gamification.Notification#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see gamification.Notification#getMessage()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_Message();

	/**
	 * Returns the meta object for the attribute '{@link gamification.Notification#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see gamification.Notification#getIcon()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_Icon();

	/**
	 * Returns the meta object for the attribute '{@link gamification.Notification#getSound <em>Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sound</em>'.
	 * @see gamification.Notification#getSound()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_Sound();

	/**
	 * Returns the meta object for enum '{@link gamification.Shapes <em>Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shapes</em>'.
	 * @see gamification.Shapes
	 * @generated
	 */
	EEnum getShapes();

	/**
	 * Returns the meta object for enum '{@link gamification.MechanicType <em>Mechanic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mechanic Type</em>'.
	 * @see gamification.MechanicType
	 * @generated
	 */
	EEnum getMechanicType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GamificationFactory getGamificationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gamification.impl.GamifiedPackImpl <em>Gamified Pack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamification.impl.GamifiedPackImpl
		 * @see gamification.impl.GamificationPackageImpl#getGamifiedPack()
		 * @generated
		 */
		EClass GAMIFIED_PACK = eINSTANCE.getGamifiedPack();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMIFIED_PACK__NAME = eINSTANCE.getGamifiedPack_Name();

		/**
		 * The meta object literal for the '<em><b>Mechanics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMIFIED_PACK__MECHANICS = eINSTANCE.getGamifiedPack_Mechanics();

		/**
		 * The meta object literal for the '<em><b>Aesthetics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMIFIED_PACK__AESTHETICS = eINSTANCE.getGamifiedPack_Aesthetics();

		/**
		 * The meta object literal for the '<em><b>Dynamics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMIFIED_PACK__DYNAMICS = eINSTANCE.getGamifiedPack_Dynamics();

		/**
		 * The meta object literal for the '{@link gamification.impl.DynamicsImpl <em>Dynamics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamification.impl.DynamicsImpl
		 * @see gamification.impl.GamificationPackageImpl#getDynamics()
		 * @generated
		 */
		EClass DYNAMICS = eINSTANCE.getDynamics();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMICS__NAME = eINSTANCE.getDynamics_Name();

		/**
		 * The meta object literal for the '{@link gamification.impl.MechanicsImpl <em>Mechanics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamification.impl.MechanicsImpl
		 * @see gamification.impl.GamificationPackageImpl#getMechanics()
		 * @generated
		 */
		EClass MECHANICS = eINSTANCE.getMechanics();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MECHANICS__NAME = eINSTANCE.getMechanics_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MECHANICS__TYPE = eINSTANCE.getMechanics_Type();

		/**
		 * The meta object literal for the '{@link gamification.impl.AestheticsImpl <em>Aesthetics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamification.impl.AestheticsImpl
		 * @see gamification.impl.GamificationPackageImpl#getAesthetics()
		 * @generated
		 */
		EClass AESTHETICS = eINSTANCE.getAesthetics();

		/**
		 * The meta object literal for the '{@link gamification.impl.BAdgeImpl <em>BAdge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamification.impl.BAdgeImpl
		 * @see gamification.impl.GamificationPackageImpl#getBAdge()
		 * @generated
		 */
		EClass BADGE = eINSTANCE.getBAdge();

		/**
		 * The meta object literal for the '<em><b>Reward</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BADGE__REWARD = eINSTANCE.getBAdge_Reward();

		/**
		 * The meta object literal for the '<em><b>Shapes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BADGE__SHAPES = eINSTANCE.getBAdge_Shapes();

		/**
		 * The meta object literal for the '<em><b>Leaderboards</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BADGE__LEADERBOARDS = eINSTANCE.getBAdge_Leaderboards();

		/**
		 * The meta object literal for the '{@link gamification.impl.ProgressImpl <em>Progress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamification.impl.ProgressImpl
		 * @see gamification.impl.GamificationPackageImpl#getProgress()
		 * @generated
		 */
		EClass PROGRESS = eINSTANCE.getProgress();

		/**
		 * The meta object literal for the '<em><b>Notification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRESS__NOTIFICATION = eINSTANCE.getProgress_Notification();

		/**
		 * The meta object literal for the '<em><b>Notificationn</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRESS__NOTIFICATIONN = eINSTANCE.getProgress_Notificationn();

		/**
		 * The meta object literal for the '{@link gamification.impl.LeaderboardsImpl <em>Leaderboards</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamification.impl.LeaderboardsImpl
		 * @see gamification.impl.GamificationPackageImpl#getLeaderboards()
		 * @generated
		 */
		EClass LEADERBOARDS = eINSTANCE.getLeaderboards();

		/**
		 * The meta object literal for the '<em><b>Notification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEADERBOARDS__NOTIFICATION = eINSTANCE.getLeaderboards_Notification();

		/**
		 * The meta object literal for the '{@link gamification.impl.PointsImpl <em>Points</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamification.impl.PointsImpl
		 * @see gamification.impl.GamificationPackageImpl#getPoints()
		 * @generated
		 */
		EClass POINTS = eINSTANCE.getPoints();

		/**
		 * The meta object literal for the '<em><b>Total Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTS__TOTAL_POINTS = eINSTANCE.getPoints_TotalPoints();

		/**
		 * The meta object literal for the '<em><b>Obtained Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTS__OBTAINED_POINTS = eINSTANCE.getPoints_ObtainedPoints();

		/**
		 * The meta object literal for the '{@link gamification.impl.LevelImpl <em>Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamification.impl.LevelImpl
		 * @see gamification.impl.GamificationPackageImpl#getLevel()
		 * @generated
		 */
		EClass LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__MAX_VALUE = eINSTANCE.getLevel_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Actual Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__ACTUAL_VALUE = eINSTANCE.getLevel_ActualValue();

		/**
		 * The meta object literal for the '<em><b>Min VAlue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__MIN_VALUE = eINSTANCE.getLevel_MinVAlue();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__POINTS = eINSTANCE.getLevel_Points();

		/**
		 * The meta object literal for the '<em><b>Badge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__BADGE = eINSTANCE.getLevel_Badge();

		/**
		 * The meta object literal for the '<em><b>Progress</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__PROGRESS = eINSTANCE.getLevel_Progress();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__TIME = eINSTANCE.getLevel_Time();

		/**
		 * The meta object literal for the '{@link gamification.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamification.impl.TimeImpl
		 * @see gamification.impl.GamificationPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__MAX_TIME = eINSTANCE.getTime_MaxTime();

		/**
		 * The meta object literal for the '<em><b>Total Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__TOTAL_TIME = eINSTANCE.getTime_TotalTime();

		/**
		 * The meta object literal for the '{@link gamification.impl.NotificationImpl <em>Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamification.impl.NotificationImpl
		 * @see gamification.impl.GamificationPackageImpl#getNotification()
		 * @generated
		 */
		EClass NOTIFICATION = eINSTANCE.getNotification();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__MESSAGE = eINSTANCE.getNotification_Message();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__ICON = eINSTANCE.getNotification_Icon();

		/**
		 * The meta object literal for the '<em><b>Sound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__SOUND = eINSTANCE.getNotification_Sound();

		/**
		 * The meta object literal for the '{@link gamification.Shapes <em>Shapes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamification.Shapes
		 * @see gamification.impl.GamificationPackageImpl#getShapes()
		 * @generated
		 */
		EEnum SHAPES = eINSTANCE.getShapes();

		/**
		 * The meta object literal for the '{@link gamification.MechanicType <em>Mechanic Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamification.MechanicType
		 * @see gamification.impl.GamificationPackageImpl#getMechanicType()
		 * @generated
		 */
		EEnum MECHANIC_TYPE = eINSTANCE.getMechanicType();

	}

} //GamificationPackage
