package com.avinash.jenkins.Repo;

import com.avinash.jenkins.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepo extends JpaRepository<User,String> {

}
