package denpear;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        log ("Here is Method init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Method super.service dispatch requests!\n");
        super.service(req, resp);
        resp.getWriter().write("Out of Method service\n");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Here is Method doGet\n");
    }

    @Override
    public void destroy() {
        log ("Here is Method destroy\n");

    }
}
