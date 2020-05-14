public class BookStore {
       
        String bookStoreName;
        String storeAddress;
        String phoneNumber;
        String openingTime;
        String closingTime;
        int squareFeet;
        boolean usedBooks;

        public BookStore(){
            bookStoreName = "Beautiful Books";
            storeAddress = "12 anyplace ct";
            phoneNumber = "K555";
        }

        public BookStore(String name, String address, String phone) {
            this.bookStoreName = name;
            this.storeAddress = address;
            this.phoneNumber = phone;
    
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