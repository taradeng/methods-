import java.util.Scanner;
class exercise7 {
     
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
       //variables 
       int numdice = 0; // number of dice
       int sides   = 0; 
       int dieroll = 0; //result of a die roll
       int total   = 0; //total of all die roll results
       String ans  = "y"; 
       
       //input loop 
       while (ans.equals("y")) {
           
           //get input 
           
           System.out.print("How many dice? ");
           numdice = sc.nextInt();
           System.out.print("How many sides? ");
           sides = sc.nextInt();
           
           //roll and add results
           System.out.println("");
           System.out.print("You rolled: ");
           
           
           total = 0;
           for (int i = 0; i < numdice; i++) {
               dieroll = rollDie(sides);
               total = total + dieroll;
               System.out.print(dieroll +" ");
               
            }
            
            //report total 
            System.out.println("");
            System.out.println("Total: " + total);
            System.out.println("");
            
            //continue? 
            System.out.print("Roll again? [y/n] ");
            ans = sc.next();
            System.out.println("");
        }
    }
    
    public static int rollDie(int s) { 
        return (int) (Math.random()*s)+1; 
        
    }
}
     
           
       
        
   
  