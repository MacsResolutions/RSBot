package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class SkeletonTrio extends BossPlugin {

	private int[] warrior_ids = Constants.SKELETAL_WARRIOR;
	private int[] archer_ids = Constants.SKELETAL_ARCHER;
	private int[] sorcerer_ids = Constants.SKELETAL_SORCERER;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Skeleton Trio";
	}

	@Override
	public int loop() {
		return 0;
	}

}
