package repository;

import model.SearchEngine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchEngineRepository extends JpaRepository<SearchEngine, String> {

}
