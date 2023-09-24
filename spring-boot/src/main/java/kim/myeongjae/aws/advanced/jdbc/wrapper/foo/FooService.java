package kim.myeongjae.aws.advanced.jdbc.wrapper.foo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FooService {

    private final FooRepository fooRepository;

    public FooService(FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }


    @Transactional
    public FooResponse create() {
        return FooResponse.from(fooRepository.save(new Foo()));
    }

    @Transactional(readOnly = true)
    public List<FooResponse> findAll() {
        return fooRepository.findAll().stream()
                .map(FooResponse::from)
                .collect(Collectors.toList());
    }
}
