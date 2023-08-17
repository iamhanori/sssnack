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

    // 상품 등록 - add
    @Override
    public void insert(snackDTO dto) {
        mapper.insert(dto);
    }


}
