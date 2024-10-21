package org.example.finalprojectsf.repository;

import org.example.finalprojectsf.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    Optional<Account> findById(int userId);

    Account save(Account account);
}
