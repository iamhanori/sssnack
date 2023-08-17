package krkrkr.sssnack.controller;

import krkrkr.sssnack.dto.snackDTO;
import krkrkr.sssnack.service.snackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class snackController {
    @Autowired
    private snackService service;

    // 상품 목록 - index(list)
    @GetMapping("/")
    public String list(Model model) {
        List<snackDTO> list = service.listAll();
        model.addAttribute("list", list);
        return "index";
    }

    // 상품 등록 - form
    @GetMapping("/add_form")
    public String add_form() {
        return "add_form";
    }

    // 상품 등록 - insert
    @PostMapping("/add")
    public String add(snackDTO dto) {
        service.insert(dto);
        return "result";
    }

    // 상품 삭제 - delete
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id) {
        service.delete(id);
        return "redirect:/";
    }

    // 상품 수정 전 불러오기 - read
    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") String id, Model model) {
        snackDTO dto = service.read(id);
        model.addAttribute("dto", dto);
        return "read";
    }

    // 상품 수정 - update
    @PostMapping("/update")
    public String update(snackDTO dto) {
        service.update(dto);
        return "redirect:/";
    }
}
