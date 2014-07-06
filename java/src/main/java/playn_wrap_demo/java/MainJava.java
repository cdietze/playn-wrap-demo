package playn_wrap_demo.java;

import playn.core.PlayN;
import playn.java.JavaPlatform;

import playn_wrap_demo.core.Main;

public class MainJava {

  public static void main(String[] args) {
    JavaPlatform.Config config = new JavaPlatform.Config();
    // use config to customize the Java platform, if needed
    JavaPlatform.register(config);
    PlayN.run(new Main());
  }
}
