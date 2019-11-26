package com.financeData.server.dao;

import org.springframework.data.repository.CrudRepository;

import com.financeData.server.entity.除权Entity;

public interface 除权信息Repository extends CrudRepository<除权Entity, Long> {

	// List<除权Entity> findAll除权信息();

}
