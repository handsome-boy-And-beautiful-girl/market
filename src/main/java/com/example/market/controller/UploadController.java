package com.example.market.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
public class UploadController {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    /*
     *
     * 单文件上传
     *
     * */

    // 文件上传 保存在本地Z:/img/
    @PostMapping("/fileUpload")
    public String FileUpload(MultipartFile file){
        try {
            if(file.isEmpty()){
                return "文件为空";
            }
            // 获取文件名
            String filename = file.getOriginalFilename();
            //获取文件后缀
            String suffixName = filename.substring(filename.lastIndexOf("."));
            String filePath = "Z:/img/";
            String format = sdf.format(new Date());
            String path = filePath+format+'/'+filename;
            File dest = new File(path);
            // 检测是否存在该目录
            if(!dest.getAbsoluteFile().exists()){
                dest.getAbsoluteFile().mkdirs();
            }
            System.out.println("上传的文件路径为"+path);
            file.transferTo(dest);
            return "上传成功";

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";

    }

    /*
     *
     * 多文件上传
     *
     * */
    @PostMapping("/uploads")
    public String upload(MultipartFile[] files, HttpServletRequest req) throws IOException {
        String format = sdf.format(new Date());
        String realpath = req.getServletContext().getRealPath("/img/")+format+"/";
        File folder = new File(realpath);
        if (!folder.exists()){
            //  如果不存在
            folder.mkdirs();
        }
        //  获取文件名字
        // 循环files 列表 逐一添加
        for (MultipartFile file : files) {
//            System.out.println(file);
            String oldName = file.getOriginalFilename();
            String newName = UUID.randomUUID().toString()+oldName.substring(oldName.lastIndexOf("."));
            try{
                file.transferTo(new File(folder,newName));
                String url = req.getScheme()+"://"+req.getServerName()+":"+req.getServerPort()+"/img/"+format+"/"+ newName;
                System.out.println(url);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return "上传成功";
    }


}
