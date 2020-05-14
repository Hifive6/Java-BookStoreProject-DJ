import java.time.*;
import java.util.ArrayList;

// import jdk.vm.ci.meta.Local;
public class BookStore {
       
        String bookStoreName;
        String storeAddress;
        String phoneNumber;
        int openingTime;
        int closingTime;
        String dayOpen;
        boolean usedBooks;

        public BookStore(){
            bookStoreName = "Beautiful Books";
            storeAddress = "12 anyplace ct";
            phoneNumber = "K555";
        }

        public BookStore(int open, int close) {
            this.openingTime = open;
            this.closingTime = close;

        }

        public BookStore(String day){
            this.dayOpen = day;
        }
        
        public void dayWeAreOpen(){
            DayOfWeek sunday = DayOfWeek.of(7);
            // sunday.toString();
            // System.out.println(sunday);
            if(dayOpen.equalsIgnoreCase(sunday.toString())){
                System.out.println("Sorry we are closed on Sundays");
            }else {
                System.out.println("Yes we are open");
            }
        }


        public void isOpen(){
            if((openingTime >= 8) && (closingTime <= 20)){
                System.out.println("Our bookstore is open.");
                } else {
                System.out.println("Sorry our hours are from 8am to 8pm.");
                }
            }


        private ArrayList<String> titles;

        public void openingFrontDoors(){
            System.out.println("Doors are opening");
        }

        public void countingMoney(){
            System.out.println("Counting money for the day");
        }

        public void closingFrontDoors(){
            System.out.println("Doors for the day are closing");
        }

    




}