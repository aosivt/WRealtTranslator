package su.kww.w.realttranslator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vaadin.annotations.JavaScript;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@Theme("mytheme")
@JavaScript({"vaadin://js/jquery-3.3.1.min.js"})

public class Init extends UI{

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Upload upload = new Upload();
        upload.setButtonCaption("Down");
        setContent(upload);
    }

    @WebServlet(urlPatterns = "/*", name = "RealtServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = Init.class, productionMode = false)
    public static class RealtServlet extends VaadinServlet {

    }
}
