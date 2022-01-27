/**
 */
package gamification.util;

import gamification.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gamification.GamificationPackage
 * @generated
 */
public class GamificationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GamificationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamificationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GamificationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamificationSwitch<Adapter> modelSwitch = new GamificationSwitch<Adapter>() {
		@Override
		public Adapter caseGamifiedPack(GamifiedPack object) {
			return createGamifiedPackAdapter();
		}

		@Override
		public Adapter caseDynamics(Dynamics object) {
			return createDynamicsAdapter();
		}

		@Override
		public Adapter caseMechanics(Mechanics object) {
			return createMechanicsAdapter();
		}

		@Override
		public Adapter caseAesthetics(Aesthetics object) {
			return createAestheticsAdapter();
		}

		@Override
		public Adapter caseBAdge(BAdge object) {
			return createBAdgeAdapter();
		}

		@Override
		public Adapter caseProgress(Progress object) {
			return createProgressAdapter();
		}

		@Override
		public Adapter caseLeaderboards(Leaderboards object) {
			return createLeaderboardsAdapter();
		}

		@Override
		public Adapter casePoints(Points object) {
			return createPointsAdapter();
		}

		@Override
		public Adapter caseLevel(Level object) {
			return createLevelAdapter();
		}

		@Override
		public Adapter caseTime(Time object) {
			return createTimeAdapter();
		}

		@Override
		public Adapter caseNotification(Notification object) {
			return createNotificationAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamification.GamifiedPack <em>Gamified Pack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamification.GamifiedPack
	 * @generated
	 */
	public Adapter createGamifiedPackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamification.Dynamics <em>Dynamics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamification.Dynamics
	 * @generated
	 */
	public Adapter createDynamicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamification.Mechanics <em>Mechanics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamification.Mechanics
	 * @generated
	 */
	public Adapter createMechanicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamification.Aesthetics <em>Aesthetics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamification.Aesthetics
	 * @generated
	 */
	public Adapter createAestheticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamification.BAdge <em>BAdge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamification.BAdge
	 * @generated
	 */
	public Adapter createBAdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamification.Progress <em>Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamification.Progress
	 * @generated
	 */
	public Adapter createProgressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamification.Leaderboards <em>Leaderboards</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamification.Leaderboards
	 * @generated
	 */
	public Adapter createLeaderboardsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamification.Points <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamification.Points
	 * @generated
	 */
	public Adapter createPointsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamification.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamification.Level
	 * @generated
	 */
	public Adapter createLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamification.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamification.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamification.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamification.Notification
	 * @generated
	 */
	public Adapter createNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GamificationAdapterFactory
