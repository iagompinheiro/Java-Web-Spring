package br.com.iagompinheiro.usersdept.repositories;

import br.com.iagompinheiro.usersdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
