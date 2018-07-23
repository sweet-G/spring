package com.zt.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.apache.commons.io.IOUtils;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.*;

/**
 * @author zhangtian
 * @date 2018/7/23
 */
@Controller
@RequestMapping("/file")
public class FileUpload {

    @GetMapping("/upload")
    public String upload(){
        return "file/upload";
    }

    @PostMapping("/upload")
    //RedirectAttributes 重定向往页面传值
    public String upload(MultipartFile file, RedirectAttributes attributes){
        // 获得name属性值
        System.out.println(file.getName());
        // 获得上传文件的大小并转换为人类可阅读的
        System.out.println(FileUtils.byteCountToDisplaySize(file.getSize()));
        // MIME类型
        System.out.println(file.getContentType());
        // 文件原始名称
        System.out.println(file.getOriginalFilename());

        if(!file.isEmpty()){
            File file1 = new File("e:/temp/img/");
            if(!file1.exists()){
                file1.mkdirs();
            }
            try {
                OutputStream outputStream = new FileOutputStream(new File(file1,file.getOriginalFilename()));
                InputStream inputStream = file.getInputStream();

                IOUtils.copy(inputStream,outputStream);

                outputStream.flush();
                outputStream.close();
                inputStream.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else{
            attributes.addFlashAttribute("message","文件不能为空");
        }
        return "redirect:/file/upload";
    }
}
