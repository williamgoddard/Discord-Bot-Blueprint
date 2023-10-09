package uniqueimpact.discord.blueprint_bot.discord.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import org.springframework.stereotype.Service;
import uniqueimpact.discord.blueprint_bot.discord.commands.impl.ExampleCommand;

import java.util.HashMap;
import java.util.Map;

@Service
public class CommandHandler {

    private final Map<String, Command> commands = new HashMap<>();

    public CommandHandler(
            ExampleCommand exampleCommand
    ) {
        commands.put("example", exampleCommand);
    }

    public final void handle(SlashCommandInteractionEvent commandEvent) {

        String commandName = commandEvent.getName();
        if (commands.containsKey(commandName)) {
            commands.get(commandName).run(commandEvent);
        } else {
            commandEvent.reply("That command is not implemented yet :(");
        }

    }

}
