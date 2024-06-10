package telran.java52.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.java52.book.model.Author;

public interface AuthorRepository extends JpaRepository<Author, String> {

}
