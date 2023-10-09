package uniqueimpact.discord.blueprint_bot.discord.buttons;

import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import org.springframework.stereotype.Service;
import uniqueimpact.discord.blueprint_bot.discord.buttons.impl.ExampleButton;

import java.util.HashMap;
import java.util.Map;

@Service
public class ButtonHandler {

    private final Map<String, Button> buttons = new HashMap<>();

    public ButtonHandler(
            ExampleButton exampleButton
    ) {
        buttons.put("EX", exampleButton);
    }

    public void handle(ButtonInteractionEvent buttonEvent) {

        String[] buttonArgs = buttonEvent.getComponentId().split(" ");

        String buttonType = buttonArgs[0];
        if (buttons.containsKey(buttonType)) {
            buttons.get(buttonType).run(buttonEvent, buttonArgs);
        } else {
            buttonEvent.reply("That button is not implemented yet :(");
        }

    }

}
