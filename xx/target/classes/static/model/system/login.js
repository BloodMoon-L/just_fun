layui.use(['jquery','layer','form'],function () {
    var $=layui.jquery;
    var layer =layui.layer;
    var form = layui.form;

    // 登录过期的时候，跳出ifram框架
    if (top.location != self.location) top.location = self.location;

    // 粒子线条背景
    $(document).ready(function(){
        $('.layui-container').particleground({
            dotColor:'#5cbdaa',
            lineColor:'#5cbdaa'
        });
    });

    // 进行登录操作
    form.on('submit(login)', function (data) {
        data = data.field;
        if (data.username == '') {
            layer.msg('用户名不能为空');
            return false;
        }
        if (data.password == '') {
            layer.msg('密码不能为空');
            return false;
        }
        if (data.captcha == '') {
            layer.msg('验证码不能为空');
            return false;
        }
        var user = JSON.stringify(data);
        $.ajax({
            type: "POST",
            url: "/yanZheng",
            data: data,
            dataType: "json",
            success: function(data){
                layer.alert("登陆成功！");
            }
        });
        return false;
    });
});