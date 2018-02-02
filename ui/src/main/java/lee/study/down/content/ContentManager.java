package lee.study.down.content;

public class ContentManager {

  public final static DownContent DOWN = new DownContent();
  public final static WsContent WS = new WsContent();
  public final static ConfigContent CONFIG = new ConfigContent();
  public final static UnzipContent UNZIP = new UnzipContent();

  public static void init() {
    CONFIG.init();
    DOWN.init();
    WS.init();
    UNZIP.init();
  }
}
