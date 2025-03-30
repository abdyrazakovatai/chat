package peaksoft.java15.nosqlgraphqlproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import peaksoft.java15.nosqlgraphqlproject.entity.User;
@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
