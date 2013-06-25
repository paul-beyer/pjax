package com.pjax

class DemoController {

    def index() { }
	
	def regularLink() { 
		println 'Entering DemoController.regularLink'
	}
	
	def ajaxLink() {
		println 'Entering DemoController.ajaxLink'
	}
}
