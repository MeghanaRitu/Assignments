package newValtechSpring.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import newValtechSpring.book.Article;
import newValtechSpring.book.AssociatedAddress;
import newValtechSpring.book.Author;
import newValtechSpring.book.Blog;
import newValtechSpring.book.Book;
import newValtechSpring.book.Hardbook;
import newValtechSpring.book.Publisher;

public class HibernateClient {
	public static void main(String[] args) {
				SessionFactory sf= new AnnotationConfiguration()
						.configure()
						.addAnnotatedClass(Book.class)
						.addAnnotatedClass(Publisher.class)
						.addAnnotatedClass(Author.class).addAnnotatedClass(AssociatedAddress.class)
						.addAnnotatedClass(Article.class).addAnnotatedClass(Blog.class)
						.addAnnotatedClass(Hardbook.class)
						.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		
		AssociatedAddress a = new AssociatedAddress("JP nagar","Blr","Kar",560078);
      Author ar = new Author("shruti",92772876);
  
      Book b = new Book("xyz", new Date(1,2,90));
      Article ac =new Article("http://youtube.com");
      Blog bg = new Blog("www.google.com", 3);
      Hardbook hb = new Hardbook("123",500,1990,4 );
		
      Publisher p = new Publisher("abc","jp nagar",951675192);
      a.setAuthor(ar);
      ar.setAddress(a);
      ses.save(a);
      ses.save(ar);
      ses.save(b);
      
      ses.save(ac);
      ses.save(bg);
      ses.save(hb);
     ses.save(p);	

		
		
		tx.commit();
		ses.close();
		sf.close();
	}
}
