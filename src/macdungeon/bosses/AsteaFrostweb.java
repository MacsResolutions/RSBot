package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class AsteaFrostweb extends BossPlugin {

	private int[] ids = Constants.ASTEA_FROSTWEB;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Astea Frostweb";
	}

	@Override
	public int loop() {
		return 0;
	}

}
