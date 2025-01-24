package br.com.screenmatchapi.repository;

import br.com.screenmatchapi.model.entity.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingsRepository extends JpaRepository<Ratings, Integer> {

}