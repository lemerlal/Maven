package com.TP_ESEO_GIT;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class VilleFranceDAOImpl {

	public void findVilleDAO() throws ClassNotFoundException {
		
		try {
			Connection con =JDBCConfigurationSol2.getConnection();
			
			Statement statement = con.createStatement();
			List  ville = VilleDAO.findVille();
			
			for (int i =0 ; i<ville.size(); i++) {
					System.out.println(((Ville) ville.get(i)).getNom_commune());
						statement.executeUpdate("INSERT INTO ville_france (Code_commune_INSEE,Nom_commune,Code_postal,Libelle_acheminement,Ligne_5,Latitude,Longitude) VALUES ('"+((Ville) ville.get(i)).getCode_commune()+"','"+((Ville) ville.get(i)).getNom_commune()+"','"+((Ville) ville.get(i)).getCode_postal()+"','"+((Ville) ville.get(i)).getLibelle_acheminement()+"','null','"+((Ville) ville.get(i)).getLatitude()+"','"+((Ville) ville.get(i)).getLongitude()+"')");

			}
			
			statement.close();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
