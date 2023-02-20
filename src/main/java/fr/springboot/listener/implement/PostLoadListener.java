package fr.springboot.listener.implement;

import org.hibernate.event.spi.PostLoadEvent;
import org.hibernate.event.spi.PostLoadEventListener;
import org.springframework.stereotype.Component;

@Component
public class PostLoadListener implements PostLoadEventListener {

	@Override
	public void onPostLoad(PostLoadEvent event) {
		System.out.println("In Post Load");
	}
}
