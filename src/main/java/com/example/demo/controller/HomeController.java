package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // ส่งตัวแปรชื่อ (สมมติว่าใช้ชื่อ 'name')
        model.addAttribute("name", "นายเมธัส มณีวิจิตร"); 
        
        // เพิ่มตัวแปรใหม่ชื่อ studentId
        model.addAttribute("studentId", "673380300-2"); 
        
        return "home"; // คืนค่าชื่อ logical view
    }

    @GetMapping("/about")
    public String about(Model model) {
        // ส่งข้อความแนะนำตัวสั้นๆ ผ่าน Model
        model.addAttribute("intro", "สวัสดีครับ ผม นายเมธัส มณีวิจิตร 673380300-2 เป็นนักศึกษาที่เรียนวิชา Principles of Software Design");
        return "about"; // คืนค่าเป็นชื่อ view เชิงตรรกะ ซึ่ง ViewResolver จะไปหาไฟล์ about.html ให้เอง [2]
    }
}