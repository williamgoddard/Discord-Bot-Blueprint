package uniqueimpact.discord.blueprint_bot.discord.utils;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;

import java.util.ArrayList;
import java.util.List;

public class CommandSetup {

    public static void addCommands(JDA bot) {

        List<CommandData> commands = new ArrayList<>();

        commands.add(Commands.slash("example", "Example Command"));

        //bot.updateCommands().addCommands().addCommands(commands).queue();
        bot.getGuildById("933432644857909339").updateCommands().addCommands(commands).queue();

    }

}
