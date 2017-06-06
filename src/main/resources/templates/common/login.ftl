<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="${base}/css/login.css" />
		<script type="text/javascript" src="${base}/js/jquery-1.8.3.js"></script>
		<script type="text/javascript" src="${base}/js/login.js"></script>
		<title>云图数字图书馆</title>
		<script type="text/javascript">
			$(function() {
				//根据ip的失败次数判断是否要显示验证码
				var ipFailCount = ${ipFailCount};
				if(ipFailCount >= 2){
					showCaptcha();
				}else{
					hideCaptcha();
				}
				
				$('center').css({
					"margin-top" : ($('html').height() - 558) * 0.5 + "px"
				});
				refreshCaptchaImage();
			});
			/*******************************************************************************
			 * 刷新验证码
			 ******************************************************************************/
			function refreshCaptchaImage() {
				var $captchaImage = $("#captchaImage");
				$captchaImage.click(function() {// 刷新验证码
					$captchaImage.attr("src",
							"${base}/admin/common/captcha.do?captchaId=${captchaId}timestamp="+ (new Date()).valueOf());
				});
			};
		
		</script>
		<style type="text/css">
			.j_captcha {
				width: 100px;
			}
		</style>
	</head>

	<body>
		<center>
			<form action="${base}/login" method="POST">
				<input type="hidden" name="captchaId" value="${captchaId}">
				<ul>
					<li><span>用户名:</span><input name="userName" type="text" placeholder="请输入用户名" value="${message_prompt.type }" required="required" /></li>
					<li><span>密&nbsp;&nbsp;码:</span><input name="password" required="required" type="password" placeholder="请输入密码" /></li>
					<li id="j_captcha_li"><span>验证码:</span><input name="j_captcha" class="j_captcha" placeholder="请输入验证码" /><img id="captchaImage" src="" alt="换一张" /></li>
					<li><span></span>
						<button type="submit">登 录</button></li>
					<li style="padding-top: 20px;">
						<span></span><span style="color: red;width:190px">${error}</span>
					</li>
					<li style="padding-top: 20px;">
						<span></span><span style="color: red;width:190px">推荐使用火狐浏览器</span>
					</li>
				</ul>
			</form>
		</center>
	</body>

</html>