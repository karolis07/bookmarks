package com.getbookmarks.repository;

import com.getbookmarks.domain.Story;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.getbookmarks.domain.Story;

import java.util.List;

@Repository
public interface StoryRepository extends CrudRepository<Story, String> {

    public List<Story> findAll();
}
