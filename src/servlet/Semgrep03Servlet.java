package servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Semgrep03Servlet {

	Connection cn = null;
	
	private boolean search(String search) {
		
		// String query01 = "SELECT id, name, editorial, year FROM books WHERE name = " + search;  
	
		String query01 = "SELECT id, name, editorial, year FROM books WHERE name = ? ";  
		
		try {
            PreparedStatement ps = cn.prepareStatement(query01);
            ps.setString(1,search);
            
        } catch (SQLException e) {
            
        }
		
		return true;
		
	}
	
	private boolean searchSecond(String search) {
		
		String query01 = "SELECT id, name, editorial, year FROM books WHERE name = " + search + " limit 1";  
		
		return true;
		
	}
	
	private boolean searchCorrect(String search) {
				
		String query01 = "SELECT id, name, editorial, year FROM books WHERE name = ? limit 1";  
		
		try {
            PreparedStatement ps = cn.prepareStatement(query01);
            ps.setString(1,search);
            
        } catch (SQLException e) {
            
        }
		
		return true;
		
	}
	
}
