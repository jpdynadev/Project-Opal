package DB.conn;
import java.sql.*;
import java.util.*;

public class connection {
	private String url;
	private String username;
	private String password;
	private String sql;
	private Connection con;
	public connection() {
		super();
		this.url = "jdbc:oracle:thin:@localhost:1521:xe";
		this.username = "root";
		this.password = "root";
		this.sql = "";
		try {
			con = null;
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		}catch(Exception e) {
			con = null;
		}
	}
	
	
}
