package com.moses.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.moses.demo.domain.Vote;

@Repository
public interface VoteRepository extends CrudRepository<Vote, Long> {

}
