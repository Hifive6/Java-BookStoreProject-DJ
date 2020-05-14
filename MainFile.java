
public class MainFile {
    public static void main(String[] args) {
        // string_b();
        BookStore newstore = new BookStore();
        System.out.printf("Welcome to %s, located at %s. Please call %s if you have any questions.%n", newstore.bookStoreName, newstore.storeAddress, newstore.phoneNumber);
        // newstore.getTitles();
        newstore.totalNumberOfTitles();
        newstore.getTitlesByKeyword();

        BookStore store = new BookStore(2, 15);
        store.isOpen();

        BookStore day = new BookStore("monday");
        day.dayWeAreOpen();

       
    }               
}