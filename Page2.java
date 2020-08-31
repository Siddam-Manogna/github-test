
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Page2
 */
@WebServlet("/Page2")
public class Page2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sem= request.getParameter("sem");

		        try
		{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dxcfs","pass");

		String sql="select * from student where sem=?";
		PreparedStatement stat=con.prepareStatement(sql);
		stat.setString(1, sem);
		ResultSet rs=stat.executeQuery();
		PrintWriter out=response.getWriter();
		ArrayList<String> ids=new ArrayList<>();
		String[] datas=request.getParameterValues("status");
		while(rs.next())
		{
		     
		String str = "<html>";
		str+="<tr>";
		str+="<td>"+ rs.getString("sId") +"</td>     ";
		out.println("   ");
		str+="<td>"+ rs.getString("sName") +"</td>";
		str+="<td> <input type='checkbox' name='state' value='"+rs.getString("sId")+"'> </td><br><br>";
		str+="</tr>";
		out.println(str);
		ids.add(rs.getString(1));
		ids.add(rs.getString(2));
		ids.add(rs.getString(3));
		ids.add(rs.getString(4));
		//ids.add(rs.getString(5));
		//ids.add(rs.getString(6));

		}
		String s="<html>";
		s+="<form  action='Att.jsp'>";
		s+="<input type='submit'>";
		s+="</form>";
		out.println(s);

		HttpSession session= request.getSession();
		session.setAttribute("ids", ids);


		}
		catch(Exception e)
		{

		e.printStackTrace();
		}


		}
}