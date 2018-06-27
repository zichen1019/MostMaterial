<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>AdminLTE 3 | Log in</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="../AdminLTE3-2/dist/css/adminlte.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="../AdminLTE3-2/plugins/iCheck/square/blue.css">
    <!-- Google Font: Source Sans Pro -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">

    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .input-group{
            margin: 10px auto;
        }
    </style>
</head>
<body class="hold-transition login-page">
<#include "loadding.ftl">
<div class="login-box">
    <div class="login-logo">
        <span href="#"><b>A small </b>world</span>
    </div>
    <!-- /.login-logo -->
    <div class="card">
        <div class="card-body login-card-body">
            <p class="login-box-msg">欢迎登录</p>

            <form id="login" role="form" method="post">
                <div class="input-group input-group-md top-offset20">
                    <span class="input-group-addon" id="esizing-usernam" ><i class="glyphicon glyphicon-user" aria-hidden="true"></i></span>
                    <input type="text" class="form-control" id="loginname" name="loginname" placeholder="请输入用户ID"/>
                </div>
                <div class="input-group input-group-md top-offset10">
                    <span class="input-group-addon" id="sizing-password"><i class="glyphicon glyphicon-lock"></i></span>
                    <input type="password" class="form-control" id="loginpssd" name="loginpssd" placeholder="请输入密码"/>
                </div>
                <div class="row">
                    <div class="col-8">
                        <div class="checkbox icheck">
                            <label>
                                <input type="checkbox"> 记住账户
                            </label>
                        </div>
                    </div>
                    <!-- /.col -->
                    <div class="col-4">
                        <button id="submit" type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
                    </div>
                    <!-- /.col -->
                </div>
            </form>

            <div class="social-auth-links text-center mb-3">
                <p>- 或者 -</p>
                <a href="#" class="btn btn-block btn-primary">
                    <i class="fa fa-facebook mr-2"></i> 忘记密码
                </a>
                <a href="#" class="btn btn-block btn-danger">
                    <i class="fa fa-google-plus mr-2"></i> 注册账号
                </a>
            </div>
            <!-- /.social-auth-links -->

        </div>
        <!-- /.login-card-body -->
    </div>
</div>
<!-- /.login-box -->


<!-- 按钮触发模态框 -->
<button class="btn btn-primary btn-lg hidden" id="model"  data-toggle="modal" data-target="#myModal">
    开始演示模态框
</button>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    警告
                </h4>
            </div>
            <div class="modal-body">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" data-dismiss="modal">
                    知道了
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<#include "footerPage.ftl">

<!-- jQuery -->
<script src="../AdminLTE3-2/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="../AdminLTE3-2/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- iCheck -->
<script src="../AdminLTE3-2/plugins/iCheck/icheck.min.js"></script>
<script>
    //定时器id
    var setIntervalId;
    $(function () {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass   : 'iradio_square-blue',
            increaseArea : '20%' // optional
        });

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
    <!-- $(function(){}) -->
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
