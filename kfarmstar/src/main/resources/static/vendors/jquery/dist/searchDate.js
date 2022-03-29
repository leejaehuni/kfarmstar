$(document).ready(function(){
    //btn_reset 을 클릭했을때의 함수
    $( "#btn_reset").click(function () {
        $( "#reset_form" ).each( function () {
            this.reset();
        });
        $(".searchBtn").find('button').removeClass('btn-primary').addClass('btn-light');
    });
    
    $(document).on('click','button[name="filterDate"]', function(){
    	if($(this).hasClass('btn-light')){
			$('.searchBtn').find('button').removeClass('btn-primary');
			$(this).removeClass('btn-light').addClass('btn-primary');
    	}else{
    		$('.searchBtn').find('button').removeClass('btn-light');
			$(this).removeClass('btn-primary').addClass('btn-light');
    	}
	});
    
    function timeFunctionLong(input) {
		setTimeout(function() {
			input.type = 'text';
		}, 60000);
	}
});