package com.example.exam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.exam.DAOUser;

@Repository
public interface UserRepository extends JpaRepository<DAOUser, Long>{

}
