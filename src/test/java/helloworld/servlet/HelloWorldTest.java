/**
 *
 */
package helloworld.servlet;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

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
			assertEquals("/WEB-INF/jsp/index.jsp",res.getForwardedUrl());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
