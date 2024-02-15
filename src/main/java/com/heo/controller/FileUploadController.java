package com.heo.controller;


import com.heo.pojo.Result;
import com.heo.utils.AliOssUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.util.UUID;

@RestController
public class FileUploadController {
    @PostMapping("/upload")
    public Result<String> upload(MultipartFile file) throws Exception {
        String originalFilename = file.getOriginalFilename();
        String filename = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));
//        file.transferTo(new File("C:\\Users\\86139\\Desktop\\Java\\springboot3+vue3（黑马）\\FileUpload\\"+filename));
        String url = AliOssUtil.uploadFile(filename, file.getInputStream());
        return Result.success(url);
    }
}
