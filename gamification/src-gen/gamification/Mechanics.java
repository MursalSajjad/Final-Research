/**
 */
package gamification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mechanics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamification.Mechanics#getName <em>Name</em>}</li>
 *   <li>{@link gamification.Mechanics#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see gamification.GamificationPackage#getMechanics()
 * @model
 * @generated
 */
public interface Mechanics extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gamification.GamificationPackage#getMechanics_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gamification.Mechanics#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gamification.MechanicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gamification.MechanicType
	 * @see #setType(MechanicType)
	 * @see gamification.GamificationPackage#getMechanics_Type()
	 * @model
	 * @generated
	 */
	MechanicType getType();

	/**
	 * Sets the value of the '{@link gamification.Mechanics#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gamification.MechanicType
	 * @see #getType()
	 * @generated
	 */
	void setType(MechanicType value);

} // Mechanics
