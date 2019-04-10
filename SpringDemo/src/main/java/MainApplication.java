import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import beans.Book;

public class MainApplication {
	
	/**
	 * Main method for initializingBean, disposableBean version
	 */
	public static void main1(String... args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Book bookBean = (Book)context.getBean("bookBean");
		System.out.println("Bean ready for service.........");
		System.out.println("Book name:" + bookBean.getName());
		((AbstractApplicationContext)context).registerShutdownHook();
	}
	
	/**
	 * Main method for Aware bean impementation
	 */
	public static void main2(String... args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Book bookBean = (Book)context.getBean("bookBean");
		//System.out.println("Book-bean name:" + bookBean.getName());
		((AbstractApplicationContext)context).registerShutdownHook();
	}
	
	/**
	 * Main method to test bean configuration inheritance 
	 */
	public static void main(String... args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Book bookBeanOne = (Book)context.getBean("bookBeanOne");
		System.out.println("Instantiated Book-bean-one !!");
		Book bookBeanTwo = (Book)context.getBean("bookBeanTwo");
		System.out.println("Instantiated s Book-bean-two !!");
		System.out.println("-------- Properties of Book-bean-one ----------");
		System.out.println("Book name:" + bookBeanOne.getName());
		System.out.println("-------- Properties of Book-bean-two ----------");
		System.out.println("Book name:" + bookBeanTwo.getName());
		System.out.println("Book isbn:" + bookBeanTwo.getIsbn());
		((AbstractApplicationContext)context).registerShutdownHook();
	}
}