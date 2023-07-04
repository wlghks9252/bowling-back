package com.jh.bowlingplace.controller;

import com.jh.bowlingplace.domain.CommentDomain;
import com.jh.bowlingplace.service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentControllers {
    private final CommentService commentService;

    public CommentControllers(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public List<CommentDomain> getList() {
        return commentService.getList();
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @GetMapping("/{centerId}")
    public List<CommentDomain> get(@PathVariable int centerId) {
        return commentService.get(centerId);
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @PostMapping
    public void save(@RequestBody CommentDomain commentDomain) {
        commentService.save(commentDomain);
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @PutMapping
    public void update(@RequestBody CommentDomain commentDomain) {
        commentService.update(commentDomain);
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @DeleteMapping("/{comNo}")
    public void delete(@PathVariable int comNo) {
        commentService.delete(comNo);
    }
}
