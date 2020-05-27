package paczka1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WitajSwiecieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html; charset=utf-8 ");
		PrintWriter pw = res.getWriter();
		pw.println("Witaj, świecie!\n");
		pw.println("<b>drugi i trzeci ...</b>");
	}
}
