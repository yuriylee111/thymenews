package com.lee.thymenews.repository;

import com.lee.thymenews.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {

    Optional<Post> findByUrl(String url);

    @Query("SELECT p FROM Post p WHERE " +
            " p.title LIKE CONCAT('%', :query, '%') OR " +
            " p.description LIKE CONCAT('%', :query, '%')")
    List<Post> searchPosts(String query);

    @Query(value = "SELECT * FROM Post p WHERE p.created_by =:userId", nativeQuery = true)
    List<Post> findPostsByUser(Long userId);
}
