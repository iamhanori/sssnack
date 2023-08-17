package krkrkr.sssnack.service;

import krkrkr.sssnack.dto.snackDTO;
import krkrkr.sssnack.mapper.snackMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class snackServiceImpl implements snackService{
    @Autowired
    private snackMapper mapper;

    // 상품 목록 - listAll
    public List<snackDTO> listAll() {
        return mapper.listAll();
    }

    // 상품 등록 - insert
    @Override
    public void insert(snackDTO dto) {
        mapper.insert(dto);
    }

    // 상품 삭제 - delete
    @Override
    public void delete(String id) {
        mapper.delete(id);
    }

    // 상품 수정 전 불러오기 - read
    @Override
    public snackDTO read(String id) {
        return mapper.read(id);
    }

    // 상품 수정 - update
    @Override
    public void update(snackDTO dto) {
        mapper.update(dto);
    }

}
