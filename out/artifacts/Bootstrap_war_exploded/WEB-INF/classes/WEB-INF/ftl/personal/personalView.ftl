<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="x-ua-compatible" content="ie=edge">

    <title>个人信息 | A small world</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
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
                            <li class="breadcrumb-item"><a href="#">渺小的世界</a></li>
                            <li class="breadcrumb-item active">A small world</li>
                        </ol>
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.container-fluid -->
        </div>
        <!-- /.content-header -->
        <!-- Main content -->
    <#--<div class="view">
        <div class="tabbable" id="tabs-494806">
            <ul class="nav nav-tabs">
                <li class="active"><a href="#panel-1" data-toggle="tab" >Home</a></li>
                <li><a href="#panel-2" data-toggle="tab">SVN</a></li>
                <li><a href="#panel-3" data-toggle="tab">iOS</a></li>
                <li><a href="#panel-4">VB.Net</a></li>
                <li class="dropdown">
                    <a data-toggle="dropdown" href="#">
                        Java <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Swing</a></li>
                        <li><a href="#">jMeter</a></li>
                        <li><a href="#">EJB</a></li>
                        <li class="divider"></li>
                        <li><a href="#">分离的链接</a></li>
                    </ul>
                </li>
                <li><a href="#">PHP</a></li>
            </ul>
        </div>
        <div class="tab-content">
            <div class="tab-pane active" id="panel-1" contenteditable="true">
                <p>第一部分内容.</p>
            </div>
            <div class="tab-pane" id="panel-2" contenteditable="true">
                <p>第二部分内容.</p>
            </div>
        </div>
    </div>-->
        <!-- /.class -->
        <div class="row">
            <div class="col-12">
                <!-- Custom Tabs -->
                <div class="card">
                    <div class="card-header d-flex p-0">
                        <ul class="nav nav-pills p-2">
                            <li style="padding: 10px 15px;color: #6c757d;"><span style="">个人资料</span></li>
                            <li class="nav-item"><a class="nav-link active" href="#tab_1" data-toggle="tab">基本信息</a></li>
                            <li class="nav-item"><a class="nav-link" href="#tab_2" data-toggle="tab">身份信息</a></li>
                            <li class="nav-item"><a class="nav-link" href="#tab_3" data-toggle="tab">关联信息</a></li>
                            <li class="nav-item dropdown">
                                <a class="nav-link" data-toggle="dropdown" href="#" aria-expanded="false">
                                    Dropdown <span class="caret"></span>
                                </a>
                                <div class="dropdown-menu" x-placement="bottom-start" style="position: absolute; transform: translate3d(-33px, 40px, 0px); top: 0px; left: 0px; will-change: transform;">
                                    <a class="dropdown-item" tabindex="-1" href="#">Action</a>
                                    <a class="dropdown-item" tabindex="-1" href="#">Another action</a>
                                    <a class="dropdown-item" tabindex="-1" href="#">Something else here</a>
                                    <div class="divider"></div>
                                    <a class="dropdown-item" tabindex="-1" href="#">Separated link</a>
                                </div>
                            </li>
                        </ul>
                    </div><!-- /.card-header -->
                    <div class="card-body">
                        <div class="tab-content">
                            <div class="tab-pane active" id="tab_1">
                                <!-- Input addon -->
                                <div class="card card-info">
                                    <div class="card-header">
                                        <h3 class="card-title">基本信息</h3>
                                    </div>
                                    <div class="card-body">
                                        <form class="bs-example bs-example-form" role="form">
                                            <div class="input-group mb-3">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text">姓名：</span>
                                                </div>
                                                <input type="text" class="form-control" name="name" placeholder="请输入姓名">
                                            </div>
                                            <div class="input-group mb-3">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text">年龄：</span>
                                                </div>
                                                <input type="text" class="form-control" name="age" placeholder="年龄">
                                            </div>
                                        </form>

                                    </div>
                                    <!-- /.card-body -->
                                </div>
                                <!-- /.card -->
                            </div>
                            <!-- /.tab-pane -->
                            <div class="tab-pane" id="tab_2">
                                The European languages are members of the same family. Their separate existence is a myth.
                                For science, music, sport, etc, Europe uses the same vocabulary. The languages only differ
                                in their grammar, their pronunciation and their most common words. Everyone realizes why a
                                new common language would be desirable: one could refuse to pay expensive translators. To
                                achieve this, it would be necessary to have uniform grammar, pronunciation and more common
                                words. If several languages coalesce, the grammar of the resulting language is more simple
                                and regular than that of the individual languages.
                            </div>
                            <!-- /.tab-pane -->
                            <div class="tab-pane" id="tab_3">
                                Lorem Ipsum is simply dummy text of the printing and typesetting industry.
                                Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,
                                when an unknown printer took a galley of type and scrambled it to make a type specimen book.
                                It has survived not only five centuries, but also the leap into electronic typesetting,
                                remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset
                                sheets containing Lorem Ipsum passages, and more recently with desktop publishing software
                                like Aldus PageMaker including versions of Lorem Ipsum.
                            </div>
                            <!-- /.tab-pane -->
                        </div>
                        <!-- /.tab-content -->
                    </div><!-- /.card-body -->
                </div>
                <!-- ./card -->
            </div>
            <!-- /.col -->
            <div class="overlay"></div>
            <div class="loading-img"></div>
        </div>

    </div>
    <div class="overlay">
        <i class="fa fa-refresh fa-spin"></i>
    </div>
<#include "../footerPage.ftl">
    <script>
        $(function () {

            $('.nav li').click(function () {
                $('.nav .active').removeClass('active');
                $(this).addClass('active');
                console.log(123);
            });
            setTimeout(function () {

            },5000);
        });
    </script>
</body>
</html>
