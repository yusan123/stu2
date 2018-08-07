<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <script src="/bootstrap/js/jquery-1.11.3.min.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">
    <table class="table table-bordered table-hover">
        <thead>
            <tr>
                <th>编号</th>
                <th>学号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>年龄</th>
                <th>学院</th>
                <th>专业</th>
                <th>状态</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>
            <#list res as s>
                <tr>
                    <td>${s.studentId}</td>
                    <td>${s.studentNo}</td>
                    <td>${s.studentName}</td>
                    <#if s.studentSex==0>
                        <td>男</td>
                    </#if>
                    <#if s.studentSex==1>
                        <td>女</td>
                    </#if>
                    <td>${s.studentAge}</td>
                    <td>${s.department.deptName}</td>
                    <td>${s.subject.subName}</td>
                    <td>${s.studentStatus}</td>
                    <td><a href="#">修改</a></td>
                </tr>
            </#list>
        </tbody>
    </table>
</div>
</body>
</html>