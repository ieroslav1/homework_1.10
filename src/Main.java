public class Main {
    public static void main(String[] args) {
        var author = new Author("Steven", "King");
        var author2 = new Author("Adolf", "Hitler");
        var Book = new Book("The Shining", author, 1980);
        var Book2 = new Book("Main Kampf", author2, 1925);

        System.out.println(Book.getName() + " " + Book.getYear() + " " + Book.getAuthor());
        System.out.println(Book2.getName() + " " + Book2.getYear() + " " + Book2.getAuthor());
        Book.setYear(1977);
        System.out.println(Book.getName() + " " + Book.getYear() + " " + Book.getAuthor());
    }
}