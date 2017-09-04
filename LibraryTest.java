import static org.junit.Assert.assertEquals;
import org.junit.*;

public class LibraryTest{
  Library library;
  Book book;
  Person person;

  @Before
  public void before(){
    library = new Library("Public Library");
    book = new Book();
    person = new Person();
  }

  @Test
  public void hasName(){
    assertEquals("Public Library", library.getName() );
  }

  @Test
  public void booksStartAtZero(){
    assertEquals( 0, library.bookCount() );
  }

  @Test
  public void canAddBooks(){
    library.add_book(book);
    assertEquals( 1, library.bookCount() );
  }

  @Test
  public void libraryHasAllBooks(){
    for(int i = 0; i < 5; i++){
      library.add_book(book);
    }
    assertEquals( true, library.isLibraryFullOfBooks() );
  }

  @Test
  public void allTheBooksAreBack(){
    for(int i = 0; i < 10; i++){
      library.add_book(book);
    }
    assertEquals( 5, library.bookCount() );
  }

  @Test
  public void booksAreAllOut(){
    library.add_book(book);
    library.booksAllOut();
    assertEquals( 0, library.studentCount() );
  }

  @Test
  public void libraryStartsEmpty(){
    assertEquals( 0, library.studentCount() );
  }

  @Test
  public void canAddStudents(){
    library.add(person);
    assertEquals( 1, library.studentCount() );
  }

  @Test
  public void libraryIsFull(){
    for(int i = 0; i < 10; i++){
      library.add(person);
    }
    assertEquals( true, library.isLibraryFull() );
  }

  @Test
  public void cannotEnterWhenLibraryIsFull(){
    for(int i = 0; i < 20; i++){
      library.add(person);
    }
    assertEquals( 10, library.studentCount() );
  }

  @Test
  public void studentsLeaveAtClosingTime(){
    library.add(person);
    library.closingTime();
    assertEquals( 0, library.studentCount() );
  }


}
