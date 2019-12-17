package blogPost;

public class BlogPost {
  /*Create a BlogPost class that has
      an authorName
      a title
      a text
      a publicationDate*/
  private String nameOfAuthor;
  private String title;
  private String text;
  private String dateOfPublication;

  public BlogPost(String title, String nameOfAuthor, String dateOfPublication, String text) {
    this.title = title;
    this.nameOfAuthor = nameOfAuthor;
    this.dateOfPublication = dateOfPublication;
    this.text = text;
  }

  /*"Lorem Ipsum" titled by John Doe posted at "2000.05.04."
  Lorem ipsum dolor sit amet.*/
  public void print() {
    System.out.println(title +" titled by " + nameOfAuthor + "posted at: " + dateOfPublication + "\n" + "   " + text);
  }
}
