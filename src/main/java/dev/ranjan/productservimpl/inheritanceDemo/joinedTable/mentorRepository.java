package dev.ranjan.productservimpl.inheritanceDemo.joinedTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("jt_mr")
public interface mentorRepository extends JpaRepository<mentor, Long> {
    @Override
    <S extends mentor> S save(S entity);
}
