import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "clickServlet")
public class clickServlet extends HttpServlet {
    //private List<String> products = new ArrayList<String>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uri = request.getRequestURI();
        HttpSession session = request.getSession();
        String action = request.getParameter("action");

        if("FirstButton".equals(action)){
            if (session.getAttribute("FirstButton") == null){
                session.setAttribute("FirstButton",0);
            }
            int count = Integer.parseInt(session.getAttribute("FirstButton").toString());
            session.setAttribute("FirstButton",++count);
            request.getRequestDispatcher("index.jsp").forward(request,response);
            System.out.println("FirstButton: "+ count);
        }
        else if("SecondButton".equals(action)){
            if (session.getAttribute("SecondButton") == null){
                session.setAttribute("SecondButton",0);
            }
            int count = Integer.parseInt(session.getAttribute("SecondButton").toString());
            session.setAttribute("SecondButton",++count);
            request.getRequestDispatcher("index.jsp").forward(request,response);
            System.out.println("SecondButton: "+ count);

        }
        else if("Sum".equals(action)){
            PrintWriter out = response.getWriter();
            out.write("<p>First Button : " + session.getAttribute("FirstButton")+ "</p>");
            out.write("<p>Second Button : " + session.getAttribute("SecondButton")+ "</p>");
            out.write("<a href='index.jsp'>Back</a>");

        }
        else if("reset".equals(action)){
            session.setAttribute("FirstButton",0);
            session.setAttribute("SecondButton",0);
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
