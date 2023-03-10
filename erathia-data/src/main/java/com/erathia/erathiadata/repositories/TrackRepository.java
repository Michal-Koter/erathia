package com.erathia.erathiadata.repositories;

import com.erathia.erathiadata.models.Track;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TrackRepository extends JpaRepository<Track, Integer> {
    Optional<Track> findBySourceId(int sourceId);
    Optional<Track> findByTitle(String title);
}
