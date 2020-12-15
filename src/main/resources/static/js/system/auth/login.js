/* 로그인 */
function login() {
    var data = {
        username: $("#username").val(),
        password: $("#password").val()
    }

    var url= "/logined";
    ajax(url, data, function(data) {
        if(data == true) {
            var result = confirm("로그인 된 사용자 입니다. 로그아웃 하시겠습니까?");

            if(result) {
                $("#form").submit();
            }
        } else {
            $("#form").submit();
        }
    })
}