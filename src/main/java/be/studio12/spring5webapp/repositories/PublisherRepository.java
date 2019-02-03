package be.studio12.spring5webapp.repositories;

import be.studio12.spring5webapp.model.Book;
import be.studio12.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
