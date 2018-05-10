package ${package};

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ro.sync.ecss.extensions.api.webapp.plugin.WebappServletPluginExtension;

public class SampleWebappServletPluginExtension extends WebappServletPluginExtension{

  @Override
  public String getPath() {
    // You can access this servlet extension at: OXYGEN_WEB_AUTHOR/plugins-dispatcher/servlet-path
    return "servlet-path";
  }

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.getWriter().write("Custom plugin servlet here");
  }
}
