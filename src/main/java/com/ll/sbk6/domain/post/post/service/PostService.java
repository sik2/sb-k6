package com.ll.sbk6.domain.post.post.service;

import com.ll.sbk6.domain.post.post.entity.Post;
import com.ll.sbk6.domain.post.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    public List<Post> finAll() {
        return postRepository.findAll();
    }

    public void save(String title, String content) {
        this.postRepository.save(Post.builder()
                .title(title)
                .content(content)
                .build());
    }
}
