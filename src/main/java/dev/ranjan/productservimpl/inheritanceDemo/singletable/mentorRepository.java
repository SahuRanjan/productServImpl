package dev.ranjan.productservimpl.inheritanceDemo.singletable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("st_mr")
public interface mentorRepository extends JpaRepository<mentor, Long> {
    @Override
    <S extends mentor> S save(S entity);
}
