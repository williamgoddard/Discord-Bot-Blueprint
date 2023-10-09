package uniqueimpact.discord.blueprint_bot.discord.commands.impl;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.InteractionHook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uniqueimpact.discord.blueprint_bot.discord.commands.Command;
import uniqueimpact.discord.blueprint_bot.service.ExampleService;

@Service
public class ExampleCommand implements Command {

    @Autowired
    private ExampleService exampleService;

    @Override
    public void run(SlashCommandInteractionEvent command) {

        InteractionHook hook = command.getHook();
        hook.sendMessage("This is an example command.").setEphemeral(true).queue();
        return;

    }

}
