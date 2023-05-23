package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class ParabankHooks {
 //-----------------------------1 concept 
//	@Before
//	public void  setup() {
//		System.out.println("LAUNCH CHROME BROWSER");	
//		System.out.println("Enter the Application URL");
//	}
//	
//	@After
//	public void teardown() {
//		System.out.println("CHROME BROWSER CLOSED");
//	}

	
	//-----------------------------2 concept  About Multiple same Hooks and their order
	
	
	/*
	 The very important thing to note here is:

@Before(order = int) : This runs in increment order, means value 0 would run first and 1 would be after 0.
@After(order = int) : This runs in decrements order, means apposite of @Before. Value 1 would run first and 0 would be after 1.
	 */
	
//	
//	@Before(order=1)
//	public void  setup_Browser() {
//		System.out.println("LAUNCH CHROME BROWSER");	
//	}
//	
//	@Before(order=2)
//	public void setup_Url() {
//		System.out.println("Enter  Application URL");
//		
//	}
//	
//	@After(order=1)
//	public void teardown_close() {
//		System.out.println("CHROME BROWSER CLOSED");
//	}
//	@After(order=2)
//	public void teardown_logout() {
//		System.out.println("LogOut fron the Applcation");
//	}
	
	//-----------------------------3 concept about Getting scenario name 
	
//	@Before(order=1)
//	public void  setup_Browser(Scenario sc ){
//		
//		System.out.println("LAUNCH CHROME BROWSER");	
//		System.out.println("Name of Scenario "+sc.getName());
//	}
//	
//	@Before(order=2)
//	public void setup_Url(Scenario sc) {
//		System.out.println("Enter  Application URL");
//
//		System.out.println("Name of Scenario "+sc.getId());
//	}
//	
//	@After(order=1)
//	public void teardown_close() {
//		System.out.println("CHROME BROWSER CLOSED");
//	}
//	@After(order=2)
//	public void teardown_logout() {
//		System.out.println("LogOut fron the Applcation");
//	}
	
	//---------------------4 concept @Beforestep @Afterstep
//
	@Before(order=1)
	public void  setup_Browser() {
		System.out.println("LAUNCH CHROME BROWSER");	
	}
	
	@Before(order=2)
	public void setup_Url() {
		System.out.println("Enter  Application URL");
		
	}
	
	@After(order=1)
	public void teardown_close() {
		System.out.println("CHROME BROWSER CLOSED");
	}
	@After(order=2)
	public void teardown_logout() {
		System.out.println("LogOut fron the Applcation");
	}
	
	@BeforeStep
	public void bfs() {
		System.out.println("-----Before step method--------");
	}
	@AfterStep
	public void afs() {
		System.out.println("-----After step method--------");
		
	}
	
	//----------------------------------5 concept Applying @Before for specific tag(Note: tag key should be added in ruuner file)
	
//	@Before("@InvalidPassword")
//	public void  setup_Browser() {
//		System.out.println("LAUNCH CHROME BROWSER");	
//	}
//	@After(order=1)
//	public void teardown_close() {
//		System.out.println("CHROME BROWSER CLOSED");
//	}
//	
}
