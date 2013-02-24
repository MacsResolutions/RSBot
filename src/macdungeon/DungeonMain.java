package macdungeon;

import java.awt.Graphics;

import org.powerbot.core.event.listeners.PaintListener;
import org.powerbot.core.script.ActiveScript;
import org.powerbot.core.script.job.state.Node;
import org.powerbot.game.api.Manifest;
import org.powerbot.game.api.methods.node.SceneEntities;
import org.powerbot.game.api.wrappers.node.SceneObject;

@Manifest(authors = { "Mac_Daddy" }, description = "Suck it iDungeon", name = "MacDungeoneering")
public class DungeonMain extends ActiveScript implements PaintListener {

	@Override
	public int loop() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void onRepaint(Graphics g) {
		if (so != null)
			so.draw(g);
	}
	
	SceneObject so;
	
	class EnterDungeon extends Node {
		
		@Override
		public boolean activate() {
			so = SceneEntities.getNearest(Constants.DUNGEON_ENTRANCE);
			
			return so != null && so.isOnScreen();
		}

		@Override
		public void execute() {
		}
		
	}
}
