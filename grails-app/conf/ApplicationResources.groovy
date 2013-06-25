modules = {
    application {
    	dependsOn 'jquery', 'pjax'
        resource url:'js/application.js'
    }

    pjax {
		resource url:'js/jquery.pjax.js', disposition:'head'
    }
}