package kim.myeongjae.aws.advanced.jdbc.wrapper.foo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/foo")
public class FooController {
    private final FooService fooService;

    public FooController(FooService fooService) {
        this.fooService = fooService;
    }

    @PostMapping("/create")
    public FooResponse create() {
        return fooService.create();
    }

    @GetMapping()
    public List<FooResponse> findAll() {
        return fooService.findAll();
    }
}
