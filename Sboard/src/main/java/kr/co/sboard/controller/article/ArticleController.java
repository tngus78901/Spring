package kr.co.sboard.controller.article;

import jakarta.servlet.http.HttpServletRequest;
import kr.co.sboard.dto.ArticleDTO;
import kr.co.sboard.service.ArticleService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Log4j2
@Controller
public class ArticleController {

    private ArticleDTO dto ;

    @Autowired
    private ArticleService articleService;

    @GetMapping("/article/list")
    public String list(){
        return "article/list";
    }
    @GetMapping("/article/register")
    public String register(){
        return "article/register";
    }
    @PostMapping("/article/register")
    public String register(HttpServletRequest request, ){

        log.info(dto);

        articleService.save(dto);
        return "article/register";
    }
}
