package dev.ranjan.productservimpl.inheritanceDemo.tableperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tbc_ur")
public interface userRepository extends JpaRepository<user, Long> {
    @Override
    <S extends user> S save(S entity);
}
