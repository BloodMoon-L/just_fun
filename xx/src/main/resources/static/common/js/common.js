//获取路径
var pathName=top.document.location.pathname;
//截取，得到项目名称
var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);