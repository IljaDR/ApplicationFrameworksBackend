package derycke.ilja.fullstackopdracht.dao;

import derycke.ilja.fullstackopdracht.model.Opleiding;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface OpleidingDAO extends CrudRepository<Opleiding, Integer> {
    List<Opleiding> findAll();
    void removeById(Integer integer);

    @Override
    Optional<Opleiding> findById(Integer integer);

    @Override
    <S extends Opleiding> S save(S s);
}
