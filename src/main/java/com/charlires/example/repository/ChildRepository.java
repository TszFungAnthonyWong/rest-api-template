package com.charlires.example.repository;

import com.charlires.example.model.Child;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.repository.annotation.RestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by carlos_andonaegui on 4/1/14.
 */
@Repository
@RestResource(rel = "children", path = "children")
public interface ChildRepository extends PagingAndSortingRepository<Child, Integer> {
}
