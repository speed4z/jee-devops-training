package GradleJDBCDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import com.sprint1.dao.ApplicantDAO;
import com.sprint1.dao.ApplicantDAOImpl;
import com.sprint1.entities.Applicant;
import com.sprint1.service.ApplicantService;
import com.sprint1.service.ApplicantServiceImpl;

//which layer is tested here
//service layer
//but our service layer is dependent upon dao
//dao is not ready
//Mocking these objects  --EasyMock ,Mockito framework has some methods which will enable you to mock create those dao objects , dao will behave in a certain manner
//Applicant dao.addApplicant(Applicant applicant)
@RunWith(EasyMockRunner.class)
class ApplicantServiceSpec {
	static ApplicantService service  ;
   static Applicant a;
   
   
   static private ApplicantDAO dao ;
   
   
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
			
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	
	 a = new Applicant(111,"john","123456","john@gmail") ;
	 service = new ApplicantServiceImpl();
	dao = EasyMock.createMock(ApplicantDAO.class);

	}
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddApplicant() {
		//according to the tdd approach 
		//design the test 
		//let it fail
		//refactor the code in the method of the class under test
		//until we get green
		//AAA --Arrange --setUP --2 Act  --calling addAPplicant 3 assert equals
		//mocking the dao layer by using EasyMock APIs , 
		//Mockito  --when then 
		//here we are using expect and Return
		//easymock dao.addapplicnt(a) return a
		EasyMock.expect(dao.addApplicant(a)).andReturn(a);
		//you aare done with all mocking , 
		EasyMock.replay(dao);
		//Act upon the test method
		
		a = service.addApplicant(a);	
		//asserting
		
		assertEquals("john",a.getName());
		
	}

}
