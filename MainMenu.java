package project_LockedMe;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;

public class MainMenu {
	public static void main(String[] args) throws IOException {	   
        int num = 0;
        String h = null;
        MainMenu obj = new MainMenu();
		
		//Welcome screen        
        System.out.println();
        System.out.println("================================================================");
        System.out.println("==                                                            ==");
        System.out.println("==                       LOCKED ME. COM                       ==");
        System.out.println("==                                                            ==");
        System.out.println("==                 Developed by George Futekov                ==");
        System.out.println("==                                                            ==");
        System.out.println("================================================================\n\n");
        
        //Take user Option from the below mentioned Menu  
        System.out.println("Please select an option:\n");
        
        System.out.println(" 1 - View files list");
        System.out.println(" 2 - More options");
        System.out.println(" 3 - Exit the application");
        System.out.println();
        //Setting up the user input through a scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Choice:");
        try {
        int in = input.nextInt();     
        switch(in){    
           case 1: 	System.out.println("Files list:\n"); 
           			File f = new File("C:\\Users\\georg\\OneDrive\\Desktop\\Test\\");
           			
           			String[] s = f.list();           			
           			Arrays.sort(s);
           			if(s==null) {
           				System.out.println("Does not exist");
           			}else {
           				for(int i=0; i<s.length; i++) {
           					String filename = s[i];
               				System.out.println(filename);
               			}
           				
           			}
           			obj.main(args);
           			break;  
                   
           case 2: 	System.out.println("More options");      
           			System.out.println("1 - Create file");
           			System.out.println("2 - Delete file");
           			System.out.println("3 - Search file");
           			System.out.println("4 - Return to main menu");
           			System.out.println("Enter Your Choice:");
           	        
           			
           			int in1 = input.nextInt();
           	        switch(in1) {
           	        
           	        case 1: System.out.println("Creating file...");

           	        		Scanner scanner = new Scanner( System.in );
           	        		System.out.println("Please enter the name of the file: ");
           	             	String filename = scanner.nextLine(); 
           	        		
           	        		try {           	        			
           	     			File file = new File("C:\\Users\\georg\\OneDrive\\Desktop\\Test\\"+ filename);
           	     			//file.createNewFile();
           	     			if (file.createNewFile()) {
           	     				System.out.println("New File is created");
           	     			}
           	     			else {
           	     				if (file.exists())
           	     				{
           	     					System.out.println("File already exists!");
           	     					System.out.println("File path: " + file.getAbsolutePath());           	     					
           	     				}
           	     				else
           	     				{
           	     					System.out.println("File does not exist!");					
           	     				}          	     								
           	     			}
           	        	}
           	     		catch (IOException e) {
           	     			e.printStackTrace();
           	     		}
           	        		break;
           	        		
           	        case 2: System.out.println("Deleting file...");
           	        		Scanner sc = new Scanner( System.in );
           	        		System.out.println("Please enter the name of the file: ");
           	        		           	        		
           	        		String file1 = sc.nextLine(); 
           	        		File file = new File("C:\\Users\\georg\\OneDrive\\Desktop\\Test\\" + file1);
           	        		if(file.delete()) {
           	        			System.out.println("File deleted successfully!");
           	        		}else {
           	        			System.out.println("File does not exists! Please try again.");
           	        		}           	        
           	        		break;
           	        		
           	        case 3: System.out.println("Searching for file...");
           	        		Scanner sc1 = new Scanner( System.in );
           	        		System.out.println("Please enter the name of the file: ");
           	        		
           	        		String file2 = sc1.nextLine();
           	        		File file3 = new File("C:\\Users\\georg\\OneDrive\\Desktop\\Test\\" + file2);
           	        		if (file3.exists()) {
           	        			System.out.println("That file exists!");
           	        			System.out.println(file3.getName());
           	        		}else {
           	        			System.out.println("That file does not exists!");
           	        		}
           	        		break;
           	        case 4: obj.main(args);
           	        		System.out.println("Returning to main menu");
           	        }
           	        	obj.main(args);
           	        	break;
                   
           case 3: 	System.out.println("Exiting the application");           			             
           			System.exit(0);
        	   		break;    
           			
           default: System.out.println("Ouch!! Please select one of the listed options!");
           obj.main(args);
           }
        }catch(Exception e) {
     	   System.out.println("Wrong choice! Please choose one of the options");
     	  obj.main(args);
        }
       
   }

}
