import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this is get method........");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h1>this is get method of my servlet </h1>");
		out.println(new Date().toString());
	}

}
