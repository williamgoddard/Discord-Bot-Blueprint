package uniqueimpact.discord.blueprint_bot.discord.buttons.impl;

import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.interactions.InteractionHook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uniqueimpact.discord.blueprint_bot.discord.buttons.Button;
import uniqueimpact.discord.blueprint_bot.service.ExampleService;

@Service
public class ExampleButton implements Button {

    @Autowired
    private ExampleService exampleService;

    @Override
    public void run(ButtonInteractionEvent button, String[] buttonArgs) {

        InteractionHook hook = button.getHook();
        hook.sendMessage("This is an example button.").setEphemeral(true).queue();
        return;

    }

}
