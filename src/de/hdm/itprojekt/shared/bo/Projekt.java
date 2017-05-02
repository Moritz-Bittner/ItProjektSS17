/**
 * 
 */
package de.hdm.itprojekt.shared.bo;
import java.util.Date;

/**
 *   Realisierung eines exemplarischen Projekts.
 *  Ein Projekt besitzt eine Beschreibung sowie Start- und Enddatum.
 * 
 * @author Denise
 *
 */
public class Projekt extends BusinessObjekt {
	
	
	private static final long serialVersionUID = 1L;
	
	private String beschreibung = null;
	private Date endDatum = null;
	private Date startDatum =null;
	/**
	 * @return the beschreibung
	 */
	public String getBeschreibung() {
		return beschreibung;
	}
	/**
	 * @param beschreibung the beschreibung to set
	 */
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	/**
	 * @return the endDatum
	 */
	public Date getEndDatum() {
		return endDatum;
	}
	/**
	 * @param endDatum the endDatum to set
	 */
	public void setEndDatum(Date endDatum) {
		this.endDatum = endDatum;
	}
	/**
	 * @return the startDatum
	 */
	public Date getStartDatum() {
		return startDatum;
	}
	/**
	 * @param startDatum the startDatum to set
	 */
	public void setStartDatum(Date startDatum) {
		this.startDatum = startDatum;
	}
	
	
	

}
