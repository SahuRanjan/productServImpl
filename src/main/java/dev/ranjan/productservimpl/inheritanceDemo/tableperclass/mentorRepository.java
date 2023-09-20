package dev.ranjan.productservimpl.inheritanceDemo.tableperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tpc_mr")
public interface mentorRepository extends JpaRepository<mentor, Long> {
    @Override
    <S extends mentor> S save(S entity);
}
