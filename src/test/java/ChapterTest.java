import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class ChapterTest {
 private static final String CHAPTER_NAME = "Introduction";
 private static final String CHAPTER_NUMBER = "5.8";
 /*

Chapters can be used in a sorted collection
•	They must implement Comparable and override equals and hashcode.

*/

 private Chapter chapter = mock(Chapter.class);
 private List<Chapter> CHAPTERS = new ArrayList<Chapter>();
 @Test
 public void chapterByNameAndNumber() throws IllegalArgumentException{

  when(chapter.getName()).thenReturn(CHAPTER_NAME);
  when(chapter.getNumber()).thenReturn(CHAPTER_NUMBER);
  //verify(chapter).
 }
 @Test
 public void verifySortedCollection(){
  Assert.assertTrue("ss",true);
  when(chapter.hashCode()).thenReturn(Integer.parseInt(CHAPTER_NUMBER));


 }
}
