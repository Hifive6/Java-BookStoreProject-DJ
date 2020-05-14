public class BookStore {
       
        String bookStoreName;
        String storeAddress;
        String phoneNumber;
        int openingTime;
        int closingTime;
        int squareFeet;
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
         public void isOpen(){
            if((openingTime >= 8) && (closingTime <= 8)){
                System.out.println("Our bookstore is open.");
                } else {
                System.out.println("Sorry we are close.");
                }
            }


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