$(function(){
	//nav load script
	$('nav dl dt').each(function(){
		if($(this).attr('class')=='on'){
			$('nav dl dt source').addClass('icon-angle-right');
			$(this).find('source').addClass('icon-angle-down');
			$(this).parent().find('dd').show();
		}
	});
	//nav click script
	$('nav dl dt').click(function(){
		$('nav dl dt').removeClass();
		$('nav dl dd').slideUp();
		$(this).addClass('on');
		$('nav dl dt source').removeClass().addClass('icon-angle-right');
		$(this).find('source').addClass('icon-angle-down');
		$(this).parent().find('dd').slideDown();
	});
	
});