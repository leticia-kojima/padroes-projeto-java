package projeto.dio.desafiojava.model;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    Iterable<Cliente> findAll(Sort id);

    Optional<Cliente> findByNome(String nome);
}
