package dev.moon.record.Repository;



import dev.moon.record.Entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
    Record findById(String watchkey);
}
