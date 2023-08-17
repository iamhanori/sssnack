package krkrkr.sssnack.service;

import krkrkr.sssnack.dto.snackDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface snackService {
    // select (list)
    public List<snackDTO> listAll();

    public void insert(snackDTO dto);
}
