<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ include file="/WEB-INF/include/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="/WEB-INF/include/head.inc" %>
</head>
<body>
<div class="container" style="position: relative;">
    <!-- right -->
    <div class="col-sm-12">
        <div id="listDiv" class="panel panel-default" style="margin-bottom:5px;">
            <div class="panel-heading" style="height: 50px;">
                <h4 style="float:left">请求测试</h4>
            </div>
            <div style="width:100%;overflow-x:scroll;">
                <div class="panel-heading search-content" id="panel-heading" style="height: 50px;">
                    <span class="my-label">span：</span>
                    <input type="text" id="idNo" class="form-control"
                           style="width: 100px;float: left;margin-left: 5px;" placeholder="input">
                    <button type="button" class="btn btn-success" style="float: left;margin-left: 5px" id="_export">button
                    </button>
                </div>
                <table class="table table-striped" style="width: 1700px;font-size: 13px;" id="table">

                </table>
            </div>
        </div>
    </div>
</div>

<script type="text/template" id="table-template">
    <tr>
        <th>序号</th>
        <th>姓名</th>
    </tr>
    <tr class="normal-tr">
        <td class="seq">{{i+1}}</td>
        <td class="name">{{data.name}}</td>
    </tr>
</script>

<script>
    $(function () {
        initPage();
        alert("init");
    })
    function initPage() {

        $.ajax({
            url: "${ctx}/health/data.jhtml",
            type: "post",
            dataType: "json",
            success: function (data) {
                showData(data);
                alert("ajax");
            }
        });
    }
    function showData(data) {
        $("#table").html(template("table-template", {data}));
    }
</script>
</body>
</html>