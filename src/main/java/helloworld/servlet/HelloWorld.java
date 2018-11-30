/**
 *
 */
package helloworld.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author sami
 *
 */
public class HelloWorld extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String message = "現在の時刻は [" + new java.util.Date() + "] です。";
		request.setAttribute("message", message);
		getServletContext().getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
	}

}
