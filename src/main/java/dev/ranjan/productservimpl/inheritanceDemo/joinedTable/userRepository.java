package dev.ranjan.productservimpl.inheritanceDemo.joinedTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("jt_ur")
public interface userRepository extends JpaRepository<user, Long> {
    @Override
    <S extends user> S save(S entity);
}
