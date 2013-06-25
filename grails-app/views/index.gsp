<!doctype html>
<html>
	<head>
		<meta name="layout" content="main"/>
		
	</head>
	<body>
		<h1>JPAX Test Comparison Page</h1>
		<h2>I'm a non ajax link</h2>
			<p><g:link controller="demo" action="regularLink">Normal Link</g:link></p> <br/>
			
		<h2>I'm an ajax remote link</h2>
			<p><g:remoteLink controller="demo" action="ajaxLink" update="main">Ajax Link</g:remoteLink></p> <br/>
			
		<h2>I'm a pjax remote link</h2>
			<p><g:link controller="demo" action="ajaxLink" data-pjax='#main'>Pjax Link</g:link></p><br />
		
		
	</body>
</html>
