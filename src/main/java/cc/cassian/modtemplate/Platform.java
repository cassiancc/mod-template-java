package cc.cassian.modtemplate;

//? fabric || unobf {
import cc.cassian.modtemplate.fabric.FabricPlatformImpl;
//?}
//? neoforge {
/*import cc.cassian.modtemplate.neoforge.NeoForgePlatformImpl;
*///?}
import java.nio.file.Path;

public interface Platform {

    //? fabric || unobf {
    Platform INSTANCE = new FabricPlatformImpl();
    //?}
    //? neoforge {
    /*Platform INSTANCE = new NeoForgePlatformImpl();
    *///?}


    boolean isModLoaded(String modid);
    String loader();
    Path getConfigDir();
    boolean isDevelopment();

}
