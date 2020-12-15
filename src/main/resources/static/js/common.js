// $(document).ready(function () {
//     loadHeaderMenu();
// });
//
// function loadHeaderMenu() {
//     ajax("/headerMenu", {},function (headerMenu) {
//         $("#header").replaceWith(headerMenu);
//         loadLeftMenu();
//     })
// }
//
// function loadLeftMenu() {
//     ajax("/leftMenu", {parentId: $("#headerId").val()}, function (leftMenu) {
//         $("#left").replaceWith(leftMenu);
//     });
// }

function ajax(url, data, success) {
    $.ajax({
        url: url,
        type: "POST",
        data: data,
        success: success,
        error: function(){
            alert("다시 시도해 주세요.");
        }
    });
}