package javacrud;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.Statement;

import java.sql.PreparedStatement;

public class StudentDao {
	
	public static boolean insertStudentToDB(student st) {
		
		//jdbc code...
		boolean f=false;
		
		try {
			Connection con = CP.createC();
			String q = "insert into stud(name, phone) values(?,?)";
			
			//preparedStatement
			PreparedStatement psmt = con.prepareStatement(q);
			
			//set the value of parameters
			psmt.setString(1, st.getStudentname());
			psmt.setString(2, st.getStudentphone());
			
			//execute...
			psmt.executeUpdate();
			f=true;

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
		
		
		
		
	}

    public static boolean updateStudentToDB(student st, int userId) {
		
		//jdbc code...
		boolean f=false;
		
		try {
			Connection con = CP.createC();
			String q = "UPDATE stud SET name = ?, phone = ? WHERE id = ?";
			
			//preparedStatement
			PreparedStatement psmt = con.prepareStatement(q);
			
			//set the value of parameters
            psmt.setString(1, st.getStudentname());
            psmt.setString(2, st.getStudentphone());
            psmt.setInt(3, userId);
            
			
			//execute...
			psmt.executeUpdate();
			f=true;

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
		
	}
	public  static boolean  deleteStudent(int userId) {
		boolean f=false;
		try {
			Connection con = CP.createC();
			String q ="delete from stud where id=?";
			
			//preparedStatement
			PreparedStatement psmt = con.prepareStatement(q);
			
			//set the value of parameters
			psmt.setInt(1, userId);
			
			//execute...
			psmt.executeUpdate();
			f=true;


			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return f;
	}
	
	public static void showAllStudent() {
		try {
			Connection con = CP.createC();
			String q ="select * from stud;";
			
			//Statement
            Statement stmt = con.createStatement();
            stmt.executeQuery(q);
			
			java.sql.ResultSet set=stmt.executeQuery(q);
			
			while(set.next()) {
				int id=set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				
				System.out.println("ID : "+id);
				System.out.println("Name : "+name);
				System.out.println("Phone : "+phone);
				System.out.println("=========================");
			}


			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	}
