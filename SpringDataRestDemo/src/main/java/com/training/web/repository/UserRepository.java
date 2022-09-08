package com.training.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.training.web.entities.User;

//If you want different url
@RepositoryRestResource(path = "subs")
public interface UserRepository extends JpaRepository<User, Long>{
	
	List<User> findByName(@Param("name") String name);
	
	List<User> findByEmail(@Param("email") String email);

}
/**********thats it!!!!!!!!!*/
/*Spring Data Rest will create REST APIs based on the entity type
 * we don't need controller layer implementation
 * */


/*
 * To access H2 console
 * http://localhost:9191/userservice/h2-console
 */