package myfirstgrailsapp

class HomeController {

    //if directed here without an action specified, then by default it looks for an index action.
    //override default action with i.e., static defaultAction = "homePage" .... def homePage() { }, and this would
    //return a view under home/homePage.gsp

    def index() {
        //nothing specified, defaults to home/index.gsp
        respond([name: session.name ?: 'User', vehicleTotal: Vehicle.count()])
    }

    def updateName(String name) {
        session.name = name

        flash.message = "Name has been updated"

        redirect action: 'index'
    }

    def about(){ /* nothing specified, defaults to home/about.gsp */ }
}
