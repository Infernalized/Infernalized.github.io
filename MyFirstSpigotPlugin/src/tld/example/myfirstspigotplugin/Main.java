package tld.example.myfirstspigotplugin;

	import org.bukkit.command.Command;
	import org.bukkit.command.CommandSender;
	import org.bukkit.plugin.java.JavaPlugin;
	
	public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
	
	}
	
	@Override
	public void onDisable() {
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender,
			Command command,
			String label,
			String[] args) {
		if (command.getName().equalsIgnoreCase("mycommand")) {
			sender.sendMessage("You ran /mycommand!");
			return true;
			
		}
		return false;
		
	}


}