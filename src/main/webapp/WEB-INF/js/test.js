$(document).ready(function () {
    var arr = [1, 2, 3, 4, 5];
    var result = [];

    function getSums(arr) {
        arr.reduce(function (total, current) {
            result.push(total + current);
            return total + current;
        }, 0)
    }

    getSums(arr);
    console.log(result);
    registerHandlers();
});

function registerHandlers() {
    $('#dishes').click(loadAllDishes);
}

function loadAllDishes() {
    $.ajax({
        type: "POST",
        url: "/dishes/loadAll",
        success: function (resp) {
            alert(resp);

            parseDishes(resp);
        },
        error: function () {
            alert("server error")
        }
    })
}

function parseDishes(resp) {
    var arrayDishes = $.parseJSON(resp);
    for (var i = 0; i < arrayDishes.length; i++) {
        constructHTML(arrayDishes[i]);
    }
}

function constructHTML(obj) {
    var $dishesContainer = $("#dishesContainer");
    $dishesContainer.append("<div>" + obj.name + "</div>");
    $dishesContainer.append("<div>" + obj.price + "</div>");
    $dishesContainer.append("<div>" + obj.weight + "</div>");
}