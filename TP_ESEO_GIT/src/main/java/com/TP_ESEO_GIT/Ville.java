package com.TP_ESEO_GIT;

public class Ville {
	
	private String code_commune;
    private String nom_commune;
    private int code_postal;
    private String Libelle_acheminement;
    private String Cordonnees_GPS;
    private String latitude;
    private String longitude;
    
	public Ville(String code_commune, String nom_commune, int code_postal, String libelle_acheminement, String latitude, String longitude) {
		super();
		this.code_commune = code_commune;
		this.nom_commune = nom_commune;
		this.code_postal = code_postal;
		this.Libelle_acheminement = libelle_acheminement;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public String getCode_commune() {
		return code_commune;
	}
	public void setCode_commune(String code_commune) {
		this.code_commune = code_commune;
	}
	public String getNom_commune() {
		return nom_commune;
	}
	public void setNom_commune(String nom_commune) {
		this.nom_commune = nom_commune;
	}
	public int getCode_postal() {
		return code_postal;
	}
	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}
	public String getLibelle_acheminement() {
		return Libelle_acheminement;
	}
	public void setLibelle_acheminement(String libelle_acheminement) {
		this.Libelle_acheminement = libelle_acheminement;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


}
