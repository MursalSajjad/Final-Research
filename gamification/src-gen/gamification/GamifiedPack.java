/**
 */
package gamification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gamified Pack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamification.GamifiedPack#getName <em>Name</em>}</li>
 *   <li>{@link gamification.GamifiedPack#getMechanics <em>Mechanics</em>}</li>
 *   <li>{@link gamification.GamifiedPack#getAesthetics <em>Aesthetics</em>}</li>
 *   <li>{@link gamification.GamifiedPack#getDynamics <em>Dynamics</em>}</li>
 * </ul>
 *
 * @see gamification.GamificationPackage#getGamifiedPack()
 * @model
 * @generated
 */
public interface GamifiedPack extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gamification.GamificationPackage#getGamifiedPack_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gamification.GamifiedPack#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mechanics</b></em>' containment reference list.
	 * The list contents are of type {@link gamification.Mechanics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanics</em>' containment reference list.
	 * @see gamification.GamificationPackage#getGamifiedPack_Mechanics()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Mechanics> getMechanics();

	/**
	 * Returns the value of the '<em><b>Aesthetics</b></em>' containment reference list.
	 * The list contents are of type {@link gamification.Aesthetics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aesthetics</em>' containment reference list.
	 * @see gamification.GamificationPackage#getGamifiedPack_Aesthetics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Aesthetics> getAesthetics();

	/**
	 * Returns the value of the '<em><b>Dynamics</b></em>' containment reference list.
	 * The list contents are of type {@link gamification.Dynamics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamics</em>' containment reference list.
	 * @see gamification.GamificationPackage#getGamifiedPack_Dynamics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dynamics> getDynamics();

} // GamifiedPack
