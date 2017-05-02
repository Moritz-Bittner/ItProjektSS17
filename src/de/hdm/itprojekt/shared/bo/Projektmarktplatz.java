package de.hdm.itprojekt.shared.bo;

/*
 *  Realisierung eines exemplarischen Projektmarktplatzes.
 *  Ein Projektmarktplatz besitzt eine Bezeichnung.
 * 
 * @author Denise
 * */


public class Projektmarktplatz extends BusinessObjekt{
	
	private String bezeichnung = null;

	/**
	 * @return the bezeichnung
	 */
	public String getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * @param bezeichnung the bezeichnung to set
	 */
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
	

}
