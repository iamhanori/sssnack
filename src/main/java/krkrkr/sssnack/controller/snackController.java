package krkrkr.sssnack.controller;

import krkrkr.sssnack.dto.snackDTO;
import krkrkr.sssnack.service.snackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
