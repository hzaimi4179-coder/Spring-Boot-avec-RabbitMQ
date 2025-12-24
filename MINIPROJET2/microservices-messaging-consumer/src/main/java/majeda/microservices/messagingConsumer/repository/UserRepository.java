package majeda.microservices.messagingConsumer.repository;

import majeda.microservices.messagingConsumer.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}