package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class FleshSpoiler extends BossPlugin {

	private int[] stage1_ids = Constants.FLESH_SPOILER_1;
	private int[] stage2_ids = Constants.FLESH_SPOILER_2;
	private int[] spawn_ids = Constants.FLESH_SPOILER_SPAWN;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Flesh-spoiler Haasghenahk";
	}

	@Override
	public int loop() {
		return 0;
	}

}
