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

        <!-- 原创 -->
        <div class="card">
            <!-- Box Comment -->
            <div class="card card-widget">
                <div class="card-header">
                    <div class="user-block">
                        <img class="img-circle" src="../AdminLTE3-2/dist/img/user1-128x128.jpg" alt="User Image">
                        <span class="username"><a href="#">Jonathan Burke Jr.</a></span>
                        <span class="description">Shared publicly - 7:30 PM Today</span>
                    </div>
                    <!-- /.user-block -->
                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-toggle="tooltip" title="Mark as read">
                            <i class="fa fa-circle-o"></i></button>
                        <button type="button" class="btn btn-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                        </button>
                        <button type="button" class="btn btn-tool" data-widget="remove"><i class="fa fa-times"></i>
                        </button>
                    </div>
                    <!-- /.card-tools -->
                </div>
                <!-- /.card-header -->
                <!-- Main content -->
                <div class="card-body">
                    <img class="img-fluid pad" src="../AdminLTE3-2/dist/img/photo2.png" alt="Photo">

                    <p>I took this photo this morning. What do you guys think?</p>
                    <button type="button" class="btn btn-default btn-sm"><i class="fa fa-share"></i> Share</button>
                    <button type="button" class="btn btn-default btn-sm"><i class="fa fa-thumbs-o-up"></i> Like</button>
                    <span class="float-right text-muted">127 likes - 3 comments</span>
                </div>
                <!-- /.card-body -->
                <div class="card-footer card-comments">
                    <div class="card-comment">
                        <!-- User image -->
                        <img class="img-circle img-sm" src="../AdminLTE3-2/dist/img/user3-128x128.jpg" alt="User Image">

                        <div class="comment-text">
                    <span class="username">
                      Maria Gonzales
                      <span class="text-muted float-right">8:03 PM Today</span>
                    </span><!-- /.username -->
                            It is a long established fact that a reader will be distracted
                            by the readable content of a page when looking at its layout.
                        </div>
                        <!-- /.comment-text -->
                    </div>
                    <!-- /.card-comment -->
                    <div class="card-comment">
                        <!-- User image -->
                        <img class="img-circle img-sm" src="../AdminLTE3-2/dist/img/user4-128x128.jpg" alt="User Image">

                        <div class="comment-text">
                    <span class="username">
                      Luna Stark
                      <span class="text-muted float-right">8:03 PM Today</span>
                    </span><!-- /.username -->
                            It is a long established fact that a reader will be distracted
                            by the readable content of a page when looking at its layout.
                        </div>
                        <!-- /.comment-text -->
                    </div>
                    <!-- /.card-comment -->
                </div>
                <!-- /.card-footer -->
                <div class="card-footer">
                    <form action="#" method="post">
                        <img class="img-fluid img-circle img-sm" src="../AdminLTE3-2/dist/img/user4-128x128.jpg" alt="Alt Text">
                        <!-- .img-push is used to add margin to elements next to floating images -->
                        <div class="img-push">
                            <input type="text" class="form-control form-control-sm" placeholder="Press enter to post comment">
                        </div>
                    </form>
                </div>
                <!-- /.card-footer -->
            </div>
            <!-- /.content -->

        </div>



    </div>
    <!-- /.card -->



</div>
<!-- /.col -->

<#include "../footerPage.ftl">

<script>
    window.onload = function (ev) {
      console.log(${RequestParameters['annalid']});
    };
</script>
</body>
</html>
