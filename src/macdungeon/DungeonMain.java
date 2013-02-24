package macdungeon;

import java.awt.Graphics;

import org.powerbot.core.event.listeners.PaintListener;
import org.powerbot.core.script.ActiveScript;
import org.powerbot.game.api.Manifest;

@Manifest(authors = { "Mac_Daddy" }, description = "Suck it iDungeon", name = "MacDungeoneering")
public class DungeonMain extends ActiveScript implements PaintListener {
	@Override
	public int loop() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void onRepaint(Graphics g) {
	}
}
