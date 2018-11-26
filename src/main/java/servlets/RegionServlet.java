package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "RegionServlet")
public class RegionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> region = new ArrayList<String>();
        HttpSession session = request.getSession();
        String action = request.getParameter("action");

        if ("Marmara".equals(action)){
            System.out.println("marmara");

            region.add("istanbul");
            region.add("çanakkale");
            region.add("edirne");

            session.setAttribute("marmara",region);
            session.setAttribute("karadeniz",null);
            System.out.println(region);
            request.getRequestDispatcher("index2result.jsp").forward(request,response);
        }
        else if ("Karadeniz".equals(action)){

            region.add("rize");
            region.add("ordu");
            region.add("trabzon");
            session.setAttribute("marmara",null);
            session.setAttribute("karadeniz",region);

            System.out.println("karadeniz");
            System.out.println(region);
            request.getRequestDispatcher("index2result.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
