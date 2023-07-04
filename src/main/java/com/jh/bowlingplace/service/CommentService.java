package com.jh.bowlingplace.service;

import com.jh.bowlingplace.domain.CommentDomain;
import com.jh.bowlingplace.repository.CommentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<CommentDomain> getList() {
        return commentRepository.getList();
    }

    public List<CommentDomain> get(int centerId) {
        return commentRepository.get(centerId);
    }

    public void save(CommentDomain commentDomain) {
        commentRepository.save(commentDomain);
    }

    public void update(CommentDomain commentDomain) {
        commentRepository.update(commentDomain);
    }

    public void delete(int comNo) {
        commentRepository.delete(comNo);
    }
}
