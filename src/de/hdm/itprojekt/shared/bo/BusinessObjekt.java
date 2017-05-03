package de.hdm.itprojekt.shared.bo;

import java.io.Serializable;

/*
 * Klasse BusinessObjekt stellt Basisklasse aller BO dar. 
 * Hier sollen ID´s vergeben werden. Die gleichzeitg als Primärchlüssel für die DB nutzbar sind.
*/

public abstract class BusinessObjekt implements Serializable {

	 private static final long serialVersionUID = 1L;
	
	 private int id = 0;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	 
	 
	 
	
}
