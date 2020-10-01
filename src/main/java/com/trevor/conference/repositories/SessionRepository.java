package com.trevor.conference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trevor.conference.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
