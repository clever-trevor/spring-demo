package com.trevor.conference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.trevor.conference.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker,Long>{

}
