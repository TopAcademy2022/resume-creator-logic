package resume.creator.logic.infrastructure.repositories;

import java.util.Optional;

import resume.creator.logic.domain.repositories.IObjectRepository;
import resume.creator.logic.infrastructure.data.AppDbContext;
import resume.creator.logic.infrastructure.data.models.User;

public class UserRepository implements IObjectRepository<User> {
    private AppDbContext dbContext;

    public UserRepository(AppDbContext dbContext) {
        this.dbContext = dbContext;
    }

    public boolean create(User entity) {
        try {
            this.dbContext.saveObject(entity);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public Optional<User> read(Long id) {
        User user = this.dbContext.getObjectById(User.class, id);
        return Optional.ofNullable(user);
    }
}
