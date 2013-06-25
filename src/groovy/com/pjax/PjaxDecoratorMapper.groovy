package com.pjax

import javax.servlet.http.HttpServletRequest
import org.codehaus.groovy.grails.web.sitemesh.GrailsLayoutDecoratorMapper
import com.opensymphony.module.sitemesh.Decorator
import com.opensymphony.module.sitemesh.Page
import org.apache.commons.lang.StringUtils

class PjaxDecoratorMapper extends GrailsLayoutDecoratorMapper {

 public Decorator getDecorator(HttpServletRequest request, Page page) {
        Decorator decorator = super.getDecorator(request, page)
        if (request.getHeader("X-Pjax")) {
            println "PJAX enabled"
            decorator = getNamedDecorator(request, "pjax")
        }
 
        return decorator
    }
}
