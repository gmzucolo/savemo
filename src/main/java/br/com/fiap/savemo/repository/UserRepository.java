package br.com.fiap.savemo.repository;

import br.com.fiap.savemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
