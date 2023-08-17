package krkrkr.sssnack.mapper;

import krkrkr.sssnack.dto.snackDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface snackMapper {

    // select (list)
    public List<snackDTO> listAll();

    // insert
    public void insert(snackDTO dto);

    // delete
    public void delete(String id);

    // read
    public snackDTO read(String id);

    // update
    public void update(snackDTO dto);


}
