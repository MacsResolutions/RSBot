package macdungeon.commom;

import org.powerbot.core.event.events.MessageEvent;

public abstract class PuzzlePlugin extends Plugin {

	protected boolean canSolve = true;
	protected boolean solved;
	
	public boolean isPossible() {
		return canSolve;
	}
	
	public boolean isSolved() {
		return solved;
	}

	public void messageReceived(MessageEvent messageEvent) {
		String txt = messageEvent.getMessage();
		if (messageEvent.getId() == 2 || messageEvent.getId() == 108 || messageEvent.getId() == 109) {
	        if (txt.contains("You need a")) {
	            canSolve = false;
	        }
	        else if (txt.contains("hear a click") ||
	                 txt.contains("now unlocked") ||
	                 txt.contains("act of simply") ||
	                 txt.contains("challenge room has already") ||
	                 txt.contains("is now passable")) {
	            solved = true;
	        }
		}
	}
}
