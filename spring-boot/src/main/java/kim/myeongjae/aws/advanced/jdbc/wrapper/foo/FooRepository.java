package kim.myeongjae.aws.advanced.jdbc.wrapper.foo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FooRepository extends JpaRepository<Foo, Long> {
}
