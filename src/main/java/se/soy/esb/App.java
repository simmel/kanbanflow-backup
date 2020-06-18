package se.soy.esb;

import org.apache.camel.blueprint.Main;

public class App {
  private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[1].getClassName());

  public static void main(String[] args) throws Exception {
    log.info("Hello world!");
    /* log.info(System.getProperty("camel.blueprint")); */
    Main main = new Main();
    // lets use a configuration class (you can specify multiple classes)
    // (properties are automatic loaded from application.properties)
    /* main.configure().addConfigurationClass(MyConfiguration.class); */
    // and add all the XML routes
    /* main.configure().withXmlRoutes("route.xml"); */
    // We create the bundle, so include us.
    main.setIncludeSelfAsBundle(true);
    main.setBundleName("lolBundle");
    // setup the blueprint file here
    main.setDescriptors("file:/home/simmel/code/kanbanflow-backup/src/main/resources/route.xml");
    /* main.setDescriptors("OSGI-INF/blueprint/route.xml"); */
    // set the configAdmin persistent file name
    /* main.setConfigAdminPid("meow"); */
    /* main.setConfigAdminFileName("src/main/resources/etc/meow.cfg"); */
    /* main.configure().addRoutesBuilder(Routes.class); */

    // now keep the application running until the JVM is terminated (ctrl + c or sigterm)
    main.run(args);
  }
}
