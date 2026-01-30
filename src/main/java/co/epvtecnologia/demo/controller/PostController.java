package co.epvtecnologia.demo.controller;

import co.epvtecnologia.demo.entity.Post;
import co.epvtecnologia.demo.repository.PostRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostRepository repo;

    public PostController(PostRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Post create(@Valid @RequestBody Post post) {
        return repo.save(post);
    }

    @GetMapping
    public List<Post> list() {
        return repo.findAll();
    }

    @PutMapping("/{id}")
    public Post update(@PathVariable Long id, @RequestBody Post post) {
        Post p = repo.findById(id).orElseThrow();
        p.setTitle(post.getTitle());
        p.setContent(post.getContent());
        return repo.save(p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }

}
