package fr.springboot.listener.implement;

import org.hibernate.event.spi.PreUpdateEvent;
import org.hibernate.event.spi.PreUpdateEventListener;
import org.springframework.stereotype.Component;

@Component
public class PreUpdateListener implements PreUpdateEventListener {

	@Override
	public boolean onPreUpdate(PreUpdateEvent event) {
		System.out.println("In Pre Update");
		return false;
	}

	/*
	 * This listener require that after transaction hooks be registered.
     * This is true for post-insert event listeners.
    */
//	@Override
//	public boolean requiresPostCommitHandling(EntityPersister persister) {
//		// TODO Auto-generated method stub
//		return false;
//	}
}
