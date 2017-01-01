package com.org.micro.insta.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.org.micro.insta.feeds.Feeds;
@RepositoryRestResource
public interface FeedsRepository extends CrudRepository<Feeds, Long> {

}
