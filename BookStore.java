public class BookStore {
        String bookStoreName;

        String address;
        String phoneNumber;
        String openingTime;
        String closingTime;
        int squareFeet;
        boolean usedBooks;

        public boolean haveUsedBooks(){
            return true;
        }

        public void bookStoreOpenToday(){
            System.out.println("Yes the store is open today");
        }

        public void openedOnSunday(){
            System.out.println("No not open on Sunday");
        }

    


    public BookStore() {

    }


}