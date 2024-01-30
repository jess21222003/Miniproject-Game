import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class IndexServlet
 */
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
//		response.getWriter().append(str+"\n");
		
		String password=request.getParameter("password");
//		System.out.println(str1);
//		response.getWriter().append(str1); 
		
		Gpsjdbc1 g1=new Gpsjdbc1(name,password);
        if(g1.login()) {
        	request.setAttribute("uscore",0);
        	request.setAttribute("cscore",0);
        	request.setAttribute("username",name);

        	RequestDispatcher requ=request.getRequestDispatcher("main.jsp");
    		requ.forward(request, response);
        }
        else {
        	response.getWriter().append("Incorrect username and password");
        }
		
		doGet(request, response); 
	}

}