$(function() {
	console.log("pooja");
    var box = $('#loadDiv');
    $(document).on('click', 'a[data-ajax]', function(e) {
        e.preventDefault();
        $.ajax({
            type: 'post',
            url: $(this).attr('href'),
            success: function(data) {
                box.html(data);
            }
        });
    });
});