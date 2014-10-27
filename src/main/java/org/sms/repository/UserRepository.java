package org.sms.repository;

import org.sms.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer>{

	Users findByName(String name);


}
