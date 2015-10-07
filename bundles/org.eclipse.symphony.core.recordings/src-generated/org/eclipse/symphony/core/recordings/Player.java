/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.recordings;

import ca.gc.asc_csa.eclipse.emf.ecore.TimeSource;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.core.invocator.AbstractPlayer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Player
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.recordings.Player#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.Player#getTimeSource <em>Time Source</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.Player#getRecordings <em>Recordings</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.Player#getDataStartTime <em>Data Start Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.Player#getDataEndTime <em>Data End Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.Player#getPlayBackTime <em>Play Back Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends AbstractPlayer
{

  /**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not this Player is enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getPlayer_Enabled()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.recordings.Player#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Time Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TimeSource used to drive this Player.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Source</em>' reference.
	 * @see #setTimeSource(TimeSource)
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getPlayer_TimeSource()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
	TimeSource getTimeSource();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.recordings.Player#getTimeSource <em>Time Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Source</em>' reference.
	 * @see #getTimeSource()
	 * @generated
	 */
	void setTimeSource(TimeSource value);

		/**
	 * Returns the value of the '<em><b>Recordings</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.recordings.Recording}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of Recordings being played back.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recordings</em>' reference list.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getPlayer_Recordings()
	 * @model
	 * @generated
	 */
	EList<Recording> getRecordings();

		/**
	 * Returns the value of the '<em><b>Data Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start time of the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Start Time</em>' attribute.
	 * @see #setDataStartTime(Date)
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getPlayer_DataStartTime()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly'"
	 * @generated
	 */
  Date getDataStartTime();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.recordings.Player#getDataStartTime <em>Data Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Start Time</em>' attribute.
	 * @see #getDataStartTime()
	 * @generated
	 */
  void setDataStartTime(Date value);

  /**
	 * Returns the value of the '<em><b>Data End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The end time of the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data End Time</em>' attribute.
	 * @see #setDataEndTime(Date)
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getPlayer_DataEndTime()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly'"
	 * @generated
	 */
  Date getDataEndTime();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.recordings.Player#getDataEndTime <em>Data End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data End Time</em>' attribute.
	 * @see #getDataEndTime()
	 * @generated
	 */
  void setDataEndTime(Date value);

  /**
	 * Returns the value of the '<em><b>Play Back Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current play back time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Play Back Time</em>' attribute.
	 * @see #setPlayBackTime(Date)
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getPlayer_PlayBackTime()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly'"
	 * @generated
	 */
	Date getPlayBackTime();

		/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.recordings.Player#getPlayBackTime <em>Play Back Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Play Back Time</em>' attribute.
	 * @see #getPlayBackTime()
	 * @generated
	 */
	void setPlayBackTime(Date value);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the playBackTime to the specified Date.
	 * <!-- end-model-doc -->
	 * @model dateDataType="org.eclipse.symphony.core.recordings.Date" dateUnique="false"
	 * @generated
	 */
  void jumpTo(Date date);
} // Player
