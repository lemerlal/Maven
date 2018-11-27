package com.TP_ESEO_GIT;

import java.util.ArrayList;
import java.util.List;

public class VilleDAO {
	
	  private final static char SEPARATOR = ';';
	    private final static String RESOURCES_PATH = "source/";
	    private final static String Ville_FILE_NAME = "laposte_hexasmal.csv";
	    private static String latitude;
	    private static String longitude;

	    public static List<Ville> findVille() {

	        final List<String[] > data = ReadCSV.readCsvFile(RESOURCES_PATH + Ville_FILE_NAME, SEPARATOR);

	        final List<Ville> villes = dataToVilles(data);

	        return villes;
	    }



		private static List<Ville> dataToVilles(List<String[] > data) {
	        final List<Ville> villes = new ArrayList<Ville>();

	        for (String[] oneData : data) {
			     String code_commune = oneData[0];
			     String nom_commune = oneData[1];
			     System.out.println(nom_commune);
			     String code_postal_string = oneData[2];
			     String Libelle_acheminement = oneData[3];
			     String cordonnees_GPS = oneData[5];

			     String[] tabCordonnees = cordonnees_GPS.split(",");
			     
			     if(tabCordonnees.length >1) {
			    	 latitude = tabCordonnees[0];
				     longitude= tabCordonnees[1];
			     }else {
			    	 latitude = null;
			    	 longitude = null;
			     }
			    

			    int code_postal = Integer.parseInt(code_postal_string);
			    Ville ville = new Ville(code_commune,nom_commune, code_postal, Libelle_acheminement, latitude, longitude);
			    villes.add(ville);
			}

	        return villes;
	    }

}
