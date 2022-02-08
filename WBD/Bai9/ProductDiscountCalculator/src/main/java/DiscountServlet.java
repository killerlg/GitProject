import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/display-discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Float listPrice = Float.parseFloat(request.getParameter("listPrice"));
        Float discountPercent = Float.parseFloat(request.getParameter("discountPercent"));
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("Discount Amount: " + listPrice*discountPercent/100);
        printWriter.println("Discount Price: " + (listPrice-listPrice*discountPercent/100));
        printWriter.println("</html>");
    }
}
