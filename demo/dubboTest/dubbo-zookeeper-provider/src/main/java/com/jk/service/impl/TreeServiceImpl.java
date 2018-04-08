package com.jk.service.impl;

import com.jk.dao.TreeMapper;
import com.jk.model.Tree;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 杨棋洋 on 2018/4/7.
 */
@Service("treeService")
public class TreeServiceImpl implements TreeService{

    @Autowired
    private TreeMapper treeMapper;

    public List<Tree> treeList(Tree tree) {
        List<Tree> aa = treeMapper.treeList(tree);
        return aa;
    }
}
