<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav id="sidebar">
    <!-- Sidebar Header-->
    <div class="sidebar-header d-flex align-items-center">
        <div id="avatar" class="avatar"><img src="../img/avatar-6.jpg" alt="..." class="img-fluid rounded-circle"></div>
        <div class="title">
            <h1 class="h5">小标</h1>
            <p>研发部</p>
        </div>
    </div>
    <!-- Sidebar Navidation Menus--><span class="heading">Main</span>
    <ul class="list-unstyled">
        <li><a href="/html/home.jsp"> <i class="icon-home"></i>主页 </a></li>
        <li><a href="#userDropdown"  data-toggle="collapse" aria-expanded="true"> <i class="icon-windows"></i>用户列表</a>
            <ul id="userDropdown" class="collapse show">
                <li><a href="/html/user.jsp">查看用户</a></li>
                <li><a href="/html/my_user.jsp">我关注的用户</a></li>
                <li><a href="/html/article.jsp">发布文章</a></li>
                <li><a href="/html/article_collect.jsp">我的收藏</a></li>
            </ul>
        </li>
        <!--<li><a href="login.jsp"> <i class="icon-logout"></i>Login page </a></li>-->

        <li><a href="#depDropdown"  data-toggle="collapse"> <i class="icon-windows2"></i>部门列表</a>
            <ul id="depDropdown" class="collapse show ">
                <li><a href="/html/department.jsp">全部部门</a></li>
                <li><a href="/html/meeting.jsp">会议系统</a></li>
            </ul>
        </li>

    </ul>

</nav>
