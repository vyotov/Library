import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.mockito.Mockito.*;

public class BookTest {
    private static final String BOOK_NAME = "ET";
    private static final String AUTHOR_NAME = "Stiven King";
    private static final String CHAPTER_NAME = "Introduction";
    private static final List<Chapter> CHAPTERS = new ArrayList<Chapter>();
    /*

You can add a Chapter to a book
•	Parameters include the name and number of a chapter after which a Chapter Object is created and added

     */

    private Book book = mock(Book.class);
    @Test
    public void bookByNameAndAuthor() throws IllegalArgumentException{
        when(book.getName()).thenReturn(BOOK_NAME);
        when(book.getAuthor()).thenReturn(AUTHOR_NAME);
    }
    @Test
    public void addChapterToBook() throws IllegalArgumentException{
        //Assert.assertNotNull(book);
    }
    @Test
    public void getTOC(){
        List<Chapter> sortedChapters = new ArrayList<Chapter>();
        Collections.sort(sortedChapters);
        Collections.sort(CHAPTERS);

        Assert.assertTrue((CHAPTERS.equals(sortedChapters)));
    }
}
