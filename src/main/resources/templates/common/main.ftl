<!DOCTYPE html>
<html>

	<head>
		[#include "/include/head.htm"]
		<link rel="stylesheet" href="${base}/css/nav.css" />
		<script type="text/javascript" src="${base}/js/nav.js"></script>
	</head>

	<body>
		<nav>
			<h1>
			<article>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;你好!&nbsp;&nbsp;${admin.realName}<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎使用决策支持系统
			</article>
			</h1>
			<dl>
				<dt class="on">
							<source></source>
							${i.name}
						</dt>
				<dd class="icon-caret-right">
					<a href="" target="content">${ii.name}</a>
				</dd>
				<dt>
				<source></source>
							${i.name}
						</dt>
				<dd class="icon-caret-right">
					<a href="" target="content">${ii.name}</a>
				</dd>
			</dl>
		</nav>
			<iframe style="width:calc(100% - 250px); height:100%"  frameborder="0" scrolling="auto" src="${base}/content"></iframe>
	</body>

</html>