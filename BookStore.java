import java.io.IOException;
import java.time.*;
import java.util.ArrayList;
import java.util.Scanner;


public class BookStore {
       
        String bookStoreName;
        String storeAddress;
        String phoneNumber;
        int openingTime;
        int closingTime;
        String dayOpen;
        boolean usedBooks;
        private ArrayList<String> titles;

        
        public BookStore(){
            bookStoreName = "Beautiful Books";
            storeAddress = "12 anyplace ct";
            phoneNumber = "K555";
            titles = new ArrayList<String>();
            loadTitles();
        }


        public BookStore(int open, int close) {
            this.openingTime = open;
            this.closingTime = close;

        }

        public BookStore(String day){
            this.dayOpen = day;
            
        }

        public void getTitles(){
            for(int i = 0; i < titles.size(); i++){
                System.out.println(titles.get(i));
            }
        }

        public void totalNumberOfTitles(){
            System.out.println(titles.size());
        }

        public void getTitlesByKeyword(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a word maybe we have the book");
            String word = scan.nextLine();

            for(String title : titles){
                if(word.contains(title)){
                    System.out.println(title);
                } else {
                    System.out.println("We dont have that title");
                }
            }
            scan.close();

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
    
            
            private void loadTitles()
            {
            try
            {
            Utils.loadStringsToArray(this.titles);
            }
            catch (IOException e)
            {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();
            
            }
            }

}