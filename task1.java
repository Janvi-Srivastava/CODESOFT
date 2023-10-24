import java.util.*;
public class task1 {
    public static void main (String []args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Guess a number between 1 to 100:");
        numberGame(sc.nextInt());

    }
    public static void numberGame(int number){
        Scanner sc=new Scanner (System.in);
        int actualnum=67;
            if(number==actualnum){
                System.out.println("Cogratulations!You've entered correct number.");
            }
            else if(number>=50 && number<=75){
                System.out.println("guess : Too High");
            }else if (number>=1 && number<50|| number>75&&number<=100){
                System.out.println("guess :too low");
            }
            else{
                System.out.println("invalid no.!");
            }
            
        }
    }
  

