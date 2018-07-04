package de.canitzp.web;

import static j2html.TagCreator.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author canitzp
 */
@WebServlet("/main")
public class Main extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req);
        System.out.println(resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.append(
                html().with(
                        head().with(
                                title("EPAK")
                        ),
                        body().with(
                                header().withText("Höhöhö")
                        )
                ).renderFormatted());
    }

}
