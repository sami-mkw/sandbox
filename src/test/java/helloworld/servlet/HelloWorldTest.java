/**
 *
 */
package helloworld.servlet;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

/**
 * @author sami
 *
 */
public class HelloWorldTest {

	@Test
	public void testDoGet() {
		HelloWorld classUnderTest = new HelloWorld();
		MockHttpServletRequest req = new MockHttpServletRequest();
		MockHttpServletResponse res = new MockHttpServletResponse();
		try {
			classUnderTest.doGet(req, res);
			String message = (String)req.getAttribute("message");
			assertThat(message, containsString("現在の時刻は ["));
			assertThat(message, containsString("] です。"));

		} catch (ServletException | IOException e) {
			assertTrue(false);
		}
	}

}
