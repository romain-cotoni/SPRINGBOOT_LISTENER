package fr.springboot.listener.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.springboot.listener.model.AppModel;

@Repository
public interface AppRepository extends JpaRepository<AppModel,Integer> {
	
}
