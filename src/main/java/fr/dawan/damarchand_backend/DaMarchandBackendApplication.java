package fr.dawan.damarchand_backend;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DaMarchandBackendApplication {

	//private static String bot_token = "MTE3MjEzNDQ1MTg3OTM1NDM2OA.GMKkdz.tQ1ltFVcLdnSIXvofJ781-rRy88dXy4-FPg4us";

	public static void main(String[] args) {


		/*DABuilder.createDefault(${env.discord_token})
				.setMemberCachePolicy(MemberCachePolicy.ALL)
				.enableIntents(GatewayIntent.GUILD_MEMBERS,
						GatewayIntent.GUILD_MESSAGE_REACTIONS,
						GatewayIntent.GUILD_MESSAGES,
						GatewayIntent.MESSAGE_CONTENT
				)
				.setChunkingFilter(ChunkingFilter.ALL)
				.setBulkDeleteSplittingEnabled(false)
				.setActivity(Activity.playing("lui même"))
				.addEventListeners(new SpeakListener())
				.build();*/



		SpringApplication.run(DaMarchandBackendApplication.class, args);
	}


}
