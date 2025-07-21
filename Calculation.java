public class Calculation {
    public static void main(String[] args) {
        
    
    double num1 = 20.00;
    double num2 = 80.00;
    double add = (num1 + num2) *100.00;
    System.out.println("Add : " +add);
    double remainder = add % 40.00;
    System.out.println("Mod: " + remainder);
    boolean isremainder = remainder == 0.00? true : false;
    System.out.println("Boolean : " + isremainder);
    
    if(isremainder == false){
         System.out.println("got some remainder");
    }
}
}