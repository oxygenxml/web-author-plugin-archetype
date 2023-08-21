package ${package};

import java.io.IOException;

import ro.sync.ecss.extensions.api.webapp.plugin.servlet.ServletException;
import ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletRequest;
import ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletResponse;

import ro.sync.ecss.extensions.api.webapp.plugin.ServletPluginExtension;

public class SampleServletPluginExtension extends ServletPluginExtension{

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
