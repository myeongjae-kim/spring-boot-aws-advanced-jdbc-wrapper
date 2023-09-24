package kim.myeongjae.aws.advanced.jdbc.wrapper.foo;

public record FooResponse(
        Long id
) {

    public static FooResponse from(Foo foo) {
        return new FooResponse(foo.getId());
    }
}
