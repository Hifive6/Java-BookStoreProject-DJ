import java.util.Date;
public class MainFile {
    public static void main(String[] args) {
        // string_b();
        BookStore newstore = new BookStore();
        System.out.println(newstore.bookStoreName);
        
        BookStore store = new BookStore("Happy books", "12 anywhere", "K546");
        System.out.print(store.bookStoreName);

       
      
        // System.out.printf(
        //         "The name of the new store is %s. It is located at %s. It is a fairly large space at %d sqft.",
        //         store.bookStoreName, store.address, store.squareFeet);
    }

    //possible to use to check if the store is open currently at the time of ask.
    //if current time is btw set hours then store is open if not it is not open.   
    //Also possible to use the current date to check if it is Sunday as we this store doesnt open on sundays 
    //if current date doesnt equal sunday then then we are open else we are closed  
    // public static void string_b() {
    //        String day = "monday";                                               
    //        Date timepf = new Date();            
    //        System.out.printf( "The current local time: %1$tI:%1$tM:%1$tS %1$tZ%n", timepf);
    //        System.out.printf("%1$tA, %1$tB %1$td %1$tY %n", timepf);
    //      }                               
}