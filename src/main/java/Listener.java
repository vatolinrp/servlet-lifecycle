import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebListener
public class Listener implements ServletContextListener {

  private static final Logger logger = LoggerFactory.getLogger(Listener.class);

  @Override
  public void contextInitialized(ServletContextEvent servletContextEvent) {
    logger.info("we are at contextInitialized");
  }

  @Override
  public void contextDestroyed(ServletContextEvent servletContextEvent) {
    logger.info("we are at contextDestroyed");
  }
}
