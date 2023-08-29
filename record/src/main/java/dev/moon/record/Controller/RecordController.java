package dev.moon.record.Controller;

import dev.moon.record.Entity.Record;
import dev.moon.record.Repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {

    private final RecordRepository recordRepository;

    @Autowired
    public RecordController(RecordRepository recordRepository){
        this.recordRepository = recordRepository;
    }

    @PostMapping("/api/check-record")
    public Record ReturnRecord(@RequestBody RecordRequest request){
        String Id = request.getId();
        System.out.println(Id);

        Record watchkey = recordRepository.findById(Id);
        return watchkey;
    }
}
