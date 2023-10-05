package kim.myeongjae.aws.advanced.jdbc.wrapper.foo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FooRepository extends JpaRepository<Foo, Long> {
    List<Foo> findTop100ByOrderByIdDesc();
}
