$(document).ready(function(){
    //btn_reset 을 클릭했을때의 함수
    $( "#btn_reset").click(function () {
        $( "#reset_form" ).each( function () {
            this.reset();
        });
        $(".searchBtn").find('button').removeClass('btn-primary').addClass('btn-light');
    });
    
    $(document).on('click','button[name="filterDate"]', function(){
    	if($(this).hasClass('btn-light') == true){
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
    
    $.datepicker.setDefaults({
        dateFormat: 'yy-mm-dd',
        prevText: '이전 달',
        nextText: '다음 달',
        monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
        monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
        dayNames: ['일', '월', '화', '수', '목', '금', '토'],
        dayNamesShort: ['일', '월', '화', '수', '목', '금', '토'],
        dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],
        showMonthAfterYear: true,
        yearSuffix: '년'
    });
    
    $(function() {
        $( ".datepicker" ).datepicker();
      });

    
});