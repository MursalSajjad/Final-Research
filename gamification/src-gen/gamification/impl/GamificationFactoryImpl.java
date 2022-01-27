/**
 */
package gamification.impl;

import gamification.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GamificationFactoryImpl extends EFactoryImpl implements GamificationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GamificationFactory init() {
		try {
			GamificationFactory theGamificationFactory = (GamificationFactory) EPackage.Registry.INSTANCE
					.getEFactory(GamificationPackage.eNS_URI);
			if (theGamificationFactory != null) {
				return theGamificationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GamificationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamificationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GamificationPackage.GAMIFIED_PACK:
			return createGamifiedPack();
		case GamificationPackage.DYNAMICS:
			return createDynamics();
		case GamificationPackage.MECHANICS:
			return createMechanics();
		case GamificationPackage.AESTHETICS:
			return createAesthetics();
		case GamificationPackage.BADGE:
			return createBAdge();
		case GamificationPackage.PROGRESS:
			return createProgress();
		case GamificationPackage.LEADERBOARDS:
			return createLeaderboards();
		case GamificationPackage.POINTS:
			return createPoints();
		case GamificationPackage.LEVEL:
			return createLevel();
		case GamificationPackage.TIME:
			return createTime();
		case GamificationPackage.NOTIFICATION:
			return createNotification();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case GamificationPackage.SHAPES:
			return createShapesFromString(eDataType, initialValue);
		case GamificationPackage.MECHANIC_TYPE:
			return createMechanicTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case GamificationPackage.SHAPES:
			return convertShapesToString(eDataType, instanceValue);
		case GamificationPackage.MECHANIC_TYPE:
			return convertMechanicTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamifiedPack createGamifiedPack() {
		GamifiedPackImpl gamifiedPack = new GamifiedPackImpl();
		return gamifiedPack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dynamics createDynamics() {
		DynamicsImpl dynamics = new DynamicsImpl();
		return dynamics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mechanics createMechanics() {
		MechanicsImpl mechanics = new MechanicsImpl();
		return mechanics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aesthetics createAesthetics() {
		AestheticsImpl aesthetics = new AestheticsImpl();
		return aesthetics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAdge createBAdge() {
		BAdgeImpl bAdge = new BAdgeImpl();
		return bAdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Progress createProgress() {
		ProgressImpl progress = new ProgressImpl();
		return progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leaderboards createLeaderboards() {
		LeaderboardsImpl leaderboards = new LeaderboardsImpl();
		return leaderboards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Points createPoints() {
		PointsImpl points = new PointsImpl();
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level createLevel() {
		LevelImpl level = new LevelImpl();
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notification createNotification() {
		NotificationImpl notification = new NotificationImpl();
		return notification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shapes createShapesFromString(EDataType eDataType, String initialValue) {
		Shapes result = Shapes.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShapesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MechanicType createMechanicTypeFromString(EDataType eDataType, String initialValue) {
		MechanicType result = MechanicType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMechanicTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamificationPackage getGamificationPackage() {
		return (GamificationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GamificationPackage getPackage() {
		return GamificationPackage.eINSTANCE;
	}

} //GamificationFactoryImpl
