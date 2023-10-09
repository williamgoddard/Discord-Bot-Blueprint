package uniqueimpact.discord.blueprint_bot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uniqueimpact.discord.blueprint_bot.entity.Example;
import uniqueimpact.discord.blueprint_bot.repository.ExampleRepository;

@Service
public class ExampleService {

    @Autowired
    private ExampleRepository exampleRepository;

    public Example save(Example example) {
        return exampleRepository.save(example);
    }

    public Example find(Integer id) {
        return exampleRepository.findById(id).orElse(null);
    }

    public Boolean exists(Integer id) {
        return exampleRepository.existsById(id);
    }

    public void delete(Example example) {
        exampleRepository.delete(example);
    }

}
