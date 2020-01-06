
function ajax_function(url,data,success_function,method,fail_function) {
    $.ajax({
        type: method,
        url: url,
        data: data,
        dataType: "jsonp",
        complete:function (data) {
            if (data.status === 200){
                success_function(data.responseText);
            }else {
                if (fail_function !== undefined){
                    fail_function(data.responseText);
                }}
        }
    });
}

function ajax_get(url,data,success,fail) {
    ajax_function(url,data,success,"GET",fail);
}
function ajax_post(url,data,success,fail) {
    ajax_function(url,data,success,"POST",fail);
}