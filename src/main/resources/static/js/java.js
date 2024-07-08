$(document).ready(function(){
    $(".heart-icon").click(function(){
        $(this).toggleClass("clicked");
    });
});

$(document).ready(function(){
    $(".accessory-heart-icon").click(function(){
        $(this).toggleClass("clicked");
    });
});

document.addEventListener('DOMContentLoaded', function() {
    const flagButton = document.getElementById('flag-button');
    const popup = document.getElementById('popup');
    const closeButton = document.getElementById('close-button');

    flagButton.addEventListener('click', function() {
        popup.classList.add('active');
    });

    closeButton.addEventListener('click', function() {
        popup.classList.remove('active');
    });
});