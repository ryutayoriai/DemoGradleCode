package com.example.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("demo")
class DemoController {

    @GetMapping("/hoge")
    fun demo(
        @RequestParam(value = "name", required = false, defaultValue = "world") name: String, model: Model): String {
        model.addAttribute("name", name)
        return "sample"
    }

    @GetMapping("/findAll")
    fun findAll(model: Model): String {
        var testList : MutableList<Test> = mutableListOf()
        testList.add(0, Test("1", "Ryuta Yoriai"))
        testList.add(1, Test("2", "Test Tarou"))

        model.addAttribute("list", testList)
        return "index"
    }
}

// todo
data class Test(val id: String, val name: String)