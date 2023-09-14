package javacrud;

// CRUD -> CREATE Read update Delete

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class startapp {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Welcome to Student Management App");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Press 1 to Add student");
			System.out.println("Press 2 to Delete student");
			System.out.println("Press 3 to Display student");
			System.out.println("Press 4 to Exist app");
            System.out.println("Press 5 to Update Student");
			int c = Integer.parseInt(br.readLine());
			
			if(c==1){
				//add students
				
				System.out.println("Enter your name...");
				String name =br.readLine();  // Taking the Name of student to be inserted in mysql
				
				System.out.println("Enter your phone number...");
				String phone =br.readLine();  // Taking the phone number of student to be inserted in mysql
				
				//create student object to store student.
				student st = new student(name,phone);
				boolean answer = StudentDao.insertStudentToDB(st);
				
				if(answer) {
					System.out.println("Added Successfully to Database");

				}else {
					System.out.println("Something went wrong....");

				}
				System.out.println(st);



		}else if(c==2) {
			//delete students
			System.out.println("Enter student Id to delete...");
			int userId = Integer.parseInt(br.readLine());
			
			boolean answer = StudentDao.deleteStudent(userId);
			
			if(answer) {
				System.out.println("Deleted ....");

			}else {
				System.out.println("Something went wrong....");

			}
			
			
		}else if(c==3) {
			//display
			
			StudentDao.showAllStudent();

		}
        else if(c == 5){

				//add students
                System.out.println("Enter student Id to update...");
			        int userId = Integer.parseInt(br.readLine());
				
				System.out.println("Update your name...");
				String name =br.readLine();  // Taking the Name of student to be inserted in mysql
				
				System.out.println("Update your phone number...");
				String phone =br.readLine();  // Taking the phone number of student to be inserted in mysql
				
				//create student object to store student.
				student st = new student(name,phone);
				boolean answer = StudentDao.updateStudentToDB(st, userId);
				
				if(answer) {
					System.out.println("Added Successfully to Database");

				}else {
					System.out.println("Something went wrong....");

				}
				System.out.println(st);



		
        }

        else if(c==4) {
			//exist 
			break;
			
		}else {
			
		
	}
			

			}
		System.out.println("Thank you for using my application");


	}

}
