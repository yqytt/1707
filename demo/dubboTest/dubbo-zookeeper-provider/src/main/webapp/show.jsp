<%--
  Created by IntelliJ IDEA.
  User: 杨棋洋
  Date: 2018/4/7
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.2.1/jquery-3.2.1.js"></script>
    <!-- easyUi核心js文件 -->
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
    <!-- easyUi语言包 -->
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
    <!-- easyUi默认的css样式 -->
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/jquery-easyui-1.4.1/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/jquery-easyui-1.4.1/themes/icon.css">
</head>
<body>
<table id="tb"></table>
<div id="tbs">
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">修改</a>
    <a href="#" id="mb" class="easyui-menubutton" data-options="iconCls:'icon-remove',plain:true">删除</a>
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" id="add">添加</a><br>
    <input type="text" >
</div>


<script>
    $("#tb").datagrid({
        url:"<%=request.getContextPath()%>/userController/findgoodgl.do",
        fit:true,
        fitColumns:true,
        striped:true,
        toolbar:'#tbs',
        pagination:true,
        pageSize:15,
        pageNumber:1,
        //singleSelect:true,
        ctrlSelect:true,
        pageList:[15,20,25,30],
        columns:[[
            {field:'s',title:'xx',checkbox:true},
            {field:'sn',title:'编号',width:20,height:30},
            {field:'name',title:'名称',width:100},
            {field:'product_category',title:'商品分类',width:100,formatter:function(value,row,index){

            }},

            {field:'price',title:'销售价',width:100},
        ]],

    })

</script>
</body>
</html>
