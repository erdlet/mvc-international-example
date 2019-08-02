package de.erdlet.mvc;

import javax.mvc.Controller;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Simple Controller which renders a view that uses internationalized values.
 *
 * @author Tobias Erdle
 */
@Path("greeting")
@Controller
public class GreetingController {

  @GET
  @View("index.jsp")
  public void index() {
    // nothing to see here!
  }
}
