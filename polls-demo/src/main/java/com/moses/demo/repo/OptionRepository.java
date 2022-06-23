package com.moses.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.moses.demo.domain.Option;

@Repository
public interface OptionRepository extends CrudRepository<Option, Long>  {

}
