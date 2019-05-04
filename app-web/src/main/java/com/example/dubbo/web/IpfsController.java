//package com.example.dubbo.web;
//
//import io.ipfs.api.IPFS;
//import io.ipfs.api.MerkleNode;
//import io.ipfs.api.NamedStreamable;
//import io.ipfs.multihash.Multihash;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.imageio.stream.FileImageInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
///**
// * @Author Ciwei
// * @Date 2019/5/3/003
// */
//@RestController
//@Slf4j
//@RequestMapping("/ipfs")
//public class IpfsController {
//
//    @Autowired
//    private IPFS ipfs;
//
//    /**
//     * 初始化ipfs分布式文件系统
//     * <p>
//     * https://github.com/ipfs/java-ipfs-http-client
//     */
//    @Bean
//    public IPFS init() {
//        IPFS ipfs = new IPFS("/ip4/192.168.15.59/tcp/5001");
//        return ipfs;
//    }
//
//    @GetMapping("/uploudFile")
//    public String ipfsUploudFile() throws IOException {
//        //上传文件file类型
//        NamedStreamable.FileWrapper file = new NamedStreamable.FileWrapper(new File("C:\\Users\\Administrator\\Pictures\\lovewallpaper\\1516979866320_feeds_152999926_0-0.jpeg"));
//        MerkleNode addResult = ipfs.add(file).get(0);
//        log.info(addResult.hash.toString());
//        return "上传成功呀：" + addResult.hash.toString();
//    }
//
//    @GetMapping("/uploudByte")
//    public String ipfsUploudByte() throws IOException {
//        //上传文件byte[]类型 可以是文件也可以是内容呀
//        NamedStreamable.ByteArrayWrapper file = new NamedStreamable.ByteArrayWrapper(image2byte("C:\\Users\\Administrator\\Pictures\\lovewallpaper\\927_2016050942101789.jpg"));
//        MerkleNode addResult = ipfs.add(file).get(0);
//        log.info(addResult.hash.toString());
//        return "上传成功呀：" + addResult.hash.toString();
//    }
//
//    @GetMapping("/get")
//    public String get() throws IOException {
//        //获取文件
//        Multihash filePointer = Multihash.fromBase58("QmNWt8iJDUvEVQMV9C3Gp522VAxb19HUYTbWiggvVV4DYX");
//        byte[] fileContents = ipfs.cat(filePointer);
//        return "文件二进制：" + fileContents;
//    }
//
//    //图片到byte数组
//    public byte[] image2byte(String path) {
//        byte[] data = null;
//        FileImageInputStream input = null;
//        try {
//            input = new FileImageInputStream(new File(path));
//            ByteArrayOutputStream output = new ByteArrayOutputStream();
//            byte[] buf = new byte[1024];
//            int numBytesRead = 0;
//            while ((numBytesRead = input.read(buf)) != -1) {
//                output.write(buf, 0, numBytesRead);
//            }
//            data = output.toByteArray();
//            output.close();
//            input.close();
//        } catch (FileNotFoundException ex1) {
//            ex1.printStackTrace();
//        } catch (IOException ex1) {
//            ex1.printStackTrace();
//        }
//        return data;
//    }
//
//}
