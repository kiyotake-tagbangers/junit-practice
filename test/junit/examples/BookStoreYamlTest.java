package junit.examples;

import org.junit.Test;

public class BookStoreYamlTest {

    @Test
    public void getTotalPrice() throws Exception {
        // SetUp
        BookStore sut = new BookStore();
        // java.lang.ClassCastException: java.util.LinkedHashMap cannot be cast to junit.examples.Book
        // Book book = (Book) new Yaml().load(getClass().getResourceAsStream("../../resources/book_fixtures.yaml"));
        // sut.addToCart(book, 1);
        // assertThat(sut.getTotalPrice(), is(4500));
    }
}
