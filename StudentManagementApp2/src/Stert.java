import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.mange.Student;
import com.student.mange.StudentDao;

public class Stert {

	public static void main(String[] args) throws IOException{
		System.out.println("welcome to student app");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("press 1 to add student");
			System.out.println("press 2 to delete student");
			System.out.println("press 3 to display student");
			System.out.println("press 4 to exit app");
			int c=Integer.parseInt(br.readLine());
			
			if(c==1) {
				System.out.println("enter user name :");
				String name=br.readLine();
				System.out.println("enter user phone :");
				String phone=br.readLine();
				System.out.println("enter user city :");
				String city=br.readLine();
				///creat student object to store
				Student st=new Student(name,phone,city);
				System.out.println(st);
				 boolean answer =StudentDao.insertStudentToDB(st);
				 if(answer) {
					 System.out.println("student is addeded successfully.........");
					 
				 }else {
					 System.out.println("something rong.....");
				 }
				
				//add
			}else if(c==2) {
				System.out.println("enter STUDENT id to delete :");
				int userId=Integer.parseInt(br.readLine());
				boolean f=StudentDao.deleteStudent(userId);
				if(f)
				{
					System.out.println("deleted................ ");
					
				}else {
					System.out.println("somthing wrong.......");
					System.out.println("bye bye .......");
				}
				
				//delete
			}else if(c==3) {
				StudentDao.showAllStudent();
				//display
			}else if(c==4) {
				//exit;
				break;
			}else {
				
			}
		}

	}

}
