package playn_wrap_demo.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import playn_wrap_demo.core.Main;

public class MainActivity extends GameActivity {

  @Override
  public void main(){
    PlayN.run(new Main());
  }
}
