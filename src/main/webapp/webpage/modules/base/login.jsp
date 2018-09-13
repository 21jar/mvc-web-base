<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/webpage/include/taglib.jsp" %>
<!DOCTYPE html>
<html>

<body class="login-layout light-login">
<div class="main-container">
    <div class="main-content">
        <div class="row">
            <div class="col-sm-10 col-sm-offset-1">
                <div class="login-container">
                    <div class="space-6"></div>
                    <div class="position-relative">
                        <div id="login-box" class="login-box visible widget-box no-border bound">
                            <div class="widget-body bound">
                                <div class="widget-main bound">
                                    <h4 class="header blue lighter bigger">
                                        <i class="ace-icon fa fa-coffee green"></i>
                                        用户登录
                                    </h4>

                                    <div class="space-6"></div>

                                    <form id="loginForm" class="form-signin" action="${ctx}/login" method="post">
                                        <fieldset>
                                            <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" id="username" name="username"
                                                                   class="form-control required" value="${username}"
                                                                   placeholder="用户名"/>
															<i class="ace-icon fa fa-user"></i>
														</span>
                                            </label>

                                            <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" id="password" name="password"
                                                                   class="form-control required" placeholder="密码"/>
															<i class="ace-icon fa fa-lock"></i>
														</span>
                                            </label>
                                            <c:if test="${isValidateCodeLogin}">
                                                <div class="input-group m-b text-muted validateCode">
                                                    <label class="input-label mid" for="validateCode">验证码:</label>
                                                    <sys:validateCode name="validateCode"
                                                                      inputCssStyle="margin-bottom:5px;"/>
                                                </div>
                                            </c:if>
                                            <div class="space"></div>

                                            <div class="clearfix">
                                                <button type="submit"
                                                        class="width-35 pull-right btn btn-sm btn-primary">
                                                    <i class="ace-icon fa fa-key"></i>
                                                    <span class="bigger-110">登录</span>
                                                </button>
                                            </div>
                                        </fieldset>
                                    </form>
                                    <br/>
                                    <br/>
                                </div><!-- /.widget-main -->
                            </div><!-- /.widget-body -->
                        </div><!-- /.login-box -->
                    </div><!-- /.position-relative -->
                </div>
            </div><!-- /.col -->
        </div><!-- /.row -->
    </div><!-- /.main-content -->
</div><!-- /.main-container -->
</body>
</html>
