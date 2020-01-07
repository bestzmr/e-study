package cn.bestsort.e_study.controller;

import cn.bestsort.e_study.pojo.dto.SuperiorFile;
import cn.bestsort.e_study.service.SuperiorFileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TODO
 *
 * @author bestsort
 * @version 1.0
 * @date 1/7/20 9:44 AM
 */
@Api(tags = "上级文件传达相关接口")
@RestController
public class SuperiorFileController {
    @Autowired
    private SuperiorFileService superiorFileService;
    @ApiOperation("根据分页(pageSize,pageNo)获取上级文件列表")
    @GetMapping("/listSuperiorFiles")
    public List<SuperiorFile> listSuperiorFiles(@RequestParam(defaultValue = "1") int pageNo,
                                                @RequestParam(defaultValue = "5") int pageSize){
        return superiorFileService.listSuperiorFiles(pageNo,pageSize);
    }

    @ApiOperation("根据 id 获取详情")
    @GetMapping("/getSuperiorFilesById")
    public SuperiorFile getById(long id){
        return superiorFileService.getById(id);
    }
}
