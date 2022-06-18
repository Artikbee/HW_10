public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("nameOne","fistnameOne");
        Author author2 = new Author("nameTwo","fistnameTwo");
        Author author3 = new Author("nameTwo","fistnameTwo");


        Book book1 = new Book("bookOne",author1,2000);
        Book book2 = new Book("bookTwo",author2,2001);
        Book book3 = new Book("bookThree",author3,2002);
        Book book4 = new Book("bookOne",author1,2003);

        System.out.println(book1.getAuthor());
        System.out.println(book2);
        System.out.println(author3.equals(author2));
        System.out.println(book1.equals(book4));
    }
}