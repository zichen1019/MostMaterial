<!DOCTYPE html>
<html lang="en">
<head>
    <title>租房 | A small world</title>
    <#include "../css.ftl">
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">
<#include "../leftPage.ftl">
<#include "../header.ftl">
    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <div class="content-header">
            <div class="container-fluid">
                <div class="row mb-2">
                    <div class="col-sm-6">
                        <h1 class="m-0 text-dark">渺小的世界</h1>
                        <small>A small world</small>
                    </div><!-- /.col -->
                    <div class="col-sm-6">
                        <ol class="breadcrumb float-sm-right">
                            <li class="breadcrumb-item"><a href="#">租房</a></li>
                            <li class="breadcrumb-item active">Renting</li>
                        </ol>
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.container-fluid -->
        </div>
        <!-- /.content-header -->
        <!-- Main content -->
        <section class="content">
            <div class="container-fluid">
                <!-- Info boxes -->
                <div class="row" id="rentingViews">

                    <!--- 使用js【getRenting】生成此处 -->
                    <!-- /.col -->


                </div>
                <!-- /.row -->


            </div><!--/. container-fluid -->
        </section>
        <!-- /.content -->

    </div>
<#include "../footerPage.ftl">

    <!--  -->
    <script>
        //页面初加载
        window.onload = function () {
            getRenting(0,8);
        };

        <!-- 获取房间List信息 -->
        function getRenting(start,end){
            $.get('../renting/getRentings',{start:start,end:end},function (data) {
                data =  $.parseJSON(data);
                //遍历数据将数据与视图绑定
                var html = '';
                for(var i=0;i<data.length;i++){
                    html += '<div class="col-12 col-sm-6 col-md-3">\n' +
                            '                        <center class="commodity" onclick="javascript:location.href=\'detailed_information?annalid='+data[i].annalid+'\'">\n' +
                            '                            <img width="100" height="100" src="'+data[i].photo+'">\n' +
                            '                            <p>'+data[i].title+'</p>\n' +
                            '                            <p>'+data[i].price+'</p>\n' +
                            '                        </center>\n' +
                            '                    </div>';
                }
                $('#rentingViews').html(html);
            });
        }
    </script>
</body>
</html>
