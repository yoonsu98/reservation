$(document).ready(function () {
    fnGetCode();
});

function fnGetCode() {
    const searchParam = new URLSearchParams(location.search);
    const code = searchParam.get('code');

    if (code != null) {
        $("#code").val(code);
        fnGetTokenInfo(code);
    }
};

function fnGetTokenInfo(code) {
    $.ajax({
        type: "post",
        url: "http://localhost:8082/user/token-info",
        contentType: "application/json",
        data: JSON.stringify({code}),
        success: function (response) {
            const {accessToken, refreshToken, kakaoId} = response.data;
            if (accessToken != null) {
                access_cookie = `access_token=${accessToken};`;
                refresh_cookie = `refresh_token=${refreshToken};`;
                document.cookie = access_cookie;
                document.cookie = refresh_cookie;
                location.href = "http://localhost:8082/main";
            }
            $("#kakaoId").val(kakaoId);
        },
        error: function (error) {

        }
    });
}