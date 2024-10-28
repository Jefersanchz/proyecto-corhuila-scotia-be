package CorhuilaApp.CorhuilaApp.Repository;

import CorhuilaApp.CorhuilaApp.Entity.AcademicPeriod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PeriodRepository extends JpaRepository<AcademicPeriod, Long> {
    Optional<AcademicPeriod> findByname(String name);

}
