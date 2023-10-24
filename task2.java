import java.util.*;
public class task2 {

    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
    //     System.out.println("total subjects:");
    //     int n=sc.nextInt();
        
        
    //     for(int i=0;i<n;i++){
    //         System.out.println("Marks obtained:");
    //         int m=sc.nextInt();
    //     }

    // }}
        System.out.println("Enter student name:");
        String name=sc.nextLine();
        System.out.println("Enter marks obtained (out of 100) in following subjects:");
        System.out.print("Marks of 1st subject:");
        int M1=sc.nextInt();
        System.out.print("Marks of 2nd subject:");        
        int M2=sc.nextInt();        
        System.out.print("Marks of 3rd subject:");
        int M3=sc.nextInt();        
        System.out.print("Marks of 4th subject:");
        int M4=sc.nextInt();       
        System.out.print("Marks of 5th subject:"); 
        int M5=sc.nextInt();
        
        //Total Marks
        
        int totmarks=M1+M2+M3+M4+M5;
        System.out.println("Total Marks obtained :"+totmarks);
        //Average Percentage obtained
        
        int percentage=(M1+M2+M3+M4+M5)/5;
        System.out.println("Percentage obtained="+percentage+"%");
        System.out.print("Grade Obtained:");
        if(percentage>=95){
            System.out.println("A+");
        }else if(percentage >=90 && percentage<95){
            System.out.println("A");
        }else if(percentage>=85 && percentage<90){
            System.out.println("B+");
        }else if(percentage>=80 && percentage<85){
            System.out.println("B");
        }else if(percentage>=70 && percentage<80){
            System.out.println("C");
        }else if(percentage>=60 && percentage<70){
            System.out.println("D");
        }else if(percentage>=50 && percentage<60){
            System.out.println("E");
        }else{
            System.out.println("Failed!");
        } 
     
    }}

