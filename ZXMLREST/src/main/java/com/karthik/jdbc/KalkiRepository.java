package com.karthik.jdbc;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface KalkiRepository extends CrudRepository<Kalki, Integer> {

}
