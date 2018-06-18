$(".ba").click(function () {
    if ($(".ba").is(":checked")) {
        $(".tex")
            .removeAttr("disabled")
            .css("background-color", "white");
    }
    else {
        $(".tex")
            .attr("disabled", "disabled")
            .css("background-color", "red");
    }
});