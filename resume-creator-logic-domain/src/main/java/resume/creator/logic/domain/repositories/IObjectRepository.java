package resume.creator.logic.domain.repositories;

import java.util.Optional;

public interface IObjectRepository<T> {
    public boolean create(T entity);

    public Optional<T> read(Long id);

    // public Optional<T> read(T entity);
}
