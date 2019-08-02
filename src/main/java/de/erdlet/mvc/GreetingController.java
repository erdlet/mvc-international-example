package de.erdlet.mvc;

import javax.mvc.Controller;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("greeting")
@Controller
public class GreetingController {

  @GET
  @View("index.jsp")
  public void index() {
    // nothing to see here!
  }
}
