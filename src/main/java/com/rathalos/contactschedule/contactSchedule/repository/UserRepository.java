package com.rathalos.contactschedule.contactSchedule.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rathalos.contactschedule.contactSchedule.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Serializable>{

	public abstract User findByUsername(String username);
}
