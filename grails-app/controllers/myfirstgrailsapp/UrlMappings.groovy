package myfirstgrailsapp

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "home") //if user visits root, then direct to the home controller
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
