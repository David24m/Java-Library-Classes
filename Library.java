public class Library{
  private String name;
  private Book [] books;
  private Person [] student;

  public Library(String name){
    this.name = name;
    this.books = new Book[5];
    this.student = new Person[10];
  }

  public String getName(){
    return this.name;
  }

  public int bookCount(){
    int count = 0;
    for( Book book : this.books){
      if( book != null){
        count++;
      }
    }
    return count;
  }

  public void add_book(Book book){
    if( this.isLibraryFullOfBooks() ){
      return;
    }
    int bookCount = bookCount();
    books[bookCount] = book;
  }

  public boolean isLibraryFullOfBooks(){
    return this.bookCount() == this.books.length;
  }

  public void booksAllOut(){
    for(int i = 0; i < books.length; i++){
      books[i] = null;
    }
  }

  public int studentCount(){
    int count = 0;
    for (Person person : this.student){
      if( person != null){
        count++;
      }
    }
    return count;
  }

  public void add(Person person){
    if( this.isLibraryFull() ){
      return;
    }
    int studentCount = studentCount();
    student[studentCount] = person;
  }

  public boolean isLibraryFull(){
    return this.studentCount() == this.student.length;
  }

  public void closingTime(){
    for(int i = 0; i < student.length; i++){
      student[i] = null;
    }
  }



}
