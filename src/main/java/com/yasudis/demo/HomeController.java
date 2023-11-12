package com.yasudis.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller                 /*Контроллер*/
public class HomeController {
    @GetMapping("/")          /*Обрабатывает запросы корневого пути */
    public String home() {
        return "home"; /*Возвращает имя представления*/
    }

    @GetMapping("/1")          /*Обрабатывает запросы корневого пути */
    public String home1() {
        return "home1"; /*Возвращает имя представления*/
    }
}