package org.example.app.repo;

import org.example.app.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicOperationsRepo extends JpaRepository<Account, Long> {
}
