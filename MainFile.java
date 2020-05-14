public class MainFile {
    public static void main(String[] args) {
        BookStore store = new BookStore();
        store.bookStoreName = "Beatiful Books";
        store.squareFeet = 1200;
        store.address = "12 anywhere st";
        store.openedOnSunday();
        System.out.println(store.haveUsedBooks());
    }
}