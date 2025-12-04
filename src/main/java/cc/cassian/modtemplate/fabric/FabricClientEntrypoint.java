package cc.cassian.modtemplate.fabric;

//? fabric || unobf {
import cc.cassian.modtemplate.ModTemplate;
import net.fabricmc.api.ClientModInitializer;

public class FabricClientEntrypoint implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModTemplate.LOG.info("Initializing {} Client", ModTemplate.MOD_ID);
    }

}
//?}