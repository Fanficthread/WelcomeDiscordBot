import events.MemberJoinEvent;
import events.MemberLeaveEvent;
import events.ReadyEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.util.List;

import static net.dv8tion.jda.api.requests.GatewayIntent.*;
import static net.dv8tion.jda.api.requests.GatewayIntent.GUILD_MESSAGE_TYPING;

public class BotHello {

    public static void main(String[] args) throws Exception {
        List<GatewayIntent> intents = List.of(GUILD_MESSAGES, GUILD_MESSAGE_REACTIONS, GUILD_EMOJIS, GUILD_MESSAGE_REACTIONS, DIRECT_MESSAGE_REACTIONS, GUILD_MESSAGE_TYPING);
        JDA jda = JDABuilder.create("**TOKEN**", intents).build();
        jda.addEventListener(new MemberJoinEvent());
        jda.addEventListener(new MemberLeaveEvent());
        jda.addEventListener(new ReadyEvent());

    }
}
