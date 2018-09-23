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
                            <li class="breadcrumb-item"><a href="/${base}/view/index">渺小的世界</a></li>
                            <li class="breadcrumb-item"><a href="/${base}/view/rentingView">租房</a></li>
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
                        <img class="img-circle" src="/${base}${publisher.headPortrait}" alt="User Image">
                        <span class="username"><a href="#">${publisher.name}</a></span>
                        <span class="description">${publisher.modifydate?datetime}</span>
                    </div>
                    <!-- /.user-block -->
                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-toggle="tooltip" title="Mark as read">
                            <i class="fa fa-circle-o"></i></button>
                        <button type="button" class="btn btn-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                        </button>
                        <!--<button type="button" class="btn btn-tool" data-widget="remove"><i class="fa fa-times"></i>
                        </button>-->
                    </div>
                    <!-- /.card-tools -->
                </div>
                <!-- /.card-header -->
                <!-- Main content -->
                <div class="card-body">
                    <img class="img-fluid pad" src="/${base}/AdminLTE3-2/dist/img/photo2.png" alt="Photo">
                    <h1>${housingInformation.title}</h1>
                    <p>${housingInformation.detailedInformation}</p>
                    <button type="button" class="btn btn-default btn-sm"><i class="fa fa-share"></i> Share</button>
                    <button type="button" class="btn btn-default btn-sm"><i class="fa fa-thumbs-o-up"></i> Like</button>
                    <span class="float-right text-muted">127 likes - 3 comments</span>
                </div>
                <!-- /.card-body -->
                <div class="card-footer card-comments">
                    <#if comments??>
                    <#list comments as comment>
                    <div class="card-comment">
                        <!-- User image -->
                        <img class="img-circle img-sm" src="/${base}${comment.user.headPortrait}" alt="User Image">

                        <div class="comment-text">

                    <span class="username">
                    ${comment.user.name}:
                        ${comment.remark}
                    </span><!-- /.username -->
                            <span class="text-muted">
                                <div class="comment-footer">
                                    ${comment.createtime?string('yyyy-MM-dd HH:mm:ss')}&nbsp;&nbsp;
                                    <a href="#"><i class="fa fa-thumbs-o-up"></i></a>&nbsp;&nbsp;
                                    <a href="#"><i class="fa fa-thumbs-o-down"></i></a>&nbsp;&nbsp;
                                    <a  onclick="replysShowOrHide($('.reply${comment_index}'))">Reply</a>
                                </div>
                            </span>
                        </div>
                        <!-- /.comment-text -->
                    </div>
                    <div class="card-footer reply${comment_index} hidden">
                        <form action="#" method="post">
                            <img class="img-fluid img-circle img-sm" src="/${base}${publisher.headPortrait}" alt="Alt Text">
                            <!-- .img-push is used to add margin to elements next to floating images -->
                            <div class="img-push comment-container">
                                <span class="input-icon icon-right">
                                    <textarea rows="1" class="form-control" placeholder="Post a new message"></textarea>
                                </span>
                                <div class="padding-top-10 comment-upimg">
                                    <i class="fa fa-camera themeprimary"></i>
                                </div>
                                <div class="text-right comment-send">
                                    <a class="btn btn-sm btn-primary">Send</a>
                                </div>
                            </div>
                        </form>
                    </div>
                    <#assign annalid = comment.annalid>
                    <#if respondent.annalid??>
                        <#list respondent.annalid as comment>
                            <div class="card-comment">
                                <!-- User image -->
                                <img class="img-circle img-sm" src="/${base}${comment.user.headPortrait}" alt="User Image">

                                <div class="comment-text">

                            <span class="username">
                            ${comment.user.name}:
                                ${comment.remark}
                            </span><!-- /.username -->
                                    <span class="text-muted">
                                        <div class="comment-footer">
                                            ${comment.createtime?string('yyyy-MM-dd HH:mm:ss')}&nbsp;&nbsp;
                                            <a href="#"><i class="fa fa-thumbs-o-up"></i></a>&nbsp;&nbsp;
                                            <a href="#"><i class="fa fa-thumbs-o-down"></i></a>&nbsp;&nbsp;
                                            <a  onclick="replysShowOrHide($('.reply${comment_index}'))">Reply</a>
                                        </div>
                                    </span>
                                </div>
                                <!-- /.comment-text -->
                            </div>
                            <div class="card-footer reply${comment_index} hidden">
                                <form action="#" method="post">
                                    <img class="img-fluid img-circle img-sm" src="/${base}${publisher.headPortrait}" alt="Alt Text">
                                    <!-- .img-push is used to add margin to elements next to floating images -->
                                    <div class="img-push comment-container">
                                        <span class="input-icon icon-right">
                                            <textarea rows="1" class="form-control" placeholder="Post a new message"></textarea>
                                        </span>
                                        <div class="padding-top-10 comment-upimg">
                                            <i class="fa fa-camera themeprimary"></i>
                                        </div>
                                        <div class="text-right comment-send">
                                            <a class="btn btn-sm btn-primary">Send</a>
                                        </div>
                                    </div>
                                </form>
                            </div>
                                    <#assign annalid = comment.annalid>
                                    <#if respondent.annalid??>

                                    </#if>
                                </#list>
                    </#if>
                    </#list>
                    </#if>
                    <!-- /.card-comment -->
                    <div class="card-comment">
                        <!-- User image -->
                        <img class="img-circle img-sm" src="/${base}/AdminLTE3-2/dist/img/user4-128x128.jpg" alt="User Image">

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
                        <img class="img-fluid img-circle img-sm" src="/${base}${publisher.headPortrait}" alt="Alt Text">
                        <!-- .img-push is used to add margin to elements next to floating images -->
                        <div class="img-push comment-container">
                            <span class="input-icon icon-right">
                                <textarea rows="1" class="form-control" placeholder="Post a new message"></textarea>
                            </span>
                            <div class="padding-top-10 comment-upimg">
                                <i class="fa fa-camera themeprimary"></i>
                            </div>
                            <div class="text-right comment-send">
                                <a class="btn btn-sm btn-primary">Send</a>
                            </div>
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
        $('.hidden').hide();
      console.log('{RequestParameters[\'annalid\']}='+${RequestParameters['annalid']});
    };

    //回复框的显示与隐藏
    function replysShowOrHide(reply) {
        if(reply.hasClass('hidden')){
            reply.show();
            reply.removeClass('hidden');
        } else {
            reply.hide();
            reply.addClass('hidden');
        }
    }
</script>
</body>
</html>
