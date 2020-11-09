package events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MemberLeaveEvent extends ListenerAdapter {

    public void onGuildMemberRemove(GuildMemberRemoveEvent event) {
        Member member = event.getMember();
        if (member == null) return;
        String ping = member.getAsMention();
        String img = member.getUser().getEffectiveAvatarUrl();
        TextChannel channel = event.getGuild().getTextChannelById(**ChannelID**); //channel_id
        if (channel == null) return;

        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyy HH:mm");
        Date date = new Date();

        EmbedBuilder eb = new EmbedBuilder();
        eb.setTitle("TEXT");
        eb.addField("TEXT", true);
        eb.setColor(Color.black);
        eb.setThumbnail(img);
        eb.setFooter("TEXT DATA" + formatter.format(date), event.getGuild().getIconUrl());

        channel.sendMessage(eb.build()).queue();
    }
}
