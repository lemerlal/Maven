package com.TP_ESEO_GIT;

import java.util.ArrayList;
import java.util.List;

public class VilleDAO {
	
	  private final static char SEPARATOR = ';';
	    private final static String RESOURCES_PATH = "source/";
	    private final static String Ville_FILE_NAME = "laposte_hexasmal.csv";

	    public static List<Ville> findVille() {

	        final List<String[] > data = ReadCSV.readCsvFile(RESOURCES_PATH + Ville_FILE_NAME, SEPARATOR);

	        final List<Ville> villes = dataToEleves(data);

	        return villes;
	    }



		private static List<Ville> dataToEleves(List<String[] > data) {
	        final List<Ville> villes = new ArrayList<Ville>();

	        for (String[] oneData : data) {
			     String code_commune = oneData[0];
			     String nom_commune = oneData[1];
			     String code_postal_string = oneData[2];
			     String Libelle_acheminement = oneData[3];
			     String Cordonnees_GPS = oneData[4];

			    int code_postal = Integer.parseInt(code_postal_string);
			    Ville ville = new Ville(code_commune,nom_commune, code_postal, Libelle_acheminement, Cordonnees_GPS);
			    villes.add(ville);
			}

	        return villes;
	    }

}
