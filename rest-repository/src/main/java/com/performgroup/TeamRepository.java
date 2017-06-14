package com.performgroup;

import com.performgroup.dto.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author piotr.larysz
 */
@RepositoryRestResource
public interface TeamRepository extends MongoRepository<Team, String> {
}
