<!DOCTYPE html>
<html lang="zh-CN">
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Zichen">

    <title>Creative - Start Bootstrap Theme</title>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <link href="http://cdn.bootcss.com/font-awesome/4.4.0/css/font-awesome.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <style>
        .top-offset10 {
            margin-top: 10px;
        }
        .top-offset20 {
            margin-top: 20px;
        }
        .half-width {
            width: 50%;
        }

    </style>
</head>
<body>

<#include "loadding.ftl">

<header class="container masthead text-center text-white d-flex" >
    <div class="container my-auto">
        <div class="row">
            <div class="col-lg-6 col-sm-6 mx-auto">
                <form id="login" role="form">
                    <h2 class="text-uppercase">欢迎登录</h2>
                    <div class=" input-group input-group-md top-offset20">
                        <span class="input-group-addon" id="esizing-usernam" ><i class="glyphicon glyphicon-user" aria-hidden="true"></i></span>
                        <input type="text" class="form-control" id="loginname" name="loginname" placeholder="请输入用户ID"/>
                    </div>
                    <div class=" input-group input-group-md top-offset10">
                        <span class="input-group-addon" id="sizing-password"><i class="glyphicon glyphicon-lock"></i></span>
                        <input type="password" class="form-control" id="loginpssd" name="loginpssd" placeholder="请输入密码"/>
                    </div>
                    <div class="top-offset20">
                        <button id="submit" type="submit" class="btn btn-success half-width col-xs-3">登录</button>
                        <button class="btn btn-danger half-width col-xs-3">注册</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</header>

<#include "footerPage.ftl">
<script>
    //定时器id
    var setIntervalId;
    $(function () {
        $("form").submit(function() {return false;});//关闭form提交
        $('#submit').click(function () {
            //停止之前的定时器
            clearInterval(setIntervalId);
            $('#loading').addClass('screen');
            $('#loading').show();
            $.post('../user/login?'+$('#login').serialize(),{},function (data) {
                data = $.parseJSON(data);
                console.log(data);
                if(data.error){
                    if(data.error == '用户名不存在'){
                        $('.modal-body').html('用户名不存在！');
                        loginnameHasError();
                    }else{
                        $('.modal-body').html('密码错误！');
                        loginpssdHasError();
                    }
                    $('#model').trigger('click');
                }else{

                }
                $('#loading').removeClass('screen');
                $('#loading').hide();
            });
        });

        //关闭定时器
        $('#loginname').focus(function () {
            if($('#loginname').parent().hasClass('has-error')){
                timeout = false;
                console.log(123);
            }
        });

        //关闭定时器
        $('#loginpssd').focus(function () {
            if($('#loginpssd').parent().hasClass('has-error')){
                timeout = false;
                console.log(456);
            }
        });
    });
    //用户名框判断
    function loginnameHasError() {
        setIntervalId = setInterval(function () {
            if($('#loginname').parent().hasClass('has-error')){
                $('#loginname').parent().removeClass('has-error');
            }else{
                $('#loginname').parent().addClass('has-error');
            }
        },500);
    }

    //密码框判断
    function loginpssdHasError() {
        setIntervalId = setInterval(function () {
            if($('#loginpssd').parent().hasClass('has-error')){
                $('#loginpssd').parent().removeClass('has-error');
            }else{
                $('#loginpssd').parent().addClass('has-error');
            }
        },500);
    }
</script>
</body>
</html>