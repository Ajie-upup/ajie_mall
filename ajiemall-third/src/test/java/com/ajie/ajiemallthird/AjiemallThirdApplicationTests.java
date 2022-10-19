package com.ajie.ajiemallthird;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
class AjiemallThirdApplicationTests {

    @Autowired
    private OSSClient ossClient;

    @Test
    void contextLoads() {
    }

    /**
     * 测试文件上传
     */
    @Test
    public void upload() throws FileNotFoundException {
//        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
//        String endpoint = "oss-cn-hangzhou.aliyuncs.com";
//        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
//        String accessKeyId = "LTAI5t9J7vpk3naJfGvRfG26";
//        String accessKeySecret = "cRR7XfgfVQt0AZojoHTbq5PZdAMuZE";

        // 创建OSSClient实例。
        //OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        // 填写Bucket名称，例如examplebucket。
        String bucketName = "ajiemall";
        // 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt。
        String objectName = "yigeren.jpg";

        //上传文件流
        FileInputStream fileInputStream = new FileInputStream("D:\\Desktop\\all\\photo\\一个人的星空.jpg");
        ossClient.putObject(bucketName,objectName,fileInputStream);

        ossClient.shutdown();
        System.out.println("上传成功");

    }

}
