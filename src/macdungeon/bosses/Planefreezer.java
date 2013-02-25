package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class Planefreezer extends BossPlugin {

	private int[] ids = Constants.PLANE_FREEZER;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Plane-freezer Lakhrahnaz";
	}

	@Override
	public int loop() {
		return 0;
	}

}
