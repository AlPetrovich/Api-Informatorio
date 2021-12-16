package api.informatorio.prueba.repository;

import api.informatorio.prueba.entity.Event;
import api.informatorio.prueba.entity.Startup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface IEventRepository extends JpaRepository<Event, Long> {

    @Query("FROM Event e ORDER BY e.prize DESC")
    Set<Event> getEventByPrize();
}
