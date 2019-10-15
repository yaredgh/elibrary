package edu.mum.cs.cs425.demos.elibrarydemocrudweb.repository;

import edu.mum.cs.cs425.demos.elibrarydemocrudweb.model.Book;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

	List<Book> findAllByIsbnContainingOrTitleContainingOrPublisherContainingOrderByTitle(String searchString,
			String searchString2, String searchString3);
    // This interface definition relies on the public abstract methods
    // inherited from the super interface, CrudRepository<T, ID>
    // We may override any or add more methods here, if needed.
}
