import Entity.Subgenre;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/list")
public class AnimeServlet extends HttpServlet {

    ServletConfig config = null;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        config = servletConfig;
        System.out.println("Init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        ArrayList<Subgenre> animeList = new ArrayList<>();
        servletResponse.setContentType("text/html");
        System.out.println("service");
        try{
            animeList = Saxxml.parse("anime.xml");
        }
        catch (Exception e)
        {
            System.out.println("Exception " + e);
        }
        for (Subgenre anime: animeList)
        {
            servletResponse.getWriter().println("------------");
            servletResponse.getWriter().println(anime.getAnimeName());
            servletResponse.getWriter().println(anime.getGenre());
            servletResponse.getWriter().println(anime.getAmountOfEpisodes());
            servletResponse.getWriter().println(anime.getEpisodeLength());
            servletResponse.getWriter().println("------------<br>");
        }
    }

    @Override
    public String getServletInfo() {
        return "AnimeServlet";
    }

    @Override
    public void destroy() {
        System.out.println("Destroy...");
    }
}
