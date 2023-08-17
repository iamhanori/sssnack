package krkrkr.sssnack.service;

import krkrkr.sssnack.dto.snackDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface snackService {
    // 상품 목록 (list - select)
    public List<snackDTO> listAll();

    // 상품 등록 (insert)
    public void insert(snackDTO dto);

    // 상품 삭제 (delete)
    public void delete(String id);

    // 상품 수정 전 불러오기 (read)
    public snackDTO read(String id);

    // 상품 수정 (update)
    public void update(snackDTO dto);

}
