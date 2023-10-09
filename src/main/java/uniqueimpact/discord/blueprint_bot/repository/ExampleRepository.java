package uniqueimpact.discord.blueprint_bot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uniqueimpact.discord.blueprint_bot.entity.Example;

@Repository
public interface ExampleRepository extends CrudRepository<Example, Integer> {

}
