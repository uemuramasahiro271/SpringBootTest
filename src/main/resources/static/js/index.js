function test1() {
    window.location.href = "/test";
}

function test2() {
    // window.open( ①URL, ②ウィンドウ名, ③オプション );
    window.open("/test", "新規オープン");
}

function test3() {
    $("div").test();
}

function back() {
    window.location.href = "/back";
}

$.fn.test = function() {
    console.log($(this).text());
}