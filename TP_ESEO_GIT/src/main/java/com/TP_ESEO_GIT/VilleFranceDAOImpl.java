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
					System.out.println(((Ville) ville.get(i)).getCode_commune());
					System.out.println(((Ville) ville.get(i)).getNom_commune());
						statement.executeUpdate("INSERT INTO ville_france (Code_commune_INSEE,Nom_commune) VALUES ('"+((Ville) ville.get(i)).getCode_commune()+"','"+((Ville) ville.get(i)).getNom_commune()+"')");

			}
			
			statement.close();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
