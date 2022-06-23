package com.moses.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.moses.demo.domain.Poll;

@Repository
public interface PollRepository extends CrudRepository<Poll, Long> {

}
