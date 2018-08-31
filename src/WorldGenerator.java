import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Paragoumba on 28/10/2017.
 */

public class WorldGenerator extends JavaPlugin {

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {

        return new Generator();

    }
}
