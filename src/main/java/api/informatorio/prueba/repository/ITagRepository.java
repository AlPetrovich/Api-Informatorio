package api.informatorio.prueba.repository;
import api.informatorio.prueba.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface ITagRepository extends JpaRepository<Tag, Long> {
    Tag findByName(String name);
    @Query("FROM Tag t WHERE t.name LIKE %:name%")
    Tag getByTag(@Param("name") String name);
}
