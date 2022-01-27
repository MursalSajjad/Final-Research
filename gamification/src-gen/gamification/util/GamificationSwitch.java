/**
 */
package gamification.util;

import gamification.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gamification.GamificationPackage
 * @generated
 */
public class GamificationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GamificationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamificationSwitch() {
		if (modelPackage == null) {
			modelPackage = GamificationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case GamificationPackage.GAMIFIED_PACK: {
			GamifiedPack gamifiedPack = (GamifiedPack) theEObject;
			T result = caseGamifiedPack(gamifiedPack);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamificationPackage.DYNAMICS: {
			Dynamics dynamics = (Dynamics) theEObject;
			T result = caseDynamics(dynamics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamificationPackage.MECHANICS: {
			Mechanics mechanics = (Mechanics) theEObject;
			T result = caseMechanics(mechanics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamificationPackage.AESTHETICS: {
			Aesthetics aesthetics = (Aesthetics) theEObject;
			T result = caseAesthetics(aesthetics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamificationPackage.BADGE: {
			BAdge bAdge = (BAdge) theEObject;
			T result = caseBAdge(bAdge);
			if (result == null)
				result = caseMechanics(bAdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamificationPackage.PROGRESS: {
			Progress progress = (Progress) theEObject;
			T result = caseProgress(progress);
			if (result == null)
				result = caseMechanics(progress);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamificationPackage.LEADERBOARDS: {
			Leaderboards leaderboards = (Leaderboards) theEObject;
			T result = caseLeaderboards(leaderboards);
			if (result == null)
				result = caseMechanics(leaderboards);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamificationPackage.POINTS: {
			Points points = (Points) theEObject;
			T result = casePoints(points);
			if (result == null)
				result = caseMechanics(points);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamificationPackage.LEVEL: {
			Level level = (Level) theEObject;
			T result = caseLevel(level);
			if (result == null)
				result = caseMechanics(level);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamificationPackage.TIME: {
			Time time = (Time) theEObject;
			T result = caseTime(time);
			if (result == null)
				result = caseMechanics(time);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamificationPackage.NOTIFICATION: {
			Notification notification = (Notification) theEObject;
			T result = caseNotification(notification);
			if (result == null)
				result = caseMechanics(notification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gamified Pack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gamified Pack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGamifiedPack(GamifiedPack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamics(Dynamics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mechanics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mechanics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMechanics(Mechanics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aesthetics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aesthetics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAesthetics(Aesthetics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAdge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAdge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAdge(BAdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progress</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progress</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgress(Progress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaderboards</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaderboards</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeaderboards(Leaderboards object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Points</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Points</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoints(Points object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevel(Level object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotification(Notification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GamificationSwitch
