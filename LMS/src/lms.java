import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 
 */

/**
 * @author KamikaZe
 *
 */
public class lms {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hello, world");
		/*java.util.Date utilDate = new java.util.Date();
		Date d = new Date(utilDate.getTime());
		System.out.println("Date : " + d);
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, +1);
		utilDate = cal.getTime();
		Date oneMonthLater = new Date(utilDate.getTime());
		System.out.println("Date : " + oneMonthLater);
		
		System.out.println(oneMonthLater.after(d));*/
		
		//Launch main menu
		DBHandler db = new DBHandler();
		db.getConnection();
		new LMSMainMenu().setVisible(true);
		
	}

}

//TODO: Get rid of this
//Old testing code
/*		DBHandler db = new DBHandler();
		db.getConnection();
		Client c = new Client();
		c.setId("newId");
		c.setAddress("abc");
		c.setContactNo("9901");
		c.setName("Richard Hammond");
		c.setDateOfBirth(Date.valueOf("1982-06-14"));
		c.setMemberType("epic");
		c.setPendingFines(0);
		c.setExpiryDate(Date.valueOf("1982-06-14"));
		
		db.dbClientUpdate(c, true);
		System.out.println("SUCCESS!!!");
		
		
		
		
		Client client = db.dbClientRetrieve("007");
		System.out.println(client.getId() + "--" + client.getName() + "---" + client.getDateOfBirth());

		LibraryStaff staff = db.dbUserRetrieve("dhsadkjsah", "", "");
		if(staff == null){
			System.out.println("Invalid login details");
		}else{
			if(staff.getHeadLibrarianFlag() == 1){
				HeadLibrarian hl = db.dbHeadLibrarianRetrieve("head", "", "");
				System.out.println(hl.getId() + " -- " + hl.getName());
			}else{
				System.out.println(staff.getId() + " -- " + staff.getName());
			}
		}

		try {

			db.getConnection();
			ResultSet rs = db.dbBookRetrieve("", "", "");
			ResultSetMetaData rsmd = rs.getMetaData();

			while(rs.next()){
				int i=1;
				while(i <= rsmd.getColumnCount()){
					System.out.print(rs.getString(i) + "--");
					i++;
				}
			}

			/*
			Connection con = d.openConnection(null);
			Statement stmt = null;
			String query = "Select * from books";

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();

			while(rs.next()){
				System.out.println("Hey");
				int i=1;
				while(i <= rsmd.getColumnCount()){
					System.out.print(rs.getString(i) + "--");
					i++;
				}

				/*String str = rs.getString(1);
				System.out.println(str);
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
