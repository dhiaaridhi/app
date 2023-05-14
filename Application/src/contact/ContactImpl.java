package contact;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql. ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class ContactImpl implements ImetierContact {
  @Override
  public List<contacts> getcontactsParMotCle(String M) {
	  ArrayList<contacts> cont = new ArrayList<contacts>();
	Connection con = contactConnection.getConnection();
	try {
		PreparedStatement ps= con.prepareStatement ("select * from contacts where nom LIKE ?");
		ps.setString(1, "%"+M+"%");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			contacts c = new contacts();
		c.setId_contact(rs.getInt("id_contact")) ;
		c.setNom(rs.getString("nom"));
		c.setPrenom(rs.getString("Prenom"));
		c.setEmail(rs.getString("email"));
} 
	 
} catch (SQLException e){
	e.printStackTrace();
}
	return cont ;
	}
  @Override
  public void addcontact (contacts c){
	  
  }
}