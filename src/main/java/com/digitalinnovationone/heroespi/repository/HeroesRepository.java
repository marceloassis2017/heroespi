package com.digitalinnovationone.heroespi.repository;

import com.digitalinnovationone.heroespi.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface HeroesRepository extends  CrudRepository<Heroes, String>{

}
