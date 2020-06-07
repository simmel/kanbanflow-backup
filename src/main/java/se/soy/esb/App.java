package se.soy.esb;

public class App {
  private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[1].getClassName());

  public static void main(String[] args) throws Exception {
    log.info("Hello world!");
  }
}
