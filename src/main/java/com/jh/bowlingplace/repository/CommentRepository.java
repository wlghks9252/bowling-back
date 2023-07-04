package com.jh.bowlingplace.repository;
import com.jh.bowlingplace.domain.CommentDomain;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository {
    List<CommentDomain> getList();

    List<CommentDomain> get(int centerId);

    void save(CommentDomain commentDomain);

    void update(CommentDomain commentDomain);

    void delete(int comNo);

}
