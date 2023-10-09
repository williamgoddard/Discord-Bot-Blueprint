package uniqueimpact.discord.blueprint_bot.discord.buttons;
;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;

public interface Button {

    public void run(ButtonInteractionEvent button, String[] buttonArgs);

}
