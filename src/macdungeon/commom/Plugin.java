package macdungeon.commom;

import org.powerbot.core.event.events.MessageEvent;
import org.powerbot.core.event.listeners.MessageListener;
import org.powerbot.core.script.ActiveScript;

public abstract class Plugin extends ActiveScript implements MessageListener {

	private boolean startup = false;
	private boolean finished;
	
	public abstract String getStatus();
	
	public abstract String getAuthor();
	
	public abstract String getName();
	
	public boolean isFinished() {
		return finished;
	}
	
	public abstract int loop();
	
	public void startupMessage() {
		if (!startup) {
			//log("Doing " + getName() + " by " + getAuthor());
			startup = true;
		}
	}
	
	@Override
	public boolean equals(Object o) {
		return o != null && o instanceof Plugin && o.getClass().getName().equals(getClass().getName());
	}
	
	public void messageReceived(MessageEvent messageEvent) {
		if (messageEvent.getId() == 2 || messageEvent.getId() == 108 || messageEvent.getId() == 109) {
			if (messageEvent.getMessage().contains("You received item:")) {
				finished = true;
			}
		}
	}
}
